package homework14;

public class Main {

    public static void main(String[] args) {
        Human driver = new Driver();
        Human pilot = new Pilot();

        driver.accelerate();
        pilot.takeOff();
    }
}
