package com.example.dlaminin3.androidversions;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    int[] images = {R.drawable.cupcake, R.drawable.dougnut, R.drawable.eclair, R.drawable.froyo, R.drawable.gingerbread, R.drawable.honeycomb, R.drawable.icecream, R.drawable.jellybeans, R.drawable.kitkat, R.drawable.lollipop, R.drawable.mashmallow, R.drawable.nougat, R.drawable.oreo1};

    String[] version = {"Android Cup cake", "Android Donut", "Android Eclair", "Android Froyo", "Android GingerBread", "Android Honeycomb", "Android ice cream ", "Android Jellybean", "Android Kitkat", "Android Lollipop", "Android Marshmallow", "Android nougat", "Android Oreo"};

    String[] versionNumber = {"1.5", "1.6", "2.0 2.1", "2.2","2.3", "3.0 3.1", "4.0", "4.1 4.2 4.3", "4.4", "5.0", "6.0", "7.0", "8.0"};

    ListView lView;

    ListAdapter lAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        lView = (ListView) findViewById(R.id.androidList);
        lAdapter = new ListAdapter(MainActivity.this, version, versionNumber, images);

        lView.setAdapter(lAdapter);

        lView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(MainActivity.this, version[i]+" "+versionNumber[i], Toast.LENGTH_SHORT).show();

            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
