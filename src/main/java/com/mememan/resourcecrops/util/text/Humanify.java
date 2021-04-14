package com.mememan.resourcecrops.util.text;

import java.util.ArrayList;

public class Humanify {

	public static String convert(String inputString){
		if(check(inputString)=="_"){
			ArrayList<String> storeNewStringArray = new ArrayList<String>();
			String[] inputSplit = inputString.split("_");
			String finalString = "";
			for(int i = 0; i < inputSplit.length; i++){
				storeNewStringArray.add(inputSplit[i].substring(0, 1).toUpperCase() + inputSplit[i].substring(1, inputSplit[i].length()));
			}
			for (String string : storeNewStringArray){
				finalString += string + " ";
			}
			// System.out.println("FILTER ME PLS, K thnks, bye: " + finalString.substring(0, finalString.length() - 1));
			return finalString.substring(0, finalString.length() - 1);
		}else{
			return (inputString.substring(0, 1).toUpperCase() + inputString.substring(1, inputString.length()));
		}
	}

	public static String check(String input){
		if(input.matches(".*_.*")==true){
			return "_";
		}else{
			return null;
		}
	}
}