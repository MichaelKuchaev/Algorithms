package org.example.cw.cw6;

import org.example.cw.cw5.Buyer;

import java.util.*;

public class Market implements QueueBehaviour, MarketBehaviour{
    List<Buyer> actors = new LinkedList<>();
    Queue<Buyer> actorsQueue = new ArrayDeque<>();

    @Override
    public void acceptToMarket(Buyer actor) {
        System.out.println(actor.getName() + " зашел в магазин");
        actors.add(actor);
    }


    @Override
    public void releaseFromMarket(Buyer actor) {
        System.out.println(actor.getName() + " покинул магазин");
        actors.remove(actor);

    }

    @Override
    public void update() {
    }

    @Override
    public void takeInQueue(Buyer actor) {
        System.out.println(actor.getName() + " встал в очередь");
        actorsQueue.add(actor);
    }

    @Override
    public void takeOrders() {
        actorsQueue.peek().isTakeOrder();
        System.out.println(actorsQueue.peek().getName() + " забрал заказ");
    }

    @Override
    public void giveOrders() {
        System.out.println(actorsQueue.peek().getName() + " сделал заказ");
        actorsQueue.peek().isMakeOrder();
    }

    @Override
    public void releaseFromQueue() {
        System.out.println(actorsQueue.peek().getName() + " покинул очередь");
        actorsQueue.poll();
    }
}
