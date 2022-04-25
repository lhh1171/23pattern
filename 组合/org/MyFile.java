package org;

class MyFile extends Component {
    private String name;

    public MyFile(String name) {
        this.name = name;
    }

    @Override
    public void printlocal(String perfix) {
        System.out.println(perfix + "/" + this.name);
    }
}
