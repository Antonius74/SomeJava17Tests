package datastructures.arrays;

import java.util.Arrays;

class DynamicIntArray {
    /**
     * Simple array from vararg
     */
    public int[] createArray(int... t) {
        return t;
    }

    /**
     * insert int val at index 0
     */
    public int[] insertFirst(int v, int... t) {
        int[] a = new int[t.length + 1];
        a[0] = v;
        int i = 1;
        for (; t.length >= i; i++) a[i] = t[i - 1];
        return a;
    }

    /**
     * insert int val at last index
     */
    public int[] insertLast(int v, int... t) {
        int[] a = new int[t.length + 1];
        System.arraycopy(t, 0, a, 0, t.length);
        a[t.length] = v;
        return a;
    }

    /**
     * insert int at index idx
     */
    public int[] insertAtIdx(int v, int idx, int... t) {
        int[] a = new int[t.length + 1];
        int i = 0;
        for (; i < idx; i++) {
            a[i] = t[i];
        }
        a[i++] = v;
        for (; i <= t.length; i++) {
            a[i] = t[i - 1];
        }
        return a;
    }

    /**
     * delete last element
     */
    public int[] deleteLast(int... t) {
        final int[] a = new int[t.length - 1];
        int i = 0;
        for (; ; i++) {
            a[i] = t[i];
            if (i == t.length - 2) return a;
        }
    }

    /**
     * delete first element
     */
    public int[] deleteFirst(int... t) {
        final int[] a = new int[t.length - 1];
        int i = 1;
        for (; ; i++) {
            a[i - 1] = t[i];
            if (i == t.length - 1) return a;
        }
    }

    /**
     * delete specific value if exists
     */
    public int[] deleteValue(int v, int... t) {
        final int[] a = new int[t.length - 1];
        int idx = -1;
        for (int i = 0; i < t.length - 1; i++) {
            if (t[i] == v) {
                idx = i;
                break;
            }
        }
        if (idx != -1) {
            for (int i = 0, j = 0; i < t.length; i++, j++) {
                if (i == idx) {
                    j--;
                    continue;
                }
                a[j] = t[i];
            }
            return a;
        }
        return t;
    }

    /**
     * insert element in an ordered array
     */
    public int[] insertOrdered(int v, int... t) {
        return bubbleSort(insertLast(v, t));
    }

    /**
     * order array bubble
     */
    public int[] bubbleSort(int... a) {
        int count = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                count++;
                if (a[j] > a[j + 1]) {
                    int tmp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = tmp;
                }
            }
        }
        System.out.println(count);
        return a;
    }

    /**
     * order array selection
     */
    public int[] selectionSort(int... a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            int minValIdx = i;
            for (int j = i+1; j < a.length; j++) {
                count++;
                if (a[j]<a[minValIdx]) minValIdx = j;
            }
            if (minValIdx!=i) {
                int tmp = a[i];
                a[i] = a[minValIdx];
                a[minValIdx] = tmp;
            }
        }
        System.out.println(count);
        return a;
    }

    public String toString(int... a) {
        StringBuilder ret = new StringBuilder();
        ret.append("[");
        for (int i : a) ret.append(i).append(", ");
        return ret.substring(0, ret.length() - 2) + "]";
    }

    public static void main(String[] args) {
        DynamicIntArray da = new DynamicIntArray();
        System.out.println(da.toString(da.deleteValue(1, 1,2,3)));
        Arrays.stream(da.bubbleSort(new int[]{3,2,1})).forEach(System.out::print);
        System.out.println();
        Arrays.stream(da.selectionSort(new int[]{3,2,1})).forEach(System.out::print);
        Arrays.sort(new int[]{});
    }

}

