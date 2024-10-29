package dev.t3d.kata.bowling;

public class Frame {

    private final RollValue fisrtRollValue;
    private RollValue secondRollValue;

    private boolean isSpare;

    public Frame(RollValue firstRollValue) {
        this.fisrtRollValue = firstRollValue;
    }

    public int getFirstRoll() {
        return this.fisrtRollValue.getValue();
    }

    public void addSecondRollValue(RollValue secondRollValue) {

        this.secondRollValue = secondRollValue;
        defineIfisSpare();
    }

    private void defineIfisSpare() {
        if (this.sum() == 10) {
            this.isSpare = true;
        }
    }

    public int getSecondRollValue() {
        return secondRollValue.getValue();
    }

    public int sum() {
        return fisrtRollValue.getValue() + ((secondRollValue != null) ? secondRollValue.getValue() : 0);
    }

    public boolean isSpare() {
        return this.isSpare;
    }
}
