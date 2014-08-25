package logic;

public class Controller {

    // Constructor
    public Controller() {

    }

    // Methods
    public static void main(String[] args) {

        Thread t1 = new Thread(new Dice("Die 1"));
        t1.start();

    }

}
