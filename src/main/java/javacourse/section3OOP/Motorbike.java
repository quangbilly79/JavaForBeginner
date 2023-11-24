package javacourse.section3OOP;

import java.util.Objects;

public class Motorbike {
    // Cac field
    public String name;
    public String gear;
    public int speed;

    // Constructor method
    public Motorbike(String name, String gear, int speed) {
        this.name = name;
        this.gear = gear;
        this.speed = speed;
    }
    // Constructor thứ 2 overload bên trên để set default value
    public Motorbike(String name) {
        this.name = name;
        this.gear = "defaultGear";
        this.speed = 3;
        // Hoặc this(name, "defaultGear", 3)
    }

    // Blank Constructor để test default value
    public Motorbike() {
    }

    // Chinh gear
    public void setGear(String newGear) {
        this.gear = newGear;
    }
    // Chinh Speed, check dk
    public void setSpeed(int newSpeed) {
        if (newSpeed > 0) {
            this.speed = newSpeed;
        }
    }

    // Get Speed va` Gear
    public int getSpeed() {
        return this.speed;
    }
    public String getGear() {
        return this.gear;
    }
    // Tang Speed. Sử dụng method setSpeed để check đk luôn
    public void increaseSpeed(int speed) {
        setSpeed(this.speed + speed);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Motorbike motorbike = (Motorbike) o;
        return speed == motorbike.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}



