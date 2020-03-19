import java.util.Arrays;

public class Exercise {

	public static void main(String[] args) {
		Student[] s = new Student[4];
		s[0] = new Student("Tanja", 25);
		s[1] = new Student("Max", 30);
		s[2] = new Student("Erik", 20);
		s[3] = new Student("Monika", 40);

		Arrays.sort(s);

		for (Student student : s) {
			System.out.println(student.getName());
		}
	}
}