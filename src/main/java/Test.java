import org.springframework.web.bind.annotation.PathVariable;

class Parent {
    public void ab(String a) {
        System.out.println("ab...");
    }
}

public class Test extends Parent {
    public void main() {
        System.out.println("abc");
    }

    public void Test() {
        System.out.println("ggg");
    }

    @Override
    public void ab(String a) {
        System.out.println("ccc...");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.ab("cc");
        // t.main();
        // t.Test();
    }
}
