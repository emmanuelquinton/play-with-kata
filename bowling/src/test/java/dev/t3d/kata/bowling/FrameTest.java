package dev.t3d.kata.bowling;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FrameTest {

    @Test
    void should_create_frame_with_first_roll() {
        // given
        var frame = new Frame(new RollValue(9));
        //when
        int actualFirstRollValue = frame.getFirstRollValue();

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

    @Test
    void should_sum_frame_rolls() {
        //given
        var frame = new Frame(new RollValue(6));
        frame.addSecondRollValue(new RollValue(3));

        //when
        int actualSum = frame.sum();


        //then
        Assertions.assertThat(actualSum)
                .as("Check that the sum of rolls is 9")
                .isEqualTo(9);
    }

    @Test
    void should_frame_is_spaire(){
        //given
        var frame = new Frame(new RollValue(5));
        frame.addSecondRollValue(new RollValue(5));

        //when
        var actualIsSpareValue = frame.isSpare();

        //then
        Assertions.assertThat(actualIsSpareValue)
                .as("Check that the frame is a spare")
                .isTrue();
    }

    @Test
    void should_frame_sum_is_15_when_spare_and_bonus_ball_is_5() {
        //given
        var frame = new Frame(new RollValue(5));
        frame.addSecondRollValue(new RollValue(5));
        frame.addBonusSpareValue(new RollValue(5));

        //when
        var actualSum = frame.sum();

        //then
        Assertions.assertThat(actualSum)
                .as("Check that the sum is 15")
                .isEqualTo(15);
    }


    @Test
    void should_frame_is_strike(){
        //given
        var frame = new Frame(new RollValue(10));


        //when
        var actualIsSpareValue = frame.isStrike();

        //then
        Assertions.assertThat(actualIsSpareValue)
                .as("Check that the frame is a strike")
                .isTrue();
    }

    @Test
    void should_frame_sum_is_30_when_3_strikes() {
        //given
        var frame = new Frame(new RollValue(10));
        frame.addBonusStrikesValue(10);
        frame.addBonusStrikesValue(10);

        //when
        var actualSum = frame.sum();

        //then
        Assertions.assertThat(actualSum)
                .as("Check that the sum is 15")
                .isEqualTo(30);
    }

}
