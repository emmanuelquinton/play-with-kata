package dev.t3d.kata.bowling;

import java.util.ArrayList;
import java.util.List;

public class FrameList {

    private final List<Frame> frames;

    public FrameList() {
        this.frames = new ArrayList<>();
    }

    public void add(Frame frame) {
        //Check if previous frame is a spare and if add the first roll value of the new frame as bonus spare to the pervious frame
        addBonusValueToPreviousFrameIfSpare(frame);
        if(this.frames.size() < 10 ) {
            this.frames.add(frame);
        }
    }

    private void addBonusValueToPreviousFrameIfSpare(Frame frame) {
        if (frames.size() > 0) {
            var previousFrame = this.frames.getLast();
            if (previousFrame != null && previousFrame.isSpare()) {
                previousFrame.addBonusSpareValue(new RollValue(frame.getFirstRollValue()));
            }
        }
    }

    public int size() {
        return this.frames.size();
    }

    public int result() {
        return frames.stream().mapToInt(Frame::sum).sum();
    }
}
