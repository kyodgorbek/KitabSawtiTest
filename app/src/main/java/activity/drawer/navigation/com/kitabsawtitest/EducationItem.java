package activity.drawer.navigation.com.kitabsawtitest;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import activity.drawer.navigation.com.kitabsawtitest.Pojo.Education;
import activity.drawer.navigation.com.kitabsawtitest.Pojo.KitabSawti;
import activity.drawer.navigation.com.kitabsawtitest.internet.ApiClient;
import activity.drawer.navigation.com.kitabsawtitest.internet.KitabInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EducationItem extends AppCompatActivity {

    public List<Education> educationList = new ArrayList<>();
    public List<Subject> subject = new ArrayList<>();
    Context context;
    private EducationAdapter educationAdapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.education);


        KitabInterface kitabInterface = ApiClient.getApiService();
        Call<KitabSawti> call = kitabInterface.getEducation();

        call.enqueue(new Callback<KitabSawti>() {
            @Override
            public void onResponse(Call<KitabSawti> call, Response<KitabSawti> response) {

                educationList = response.body().getEducation();

                educationList.add(new Education("Computer Science", R.drawable.computer_science, Education.UNIVERSITY_TYPE));
                educationList.add(new Education("Data Structure", R.drawable.data_structure, Education.UNIVERSITY_TYPE));
                educationList.add(new Education("Computer Science", R.drawable.computer_science, Education.UNIVERSITY_TYPE));
                educationList.add(new Education("Mathematics", R.drawable.math_picture, Education.UNIVERSITY_TYPE));
                educationList.add(new Education("Physics", R.drawable.physics_image, Education.UNIVERSITY_TYPE));
                educationList.add(new Education("Chemistry", R.drawable.chemistry_picture, Education.UNIVERSITY_TYPE));

                RecyclerView recyclerView = findViewById(R.id.recyclerView);
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                educationAdapter = new EducationAdapter(educationList, EducationItem.this, context); // changes
                recyclerView.setAdapter(educationAdapter);
            }

            @Override
            public void onFailure(Call<KitabSawti> call, Throwable t) {

            }
        });
    }
}




