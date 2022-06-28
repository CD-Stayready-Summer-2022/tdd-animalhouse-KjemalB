package com.codedifferently.animalhouse.animals;

import com.codedifferently.animalhouse.Food;

public interface Animal {
    String speak();
    Integer getNumberOfMealsEaten();
    Integer getId();
    void eat(Food food);

}
