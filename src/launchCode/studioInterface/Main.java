package launchCode.studioInterface;

public class Main {

    public static void main (String[] args) {

        CD myCD = new CD();
        DVD myDvd = new DVD("OU T'ES PAPA");

        myCD.spinDisc();

        myDvd.writeData("ADD DATA");



        System.out.println(myCD.readData());





    }
}
