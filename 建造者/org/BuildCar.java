package org;

class BuildCar implements Build {

    @Override
    public void step1() {
        System.out.println("1");
    }

    @Override
    public void step2() {
        System.out.println("2");
    }

    @Override
    public void step3() {
        System.out.println("3");
    }

    @Override
    public void step4() {
        System.out.println("4");
    }

    @Override
    public void step5() {
        System.out.println("造车");
    }

}
