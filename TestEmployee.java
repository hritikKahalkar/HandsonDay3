/*Employee salary and details2*/

public class TestEmployee {

	public static void main(String[] args) {

		Employee e = new Employee();
		e.setName("Hritik");
		e.setSalary(4000000);
		e.setYearOfJoining(2022);
		e.setNin("ABC");
		System.out.println(e.getName());
		System.out.println(e.getSalary());
		System.out.println(e.getYearOfJoining());
		System.out.println(e.getNin());


	}

}
