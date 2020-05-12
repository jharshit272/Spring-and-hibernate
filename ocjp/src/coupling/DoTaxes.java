package coupling;
public class DoTaxes {
	float rate;
	float doColorado() {
		SalesTaxRates str = new SalesTaxRates();
		rate = str.salesRate; // ouch this should be a method call like:
		// rate = str.getSalesRate("CO");
		// do stuff with rate
		return rate;
	}
}