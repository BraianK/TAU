package studentdatabaseapp;

public class StudentOperations {
	
	public float discount(float tuitionBalance) {
		return (float) (tuitionBalance * 0.3);

	}
	public boolean isTuitionToPay(float tuitionBalance) {
		if(tuitionBalance >= 0) {
			return true;
		}else {
			return false;
		}

	}
	
}
