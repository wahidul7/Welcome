package fall23;

public class week5 {

    public void sum(int a, int b) {
        int s = 0;
        for (int i = a; i <= b; i++) {
            s += i;
        }
        System.out.println("The value of S is = " + s);
    }

    public static int total(int i1, int i2) {
        int sum = 0;
        for (int i = i1; i <= i2; i++) {
            sum += i;
        }
        return sum;
    }

     static void display() {
        System.out.println("Thanks");
    }

    public static void main(String[] args) {
        week5 z = new week5();
        z.sum(10, 20);
        System.out.println("Sum from 1 to 10 is " + total(1, 10));
        System.out.println("Sum from 40 to 60 is " + total(40, 60));
        System.out.println("Sum from 1 to 10 is " + total(1, 10));
        display();
    }
}
