package org;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Sales{
    void sale();
}
class RealIBM implements Sales{
    @Override
    public void sale() {
        System.out.println("卖电脑");
    }
}
class IBM implements InvocationHandler{
    private Sales sales;
    public IBM(Sales sales){
        this.sales=sales;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("送东西");
        sales.sale();
        return null;
    }
}
public class Test1 {
    public static void main(String[] args) {
        Sales s= (Sales) Proxy.newProxyInstance(
                Sales.class.getClassLoader(),new Class[]{Sales.class},
                new IBM(new RealIBM()));
        s.sale();
    }
}