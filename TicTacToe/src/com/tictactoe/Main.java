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
        Scanner input = new Scanner(System.in);
        for (byte i = 9; i > 0; --i) {
            if (i%2!=0)
                System.out.print("Enter your turn X (1-9): ");
            else
                System.out.print("Enter your turn O (1-9): ");
            byte playerTurn = input.nextByte();
            if (i%2!=0) {
                switch (playerTurn) {
                    case 1 -> {
                        gameBoard[0][0] = 'X';
//                        check(gameBoard, 1);
                    }
                    case 2 -> gameBoard[0][2] = 'X';
                    case 3 -> gameBoard[0][4] = 'X';
                    case 4 -> gameBoard[2][0] = 'X';
                    case 5 -> gameBoard[2][2] = 'X';
                    case 6 -> gameBoard[2][4] = 'X';
                    case 7 -> gameBoard[4][0] = 'X';
                    case 8 -> gameBoard[4][2] = 'X';
                    case 9 -> gameBoard[4][4] = 'X';
                    default -> {
                        System.out.println("Invalid turn!");
                        i++;
                    }
                }
            }
            else  {
                switch (playerTurn) {
                    case 1 -> gameBoard[0][0] = 'O';
                    case 2 -> gameBoard[0][2] = 'O';
                    case 3 -> gameBoard[0][4] = 'O';
                    case 4 -> gameBoard[2][0] = 'O';
                    case 5 -> gameBoard[2][2] = 'O';
                    case 6 -> gameBoard[2][4] = 'O';
                    case 7 -> gameBoard[4][0] = 'O';
                    case 8 -> gameBoard[4][2] = 'O';
                    case 9 -> gameBoard[4][4] = 'O';
                    default -> {
                        System.out.println("Invalid turn!");
                        i++;
                    }
                }
            }
            print(gameBoard);
        }
    }
    // static void check(char[][] gameBoard, byte x) {

    //     for (int i = 0; i < 5; i+=2) {
    //         for (int j=0; j < 5; j+=2) {
    //         }
    //         System.out.print("\n");
    //     }
    // }

    static void print(char[][] gameBoard) {
        for (int i = 0; i < 5; i++) {
            for (int j=0; j < 5; j++) {
                System.out.print(gameBoard[i][j]);
            }
            System.out.print("\n");
        }
    }
}
