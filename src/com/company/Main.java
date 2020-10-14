package com.company;

public class Main {

    public static void main(String[] args) {

        char menu = 'm';        //to know where the player is in the menu 'r'; 'm'; 'p'; 'q';

        while (menu != 'q'){
            menu = gameMenu.menu(menu);
        }
        System.out.println("Why did you do that ...");
    }
}