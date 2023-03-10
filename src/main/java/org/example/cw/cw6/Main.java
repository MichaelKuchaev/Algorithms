package org.example.cw.cw6;

import org.example.cw.cw5.Human;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Human hm = new Human();
        System.out.println("Введите имя покупателя: ");
        Scanner scName = new Scanner(System.in);
        hm.name = scName.nextLine();
        Market market = new Market();

        market.acceptToMarket(hm);
        market.takeInQueue(hm);
        market.giveOrders();
        market.takeOrders();
        market.releaseFromQueue();
        market.releaseFromMarket(hm);
        market.update();
    }
}
