package com.Main;

import java.util.List;
import java.util.Scanner;

import com.AppointmentSchedulingModule.Appointment;
import com.AppointmentSchedulingModule.AppointmentService;
import com.BillingandInvoicingModule.BillingService;
import com.BillingandInvoicingModule.Invoice;
import com.ElectronicHealthRecords.EHRService;
import com.ElectronicHealthRecords.MedicalRecord;
import com.InventoryManagementModule.InventoryItem;
import com.InventoryManagementModule.InventoryService;
import com.PatientRegistration.Patient;
import com.PatientRegistration.PatientService;
import com.StaffManagementModule.Staff;
import com.StaffManagementModule.StaffService;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PatientService patientService = new PatientService();
        AppointmentService appointmentService = new AppointmentService();
        EHRService ehrService = new EHRService();
        BillingService billingService = new BillingService();
        InventoryService inventoryService = new InventoryService();
        StaffService staffService = new StaffService();




        // Other services here...

        while (true) {
        	System.out.println("1. Register Patient\n2. List Patients\n3. Schedule Appointment\n4. List Appointments");
        	System.out.println("5. Add Medical Record\n6. View Medical Records\n7. Generate Invoice\n8. View Invoices");
        	System.out.println("9. Add Inventory Item\n10. View Inventory\n11. Update Item Quantity");
        	System.out.println("12. Add Staff Member\n13. View All Staff\n0. Exit");



            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter gender: ");
                    String gender = scanner.nextLine();
                    System.out.print("Enter contact info: ");
                    String contact = scanner.nextLine();
                    Patient p = patientService.registerPatient(name, age, gender, contact);
                    System.out.println("Registered: " + p.getName());
                    break;
                case 2:
                    for (Patient patient : patientService.listPatients()) {
                        System.out.println(patient.getName());
                    }
                    break;
                case 3:
                     System.out.print("Enter Patient ID: ");
                     int pid = scanner.nextInt();
                     scanner.nextLine();
                     System.out.print("Enter Doctor Name: ");
                     String doc = scanner.nextLine();
                     System.out.print("Enter Date (YYYY-MM-DD): ");
                     String date = scanner.nextLine();
                     System.out.print("Enter Time (HH:MM): ");
                     String time = scanner.nextLine();
                     System.out.print("Enter Reason: ");
                     String reason = scanner.nextLine();
                     Appointment appt = appointmentService.scheduleAppointment(pid, doc, date, time, reason);
                     System.out.println("Appointment ID: " + appt.getAppointmentId() + " scheduled.");
                     break;

                 case 4:
                     for (Appointment ap : appointmentService.getAllAppointments()) {
                         System.out.println("Appointment ID: " + ap.getAppointmentId() + ", Patient ID: " + ap.getPatientId()
                         + ", Doctor: " + ap.getDoctorName() + ", Date: " + ap.getDate() + ", Time: " + ap.getTime());
                
                      }
                      break;
                 case 5:
                	    System.out.print("Enter Patient ID: ");
                	    int patientId = scanner.nextInt();
                	    scanner.nextLine();
                	    System.out.print("Enter Diagnosis: ");
                	    String diagnosis = scanner.nextLine();
                	    System.out.print("Enter Treatment: ");
                	    String treatment = scanner.nextLine();
                	    System.out.print("Enter Prescription: ");
                	    String prescription = scanner.nextLine();
                	    System.out.print("Enter Date (YYYY-MM-DD): ");
                	    String recordDate = scanner.nextLine();

                	    MedicalRecord record = ehrService.addRecord(patientId, diagnosis, treatment, prescription, recordDate);
                	    System.out.println("Record ID " + record.getRecordId() + " added.");
                	    break;

                 case 6:
                	    System.out.print("Enter Patient ID: ");
                	    int idToView = scanner.nextInt();
                	    scanner.nextLine();
                	    List<MedicalRecord> recs = ehrService.getRecordsByPatientId(idToView);
                	    if (recs.isEmpty()) {
                	        System.out.println("No records found.");
                	    } else {
                	        for (MedicalRecord r : recs) {
                	            System.out.println("Record ID: " + r.getRecordId() + ", Diagnosis: " + r.getDiagnosis() +
                	                               ", Treatment: " + r.getTreatment() + ", Prescription: " + r.getPrescription() +
                	                               ", Date: " + r.getDate());
                	        }
                	    }
                	    break;
                 case 7:
                	    System.out.print("Enter Patient ID: ");
                	    int personId = scanner.nextInt();
                	    scanner.nextLine();
                	    System.out.print("Enter Date (YYYY-MM-DD): ");
                	    String billDate = scanner.nextLine();
                	    System.out.print("Enter Consultation Fee: ");
                	    double consultFee = scanner.nextDouble();
                	    System.out.print("Enter Treatment Cost: ");
                	    double treatCost = scanner.nextDouble();
                	    System.out.print("Enter Medication Cost: ");
                	    double medCost = scanner.nextDouble();

                	    Invoice invoice = billingService.generateInvoice(personId, billDate, consultFee, treatCost, medCost);
                	    System.out.println("Invoice ID " + invoice.getInvoiceId() + " generated. Total: $" + invoice.getTotalAmount());
                	    break;

                case 8:
                	    System.out.print("Enter Patient ID to view invoices: ");
                	    int billPatientId = scanner.nextInt();
                	    scanner.nextLine();
                	    List<Invoice> patientInvoices = billingService.getInvoicesByPatientId(billPatientId);
                	    if (patientInvoices.isEmpty()) {
                	        System.out.println("No invoices found.");
                	    } else {
                	        for (Invoice inv : patientInvoices) {
                	            System.out.println("Invoice ID: " + inv.getInvoiceId() + ", Date: " + inv.getDate() +
                	                ", Total: $" + inv.getTotalAmount());
                	        }
                	    }
                	    break;
                case 9:
                    System.out.print("Enter Item Name: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Enter Unit Price: ");
                    double unitPrice = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter Expiration Date (YYYY-MM-DD): ");
                    String expDate = scanner.nextLine();

                    InventoryItem newItem = inventoryService.addItem(itemName, quantity, unitPrice, expDate);
                    System.out.println("Added Item ID: " + newItem.getItemId());
                    break;

                case 10:
                    for (InventoryItem item : inventoryService.getAllItems()) {
                        System.out.println("ID: " + item.getItemId() + ", Name: " + item.getName() +
                                           ", Qty: " + item.getQuantity() + ", Price: $" + item.getUnitPrice() +
                                           ", Expiry: " + item.getExpirationDate());
                    }
                    break;

                case 11:
                    System.out.print("Enter Item ID to update: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter New Quantity: ");
                    int newQty = scanner.nextInt();
                    boolean updated = inventoryService.updateQuantity(id, newQty);
                    if (updated) {
                        System.out.println("Quantity updated.");
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;
                case 12:
                    System.out.print("Enter Name: ");
                    String sName = scanner.nextLine();
                    System.out.print("Enter Role (e.g., Doctor, Nurse): ");
                    String sRole = scanner.nextLine();
                    System.out.print("Enter Department: ");
                    String sDept = scanner.nextLine();
                    System.out.print("Enter Contact Info: ");
                    String sContact = scanner.nextLine();

                    Staff newStaff = staffService.addStaff(sName, sRole, sDept, sContact);
                    System.out.println("Staff added with ID: " + newStaff.getStaffId());
                    break;

                case 13:
                    List<Staff> allStaff = staffService.getAllStaff();
                    for (Staff staff : allStaff) {
                        System.out.println("ID: " + staff.getStaffId() + ", Name: " + staff.getName() +
                            ", Role: " + staff.getRole() + ", Dept: " + staff.getDepartment() +
                            ", Contact: " + staff.getContactInfo());
                    }
                    break;


                case 0:
                    System.exit(0);
            }
        }
    }
}
