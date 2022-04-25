package org;

abstract class Component {
    abstract public void printlocal(String perfix);

    public void add(Component com) throws Exception {
        throw new Exception("文件不能加文件！");
    }
}
