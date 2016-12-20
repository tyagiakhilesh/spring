package com.practice.akhilesh;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class ABeanHavingCollections {
	List<String> aList;
	Map<String, String> aMap;
	Properties properties;
	String name;
	public ABeanHavingCollections(final String aName) {
		this.name = aName;
	}
	
	public List<String> getaList() {
		return aList;
	}
	public void setaList(List<String> aList) {
		this.aList = aList;
	}
	public Map<String, String> getaMap() {
		return aMap;
	}
	public void setaMap(Map<String, String> aMap) {
		this.aMap = aMap;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
}
