package entities;

public class Student {
	public String name;
	public double t1;
	public double t2;
	public double t3;
	
	public double sumGrades() {
		return t1 + t2 + t3;
	}
	public String checkPassed() {
		return (sumGrades() >= 60)? "PASS":"FAILED" + System.lineSeparator() + "MISSING " +(60 - sumGrades())+" POINTS";
	}
}
