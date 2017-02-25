package com.service;

import java.util.Date;

import org.junit.Test;

import com.mongodb.BasicDBObject;

import junit.framework.TestCase;

public class MangoDatabaseServiceTest extends TestCase {
	
	private MangoDatabaseService mangoDatabaseService = null;

	@Test
	public void testInsertData() {
		this.mangoDatabaseService = new MangoDatabaseService();
		/**** Insert ****/
		// create a document to store key and value
		BasicDBObject document = new BasicDBObject();
		document.put("name", "mkyong");
		document.put("age", 30);
		document.put("createdDate", new Date());
		this.mangoDatabaseService.insert(document);
	}
	
	@Test
	public void testFindData() {
		this.mangoDatabaseService = new MangoDatabaseService();
		/**** Insert ****/
		// create a document to store key and value
		BasicDBObject searchQuery = new BasicDBObject();
		this.mangoDatabaseService.find(searchQuery);
	}

//	public static void main(String[] args) {
//		try {
//
//			/**** Insert ****/
//			// create a document to store key and value
//			BasicDBObject document = new BasicDBObject();
//			document.put("name", "mkyong");
//			document.put("age", 30);
//			document.put("createdDate", new Date());
//			table.insert(document);
//
//			/**** Find and display ****/
//			BasicDBObject searchQuery = new BasicDBObject();
//			searchQuery.put("name", "mkyong");
//
//			DBCursor cursor = table.find(searchQuery);
//
//			while (cursor.hasNext()) {
//				System.out.println(cursor.next());
//			}
//
//			/**** Update ****/
//			// search document where name="mkyong" and update it with new values
//			BasicDBObject query = new BasicDBObject();
//			query.put("name", "mkyong");
//
//			BasicDBObject newDocument = new BasicDBObject();
//			newDocument.put("name", "mkyong-updated");
//
//			BasicDBObject updateObj = new BasicDBObject();
//			updateObj.put("$set", newDocument);
//
//			table.update(query, updateObj);
//
//			/**** Find and display ****/
//			BasicDBObject searchQuery2 = new BasicDBObject().append("name", "mkyong-updated");
//
//			DBCursor cursor2 = table.find(searchQuery2);
//
//			while (cursor2.hasNext()) {
//				System.out.println(cursor2.next());
//			}
//
//			/**** Done ****/
//			System.out.println("Done");
//
//		} catch (UnknownHostException e) {
//			e.printStackTrace();
//		} catch (MongoException e) {
//			e.printStackTrace();
//		}
//
//	}
}
