package com.example.android.abndmusical;

/**
 * {@link Song) Song that contains information about the Artist and Title.
 */
class Song {

    /** Artist of song */
    public String mArtist;

    /** Title of song */
    public String mTitle;

    /**
     * Create a new Song object.
     * @param artist is the song's artist.
     * @param title is the song's title.
     */
    public Song(String artist, String title) {
        mArtist= artist;
        mTitle = title;
    }

    /**
     * Get the artist of the song.
     */
    public String getSongArtist() {
        return mArtist;
    }

    /**
     * Get the title of the song.
     */
    public String getSongTitle() {
        return mTitle;
    }

}