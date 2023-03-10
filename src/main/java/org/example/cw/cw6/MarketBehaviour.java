package org.example.cw.cw6;

import org.example.cw.cw5.Buyer;

import java.util.List;

public interface MarketBehaviour {
    void acceptToMarket(Buyer actor);
    void releaseFromMarket(Buyer actor);
    void update();
}
