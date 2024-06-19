package org.example.psuedocode;

import java.util.*;

public class PickARandomCard {
    public static void main(String[] args) {

        //shuffle();

        //getRandomCard();

        ArrayList<String> deck = createDeck();

        // Pick a random card from the deck
        String randomCard = pickRandomCard(deck);

        // Display the randomly picked card
        System.out.println("Random card: " + randomCard);

    }


    private static void shuffle(){

        String types[] = {"Heart","Diamond","Spade","Club"};

        String ranks[] = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

        Map<Integer, String> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int count =1;
        for (int i=0; i< types.length; i++) {

            for (int j = 0; j < ranks.length; j++) {

                sb.append("[").append(types[i]).append(",").append(ranks[j]).append("]");

                map.put(count, sb.toString());
                count++;
            }

        }

     System.out.println("Random picked card :: "+map);

    }

    private static int getRandom(){
        Random random = new Random();
        int n = random.nextInt(10);
        return n;
    }



private static void getRandomCard(){

    int[] deck = new int[52];
    String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
            "10", "Jack", "Queen", "King"};

    // Initialize cards
    for (int i = 0; i < deck.length; i++)
        deck[i] = i;

    // Shuffle the cards
    for (int i = 0; i < deck.length; i++) {
        // Generate an index randomly
        int index = (int)(Math.random() * deck.length);
        int temp = deck[i];
        deck[i] = deck[index];
        deck[index] = temp;
        System.out.println("Deck of cards : "+deck[index]);
    }


    // Display the first four cards
    for (int i = 0; i < 4; i++) {
        String suit = suits[deck[i] / 13];
        String rank = ranks[deck[i] % 13];
        System.out.println("Random Card number : " + deck[i] + ": "
                + rank + " of " + suit);
    }

}



// Function to create a deck of cards
    public static ArrayList<String> createDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        ArrayList<String> deck = new ArrayList<>();

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " of " + suit);
            }
        }


        return deck;
    }

    // Function to pick a random card from the deck
    public static String pickRandomCard(ArrayList<String> deck) {
        Random rand = new Random();
        int randomIndex = rand.nextInt(deck.size());
        System.out.println(" Total Size :"+deck.size());
        deck.forEach(System.out::println);
        return deck.get(randomIndex);
    }



}
