package com.blz.deckOfCards;

public class Main {
    public static void main(String[] args) {
        System.out.println("object oriented programmes");
        System.out.println(".......Deck Of Cards.......");
        Card card = new Card();
        card.shuffleCard();
        card.assignCards();
        card.display();
    }
}


