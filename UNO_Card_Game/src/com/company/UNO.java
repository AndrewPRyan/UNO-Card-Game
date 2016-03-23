package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by andrewryan on 3/9/16.
 */
public class UNO {

    private ArrayList<Player> players;
    private CardDeck discardPile;
    private CardDeck drawPile;
    private String playerRotation;
    private int playerPosition;
    private Card.CardColor gameStateColor;

    UNO() {

        this(new ArrayList<>(), new CardDeck(108), "clockwise");

    }

    UNO(ArrayList<Player> players) {

        this(players, new CardDeck(108), "clockwise");

    }

    UNO(ArrayList<Player> players, CardDeck discardPile, String playerRotation) {

        this.players = players;
        this.discardPile = discardPile;
        this.drawPile = new CardDeck(108);
        this.playerRotation = playerRotation;

    }

    public void generatePlayers(ArrayList<Player> gamePlayers) {

        this.players = gamePlayers;

    }

    public Player assignDealer() {

        int range = ((players.size() - 1) - 1) + 1;

        int randomNumber = (int)(Math.random() * range) + 1;

        Player dealer = players.get(randomNumber);

        dealer.makeDealer();

        players.set(randomNumber, dealer);

        this.playerPosition = randomNumber;

        return dealer;

    }

    public boolean generateCards() {

        try {

            // Generates RED Cards

            Card RED_ZERO = new Card(Card.CardColor.RED, Card.CardNumber.ZERO, "Red 0");
            drawPile.add(RED_ZERO);
            Card RED_ONE1 = new Card(Card.CardColor.RED, Card.CardNumber.ONE, "Red 1");
            drawPile.add(RED_ONE1);
            Card RED_TWO1= new Card(Card.CardColor.RED, Card.CardNumber.TWO, "Red 2");
            drawPile.add(RED_TWO1);
            Card RED_THREE1 = new Card(Card.CardColor.RED, Card.CardNumber.THREE, "Red 3");
            drawPile.add(RED_THREE1);
            Card RED_FOUR1 = new Card(Card.CardColor.RED, Card.CardNumber.FOUR, "Red 4");
            drawPile.add(RED_FOUR1);
            Card RED_FIVE1 = new Card(Card.CardColor.RED, Card.CardNumber.FIVE, "Red 5");
            drawPile.add(RED_FIVE1);
            Card RED_SIX1 = new Card(Card.CardColor.RED, Card.CardNumber.SIX, "Red 6");
            drawPile.add(RED_SIX1);
            Card RED_SEVEN1 = new Card(Card.CardColor.RED, Card.CardNumber.SEVEN, "Red 7");
            drawPile.add(RED_SEVEN1);
            Card RED_EIGHT1 = new Card(Card.CardColor.RED, Card.CardNumber.EIGHT, "Red 9");
            drawPile.add(RED_EIGHT1);
            Card RED_NINE1 = new Card(Card.CardColor.RED, Card.CardNumber.NINE, "Red 10");
            drawPile.add(RED_NINE1);
            Card RED_SKIP1 = new Card(Card.CardColor.RED, Card.CardAction.SKIP, "Red Skip");
            drawPile.add(RED_SKIP1);
            Card RED_REVERSE1 = new Card(Card.CardColor.RED, Card.CardAction.REVERSE, "Red Reverse");
            drawPile.add(RED_REVERSE1);
            Card RED_DRAWTWO1 = new Card(Card.CardColor.RED, Card.CardAction.DRAW_TWO, "Red Draw Two");
            drawPile.add(RED_DRAWTWO1);
            Card RED_ONE2 = new Card(Card.CardColor.RED, Card.CardNumber.ONE, "Red 1");
            drawPile.add(RED_ONE2);
            Card RED_TWO2= new Card(Card.CardColor.RED, Card.CardNumber.TWO, "Red 2");
            drawPile.add(RED_TWO2);
            Card RED_THREE2 = new Card(Card.CardColor.RED, Card.CardNumber.THREE, "Red 3");
            drawPile.add(RED_THREE2);
            Card RED_FOUR2 = new Card(Card.CardColor.RED, Card.CardNumber.FOUR, "Red 4");
            drawPile.add(RED_FOUR2);
            Card RED_FIVE2 = new Card(Card.CardColor.RED, Card.CardNumber.FIVE, "Red 5");
            drawPile.add(RED_FIVE2);
            Card RED_SIX2 = new Card(Card.CardColor.RED, Card.CardNumber.SIX, "Red 6");
            drawPile.add(RED_SIX2);
            Card RED_SEVEN2 = new Card(Card.CardColor.RED, Card.CardNumber.SEVEN, "Red 7");
            drawPile.add(RED_SEVEN2);
            Card RED_EIGHT2 = new Card(Card.CardColor.RED, Card.CardNumber.EIGHT, "Red 8");
            drawPile.add(RED_EIGHT2);
            Card RED_NINE2 = new Card(Card.CardColor.RED, Card.CardNumber.NINE, "Red 9");
            drawPile.add(RED_NINE2);
            Card RED_SKIP2 = new Card(Card.CardColor.RED, Card.CardAction.SKIP, "Red Skip");
            drawPile.add(RED_SKIP2);
            Card RED_REVERSE2 = new Card(Card.CardColor.RED, Card.CardAction.REVERSE, "Red Reverse");
            drawPile.add(RED_REVERSE2);
            Card RED_DRAWTWO2 = new Card(Card.CardColor.RED, Card.CardAction.DRAW_TWO, "Red Draw Two");
            drawPile.add(RED_DRAWTWO2);

            // Generates YELLOW Cards

            Card YELLOW_ZERO = new Card(Card.CardColor.YELLOW, Card.CardNumber.ZERO, "Yellow 0");
            drawPile.add(YELLOW_ZERO);
            Card YELLOW_ONE1 = new Card(Card.CardColor.YELLOW, Card.CardNumber.ONE, "Yellow 1");
            drawPile.add(YELLOW_ONE1);
            Card YELLOW_TWO1 = new Card(Card.CardColor.YELLOW, Card.CardNumber.TWO, "Yellow 2");
            drawPile.add(YELLOW_TWO1);
            Card YELLOW_THREE1 = new Card(Card.CardColor.YELLOW, Card.CardNumber.THREE, "Yellow 3");
            drawPile.add(YELLOW_THREE1);
            Card YELLOW_FOUR1 = new Card(Card.CardColor.YELLOW, Card.CardNumber.FOUR, "Yellow 4");
            drawPile.add(YELLOW_FOUR1);
            Card YELLOW_FIVE1 = new Card(Card.CardColor.YELLOW, Card.CardNumber.FIVE, "Yellow 5");
            drawPile.add(YELLOW_FIVE1);
            Card YELLOW_SIX1 = new Card(Card.CardColor.YELLOW, Card.CardNumber.SIX, "Yellow 6");
            drawPile.add(YELLOW_SIX1);
            Card YELLOW_SEVEN1 = new Card(Card.CardColor.YELLOW, Card.CardNumber.SEVEN, "Yellow 7");
            drawPile.add(YELLOW_SEVEN1);
            Card YELLOW_EIGHT1 = new Card(Card.CardColor.YELLOW, Card.CardNumber.EIGHT, "Yellow 8");
            drawPile.add(YELLOW_EIGHT1);
            Card YELLOW_NINE1 = new Card(Card.CardColor.YELLOW, Card.CardNumber.NINE, "Yellow 9");
            drawPile.add(YELLOW_NINE1);
            Card YELLOW_SKIP1 = new Card(Card.CardColor.YELLOW, Card.CardAction.SKIP, "Yellow Skip");
            drawPile.add(YELLOW_SKIP1);
            Card YELLOW_REVERSE1 = new Card(Card.CardColor.YELLOW, Card.CardAction.REVERSE, "Yellow Reverse");
            drawPile.add(YELLOW_REVERSE1);
            Card YELLOW_DRAWTWO1 = new Card(Card.CardColor.YELLOW, Card.CardAction.DRAW_TWO, "Yellow Draw Two");
            drawPile.add(YELLOW_DRAWTWO1);
            Card YELLOW_ONE2 = new Card(Card.CardColor.YELLOW, Card.CardNumber.ONE, "Yellow 1");
            drawPile.add(YELLOW_ONE2);
            Card YELLOW_TWO2 = new Card(Card.CardColor.YELLOW, Card.CardNumber.TWO, "Yellow 2");
            drawPile.add(YELLOW_TWO2);
            Card YELLOW_THREE2 = new Card(Card.CardColor.YELLOW, Card.CardNumber.THREE, "Yellow 3");
            drawPile.add(YELLOW_THREE2);
            Card YELLOW_FOUR2 = new Card(Card.CardColor.YELLOW, Card.CardNumber.FOUR, "Yellow 4");
            drawPile.add(YELLOW_FOUR2);
            Card YELLOW_FIVE2 = new Card(Card.CardColor.YELLOW, Card.CardNumber.FIVE, "Yellow 5");
            drawPile.add(YELLOW_FIVE2);
            Card YELLOW_SIX2 = new Card(Card.CardColor.YELLOW, Card.CardNumber.SIX, "Yellow 6");
            drawPile.add(YELLOW_SIX2);
            Card YELLOW_SEVEN2 = new Card(Card.CardColor.YELLOW, Card.CardNumber.SEVEN, "Yellow 7");
            drawPile.add(YELLOW_SEVEN2);
            Card YELLOW_EIGHT2 = new Card(Card.CardColor.YELLOW, Card.CardNumber.EIGHT, "Yellow 8");
            drawPile.add(YELLOW_EIGHT2);
            Card YELLOW_NINE2 = new Card(Card.CardColor.YELLOW, Card.CardNumber.NINE, "Yellow 9");
            drawPile.add(YELLOW_NINE2);
            Card YELLOW_SKIP2 = new Card(Card.CardColor.YELLOW, Card.CardAction.SKIP, "Yellow Skip");
            drawPile.add(YELLOW_SKIP2);
            Card YELLOW_REVERSE2 = new Card(Card.CardColor.YELLOW, Card.CardAction.REVERSE, "Yellow Reverse");
            drawPile.add(YELLOW_REVERSE2);
            Card YELLOW_DRAWTWO2 = new Card(Card.CardColor.YELLOW, Card.CardAction.DRAW_TWO, "Yellow Draw Two");
            drawPile.add(YELLOW_DRAWTWO2);

            // Generates GREEN Cards

            Card GREEN_ZERO = new Card(Card.CardColor.GREEN, Card.CardNumber.ZERO, "Green 0");
            drawPile.add(GREEN_ZERO);
            Card GREEN_ONE1 = new Card(Card.CardColor.GREEN, Card.CardNumber.ONE, "Green 1");
            drawPile.add(GREEN_ONE1);
            Card GREEN_TWO1 = new Card(Card.CardColor.GREEN, Card.CardNumber.TWO, "Green 2");
            drawPile.add(GREEN_TWO1);
            Card GREEN_THREE1 = new Card(Card.CardColor.GREEN, Card.CardNumber.THREE, "Green 3");
            drawPile.add(GREEN_THREE1);
            Card GREEN_FOUR1 = new Card(Card.CardColor.GREEN, Card.CardNumber.FOUR, "Green 4");
            drawPile.add(GREEN_FOUR1);
            Card GREEN_FIVE1 = new Card(Card.CardColor.GREEN, Card.CardNumber.FIVE, "Green 5");
            drawPile.add(GREEN_FIVE1);
            Card GREEN_SIX1 = new Card(Card.CardColor.GREEN, Card.CardNumber.SIX, "Green 6");
            drawPile.add(GREEN_SIX1);
            Card GREEN_SEVEN1 = new Card(Card.CardColor.GREEN, Card.CardNumber.SEVEN, "Green 7");
            drawPile.add(GREEN_SEVEN1);
            Card GREEN_EIGHT1 = new Card(Card.CardColor.GREEN, Card.CardNumber.EIGHT, "Green 8");
            drawPile.add(GREEN_EIGHT1);
            Card GREEN_NINE1 = new Card(Card.CardColor.GREEN, Card.CardNumber.NINE, "Green 9");
            drawPile.add(GREEN_NINE1);
            Card GREEN_SKIP1 = new Card(Card.CardColor.GREEN, Card.CardAction.SKIP, "Green Skip");
            drawPile.add(GREEN_SKIP1);
            Card GREEN_REVERSE1 = new Card(Card.CardColor.GREEN, Card.CardAction.REVERSE, "Green Reverse");
            drawPile.add(GREEN_REVERSE1);
            Card GREEN_DRAWTWO1 = new Card(Card.CardColor.GREEN, Card.CardAction.DRAW_TWO, "Green Draw Two");
            drawPile.add(GREEN_DRAWTWO1);
            Card GREEN_ONE2 = new Card(Card.CardColor.GREEN, Card.CardNumber.ONE, "Green 1");
            drawPile.add(GREEN_ONE2);
            Card GREEN_TWO2 = new Card(Card.CardColor.GREEN, Card.CardNumber.TWO, "Green 2");
            drawPile.add(GREEN_TWO2);
            Card GREEN_THREE2 = new Card(Card.CardColor.GREEN, Card.CardNumber.THREE, "Green 3");
            drawPile.add(GREEN_THREE2);
            Card GREEN_FOUR2 = new Card(Card.CardColor.GREEN, Card.CardNumber.FOUR, "Green 4");
            drawPile.add(GREEN_FOUR2);
            Card GREEN_FIVE2 = new Card(Card.CardColor.GREEN, Card.CardNumber.FIVE, "Green 5");
            drawPile.add(GREEN_FIVE2);
            Card GREEN_SIX2 = new Card(Card.CardColor.GREEN, Card.CardNumber.SIX, "Green 6");
            drawPile.add(GREEN_SIX2);
            Card GREEN_SEVEN2 = new Card(Card.CardColor.GREEN, Card.CardNumber.SEVEN, "Green 7");
            drawPile.add(GREEN_SEVEN2);
            Card GREEN_EIGHT2 = new Card(Card.CardColor.GREEN, Card.CardNumber.EIGHT, "Green 8");
            drawPile.add(GREEN_EIGHT2);
            Card GREEN_NINE2 = new Card(Card.CardColor.GREEN, Card.CardNumber.NINE, "Green 9");
            drawPile.add(GREEN_NINE2);
            Card GREEN_SKIP2 = new Card(Card.CardColor.GREEN, Card.CardAction.SKIP, "Green Skip");
            drawPile.add(GREEN_SKIP2);
            Card GREEN_REVERSE2 = new Card(Card.CardColor.GREEN, Card.CardAction.REVERSE, "Green Reverse");
            drawPile.add(GREEN_REVERSE2);
            Card GREEN_DRAWTWO2 = new Card(Card.CardColor.GREEN, Card.CardAction.DRAW_TWO, "Green Draw Two");
            drawPile.add(GREEN_DRAWTWO2);

            // Generates BLUE Cards

            Card BLUE_ZERO = new Card(Card.CardColor.BLUE, Card.CardNumber.ZERO, "Blue 0");
            drawPile.add(BLUE_ZERO);
            Card BLUE_ONE1 = new Card(Card.CardColor.BLUE, Card.CardNumber.ONE, "Blue 1");
            drawPile.add(BLUE_ONE1);
            Card BLUE_TWO1 = new Card(Card.CardColor.BLUE, Card.CardNumber.TWO, "Blue 2");
            drawPile.add(BLUE_TWO1);
            Card BLUE_THREE1 = new Card(Card.CardColor.BLUE, Card.CardNumber.THREE, "Blue 3");
            drawPile.add(BLUE_THREE1);
            Card BLUE_FOUR1 = new Card(Card.CardColor.BLUE, Card.CardNumber.FOUR, "Blue 4");
            drawPile.add(BLUE_FOUR1);
            Card BLUE_FIVE1 = new Card(Card.CardColor.BLUE, Card.CardNumber.FIVE, "Blue 5");
            drawPile.add(BLUE_FIVE1);
            Card BLUE_SIX1 = new Card(Card.CardColor.BLUE, Card.CardNumber.SIX, "Blue 6");
            drawPile.add(BLUE_SIX1);
            Card BLUE_SEVEN1 = new Card(Card.CardColor.BLUE, Card.CardNumber.SEVEN, "Blue 7");
            drawPile.add(BLUE_SEVEN1);
            Card BLUE_EIGHT1 = new Card(Card.CardColor.BLUE, Card.CardNumber.EIGHT, "Blue 8");
            drawPile.add(BLUE_EIGHT1);
            Card BLUE_NINE1 = new Card(Card.CardColor.BLUE, Card.CardNumber.NINE, "Blue 9");
            drawPile.add(BLUE_NINE1);
            Card BLUE_SKIP1 = new Card(Card.CardColor.BLUE, Card.CardAction.SKIP, "Blue Skip");
            drawPile.add(BLUE_SKIP1);
            Card BLUE_REVERSE1 = new Card(Card.CardColor.BLUE, Card.CardAction.REVERSE, "Blue Reverse");
            drawPile.add(BLUE_REVERSE1);
            Card BLUE_DRAWTWO1 = new Card(Card.CardColor.BLUE, Card.CardAction.DRAW_TWO, "Blue Draw Two");
            drawPile.add(BLUE_DRAWTWO1);
            Card BLUE_ONE2 = new Card(Card.CardColor.BLUE, Card.CardNumber.ONE, "Blue 1");
            drawPile.add(BLUE_ONE2);
            Card BLUE_TWO2 = new Card(Card.CardColor.BLUE, Card.CardNumber.TWO, "Blue 2");
            drawPile.add(BLUE_TWO2);
            Card BLUE_THREE2 = new Card(Card.CardColor.BLUE, Card.CardNumber.THREE, "Blue 3");
            drawPile.add(BLUE_THREE2);
            Card BLUE_FOUR2 = new Card(Card.CardColor.BLUE, Card.CardNumber.FOUR, "Blue 4");
            drawPile.add(BLUE_FOUR2);
            Card BLUE_FIVE2 = new Card(Card.CardColor.BLUE, Card.CardNumber.FIVE, "Blue 5");
            drawPile.add(BLUE_FIVE2);
            Card BLUE_SIX2 = new Card(Card.CardColor.BLUE, Card.CardNumber.SIX, "Blue 6");
            drawPile.add(BLUE_SIX2);
            Card BLUE_SEVEN2 = new Card(Card.CardColor.BLUE, Card.CardNumber.SEVEN, "Blue 7");
            drawPile.add(BLUE_SEVEN2);
            Card BLUE_EIGHT2 = new Card(Card.CardColor.BLUE, Card.CardNumber.EIGHT, "Blue 8");
            drawPile.add(BLUE_EIGHT2);
            Card BLUE_NINE2 = new Card(Card.CardColor.BLUE, Card.CardNumber.NINE, "Blue 9");
            drawPile.add(BLUE_NINE2);
            Card BLUE_SKIP2 = new Card(Card.CardColor.BLUE, Card.CardAction.SKIP, "Blue Skip");
            drawPile.add(BLUE_SKIP2);
            Card BLUE_REVERSE2 = new Card(Card.CardColor.BLUE, Card.CardAction.REVERSE, "Blue Reverse");
            drawPile.add(BLUE_REVERSE2);
            Card BLUE_DRAWTWO2 = new Card(Card.CardColor.BLUE, Card.CardAction.DRAW_TWO, "Blue Draw Two");
            drawPile.add(BLUE_DRAWTWO2);

            // Generates WILD Cards

            Card WILD1 = new Card(Card.CardColor.ALL, Card.CardAction.WILD, "WILD!");
            drawPile.add(WILD1);
            Card WILD2 = new Card(Card.CardColor.ALL, Card.CardAction.WILD, "WILD!");
            drawPile.add(WILD2);
            Card WILD3 = new Card(Card.CardColor.ALL, Card.CardAction.WILD, "WILD!");
            drawPile.add(WILD3);
            Card WILD4 = new Card(Card.CardColor.ALL, Card.CardAction.WILD, "WILD!");
            drawPile.add(WILD4);

            // Generates DRAW FOUR Cards

            Card WILD_DRAW1 = new Card(Card.CardColor.ALL, Card.CardAction.WILD_DRAW, "WILD DRAW FOUR!");
            drawPile.add(WILD_DRAW1);
            Card WILD_DRAW2 = new Card(Card.CardColor.ALL, Card.CardAction.WILD_DRAW, "WILD DRAW FOUR!");
            drawPile.add(WILD_DRAW2);
            Card WILD_DRAW3 = new Card(Card.CardColor.ALL, Card.CardAction.WILD_DRAW, "WILD DRAW FOUR!");
            drawPile.add(WILD_DRAW3);
            Card WILD_DRAW4 = new Card(Card.CardColor.ALL, Card.CardAction.WILD_DRAW, "WILD DRAW FOUR!");
            drawPile.add(WILD_DRAW4);

            return true;


        } catch (Exception e) {

            return false;

        }

    }

