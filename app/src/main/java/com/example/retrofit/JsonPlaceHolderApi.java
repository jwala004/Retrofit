package com.example.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

// our interface only contains relative url, we declare base url somewhere else

public interface JsonPlaceHolderApi {

    @GET("posts") // post here is relative url.
    Call<List<Post>> getPosts();

    @GET("posts/1/comments") // post here is relative url.
    Call<List<Comment>> getPost1Comment();




}
