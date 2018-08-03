import java.time.LocalDate;

public class MoneyFlow {
    private boolean income; //true jeśli wpłata
    private double amount;
    private String description;
    private LocalDate localDate;

    public MoneyFlow(boolean income, double amount, String description, LocalDate localDate) {
        this.income = income;
        this.amount = amount;
        this.description = description;
        this.localDate = localDate;
    }

    public boolean isIncome() {
        return income;
    }

    public void setIncome(boolean income) {
        this.income = income;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public String toString() {
        return "MoneyFlow{" +
                "income=" + income +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", localDate=" + localDate +
                '}';
    }
}
