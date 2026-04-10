import java.util.Date;
import java.text.SimpleDateFormat;

public class UsedProduct extends Product {
    private Date manufactureDate;

    public UsedProduct(String name, double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    @Override
    public String priceTag() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return getName()
                + " (used) $ "
                +String.format("%.2f", getPrice())
                +" (Manufacture date: "
                + sdf.format(manufactureDate)
                + ")";
    }
}
