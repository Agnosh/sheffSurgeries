package com.sgrayson

class Patient {

    //Variables
    String patientName
    String patientAddress
    String patientResidence
    Date patientDob
    String patientID
    Date dateRegistered
    int patientPhone

    static constraints = {
        //contraints
        patientName blank:false, nullable:false
        patientAddress blank:false, nullable:false
        patientResidence blank:false, nullable:false
        patientDob blank:false, nullable:false
        patientID blank:false, nullable:false, unqiue:true
        dateRegistered blank:false, nullable:false
        patientPhone blank:false, nullable:false, size:0..15
    }
}