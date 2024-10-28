package dev.t3d.kata.bowling;

public class Frame {

    private final Integer value;

    public Frame(Integer value) {
        this.value = value;
    }

    public int getFirstRoll() {
        return this.value;
    }
}
