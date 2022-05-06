package com.loginweb.posmovil;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostsApi {
    @GET("productos")
    public Call<List<Posts>> getPosts();
}
