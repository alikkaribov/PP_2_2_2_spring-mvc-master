package web.model;

public class Car {
    private String model;
    private int hp;
    private int sum;

    public Car(String model, int hp, int sum) {
        this.model = model;
        this.hp = hp;
        this.sum = sum;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", hp='" + hp + '\'' +
                ", sum=" + sum +
                '}';
    }
}
