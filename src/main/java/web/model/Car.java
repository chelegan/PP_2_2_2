package web.model;

public class Car {

    private String model;

    private int id;

    private String color;

    public Car(int id, String color, String model) {
        this.id = id;
        this.color = color;
        this.model = model;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setSeries(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", id=" + id +
                ", color='" + color + '\'' +
                '}';
    }
}
