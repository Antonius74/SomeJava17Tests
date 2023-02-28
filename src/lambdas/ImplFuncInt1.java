package lambdas;

import java.util.Locale;

public class ImplFuncInt1 {
    public ImplFuncInt1() {
        System.out.println(TestFuncInt(2.29999999999d,2.3d, fi, fi1));
        System.out.println(gi.doSomething("ant"));
        System.out.println(gi1.doSomething(2d));
        System.out.println(doSome(new GenericInterface<Integer>() {
            @Override
            public Integer doSomething(Integer integer) {
                return integer*integer;
            }

        }));
    }
    int doSome(GenericInterface<Integer> ge){
        return ge.doSomething(7);
    }

    GenericInterface<Double> gi1 = a ->  Math.pow(a, 8*8);
    GenericInterface<String> gi = a -> String.valueOf(a.charAt(0)).toUpperCase() + a.substring(1);
    FuncInt1 fi = Double::sum;
    FuncInt1 fi1 = Double::max;
    public String TestFuncInt(Double p, Double v, FuncInt1 fi, FuncInt1 fi1) {
        return fi.eval(p, v).toString() + ", " + fi1.eval(p, v).toString();
    }

    public static void main(String[] args) {
        new ImplFuncInt1();
    }
}
