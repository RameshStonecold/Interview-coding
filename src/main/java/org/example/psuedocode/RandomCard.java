package org.example.psuedocode;

import java.util.Arrays;
import java.util.Random;

public class RandomCard {
    public static void main(String[] args) {
       // pickARandom();

        //checkRange();
        pickARandom();
    }


    private static void pickARandom(){

        String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "Jack", "Queen", "King","Ace"};

        String[] deck = new String[suits.length* ranks.length];

        //initialize all deck of cards
        int count =0;
        for(int i=0; i<suits.length; i++){
            for (int j=0; j<ranks.length; j++){
              deck[count]=  suits[i]+" "+ranks[j];
              count++;
            }
        }

        System.out.println("Before Shuffle : "+Arrays.toString(deck));
        shuffle(deck);
        System.out.println("After Shuffle : "+Arrays.toString(deck));

        String randomCard = deck[getRandomNum()];

        System.out.println("A Random Card :"+ randomCard);
    }

    private static void shuffle(String [] deck){

        for (int i=0 ;i<deck.length; i++){
            int r = getRandomNum();
            String temp = deck[r];
            deck[r]=deck[i];
            deck[i] = temp;
        }
    }

    private static int getRandomNum(){
        return new Random().nextInt(52);
    }


    private static void checkRange(){



        for (int i=0; i<=52; i++){
            System.out.println(i/13+","+i%13);

           // String s = deck[i/13];
            //String s2 = deck[i%13];

        }
    }

}
