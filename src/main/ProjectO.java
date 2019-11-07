/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import employee.Employee;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author JDaza
 */
public class ProjectO {
    
    static Employee e;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Date birth = cal.getTime();
        Date entry = cal.getTime();
        Date departure = cal.getTime();
        
        e = new Employee("Jaime David", "Daza Tovar", 1193456411, birth, "Calle 66A 9C-27", "jdaza17@cucedu.co", "Masculino", 0, "Soltero", "Estudiante", "Bachillerato", "Estudiante de pregrado", entry, departure, "fijo", "Seguros del Estado", "Coomeva", "Ninguna", "Ninguna");
        System.out.println("Persona "+e.getDateOfEntry());
    }
    
}
