package org.example.cw.cw12;

public class ColdDrink extends Drink {

    private int cost;
    private int volume;

    public double getCost() {
        return cost;
    }

    public int getVolume() {
        return volume;
    }

    public ColdDrink(String name, int cost, int volume) {
        super(name);
        this.cost = cost;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("Холодный напиток %s, цена: %d, с объемом: %s мл.", super.getName(), cost, volume);
    }
}
