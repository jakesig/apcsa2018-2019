
public class Cashier extends Employee {
	public Cashier(String name, String address) {
		setBasicSalary(30000);
		setName(name);
		setAddress(address);
	}
	
	@Override public int getMonthlySalary() {
		return getBasicSalary()/12;
	}
}
