package dev.t3d.kata.bowling;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameAcceptanceTest {


    @Test
    void should_give_result_when_no_strike_nor_spaire() {
        // given
        var game = new Game();

        for(int rollIndex = 0; rollIndex <10; rollIndex++) {
            var frame = new Frame(new RollValue(9));
            frame.addSecondRollValue(new RollValue(0));
            game.addFrame(frame);
        }

        // when
        var actualScore = game.result();

        // then
        Assertions.assertThat(actualScore)
                .as("Check that the score, when there are 20 rolls 10 pairs of 9 and miss")
                .isEqualTo(90);
    }

    @Test
    void should_give_result_when_only_spaire() {
        // given
        var game = new Game();

        for(int rollIndex = 0; rollIndex <10; rollIndex++) {
            var frame = new Frame(new RollValue(5));
            frame.addSecondRollValue(new RollValue(5));
            game.addFrame(frame);
        }

        game.addFrame( new Frame(new RollValue(5)));
        // when
        var actualScore = game.result();

        // then
        Assertions.assertThat(actualScore)
                .as("Check that the score, when there are 21 rolls 10 pairs of 9 and miss")
                .isEqualTo(150);
    }

    @Test
    void
    should_give_result_when_only_strikes() {
        // given
        var game = new Game();

        for(int rollIndex = 0; rollIndex <12; rollIndex++) {
            var frame = new Frame(new RollValue(10));
            game.addFrame(frame);
        }

        // when
        var actualScore = game.result();

        // then
        Assertions.assertThat(actualScore)
                .as("Check that the score, when there are 12 stikes")
                .isEqualTo(300);
    }
}
