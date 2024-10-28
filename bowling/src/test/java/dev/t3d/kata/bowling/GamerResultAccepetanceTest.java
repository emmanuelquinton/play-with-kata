package dev.t3d.kata.bowling;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class GamerResultAccepetanceTest {


    @Test
    void should_give_result_when_no_strike_nor_spaire() {
        // given
        var gameResultCalulator = new GameResultCalulator();
        var game = new Game();

        for(int rollIndex = 0; rollIndex <10; rollIndex++) {
            var frame = new Frame(new RollValue(9));
            frame.addSecondRollValue(new RollValue(0));
            game.addFrame(frame);
        }

        // when
        var actualScore = gameResultCalulator.score(game);

        // then
        Assertions.assertThat(actualScore)
                .as("Check that the score, when there are 20 rolls 10 pairs of 9 and miss")
                .isEqualTo(90);
    }


}
