package model.component.tokens;

public class DamageToken {

    TokenImage image;
    int Value;

    public DamageToken(int value) {
        Value = value;
    }

    public int getValue() {
        return Value;
    }
}