    public boolean shuffleDeck() {

        //System.out.println("Inside of shuffleDeck()");
        //System.out.println("Draw Pile Size: " + drawPile.getLength());

        try {

        //int index = 1;

            for (int i = drawPile.getLength() - 1; i > 0; i--) {

                if (i == 1) {

                    break;

                }

                int randomNumber = (int) (Math.random() * (drawPile.getLength() + 1)) + 2;
                //System.out.println("Random Number: " + randomNumber);
                Card temporaryCard = (Card) drawPile.getEntry(i);
                //System.out.println("Temporary Card: " + temporaryCard.getName());
                Card currentCard = (Card) drawPile.getEntry(randomNumber);
                //System.out.println("Current Card: " + currentCard.getName());
                drawPile.replace(i, drawPile.getEntry(randomNumber));
                //System.out.println("Cards switched");
                drawPile.replace(randomNumber, temporaryCard);

            }

            discardPile.add(drawPile.getEntry(1));

            return true;

        } catch (Exception e) {

            return false;

        }

    }

    public boolean deal() {

        int amountToDeal = players.size() * 9;
        System.out.println("Amount of cards to deal: " + amountToDeal);
        int playerIndex = 0;

        try {

            for (int i = 0; i <= amountToDeal; i++) {

                if (playerIndex == players.size()) {

                    playerIndex = 0;
//                    System.out.println("Player rotation reset");

                }

//                System.out.println("#" + i);

                Player player = players.get(playerIndex);
                System.out.println("To " + player.getName());
                if (drawPile.getEntry(1) == null) {

                    drawPile.remove(1);

                    Card givenCard = (Card) drawPile.getEntry(1);
//                    System.out.println("Card being given: " + givenCard.getName());
                    player.drawCard(drawPile.remove(1));
                    players.set(playerIndex, player);

                    System.out.println("Card passed");

                    System.out.println();

                    playerIndex++;

                    Thread.sleep(500);


                }

                else {

                    Card givenCard = (Card) drawPile.getEntry(1);
//                    System.out.println("Card being given: " + givenCard.getName());
                    player.drawCard(drawPile.remove(1));
                    players.set(playerIndex, player);

                    System.out.println("Card passed");

                    System.out.println();

                    playerIndex++;

                    Thread.sleep(500);

                }

            }

            return true;

        } catch (Exception e) {

            return false;

        }

    }

