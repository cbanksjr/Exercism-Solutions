public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        double threshold = 1.0;
        double value = daysSkipped >= 5 ? threshold * (threshold - 0.15) : threshold;
        return value;
    }

    public int bonusMultiplier(int productsSold) {
        int multiplier = 10;
        int result = productsSold >= 20 ? multiplier = 13 : multiplier;
        return result;
    }

    public double bonusForProductsSold(int productsSold) {
        return bonusMultiplier(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salaryBase = 1000.00;
        double result = salaryBase * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
        return result <= 2000.00 ? result : 2000.00;
    } 
}
