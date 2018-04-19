package org.tum.gis.minisos.dataSourceConnection.sensorThings.datastreams;

public class UnitOfMeasurement {

	private String symbol;
	private String name;
	private String definition;
	
	public UnitOfMeasurement() {
		
	}
	public UnitOfMeasurement(String symbol, String name, String definition) {
		super();
		this.symbol = symbol;
		this.name = name;
		this.definition = definition;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDefinition() {
		return definition;
	}
	public void setDefinition(String definition) {
		this.definition = definition;
	}
	
	
}
