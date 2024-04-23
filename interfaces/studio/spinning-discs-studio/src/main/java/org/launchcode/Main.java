package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD myCD = new CD("Harry potter");
        DVD myDVD = new DVD("Narnia");

        // TODO: Call each CD and DVD method to verify that they work as expected.

        myCD.spinDisc();
        myDVD.spinDisc();

        myCD.writeData("More data to write");
        System.out.println(myCD.getInfo());
        System.out.println(myDVD.getInfo());
    }
}