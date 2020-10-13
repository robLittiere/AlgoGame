package com.company;

import java.util.Scanner;

public class gameMenu {
    public static void clearScreen() {
        /*System.out.println("\033\143");
        System.out.flush();*/
        for(int i = 0; i < 80; i++)
            System.out.print("\b "); // Prints a backspace
    }
    public static void printError(){
        System.out.println("\n    Error. Wrong choice was made.\n");
    }
    public static char menu(char menu){
        Scanner sc = new Scanner(System.in);
        //'menu' is use to know where the player is in the menu 'r'; 'm'; 'p'; 'q';
        String chooseMenu;      //the choice of the player

        switch (menu){
            case 'm':
                clearScreen();
                System.out.println("Choose between 'play', 'rules' or 'quit':");
                chooseMenu = sc.next();
                switch (chooseMenu){
                    case "q": case "quit":
                        menu = 'q';
                        break;
                    case "p": case "play":
                        menu = 'p';
                        break;
                    case "ru": case "rules": case "r":
                        menu = 'r';
                        break;
                    default:
                        printError();
                }
                break;
            case 'r':
                clearScreen();
                System.out.println("This is the rules of the game.");
                System.out.println("Return (re) /// Page 1 /// Next page (2)");

                chooseMenu =sc.next();
                switch (chooseMenu){
                    case "re": case "return": case "r":     //Return to the menu
                        menu = 'm';
                        break;
                    default:
                        printError();
                }
                break;
            case 'p':
                clearScreen();
                System.out.println("Nothing for the moment.");
                System.out.println("Please, write 'return' to go back to the menu.");
                chooseMenu =sc.next();
                switch (chooseMenu){
                    case "r": case "return":
                        menu= 'm';
                        break;
                    default:
                        printError();
                }
                break;
        }
        return menu;
    }

}
