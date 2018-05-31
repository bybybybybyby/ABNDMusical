package com.example.android.abndmusical;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;


public class ArtistsActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs
        final ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Beethoven", "Symphony"));
        songs.add(new Song("Michael Jackson", "Bad"));
        songs.add(new Song("Apfel", "Way"));
        songs.add(new Song("Michael Jackson", "Thriller"));
        songs.add(new Song("Bee", "Symphony"));
        songs.add(new Song("Mason", "Home"));
        songs.add(new Song("Cen", "Zebras"));
        songs.add(new Song("Michael Jackson", "Textile"));
        songs.add(new Song("Dove", "Wind Over Matter"));
        songs.add(new Song("E Jackson", "Bounce"));

       // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SongAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Song} in the list.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(ArtistsActivity.this, NowPlayingActivity.class);
                Song song = songs.get(i);
                intent.putExtra("TITLE", song.getSongTitle());
                intent.putExtra("ARTIST", song.getSongArtist());
                startActivity(intent);
            }
        });

    }
}
