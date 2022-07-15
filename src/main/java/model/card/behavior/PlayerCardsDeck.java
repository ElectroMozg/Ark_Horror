package model.card.behavior;

import model.card.*;

import java.util.List;

public class PlayerCardsDeck extends CardDeck{



    public boolean haveEventCard(){

        List<Card> cards = getSeveralCards(getSizeDeck());

        for (Card card : cards) {

            if(card instanceof EventCard){
                return true;
            }
        }
        return false;
    }

    public boolean haveSkillCard(){

        List<Card> cards = getSeveralCards(getSizeDeck());

        for (Card card : cards) {

            if(card instanceof SkillCard){
                return true;
            }
        }
        return false;
    }

    public boolean haveWeaknessCard(){

        List<Card> cards = getSeveralCards(getSizeDeck());

        for (Card card : cards) {

            if(card instanceof WeaknessCard){
                return true;
            }
        }
        return false;
    }

}
