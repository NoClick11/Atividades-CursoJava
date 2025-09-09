package entities;

import java.time.LocalDate;

public class UsedProduct extends Produto{

    private LocalDate manufactureDate;

    public UsedProduct() {
    }

    public UsedProduct(Double price, String name, LocalDate manufactureDate) {
        super(price, name);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        return name
                + " (used) "
                + " ($) "
                + String.format("%.2f", price)
                + "(Manufacture date : " + getManufactureDate() + (")");
    }
}
