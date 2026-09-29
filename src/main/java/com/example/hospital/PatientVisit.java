package com.example.hospital;

public class PatientVisit {

    private final int visitId;
    private final int patientId;
    private final int doctorId;
    private final int startTime;
    private final int durationMinutes;
    private final VisitType visitType;

    public PatientVisit(
            int visitId,
            int patientId,
            int doctorId,
            int startTime,
            int durationMinutes,
            VisitType visitType) {

        this.visitId = visitId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.startTime = startTime;
        this.durationMinutes = durationMinutes;
        this.visitType = visitType;
    }

    public int getVisitId() {
        return visitId;
    }

    public int getPatientId() {
        return patientId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public VisitType getVisitType() {
        return visitType;
    }
}