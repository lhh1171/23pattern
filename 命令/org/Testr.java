package org;

public class Testr {
    public static void main(String[] args) {
        Process p=new Process();
        p.drive(new Command(Stat.ON));
        p.drive(new Command(Stat.OFF));
    }
}
