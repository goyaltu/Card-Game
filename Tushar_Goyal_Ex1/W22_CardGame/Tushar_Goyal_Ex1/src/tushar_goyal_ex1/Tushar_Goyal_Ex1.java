/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tushar_goyal_ex1;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Tushar Goyal 02/02/2022
 */
public class Tushar_Goyal_Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        // Create an array to hold 7 cards
        Card[] hand = new Card[7];

        // We'll use Random to generate random numbers
        Random random = new Random();

        for (int i = 0; i < hand.length; i++) {
            int value = random.nextInt(13) + 1;
            String suit = Card.SUITS[random.nextInt(4)];

            Card card = new Card(value, suit);
            hand[i] = card;
        }

        // print them out for debugging purposes
        System.out.println("Here are the cards in the hand");
        for (Card card : hand) {
            System.out.printf("%d of %s\n", card.getValue(), card.getSuit());
        }

        // Now ask the user for a card
        System.out.println("Pick a suit for your card");
        for (int i = 0; i < Card.SUITS.length; i++) {
            System.out.println((i + 1) + ": " + Card.SUITS[i]);
        }
        int suit = input.nextInt();

        System.out.println("Enter a value (1 to 13)");
        int value = input.nextInt();

        Card userGuess = new Card(value, Card.SUITS[suit - 1]);

        boolean match = false;
        for (Card card : hand) {
            if (card.getValue() == userGuess.getValue()
                    && card.getSuit().equals(userGuess.getSuit())) {
                match = true;
                break;
            }
        }
    
        String response = match ? Card.printInfo(): "No match";
        
        System.out.println(response);
    }
    
}

class Card{
    public int value;
    public String suit;
    public static String[] SUITS = {"Clubs","Spades","Hearts","Diamonds"};
    
    Card(int value, String suit){
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public String getSuit() {
        return suit;
    }
    
    public static String printInfo(){
        return " Done! Hello! My name is Tushar Goyal.I am a student at Sheridan College and I am pursuing Software Engineering Diploma Course. ";
    }
    
}