    public void setPlayerRotation(String playerRotation) {

        this.playerRotation = playerRotation;

    }

    public String getPlayerRotation() {

        return playerRotation;

    }

    public void setPlayerPosition(int position) {

        this.playerPosition = position;

    }

    public boolean setDiscardPile(CardDeck cards) {

        try {

            this.drawPile = cards;
            return true;

        }

        catch (Exception e) {

            return false;

        }

    }

    public boolean playCard(Card card) {

        if (discardPile.isEmpty()) {

            try {

                discardPile.add(card);
                return true;

            } catch (Exception e) {

                return false;

            }

        }

        Card topCard = (Card) discardPile.getEntry(1);

        Card.CardColor topCardColor = topCard.getColor();

        System.out.println(topCardColor);

        Card.CardNumber topCardNumber = topCard.getNumber();

        System.out.println(topCardNumber);

        Card.CardAction topCardAction = topCard.getAction();

        System.out.println(topCardAction);

        if (topCardAction.equals(Card.CardAction.WILD) || topCardAction.equals(Card.CardAction.WILD_DRAW)) {

            discardPile.add(card);

            return true;

        }

        if (topCardColor.equals(card.getColor()) || topCardNumber.equals(card.getNumber()) || topCardAction.equals(card.getAction())) {

            try {

                discardPile.add(card);

                if (card.getAction().equals(Card.CardAction.SKIP)) {

                    skip();

                }

                if (card.getAction().equals(Card.CardAction.REVERSE)) {

                    reverse();

                }

                if (card.getAction().equals(Card.CardAction.DRAW_TWO)) {

                    drawTwo();

                }

                return true;

            } catch (Exception e) {

                return false;

            }

        }

        else if (card.getAction().equals(Card.CardAction.WILD) || card.getAction().equals(Card.CardAction.WILD_DRAW)) {

            try {

                Thread.sleep(1000);

                System.out.println("\nWILD!");

                Scanner keyboard = new Scanner(System.in);

                System.out.println("Which color would you like to change to?");
                System.out.println("Choices: RED, YELLOW, BLUE, GREEN\n");

                String colorToChange = keyboard.nextLine();

                if (colorToChange.equals("RED")) {

                    gameStateColor = Card.CardColor.RED;

                    System.out.println("Color has been changed to RED!\n");

                }

                else if (colorToChange.equals("YELLOW")) {

                    gameStateColor = Card.CardColor.YELLOW;

                    System.out.println("Color has been changed to YELLOW!\n");

                }

                else if (colorToChange.equals("BLUE")) {

                    gameStateColor = Card.CardColor.BLUE;

                    System.out.println("Color has been changed to BLUE!\n");

                }

                else if (colorToChange.equals("GREEN")) {

                    gameStateColor = Card.CardColor.GREEN;

                    System.out.println("Color has been changed to GREEN!\n");

                }

                else {

                    System.out.println("Not a valid color, you lose the chance to change the color.\n");

                }

                discardPile.add(card);
                return true;

            } catch (Exception e) {

                return false;

            }

        }

        else {

            return false;

        }

    }

