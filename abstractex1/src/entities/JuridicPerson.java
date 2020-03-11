package entities;

public class JuridicPerson extends Person {

	private Integer employeesNumber;

	public JuridicPerson() {
	}

	public JuridicPerson(String name, Double annualIncome, Integer employeesNumber) {
		super(name, annualIncome);
		this.employeesNumber = employeesNumber;
	}

	public Integer getEmployeesNumber() {
		return employeesNumber;
	}

	public void setEmployeesNumber(Integer employeesNumber) {
		this.employeesNumber = employeesNumber;
	}

	@Override
	public Double taxCalculation() {
		if (employeesNumber <= 10) {
			return getAnnualIncome() * 0.16;
		} else {
			return getAnnualIncome() * 0.14;
		}
	}

}
