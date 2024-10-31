package dev.t3d.kata.bowling;

public class Frame {

    private final RollValue fisrtRollValue;
        private  boolean isStrike;
    private RollValue secondRollValue;

    private boolean isSpare;
    private RollValue bonusSpareValue;
    private RollValue bonusStrikeValue;



    public Frame(RollValue firstRollValue) {
        this.fisrtRollValue = firstRollValue;
        defineIfisStrike();
    }

    private void defineIfisStrike() {
        this.isStrike = (this.fisrtRollValue.getValue() == 10);
    }

    public int getFirstRollValue() {
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
        var frameValue = fisrtRollValue.getValue() + ((secondRollValue != null) ? secondRollValue.getValue() : 0);
        if(this.isSpare) {
            return frameValue + this.bonusSpareValue.getValue();
        }
        if(this.isStrike && this.bonusStrikeValue != null ) {
            return frameValue + this.bonusStrikeValue.getValue();
        }
        return frameValue;
    }

    public boolean isSpare() {
        return this.isSpare;
    }

    public void addBonusSpareValue(RollValue bonusSpareValue) {
        this.bonusSpareValue = bonusSpareValue;
    }


    public boolean isStrike() {
        return this.isStrike;
    }

    public void addBonusStrikesValue(int sum) {

        if(bonusStrikeValue != null) {
             sum = this.bonusStrikeValue.getValue() + sum;
        }

        this.bonusStrikeValue = new RollValue(sum);

    }
}
