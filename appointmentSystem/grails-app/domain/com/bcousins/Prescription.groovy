package com.bcousins

class Prescription {
	static belongsTo = Doctor

	String pharmacyName
	int prescriptionNumber
	String medicine
	float totalCost
	Date dateIssued
	Boolean patientPaying

	
	
	String toString(){
	return prescriptionNumber
	}


    static constraints = {

	pharmacyName nullable: false, blank: false
	prescriptionNumber nullable: false, blank: false
	medicine nullable: false, blank: false
	totalCost nullable: false, blank: false
	dateIssued nullable: false, blank: false
	patientPaying nullable: false, blank: false

    }
}
