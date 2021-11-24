package com.company;

public class Dish {
    private String name;
    private double cost;
    private boolean isHasMeat;
    private boolean isHasGluten;
    private int calories;
    private int protein;
    private int carbohydrates;
    private int fats;

    public Dish(String name, double cost, boolean isHasMeat, boolean isHasGluten, int calories, int protein, int carbohydrates, int fats) {
        setCalories(calories);
        setCarbohydrates(carbohydrates);
        setCost(cost);
        setFats(fats);
        setHasGluten(isHasGluten);
        setHasMeat(isHasMeat);
        setName(name);
        setProtein(protein);
    }

    public Dish() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isHasMeat() {
        return isHasMeat;
    }

    public void setHasMeat(boolean hasMeat) {
        isHasMeat = hasMeat;
    }

    public boolean isHasGluten() {
        return isHasGluten;
    }

    public void setHasGluten(boolean hasGluten) {
        isHasGluten = hasGluten;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        if(calories==0)
            return;
        this.calories = calories;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        if(protein==0){
            this.protein = 1;
            return;}

        this.protein = protein;
    }

    public int getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(int carbohydrates) {
        if(carbohydrates==0) {
            this.carbohydrates = 1;
            return;
        }
        this.carbohydrates = carbohydrates;
    }

    public int getFats() {
        return fats;
    }

    public void setFats(int fats) {
        if(fats==0){
            this.fats=1;
            return;}
        this.fats = fats;
    }

    @Override
    public String toString() {
        String hasMeat =(isHasMeat)?"yes":"no";
        String hasGluten =(isHasGluten)?"yes":"no";
        return "Dish{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", isHasMeat=" + hasMeat +
                ", isHasGluten=" + hasGluten +
                ", calories=" + calories +
                ", protein=" + protein +
                ", carbohydrates=" + carbohydrates +
                ", fats=" + fats +
                '}';
    }
}
