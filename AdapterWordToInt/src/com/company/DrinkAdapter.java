package com.company;

public class DrinkAdapter extends Dish {

    public DrinkAdapter(Drink drink) {
        setName(drink.getName());
        setCost(drink.getCost());
        setHasGluten(drink.getAlcohol());
        setCarbohydrates(drink.getDegree());
        isKeto(drink.getAlcohol());
    }

    private void isKeto(Boolean alcohol) {
        if(alcohol)
            setProtein(0);
        setFats(10);
    }

    @Override
    public String toString() {
        String hasGluten=(isHasGluten())?"yes":"no";
        String degrees=((isHasGluten()))?"degrees="+getCarbohydrates():"";
        return "drink\nname="+getName()+"\nCost="+getCost()+"\nisAlcohol="+hasGluten+"\n"+degrees;
    }
}
