package com.example.rishavverma.rimdb.network;

import com.example.rishavverma.rimdb.network.movies.CreditsResponse;
import com.example.rishavverma.rimdb.network.movies.Movie;
import com.example.rishavverma.rimdb.network.movies.NowShowingMovieResponse;
import com.example.rishavverma.rimdb.network.movies.PopularMovieResponse;
import com.example.rishavverma.rimdb.network.movies.SimilarMoviesResponse;
import com.example.rishavverma.rimdb.network.movies.TopRatedMovieResponse;
import com.example.rishavverma.rimdb.network.movies.UpcomingMovieResponse;
import com.example.rishavverma.rimdb.network.movies.VideosResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by RishavVerma on 8/3/2017.
 */

public interface ApiInterface {

    @GET("movie/now_playing")
    Call<NowShowingMovieResponse> getNowShowingMovies(@Query("api_key") String apiKey, @Query("page") Integer page, @Query("region") String region);

    @GET("movie/popular")
    Call<PopularMovieResponse> getPopularMovies(@Query("api_key") String apiKey, @Query("page") Integer page, @Query("region") String region);

    @GET("movie/upcoming")
    Call<UpcomingMovieResponse> getUpcomingMovies(@Query("api_key") String apiKey, @Query("page") Integer page, @Query("region") String region);

    @GET("movie/top_rated")
    Call<TopRatedMovieResponse> getTopRatedMovies(@Query("api_key") String apiKey, @Query("page") Integer page, @Query("region") String region);

    @GET("movie/{id}")
    Call<Movie> getMovieDetails(@Path("id") Integer movieId, @Query("api_key") String apiKey);

    @GET("movie/{id}/credits")
    Call<CreditsResponse> getMovieCredits(@Path("id") Integer movieId, @Query("api_key") String apiKey);

    @GET("movie/{id}/videos")
    Call<VideosResponse> getMovieVideos(@Path("id") Integer movieId, @Query("api_key") String apiKey);

    @GET("movie/{id}/similar")
    Call<SimilarMoviesResponse> getSimilarMovies(@Path("id") Integer movieId, @Query("api_key") String apiKey, @Query("page") Integer page);


}
