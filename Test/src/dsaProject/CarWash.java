package dsaProject;

public class CarWash {
private String name;
private String program;

public CarWash(String name, String program) {
	setName(name);
	setProgram(program);
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getProgram() {
	return program;
}
public void setProgram(String program) {
	this.program = program;
}
@Override
public String toString() {
	return "CarWash [name=" + name + ", program=" + program + "]";
}

}
