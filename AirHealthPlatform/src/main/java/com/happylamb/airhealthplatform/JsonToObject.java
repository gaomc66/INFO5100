/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.happylamb.airhealthplatform;
import com.google.gson.Gson; 
/**
 *
 * @author gaomc
 */
public class JsonToObject { 

	public static void main(String[] args) 
	{ 
		// Creating object of Organisation 
		Org org = new Org(); 

		// Converting json to object 
		org = getOrganisationObject(); 

		// Displaying object 
		System.out.println(org); 
	} 

	private static Org getOrganisationObject() 
	{ 
		// Storing preprocessed json(Added slashes) 
		String OrganisationJson 
			= "{\"organisation_name\""
			+ ": \"GeeksforGeeks\"," 
			+ "\"description\""
			+ ": \"A computer Science portal for Geeks\","
			+ "\"Employee\""
			+ ": \"2000\"}"; 

		// Creating a Gson Object 
		Gson gson = new Gson(); 

		// Converting json to object 
		// first parameter should be prpreocessed json 
		// and second should be mapping class 
		Org organisation 
			= gson.fromJson(OrganisationJson, 
					Org.class); 

		// return object 
		return organisation; 
	} 
} 

