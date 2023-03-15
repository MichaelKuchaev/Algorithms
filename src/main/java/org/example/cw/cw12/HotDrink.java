package org.example.cw.cw12;

public class HotDrink extends Drink {

    private int temperature;

    @Override
    public String toString() {
        return String.format("Горячий напиток %s, температура которого: %d градуса", super.getName(), temperature);
    }

    public HotDrink(String name, int temperature) {
        super(name);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

}
