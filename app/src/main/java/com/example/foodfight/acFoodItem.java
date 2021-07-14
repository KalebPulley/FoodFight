package com.example.foodfight;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class acFoodItem extends AppCompatActivity {

    String foodName;
    String manufacturer;
    float calories;
    int servings;
    String servingUnit;
    int hhServings;
    String hhServingUnits;
    String selectedDate;
    String mealType;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac_food_item);

        //Variables to get database information
        Intent intent = getIntent();
        selectedDate = intent.getStringExtra("MealDate");
        mealType = intent.getStringExtra("MealType");
        ArrayList<String> foodType = intent.getStringArrayListExtra("FoodType");
        foodName = foodType.get(0);
        manufacturer = foodType.get(1);
        calories = Float.parseFloat(foodType.get(2));

        Toast.makeText(this, manufacturer, Toast.LENGTH_SHORT).show();

    }
    //  TODO: 1. get food information from database
    //  TODO: 2. display the food information, calories, name and the serving sizes with serving unit
    //  TODO: METHOD increasing quantity tied to green button
    //  TODO: METHOD decreasing quantity tied to red button
    //  TODO: METHOD SAVE DATA

}