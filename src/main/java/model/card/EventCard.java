package model.card;

import model.card.atribute.Skills;
import model.card.behavior.EscapeBehavior;
import model.card.behavior.MoveBehavior;
import model.card.behavior.UseBehavior;

public class EventCard implements Card {

    private int price;
    private int level;
    private Skills skills;

    UseBehavior useBehavior;
    EscapeBehavior escapeBehavior;

    private void performUseBehavior() {

        useBehavior.use();
    }

    private void performEscapeBehavior() {

        escapeBehavior.escape();
    }

    private boolean haveUseBehavior() {

        return useBehavior != null;
    }

    private boolean haveEscapeBehavior() {

        return escapeBehavior != null;
    }

    public void setUseBehavior(UseBehavior useBehavior) {
        this.useBehavior = useBehavior;
    }

    public void setEscapeBehavior(EscapeBehavior escapeBehavior) {
        this.escapeBehavior = escapeBehavior;
    }
}
