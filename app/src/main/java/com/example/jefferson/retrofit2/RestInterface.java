package com.example.jefferson.retrofit2;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by jefferson on 23/02/16.
 */
public interface RestInterface {

    @GET("app/json/json-tv-riachuelo.aspx")
    Call<List<Video>> videos();

}
