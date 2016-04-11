package com.team11.week5;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainProgram {
	private static Logger log;
	private static Scanner scan = new Scanner(System.in);
	public int temp = 0;
	MainProgram(String[] args) {
		
	}
	
	public static void main(String[] args){
		MainProgram mp = new MainProgram(null);
		mp.temp = 3;
		mp = null;
		
		if(args.length != 0) {
			scan = new Scanner(args[0] + " " + args[1] + " " + args[2]);
		}
		
		log = Logger.getLogger("Logger");
		
		InfoGetter userInfo = new InfoGetter(scan);
		
		Calculator calc = new Calculator(userInfo);
		
		log.log(Level.INFO, calc.sumTotalRate());
		
		scan.close();
	}
	

}
