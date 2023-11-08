package racingCar;

public class Car {
    private int index = 0;
    private static final int THRESHOLD = 4;

    public void moveCar(int input) {
        if (input >= THRESHOLD) {
            this.index++;
        }
    }

    public int getIndex() {
        return this.index;
    }
}
