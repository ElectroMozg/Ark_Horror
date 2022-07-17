package model.card.eventCards;

import model.GameObjects;
import model.card.eventCards.EventCard;
import model.card.behavior.UseBehavior;


public class EmergencyCache extends EventCard {

    @Override
    public void setUseBehavior(UseBehavior useBehavior) {
        super.setUseBehavior(new EmergencyCacheUseImp());
    }
    
    class EmergencyCacheUseImp extends GameObjects implements UseBehavior {

        @Override
        public void use() {
            currentPlayer.addResources(3);
        }
    }
}


