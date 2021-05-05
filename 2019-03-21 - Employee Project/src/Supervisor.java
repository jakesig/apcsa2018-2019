
public class Supervisor extends Employee {
	public Supervisor(String name, String address)  {
		setBasicSalary(60000);
		setName(name);
		setAddress(address);
	}
	
	public int getMonthlySalary() {
		int salary = getBasicSalary()/12;
		double bonus = getBasicSalary()*0.1;
		salary*=(int)(bonus);
		return salary;
	}
}
