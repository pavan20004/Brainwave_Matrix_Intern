package com.ElectronicHealthRecords;

import java.util.ArrayList;
import java.util.List;

public class EHRService {
    private List<MedicalRecord> records = new ArrayList<>();
    private int recordCounter = 1;

    public MedicalRecord addRecord(int patientId, String diagnosis, String treatment, String prescription, String date) {
        MedicalRecord record = new MedicalRecord(recordCounter++, patientId, diagnosis, treatment, prescription, date);
        records.add(record);
        return record;
    }

    public List<MedicalRecord> getRecordsByPatientId(int patientId) {
        List<MedicalRecord> result = new ArrayList<>();
        for (MedicalRecord r : records) {
            if (r.getPatientId() == patientId) {
                result.add(r);
            }
        }
        return result;
    }

    public List<MedicalRecord> getAllRecords() {
        return records;
    }
}

