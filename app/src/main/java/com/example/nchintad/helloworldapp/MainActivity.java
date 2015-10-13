package com.example.nchintad.helloworldapp;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int tv1count;
    int tv2count;
    int tv3count;
    int tv4count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final MyTextView textView1 = (MyTextView) findViewById(R.id.textView1);
        textView1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                SharedPreferences mSettings = MainActivity.this.getSharedPreferences("Settings", 0);
                SharedPreferences.Editor editor = mSettings.edit();
                textView1.incrementAndUpdate();
            }
        });
        final MyTextView textView2 = (MyTextView) findViewById(R.id.textView2);
        textView2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                SharedPreferences mSettings = MainActivity.this.getSharedPreferences("Settings", 0);
                SharedPreferences.Editor editor = mSettings.edit();
                textView2.incrementAndUpdate();
            }
        });
        final MyTextView textView3 = (MyTextView) findViewById(R.id.textView3);
        textView3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                SharedPreferences mSettings = MainActivity.this.getSharedPreferences("Settings", 0);
                SharedPreferences.Editor editor = mSettings.edit();
                textView3.incrementAndUpdate();
            }
        });
        final MyTextView textView4 = (MyTextView) findViewById(R.id.textView4);
        textView4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                SharedPreferences mSettings = MainActivity.this.getSharedPreferences("Settings", 0);
                SharedPreferences.Editor editor = mSettings.edit();
                textView4.incrementAndUpdate();
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
