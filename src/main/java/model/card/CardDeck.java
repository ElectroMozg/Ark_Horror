package model.card;

import model.Game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class CardDeck {

    Stack<Card> deck = new Stack<>();

    public boolean isEmpty() {

        return deck.empty();
    }

    public Card getCard() {

        return deck.pop();
    }

    public void setCard(Card card) {

        deck.push(card);
    }
    public List<Card> getSeveralCards(int size) {

        List<Card> cards = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            if (!this.isEmpty()) {
                cards.add(deck.pop());
            }
        }
        return cards;
    }

    public void setSeveralCards(List<Card> cards, int size){

        for (int i = 0; i < size; i++) {
            deck.push(cards.get(i));
        }
    }

    public void shuffleDeck(){

        Collections.shuffle(deck);
    }

    public int getSizeDeck(){

        return deck.size();
    }
}
