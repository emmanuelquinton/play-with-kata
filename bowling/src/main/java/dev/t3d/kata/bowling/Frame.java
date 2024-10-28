package dev.t3d.kata.bowling;

public class Frame {

    private final RollValue fisrtRollValue;
    private  RollValue secondtRollValue;

    public Frame(RollValue firstRollValue) {
        this.fisrtRollValue = firstRollValue;
    }

    public int getFirstRoll() {
        return this.fisrtRollValue.getValue();
    }

    public void addSecondRollValue(RollValue secondRollValue) {
        this.secondtRollValue = secondRollValue;
    }

    public int getSecondRollValue() {
        return secondtRollValue.getValue();
    }
}
