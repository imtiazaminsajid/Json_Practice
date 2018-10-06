package com.example.imtiazaminsajid.json_practice;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("bins/a3jr8")
    Call<List<Person>>getPerson();
}
