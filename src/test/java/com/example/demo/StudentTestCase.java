package com.example.demo;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentTestCase {
	
@Autowired
	StudentRepo repo;
    Student s;
    Passport p;
    Scanner sc;
    
    @Before
    public void init() {
    	s=new Student();
		p=new Passport();
		sc=new Scanner(System.in);
    }
    @Test
	public void  insertTest() {
		System.out.println("Enter the Student details");
		System.out.println("Enter the Student ID");
		s.setId(sc.nextInt());
		System.out.println("Enter the Student Name");
		s.setName(sc.next());
		System.out.println("Enter the Student Email");
		s.setEmail(sc.next());
		System.out.println("Enter the Passport details");
		System.out.println("Enter the Passport ID");
		p.setId(sc.nextInt());
		System.out.println("Enter the Passport Number");
		p.setNumber(sc.next());
		s.setPassport(p);
		assertNotNull(repo.save(s));
		System.out.println(s);
		System.out.println(p);
	}
    
@After
public void deinit() {
	s=null;
	p=null;
	sc=null;
	
}

}
