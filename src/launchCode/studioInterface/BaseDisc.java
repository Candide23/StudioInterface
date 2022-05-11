package launchCode.studioInterface;

import java.util.HashMap;

public abstract class BaseDisc {

    // Class Variable

    private String discData;
    private HashMap<String, String> discInfo;
    private boolean isInserted;
    private String title;

    private final int storageCapacityInMB;
    private final int spinSpeedInRpm;

    // Constructor
    public BaseDisc(int storageCapacity, int spinSpeed) {
        this.discData = "";
        this.discInfo = new HashMap<String, String>();
        this.isInserted = false;

        this.spinSpeedInRpm = spinSpeed;
        this.storageCapacityInMB = storageCapacity;
        this.discInfo.put("storage Capacity", String.valueOf(storageCapacity));
        this.discInfo.put("storage Capacity", String.valueOf(spinSpeed));

    }

    public boolean isInserted() {
        return isInserted;
    }

    public int getStorageCapacityInMB() {
        return storageCapacityInMB;
    }

    public int getSpinSpeedInRpm() {
        return spinSpeedInRpm;
    }

    public BaseDisc(int storageCapacity, int spinSpeed, String title) {
        this(storageCapacity, spinSpeed);
        this.discInfo.put("Title", title);
    }
    // Methods

    protected void writeData(String data) {
        this.discData += data;
    }

    public String readData() {
        return this.discData;


    }

}
