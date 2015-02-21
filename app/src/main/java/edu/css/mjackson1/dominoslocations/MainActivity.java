package edu.css.mjackson1.dominoslocations;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class MainActivity extends ActionBarActivity {

    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,
                R.array.locations, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //int position = spinner.getSelectedItemPosition();
                Intent intent = null;
                switch (position) {
                    case 0:
                        intent = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("geo:46.7206161,-92.0952105"));
                        break;
                    case 1:
                        intent = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("geo:46.7380636,-92.1669176"));
                        break;
                    case 2:
                        intent = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("geo:46.8005941,-92.1257366"));
                        break;
                    case 3:
                        intent = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("geo:46.8324913,-92.2038733"));
                        break;
                    case 4:
                        intent = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("geo:46.8223492,-92.0743298"));
                        break;
                }
                if (intent !=null) {
                    startActivity(intent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }


    }
