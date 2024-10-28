package dev.t3d.kata.bowling;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FrameTest {

    @Test
    void should_create_frame_with_first_roll() {
        // given
        var frame = new Frame(new RollValue(9));
        //when
        int actualFirstRollValue = frame.getFirstRoll();

        //then
        Assertions.assertThat(actualFirstRollValue)
                .as("Check that the first roll value has been set")
                .isEqualTo(9);// I prefer write the expectd value

    }

    @Test
    void should_frame_contain_two_roll() {
        // given
        var frame = new Frame(new RollValue(9));
         frame.addSecondRollValue(new RollValue(0));

        //when
        int actualFirstRollValue = frame.getSecondRollValue();
        //then
        Assertions.assertThat(actualFirstRollValue)
                .as("Check that the first second value has been set")
                .isEqualTo(0);// I prefer write the expectd value

    }

}
