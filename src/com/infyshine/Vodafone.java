package com.infyshine;

public class Vodafone implements SIM{
		public String sendSMS(String msg, long mobilenumber) {
			return "Vodafone : Your SMS Send successfully";
		}
		public String dialCall(long mobilenum) {
			return "Vodafone : The number you are dialing is busy";
		}
		

	}

