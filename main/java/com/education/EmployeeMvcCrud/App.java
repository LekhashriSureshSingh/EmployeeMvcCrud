package com.education.EmployeeMvcCrud;

import java.util.List;

import com.education.EmployeeMvcCrud.entities.Employee;
import com.education.EmployeeMvcCrud.dao.Employeedao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    	
    	 Employee s1=new Employee("Lekha","Shri","lekha@gmail.com");
         Employee s2=new Employee("Jai","shri","jai@gmail.com");
         
         Employeedao stdao=new Employeedao();
         
         stdao.saveStudent(s1);
         stdao.saveStudent(s2);
         //stdao.deleteStudent(s1);
         
         List<Employee> employee=stdao.getStudents();
         
         for(Employee s:employee)
         	System.out.println(s.getFirstName()+" "+s.getLastName()+" "+s.getEmail());
         
    }
}
