package activity.drawer.navigation.com.kitabsawtitest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import activity.drawer.navigation.com.kitabsawtitest.Pojo.Contact;
import activity.drawer.navigation.com.kitabsawtitest.Pojo.KitabSawti;
import activity.drawer.navigation.com.kitabsawtitest.internet.ApiClient;
import activity.drawer.navigation.com.kitabsawtitest.internet.KitabInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ContactItem extends AppCompatActivity {


    public List<Contact> contactList;
    public ContactAdapter contactAdapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);
        KitabInterface kitabInterface = ApiClient.getApiService();
        Call<KitabSawti> call = kitabInterface.getContact();

        call.enqueue(new Callback<KitabSawti>() {
            @Override
            public void onResponse(Call<KitabSawti> call, Response<KitabSawti> response) {
                contactList = response.body().getContact();
                RecyclerView recyclerView = findViewById(R.id.recyclerView);
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                contactAdapter = new ContactAdapter(contactList, ContactItem.this); // changes
                recyclerView.setAdapter(contactAdapter);
            }

            @Override
            public void onFailure(Call<KitabSawti> call, Throwable t) {

            }
        });
    }
}



