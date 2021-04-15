package dto;

public class Invoice {
    private Address from;
    private Address to;
    private Double amount;

    public Invoice(Address from, Address to, Double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public Invoice() {
    }

    public Address getFrom() {
        return from;
    }

    public Address getTo() {
        return to;
    }

    public Double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "from=" + from +
                ", to=" + to +
                ", amount=" + amount +
                '}';
    }
}
