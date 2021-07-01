package com.google;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class VideoPlayer {

  Map<String, VideoPlaylist> map = new HashMap<>();
  private final VideoLibrary videoLibrary;

  public VideoPlayer() {
    this.videoLibrary = new VideoLibrary();
  }

  public void numberOfVideos() {
    System.out.printf("%s videos in the library%n", videoLibrary.getVideos().size());
  }

  public void showAllVideos() {
    System.out.printf("%sHere's a list of all available videos:%n", videoLibrary.getVideos());
  }

  public void playVideo(String videoId) {
    System.out.println("playVideo needs implementation");
  }

  public void stopVideo() {
    System.out.println("stopVideo needs implementation");
  }

  public void playRandomVideo() {
    System.out.println("playRandomVideo needs implementation");
  }

  public void pauseVideo() {
    System.out.println("pauseVideo needs implementation");
  }

  public void continueVideo() {
    System.out.println("continueVideo needs implementation");
  }

  public void showPlaying() {
    System.out.println("showPlaying needs implementation");
  }

  public void createPlaylist(String playlistName)
  {


    map.put(playlistName, new VideoPlaylist());

    System.out.println("Successfully created new playlist: "+playlistName);

  }

  public void addVideoToPlaylist(String playlistName, String videoId)
  {
    System.out.println("Added video to "+playlistName);


  }

  public void showAllPlaylists() {
    System.out.println("Showing playlists: "+map.keySet());


  }

  public void showPlaylist(String playlistName) {
    System.out.println("showPlaylist needs implementation");
  }

  public void removeFromPlaylist(String playlistName, String videoId) {
    System.out.println("removeFromPlaylist needs implementation");
  }

  public void clearPlaylist(String playlistName) {
    System.out.println("clearPlaylist needs implementation");
  }

  public void deletePlaylist(String playlistName) {
    System.out.println("deletePlaylist needs implementation");
  }

  public void searchVideos(String searchTerm) {
    System.out.println("searchVideos needs implementation");
  }

  public void searchVideosWithTag(String videoTag) {
    System.out.println("searchVideosWithTag needs implementation");
  }

  public void flagVideo(String videoId) {
    System.out.println("flagVideo needs implementation");
  }

  public void flagVideo(String videoId, String reason) {
    System.out.println("flagVideo needs implementation");
  }

  public void allowVideo(String videoId) {
    System.out.println("allowVideo needs implementation");
  }
