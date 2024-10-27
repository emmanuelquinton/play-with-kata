package dev.t3d.kata.bowling;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Frame> frames;

    public Game() {
        this.frames = new ArrayList<>();
    }

    public int result() {
        return 0;
    }

    public void addFrame(Frame frame) {
        this.frames.add(frame);
    }

    public List<Frame> getFrames() {
        return this.frames;
    }
}
