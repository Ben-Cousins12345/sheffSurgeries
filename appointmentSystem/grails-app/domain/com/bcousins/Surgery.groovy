package com.bcousins

class Surgery {

	String name;
	String address;
	String postcode;
	String telephone;
	int numberOfPatients;
	String description;
	String openingTime;

	static hasMany=[doctors:Doctor, receptionists:Receptionist, nurses:Nurse]
	String toString(){
	return name
	}

    static constraints = {


	name nullable: false, blank: false
	address nullable: false, blank: false
	postcode nullable: false, blank: false
	telephone nullable: false, blank: false
	numberOfPatients nullable: false, blank: false
	description nullable: false, blank: false
	openingTime nullable: false, blank: false
    }
}
