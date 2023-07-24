package javacourse.section3OOP;

public class Motorbike {
    // Cac field
    public String name;
    public String gear;
    public Integer speed;

    // Constructor method
    public Motorbike(String name, String gear, Integer speed) {
        this.name = name;
        this.gear = gear;
        this.speed = speed;
    }
    // Chinh gear
    public void adjustGear(String newGear) {
        this.gear = newGear;
    }
    // Chinh Speed
    public void adjustSpeed(Integer newSpeed) {
        this.speed = newSpeed;
    }
}



