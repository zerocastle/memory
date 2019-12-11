package study.service;

import study.vo.Student;

public class Service {

	private Student student;

	private String order;

	public Service() {
		// TODO Auto-generated constructor stub

		if (this.order == "/search") {
			for (int i = 0; i < student.getStudent().size(); i++) {

			}
		}
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

}
