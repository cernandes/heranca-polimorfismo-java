package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Date manufactoryDate;

	public UsedProduct() {

	}

	public UsedProduct(String name, double price, Date manufactoryDate) {
		super(name, price);
		this.manufactoryDate = manufactoryDate;
	}

	public Date getDate() {
		return manufactoryDate;
	}

	@Override
	public String priceTag() {
		return super.getName() + " (used) $ " + super.getPrice() + " (Manufactory date: " + sdf.format(manufactoryDate)
				+ ")";

	}

}
