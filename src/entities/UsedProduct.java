package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date manufacturerDate;

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, Date manufacturerDate) {
        super(name, price);
        this.manufacturerDate = manufacturerDate;
    }

    public Date getManufacturerDate() {
        return manufacturerDate;
    }

    public void setManufacturerDate(Date manufacturerDate) {
        this.manufacturerDate = manufacturerDate;
    }

    @Override
    public String priceTag() {
        StringBuilder str = new StringBuilder();
        str.append(super.getName());
        str.append(" (used) $ ");
        str.append(super.getPrice());
        str.append(" (Manufacture date: ");
        str.append(sdf.format(manufacturerDate));
        str.append(")");

        return String.valueOf(str);
    }
}
