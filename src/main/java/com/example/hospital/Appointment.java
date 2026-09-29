package com.example.hospital;

public class Appointment {

    private final int appointmentId;
    private final int doctorId;
    private final int patientId;
    private final AppointmentType appointmentType;
    private final int durationMinutes;
    private AppointmentStatus status;

    public Appointment(
            int appointmentId,
            int doctorId,
            int patientId,
            AppointmentType appointmentType,
            int durationMinutes,
            AppointmentStatus status) {

        this.appointmentId = appointmentId;
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.appointmentType = appointmentType;
        this.durationMinutes = durationMinutes;
        this.status = status;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public int getPatientId() {
        return patientId;
    }

    public AppointmentType getAppointmentType() {
        return appointmentType;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public AppointmentStatus getStatus() {
        return status;
    }

    public void setStatus(AppointmentStatus status) {
        this.status = status;
    }
}