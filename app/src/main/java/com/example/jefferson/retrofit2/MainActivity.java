package com.example.jefferson.retrofit2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tv = (TextView) findViewById(R.id.tv);

        RestInterface apiService = App.getRestApi().getApiService();
        Call<List<Video>> videos = apiService.videos();

        videos.enqueue(new Callback<List<Video>>() {
            @Override
            public void onResponse(Call<List<Video>> call, Response<List<Video>> response) {
                // response.isSuccess() is true if the response code is 2xx
                if (response.isSuccess()) {
                    List<Video> videos = response.body();
                    tv.setText(videos.toString());
                } else {
                    int statusCode = response.code();

                    // handle request errors yourself
                    ResponseBody errorBody = response.errorBody();
                }
            }

            @Override
            public void onFailure(Call<List<Video>> call, Throwable t) {
                // handle execution failures like no internet connectivity
                Log.d("FAILURE", "Failure");
            }
        });
    }
}
