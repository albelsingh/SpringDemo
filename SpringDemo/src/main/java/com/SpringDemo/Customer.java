package com.SpringDemo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Customer 
{
	private List<Person> lists;
	private Set<Person> sets;
	private Map<Integer, Object> maps;
	private Properties pros;
	

	
	public Map<Integer, Object> getMaps() {
		return maps;
	}
	public void setMaps(Map<Integer, Object> maps) {
		this.maps = maps;
	}
	public List<Person> getLists() {
		return lists;
	}
	public void setLists(List<Person> lists) {
		this.lists = lists;
	}
	public Set<Person> getSets() {
		return sets;
	}
	public void setSets(Set<Person> sets) {
		this.sets = sets;
	}
	
	
	public Properties getPros() {
		return pros;
	}
	public void setPros(Properties pros) {
		this.pros = pros;
	}
	
	public void showDetails()
	{
		for(Person list: lists)
		{
		System.out.println("List Detail are = (" +list.getName()+"," + list.getAddress() + ","+list.getAge() +")");

		}
		
		for(Person set: sets)
		{
		System.out.println("Set Detail are = (" +set.getName()+"," + set.getAddress() + ","+set.getAge() +")");
		}
		
		for(Map.Entry<Integer, Object> entry : maps.entrySet()) {
		      System.out.println("Key : " + entry.getKey() + " value : " + entry.getValue());
		    }
		
	}
	
}