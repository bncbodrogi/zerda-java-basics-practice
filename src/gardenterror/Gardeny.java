package gardenterror;

    public abstract class Gardeny {
        String name;
        String color;
        double actualWater;
        double minimumWater;
        double waterAbsorbinCapability;
        boolean needsWater;


        public String waterStatusReport(){
            if (isNeedsWater() == true) {
                return color + " " + name + " needs water";
            }else{
                return color + " " + name + " doesn't need water";
            }
        }

        public waterTheGarden(double waterAmmount){
            setActualWater(waterAmmount * waterAbsorbinCapability);
        }

        public boolean isNeedsWater() {
            return (getActualWater() < getMinimumWater());
        }

        public void setNeedsWater(boolean needsWater) {
            this.needsWater = needsWater;
        }

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

        public void setActualWater(double actualWater) {
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
