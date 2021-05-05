abstract class Employee {
	private String name, address;
	private int basicSalary;
	
	public String getName(){ return name; }
	
	public String getAddress(){ return address; }
	
	public int getBasicSalary(){ return basicSalary; }
	
	public void setAddress(String add){ address = add; }
	
	public void setName(String nm){ name = nm; }
	
	public void setBasicSalary(int  sal){ basicSalary = sal; }
	
	public abstract int getMonthlySalary();
	
	@Override public String toString() {
		return "\nMonthly Salary: " + getMonthlySalary() + "\nYearly Salary: " + getBasicSalary() + "\nName: " + getName() + "\nAddress: " + getAddress();
	}

}

