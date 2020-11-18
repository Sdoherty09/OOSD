package lab6;

import java.util.Arrays;

public class Student extends Person {
private int numCourses;
private String[] courses=new String[0];
private int[] grades=new int[0];

public Student(String name, String address) {
	super(name, address);
}
public int getNumCourses() {
	return numCourses;
}
public void setNumCourses(int numCourses) {
	this.numCourses = numCourses;
}
public String[] getCourses() {
	return courses;
}
public void setCourses(String[] courses) {
	this.courses = courses;
}
public int[] getGrades() {
	return grades;
}
public void setGrades(int[] grades) {
	this.grades = grades;
}
public void addCourseGrade(String course, int grade)
{
	String[] stringTemp=new String[courses.length+1];
	int[] intTemp=new int[grades.length+1];
	for(int i=0;i<courses.length;i++)
	{
		stringTemp[i]=courses[i];
	}
	stringTemp[stringTemp.length-1]=course;
	for(int i=0;i<grades.length;i++)
	{
		intTemp[i]=grades[i];
	}
	intTemp[intTemp.length-1]=grade;
	setCourses(stringTemp);
	setGrades(intTemp);
}
public void printGrades()
{
	for(int i=0;i<getGrades().length;i++)
	{
		System.out.println("Course: "+getCourses()[i]+", grade: "+getGrades()[i]);
	}
}
public double getAverageGrade()
{
	int total=0;
	for(int i=0;i<getGrades().length;i++)
	{
		total+=getGrades()[i];
	}
	total/=getGrades().length;
	return total;
}
@Override
public String toString() {
	return "Student [numCourses=" + numCourses + ", courses=" + Arrays.toString(courses) + ", grades="
			+ Arrays.toString(grades) + "]";
}

}
