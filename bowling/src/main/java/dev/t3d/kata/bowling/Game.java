package dev.t3d.kata.bowling;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Game {
    private List<Frame> frames;

    public Game() {
        this.frames = new ArrayList<>();
    }

    public int result() {
    return frames.stream().mapToInt(Frame::sum).sum();
    }

    public void addFrame(Frame frame) {
        this.frames.add(frame);
    }

    public List<Frame> getFrames() {
        return this.frames;
    }


}
