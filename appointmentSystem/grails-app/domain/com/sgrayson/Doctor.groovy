package com.sgrayson

class Doctor {

    //Variables
    String fullName
    String qualification
    String position
    String doctorEmail
    String password
    String doctorOffice
    String doctorPhone
    String bio

    String toString(){
        return fullName; //Removes com. when creating a new doctor.
    }

    static constraints = {
        //contraints
        fullName blank:false, nullable:false
        qualification blank:false, nullable:false
        position blank:false, nullable:false
        doctorEmail blank:false, nullable:false, email:true, unique:true
        password blank:false, nullable:false, size:8..15
        doctorOffice blank:false, nullable:false
        doctorPhone blank:false, nullable:false, size:0..15
        bio blank:false, nullable:false, widget: 'textarea';
    }
    static hasMany = [prescription:Prescription, patient:Patient, appointment:Appointment, nurse:Nurse] //hasMany Relationships
    static belongsTo = [surgery:Surgery] //belongsTo Relationship
}