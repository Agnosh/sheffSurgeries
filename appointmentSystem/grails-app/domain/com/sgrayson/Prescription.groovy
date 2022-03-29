package com.sgrayson

class Prescription {

    //Variables
    String pharmacyName
    int prescripNumber
    String medicine
    int totalCost
    Date dateIssued
    Boolean patientPaying

    String toString(){
        return pharmacyName; //Removes com. when creating a new prescription.
    }

    static constraints = {
        //contraints
        pharmacyName blank:false, nullable:false
        prescripNumber blank:false, nullable:false
        medicine blank:false, nullable:false
        totalCost blank:false, nullable:false
        dateIssued blank:false, nullable:false
        patientPaying blank:false, nullable:false
    }
    static hasOne = [doctor:Doctor, patient:Patient] //hasOne Relationships
}