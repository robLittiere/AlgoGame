package com.company;

import java.io.IOException;
import java.util.Scanner;

public class gameMenu {

    private static String[][] gameBoard;
    public static String player1;
    public static String player2;
    public static String player1Design = "\uD83D\uDD34";
    public static String player2Design = "\uD83D\uDD35";
    public static int gameNumber = 1;

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
                System.out.println("Your nickname is too short, do another one. ");
                player = chooseName.next();
            }
            else if (player.length() > 10) {
                System.out.println("Your nickname is too long, do another one.");
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
    public static char menu(char menu) throws IOException {
        //'menu' is used to know where the player is in the menu 'r'; 'm'; 'p'; 'q';
        Scanner sc = new Scanner(System.in);
        String chooseMenu;      //the player's choice

        switch (menu) {
            case 'm' -> {
                //main menu
                jumpLine(2);
                System.out.println("Welcome to");
                System.out.println("\uD83D\uDE92 \uD83D\uDCA3 \uD83D\uDCA5  DARK DEMOLITION  \uD83D\uDCA5 \uD83D\uDCA3 \uD83D\uDE92 ");
                jumpLine(1);
                System.out.println("You can choose between:");
                System.out.println("\uD83D\uDCA5-------------------------------------------------------------\uD83D\uDCA5");
                System.out.println("| 1️⃣    'play', 'p': to begin a new game.                       |");
                System.out.println("| 2️⃣    'rules', 'r': to see the rules, if you don't know them. |");
                System.out.println("| 3️⃣    'bonus', 'b': to a game a new game with a secret bonuses|");
                System.out.println("| 4️⃣    'quit', 'q' : to quit the game                          |");

                System.out.println("\uD83D\uDCA5-------------------------------------------------------------\uD83D\uDCA5");
                jumpLine(5);
                chooseMenu = sc.next();

                //To travel across the menu options
                switch (chooseMenu) {
                    case "q", "quit", "1" -> menu = 'q';
                    case "p", "play", "2" -> menu = 's';
                    case "b", "bonus", "3" -> menu = 'b';
                    case "ru", "rules", "r","4" -> menu = 'r';
                    default -> printError();
                }
            }
            case 'r' -> {
                //the rule
                System.out.println("\n \uD83D\uDCDC There are the game's rules \uD83D\uDCDC\n");
                System.out.println(
                        "1️⃣ Choose a nickname to display during the game and \n show your opponent who's the strongest.\n\n" +
                                "2️⃣ First, on your turn, you can move on an adjacent cell \n, and then destroy a cell in order to try to block the opponent.\n\n" +
                                "3️⃣ If you can't move, you lose the game.Conversely,\nif your opponent gets blocked and can't move, you win !\n"
                );
                System.out.println("Back to menu: 'Return' /// Page 1 /// Next page ?(2)");
                chooseMenu = sc.next();
                switch (chooseMenu) {
                    //Return to the menu
                    case "re", "return", "r" -> menu = 'm';
                    case "2", "page 2" -> menu = '2';
                    default -> printError();
                }
            }
            case '2' ->{
                //second page of the rule
                System.out.println("Why are your here ?? ");
                jumpLine(2);
                System.out.println("<- Go back 'return'");
                chooseMenu = sc.next();
                switch (chooseMenu){
                    case "return", "r" -> menu = 'r';
                    default -> printError();
                }
            }
            case 's' -> {
                //the init of the game
                System.out.println(" Let's go for an explosive game");
                player1 = nickname(1);
                player2 = nickname(2);
                gameBoard = PrintGame.createTable();
                menu = 'p';
            }

            case 'b' -> {
                //the init of the bonus game
                System.out.println(" Let's go for a domination game, the bonus is activated, go on it's cell and see what happens \uD83D\uDFE8");
                player1 = nickname(1);
                player2 = nickname(2);
                gameBoard = PrintGame.createBonusTable();
                menu = 'p';
            }

            case 'p' -> {
                //the game
                if (WinConditions.checkIfPlayerLost(gameBoard, player1Design) || WinConditions.checkIfPlayerLost(gameBoard, player2Design )){
                    //detect a victory
                    jumpLine(4);
                    PrintGame.printBoard(gameBoard);
                    jumpLine(4);

                    menu = 'e';
                }

                else{
                    //if not, let's continue the game
                    game.Game(gameBoard, player1Design, player2Design);
                }
            }
            case 'e' -> {
                //the end of the game
                System.out.println("\uD83C\uDF8A   #------------#   \uD83C\uDF8A");
                System.out.println("     |  Good Job! |");
                System.out.println("     |  You are   |");
                System.out.println("     |  THE BEST  |");
                System.out.println("\uD83C\uDF89   #------------#   \uD83C\uDF89");
                //'player' is 'true' or 'false' depend of the turn of the player
                if (game.player){
                    System.out.println("\uD83C\uDFC6 \uD83E\uDD47 \uD83D\uDD35 "+player2+" \uD83D\uDD35 has won the game ! \uD83E\uDD47 \uD83C\uDFC6");
                    WriteFile data = new WriteFile("score.txt", true );
                    data.writeToFile( player2 + " has destroyed the game number " + gameNumber + " He's the true Annihilator");
                    gameNumber ++;

                }
                else {
                    System.out.println("\uD83C\uDFC6 \uD83E\uDD47 \uD83D\uDD34 "+player1+" \uD83D\uDD34 has won the game ! \uD83E\uDD47 \uD83C\uDFC6");
                    WriteFile data = new WriteFile("score.txt", true );
                    data.writeToFile( player1 + " has destroyed the game number " + gameNumber + " what a boss");
                    gameNumber++;
                }
                jumpLine(2);
                System.out.println("\n Write 'back' to get back to the menu.\n" +
                        "   'replay' to replay the game.\n" +
                        "   and 'quit' to quit but, why ?\n");

                chooseMenu = sc.next();
                switch (chooseMenu){
                    case "back", "b", "return", "r" -> menu = 'm';
                    case "replay", "p", "play" -> menu = 's';
                    case "quit", "exit", "q" -> menu = 'q';
                    default -> printError();
                }
            }
        }
        return menu;
    }

}
