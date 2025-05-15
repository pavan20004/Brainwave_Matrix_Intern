package com.PatientRegistration;

import java.util.ArrayList;
import java.util.List;

public class PatientService {
    private List<Patient> patients = new ArrayList<>();
    private int idCounter = 1;

    public Patient registerPatient(String name, int age, String gender, String contactInfo) {
        Patient p = new Patient(idCounter++, name, age, gender, contactInfo);
        patients.add(p);
        return p;
    }

    public List<Patient> listPatients() {
        return patients;
    }
}

