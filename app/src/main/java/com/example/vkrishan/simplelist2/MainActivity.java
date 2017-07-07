package com.example.vkrishan.simplelist2;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Data
        String[] values = new String[]{"Sunday" , "Monday" , "Tuesday", "Wednesday", "Thursday", "Friday" , "Saturday"};
        // ListView
        lv = (ListView) findViewById(R.id.listView);

        // Define ArrayAdapter now
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, values);
        lv.setAdapter(arrayAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                int itemPosition = position;
                String itemValue = (String) lv.getItemAtPosition(itemPosition);

                Toast.makeText(getApplicationContext(), itemPosition + " "+ itemValue, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
