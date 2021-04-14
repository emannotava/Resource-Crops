package com.mememan.resourcecrops.builder.test;

import java.time.*;

public class SimpleTimeClient implements ITimeClient {
	
	private LocalDateTime dateAndTime;
	
	public SimpleTimeClient() {
		dateAndTime = LocalDateTime.now();
	}
	
	public void setTime(int hour, int minute, int second) {
		LocalDate currentDate = LocalDate.from(dateAndTime);
		LocalTime timeToSet = LocalTime.of(hour, minute, second);
		dateAndTime = LocalDateTime.of(currentDate, timeToSet);
	}
	
	public void setDate(int day, int month, int year) {
		LocalDate dateToSet = LocalDate.of(day, month, year);
		LocalTime currentTime = LocalTime.from(dateAndTime);
		dateAndTime = LocalDateTime.of(dateToSet, currentTime);
	}
	
	public void setDateAndTime(int day, int month, int year, int hour, int minute, int second) {
		LocalDate dateToSet = LocalDate.of(day, month, year);
		LocalTime timeToSet = LocalTime.of(hour, minute, second); 
		dateAndTime = LocalDateTime.of(dateToSet, timeToSet);
	}
	
	public LocalDateTime getLocalDateTime() {
		return dateAndTime;
	}
	
	public String toString() {
		return dateAndTime.toString();
	}
	
	public static void main(String... args) {
		ITimeClient myTimeClient = new SimpleTimeClient();
		System.out.println(myTimeClient.toString());
	}
}