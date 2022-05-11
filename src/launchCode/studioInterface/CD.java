package launchCode.studioInterface;

public class CD extends BaseDisc implements OpticalDisc {



    public CD() {
        super(700, 500);
    }

    @Override
    public void spinDisc() {

        System.out.println("A CD spins at a rate of " + this.getSpinSpeedInRpm() + "rpm");

    }

    @Override
    public void storeData(String data){
        this.writeData(data);

    }

    @Override
    public boolean isFull() {

        if(this.readData().length() >= this.getStorageCapacityInMB()) return true;
        return false;
    }
}
