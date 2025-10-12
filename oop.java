class oop1 {
    int a;
    String b;

    public oop1(int a, String b) {
        this.a = a;
        this.b = b;
    }

    public void display() {
        System.out.println("int: " + a + ", string: " + b);
    }
}

public class oop {
    public static void main(String[] args) {
        oop1 obj = new oop1(5, "hi");
        obj.display();
    }
}
