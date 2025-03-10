public abstract class Robot {

    // TODO 1: Cut the of "modeOfOperation" property declaration
    private int modeOfOperation;

    // TODO 2: Move the declaration of "batteryCharge"
    private int batteryCharge;

    // TODO 3: Create a default constructor
    public void Robot(){
        batteryCharge = 0;
        modeOfOperation = 1;
    }

    // TODO 4: Move the setters and getters for property "modeOfOperation"
    public int getModeOfOperation() {
        return modeOfOperation;
    }

    public void setModeOfOperation(int modeOfOperation){
        if (modeOfOperation>=1 && modeOfOperation<=3){
            this.modeOfOperation = modeOfOperation;
        } else {
            this.modeOfOperation = 1;
        }
    }

    // TODO 5: Move the setters and getters for property "batterCharge"
    public int getBatteryCharge(){
        return batteryCharge;
    }

    public void setBatteryCharge(int batteryCharge){
        this.batteryCharge = batteryCharge;
    }

    // TODO 6: Move the method "rechargeBattery()"
    public void rechargeBattery(){
        System.out.println("Plug into socket.....");
        System.out.print("Charging ..");
        for (int i = 0; i <= 100; i += 10){
            System.out.print(".");
            batteryCharge = i;
        }

        System.out.println("\nUnplug from socket.....");
        System.out.println("Fully charged.....");
    }

    // TODO 7: Move the method "displayBatteryLevel()
    public void displayBatteryLevel(){
        System.out.println("The Battery charge is at :" + batteryCharge + " %.");
    }

    // TODO 8: Prevent objects of this class from being created by this class abstract.

    // TODO 16: Declare two abstract methods "setChoice" and "takeAction" with the return type "void"
    public abstract void setChoice();
    public abstract void takeAction();
}


