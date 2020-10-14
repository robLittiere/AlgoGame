package com.company;

import java.util.Scanner;

public class gameMenu {

    private static String[][] gameBoard = PrintGame.createTable();
    public static String player1;
    public static String player2;

    /**
     * To generate a new nickname
     * @param numberPlayer just to write down the number of the player that can put his username
     * @return the nickname
     */
    public static String nickname(int numberPlayer) {   // all player can choose their nickname
        Scanner chooseName = new Scanner(System.in);

        System.out.println("\nChoose your nickname Player "+ numberPlayer +" : ");
        String player;
        player = chooseName.next();
        return player;
    }

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
     * 's', to init the game
     * @param menu the representation of what menu the player is in front
     * @return an other value of menu where the player want to go
     */
    public static char menu(char menu){
        //'menu' is use to know where the player is in the menu 'r'; 'm'; 'p'; 'q';
        Scanner sc = new Scanner(System.in);
        String chooseMenu;      //the choice of the player

        switch (menu) {
            case 'm' -> {
                jumpLine(2);
                System.out.println("Welcome to");
                System.out.println("        DESTRUCT CHESS");
                jumpLine(2);
                System.out.println("You can choose between:");
                System.out.println(" 1️⃣    'play', 'p': to begin a new game.");
                System.out.println(" 2️⃣    'rules', 'r': to see the rules, if you don't know them. Or");
                System.out.println(" 3️⃣    'quit', 'q': to ... what? I don't really know...");
                jumpLine(5);
                chooseMenu = sc.next();
                //To travel across the menu option
                switch (chooseMenu) {
                    case "q", "quit" -> menu = 'q';
                    case "p", "play" -> menu = 's';
                    case "ru", "rules", "r" -> menu = 'r';
                    default -> printError();
                }
            }
            case 'r' -> {
                System.out.println("\n \uD83D\uDCDCThis is the rules of the game.\uD83D\uDCDC\n");
                System.out.println(
                        "1. Choose a nickname to be seen during the game and \n show to your opponent who's the strongest.\n\n" +
                        "2. First on your turn, you can move once on a cell next\nto, and destroy one to try to block the opponent.\n\n" +
                        "3. If you can't move, you lose the game.Conversely,\nif it's your opponent who can't move, you win !\n"
                );
                System.out.println("Back to menu: 'Return', 're', 'r' /// Page 1 /// Next page ?(2)");
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
                System.out.println("<- Go back 'return'");
                chooseMenu = sc.next();
                switch (chooseMenu){
                    case "return", "r" -> menu = 'r';
                    default -> printError();
                }
            }
            case 's' -> {
                player1 = nickname(1);
                player2 = nickname(2);
                menu = 'p';
            }
            case 'p' -> gameBoard = game.Game(gameBoard);
        }
        return menu;
    }
}
