package dev.t3d.kata.bowling;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FrameListTest {

    @Test
    void should_frameList_contains_elements(){
        //given
        var frameList = new FrameList();
        frameList.add(new Frame(new RollValue(9)));

        //when
        var actualSize = frameList.size();

        //then
        Assertions.assertThat(actualSize)
                .as("Check that the frame has been added")
                .isEqualTo(1);
    }



    @Test
    void should_contains_strike_the_of_first_frame_is_30(){
        //given
        var frameList = new FrameList();
        frameList.add(new Frame(new RollValue(10))); // this fame have 30 points t(10 + 10 + 10)
        frameList.add(new Frame(new RollValue(10)));  // this fame have 20 points t(10 + 10 )
        frameList.add(new Frame(new RollValue(10))); // this fame have 10 point

        //when
        var actualScore = frameList.result();

        //then
        Assertions.assertThat(actualScore)
                .as("Check that the frame has been added")
                .isEqualTo(60);
    }


}
