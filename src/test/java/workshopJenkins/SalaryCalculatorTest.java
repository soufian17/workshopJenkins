package workshopJenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SalaryCalculatorTest {
	private SalaryCalculator salaryCalculator;

	@BeforeEach
	void init() {
		salaryCalculator = new SalaryCalculator();
	}

	@Test
	void testBasicSalaryWithInValidSalary() {
		assertThrows(IllegalArgumentException.class, () -> salaryCalculator.setSalary(-1));
	}

	@Test
	void testSalaryCalculatorWithValidSalary() {
		double salary = 1200;
		salaryCalculator.setSalary(1200);
		double expectedInsuranceMoney = salary * 0.15;
		assertEquals(expectedInsuranceMoney, salaryCalculator.getInsuranceMoney());
		double expectedBonusMoney = salary / 10;
		assertEquals(expectedBonusMoney, salaryCalculator.getSalaryBonus());
		double expectedTotalMoney = salary + expectedInsuranceMoney + expectedBonusMoney;
		assertEquals(expectedTotalMoney, salaryCalculator.getTotalSalary());
	}

	@AfterEach
	void tearDown() {
		salaryCalculator = null;
	}
}