package model;

public interface Student extends Comparable<Student> {
	public String getName();
	public String getMatrNr();
	public double getAvgGrade();
}
