/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg02;

/**
 *
 * @author karshan
 */
public class Student {
    private String stId;
    private String stName;
    private int stAge;
    private String stAddress;

    public Student(String stId, String stName, int stAge, String stAddress) {
        this.stId = stId;
        this.stName = stName;
        this.stAge = stAge;
        this.stAddress = stAddress;
    }

    public String getStId() {
        return stId;
    }

    public void setStId(String stId) {
        this.stId = stId;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public int getStAge() {
        return stAge;
    }

    public void setStAge(int stAge) {
        this.stAge = stAge;
    }

    public String getStAddress() {
        return stAddress;
    }

    public void setStAddress(String stAddress) {
        this.stAddress = stAddress;
    }
    
    
    
}
