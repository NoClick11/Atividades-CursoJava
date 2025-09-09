package entities;

public class ImportedProduct extends Produto {

    private Double customsFee;

    public ImportedProduct() {
    }

    public ImportedProduct(Double price, String name, Double customsFee) {
        super(price, name);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public double totalPrice() {
        return getPrice() + customsFee;
    }

    @Override
    public String priceTag() {
        return name
                + " $ "
                + String.format("%.2f", totalPrice())
                + "(Customs fee: $ " + getCustomsFee() + ")";
    }

}
