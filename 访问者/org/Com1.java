package org;


class Com1 extends AbsCom {
    public Com1(IVisitor visitor) {
        super(visitor);
    }

    @Override
    public void accept() {
        super.visitor.visit(this);
    }
}
