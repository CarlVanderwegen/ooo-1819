package ui;

import domain.Shop;

import javax.swing.*;

public class View {
    private Shop shop;
    public View() {
        shop = new Shop();


        String menu = "1. Add product\n2. Show product\n3. Show rental price\n\n0. Quit";
        int choice = -1;
        while (choice != 0) {
            String choiceString = JOptionPane.showInputDialog(menu);
            choice = Integer.parseInt(choiceString);
            if (choice == 1) {
                //addProduct(shop);
            } else if (choice == 2) {
                //showProduct(shop);
            } else if (choice == 3){
                //showPrice(shop);
            }
        }
    }
}
