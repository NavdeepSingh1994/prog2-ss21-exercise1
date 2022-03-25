
package Puzzle1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


// Repository: https://github.com/NavdeepSingh1994/prog2-ss21-exercise1.git
class Puzzle1Test {
    private Puzzle1 puzzle1;

    @BeforeEach
    void setUp() {
        puzzle1 = new Puzzle1();
    }

    @Test
    public void test() {
        int expected = 3563458;
        int actual = puzzle1.part1();
        assertEquals(expected, actual);
    }
    @Test
    public void test2() {
        int expected = 5342292;
        int actual = puzzle1.part2();
        assertEquals(expected, actual);
    }
    @Test
    public void test3() {
        int expected = 654;
        int actual = puzzle1.count( 1969);
        assertEquals(expected, actual);
    }
    @Test
    public void test4() {
        int expected = 33583;
        int actual = puzzle1.count( 100756);
        assertEquals(expected, actual);
    }
    @Test
    public void test5() {
        int expected = 2;
        int actual = puzzle1.count( 14);
        assertEquals(expected, actual);
    }
    @Test
    public void test6() {
        int expected = 2;
        int actual = puzzle1.count( 14);
        assertEquals(expected, actual);
    }
    @Test
    public void test7() {
        int expected = 50346;
        int actual = puzzle1.count2(100756);
        assertEquals(expected, actual);
    }
}