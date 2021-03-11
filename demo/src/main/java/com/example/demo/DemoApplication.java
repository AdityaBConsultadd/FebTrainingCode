package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
/*
	Entity/objects:
	Customer
	Product

	Repos:
	Product
	Customer

	Controller:
	Product
	Customer

	Mapping
	Get:fetch
	Put:update
	Post:write
	Delete:remove

	Generator:
	Auto:  automatically
	Identity: unique (2,34,3)
	sequence: (1,2,4,5)
	table:

	C: Create
	R: Read
	U: update
	D: delete



	database:
	transactions: query
	Jpql: select s from customer s where.........
	native: select * from customer where.....


	@Query



	ORM

	one:one==
	one:many
	many:many
	many:one


	Password
	id: 2312
	password =

 */
