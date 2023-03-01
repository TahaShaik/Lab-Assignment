/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.ImageIcon;
import java.util.UUID;


public class EmpInfo {
    
    private String name;
    private int employeeId;
    private int age;
    private String gender;
    private String startDate;
    private String level;
    private String phoneNumber;
    private String email;
    private ImageIcon Photo;

    public ImageIcon getPhoto() {
        return Photo;
    }

    public void setPhoto(ImageIcon Photo) {
        this.Photo = Photo;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeId() {
        UUID uuid = UUID.randomUUID();
        long uuidAsLong = uuid.getMostSignificantBits();
        int uuidAsInt = (int) uuidAsLong;
        this.employeeId = uuidAsInt;
    }
    
    public int getEmployeeId(){
        return employeeId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return name;
    }
}
