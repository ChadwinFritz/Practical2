package za.ac.cput;

import javax.swing.*;

public class TestCircle {

    public static void main(String[] args) {
        Circle ccl;

        String sRadius = JOptionPane.showInputDialog("Please enter a radius");
        double dRadius = Double.parseDouble(sRadius);

        ccl = new Circle(dRadius);

        JOptionPane.showMessageDialog(null, ccl + "\n" + "Diameter = " + ccl.calDiameter() + "\n" + "Circumference = " + ccl.Circumference() + "\n" + "Area = " + ccl.Area());
    }

}
