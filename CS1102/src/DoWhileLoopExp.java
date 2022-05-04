import textio.TextIO;

public class DoWhileLoopExp {
    public static void main(String[] args) {
        // Gather responses from the user.
        TextIO.put("do-while loop - Enter a random num: ");
        int num = TextIO.getlnInt();
        do {
            System.out.println("the integer " + num + " is equal or smaller than 10!");
            num--;
        } while (num < 10 && num > 0);

        TextIO.put("while loop - Enter a random num: ");
        // define new num value
        num = TextIO.getlnInt();
        while (num < 10 && num > 0) {
            System.out.println("the integer " + num + " is equal or smaller than 10!");
            num--;
        }

        TextIO.put("for loop - Enter a random num: ");
        for (num = TextIO.getlnInt(); num < 10 && num > 0; num--) {
            System.out.println("the integer " + num + " is equal or bigger than 10!");
        }

    }
}
