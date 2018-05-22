package com.example.android.abndmusical;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Toshiba on 5/21/2018.
 */

public class SongAdapter extends ArrayAdapter<Song> {
    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Song} object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the artist
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        // Get the artist name from the current Song object and
        // set this text on the name TextView
        artistTextView.setText(currentSong.getSongArtist());

        // Find the TextView in the list_item.xml layout with the title
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        // Get the Default song from the current Song object and
        // set this text on the TextView
        titleTextView.setText(currentSong.getSongTitle());

        return listItemView;
    }
}
