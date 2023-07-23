package junit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Week4Test {
    @Test
    public void testMax2Int1() {
        assertEquals(5, Week4.max2Int(5, 3));
    }

    @Test
    public void testMax2Int2() {
        assertEquals(10, Week4.max2Int(-2, 10));
    }

    @Test
    public void testMax2Int3() {
        assertEquals(0, Week4.max2Int(0, -1));
    }

    @Test
    public void testMax2Int4() {
        assertEquals(0, Week4.max2Int(0, 0));
    }

    @Test
    public void testMax2Int5() {
        assertEquals(3108, Week4.max2Int(1201, 3108));
    }

    @Test
    public void testMinArray1() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, 0 };
        assertEquals(-1, Week4.minArray(arr));
    }

    @Test
    public void testMinArray2() {
        int[] arr = { 1201, 3108, 12, 8, 1, 32839, 74389473, 12384 };
        assertEquals(1, Week4.minArray(arr));
    }

    @Test
    public void testMinArray3() {
        int[] arr = { -2, -832, 73, 7432, 2 };
        assertEquals(-832, Week4.minArray(arr));
    }

    @Test
    public void testMinArray4() {
        int[] arr = { 0, 0, 0, 0, 0 };
        assertEquals(0, Week4.minArray(arr));
    }

    @Test
    public void testMinArray5() {
        int[] arr = { 3, 2, 5, 8, 53, 534, 53, 3 };
        assertEquals(2, Week4.minArray(arr));
    }

    @Test
    public void testCalculateBMI1() {
        assertEquals("Bình thường", Week4.calculateBMI(60, 1.7));
    }

    @Test
    public void testCalculateBMI2() {
        assertEquals("Bình thường", Week4.calculateBMI(60, 1.7));
    }

    @Test
    public void testCalculateBMI3() {
        assertEquals("Bình thường", Week4.calculateBMI(60, 1.7));
    }

    @Test
    public void testCalculateBMI4() {
        assertEquals("Bình thường", Week4.calculateBMI(60, 1.7));
    }

    @Test
    public void testCalculateBMI5() {
        assertEquals("Bình thường", Week4.calculateBMI(60, 1.7));
    }
}