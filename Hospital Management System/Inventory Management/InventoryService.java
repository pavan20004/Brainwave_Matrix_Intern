package com.InventoryManagementModule;

import java.util.ArrayList;
import java.util.List;

public class InventoryService {
    private List<InventoryItem> items = new ArrayList<>();
    private int itemCounter = 1;

    public InventoryItem addItem(String name, int quantity, double unitPrice, String expirationDate) {
        InventoryItem item = new InventoryItem(itemCounter++, name, quantity, unitPrice, expirationDate);
        items.add(item);
        return item;
    }

    public List<InventoryItem> getAllItems() {
        return items;
    }

    public boolean updateQuantity(int itemId, int newQuantity) {
        for (InventoryItem item : items) {
            if (item.getItemId() == itemId) {
                item.setQuantity(newQuantity);
                return true;
            }
        }
        return false;
    }
}
