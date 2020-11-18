package lab6;

public class Teacher extends Person {
private int numCourses;
private String[] courses=new String[0];
public Teacher(String name, String address) {
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
public boolean addCourse(String course)
{
	String[] stringTemp=new String[getCourses().length+1];
	for(int i=0;i<courses.length;i++)
	{
		stringTemp[i]=courses[i];
	}
	stringTemp[stringTemp.length-1]=course;
	setCourses(stringTemp);
	return true;
}
public boolean removeCourse(String course)
{
	int increment=0;
	for (int i=0;i<getCourses().length;i++)
	{
		if(getCourses()[i].equals(course))
		{
			increment++;
		}
	}
	if(increment!=0)
	{
		String[] stringTemp=new String[getCourses().length-increment];
		increment=0;
		for(int i=0;i<getCourses().length;i++)
		{
			if(!(getCourses()[i].equals(course)))
			{
				stringTemp[increment]=getCourses()[i];
			}
		}
		setCourses(stringTemp);
		return true;
	}
	else
	{
		return false;
	}
}
}
