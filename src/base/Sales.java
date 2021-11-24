package base;

public interface Sales {

    double calculateSales(int quota, double price);

    double calculateSalesTaxes(double payment, double discount);
}
