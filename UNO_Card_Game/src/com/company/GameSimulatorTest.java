package com.company;

import java.util.ArrayList;

public class GameSimulatorTest {

    public static void main(String[] args) throws InterruptedException {

        ArrayList<Player> players = new ArrayList<>();

        Player Andrew = new Player("Andrew");
        Player Jimmy = new Player("Jimmy");
        Player Mitch = new Player("Mitch");
        Player Brandon = new Player("Brandon");
        Player Chris = new Player("Chris");
        Player Max = new Player("Max");

        players.add(Andrew);
        players.add(Jimmy);
        players.add(Mitch);
        players.add(Brandon);
        players.add(Chris);
        players.add(Max);

        UNO GAME = new UNO(players);

        System.out.println("LETS PLAY UNO!");

        Thread.sleep(2000);

        if (GAME.generateCards()) {

            System.out.println("Card Deck has been placed on the playing area");

            Thread.sleep(2000);

            System.out.println("Shuffling deck!");

            Thread.sleep(6000);

        }

        if (GAME.shuffleDeck()) {

            System.out.println("Card Deck has been shuffled!");

            Thread.sleep(2000);

        }

        else {

            System.out.println("Could not shuffle deck...");
            System.out.println("Terminating.");

            System.exit(1);

        }

        System.out.println("Assigning the dealer!");

        Thread.sleep(3000);

        Player newDealer = GAME.assignDealer();

        System.out.println(newDealer.getName() + " is the dealer!");

        Thread.sleep(1000);

        System.out.println(newDealer.getName() + ", its your turn to start the game");

        Thread.sleep(1000);

        System.out.println(newDealer.getName() + ", you can now deal the cards");

        Thread.sleep(500);

        System.out.println("Dealing...");

        if (GAME.deal()) {

            Thread.sleep(5000);

            System.out.println("All players should have seven cards");

        }

        Player currentPlayer = newDealer;

        while (currentPlayer.getCards() != null) {

            System.out.println("Your Hand\n");
            int length = currentPlayer.getCards().getLength();
            System.out.println("Iteration length: " + currentPlayer.getCards().getLength());

            for (int i = 1; i < length - 1; i++) {

                CardDeck currentHand = currentPlayer.getCards();

                System.out.println("Amount of cards returned: " + currentHand.getLength());

                Object currentCard = currentHand.getEntry(i);

                System.out.println("Object Returned: " + currentCard);

                System.out.println("Current Player Hand Size: " + currentHand.getLength());

                //System.out.println(currentCard.getName());

                if (currentCard.equals(null)) {

                    System.out.println("Card could not be printed");
                }

            }

            System.out.println("Please choose a card to play\n");

            Card cardToMatch = GAME.topCard();

            System.out.println("Top card on deck: " + cardToMatch.getName());

            Thread.sleep(1000);

        }

    }
}