    public boolean drawCard(Player currentPlayer) {

        try {

            if (players.contains(currentPlayer)) {

                Card newCard = (Card) drawPile.remove(0);

                CardDeck currentPlayerHand = currentPlayer.getCards();

                currentPlayerHand.add(newCard);

                currentPlayer.setCards((PlayerHand)currentPlayerHand);

                int index = players.indexOf(currentPlayer);

                players.set(index, currentPlayer);

                return true;

            }

            else {

                return false;

            }



        } catch (Exception e) {

            return false;

        }

    }

    public Player rotate() {

        if (players.get(playerPosition).equals(players.get(players.size() - 1))) {

            setPlayerPosition(0);
            return players.get(0);

        }

        this.playerPosition = playerPosition + 1;
        return players.get(playerPosition);

    }

    public Player rotateReverse() {

        if (players.get(playerPosition).equals(players.get(0))) {

            setPlayerPosition(players.size() - 1);
            return players.get(players.size() - 1);

        }

        this.playerPosition = playerPosition - 1;
        return players.get(playerPosition);

    }

    public Player reverse() {

        try {

            this.playerRotation = "counterclockwise";

            Player nextPlayer = rotateReverse();

            return nextPlayer;

        } catch (Exception e) {

            return null;

        }

    }

    public Player skip() {

        try {

            Player nextPlayer = rotate();
            nextPlayer = rotate();

            return nextPlayer;

        } catch (Exception e) {

            return null;

        }

    }

    public Player drawTwo() {

        try {

            Player targetPlayer = players.get(playerPosition + 1);

            targetPlayer.drawCard(drawPile.remove(0));
            targetPlayer.drawCard(drawPile.remove(0));

            return targetPlayer;

        } catch (Exception e) {

            return null;

        }

    }

    public boolean wild(Card.CardColor color) {

        try {

            this.gameStateColor = color;

            return true;

        } catch (Exception e) {

            return false;

        }

    }

    public boolean wildDraw(Card.CardColor color) {

        try {

            this.gameStateColor = color;

            drawTwo();
            drawTwo();

            return true;

        } catch (Exception e) {

            return false;

        }

    }

    public Card topCard() {

        if (discardPile.isEmpty()) {

            System.out.println("About to return null in topCard()");

            return null;

        }

        return (Card) discardPile.getEntry(1);

    }

    public void printDeck() {

        drawPile.display();

    }

}
