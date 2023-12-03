package junit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Week4Test {
    @Test
    public void testMax2Int1() {
        assertEquals(3108, Week4.max2Int(1201, 3108));
    }

    @Test
    public void testMax2Int2() {
        assertEquals(1201, Week4.max2Int(-3108, 1201));
    }

    @Test
    public void testMax2Int3() {
        assertEquals(1, Week4.max2Int(1, -1));
    }

    @Test
    public void testMax2Int4() {
        assertEquals(0, Week4.max2Int(0, 0));
    }

    @Test
    public void testMax2Int5() {
        assertEquals(69, Week4.max2Int(69, 96));
    }

    @Test
    public void testMinArray1() {
        int[] arr = { -1, -2, -3, 1, 2, 3, 4 };
        assertEquals(-3, Week4.minArray(arr));
    }

    @Test
    public void testMinArray2() {
        int[] arr = { 12, 1, 2004, 31, 8, 100000, 20, 69 };
        assertEquals(1, Week4.minArray(arr));
    }

    @Test
    public void testMinArray3() {
        int[] arr = { 2, 2, 2, 2, 2 };
        assertEquals(2, Week4.minArray(arr));
    }

    @Test
    public void testMinArray4() {
        int[] arr = { 0, 0, 0, 0, 0 };
        assertEquals(0, Week4.minArray(arr));
    }

    @Test
    public void testMinArray5() {
        int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        assertEquals(1, Week4.minArray(arr));
    }

    @Test
    public void testCalculateBMI1() {
        assertEquals("Thiếu cân", Week4.calculateBMI(52, 1.7));
    }

    @Test
    public void testCalculateBMI2() {
        assertEquals("Bình thường", Week4.calculateBMI(62, 1.7));
    }

    @Test
    public void testCalculateBMI3() {
        assertEquals("Thừa cân", Week4.calculateBMI(69, 1.7));
    }

    @Test
    public void testCalculateBMI4() {
        assertEquals("Béo phì", Week4.calculateBMI(100, 1.7));
    }

    @Test
    public void testCalculateBMI5() {
        assertEquals("Béo phì", Week4.calculateBMI(120, 1.5));
    }
}