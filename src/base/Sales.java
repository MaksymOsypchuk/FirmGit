package base;

public interface Sales {

    double calculateSales(int unitsAmount, double price);

    double calculateSalesTaxes(double salesAmount, double taxRate);
}
