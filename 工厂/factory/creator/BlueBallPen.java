package factory.creator;

import factory.product.BluePenCore;
import factory.product.PenCore;


public class BlueBallPen extends BallPen{

    @Override
    public PenCore getPenCore(){
        return new BluePenCore();
    }
}
