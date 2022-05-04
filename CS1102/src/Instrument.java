import textio.TextIO;

public class Instrument {
    private String name;
    boolean isPlaying; // the instrument is not playing at start

    public Instrument(String instrumentName) {
        // constructor. Creating an instrument

        if (instrumentName.equals(""))
            throw new IllegalArgumentException("An instrument name must be provided.");
        // stop the program if the name is not provided

        name = instrumentName;
        // Assign a specific value to the instance variable name
    }

    public void play() { // declare an instance method called play
        System.out.printf("The %s is playing!\n", name);
        isPlaying = true;
    }

    public void stopPlay() { // declare an instance method called stopPlay
        System.out.printf("The %s has stopped playing!\n", name);
        isPlaying = false;
    }

    public void isPlaying() { // in Java the method name and variable name can be the same
        System.out.println("Is the " + name + " playing:\n" + isPlaying);
    }

    public static void main(String[] args) {
        String instrumentName;
        System.out.println("Name an instrument you'd like to play:");
        instrumentName = TextIO.getlnString();

        Instrument userInstrument = new Instrument(instrumentName);
        // userInstrument is the variable that references the object created by the
        // class Instrument

        userInstrument.play();
        userInstrument.isPlaying(); // the system knows isPlaying refers to the instance method but not the instance
                                    // variable since isPlaying is followed with the () right after it.

        userInstrument.stopPlay();
        userInstrument.isPlaying();
    }
}
