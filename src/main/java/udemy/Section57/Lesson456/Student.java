package com.learn.udemy.Section57.Lesson456;

/**
 * Created by Binh
 * Date : 2/18/2023 - 6:33 PM
 * Description :
 */
public class Student {
    private int Id;
    private String firstName;
    private String lastName;
    private boolean active;

    public Student(int id, String firstName, String lastName, boolean active) {
        Id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.active = active;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
