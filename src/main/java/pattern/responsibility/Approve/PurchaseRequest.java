package pattern.responsibility.Approve;

public class PurchaseRequest {
    private int id;
    private double amount;
    private String description;

    public PurchaseRequest(int id, double amount, String description) {
        this.id = id;
        this.amount = amount;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }
}
