package datastructures.arrays;

import org.junit.Test;
import static org.junit.Assert.*;

public class DynamicIntArrayTest {
    DynamicIntArray dynamicIntArray = new DynamicIntArray();
    @Test
    public void createArray() {
        assertArrayEquals("Arrays are not equals",
                new int[]{1,2,3,4}, dynamicIntArray.createArray(1,2,3,4));
    }

    @Test
    public void insertFirst() {
        assertEquals(3, dynamicIntArray.insertFirst(3, new int[]{3,2,1})[0]);
    }

    @Test
    public void insertLast() {
        assertEquals(3, dynamicIntArray.insertLast(3, new int[]{3,2,1})[3]);
    }

    @Test
    public void insertAtIdx() {
        assertEquals(3, dynamicIntArray.insertAtIdx(3, 3, new int[]{3,2,1})[3]);
    }

    @Test
    public void deleteLast() {
        assertArrayEquals("Arrays are not equal", new int[]{1,2,3,4}, dynamicIntArray.deleteLast(1,2,3,4,5));
    }

    @Test
    public void deleteFirst() {
        assertArrayEquals("Arrays are not equal", new int[]{2,3,4}, dynamicIntArray.deleteFirst(1,2,3,4));

    }

    @Test
    public void deleteValue() {
        assertArrayEquals("Arrays are not equal", new int[]{2,3,4}, dynamicIntArray.deleteValue(1,2,3,4));
    }

    @Test
    public void insertOrdered() {
        assertArrayEquals("Arrays are not equal", new int[]{1,2,3,4,5,6}, dynamicIntArray.insertOrdered(4,3,2,1,5,6));
    }

    @Test
    public void order() {
        assertArrayEquals("Arrays are not equal", new int[]{1,2,3,4}, dynamicIntArray.order(4,3,2,1));
    }

    @Test
    public void testToString() {
    }
}