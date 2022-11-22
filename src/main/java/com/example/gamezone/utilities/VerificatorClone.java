package com.example.gamezone.utilities;

import com.example.gamezone.model.Client;
import com.example.gamezone.model.Employee;
import com.example.gamezone.model.Person;

import java.util.HashSet;

public class VerificatorClone {
    public Boolean verifyNameProfile(String name, HashSet<? extends Person> people){
        Boolean resultado=false;
        for (Person person : people) {
            resultado = (name.equals(person.getName())) ? false : true;
            if (!resultado)break;
        }
        return resultado;
    }

    public Boolean verifyNameAdmin(String name,String adminName){

        return (name.equals(adminName))?false:true;
    }

    public Boolean verifyName(String name,String adminName,HashSet<Client> clients,HashSet<Employee> employees){
        return (verifyNameProfile(name, clients)&&verifyNameProfile(name,employees) && verifyNameAdmin(name, adminName));
    }

    public Boolean verifyEmail(String email,HashSet<? extends Person> people){
        Boolean resultado=true;
        for (Person person:people){
            resultado = (email.equals(person.getEmail())) ? false : true;
            if (!resultado)break;
        }
        return resultado;
    }


}
