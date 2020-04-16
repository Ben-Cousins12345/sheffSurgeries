package com.bcousins

class BootStrap {

    def init = { servletContext ->


	def GreenhillPractice=new Surgery(
	name: 'AvenuePractice',
	address: '15 Reney Avenue',
	postcode: 'S8 7GH',
	telephone: '01146869090',
	numberOfPatients: '50',
	description: 'Lorem ipsum dolor sit amet',
	openingTime: '08:00-17:00' ).save()

	def WoodseatsPractice=new Surgery(
	name: 'WoodseatsPractice',
	address: '15 Chesterfield Road',
	postcode: 'S8 2FB',
	telephone: '01149704060',
	numberOfPatients: '70',
	description: 'Lorem ipsum dolor sit amet',
	openingTime: '08:00-17:00' ).save()


	def Doc1=new Doctor(
	fullName: 'Hibert Fell',
	qualification: 'MBChB(Sheffield)',
	position: 'GP, Surgeon',
	doctorEmail: 'hibert@gmail.com',
	password: 'password',
	doctorOffice: '5',
	doctorPhone: '01142678894',
	bio: 'Lorem ipsum dolor sit amet',
	surgery: GreenhillPractice ).save()

	def Doc2=new Doctor(
	fullName: 'Frank Collett',
	qualification: 'MBChB(Sheffield)',
	position: 'GP, Surgeon',
	doctorEmail: 'Frank@gmail.com',
	password: 'password',
	doctorOffice: '5',
	doctorPhone: '01142674527',
	bio: 'Lorem ipsum dolor sit amet',
	surgery: WoodseatsPractice ).save()
	

	def App1=new Appointment(
	appID: '5',
	appDate:new Date('22/5/2020'),
	appTime: '2:30pm',
	appDuration: '30',
	roomNumber: '5',
	doctor: Doc1 ).save()

	def App2=new Appointment(
	appID: '7',
	appDate:new Date('23/5/2020'),
	appTime: '10:00am',
	appDuration: '60',
	roomNumber: '3',
	doctor: Doc2 ).save()
	

	def Rec1=new Receptionist(
	recepName: 'Josh Oneil',
	recepEmail: 'Joshoneil@gmail.com',
	recepUsername: 'JoshOneil',
	recepPassword: 'password',
	recepPhone: '0114109938', 
	surgery: GreenhillPractice ).save()

	def Rec2=new Receptionist(
	recepName: 'Titus Strongman',
	recepEmail: 'titusstrongman@gmail.com',
	recepUsername: 'TitusStrongman',
	recepPassword: 'password',
	recepPhone: '0114667593',
	surgery: WoodseatsPractice ).save()

	def Nur1=new Nurse(
	nurseName: 'Felix Collett',
	qualifications: 'Registered General Nurse',
	nurseEmail: 'felixcollett@gmail.com',
	nurseOffice: '15',
	nursePhone: '0114455698',
	surgery: GreenhillPractice ).save()

	def Nur2=new Nurse(
	nurseName: 'Nive Daffin ',
	qualifications: 'Registered General Nurse',
	nurseEmail: 'NiveDaffin@gmail.com',
	nurseOffice: '11',
	nursePhone: '0114774568',
	surgery: WoodseatsPractice ).save()

	def Pat1=new Patient(
	patientName: 'Mark Sting',
	patientAddress: '123 Fake Street',
	patientResidence: 'Sheffield',
	patientDob: new Date('26/1/1969'),
	patientID: 'A113',
	dateRegistered: new Date('06/5/2014'),
	patientPhone: '01142285946',
	appID: App1 ).save()

	def Pat2=new Patient(
	patientName: 'Howard Collett ',
	patientAddress: '53 Greenhill Avenue',
	patientResidence: 'Sheffield',
	patientDob: new Date('07/3/2000'),
	patientID: 'A255',
	dateRegistered: new Date('21/2/2001'),
	patientPhone: '01142938046',
	appID: App2 ).save()


	def Pre1=new Prescription(
	pharmacyName: 'Goldmans Pharmacy',
	prescriptionNumber: '1132',
	medicine: 'Ibeprophen',
	totalCost: '15.00',
	dateIssued: new Date('29/12/2019'), 
	patientPaying: 'true',
	doctor:Doc2,
	patient: Pat1 ).save()

	def Pre2=new Prescription(
	pharmacyName: 'Greenhill Chemist',
	prescriptionNumber: '1678',
	medicine: 'Paracetomol',
	totalCost: '10.00',
	dateIssued: new Date('24/2/2020'), 
	patientPaying: 'true',
	doctor:Doc2,
	patient: Pat2 ).save()



    }
    def destroy = {
    }
}
