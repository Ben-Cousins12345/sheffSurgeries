package com.bcousins

class Doctor {

	String fullName;
	String qualification;
	String position;
	String doctorEmail;
	String password;
	String doctorOffice;
	String doctorPhone;
	String bio;

	static hasMany=[prescriptions:Prescription]
	String toString(){
	return fullName
	}

    static constraints = {

	fullName nullable: false, blank: false
	qualification nullable: false, blank: false
	position nullable: false, blank: false
	doctorEmail nullable: false, blank: false
	password nullable: false, blank: false
	doctorOffice nullable: false, blank: false
	doctorPhone nullable: false, blank: false
	bio nullable: false, blank: false
    }
}
