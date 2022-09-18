package com.example.myfoodapplication.Listener;

import com.example.myfoodapplication.Models.RandomRecipeApiResponse;

public interface RandomRecipeResponseListener {
    void didFetch(RandomRecipeApiResponse response, String message);
    void didError(String message);
}
