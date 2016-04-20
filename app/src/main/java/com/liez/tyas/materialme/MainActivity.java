package com.liez.tyas.materialme;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.liez.tyas.materialme.adapter.RecyclerImageAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, NavigationView.OnNavigationItemSelectedListener {

    @Bind(R.id.drawer_layout_main)
    DrawerLayout drawerLayout;
    @Bind(R.id.toolbar_main)
    Toolbar toolbar;
    @Bind(R.id.navigation_view_main)
    NavigationView navigationView;
    @Bind(R.id.recycler_main)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_dehaze_white_24dp);
        setTitle("Home");
        toolbar.setTitleTextColor(getResources().getColor(android.R.color.white));
        toolbar.setNavigationOnClickListener(this);
        navigationView.inflateHeaderView(R.layout.navigation_head);
        navigationView.setNavigationItemSelectedListener(this);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        List<Integer> imageIntegers = new ArrayList<>();
        imageIntegers.add(R.drawable.image_car_1);
        imageIntegers.add(R.drawable.image_car_2);
        imageIntegers.add(R.drawable.image_car_3);
        imageIntegers.add(R.drawable.image_car_4);
        imageIntegers.add(R.drawable.image_car_5);
        imageIntegers.add(R.drawable.image_car_6);
        imageIntegers.add(R.drawable.image_car_7);
        recyclerView.setAdapter(new RecyclerImageAdapter(imageIntegers));
    }

    @Override
    public void onClick(View view) {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawers();
        } else {
            drawerLayout.openDrawer(GravityCompat.START);
        }
    }


    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu_item_1) {
            startActivity(new Intent(this, SupportDesignActivity.class));
        }

        return false;
    }
}
