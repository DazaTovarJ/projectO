/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto;

import java.util.Date;

/**
 *
 * @author JDaza
 */
public class Person {
    private String givenName;
    private String familyName;
    private int idNumber;
    private Date birthDate;
    private String address;
    private String eMail;
    private String sex;
    private int childrensNumber;
    private String civilState;
    private String profession;
    private String educationLevel;

    public Person(String givenName, String familyName, int idNumber, Date birthDate, String address, String eMail, String sex, int childrensNumber, String civilState, String profession, String educationLevel) {
        this.givenName = givenName;
        this.familyName = familyName;
        this.idNumber = idNumber;
        this.birthDate = birthDate;
        this.address = address;
        this.eMail = eMail;
        this.sex = sex;
        this.childrensNumber = childrensNumber;
        this.civilState = civilState;
        this.profession = profession;
        this.educationLevel = educationLevel;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getChildrensNumber() {
        return childrensNumber;
    }

    public void setChildrensNumber(int childrensNumber) {
        this.childrensNumber = childrensNumber;
    }

    public String getCivilState() {
        return civilState;
    }

    public void setCivilState(String civilState) {
        this.civilState = civilState;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }
    
    
}
