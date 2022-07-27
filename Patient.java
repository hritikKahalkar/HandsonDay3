/*3) Design a class that can be used by a health care professional to keep track of a patient’s vital statistics. The following are the details.

Name of the class - Patient

Member Variables - patientName(String),height(double),width(double)

Member Function - double computeBMI()

The above method should compute the BMI and return the result. The formula for computation of BMI is weight (in kg) ÷ height*height(in metres).

Create an object of the Patient class and check the results.*/
public class Patient {
	String patientName;
	double height, weight;
	
	double computeBMI()
	{
		double BMI;
		BMI = weight/(height*height);
		return (BMI);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient ob = new Patient();
		ob.patientName = "Hritik";
		ob.height = 5.4;
		ob.weight = 65;
		
		System.out.println("BMI of "+ob.patientName+" is " +ob.computeBMI());

	}

}
