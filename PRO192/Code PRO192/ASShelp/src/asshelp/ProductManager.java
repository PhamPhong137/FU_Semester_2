/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asshelp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductManager<T extends Product> {

    private ArrayList<T> products;

    public ProductManager() {
        products = new ArrayList<>();
    }

    public void addProduct(T product) {
        products.add(product);
    }

    public void updateProduct(T product) {
        int index = findProductIndex(product.getCode());
        if (index != -1) {
            products.set(index, product);
        } else {
            System.out.println("Product not found!");
        }
    }

    public void deleteProduct(String code) {
        int index = findProductIndex(code);
        if (index != -1) {
            products.remove(index);
        } else {
            System.out.println("Product not found!");
        }
    }

    public void printProducts() {
        for (T product : products) {
            System.out.println(product);
        }
    }

    public void sortSmartphonesByPriceDescending() {
        ArrayList<Smartphone> smartphones = new ArrayList<>();
        for (T product : products) {
            if (product instanceof Smartphone) {
                smartphones.add((Smartphone) product);
            }
        }

        Collections.sort(smartphones, Comparator.comparingDouble(Product::getPrice).reversed());
        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }
    }

    public void sortTVsByPriceAscending() {
        ArrayList<TV> tvs = new ArrayList<>();
        for (T product : products) {
            if (product instanceof TV) {
                tvs.add((TV) product);
            }
        }

        Collections.sort(tvs, Comparator.comparingDouble(Product::getPrice));
        for (TV tv : tvs) {
            System.out.println(tv);
        }
    }

    public void sortAirConditionersByPriceDescending() {
        ArrayList<AirConditioner> airConditioners = new ArrayList<>();
        for (T product : products) {
            if (product instanceof AirConditioner) {
                airConditioners.add((AirConditioner) product);
            }
        }

        Collections.sort(airConditioners, Comparator.comparingDouble(Product::getPrice).reversed());
        for (AirConditioner airConditioner : airConditioners) {
            System.out.println(airConditioner);
        }
    }

    public void printHighestUnitPriceProducts() {
        Smartphone highestSmartphone = null;
        TV highestTV = null;
        AirConditioner highestAirConditioner = null;

        for (T product : products) {
            if (product instanceof Smartphone) {
                if (highestSmartphone == null || product.getPrice() > highestSmartphone.getPrice()) {
                    highestSmartphone = (Smartphone) product;
                }
            } else if (product instanceof TV) {
                if (highestTV == null || product.getPrice() > highestTV.getPrice()) {
                    highestTV = (TV) product;
                }
            } else if (product instanceof AirConditioner) {
                if (highestAirConditioner == null || product.getPrice() > highestAirConditioner.getPrice()) {
                    highestAirConditioner = (AirConditioner) product;
                }
            }
        }

        System.out.println("Highest priced products for each type:");
        System.out.println("Smartphone: " + highestSmartphone);
        System.out.println("TV: " + highestTV);
        System.out.println("Air Conditioner: " + highestAirConditioner);
    }

    public double getTotalAmount() {
        double totalAmount = 0;
        for (T product : products) {
            totalAmount += product.getPrice() * product.getQuantity();
        }
        return totalAmount;

    }
}
