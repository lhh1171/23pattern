package org;

class Desktop extends Computer {

    public Desktop(Brand b) {
        super(b);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("出售台式电脑");
    }
}
