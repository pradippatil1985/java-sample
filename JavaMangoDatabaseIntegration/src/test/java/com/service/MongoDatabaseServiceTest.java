package com.service;

import java.util.Date;

import org.junit.Test;

import com.mongodb.BasicDBObject;

import junit.framework.TestCase;

public class MangoDatabaseServiceTest extends TestCase {
	
	private MangoDatabaseService mangoDatabaseService = new MangoDatabaseService();

	@Test
	public void testInsertData() {
		/**** Insert ****/
		// create a document to store key and value
		BasicDBObject document = new BasicDBObject();
		document.put("name", "Pradip");
		document.put("age", 30);
		document.put("createdDate", new Date());
		this.mangoDatabaseService.insert(document);
		
		findData();
	}
	
	public void findData() {
		/**** Find and display ****/
		BasicDBObject searchQuery = new BasicDBObject();
		searchQuery.put("name", "Pradip");
		this.mangoDatabaseService.find(searchQuery);
		
		updateData();
	}
	
	public void updateData() {
		/**** Update ****/
		// search document where name="pradip" and update it with new values
		BasicDBObject query = new BasicDBObject();
		query.put("name", "Pradip");
		
		BasicDBObject newDocument = new BasicDBObject();
		newDocument.put("name", "Aparna");

		this.mangoDatabaseService.update(query, newDocument);
		
		findUpdatedData();
	}
	
	public void findUpdatedData() {
		/**** Find and display ****/
		BasicDBObject searchQuery = new BasicDBObject();
		searchQuery.put("name", "Aparna");
		this.mangoDatabaseService.find(searchQuery);
	}
}
