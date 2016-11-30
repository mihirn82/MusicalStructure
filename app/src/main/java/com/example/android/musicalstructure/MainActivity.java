package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the nowPlaying category
        TextView nowPlaying = (TextView) findViewById(R.id.nowPlaying);

        // Set a click listener on that View
        nowPlaying.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the now playing category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NowPlaying Activity}
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);

                // Start the new activity
                startActivity(nowPlayingIntent);
            }
        });

        // Find the View that shows the musicLibrary category
        TextView musicLibrary = (TextView) findViewById(R.id.musicLibrary);

        // Set a click listener on that View
        musicLibrary.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the music library category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MusicLibraryActivity}
                Intent musicLibraryIntent = new Intent(MainActivity.this, MusicLibraryActivity.class);

                // Start the new activity
                startActivity(musicLibraryIntent);
            }
        });

        // Find the View that shows the search category
        TextView search = (TextView) findViewById(R.id.search);

        // Set a click listener on that View
        search.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the search category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SearchActivity}
                Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);

                // Start the new activity
                startActivity(searchIntent);
            }
        });

        // Find the View that shows the buy music online category
        TextView buyMusicOnline = (TextView) findViewById(R.id.buyMusicOnline);

        // Set a click listener on that View
        buyMusicOnline.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the buy music online category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link BuyMusicOnlineActivity}
                Intent buyMusicOnlineIntent = new Intent(MainActivity.this, BuyMusicOnlineActivity.class);

                // Start the new activity
                startActivity(buyMusicOnlineIntent);
            }
        });
    }
}
