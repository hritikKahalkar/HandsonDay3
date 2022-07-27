/*Employee salary and details1*/
public class Employee extends Person {
	
	public static double salary;
	public static int yearOfJoining;
	public static String nin;
	public static double getSalary() {
		return salary;
	}
	

	public static int getYearOfJoining() {
		return yearOfJoining;
	}


	public static void setYearOfJoining(int yearOfJoining) {
		Employee.yearOfJoining = yearOfJoining;
	}


	public static String getNin() {
		return nin;
	}


	public static void setNin(String nin) {
		Employee.nin = nin;
	}


	public static void setSalary(double salary) {
		Employee.salary = salary;
	}

}
