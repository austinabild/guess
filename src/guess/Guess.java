/*
 * Author:      Austin Abild
 * Program:     Guessing Game
 * Purpose:     Allow the user to guess a number 1-10 until they guess the
 *              randomly generated number.
 * Date:        1/27/2017
 */
package guess;

import java.util.Random;
import java.util.Scanner;

public class Guess {
    
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner ui = new Scanner(System.in);
        
        byte compNumber = (byte)(rand.nextFloat()* 10 + 1);
        
        System.out.println("Austin's Guessing Game!");
        
        while(true)
        {
            System.out.println("Please guess a number 1-10.");
            byte userGuess = ui.nextByte();
        if(userGuess == compNumber)
        {
            break;
        }
        else if(userGuess > compNumber)
        {
            System.out.println("Sorry, you guessed too HIGH!");
        }
        else if(userGuess < compNumber)
        {
            System.out.println("Sorry, you guessed too LOW!");
        }
        }// end while
        System.out.println("Congratulations, you guessed correctly!");
    }
    
}
