package javacourse.section20OOPpart2;

public class Fan {
    // state
    // 3 cái này cần constructor
    private String make;
    private double radius;
    private String color;
    // 2 cái này k cần
    private boolean isOn;
    private byte speed;

    // constructor
    public Fan(String make, double radius, String color) {
        this.make = make;
        this.radius = radius;
        this.color = color;
    }
    // method
    // toString dùng cho print, String.format cho String Interpolation
    public String toString() {
        return String.format("make - %s, radius - %s, color - %s, isOn - %s, speed - %s",
                this.make, this.radius, this.color, this.isOn, this.speed);
    }
    // Method nghịch đảo trạng thái on off
    // đồng thời set speed lên 10/xg 0
    public void switchFan() {
        this.isOn = !this.isOn;
        if (!this.isOn) {
            setSpeed((byte) 0);
        } else {
            setSpeed((byte) 10);
        }
    }
    // Method chỉnh speed (byte)
    public void setSpeed(byte speed) {
        this.speed = speed;
    }
}
