package org;

class Builder {
    private Build b;

    public Builder(Build b) {
        this.b = b;
    }

    public void build() {
        b.step1();
        b.step2();
        b.step3();
        b.step4();
        b.step5();
    }
}
