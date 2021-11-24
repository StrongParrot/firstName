package com.company;

public class Drink {
    private String name;
    private Double cost;
    private Boolean isAlcohol;
    private int degree;

    public Drink(String name, Double cost, Boolean isAlcohol, int degree) {
       setAlcohol(isAlcohol);
       setCost(cost);
       setDegree(degree);
       setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Boolean getAlcohol() {
        return isAlcohol;
    }

    public void setAlcohol(Boolean alcohol) {
        isAlcohol = alcohol;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }
}
