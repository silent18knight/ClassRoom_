package com.example.demo.Domain;

import lombok.*;

import javax.persistence.*;


@Data
@Entity
@Table(name = "Students")
public class StudentDao {

    @Id
    @GeneratedValue
    @Column(name = "studentid")
    private int studentId;

    @Column(name = "lastname")
    private String LastName;

    @Column(name = "firstname")
    private String FirstName;

    @Column(name = "address")
    private String Address ;

    @Column(name = "gender")
    private String gender;

    public StudentDao(int studentId, String lastName, String firstName, String address, String gender) {
        this.studentId = studentId;
        LastName = lastName;
        FirstName = firstName;
        Address = address;
        this.gender = gender;
    }

    public StudentDao() {
    }

    public int getStudentId() {
        return studentId;
    }

    public String getLastName() {
        return LastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getAddress() {
        return Address;
    }

    public String getGender() {
        return gender;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
