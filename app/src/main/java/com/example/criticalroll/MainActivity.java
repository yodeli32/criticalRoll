package com.example.criticalroll;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private Random rng = new Random();
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDice = findViewById(R.id.image_view_dice);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
    }

    private void stopPlaying() {
        if (mp != null) {
            mp.stop();
            mp.release();
            mp = null;
        }
    }

    private void rollDice() {
        int randomNumber = rng.nextInt(20) +1;
        TextView popup = (TextView)findViewById(R.id.d_one);

        switch (randomNumber) {
            case 1:
                imageViewDice.setImageResource(R.drawable.d1);

                popup.setText("Critical Miss!");
                popup.setVisibility(View.VISIBLE);

                stopPlaying();
                mp = MediaPlayer.create(this, R.raw.airhorn);
                mp.start();

                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.d2);
                popup.setVisibility(View.INVISIBLE);

                stopPlaying();
                mp = MediaPlayer.create(this, R.raw.dicesound);
                mp.start();

                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.d3);
                popup.setVisibility(View.INVISIBLE);

                stopPlaying();
                mp = MediaPlayer.create(this, R.raw.dicesound);
                mp.start();

                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.d4);
                popup.setVisibility(View.INVISIBLE);

                stopPlaying();
                mp = MediaPlayer.create(this, R.raw.dicesound);
                mp.start();

                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.d5);
                popup.setVisibility(View.INVISIBLE);

                stopPlaying();
                mp = MediaPlayer.create(this, R.raw.dicesound);
                mp.start();

                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.d6);
                popup.setVisibility(View.INVISIBLE);

                stopPlaying();
                mp = MediaPlayer.create(this, R.raw.dicesound);
                mp.start();

                break;
            case 7:
                imageViewDice.setImageResource(R.drawable.d7);
                popup.setVisibility(View.INVISIBLE);

                stopPlaying();
                mp = MediaPlayer.create(this, R.raw.dicesound);
                mp.start();

                break;
            case 8:
                imageViewDice.setImageResource(R.drawable.d8);
                popup.setVisibility(View.INVISIBLE);

                stopPlaying();
                mp = MediaPlayer.create(this, R.raw.dicesound);
                mp.start();

                break;
            case 9:
                imageViewDice.setImageResource(R.drawable.d9);
                popup.setVisibility(View.INVISIBLE);

                stopPlaying();
                mp = MediaPlayer.create(this, R.raw.dicesound);
                mp.start();

                break;
            case 10:
                imageViewDice.setImageResource(R.drawable.d10);
                popup.setVisibility(View.INVISIBLE);

                stopPlaying();
                mp = MediaPlayer.create(this, R.raw.dicesound);
                mp.start();

                break;
            case 11:
                imageViewDice.setImageResource(R.drawable.d11);
                popup.setVisibility(View.INVISIBLE);

                stopPlaying();
                mp = MediaPlayer.create(this, R.raw.dicesound);
                mp.start();

                break;
            case 12:
                imageViewDice.setImageResource(R.drawable.d12);
                popup.setVisibility(View.INVISIBLE);

                stopPlaying();
                mp = MediaPlayer.create(this, R.raw.dicesound);
                mp.start();

                break;
            case 13:
                imageViewDice.setImageResource(R.drawable.d13);
                popup.setVisibility(View.INVISIBLE);

                stopPlaying();
                mp = MediaPlayer.create(this, R.raw.dicesound);
                mp.start();

                break;
            case 14:
                imageViewDice.setImageResource(R.drawable.d14);
                popup.setVisibility(View.INVISIBLE);

                stopPlaying();
                mp = MediaPlayer.create(this, R.raw.dicesound);
                mp.start();

                break;
            case 15:
                imageViewDice.setImageResource(R.drawable.d15);
                popup.setVisibility(View.INVISIBLE);

                stopPlaying();
                mp = MediaPlayer.create(this, R.raw.dicesound);
                mp.start();

                break;
            case 16:
                imageViewDice.setImageResource(R.drawable.d16);
                popup.setVisibility(View.INVISIBLE);

                stopPlaying();
                mp = MediaPlayer.create(this, R.raw.dicesound);
                mp.start();

                break;
            case 17:
                imageViewDice.setImageResource(R.drawable.d17);
                popup.setVisibility(View.INVISIBLE);

                stopPlaying();
                mp = MediaPlayer.create(this, R.raw.dicesound);
                mp.start();

                break;
            case 18:
                imageViewDice.setImageResource(R.drawable.d18);
                popup.setVisibility(View.INVISIBLE);

                stopPlaying();
                mp = MediaPlayer.create(this, R.raw.dicesound);
                mp.start();

                break;
            case 19:
                imageViewDice.setImageResource(R.drawable.d19);
                popup.setVisibility(View.INVISIBLE);

                stopPlaying();
                mp = MediaPlayer.create(this, R.raw.dicesound);
                mp.start();

                break;
            case 20:
                imageViewDice.setImageResource(R.drawable.d20);

                popup.setText("Critical Hit!");
                popup.setVisibility(View.VISIBLE);

                stopPlaying();
                mp = MediaPlayer.create(this, R.raw.woopwoop);
                mp.start();

                break;
        }
    }
}
