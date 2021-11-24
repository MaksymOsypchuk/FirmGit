package base;

public interface Sales {

    double calculateSales(int soldAmount, double unitPrice);

    double calculateSalesTaxes(double salesAmount, double taxRate);
}
