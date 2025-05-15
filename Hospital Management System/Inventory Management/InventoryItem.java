package com.InventoryManagementModule;

public class InventoryItem {
    private int itemId;
    private String name;
    private int quantity;
    private double unitPrice;
    private String expirationDate;

    public InventoryItem(int itemId, String name, int quantity, double unitPrice, String expirationDate) {
        this.itemId = itemId;
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.expirationDate = expirationDate;
    }

    // Getters
    public int getItemId() { return itemId; }
    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public double getUnitPrice() { return unitPrice; }
    public String getExpirationDate() { return expirationDate; }

    // Setters
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
