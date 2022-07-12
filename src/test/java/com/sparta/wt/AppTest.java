package com.sparta.wt;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    @DisplayName("check: entering 0 returns 0")
    void checkZeroTest() {
        Assertions.assertEquals(0, App.fibSeqNumberAt(0));
    }

    @Test
    @DisplayName("check: entering 1 returns 1")
    void checkOneTest() {
        Assertions.assertEquals(1, App.fibSeqNumberAt(1));
    }

    @Test
    @DisplayName("check: entering 2 returns 1")
    void checkTwoTest() {
        Assertions.assertEquals(1, App.fibSeqNumberAt(2));
    }

    @Test
    @DisplayName("check: entering 3 returns 2")
    void checkThreeTest() {
        Assertions.assertEquals(2, App.fibSeqNumberAt(3));
    }

    @Test
    @DisplayName("check: entering 4 returns 3")
    void checkFourTest() {
        Assertions.assertEquals(3, App.fibSeqNumberAt(4));
    }

    @Test
    @DisplayName("check: entering 10 returns 55")
    void checkTenTest() {
        Assertions.assertEquals(55, App.fibSeqNumberAt(10));
    }

    @Test
    @DisplayName("check: entering -2 returns 0")
    void checkNegativeTest() {
        Assertions.assertEquals(0, App.fibSeqNumberAt(-2));
    }

    @Test
    @DisplayName("check: entering null returns 0")
    void checkNullTest() {
        Assertions.assertEquals(0, App.fibSeqNumberAt(null));
    }

    @Test
    @DisplayName("check: entering 6 returns {0, 1, 1, 2, 3, 5}")
    void checkReturnArray() {
        int[] fibSeqArray = {0, 1, 1, 2, 3, 5};
        Assertions.assertArrayEquals(fibSeqArray, App.fibSeqAsArray(6));
    }
}
