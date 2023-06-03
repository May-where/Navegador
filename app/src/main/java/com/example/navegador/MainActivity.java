package com.example.navegador;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    
    DrawerLayout drawerlayout;
    MaterialToolbar materialtoolbar;
    FrameLayout framlayout;
    NavigationView navigationview;

    TextView textview;

    View navitga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        drawerlayout = findViewById(R.id.drawerlayout);
        materialtoolbar = findViewById(R.id.materialtoolbar);
        framlayout = findViewById(R.id.framlayout);
        navigationview = findViewById(R.id.navigationview);
        navitga =  navigationview.getHeaderView(0);
        textview = navitga.findViewById(R.id.textview);




        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(MainActivity.this,drawerlayout,materialtoolbar,R.string.close,R.string.open);


        
        drawerlayout.addDrawerListener(toggle);
        toggle.syncState();

        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));

        navigationview.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                

                if(item.getItemId()==R.id.Home){
                    textview.setText("Academia de danza DANILOVA");

                    Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                    drawerlayout.closeDrawer(GravityCompat.START);
                }
                else if (item.getItemId()==R.id.Location){
                    Toast.makeText(MainActivity.this, "Location", Toast.LENGTH_SHORT).show();
                    drawerlayout.closeDrawer(GravityCompat.START);
                }

                else if (item.getItemId()==R.id.phone){
                    Toast.makeText(MainActivity.this, "phone", Toast.LENGTH_SHORT).show();
                    drawerlayout.closeDrawer(GravityCompat.START);
                }
                else if (item.getItemId()==R.id.HipHop){
                    Toast.makeText(MainActivity.this, "HipHop", Toast.LENGTH_SHORT).show();
                    drawerlayout.closeDrawer(GravityCompat.START);
                }

                else if (item.getItemId()==R.id.Cumbia){
                    Toast.makeText(MainActivity.this, "Cumbia", Toast.LENGTH_SHORT).show();
                    drawerlayout.closeDrawer(GravityCompat.START);
                }
                return true;
            }
        });

    }

    private void Fragment (Fragment fragment){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.framlayout, fragment);
        ft.commit();

    }


}