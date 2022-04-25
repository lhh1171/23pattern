package org;

class Fecade {
    private IDoProcess doProcess = new DoProcess();

    public void render(String path, Object u) throws Exception {
        String str = doProcess.render(path, u);
        System.out.println(str);
    }

    public void writehtml(String path) {
        String str = doProcess.writehtml(path);
        System.out.println(str);
    }
}
