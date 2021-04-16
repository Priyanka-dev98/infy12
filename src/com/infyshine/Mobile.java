package com.infyshine;

public class Micromax {
	private SIM sim;
	
	public void insertSIM(String simName) throws Exception{
		Class simclass = Class.forName(simName);
		Object simobject = simclass.newInstance();
		
		if(simobject instanceof SIM) {
			sim = (SIM) simobject;
			}
		else {
			throw new Exception("Invalid SIM");
			}
	}
		
		public String sendSMS(String msg, long mobilenum)
		{
		  return sim.sendSMS(msg,mobilenum);	
		}
		public String dialCall(long mobilenum) {
			return sim.dialCall(mobilenum);
		}
}
