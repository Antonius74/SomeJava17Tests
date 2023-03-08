package datastructures.checkduplicates;

import java.util.HashMap;
import java.util.HashSet;

public class CheckDuplicates {
    boolean check1(int[] i) {
        int count = 0;
        HashSet<Integer> hm = new HashSet<>();
        for (int j : i) {
            //count++;
            if (hm.contains(j)) {
                //System.out.println(count);
                return true;
            }
            hm.add(j);
        }
        return false;
    }

    boolean check2(int... i) {
        int z = 0, l = 0, count = 0;
        for (int j : i) {
            for (int q : i) {
                //count++;
                if (z != l && j == q) {
                    //System.out.println(count);
                    return true;
                }
                ++l;
            }
            l -= l;
            ++z;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new CheckDuplicates().check1(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,12}));
        System.out.println(new CheckDuplicates().check2(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,12}));

    }
}

