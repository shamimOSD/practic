package ch3;
//Create a Invoice class for a hardware store. Include variables, methods, and a method to calculate invoice amount.

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        setQuantity(quantity);
        setPricePerItem(pricePerItem);
    }
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartNumber() {
        return partNumber;
    }
    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public String getPartDescription() {
        return partDescription;
    }
    public void setQuantity(int quantity) {
        if (quantity < 0) {
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem < 0.0) {
            this.pricePerItem = 0.0;
        } else {
            this.pricePerItem = pricePerItem;
        }
    }

    public double getPricePerItem() {
        return pricePerItem;
    }
    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
    public static void main(String[] args) {

        Invoice invoice = new Invoice("1234", "Pencil", 5, 9.99);

        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per Item: tk" + invoice.getPricePerItem());
        System.out.println("Total Invoice Amount: tk" + invoice.getInvoiceAmount());
    }
}
