package org;

class Visitor1 implements IVisitor {
    @Override
    public void visit(AbsCom com) {
        System.out.println("visit1:" + com.getName());
        for (AbsCom c : com.getAbsComs()) {
            c.accept();
        }
    }
}
