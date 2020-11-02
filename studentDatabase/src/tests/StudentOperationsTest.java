package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import studentdatabaseapp.Student;
import studentdatabaseapp.StudentOperations;

class StudentOperationsTest {
	StudentOperations opr = new StudentOperations();  

	@Test
    public void discountTest() {
         
        float result = opr.discount(600);
        assertEquals(180, result);
    }
	@Test
    public void isTuitionToPayTest() {
		float tuitionBalance = 600;
        boolean isTuitionToPay = opr.isTuitionToPay(tuitionBalance);
        assertEquals(true, isTuitionToPay);
    }
	@Test
    public void isNotTuitionToPayTest() {
		float tuitionBalance = 0;
        boolean isTuitionToPay = opr.isTuitionToPay(tuitionBalance);
        assertEquals(false, isTuitionToPay);
    }

}
