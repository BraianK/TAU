package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import studentdatabaseapp.Student;
import studentdatabaseapp.StudentOperations;

class StudentOperationsTest {

	@Test
    public void discountTest() {
        StudentOperations opr = new StudentOperations();   
        float result = opr.discount(600);
        assertEquals(180, result);
    }

}
