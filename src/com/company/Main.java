package com.company;


import java.io.IOException;

public class Main {

    int i = 0;
    /*
     * The main function.
     * We launch the whole game from here. We also terminate it from here.
     */
    public static void main(String[] args) throws IOException {

        //Scanner sc = new Scanner(System.in);




        char menu = 'm';        //to know where the player is in the menu 'r'; 'm'; 'p'; 'q';

        while (menu != 'q'){
            menu = gameMenu.menu(menu);
        }
        System.out.println(" \uD83D\uDC4B Goodbye, thanks for playing");
    }
}