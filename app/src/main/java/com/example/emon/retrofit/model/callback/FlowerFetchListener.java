package com.example.emon.retrofit.model.callback;

import android.content.Context;

import com.example.emon.retrofit.model.pojo.Flower;

import java.util.List;

/**
 * @author Filippo Engidashet
 * @version 1.0.0
 * @date 1/24/2016
 */
public interface FlowerFetchListener {

    void onDeliverAllFlowers(List<Flower> flowers);

    void onDeliverFlower(Flower flower);

    void onHideDialog();
}