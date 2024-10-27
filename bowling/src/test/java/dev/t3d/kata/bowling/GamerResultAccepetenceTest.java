package dev.t3d.kata.bowling;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class GamerResultAccepetenceTest {


    @Test
    void should_give_result_when_only_strikes() {
        // given
        var gameResultCalulator = new GameResultCalulator();
        var game = new Game();
        // when
        var actualScore = gameResultCalulator.score(game);

        // then
        Assertions.assertThat(actualScore)
                .as("Check that the score, when there are only strike is 300")
                .isEqualTo(300);
    }


}
