package workshopJenkins;

public class SalaryCalculator {
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary < 0) {
			throw new IllegalArgumentException("Salary can't be negative.");
		}
		this.salary = salary;
	}

	public double getInsuranceMoney() {
		return (salary * 15) / 100;
	}

	public double getSalaryBonus() {
		return salary * 0.1;
	}
	public void Test()
	{
		
	}

	public double getTotalSalary() {
		return getSalary() + getInsuranceMoney() + getSalaryBonus();
	}
}