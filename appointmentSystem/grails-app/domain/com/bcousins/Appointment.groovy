package com.bcousins

class Appointment {

	int appID;
	Date appDate;
	String appTime;
	int appDuration;
	String roomNumber;
	String toString(){
	return appID
	}

    static constraints = {

	appDate nullable: false, blank: false
	appTime nullable: false, blank: false
	appDuration nullable: false, blank: false
	roomNumber nullable: false, blank: false
    }
}
