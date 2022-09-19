package com.example.myfoodapplication.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfoodapplication.Models.ExtendedIngredient;
import com.example.myfoodapplication.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class IngredientsAdapter extends RecyclerView.Adapter<IngredientsViewHolder>{
    Context context;
    List<ExtendedIngredient> mListExtendedIngredient;


    public IngredientsAdapter(Context context, List<ExtendedIngredient> mListExtendedIngredient) {
        this.context = context;
        this.mListExtendedIngredient = mListExtendedIngredient;
    }

    @NonNull
    @Override
    public IngredientsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new IngredientsViewHolder(LayoutInflater.from(context).inflate(R.layout.list_meal_ingredients, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull IngredientsViewHolder holder, int position) {
        holder.textView_ingredients_name.setText(mListExtendedIngredient.get(position).name);
        holder.textView_ingredients_name.setSelected(true);
        holder.textView_ingredients_quantity.setText(mListExtendedIngredient.get(position).original);
        holder.textView_ingredients_quantity.setSelected(true);
        Picasso.get().load("https://spoonacular.com/cdn/ingredients_100x100/" + mListExtendedIngredient.get(position).image).into(holder.imageView_ingredients);
    }

    @Override
    public int getItemCount() {
        return mListExtendedIngredient.size();
    }
}
class IngredientsViewHolder extends RecyclerView.ViewHolder {
    TextView textView_ingredients_quantity, textView_ingredients_name;
    ImageView imageView_ingredients;
    public IngredientsViewHolder(@NonNull View itemView) {
        super(itemView);

        unitUI();
    }

    private void unitUI() {
        textView_ingredients_quantity = itemView.findViewById(R.id.textView_ingredients_quantity);
        textView_ingredients_name = itemView.findViewById(R.id.textView_ingredients_name);
        imageView_ingredients = itemView.findViewById(R.id.imageView_ingredients);


    }
}