package classname;

import java.util.Arrays;
import java.util.Optional;

class ClassName {
    public ClassName() {
        System.out.println("Attriutess "+this.getClass().getSimpleName());
    }
    void printSome(int ... i){
        Arrays.stream(i).forEach(System.out::print);
    }

    public static void main(String[] a) {

        new ClassName().printSome(1,2,3,4,5);
        Optional<String> o = a[0].toString().describeConstable();
        System.out.println(o);

    }
}

