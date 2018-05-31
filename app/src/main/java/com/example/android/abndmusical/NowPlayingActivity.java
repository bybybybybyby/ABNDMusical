package com.example.android.abndmusical;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        //Get song title and artist passed by previous Activity
        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            String title = extras.getString("TITLE");
            String artist = extras.getString("ARTIST");
            //Set text for title
            TextView titleTextView = findViewById(R.id.now_playing_title_text);
            titleTextView.setText(title);
            //Set text for artist
            TextView artistTextView = findViewById(R.id.now_playing_artist_text);
            artistTextView.setText(artist);
        }

    }
}
