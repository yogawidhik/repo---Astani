package com.sans.astani;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity

        implements NavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList <GambarSlide> gambarSlides = new ArrayList<>();
        gambarSlides.add(new GambarSlide(R.drawable.sample_0,"Diffo Elza Pratama"));
        gambarSlides.add(new GambarSlide(R.drawable.sample_1,"Ridlo Yanuar"));
        gambarSlides.add(new GambarSlide(R.drawable.sample_2,"Wisnu Sabani"));
        gambarSlides.add(new GambarSlide(R.drawable.sample_3,"Yoga Widhia Kurnia"));
        gambarSlides.add(new GambarSlide(R.drawable.sample_4,"Dwiki Lazzaro"));


        RecyclerView recyclerView1 = findViewById(R.id.daftar_list1);
        LinearLayoutManager n = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView1.setLayoutManager(n);
        GambarSliderAdapter adapater = new GambarSliderAdapter(this,gambarSlides);
        recyclerView1.setAdapter(adapater);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
            this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        ArrayList <Artikel> datalist = new ArrayList<>();
        datalist.add(new Artikel(R.drawable.sample_0,"Diffo Elza Pratama"));
        datalist.add(new Artikel(R.drawable.sample_1,"Ridlo Yanuar"));
        datalist.add(new Artikel(R.drawable.sample_2,"Wisnu Sabani"));
        datalist.add(new Artikel(R.drawable.sample_3,"Yoga Widhia Kurnia"));
        datalist.add(new Artikel(R.drawable.sample_4,"Dwiki Lazzaro"));


        RecyclerView recyclerView = findViewById(R.id.daftar_list);
        LinearLayoutManager m = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(m);
        ArtikelAdapter adapter = new ArtikelAdapter(this,datalist);
        recyclerView.setAdapter(adapter);

        ArrayList <Toko> gambarSlides1 = new ArrayList<>();
        gambarSlides1.add(new Toko(R.drawable.toko_0,"Beras Organik\nRp 22.500/Kg"));
        gambarSlides1.add(new Toko(R.drawable.toko_1,"Jagung\nRp 4.000/kg"));
        gambarSlides1.add(new Toko(R.drawable.toko_2,"Kentang Industri\nRp 15.000/kg"));
        gambarSlides1.add(new Toko(R.drawable.toko_3,"Jagung Kuning\nRp 4.000/kg"));
        gambarSlides1.add(new Toko(R.drawable.toko_4,"Cabai\nRp 12.000/kg"));


        RecyclerView recyclerView2 = findViewById(R.id.daftar_list2);
        LinearLayoutManager o = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView2.setLayoutManager(o);
        TokoAdapter adapter1 = new TokoAdapter(this,gambarSlides1);
        recyclerView2.setAdapter(adapter1);


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_beranda) {
            // Handle the camera action
        } else if (id == R.id.nav_profil) {

        } else if (id == R.id.nav_forum) {

        } else if (id == R.id.nav_artikel) {

        } else if (id == R.id.nav_toko) {

        }else if (id == R.id.nav_informasi) {

        }else if (id == R.id.nav_setelan) {

        }else if (id == R.id.nav_help) {

        }else if (id == R.id.nav_exit) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
