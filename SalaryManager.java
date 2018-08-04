public class SalaryManager {
    public static void main(String args[]){
        SalaryManager Salary=new SalaryManager();
        Salary.getMonthlySalary(20000000);
    }
    public double getMonthlySalary(int yearlySalary){
        double MonthlySalary=yearlySalary/12.0;
        calculateTax(MonthlySalary);
        calculateNationalPension(MonthlySalary);
        calculateHealthInsurance(MonthlySalary);
        double TotalTax;
        TotalTax=calculateTax(MonthlySalary)+calculateNationalPension(MonthlySalary)+calculateHealthInsurance(MonthlySalary);
        MonthlySalary-=TotalTax;
        System.out.println("한 달 급여는 "+MonthlySalary);
        return MonthlySalary;
    }
    public double calculateTax(double monthSalary){
        double Tax=monthSalary*0.125;
        System.out.println("근로 소득세 "+Tax);
        return Tax;
    }
    public double calculateNationalPension(double monthSalary){
        double NationalPension=monthSalary*0.081;
        System.out.println("국민 연금 "+NationalPension);
        return NationalPension;
    }
    public double calculateHealthInsurance(double monthlySalary){
        double HealthInsurance=monthlySalary*0.135;
        System.out.println("건강 보험료 "+HealthInsurance);
        return HealthInsurance;
    }
}
