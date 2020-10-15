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
    public static String nickname(int numberPlayer) {
        // all player can choose their nickname

        Scanner chooseName = new Scanner(System.in);

        System.out.println("\nChoose your nickname Player "+numberPlayer+" : ");
        String player = chooseName.next();
        while (player.length()<2 || player.length()>10){

            if (player.length() < 2) {
                System.out.println("your nickname is too short, do another one.");
                player = chooseName.next();
            }
            else if (player.length() > 10) {
                System.out.println("your nickname is too long, do another one.");
                player = chooseName.next();
            }
            else{
                break;
            }
        }
        return player;
    }

    /**
     * Jump a few line
     * @param line number of lines to skip
     */
    public static void jumpLine(int line)  {
        for(int i = 0; i < line; i++)
            System.out.print("\n"); // Prints a backspace
    }

    /**
     * To print an error when the player chooses a wrong choice amongst the propositions
     */
    public static void printError(){
        System.out.println("\n    Error. Wrong choice was made.\n");
    }

    /**
     * To know where the player is. Possible values:
     * 'm', the main menu
     * 'r', the main page of the rules of the game // '2' the second page of the rules
     * 'p', the game, literally
     * 'q', when the player wants to quit
     * 's', to initiate the game
     * @param menu the representation of which menu the player is at
     * @return an other value of menu where the player wants to go
     */
    public static char menu(char menu){
        //'menu' is used to know where the player is in the menu 'r'; 'm'; 'p'; 'q';
        Scanner sc = new Scanner(System.in);
        String chooseMenu;      //the player's choice

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

                //To travel across the menu options
                switch (chooseMenu) {
                    case "q", "quit", "1" -> menu = 'q';
                    case "p", "play", "2" -> menu = 's';
                    case "ru", "rules", "r","3" -> menu = 'r';
                    default -> printError();
                }
            }
            case 'r' -> {
                System.out.println("\n \uD83D\uDCDCThere are the game's rules\uD83D\uDCDC\n");
                System.out.println(
                        "1. Choose a nickname to display during the game and \n show your opponent who's the strongest.\n\n" +
                        "2. First, on your turn, you can move on an adjacent cell \n, and then destroy a cell in order to try to block the opponent.\n\n" +
                        "3. If you can't move, you lose the game.Conversely,\nif your opponent gets blocked and can't move, you win !\n"
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

            case 'e' -> {
                System.out.println("            Congratz ");
                System.out.println("            Congratz ");
                System.out.println("            Congratz ");
                menu
            }
            case 'p' -> {
                String player1Design = "\uD83D\uDD34";
                String player2Design = "\uD83D\uDD35";

                if (WinConditions.checkIfPlayerLost(gameBoard, player1Design) || WinConditions.checkIfPlayerLost(gameBoard, player2Design )){
                    jumpLine(4);
                    PrintGame.printBoard(gameBoard);
                    jumpLine(4);



                    menu = 'm';

                }

                else{
                    game.Game(gameBoard, player1Design, player2Design);
                }
            }
        }
        return menu;
    }

}
