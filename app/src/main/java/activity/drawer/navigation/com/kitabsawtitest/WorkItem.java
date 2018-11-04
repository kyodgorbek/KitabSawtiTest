package activity.drawer.navigation.com.kitabsawtitest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import activity.drawer.navigation.com.kitabsawtitest.Pojo.KitabSawti;
import activity.drawer.navigation.com.kitabsawtitest.Pojo.Work;
import activity.drawer.navigation.com.kitabsawtitest.internet.ApiClient;
import activity.drawer.navigation.com.kitabsawtitest.internet.KitabInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WorkItem extends AppCompatActivity {


    public List<Work> workList;
    private WorkingAdapter workingAdapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.work);

        KitabInterface kitabInterface = ApiClient.getApiService();
        Call<KitabSawti> call = kitabInterface.getWork();

        call.enqueue(new Callback<KitabSawti>() {
            @Override
            public void onResponse(Call<KitabSawti> call, Response<KitabSawti> response) {
                workList = response.body().getWork();
                RecyclerView recyclerView = findViewById(R.id.recyclerView);
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                workingAdapter = new WorkingAdapter(workList, WorkItem.this); // changes
                recyclerView.setAdapter(workingAdapter);
            }

            @Override
            public void onFailure(Call<KitabSawti> call, Throwable t) {

            }
        });
    }
}


