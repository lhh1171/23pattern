package org;

class Visitor2 implements IVisitor {
    @Override
    public void visit(AbsCom com) {
        System.out.println("visit2:" + com.getName());
        for (AbsCom c : com.getAbsComs()) {
            c.accept();
        }
    }
}
