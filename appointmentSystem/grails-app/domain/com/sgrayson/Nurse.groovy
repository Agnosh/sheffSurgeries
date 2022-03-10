package com.sgrayson

class Nurse {

    //Variables
    String nurseName
    String qualifications
    String nurseEmail
    String nurseOffice
    int nursePhone

    static constraints = {
        //contraints
        nurseName blank:false, nullable:false
        qualifications blank:false, nullable:false
        nurseEmail blank:false, nullable:false, email:true, unique:true
        nurseOffice blank:false, nullable:false
        nursePhone blank:false, nullable:false, size:0..15
    }
    static hasMany = [doctor:Doctor] //hasMany Relationship
    static belongsTo = [surgery:Surgery] //belongsTo Relationship
}