package com.bcousins

class Nurse {

	String nurseName;
	String qualifications;
	String nurseEmail;
	String nurseOffice;
	String nursePhone;
	Surgery surgery;

	String toString(){
	return nurseName
	}

    static constraints = {

	nurseName nullable: false, blank: false
	qualifications nullable: false, blank: false
	nurseEmail nullable: false, blank: false
	nurseOffice nullable: false, blank: false
	nursePhone nullable: false, blank: false
    }
}
