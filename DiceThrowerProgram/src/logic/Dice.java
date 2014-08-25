package logic;

import java.util.*;

public class Dice implements Runnable {

    private final String dieName;
    private final List<Integer> values;
    private int currentThrow;

    // Constructor 
    public Dice(String name) {
        this.dieName = name;
        this.values = new ArrayList();
        this.currentThrow = 0;
    }

    @Override
    public void run() {
        throwMe();
        tellResult();
    }

    // Methods
    private void throwMe() {
        Random r = new Random();
        currentThrow = r.nextInt(6) + 1;
        values.add(currentThrow);
    }

    // Should return a String
    private void tellResult() {
        System.out.println(dieName + " threw " + currentThrow);
    }

}
