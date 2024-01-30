class A3 {
    // Method in class A3
    public void hello(String s) {
        System.out.println("A3: Hello From " + s);
    }
}

class B3 extends A3 {
    // Method overriding in class B3
    @Override
    public void hello(String s) {
        super.hello(s); // Using super to call method of superclass
        System.out.println("B3: Hello From " + s);
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        A3 obj1 = new A3();
        A3 obj2 = new B3(); // Dynamic Method Dispatch

        obj1.hello("Object 1");
        obj2.hello("Object 2");
    }
}
