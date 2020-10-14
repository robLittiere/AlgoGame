package com.company;

import java.util.Scanner;

public class gameMenu {

    /**
     * Jump a few line
     * @param line number of line the player want to jump
     */
    public static void jumpLine(int line)  {
        for(int i = 0; i < line; i++)
            System.out.print("\n"); // Prints a backspace
    }

    /**
     * To print a error when the player choose a wrong choice among the proposition
     */
    public static void printError(){
        System.out.println("\n    Error. Wrong choice was made.\n");
    }

    /**
     * To know where the player is. Possible value:
     * 'm', the main menu
     * 'r', the main page of the rules of the game // '2' the second page of the rules
     * 'p', the game, literally
     * 'q', when the player want to quit
     * @param menu the representation of what menu the player is in front
     * @return an other value of menu where the player want to go
     */
    public static char menu(char menu){
        //'menu' is use to know where the player is in the menu 'r'; 'm'; 'p'; 'q';
        Scanner sc = new Scanner(System.in);
        String chooseMenu;      //the choice of the player

        switch (menu) {
            case 'm' -> {
                System.out.println("Choose between 'play', 'rules' or 'quit':");
                jumpLine(5);
                chooseMenu = sc.next();
                //To travel across the menu option
                switch (chooseMenu) {
                    case "q", "quit" -> menu = 'q';
                    case "p", "play" -> menu = 'p';
                    case "ru", "rules", "r" -> menu = 'r';
                    default -> printError();
                }
            }
            case 'r' -> {
                System.out.println("This is the rules of the game.\n");
                System.out.println("1. Choose a nickname to be seen during the game and\nshow to your opponent who's the strongest.\n");
                System.out.println("2. First on your turn, you can move once on a cell next\nto, and destroy one to try to block the opponent.\n");
                System.out.println("3. If you can't move, you lose the game.Conversely,\nif it's your opponent who can't move, you win !\n");
                System.out.println("Return (re) /// Page 1 /// Next page ?(2)");
                chooseMenu = sc.next();
                switch (chooseMenu) {
                    //Return to the menu
                    case "re", "return", "r" -> menu = 'm';
                    case "2", "page 2" -> menu = '2';
                    default -> printError();
                }
            }
            case '2' ->{
                System.out.println("Why are your here ??");
                jumpLine(2);
                System.out.println("<- Go back (return)");
                chooseMenu = sc.next();
                switch (chooseMenu){
                    case "return", "r" -> menu = 'r';
                    default -> printError();
                }
            }
            case 'p' -> {
                System.out.println("Nothing for the moment.");
                System.out.println("Please, write 'return' to go back to the menu.");
                chooseMenu = sc.next();
                switch (chooseMenu) {
                    case "r", "return" -> menu = 'm';
                    default -> printError();
                }
            }
        }
        return menu;
    }

}
