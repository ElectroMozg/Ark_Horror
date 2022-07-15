package model.card;

import model.card.atribute.Skills;
import model.card.behavior.MoveBehavior;
import model.card.behavior.PostTestBehavior;
import model.card.behavior.TestBehavior;

public class SkillCard implements Card {

    private Skills skills;

    TestBehavior testBehavior;
    PostTestBehavior postTestBehavior;

    public void performTest() {

        testBehavior.test();
    }

    public void performPostTest() {

        postTestBehavior.postTest();
    }

    boolean haveTestBehavior() {

        return testBehavior != null;
    }

    boolean havePostTestBehavior() {

        return postTestBehavior != null;
    }

    public void setTestBehavior(TestBehavior testBehavior) {
        this.testBehavior = testBehavior;
    }

    public void setPostTestBehavior(PostTestBehavior postTestBehavior) {
        this.postTestBehavior = postTestBehavior;
    }
}
