package racingcar.model;

public class Car {
    private final String name;
    private int position;

    public Car(String name) {
        this.name = name;
        this.position = 0; // 초기 position 0
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void move() {
        position++;
    }

    public void printStatus() {
        System.out.print(name + " : " + "-".repeat(position) + "\n");
    }
}
