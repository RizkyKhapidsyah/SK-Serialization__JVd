
package com.rk.module;

import java.util.List;

public class Product implements java.io.Serializable {
    public int id;
    public String name;
    public List<ProductItem> items;

    @Override
    public String toString() {

        String str = "Id: " + id + "\r\nName: " + name + "\r\n";

        for (ProductItem item : items) {
            str = str + "+++Item Name: " + item.name +
                    "   Price: " + item.price + "\r\n";
        }

        return str;
    }
}
