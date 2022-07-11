package model;

import model.component.cards.scenario.EnemyCard;
import model.scenario.Sets;

import java.util.ArrayList;

public class Enemy {

    EnemyCard card;

    int fightValue;
    int health;
    int evade;

    int damage;
    int horror;

    int victoryPoints;
    Sets set;

    ArrayList<String> attributes;

    Location spawn;
    Player pray;

}

