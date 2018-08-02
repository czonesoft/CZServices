package yt.gk.demo1serviceapi.model;

import java.io.Serializable;

public class UserProfile implements Serializable {
    private String employeeNumber;
    private String trueName;

    public UserProfile(){}

    public String getEmployeeNumber() {
        return employeeNumber;
    }
    public void setEmployeeNumber(String number){
        employeeNumber = number;
    }
    public String getTrueName(){
        return trueName;
    }
    public void setTrueName(String name){
        trueName = name;
    }
}
