package com.service;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class MangoDatabaseService {

	/**** Connect to MongoDB ****/
	// Since 2.10.0, uses MongoClient
	private MongoClient mongo = null;

	/**** Get database ****/
	// if database doesn't exists, MongoDB will create it for you
	private DB db = null;

	/**** Get collection / table from 'testdb' ****/
	// if collection doesn't exists, MongoDB will create it for you
	private DBCollection table = null;

	@SuppressWarnings("deprecation")
	public MangoDatabaseService() {
		this.mongo = new MongoClient("localhost", 27017);
		this.db = mongo.getDB("testdb");
		this.table = db.getCollection("user");
	}

	public void find(BasicDBObject searchQuery) {
		DBCursor cursor = this.table.find(searchQuery);
		while (cursor.hasNext()) {
			System.out.println(cursor.next());
		}
	}
	public void insert(BasicDBObject document) {
		this.table.insert(document);
	}

	public void update() {

	}

	public void delete() {

	}

}
