public class Student implements Comparable<Student> {

	private String name;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	@Override
	public int compareTo(Student o) {
		return Integer.compare(o.getAge(), age);
	}
}
