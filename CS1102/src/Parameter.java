import textio.TextIO;
/* to use TextIO you can download TextIO.java online and save it
in the project root directory under the folder textio */

public class Parameter {

    // Though Java doesn't care about the subroutine definition order,
    // i personally prefer to declare methods before calling it.
    public static boolean isBiggerThanTen(int inputNumber) {
        return inputNumber > 10;
    }

    public static void main(String[] args) {
        int n = TextIO.getlnInt();

        if (isBiggerThanTen(n))
            System.out.println(n + " is biggert than 10");
        else
            System.out.println(n + " is smaller or equal to 10");
    }
}

