package com.BillingandInvoicingModule;

import java.util.ArrayList;
import java.util.List;

public class BillingService {
    private List<Invoice> invoices = new ArrayList<>();
    private int invoiceCounter = 1;

    public Invoice generateInvoice(int patientId, String date, double consultationFee, double treatmentCost, double medicationCost) {
        Invoice invoice = new Invoice(invoiceCounter++, patientId, date, consultationFee, treatmentCost, medicationCost);
        invoices.add(invoice);
        return invoice;
    }

    public List<Invoice> getInvoicesByPatientId(int patientId) {
        List<Invoice> result = new ArrayList<>();
        for (Invoice inv : invoices) {
            if (inv.getPatientId() == patientId) {
                result.add(inv);
            }
        }
        return result;
    }

    public List<Invoice> getAllInvoices() {
        return invoices;
    }
}
