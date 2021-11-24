package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Dish d1=new Dish("makaroniWithAChikenCrisps",10.99,true,true,900,10,10,10);
    Dish d2=new Dish("makaroni",1,false,true,100,10,3,3);
    Dish d3=new Dish("markoroinian",10,false,false,10,0,0,0);

    Drink t1=new Drink("jagermaister",10.0,true,35);
    Drink t2=new Drink("coca-cola",10.0,false,0);

    Dish td1=new DrinkAdapter(t1);
    Dish td2=new DrinkAdapter(t2);

    Menu menu=new Menu();
    menu.addDish(d1);
    menu.addDish(d2);
    menu.addDish(d3);
    menu.addDish(td1);
    menu.addDish(td2);


        System.out.println("\n\nKeto menu\n");
    menu.showKetoMenu();
        System.out.println("-------------------");
        System.out.println("vegan menu\n");
    menu.showVeganMenu();

        System.out.println("-------------------");
        System.out.println("all menu\n");

    menu.showMenu();





    }


}
