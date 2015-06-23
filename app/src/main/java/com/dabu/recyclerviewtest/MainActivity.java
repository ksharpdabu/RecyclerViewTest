package com.dabu.recyclerviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<Person> persons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView)findViewById(R.id.rv);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        initializeData();

        mAdapter = new MyAdapter(persons);
        mRecyclerView.setAdapter(mAdapter);






    }


    public void initializeData(){
        persons = new ArrayList<>();
        persons.add(new Person("Emma Wilson", "23 years old",R.drawable.cloud));
        persons.add(new Person("Lavery Maiss", "25 years old",R.drawable.fuck));
        persons.add(new Person("Lillie Watts", "35 years old", R.drawable.hole));
        persons.add(new Person("Emma Wilson", "23 years old",R.drawable.cloud));
        persons.add(new Person("Lavery Maiss", "25 years old",R.drawable.fuck));
        persons.add(new Person("Lillie Watts", "35 years old", R.drawable.hole));
        persons.add(new Person("Emma Wilson", "23 years old",R.drawable.cloud));
        persons.add(new Person("Lavery Maiss", "25 years old",R.drawable.fuck));
        persons.add(new Person("Lillie Watts", "35 years old", R.drawable.hole));
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
        // as you specify cloud parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
