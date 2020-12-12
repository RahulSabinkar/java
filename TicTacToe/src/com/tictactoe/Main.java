package com.tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         char[][] gameBoard = {
                {' ', '|', ' ', '|', ' ' },
                {'-', '-', '-', '-', '-' },
                {' ', '|', ' ', '|', ' ' },
                {'-', '-', '-', '-', '-' },
                {' ', '|', ' ', '|', ' ' },
         };
         placePiece(gameBoard);
    }

    static void placePiece(char[][] gameBoard) {
        Scanner input = new Scanner(System.in);
        print(gameBoard);
        for (byte i = 9; i > 0; --i) {
            char symbol;
            if (i%2!=0) symbol = 'X';
            else symbol = 'O';
            System.out.print("Enter your turn "+symbol+" (1-9): ");
            byte playerTurn = input.nextByte();
            switch (playerTurn) {
                case 7:
                    if (gameBoard[0][0] == ' ')
                        gameBoard[0][0] = symbol;
                    else {
                        System.out.println("Invalid turn!");
                        i++;
                    }
                    break;
                case 8:
                    if (gameBoard[0][2] == ' ')
                        gameBoard[0][2] = symbol;
                    else {
                        System.out.println("Invalid turn!");
                        i++;
                    }
                    break;
                case 9:
                    if (gameBoard[0][4] == ' ')
                        gameBoard[0][4] = symbol;
                    else {
                        System.out.println("Invalid turn!");
                        i++;
                    }
                    break;
                case 4:
                    if (gameBoard[2][0] == ' ')
                        gameBoard[2][0] = symbol;
                    else {
                        System.out.println("Invalid turn!");
                        i++;
                    }
                    break;
                case 5:
                    if (gameBoard[2][2] == ' ')
                        gameBoard[2][2] = symbol;
                    else {
                        System.out.println("Invalid turn!");
                        i++;
                    }
                    break;
                case 6:
                    if (gameBoard[2][4] == ' ')
                        gameBoard[2][4] = symbol;
                    else {
                        System.out.println("Invalid turn!");
                        i++;
                    }
                    break;
                case 1:
                    if (gameBoard[4][0] == ' ')
                        gameBoard[4][0] = symbol;
                    else {
                        System.out.println("Invalid turn!");
                        i++;
                    }
                    break;
                case 2:
                    if (gameBoard[4][2] == ' ')
                        gameBoard[4][2] = symbol;
                    else {
                        System.out.println("Invalid turn!");
                        i++;
                    }
                    break;
                case 3:
                    if (gameBoard[4][4] == ' ')
                        gameBoard[4][4] = symbol;
                    else {
                        System.out.println("Invalid turn!");
                        i++;
                    }
                    break;
                default:
                    System.out.println("Invalid turn!");
                    i++;
                    break;
            }
            print(gameBoard);
            if (i<=5) check(gameBoard, symbol);
        }
        System.out.println("It's a DRAW!");
    }

    static void print(char[][] gameBoard) {
        for (int i = 0; i < 5; i++) {
            for (int j=0; j < 5; j++)
                System.out.print(gameBoard[i][j]);
            System.out.print("\n");
        }
    }

    static void check(char[][] gameBoard, char symbol) {
        //HORIZONTAL LOOP
        for (int i=0; i<5; i+=2) {
            if (symbol == gameBoard[i][0] && symbol== gameBoard[i][2] && symbol == gameBoard[i][4]) {
                System.out.println("Player "+symbol+" has WON!");
                System.exit(0);
            }
        }
        // VERTICAL LOOP
        for (int i=0; i<5; i+=2) {
            if (symbol == gameBoard[0][i] && symbol == gameBoard[2][i] && symbol== gameBoard[4][i]) {
                System.out.println("Player "+symbol+" has WON!");
                System.exit(0);
            }
        }
        // DIAGONAL CROSSES
        if (symbol == gameBoard[0][0] && symbol == gameBoard[2][2] && symbol== gameBoard[4][4]) {
            System.out.println("Player "+symbol+" has WON!");
            System.exit(0);
        }
        if (symbol == gameBoard[4][0] && symbol == gameBoard[2][2] && symbol == gameBoard[0][4]) {
            System.out.println("Player "+symbol+" has WON!");
            System.exit(0);
        }
    }
}
