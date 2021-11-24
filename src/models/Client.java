package models;

import base.Discount;
import base.Payment;
import base.Salary;
import base.Sales;

// Model.
// Применение интерфейсов.
public class Client implements Payment, Discount, Salary, Sales {

    private String name;
    private int quantity;
    private double price;
    private int soldAmount;
    private double unitPrice;
    private double salesAmount;
    private double taxRate;
    private double taxAmount;
    private final static int DISCOUNT_RATE = 15;

    //переменные для расчета заработной платы
    private double hourlyRate;
    private double totalHours;

    public Client() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Расчёт платежа, без учета скидки.
    @Override
    public double calculatePayment(int quota, double price) {
        return quota * price;
    }

    // Расчёт платежа, с учетом скидки.
    @Override
    public double calculatePayment(double payment, double discount) {
        return payment - discount;
    }

    // Расчёт суммы скидки.
    @Override
    public double calculateDiscount(double payment) {
        return payment * DISCOUNT_RATE / 100;
    }

    // Расчет суммы продаж
    @Override
    public double calculateSales(int soldAmount, double unitPrice) {
        return soldAmount * unitPrice;
    }

    //Расчет суммы налога
    @Override
    public double calculateSalesTaxes(double salesAmount, double taxRate) {
        return salesAmount * taxRate;
    }

    @Override
    public double calculateSalary(double hourlyRate, double totalHours) {
        return hourlyRate * totalHours;
    }
}
