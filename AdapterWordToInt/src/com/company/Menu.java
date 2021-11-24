package com.company;

import java.util.ArrayList;

public class Menu {
    ArrayList<Dish> menu=new ArrayList<>();

    public void addDish(Dish dish){
        menu.add(dish);
    }

    public void removeDish(Dish dish){
        menu.remove(dish);
    }
    
    public void showVeganMenu(){
        for (Dish aim:
             menu) {
            if(!aim.isHasMeat())
                System.out.println(aim.getName());

        }
    }
    public void showKetoMenu(){
        for (Dish aim:
                menu) {
            if ((aim.getFats()+aim.getProtein())/aim.getCarbohydrates()>=3)
                System.out.println(aim.getName());


        }
    }

    public void showMenu(){
        for (Dish aim :
                menu) {
            System.out.println(aim.getName());
        }
    }
    
    


}
