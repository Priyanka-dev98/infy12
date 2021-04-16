package com.infyshine;

public interface SIM {
	public String sendSMS(String msg, long mobilenum);
	public String dialCall(long mobilenum);

}
