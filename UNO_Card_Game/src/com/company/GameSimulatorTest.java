package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class GameSimulatorTest {

    public static void main(String[] args) throws InterruptedException {

        ArrayList<Player> players = new ArrayList<>();

        Scanner keyboard = new Scanner(System.in);

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

            System.out.println("All players should have seven cards\n");

        }

        else {

            System.out.println("Could not deal cards.");
            System.exit(1);

        }

        Thread.sleep(2000);

        Player currentPlayer = newDealer;
        CardDeck currentHand = null;
        CardDeck.Node currentCardNode;
        Card currentCard;

        System.out.println(currentPlayer.getName() + ", its your turn to play!\n");

        Thread.sleep(2000);

        while (currentPlayer.getCards() != null) {

            System.out.println("YOUR HAND\n");
            System.out.println("----------");;

            int length = currentPlayer.getCards().getLength();
            System.out.println(length + " cards.");
            System.out.println("----------");;
            System.out.println();

            for (int i = 1; i < length + 1; i++) {

                currentHand = currentPlayer.getCards();

                currentCardNode = (CardDeck.Node) currentHand.getEntry(i);

                currentCard = (Card) currentCardNode.getData();

                System.out.println("----------------");
                ;
                System.out.println("|               |");
                System.out.println("|               |");

                System.out.println("| " + currentCard.getName());

                System.out.println("|               |");
                System.out.println("|               |");
                System.out.println("|               |");
                System.out.println("----------------");
                System.out.println();

                if (currentCard.equals(null)) {

                    System.out.println("Card could not be printed");

                }

            }

                Thread.sleep(3000);

                System.out.println("CARD TO MATCH");



                System.out.println("----------------");;
                System.out.println("|               |");
                System.out.println("|               |");

                System.out.println("| " + GAME.topCard().getName());

                System.out.println("|               |");
                System.out.println("|               |");
                System.out.println("|               |");
                System.out.println("----------------");
                System.out.println();

                Thread.sleep(3000);

                boolean notValidCard = true;

                while(notValidCard) {

                    System.out.println("Which card would you like to play?\n");
                    System.out.println("Enter 'None' if you do not have any cards to play.\n");

                    String cardToPlay = keyboard.nextLine();

                    for (int id = 1; id < length + 1; id++) {

                        if (cardToPlay.equals("None")) {

                            currentPlayer.drawCard(GAME.drawCard(currentPlayer));

                            System.out.println("A card has been added to your hand. On to the next player!\n");

                            break;

                        }

                        currentCardNode = (CardDeck.Node) currentHand.getEntry(id);

                        currentCard = (Card) currentCardNode.getData();

                        String currentCardName = currentCard.getName();

//                        System.out.println(cardToPlay);
//                        System.out.println(currentCardName);

                        if (currentCardName.equals(cardToPlay)) {

                            currentPlayer.placeCard(currentCard);

                            if (GAME.playCard(currentCard)) {

                                System.out.println("Your card has been placed!\n");
                                Thread.sleep(1000);
                                System.out.println("On to the next player!\n");

                            }

                            else {

                                System.out.println("Could not play card. Terminating.");
                                System.exit(1);

                            }

                            notValidCard = false;

                            break;

                        }

                    }

                }

                currentPlayer = GAME.rotate();

                Thread.sleep(4000);

        }

    }
}
