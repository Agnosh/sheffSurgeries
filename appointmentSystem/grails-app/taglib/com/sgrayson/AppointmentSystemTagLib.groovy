package com.sgrayson

class AppointmentSystemTagLib {
    //static defaultEncodeAs = [taglib:'html']
    def loginToggle={

        out<<"<div style='margin:15px0 40px;'>"

        if(request.getSession(false)&&session.user){
            out<<"<span style='float:left;margin-left:15px'>"
            out<<"Welcome ${session.user}."
            out<<"</span><span style='float:right;margin-right:15px'>"

            out<<"<a href='${createLink(controller:'receptionist',action:'logout')}'>"
            out<<"Logout</a></span>"
        }

        else{
            out<<"<span style='float:right;margin-left:30px'>"
            out<<"<a href='${createLink(controller:'receptionist',action:'login')}'>"
            out<<"Login</a></span>"
        
        }
        out<<"</div><br/>"
    }
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]
}
