package com.example.optionmenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

public class VijayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vijay);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.menu_home) {
            Intent intent = new Intent(VijayActivity.this, Homeactivity.class);
            startActivity(intent);
            return true;
        }

        if (item.getItemId() == R.id.menu_about) {
            Intent intent = new Intent(VijayActivity.this, Aboutactivity.class);
            startActivity(intent);
            return true;
        }

        if (item.getItemId() == R.id.menu_vijay) {
            Intent intent = new Intent(VijayActivity.this, VijayActivity.class);
            startActivity(intent);
            return true;
        }

        if (item.getItemId() == R.id.menu_karthi) {
            Intent intent = new Intent(VijayActivity.this, Karthi.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
