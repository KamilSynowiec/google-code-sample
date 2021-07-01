package com.google;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/** A class used to represent a Playlist */
class VideoPlaylist {

    List<Video> videos = new <Video>ArrayList();

    void add(Video video)
    {
        videos.add(video);
    }

}
