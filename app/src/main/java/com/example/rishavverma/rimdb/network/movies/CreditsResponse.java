package com.example.rishavverma.rimdb.network.movies;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by RishavVerma on 8/3/2017.
 */

public class CreditsResponse {

    @SerializedName("id")
    private Integer id;
    @SerializedName("cast")
    List<Cast> casts;
    @SerializedName("crew")
    List<Crew> crews;

    public CreditsResponse(Integer id, List<Cast> casts, List<Crew> crews) {
        this.id = id;
        this.casts = casts;
        this.crews = crews;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Cast> getCasts() {
        return casts;
    }

    public void setCasts(List<Cast> casts) {
        this.casts = casts;
    }

    public List<Crew> getCrews() {
        return crews;
    }

    public void setCrews(List<Crew> crews) {
        this.crews = crews;
    }

}
