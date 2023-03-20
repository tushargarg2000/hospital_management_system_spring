package com.example.hospital.management;

public class Doctor {

    private int doctorId;

    private String name;

    private String specialization;

    private int age;

    private String degree;

    public Doctor(Integer doctorId,String name, String specialization, int age, String degree) {
        this.name = name;
        this.specialization = specialization;
        this.age = age;
        this.degree = degree;
        this.doctorId = doctorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
