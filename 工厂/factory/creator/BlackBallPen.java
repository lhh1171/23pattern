package factory.creator;

import factory.product.BlackPenCore;
import factory.product.PenCore;


public class BlackBallPen extends BallPen{

    @Override
    public PenCore getPenCore(){
        return new BlackPenCore();
    }
}
