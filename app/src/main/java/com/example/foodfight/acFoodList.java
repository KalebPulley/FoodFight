package com.example.foodfight;

/* This activity is where the embedded food list can be edited.  Adding new items
 * to the list navigates to the MenuEditor activity
 * TODO: This list is within the Meal, correct? - Tom 8-jun-21
 */

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class acFoodList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);
    }
    //create date obj
    //date have meals inside
    //get toal calories

    //TODO: METHOD EditMeal
    // TODO: METHOD AddFood
    // TODO: Show mealList for the selected Date
    // TODO: Open acCalendar
    // TODO: Buttons Connected to Each Meal Type

}