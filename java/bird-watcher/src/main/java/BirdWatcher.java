
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        int incrementToday = birdsPerDay[birdsPerDay.length - 1]++;
        System.out.println(incrementToday);
    }

    public boolean hasDayWithoutBirds() {
        boolean dayWithoutBirds = false;
        for (int i = 0; i < birdsPerDay.length; i++){
            if (birdsPerDay[i] == 0){
                return !dayWithoutBirds;
            }
        }
        return dayWithoutBirds;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sumOfBirds = 0;
        for (int i = 0; i < numberOfDays && i < birdsPerDay.length; i++){
            sumOfBirds += birdsPerDay[i];
        }
        return sumOfBirds;
    }

    public int getBusyDays() {
        int numberOfDays = 0;
        for(int i = 0; i < birdsPerDay.length; i++){
           if (birdsPerDay[i] >= 5){
            numberOfDays++;
           }
        }
        return numberOfDays;
    }
}
