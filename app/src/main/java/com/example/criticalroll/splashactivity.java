package com.example.criticalroll;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class splashactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
         * CS315 NOTE:  This MIGHT crash on API levels lower than 25...
         * If you have issues at launch, use an emulator on API 25 or higher
         */

        // as soon as THIS Activity loads, we know the APP has loaded, so
        // call for our Main Activity (MovieListActivity, in this case) to load up
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
