/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.util.Date;
import person.Person;

/**
 *
 * @author JDaza
 */
public class Employee extends Person {
    
    private String position;
    private Date dateOfEntry;
    private Date dateOfDeparture;
    private String contractType;
    private String aRL;
    private String ePS;
    private String layoffs;
    private String pension;

    public Employee(String givenName, String familyName, int idNumber, Date birthDate, String address, String eMail, String sex, int childrensNumber, String civilState, String profession, String educationLevel, String position, Date dateOfEntry, Date dateOfDeparture, String contractType, String aRL, String ePS, String layoffs, String pension) {
        super(givenName, familyName, idNumber, birthDate, address, eMail, sex, childrensNumber, civilState, profession, educationLevel);
        this.position = position;
        this.dateOfEntry = dateOfEntry;
        this.dateOfDeparture = dateOfDeparture;
        this.contractType = contractType;
        this.aRL = aRL;
        this.ePS = ePS;
        this.layoffs = layoffs;
        this.pension = pension;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getDateOfEntry() {
        return dateOfEntry;
    }

    public void setDateOfEntry(Date dateOfEntry) {
        this.dateOfEntry = dateOfEntry;
    }

    public Date getDateOfDeparture() {
        return dateOfDeparture;
    }

    public void setDateOfDeparture(Date dateOfDeparture) {
        this.dateOfDeparture = dateOfDeparture;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public String getaRL() {
        return aRL;
    }

    public void setaRL(String aRL) {
        this.aRL = aRL;
    }

    public String getePS() {
        return ePS;
    }

    public void setePS(String ePS) {
        this.ePS = ePS;
    }

    public String getLayoffs() {
        return layoffs;
    }

    public void setLayoffs(String layoffs) {
        this.layoffs = layoffs;
    }

    public String getPension() {
        return pension;
    }

    public void setPension(String pension) {
        this.pension = pension;
    }
    
    
}
