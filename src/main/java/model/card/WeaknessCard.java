package model.card;

import model.card.behavior.*;

public class WeaknessCard implements Card{

    ActionActivationBehavior actionActivationBehavior;
    EnemyBehavior enemyBehavior;
    MoveBehavior moveBehavior;
    OpenedBehavior openedBehavior;
    RequiredBehavior requiredBehavior;

    public void performAction() {

        actionActivationBehavior.actionActivation();
    }

    public void performEnemy() {

        enemyBehavior.enemy();
    }

    public void performMove() {

        moveBehavior.move();
    }

    public void performOpened() {

        openedBehavior.opened();
    }

    public void performRequired() {

        requiredBehavior.required();
    }

    public boolean haveActionBehavior() {

        return actionActivationBehavior != null;
    }

    public boolean haveEnemyBehavior() {

        return enemyBehavior != null;
    }

    public boolean haveMoveBehavior() {

        return moveBehavior != null;
    }

    public boolean haveOpenedBehavior() {

        return openedBehavior != null;
    }

    public boolean haveRequiredBehavior() {

        return requiredBehavior != null;
    }

    public void setActionBehavior(ActionActivationBehavior actionActivationBehavior) {
        this.actionActivationBehavior = actionActivationBehavior;
    }

    public void setEnemyBehavior(EnemyBehavior enemyBehavior) {
        this.enemyBehavior = enemyBehavior;
    }

    public void setMoveBehavior(MoveBehavior moveBehavior) {
        this.moveBehavior = moveBehavior;
    }

    public void setOpenedBehavior(OpenedBehavior openedBehavior) {
        this.openedBehavior = openedBehavior;
    }

    public void setRequiredBehavior(RequiredBehavior requiredBehavior) {
        this.requiredBehavior = requiredBehavior;
    }
}
