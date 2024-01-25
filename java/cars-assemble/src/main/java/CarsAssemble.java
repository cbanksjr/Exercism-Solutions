public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        final int carsPerHour = 221;
        double successRate;
        if(speed >= 5 && speed <= 8){
            successRate = .9;
            return speed * carsPerHour *  successRate;
        } else if (speed == 9){
            successRate = .8;
            return speed * carsPerHour * successRate;
        } else if (speed == 10){
            successRate = .77;
            return speed * carsPerHour * successRate;
        } else {
            return speed * carsPerHour;
        }
    }


    public int workingItemsPerMinute(int speed) {
        double perMinute = productionRatePerHour(speed) / 60;
        return (int) perMinute;

    }
}
