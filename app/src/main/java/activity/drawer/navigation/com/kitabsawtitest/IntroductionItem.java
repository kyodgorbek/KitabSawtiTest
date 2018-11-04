package activity.drawer.navigation.com.kitabsawtitest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import activity.drawer.navigation.com.kitabsawtitest.Pojo.Introduction;
import activity.drawer.navigation.com.kitabsawtitest.Pojo.KitabSawti;
import activity.drawer.navigation.com.kitabsawtitest.internet.ApiClient;
import activity.drawer.navigation.com.kitabsawtitest.internet.KitabInterface;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmList;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class IntroductionItem extends AppCompatActivity {

    public RealmList<Introduction> introductionList;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.introduction);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        //TODO move this initialization to App extends Application

        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder().build();

        final Realm realm = Realm.getInstance(realmConfiguration);

        KitabInterface kitabInterface = ApiClient.getApiService();
        Call<KitabSawti> call = kitabInterface.getIntroduction();
        call.enqueue(new Callback<KitabSawti>() {
            @Override
            public void onResponse(Call<KitabSawti> call, Response<KitabSawti> response) {

                introductionList = response.body().getIntroduction();
                recyclerView.setAdapter(new IntroductionAdapter(IntroductionItem.this, introductionList));

                realm.beginTransaction();
                for (int i = 0; i < introductionList.size(); i++) {

                    Introduction introduction = realm.createObject(Introduction.class);
                    introduction.setImage(introductionList.get(i).getImage());
                    introduction.setIntroduction(introductionList.get(i).getIntroduction());

                }
                realm.commitTransaction();


            }

            @Override
            public void onFailure(Call<KitabSawti> call, Throwable t) {

                List<Introduction> list = realm.where(Introduction.class).findAll();
                if (list != null) {

                    recyclerView.setAdapter(new IntroductionAdapter(IntroductionItem.this, list));

                }

            }

        });


    }
}