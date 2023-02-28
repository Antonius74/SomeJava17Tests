package lambdas;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

@FunctionalInterface
interface MyFuncInt{
    int fib(int i);
}
public class TestHard {
    HashSet<Integer> hs = new HashSet();
    int i = 0;
    public TestHard(int i){
        this.fib(mf, i);
        System.out.println(Arrays.stream(hs.toArray()).sorted().collect(Collectors.toList()));
    }

    public int fib(MyFuncInt mf, int i){
        return mf.fib(i);
    }

    MyFuncInt mf = new MyFuncInt() {
        int q = 0;
        HashSet<Integer> hs1 = new HashSet();
        @Override
        public int fib(int i) {
            if (hs1.contains(i)) return i;
            hs1.add(i);
            System.out.println(++q);
            if (i<=1) return i;
            int j = fib(i-1) + fib(i-2);
            hs.add(j);
            return j;
        }
    };


    public static void main(String[] args) {
        new TestHard(88);
    }
}
