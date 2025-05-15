package com.ElectronicHealthRecords;

public class MedicalRecord {
    private int recordId;
    private int patientId;
    private String diagnosis;
    private String treatment;
    private String prescription;
    private String date;

    public MedicalRecord(int recordId, int patientId, String diagnosis, String treatment, String prescription, String date) {
        this.recordId = recordId;
        this.patientId = patientId;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.prescription = prescription;
        this.date = date;
    }

    // Getters
    public int getRecordId() { return recordId; }
    public int getPatientId() { return patientId; }
    public String getDiagnosis() { return diagnosis; }
    public String getTreatment() { return treatment; }
    public String getPrescription() { return prescription; }
    public String getDate() { return date; }
}

