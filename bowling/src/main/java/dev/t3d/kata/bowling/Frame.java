package dev.t3d.kata.bowling;

public class Frame {

    private final RollValue fisrtRollValue;

    public Frame(RollValue firstRollValue) {
        this.fisrtRollValue = firstRollValue;
    }

    public int getFirstRoll() {
        return this.fisrtRollValue.getValue();
    }
}
