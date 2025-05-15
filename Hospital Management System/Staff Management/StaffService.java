package com.StaffManagementModule;

import java.util.ArrayList;
import java.util.List;

public class StaffService {
    private List<Staff> staffList = new ArrayList<>();
    private int staffCounter = 1;

    public Staff addStaff(String name, String role, String department, String contactInfo) {
        Staff staff = new Staff(staffCounter++, name, role, department, contactInfo);
        staffList.add(staff);
        return staff;
    }

    public List<Staff> getAllStaff() {
        return staffList;
    }
}

