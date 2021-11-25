package com.xworkz.InterviewPortal;

abstract public class InterviewApp {
	public void login(String userName, String pasword) {
		System.out.println("login successfull!!");
	}

	public void logout() {
		System.out.println("logout successful");
	}

	public void interviewSchedule(int rollnumber) {
		System.out.println("view schedule");
	}

	public void viewResult(int rollNumber, String captcha) {
		System.out.println("scored 88");
	}

	abstract public void prepareQuetionSet();

	abstract public void takeTest();
}
