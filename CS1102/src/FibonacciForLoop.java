import textio.TextIO;
/* to use TextIO you can download TextIO.java online and save it
in the project root directory under the folder textio */

public class FibonacciForLoop {

    public static void main(String[] args) {
        int t1 = 5;
        int t2 = 15;
        int i = 1;
        int sum = 0;

        // For Loop - Gather responses from the user.
        TextIO.put("for loop - Enter the iteration num: ");
        int n = TextIO.getlnInt();
        for (; i <= n; ++i) {
            System.out.print(t1 + " + ");
            sum = t1 + t2;
            t1 = t2;
            System.out.print(t2 + " = ");
            t2 = sum;
            System.out.println(sum);
        }
        System.out.println("for loop sum result -------------->" + sum);

        // While Loop - assign variables back to the initial value; assign new input value for the iteration
        t1 = 5;
        t2 = 15;
        sum = 0;
        i = 1;
        TextIO.put("while loop - Enter the iteration num: ");
        n = TextIO.getlnInt();
        while (i <= n) {
            System.out.print(t1 + " + ");
            sum = t1 + t2;
            t1 = t2;
            System.out.print(t2 + " = ");
            t2 = sum;
            System.out.println(sum);
            i++;
        }
        System.out.println("while loop sum result -------------->" + sum);

        // do-while Loop - assign variables back to the initial value; assign new input value for the iteration
        t1 = 5;
        t2 = 15;
        sum = 0;
        i = 1;
        TextIO.put("do-while loop - Enter the iteration num: ");
        n = TextIO.getlnInt();
        do {
            System.out.print(t1 + " + ");
            sum = t1 + t2;
            t1 = t2;
            System.out.print(t2 + " = ");
            t2 = sum;
            i++;
            System.out.println(sum);
        } while (i <= n);
        System.out.println("do loop sum result -------------->" + sum);
    }
}