package org;

class Buildhouse implements Build {

    @Override
    public void step1() {
        System.out.println("打地基");
    }

    @Override
    public void step2() {
        System.out.println("搬砖");
    }

    @Override
    public void step3() {
        System.out.println("外围");
    }

    @Override
    public void step4() {
        System.out.println("装修");
    }

    @Override
    public void step5() {
        System.out.println("景观");
    }

}
