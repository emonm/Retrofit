package com.example.emon.retrofit.model.callback;

import com.example.emon.retrofit.model.pojo.Flower;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * @author Filippo Engidashet
 * @version 1.0.0
 * @date 1/22/2016
 */
public interface FlowerService {

    @GET("/feeds/flowers.json")
    Call<List<Flower>> getAllFlowers();
}