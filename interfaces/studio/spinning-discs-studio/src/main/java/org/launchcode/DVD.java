package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc{
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    public DVD(String title) {
        super(4500, 1500, title);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of " + this.getSpinSpeed() + " rpm.");
    }

    @Override
    public void storeData(String data) {
        this.writeData(data);

    }

    @Override
    public boolean isFull() {
        return this.readData().length() >= this.getStorageCapacity();
    }
}
