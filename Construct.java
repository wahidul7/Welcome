package fall23;

public class Construct {
    Construct() {
        System.out.println("Example for Construct");
    }

    Construct(int a, String b, int mark, String course) {
        System.out.println("age is " + a);
        System.out.println("name is " + b);
        System.out.println("mark is " + mark);
        System.out.println("course is " + course);
    }

    Construct(String a) {
        college = a;
        System.out.println("College name is " + a);
    }

    private String college;  // Added a field to store the college name

    public static void main(String[] args) {
        Construct r = new Construct();
        Construct z = new Construct(20, "alan", 45, "math");
        Construct t = new Construct("NCT");
    }
}
