package checkout;

public class Receipt {

    private Product[] items;
    private int itemsCount;
    private double discountPercent;

    static final double VAT = 0.075;

    public Receipt(Product[]items, int itemsCount, double discountPercent){
        this.items = items;
        this.itemsCount = itemsCount;
        this.discountPercent = discountPercent;

    }

    public double getSubTotal() {
        double subTotal = 0;
        for(int count = 0; count < itemsCount; count++){
            subTotal += items[count].newlineTotal();
        }
        return subTotal;
    }

    public double getDiscountAmount() {
        return getSubTotal() * (discountPercent / 100);
    }

    public double getVatAmount() {
        return getDiscountAmount() * VAT;
    }

    public double getBillTotal() {
        return getSubTotal() - getDiscountAmount() + getVatAmount();
    }

    public double getBalance(double amountPaid) {
        return amountPaid - getBillTotal();
    }
    


}
