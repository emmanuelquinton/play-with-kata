package dev.t3d.kata.bowling;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {
    @Test
    void should_frame_could_be_added_to_game() {
        //given
        Frame frame = new Frame(new RollValue(9));
        var game = new Game();

        //when
        game.addFrame(frame);

        //then
        Assertions.assertThat(game.getFrames())
                .as("Check that the frame has been added")
                .hasSize(1);
    }
}
