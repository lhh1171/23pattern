package factory.creator;

import factory.product.PenCore;


public abstract class BallPen {
    BallPen(){
        System.out.println("create the pen with the "+ getPenCore().color+".");
    }

    public abstract PenCore getPenCore();
}
