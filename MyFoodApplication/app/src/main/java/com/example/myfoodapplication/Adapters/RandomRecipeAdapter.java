package com.example.myfoodapplication.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfoodapplication.Models.Recipe;
import com.example.myfoodapplication.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class RandomRecipeAdapter extends RecyclerView.Adapter<RandomRecipeViewHolder>{
    Context context;
    List<Recipe> mListRecipe;

    public RandomRecipeAdapter(Context context, List<Recipe> mListRecipe) {
        this.context = context;
        this.mListRecipe = mListRecipe;
    }

    @NonNull
    @Override
    public RandomRecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new RandomRecipeViewHolder(LayoutInflater.from(context).inflate(R.layout.list_random_recipe, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull RandomRecipeViewHolder holder, int position) {
        holder.textView_title.setText(mListRecipe.get(position).title);
        holder.textView_title.setSelected(true);
        holder.textView_likes.setText(mListRecipe.get(position).aggregateLikes + "Likes");
        holder.textView_servings.setText(mListRecipe.get(position).servings + " Servings");
        holder.textView_time.setText(mListRecipe.get(position).readyInMinutes + " Minutes");
        Picasso.get().load(mListRecipe.get(position).image).into(holder.imageView_food);
    }

    @Override
    public int getItemCount() {
        return mListRecipe.size();
    }
}

class RandomRecipeViewHolder extends RecyclerView.ViewHolder {
    CardView random_list_container;
    TextView textView_title, textView_servings, textView_likes, textView_time;
    ImageView imageView_food;

    public RandomRecipeViewHolder(@NonNull View itemView) {
        super(itemView);
        unitUI();
    }

    private void unitUI() {
        random_list_container = itemView.findViewById(R.id.random_list_container);
        textView_title = itemView.findViewById(R.id.random_list_container);
        random_list_container = itemView.findViewById(R.id.textView_title);
        textView_servings = itemView.findViewById(R.id.textView_serving);
        textView_likes = itemView.findViewById(R.id.textView_likes);
        textView_time = itemView.findViewById(R.id.textView_time);
        imageView_food = itemView.findViewById(R.id.imageView_food);
    }
}
