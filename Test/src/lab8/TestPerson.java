package lab8;

public class TestPerson {

	public static void main(String[] args) {
		Employee emp=new Employee("Tom",60000);
		Student stu=new Student("Mary","Programming");
		Person[] person=new Person[2];
		person[0]=emp;
		person[1]=stu;
		for(int i=0;i<person.length;i++)
		{
			System.out.println("Name: "+person[i].getName()+" Description: "+person[i].getDescription());
		}
	}

}
