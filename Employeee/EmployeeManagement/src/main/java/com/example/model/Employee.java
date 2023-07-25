package com.example.model;

import java.net.URL;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee{

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int ID;
        private String EmployeeName;
        private int PhoneNumber;
        private String Email;
        private String ReportsTo;
        private URL ProfileImage;

        public Employee(){

        }

        public int getID() {
            return ID;
        }

        public void setID(int iD) {
            ID = iD;
        }

        public String getEmployeeName() {
            return EmployeeName;
        }

        public void setEmployeeName(String employeeName) {
            EmployeeName = employeeName;
        }

        public int getPhoneNumber() {
            return PhoneNumber;
        }

        public void setPhoneNumber(int phoneNumber) {
            PhoneNumber = phoneNumber;
        }

        public String getEmail() {
            return Email;
        }

        public void setEmail(String email) {
            Email = email;
        }

        public String getReportsTo() {
            return ReportsTo;
        }

        public void setReportsTo(String reportsTo) {
            ReportsTo = reportsTo;
        }

        public URL getProfileImage() {
            return ProfileImage;
        }

        public void setProfileImage(URL profileImage) {
            ProfileImage = profileImage;
        }

        public Employee(int iD, String employeeName, int phoneNumber, String email, String reportsTo,
                URL profileImage) {
            super();
            this.ID = iD;
            this.EmployeeName = employeeName;
            this.PhoneNumber = phoneNumber;
            this.Email = email;
            this.ReportsTo = reportsTo;
            this.ProfileImage = profileImage;
        }
        
        
}