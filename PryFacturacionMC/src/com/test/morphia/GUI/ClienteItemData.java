package com.test.morphia.GUI;

import com.test.morphia.model.Cliente;

public class ClienteItemData {  
	  
    private static Cliente[] records;  
  
    public static Cliente[] getRecords() {  
        if (records == null) {  
            records = getNewRecords();  
        }  
        return records;  
    }  
  
    public static Cliente[] getNewRecords() {  
        return new Cliente[]{  
                /*new ItemRecord(1, "Glue Pelikan Roll-fix Permanent #950", "1088300", "A clean no-drips, no brush roll-on glue. Will not dry out. Suitable for artwork, photos or posters. Glue cartridges are 12 metres long. Refillable.", "Rollfix Glue", "Ea", 6.96, null, null),  
                new ItemRecord(2, "Glue Pelikan Roll-fix Refill Permanent #955", "1089400", null, "Rollfix Glue", "Ea", 3.73, null, null),  
                new ItemRecord(3, "Glue Pelikan Roll-fix Non Permanent #960", "1090500", null, "Rollfix Glue", "Ea", 6.96, null, null),  
                new ItemRecord(4, "Glue Pelikan Roll-fix Refill Non Permanent #965", "1091600", null, "Rollfix Glue", "Ea", 3.73, null, null)  
        */};  
    }  
}