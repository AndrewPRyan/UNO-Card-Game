package com.company;

/**
 * Created by andrewryan on 3/5/16.
 */
public class Card {

    public enum CardColor {

        RED, YELLOW, GREEN, BLUE, ALL;

    }

    public enum CardNumber {

        ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE;

    }

    public enum CardAction {

        SKIP, REVERSE, DRAW_TWO, WILD, WILD_DRAW;

    }

    private CardColor color;
    private CardNumber number;
    private CardAction action;
    private String cardName;

    Card(CardColor color, CardNumber number, String cardName) {

        this.color = color;
        this.number = number;
        this.cardName = cardName;

    }

    Card(CardColor color, CardAction action, String cardName) {

        this.color = color;
        this.action = action;
        this.cardName = cardName;

    }

    public CardColor getColor() {

        return color;

    }


    public CardNumber getNumber() {

        return number;

    }

    public CardAction getAction() {

        return action;

    }

    public String getColorName() {

        return color.toString();

    }


    public String getNumberDigit() {

        return number.toString();

    }

    public String getActionName() {

        return action.toString();

    }


    public String getName() {

        return this.cardName;

    }

}
