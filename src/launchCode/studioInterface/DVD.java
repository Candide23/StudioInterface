package launchCode.studioInterface;

public class DVD extends BaseDisc implements OpticalDisc{

    public DVD( String title) {
        super(4000, 1600, title);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate " + this.getSpinSpeedInRpm() + "rpm");
    }

    @Override
    public void storeData(String data) {
        this.writeData(data);

    }

    @Override
    public boolean isFull() {
        if(this.readData().length() >= this.getStorageCapacityInMB()) return true;
        return false;

    }
}
