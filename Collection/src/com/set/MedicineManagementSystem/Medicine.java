package com.set.MedicineManagementSystem;

import java.util.Objects;

public class Medicine {
    private int medicineId;
    private String medicineName;
    private String category;
    private double price;

    public Medicine(int medicineId, String medicineName, String category, double price) {
        this.medicineId = medicineId;
        this.medicineName = medicineName;
        this.category = category;
        this.price = price;
    }

    public int getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(int medicineId) {
        this.medicineId = medicineId;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "medicineId=" + medicineId +
                ", medicineName='" + medicineName + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass())
            return false;

        Medicine medicine = (Medicine) o;

        return medicineId == medicine.medicineId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(medicineId);
    }
}
