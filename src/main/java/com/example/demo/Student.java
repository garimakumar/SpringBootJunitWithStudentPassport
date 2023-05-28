package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data  //used to add getter ,setters,default constructor,constructor with fields
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id") //Here we are using property="id" because
                                                                        //we r making student id as the F.K for the passport table
                                                                        //i.e student_id
//We use this @Json....annotation to send the jsondata
//from client POSTMAN to server(controller).Here there is no
//use of POSTMAN over here so, @json is not required
public class Student {
@Id
	private int id;
	private String name;
	private String email;
@OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    private Passport passport;  //acts as a foreign key over here
}
