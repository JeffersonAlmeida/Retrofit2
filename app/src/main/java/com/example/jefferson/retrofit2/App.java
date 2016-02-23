package com.example.jefferson.retrofit2;

import android.app.Application;

/**
 * Created by jefferson on 23/02/16.
 */
public class App extends Application {

    private static RestClient restClient;

    @Override
    public void onCreate() {
        super.onCreate();
        restClient = new RestClient();
    }

    public static RestClient getRestApi(){
        return restClient;
    }
}
