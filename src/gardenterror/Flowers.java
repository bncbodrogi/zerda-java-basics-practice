package gardenterror;

public class Flowers extends Gardeny {
    public Flowers(String color) {
        this.color = color;
        name = "Flower";
        waterAbsorbinCapability = 0.75;
        minimumWater = 5;
        actualWater = 0;
    }
}
