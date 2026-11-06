package PRORGAMMMING_ZERO_ONE;

public class Student {
	
	String name;
	int grade;
	
Student (String name, int grade){
	this.name = name;
	this.grade = grade;
	
}

void dispayinfo() {
	
	if (grade >= 75) {
		System.out.println("Name: " + name);
		System.out.println("Result: " + "Passed\n");
	} else {
		System.out.println("Name: " + name);
		System.out.println("Result: " + "Failed\n");
	}
}
}
