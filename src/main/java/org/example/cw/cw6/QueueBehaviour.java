package org.example.cw.cw6;

import org.example.cw.cw5.Buyer;

public interface QueueBehaviour {
    void takeInQueue(Buyer actor);
    void takeOrders();
    void giveOrders();
    void releaseFromQueue();
}
