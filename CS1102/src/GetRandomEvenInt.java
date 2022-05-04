import java.util.Random;
import java.util.Arrays;

public class GetRandomEvenInt {

    public static void main(String[] args) {
        Random rd = new Random(); // creating Random object

        int[] randomIntArray = new int[4];
        int i = 0;
        int randomInt = 0;

        System.out.println("While Loop:");
        while (i < randomIntArray.length) {
            randomInt = rd.nextInt();
            if (randomInt % 2 == 0) { // storing random even integers in a randomIntArrayay
                randomIntArray[i] = randomInt;
                System.out.println("storing the random even integer: ");
            } else { // replacing random odd integers with 0
                randomIntArray[i] = 0;
                System.out.print("replacing the random odd integer: " + randomInt + " with:");
            }
            ;
            System.out.println(randomIntArray[i]); // printing each array element
            i++;
        }
        System.out.println("While Loop randomIntArray -----------------> " + Arrays.toString(randomIntArray));
        /*
         * System.out.println("While Loop randomIntArray: "+ randomIntArray);
         * without Array.toString method, it returns [I@5e265ba4
         */

        // assign randomIntArray and index values for a new loop
        randomIntArray = new int[4];
        i = 0;
        System.out.println("For Loop:");
        for (; i < randomIntArray.length; i++) {
            randomInt = rd.nextInt();
            if (randomInt % 2 == 0) {
                randomIntArray[i] = randomInt;
                System.out.println("storing the random even integer: ");
            } else {
                System.out.print("replacing the random odd integer: " + randomInt + " with:");
                randomIntArray[i] = 0;
            }
            ;
            System.out.println(randomIntArray[i]);
        }
        ;
        System.out.println("For Loop randomIntArray -----------------> " + Arrays.toString(randomIntArray));

        // assign randomIntArray and index values for a new loop
        randomIntArray = new int[4];
        i = 0;
        System.out.println("do-while Loop:");
        do {
            randomInt = rd.nextInt();
            if (randomInt % 2 == 0) {
                randomIntArray[i] = randomInt;
                System.out.println("storing the random even integer: ");
            } else {
                System.out.print("replacing the random odd integer: " + randomInt + " with:");
                randomIntArray[i] = 0;
            }
            ;
            System.out.println(randomIntArray[i]);
            i++;
        } while (i < randomIntArray.length);
        System.out.println("do-while Loop randomIntArray -----------------> " + Arrays.toString(randomIntArray));
    }
}
