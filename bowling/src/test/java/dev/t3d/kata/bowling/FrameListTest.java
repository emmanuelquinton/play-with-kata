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




}
