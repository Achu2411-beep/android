package com.example.optionmenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.menu_home) {
            Intent intent = new Intent(MainActivity.this, Homeactivity.class);
            startActivity(intent);
            return true;
        }

        if (item.getItemId() == R.id.menu_about) {
            Intent intent = new Intent(MainActivity.this, Aboutactivity.class);
            startActivity(intent);
            return true;
        }

        if (item.getItemId() == R.id.menu_vijay) {
            Intent intent = new Intent(MainActivity.this, VijayActivity.class);
            startActivity(intent);
            return true;
        }

        if (item.getItemId() == R.id.menu_karthi) {
            Intent intent = new Intent(MainActivity.this, Karthi.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
