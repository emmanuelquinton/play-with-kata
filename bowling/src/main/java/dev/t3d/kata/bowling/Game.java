package dev.t3d.kata.bowling;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Game {
    private FrameList frames;

    public Game() {
        this.frames = new FrameList();
    }

    public int result() {
    return frames.result();
    }

    public void addFrame(Frame frame) {
        this.frames.add(frame);
    }

    FrameList getFrames() {
        return this.frames;
    }


}
