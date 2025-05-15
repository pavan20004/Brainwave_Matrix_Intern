package com.AppointmentSchedulingModule;

public class Appointment {
    private int appointmentId;
    private int patientId;
    private String doctorName;
    private String date;
    private String time;
    private String reason;

    public Appointment(int appointmentId, int patientId, String doctorName, String date, String time, String reason) {
        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.doctorName = doctorName;
        this.date = date;
        this.time = time;
        this.reason = reason;
    }

    // Getters and Setters

    public int getAppointmentId() { return appointmentId; }
    public int getPatientId() { return patientId; }
    public String getDoctorName() { return doctorName; }
    public String getDate() { return date; }
    public String getTime() { return time; }
    public String getReason() { return reason; }
}
