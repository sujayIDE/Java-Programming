package com.set.MedicineManagementSystem;

import java.util.HashSet;
import java.util.Iterator;

public class MedicineService {
    private HashSet<Medicine> medicines=new HashSet<>();

    public boolean addMedicine(Medicine medicine)
    {
      if(medicines.add(medicine))
      {
          System.out.println("Medicine added succesfully....");
          return true;
      }
      else{
          System.out.println("Medicine with id : "+medicine.getMedicineId()+" is already exit.....");
          return false;
      }
    }

    public boolean removeMedicine(int medicineId)
    {
        Iterator<Medicine> medicineIterator=medicines.iterator();
        while (medicineIterator.hasNext())
        {
            Medicine m=medicineIterator.next();
            if(m.getMedicineId()==medicineId)
            {
                medicineIterator.remove();
                return true;
            }
        }
        return false;
    }

    public boolean searchMedicine(int medicineId)
    {
        for(Medicine medicine:medicines)
        {
            if(medicine.getMedicineId()==medicineId)
            {
                System.out.println("Medicine is  : "+medicine);
                return true;
            }
        }
        return false;
    }

    public void displayMedicine()
    {
        for(Medicine medicine:medicines)
        {
            System.out.println(medicine);
        }
    }
}
