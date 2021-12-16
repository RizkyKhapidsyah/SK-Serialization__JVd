
package com.rk;

import com.rk.module.Employee;
import com.rk.module.Product;
import com.rk.module.ProductItem;

import java.io.*;
import java.util.*;

public class SerializationDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        performSerialization();
        performDeserialization();

        performSerialization2();
        performDeserialization2();
    }

    public static void performSerialization() {

        System.out.println("----serialization demo----");

        Employee emp = new Employee();
        emp.name = "thariq";
        emp.email = "thariq@email.com";
        emp.city = "depok";
        emp.number = 21;

        try {

            System.out.println("proses serialization...");
            FileOutputStream fo = new FileOutputStream("d:/temp/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fo);
            out.writeObject(emp);
            out.close();
            fo.close();
            System.out.println("serialization selesai");
            System.out.println("Serialized data disimpan di d:/temp/employee.ser");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void performDeserialization() {

        System.out.println("----deserialization demo----");

        Employee emp = null;
        try {
            System.out.println("proses deserialization...");
            FileInputStream fi = new FileInputStream("d:/temp/employee.ser");
            ObjectInputStream in = new ObjectInputStream(fi);
            emp = (Employee) in.readObject();
            in.close();
            fi.close();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("deserialization selesai");
        System.out.println("Deserialized Employee...");
        System.out.println("------------------------");
        System.out.println(emp);

    }

    public static void performSerialization2() {

        System.out.println("----serialization demo 2----");

        Product product = new Product();
        product.id = 1;
        product.name = "Buah-buahan";

        List<ProductItem> items = new ArrayList<ProductItem>();

        for (int i = 1; i < 11; i++) {
            items.add(new ProductItem("product " + i, 0.12 * i));
        }

        product.items = items;

        try {

            System.out.println("proses serialization...");
            FileOutputStream fo = new FileOutputStream("d:/temp/product.ser");
            ObjectOutputStream out = new ObjectOutputStream(fo);
            out.writeObject(product);
            out.close();
            fo.close();
            System.out.println("serialization selesai");
            System.out.println("Serialized data disimpan di d:/temp/product.ser");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void performDeserialization2() {

        System.out.println("----deserialization demo 2----");

        Product product = null;
        try {
            System.out.println("proses deserialization...");
            FileInputStream fi = new FileInputStream("d:/temp/product.ser");
            ObjectInputStream in = new ObjectInputStream(fi);
            product = (Product) in.readObject();
            in.close();
            fi.close();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Product class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("deserialization selesai");
        System.out.println("Deserialized Product...");
        System.out.println("------------------------");
        System.out.println(product);

    }
}
