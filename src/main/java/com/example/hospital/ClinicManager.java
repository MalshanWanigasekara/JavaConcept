package com.example.hospital;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class ClinicManager {

    private final Map<Integer, Doctor> doctors = new HashMap<>();
    private final List<Appointment> appointments = new ArrayList<>();
    private final List<PatientVisit> visits = new ArrayList<>();

    public void addDoctor(Doctor doctor) {
        doctors.put(doctor.getDoctorId(), doctor);
    }

    /*
     * Existing method.
     *
     * There is a bug here that causes the existing test to fail.
     */
    public int getCompletedAppointmentCount(int doctorId) {

        int count = 0;

        for (Appointment appointment : appointments) {

            if (appointment.getDoctorId() == doctorId
                    && AppointmentStatus.COMPLETED == appointment.getStatus()) {

                count++;
            }
        }

        return count;
    }

    // Part 2.1
    public void addPatientVisit(PatientVisit visit) {

        if(doctors.containsKey(visit.getDoctorId())) {
            visits.add(visit);
        }else{
            throw new IllegalArgumentException("invalid doctor");
        }
    }

    // Part 2.2
    public Map<VisitType, Double>
    getAverageVisitDurationByType(int doctorId) {

        Map<VisitType, Double> visitDurationMap = new HashMap<>();
        Map<VisitType, Double> visitCountMap = new HashMap<>();
        String ss = "ABC";

        boolean a = ss.trim().equalsIgnoreCase("abc ");



        visits.forEach( visit -> {
            visitDurationMap.merge(visit.getVisitType(), (double) visit.getDurationMinutes(), (o, n) -> o+n );

        });



        return null;
    }

    // Part 3.1
    public Map<AppointmentType, Double>
    getAverageAppointmentDurationByType(int doctorId) {

        // TODO
        return null;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public List<PatientVisit> getVisits() {
        return visits;
    }

    public void addAppointment(Appointment appointment) {

        if (!doctors.containsKey(appointment.getDoctorId())) {
            return;
        }

        appointments.add(appointment);
    }
}