/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.project;

/**
 *
 * @author Techmarkit
 */
public class StudentDTO {
    
    private int age;
    private String name;
    private String surname;

    public StudentDTO(int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    } 
        

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    
    
    
    
}
