package domain;

import javax.swing.*;
import java.util.ArrayList;

public class Shop {
    private ArrayList<Product> producten;
    public Shop() {
        producten = new ArrayList<Product>();
    }

    public void addProduct(Product p) {
        if (p != null) {
            producten.add(p);
        }

    }

    public Product getProductById(int id) {
        for(int i = 0; i < producten.size(); i++) {
            if(producten.get(i).getId() == id) {
                return producten.get(i);
            }
        }
        return null;
    }

    public Product showPrice(int id) {
        for(int i = 0; i < producten.size(); i++){
            if(producten.get(i).getId() == id){
                return producten.get(i);
            }
        }
        return null;
    }

    /*public void showProduct(int id) {
        int idx = -1;
        boolean found = false;
        for(int i = 0; i < producten.size() && !found; i++)
        {
            if(producten.get(i).getId() == id)
            {
                idx = i;
                found = true;
            }
        }
        if(found)
        {
            JOptionPane.showMessageDialog(null, shop.productTitles.get(idx));
        }
    }*/
}
