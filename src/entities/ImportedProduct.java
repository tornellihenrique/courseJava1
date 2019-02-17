package entities;

public class ImportedProduct extends Product {

    private Double customsFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice() {
        return super.getPrice() + customsFee;
    }

    @Override
    public String priceTag() {
        StringBuilder str = new StringBuilder();
        str.append(super.getName());
        str.append(" $ ");
        str.append(totalPrice());
        str.append(" (Customs fee: $ ");
        str.append(customsFee);
        str.append(")");

        return String.valueOf(str);
    }
}
