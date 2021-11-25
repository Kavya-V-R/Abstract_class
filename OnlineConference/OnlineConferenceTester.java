package com.xworkz.OnlineConference;

public class OnlineConferenceTester {
	public static void main(String[] args) {
		GoogleMeetConference Googlemeet = new GoogleMeetConference();
		Googlemeet.joinConference("chf-kuh-kjg");
		Googlemeet.leaveConference();
		Googlemeet.presentation();
	}
}
