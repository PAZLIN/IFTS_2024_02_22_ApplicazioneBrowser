package com.example.ifts_2024_02_22_applicazionebrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] colonne = new String[]{"www.fluffyunicorns.com", "www.paperairplaneinstructions.com",
                "www.penguin-dance.com", "www.sparklingwaterfall.com", "www.google.it"};
        ListView listview1 = (ListView) this.findViewById(R.id.listview1);
        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, colonne);
        listview1.setAdapter(adapter);

        listview1.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selected = (String) parent.getItemAtPosition(position);
                Intent activity2 = new Intent(MainActivity.this, Activity2.class);
                activity2.putExtra("Sito", selected);
                startActivity(activity2);
                Toast.makeText(MainActivity.this, "Hai cliccato su " + selected, Toast.LENGTH_LONG).show();


            }
        });



    }
}