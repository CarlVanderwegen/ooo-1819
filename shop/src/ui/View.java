package ui;

import domain.Game;
import domain.Movie;
import domain.Product;
import domain.Shop;

import javax.swing.*;

public class View {
    private Shop shop;

    private final char MOVIE = 'M';
    private final char GAME = 'G';

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
        Product p = shop.showPrice(idint);

        JOptionPane.showMessageDialog(null,  "price: " + p.getPrice());

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
        String type = JOptionPane.showInputDialog("Enter the type (M for movie/G for game):");
        Product p;

        if (type.charAt(0) == MOVIE) {
            p = new Movie(title);
        } else if (type.charAt(0) == GAME){
            p = new Game(title);
        } else {
            JOptionPane.showMessageDialog(null, "wrong type of product.");
            return false;
        }
        shop.addProduct(p);
        return true;

    }
}
