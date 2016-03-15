package com.company;

/**
 * Created by andrewryan on 3/9/16.
 */
public class Player {

    private String name;
    private PlayerHand cards;
    private boolean isDealer;

    Player(String name) {

        this.name = name;
        this.cards = new PlayerHand();
        this.isDealer = false;

    }

    public boolean placeCard(Object card) {

        if (cards.isEmpty()) {

            return false;

        }

        if (cards.contains(card)) {

            if (cards.getEntry(0).equals(card)) {

                cards.remove(0);

            }

            else {

                for (int i = 1; i <= cards.getLength(); i++) {

                    if (cards.getEntry(i).equals(card)) {

                        cards.remove(i);

                        return true;

                    }

                }

            }

        }

        return false;

    }

    public boolean drawCard(Object card) {

        try {

            cards.add(card);
            return true;

        } catch (Exception e) {

            return false;

        }


    }

    public void makeDealer() {

        this.isDealer = true;

    }

    public void setCards(PlayerHand cards) {

        this.cards = cards;

    }

    public CardDeck getCards() {

        CardDeck<Card> hand = new CardDeck<>();

        for (int i = 1; i < cards.getLength() - 1; i++) {

            hand.add(cards.getEntry(i));

        }

        return hand;

    }

    public boolean isDealer() {

        return isDealer;

    }

    public void setName(String name) {

        this.name = name;

    }

    public String getName() {

        return name;

    }
}
