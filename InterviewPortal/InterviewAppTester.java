package com.xworkz.InterviewPortal;

public class InterviewAppTester {
	public static void main(String[] args) {
		InfosysOnlineInterviewPortal infosys = new InfosysOnlineInterviewPortal();
		infosys.login("kavya", "kav@123");
		infosys.interviewSchedule(14526);
		infosys.prepareQuetionSet();
		infosys.takeTest();
		infosys.viewResult(123, "25AdT1");
		infosys.logout();
	}
}
