package com.StaffManagementModule;

public class Staff {
    private int staffId;
    private String name;
    private String role;
    private String department;
    private String contactInfo;

    public Staff(int staffId, String name, String role, String department, String contactInfo) {
        this.staffId = staffId;
        this.name = name;
        this.role = role;
        this.department = department;
        this.contactInfo = contactInfo;
    }

    // Getters
    public int getStaffId() { return staffId; }
    public String getName() { return name; }
    public String getRole() { return role; }
    public String getDepartment() { return department; }
    public String getContactInfo() { return contactInfo; }
}

