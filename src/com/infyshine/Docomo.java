package com.infyshine;

public class Docomo implements SIM {
	
		public String sendSMS(String msg, long mobilenumber) {
			return "Docomo : Your SMS Send successfully";
		}
		public String dialCall(long mobilenum) {
			return "Docomo : The number you are dialing is busy";
		}
		

	}


