package com.nickand.foodreceipes.api.search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.nickand.foodreceipes.model.Recipe;

import java.util.List;

public class RecipeSearchResponse {
    @SerializedName("count")
    @Expose
    private Integer count;

    @SerializedName("recipes")
    @Expose
    private List<Recipe> recipes = null;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    @Override
    public String toString() {
        return "RecipeSearchResponse{" +
                "count=" + count +
                ", recipes=" + recipes +
                '}';
    }
}
