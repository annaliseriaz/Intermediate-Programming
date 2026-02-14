package exam;

public class S_one_Exam {

	public static void main(String[] args) {
		String s1 = "Exam";
		String s2 = "Exam";
		String s3 = new String("Exam");
		System.out.print(s1 == s3);
		System.out.print(s1.equals(s3));
	}
}
