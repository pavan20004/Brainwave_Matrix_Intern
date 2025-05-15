package com.BillingandInvoicingModule;

public class Invoice {
    private int invoiceId;
    private int patientId;
    private String date;
    private double consultationFee;
    private double treatmentCost;
    private double medicationCost;

    public Invoice(int invoiceId, int patientId, String date, double consultationFee, double treatmentCost, double medicationCost) {
        this.invoiceId = invoiceId;
        this.patientId = patientId;
        this.date = date;
        this.consultationFee = consultationFee;
        this.treatmentCost = treatmentCost;
        this.medicationCost = medicationCost;
    }

    public double getTotalAmount() {
        return consultationFee + treatmentCost + medicationCost;
    }

    // Getters
    public int getInvoiceId() { return invoiceId; }
    public int getPatientId() { return patientId; }
    public String getDate() { return date; }
    public double getConsultationFee() { return consultationFee; }
    public double getTreatmentCost() { return treatmentCost; }
    public double getMedicationCost() { return medicationCost; }
}
