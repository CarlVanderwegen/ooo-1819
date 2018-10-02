package ui;

import domain.model.*;
import domain.*;

import javax.swing.*;

public class View {
    private Shop shop;

    private final char MOVIE = 'M';
    private final char GAME = 'G';
    private final char CD = 'C';

    public View() {
        shop = new Shop();

        String menu = "1. Add product\n2. Show product\n3. Show rental price\n\n0. Quit";
        int choice = -1;
        while (choice != 0) {
            String choiceString = JOptionPane.showInputDialog(menu);
            choice = Integer.parseInt(choiceString);
            if (choice == 1) {
                Boolean added = false;
                while (!addProduct()) {}

            } else if (choice == 2) {
                showProduct();
            } else if (choice == 3){
                showPrice();
            }
        }
    }

    private void showPrice() {
        String id = JOptionPane.showInputDialog("Enter the id:");
        int idint = Integer.parseInt(id);
        Product p = shop.getProductById(idint);

        String daysString = JOptionPane.showInputDialog("Enter the number of days:");
        int days = Integer.parseInt(daysString);

        JOptionPane.showMessageDialog(null,  "price: " + p.getPrice(days));

    }

    private void showProduct() {
        String id = JOptionPane.showInputDialog("Enter the id:");
        int idint = Integer.parseInt(id);
        Product p = shop.getProductById(idint);
        if (p != null) {
            JOptionPane.showMessageDialog(null, p.getName());
        } else {
            JOptionPane.showMessageDialog(null, "wrong id.");
        }
    }

    private boolean addProduct() {
        String title = JOptionPane.showInputDialog("Enter the title:");
        String id = JOptionPane.showInputDialog("Enter the id:");
        int idint = Integer.parseInt((id));
        String type = JOptionPane.showInputDialog("Enter the type (M:movie/G:game/C:CD):");
        Product p;

        if (type.charAt(0) == MOVIE) {
            p = new Movie(title, idint);
        } else if (type.charAt(0) == GAME){
            p = new Game(title, idint);
        } else if (type.charAt(0) == CD) {
            p = new CD(title, idint);
        } else {
            JOptionPane.showMessageDialog(null, "wrong type of product.");
            return false;
        }
        shop.addProduct(p);
        return true;

    }
}
