package factory.creator;

import factory.product.PenCore;
import factory.product.RedPenCore;


public class RedBallPen extends BallPen{

    @Override
    public PenCore getPenCore(){
        return new RedPenCore();
    }
}
