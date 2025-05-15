package com.AppointmentSchedulingModule;

import java.util.ArrayList;
import java.util.List;

public class AppointmentService {
    private List<Appointment> appointments = new ArrayList<>();
    private int appointmentCounter = 1;

    public Appointment scheduleAppointment(int patientId, String doctorName, String date, String time, String reason) {
        Appointment appointment = new Appointment(appointmentCounter++, patientId, doctorName, date, time, reason);
        appointments.add(appointment);
        return appointment;
    }

    public List<Appointment> getAppointmentsByPatientId(int patientId) {
        List<Appointment> result = new ArrayList<>();
        for (Appointment a : appointments) {
            if (a.getPatientId() == patientId) {
                result.add(a);
            }
        }
        return result;
    }

    public List<Appointment> getAllAppointments() {
        return appointments;
    }
}

