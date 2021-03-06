package com.sgrayson

class Nurse {

    //Variables
    String nurseName
    String qualifications
    String nurseEmail
    String nurseOffice
    String nursePhone

    String toString(){
        return nurseName; //Removes com. when creating a new nurse.
    }

    static constraints = {
        //contraints
        nurseName blank:false, nullable:false
        qualifications blank:false, nullable:false
        nurseEmail blank:false, nullable:false, email:true, unique:true
        nurseOffice blank:false, nullable:false
        nursePhone blank:false, nullable:false, size:0..15
    }
    static hasMany = [doctor:Doctor]
    static belongsTo = [surgery:Surgery] //belongsTo Relationships
}