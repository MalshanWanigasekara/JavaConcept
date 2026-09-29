package com.example.hospital;

public class Doctor {

    private final int doctorId;
    private final String name;

    public Doctor(int doctorId, String name) {
        this.doctorId = doctorId;
        this.name = name;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public String getName() {
        return name;
    }
}