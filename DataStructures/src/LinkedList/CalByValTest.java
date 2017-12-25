package LinkedList;

public class CalByValTest {

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.name);
        A b = new A();
        b.name = a.name;
        modifyA(a);
        System.out.println(a.name);
        System.out.println(b.name);
    }

    private static void modifyA(A a) {
        a.name = "richu";
    }
}

class A{
    String name = "ela";
}
