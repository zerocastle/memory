package study.vo;

import java.util.ArrayList;

public class Student {

	// »ý¼ºÀÚ
	public Student(ArrayList<Student> student, String name, String age, String koreanNum, String englishNum,
			String mathmeticNum, String historyNum) {
		super();
		this.student = student;
		this.name = name;
		this.age = age;
		this.koreanNum = koreanNum;
		this.englishNum = englishNum;
		this.mathmeticNum = mathmeticNum;
		this.historyNum = historyNum;
	}

	private ArrayList<Student> student = null;

	private String name;
	private String age;
	private String koreanNum;
	private String englishNum;
	private String mathmeticNum;
	private String historyNum;

	public ArrayList<Student> getStudent() {
		return student;
	}

	public void setStudent(ArrayList<Student> student) {
		this.student = student;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getKoreanNum() {
		return koreanNum;
	}

	public void setKoreanNum(String koreanNum) {
		this.koreanNum = koreanNum;
	}

	public String getEnglishNum() {
		return englishNum;
	}

	public void setEnglishNum(String englishNum) {
		this.englishNum = englishNum;
	}

	public String getMathmeticNum() {
		return mathmeticNum;
	}

	public void setMathmeticNum(String mathmeticNum) {
		this.mathmeticNum = mathmeticNum;
	}

	public String getHistoryNum() {
		return historyNum;
	}

	public void setHistoryNum(String historyNum) {
		this.historyNum = historyNum;
	}

	@Override
	public String toString() {
		return "Student [student=" + student + ", name=" + name + ", age=" + age + ", koreanNum=" + koreanNum
				+ ", englishNum=" + englishNum + ", mathmeticNum=" + mathmeticNum + ", historyNum=" + historyNum + "]";
	}

}
