//Time-Conversion

import java.util.*;  

class conversion{
	int years=00, weeks=00, days=00, hours=00, minutesA=00, secondsA=00;
	public void conv(int mt, int sc){
		int x;
		
		if(sc>=60){
			x=sc/60;
			sc=sc%60;
			mt=mt+x;
		}
		
		if(mt>=60){
			x=mt/60;
			mt=mt%60;
			hours=hours+x;
		}
		
		if(hours>=24){
			x=hours/24;
			hours=hours%24;
			days=days+x;
		}
		
		if(days>=365){
			x=days/365;
			days=days%365;
			years=years+x;
		}
		
		if(days>=7){
			x=days/7;
			days=days%7;
			weeks=weeks+x;
		}
		
		System.out.println("Years : " + years);
		System.out.println("Weeks : " + weeks);
		System.out.println("Days : " + days);
		System.out.println("Hours : " + hours);
		System.out.println("Minutes : " + mt);
		System.out.println("Seconds : " + sc);
	}
}

public class MainClass extends conversion{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Time in Munutes and seconds...");
		System.out.print("Munutes: ");
		int min= sc.nextInt();  
		System.out.print("Seconds: ");
		int sec= sc.nextInt();  
		MainClass obj = new MainClass();
		obj.conv(min, sec);
	}
}
