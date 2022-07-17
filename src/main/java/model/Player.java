package model;

import model.card.*;
import model.card.eventCards.EventCard;

import java.util.List;

public class Player {

    PlayerCardsDeck cardDeck;
    PlayerCardsDeck cardDrop;

    List<EventCard> eventCards;
    List<SkillCard> skillCards;
    List<WeaknessCard> weaknessCards;


    int resources;
    int evidence;

    public void addResources(int size){

        resources += size;
    }


}
