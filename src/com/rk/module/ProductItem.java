
package com.rk.module;

public class ProductItem implements java.io.Serializable {
    public String name;
    public double price;

    public ProductItem(String nm, double prc) {
        name = nm;
        price = prc;
    }
}
