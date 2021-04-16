package com.infyshine;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MobileUser extends Micromax  {

	public static void main(String[] args) throws Exception{

	   Micromax iphone = new Micromax();
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   System.out.println("Inset SIM");
	   String simName = br.readLine();
	   iphone.insertSIM(simName);
	   
	   System.out.println();
	   
	   System.out.println("Type 1 and press <Enter> key to SEND SMS");
	   System.out.println("Type 2 and press <Enter> key to Make Call\n");
	   
	   System.out.println("Enter option:");
	   String option = br.readLine();
	   
	   String resp;
	   
	   if(option.contains("1")) {
		   System.out.println("Type message number and press <Enter> key:");
		   String msg = br.readLine();
		   
		   System.out.println("Type mobile num and press <Enter> key:");
		   String mobilenumber = br.readLine();
		   
		   resp = Micromax.sendSMS(msg, Long.parseLong(mobilenumber));
		   System.out.println(resp);
		  }
	   else if(option.contains("2")){
		   System.out.println("Type mobile number and press <Enter> key:");
           String mobilenumber = br.readLine();
           
           resp = Micromax.dialCall(msg, Long.parseLong(mobilenumber));
		   System.out.println(resp);
	   }
	   else {
		   System.out.println("Invalid Option");
           
           
	   }
	}




	}


