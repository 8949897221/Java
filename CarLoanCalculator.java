import java.util.Scanner;

class Loan {
    protected double principal;
    protected double rateOfInterest;
    protected int years;

    public Loan(double principal, double rateOfInterest, int years) {
        this.principal = principal;
        this.rateOfInterest = rateOfInterest;
        this.years = years;
    }

    public double calculateInterest() {
        return (principal * rateOfInterest * years) / 100;
    }
}

class CarLoan extends Loan {
    private double processingCharge;

    public CarLoan(double principal, double rateOfInterest, int years, double processingCharge) {
        super(principal, rateOfInterest, years);
        this.processingCharge = processingCharge;
    }

    public double totalCost() {
        return calculateInterest() + processingCharge;
    }
}

public class CarLoanCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double principal = scanner.nextDouble();
        double rateOfInterest = scanner.nextDouble();
        int years = scanner.nextInt();
        double processingCharge = scanner.nextDouble();
        
        CarLoan carLoan = new CarLoan(principal, rateOfInterest, years, processingCharge);
        double interest = carLoan.calculateInterest();
        double total = carLoan.totalCost();
        
        System.out.printf("Total Interest: %.2f\n", interest);
        System.out.printf("Total Cost: %.2f\n", total);
        
        scanner.close();
    }
}