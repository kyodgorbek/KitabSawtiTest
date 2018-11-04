package activity.drawer.navigation.com.kitabsawtitest;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationAdapter;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;


public class MainActivity extends AppCompatActivity {
    private AHBottomNavigationAdapter navigationAdapter;
    private AHBottomNavigation bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigation = findViewById(R.id.bottom_navigation);

// Create items
        AHBottomNavigationItem item1 = new AHBottomNavigationItem(R.string.text_introduction, R.drawable.ic_introduction, R.color.color_tab_1);
        AHBottomNavigationItem item2 = new AHBottomNavigationItem(R.string.text_education, R.drawable.ic_education, R.color.color_tab_2);
        final AHBottomNavigationItem item3 = new AHBottomNavigationItem(R.string.text_work, R.drawable.ic_work, R.color.color_tab_3);
        AHBottomNavigationItem item4 = new AHBottomNavigationItem(R.string.text_skills, R.drawable.ic_skills, R.color.color_tab_4);
        AHBottomNavigationItem item5 = new AHBottomNavigationItem(R.string.text_contact, R.drawable.ic_contact, R.color.color_tab_5);


        bottomNavigation.addItem(item1);
        bottomNavigation.addItem(item2);
        bottomNavigation.addItem(item3);
        bottomNavigation.addItem(item4);
        bottomNavigation.addItem(item5);
        int[] tabColors = getApplicationContext().getResources().getIntArray(R.array.tab_colors);
        AHBottomNavigationAdapter navigationAdapter = new AHBottomNavigationAdapter(MainActivity.this, R.menu.bottom_navigation_menu);
        navigationAdapter.setupWithBottomNavigation(bottomNavigation, tabColors);

        bottomNavigation.setOnTabSelectedListener(new AHBottomNavigation.OnTabSelectedListener() {
            @Override
            public boolean onTabSelected(int position, boolean wasSelected) {
                switch (position) {
                    case 0: {
                        // Start activity one
                        Intent intent = new Intent(MainActivity.this, IntroductionItem.class);
                        startActivity(intent);
                        break;
                    }
                    case 1: {
                        // Start activity two
                        Intent educationIntent = new Intent(MainActivity.this, EducationItem.class);
                        startActivity(educationIntent);
                        break;

                    }

                    case 2: {
                        // Start activity two
                        Intent workIntent = new Intent(MainActivity.this, WorkItem.class);
                        startActivity(workIntent);
                        break;

                    }

                    case 3: {
                        // Start activity two
                        Intent skillIntent = new Intent(MainActivity.this, SkillItem.class);
                        startActivity(skillIntent);
                        break;

                    }

                    case 4: {
                        // Start activity two
                        Intent contactIntent = new Intent(MainActivity.this, ContactItem.class);
                        startActivity(contactIntent);
                        break;

                    }
                }


                return wasSelected;
            }


        });
    }
}
