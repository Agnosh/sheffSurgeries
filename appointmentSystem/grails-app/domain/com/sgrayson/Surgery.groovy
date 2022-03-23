package com.sgrayson

class Surgery {

    //Variables
    String name
    String address
    String postcode
    String telephone
    int numberOfPatients
    String description
    String openingTime

    static constraints = {
        //contraints
        name blank:false, nullable:false
        address blank:false, nullable:false
        postcode blank:false, nullable:false, size:5..10
        telephone blank:false, nullable:false, size:0..15
        numberOfPatients blank:false, nullable:false
        description blank:false, nullable:false, widget: 'textarea';
        openingTime blank:false, nullable:false
    }
    static hasMany = [doctor:Doctor, receptionist:Receptionist, appointment:Appointment, patient:Patient, nurse:Nurse] //hasMany Relationships
}