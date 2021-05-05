
public class EmployeeTester {
	public static void main(String [] args) {
		Employee[] arr = new Employee[10];
		arr[0] = new Cashier("Johny Mathis", "100 Famous Lane");
		arr[1] = new Cashier("Michael Scott", "22 Linden Avenue");
		arr[2] = new Cashier("Dorothy", "132 Old Town Road");
		arr[3] = new Supervisor("Clark Kent", "85 Gotham Boulevard");
		arr[4] = new Cashier("Debra Astor", "154 92 St.");
		arr[5] = new Cashier("Mark Sloane", "Middle Street");
		arr[6] = new Cashier("Louis", "Louis's Lemons Dealership");
		arr[7] = new Supervisor("Jacob Sigman", "125 Roxbury Road");
		arr[8] = new Cashier("Care Bear", "20 Rainbow Road");
		arr[9] = new Cashier("Dog", "Rover Street");
		
		for (Employee e:arr)
			System.out.println(e);
	}
}
