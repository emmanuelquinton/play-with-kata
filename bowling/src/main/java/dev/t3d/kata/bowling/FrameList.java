package dev.t3d.kata.bowling;

import java.util.ArrayList;
import java.util.List;

public class FrameList {

    private final List<Frame> frames;

    public FrameList() {
        this.frames = new ArrayList<>();
    }

    public void add(Frame frame) {
        this.frames.add(frame);
    }

    public int size() {
        return this.frames.size();
    }

    public int result() {
        return frames.stream().mapToInt(Frame::sum).sum();
    }
}
