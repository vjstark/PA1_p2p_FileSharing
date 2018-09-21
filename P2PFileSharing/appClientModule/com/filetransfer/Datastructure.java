package com.filetransfer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.MultivaluedHashMap;

public class Datastructure {

	public static void main(String[] args){
	// TODO Auto-generated method stub

		Collection<ArrayList<String>> array3 = new ArrayList<ArrayList<String>>();
		MultivaluedMap<String, ArrayList<String>> maping = new MultivaluedHashMap<>();
		ArrayList<String> array1 = new ArrayList<String>();
		array1.add("hehe");
		array1.add("de");
		ArrayList<String> array2 = new ArrayList<String>();
		array2.add("haha");
		array2.add("da");
		ArrayList<String> array5 = new ArrayList<String>();
		array5.add("my name");
		array5.add("is ");
		array5.add("pranav");
		
		maping.add("Pranav", array1);
		maping.add("Pranav", array2);
		maping.add("Pranav", array5);
		
		array3= maping.get("Pranav");
		System.out.println(maping);
		for(ArrayList<String> als : array3){
			System.out.println("Value of : "+ als.get(1));
		}		
	}
	
}
