package com.example.gaglent;

import com.example.gaglent.pojo.ModelNewsLatestList;
import com.example.gaglent.pojo.TheNews;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Url;



public interface Service {

    String BASE_URL = "http://api.lenta.ru/";

    @GET("lists/latest")
    Observable<ModelNewsLatestList> getModelNewsLatest();

    @Headers("Content-Type: application/json")
    @GET("")
    Observable<TheNews.Example> getTheNews(@Url String newslink);
}
