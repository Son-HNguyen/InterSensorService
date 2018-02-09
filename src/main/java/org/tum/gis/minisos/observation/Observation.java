package org.tum.gis.minisos.observation;

import java.util.Date;

import org.joda.time.DateTime;
import org.springframework.expression.ParseException;
import org.tum.gis.minisos.util.CustomDateUtil;

public class Observation {

	//private int timeseriesId;
	private String time;
	private String timestamp;
	private double value;
	
	private Date dateEval;
	private DateTime date;
	
	public Observation() {
		
	}
	
	public Observation( String time, double value) {
		super();
		
		this.time = time;
		this.value = value;
	}
	
	
	
	public String getTime() throws java.text.ParseException {			
		
		try {
			dateEval = CustomDateUtil.DateTimePatternEval(time) ;
			
			try {
				date = CustomDateUtil.DateTimeCreator(dateEval);
			} catch (ParseException e) {
				System.err.println("Could not parse date: " + dateEval);
			}
		} catch (ParseException e) {
			System.err.println("Could not parse date: " + time);
		}
				
		//this.timestamp = CustomDateUtil.IsoFormatter(date);	
		this.timestamp = date.toString();
		return timestamp;
	}
	
	public void setTime(String time) {		
		this.time = time;
	}
	
	public double getValue() {
				return value;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
	
	
}