package dexterdatul.com.navigationdrawer;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drawer);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigation_view);

        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_drawer, R.string.close_drawer);

        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();

    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        switch (id) {
            case R.id.inbox:
                Toast.makeText(getApplicationContext(), "inbox", Toast.LENGTH_SHORT).show();
                break;

            case R.id.starred:
                Toast.makeText(getApplicationContext(), "starred", Toast.LENGTH_SHORT).show();
                break;

            case R.id.send_email:
                Toast.makeText(getApplicationContext(), "send email", Toast.LENGTH_SHORT).show();
                break;

            case R.id.draft:
                Toast.makeText(getApplicationContext(), "draft", Toast.LENGTH_SHORT).show();
                break;

            case R.id.all_mail:
                Toast.makeText(getApplicationContext(), "all mail", Toast.LENGTH_SHORT).show();
                break;

            case R.id.trash:
                Toast.makeText(getApplicationContext(), "trash", Toast.LENGTH_SHORT).show();
                break;

            case R.id.spam:
                Toast.makeText(getApplicationContext(), "spam", Toast.LENGTH_SHORT).show();
                break;

        }

        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}
