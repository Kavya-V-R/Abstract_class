package com.xworkz.OnlineConference;

abstract public class OnlineConferencePlatform {

	public void joinConference(String link) {
		System.out.println("joined to conference");
	}
	
	public void leaveConference() {
		System.out.println("leave conference"); 
	}
	abstract public void presentation();
}

