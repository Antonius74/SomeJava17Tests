package initializer;

public class TestInitializer {
    int i;
    public TestInitializer() {
        System.out.println("constructor");
        {
            System.out.println(1);
        }
    }
    {
        System.out.println("instance initilizer " + this.i);
        {
            System.out.println(2);
        }
    }

    {
        System.out.println("another instance initilizer " + this.s);
        {
            System.out.println(4);
        }
    }
    int z = 1;
    String s = "some";
    static {
        System.out.println("Static initilizer ");
        {
            System.out.println(3);
        }
    }

    public static void main(String[] args) {
        new TestInitializer();
    }
}
