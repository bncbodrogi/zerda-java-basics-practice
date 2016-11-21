package TheGarden;

public abstract class Gardeny {
    String name;
    String color;
    int actualWater;
    int minimumWater;
    double waterAbsorbinCapability;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getActualWater() {
        return actualWater;
    }

    public void setActualWater(int actualWater) {
        this.actualWater = actualWater;
    }

    public int getMinimumWater() {
        return minimumWater;
    }

    public void setMinimumWater(int minimumWater) {
        this.minimumWater = minimumWater;
    }

    public double getWaterAbsorbinCapability() {
        return waterAbsorbinCapability;
    }

    public void setWaterAbsorbinCapability(double waterAbsorbinCapability) {
        this.waterAbsorbinCapability = waterAbsorbinCapability;
    }
}
