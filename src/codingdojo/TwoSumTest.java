package codingdojo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TwoSumTest {

    final TwoSum toTest = new TwoSum();

    @Test
    void twoSum1() {
        final int[] result = toTest.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertTrue(Arrays.equals(result, new int[]{0, 1}) || Arrays.equals(result, new int[]{1, 0}));
    }

    @Test
    void twoSum2() {
        final int[] result = toTest.twoSum(new int[]{3, 2, 4}, 6);
        assertTrue(Arrays.equals(result, new int[]{1, 2}) || Arrays.equals(result, new int[]{2, 1}));
    }

    @Test
    void twoSum3() {
        final int[] result = toTest.twoSum(new int[]{3, 3}, 6);
        assertTrue(Arrays.equals(result, new int[]{0, 1}) || Arrays.equals(result, new int[]{1, 0}));
    }

    @Test
    void twoSum4() {
        final int[] result = toTest.twoSum(new int[]{4, 11, 1, 2, 78, 30, 100, 1000, 675, 890000, 546378}, 546379);
        assertTrue(Arrays.equals(result, new int[]{2, 10}) || Arrays.equals(result, new int[]{10, 2}));
    }
}