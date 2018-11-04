package activity.drawer.navigation.com.kitabsawtitest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import activity.drawer.navigation.com.kitabsawtitest.Pojo.KitabSawti;
import activity.drawer.navigation.com.kitabsawtitest.Pojo.Skill;
import activity.drawer.navigation.com.kitabsawtitest.internet.ApiClient;
import activity.drawer.navigation.com.kitabsawtitest.internet.KitabInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SkillItem extends AppCompatActivity {

    public List<Skill> skillList;
    private SkillsAdapter skillsAdapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.skills);

        KitabInterface kitabInterface = ApiClient.getApiService();
        Call<KitabSawti> call = kitabInterface.getSkills();

        call.enqueue(new Callback<KitabSawti>() {
            @Override
            public void onResponse(Call<KitabSawti> call, Response<KitabSawti> response) {
                skillList = response.body().getSkills();
                RecyclerView recyclerView = findViewById(R.id.recyclerView);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
                recyclerView.setLayoutManager(linearLayoutManager);
                skillsAdapter = new SkillsAdapter(skillList, SkillItem.this); // changes
                recyclerView.setAdapter(skillsAdapter);
            }

            @Override
            public void onFailure(Call<KitabSawti> call, Throwable t) {

            }
        });
    }
}





