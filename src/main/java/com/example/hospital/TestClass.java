package com.example.hospital;

import org.junit.Test;
import java.util.Map;

public class TestClass{

    @Test
    public void testCompletedAppointments() {

        ClinicManager manager = new ClinicManager();

        manager.addDoctor(
                new Doctor(1, "Dr. Smith")
        );

        manager.addAppointment(
                new Appointment(
                        101,
                        1,
                        10,
                        AppointmentType.CONSULTATION,
                        30,
                        AppointmentStatus.COMPLETED
                )
        );

        manager.addAppointment(
                new Appointment(
                        102,
                        1,
                        11,
                        AppointmentType.FOLLOWUP,
                        20,
                        AppointmentStatus.SCHEDULED
                )
        );

        manager.addAppointment(
                new Appointment(
                        103,
                        1,
                        12,
                        AppointmentType.EMERGENCY,
                        40,
                        AppointmentStatus.CANCELLED
                )
        );

        manager.addAppointment(
                new Appointment(
                        104,
                        1,
                        13,
                        AppointmentType.CONSULTATION,
                        30,
                        AppointmentStatus.NO_SHOW
                )
        );

        /*
         * Only appointment 101 should count.
         *
         * Expected = 1
         */
        assert manager.getCompletedAppointmentCount(1) == 1;
    }

    @Test
    public void testGetAverageVisitDurationByType() {

        ClinicManager manager = new ClinicManager();

        manager.addDoctor(
                new Doctor(1, "Dr. Smith")
        );

        manager.addDoctor(
                new Doctor(2, "Dr. Jones")
        );

        manager.addPatientVisit(
                new PatientVisit(
                        1,
                        100,
                        1,
                        600,
                        30,
                        VisitType.CONSULTATION
                )
        );

        manager.addPatientVisit(
                new PatientVisit(
                        2,
                        101,
                        1,
                        700,
                        20,
                        VisitType.CONSULTATION
                )
        );

        manager.addPatientVisit(
                new PatientVisit(
                        3,
                        102,
                        1,
                        800,
                        40,
                        VisitType.FOLLOWUP
                )
        );

        manager.addPatientVisit(
                new PatientVisit(
                        4,
                        103,
                        2,
                        900,
                        60,
                        VisitType.EMERGENCY
                )
        );

        // Unknown doctor → should be ignored
        manager.addPatientVisit(
                new PatientVisit(
                        5,
                        104,
                        999,
                        1000,
                        90,
                        VisitType.EMERGENCY
                )
        );

        Map<VisitType, Double> result =
                manager.getAverageVisitDurationByType(1);

        // CONSULTATION = (30 + 20) / 2 = 25
        assert Math.abs(
                result.get(VisitType.CONSULTATION) - 25.0
        ) < 0.0001;

        // FOLLOWUP = 40
        assert Math.abs(
                result.get(VisitType.FOLLOWUP) - 40.0
        ) < 0.0001;

        assert !result.containsKey(VisitType.EMERGENCY);
    }
}
