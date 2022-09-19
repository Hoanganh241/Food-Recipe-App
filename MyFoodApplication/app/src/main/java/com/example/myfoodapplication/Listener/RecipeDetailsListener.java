package com.example.myfoodapplication.Listener;

import com.example.myfoodapplication.Models.RecipeDetailsResponse;

public interface RecipeDetailsListener {
    void didFetch(RecipeDetailsResponse response, String message);
    void didError(String message);
}
