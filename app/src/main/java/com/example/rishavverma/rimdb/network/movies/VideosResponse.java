package com.example.rishavverma.rimdb.network.movies;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by RishavVerma on 8/3/2017.
 */

public class VideosResponse {

    @SerializedName("id")
    private Integer id;
    @SerializedName("results")
    List<Video> videos;

    public VideosResponse(Integer id, List<Video> videos) {
        this.id = id;
        this.videos = videos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

}
