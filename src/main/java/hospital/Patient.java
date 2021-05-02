package hospital;

public class Patient {

    private int healthLevel;
    private int bloodLevel;

    public int getHealthLevel() {
        return healthLevel;
    }

    public int getBloodLevel() {
        return bloodLevel;
    }

    //default constructor
    public Patient() {
        healthLevel = 10; //default health level
        bloodLevel = 20; //default blood level
    }

    //overloaded constructor
    public Patient(int healthLevel, int bloodLevel) {
        this.healthLevel = healthLevel;
        this.bloodLevel = bloodLevel;
    }

    public void increaseHealthLevel(int healthIncreaseAmount) {
        healthLevel += healthIncreaseAmount;
    }

    public void decreaseBloodLevel(int bloodDecreaseAmount) {
        bloodLevel -= bloodDecreaseAmount;
    }
}
