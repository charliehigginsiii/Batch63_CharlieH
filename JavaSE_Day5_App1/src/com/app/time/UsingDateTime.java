package com.app.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.util.Date;

/**
 * 
 * @author Charlie Higgins
 * @date   Sep 24, 2022
 */
public class UsingDateTime {
	public static void main(String[]args) {
		/*
		 LocalDate
		 LocalTime
		 LocalDateTime
		 ZoneID
		 Peread
		 Year
		 */
		LocalDate date=LocalDate.now();
		LocalDate yesterday=date.minusDays(1);
		LocalDate tommorow=date.plusDays(1);
		System.out.println(date.toString());
		System.out.println(yesterday.toString());
		System.out.println(tommorow.toString());
		LocalTime time=LocalTime.now();
		System.out.println(time.toString());
		LocalDateTime datetime=LocalDateTime.now();
		System.out.println(datetime.toString());
		Year year=Year.now();
		ZoneId id=ZoneId.of("Africa/Lagos");
		//System.out.println(id.getAvailableZoneIds());
		LocalDateTime ex1=LocalDateTime.now(id);
		Period p=Period.ofDays(9);
		System.out.println(ex1.toString());
		System.out.println(p.addTo(ex1));
		System.out.println(year.toString());
		
	}
}
