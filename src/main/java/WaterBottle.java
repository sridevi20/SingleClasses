public class WaterBottle {
    private double volume;

    public WaterBottle(double volume) {
        this.volume = 100;
    }

    public double getVoulme() {
        return this.volume;
    }

    public double drinkWater() {
        return this.volume -= 10;
    }
    public double emptyWater(){
        return this.volume = 0;
    }
    public double fillWater(){
        return this.volume = 100;
    }

}
