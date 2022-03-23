package com.xcode;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Hi, " + "do you want to play a guessing game with me?");
        System.out.print("Please select Yes or No: ");
        String option = input.nextLine();
        if(option.equals("Yes") || option.equals("yes")){
            System.out.println("I'm glad you want to play with me\nThis game consists of a secret word that you must know to win" +
                    "\nYou have five times to guess the secret word if you don't know it after five times you will lose ");
        }else{
            System.out.println("You're Welcome!");
        }

        String secretWord = "XCODE";
        String guess = "";
        guessGame(guess, secretWord);
    }

    public static void guessGame(String guess, String secretWord){
        Scanner inputGuess = new Scanner(System.in);
        int guessCount = 0;
        int guessLimit = 5;
        boolean outOfGuess = false;
        while(!guess.equals(secretWord) && !outOfGuess){
            if(guessCount < guessLimit){
                System.out.print("Enter a guess: ");
                guess = inputGuess.nextLine();
                guessCount++;
            }else{
                outOfGuess = true;
            }
        }
        if(outOfGuess){
            System.out.println("You Lose No more guesses!");
        }else{
            System.out.println("You Win!");
        }
    }
}

