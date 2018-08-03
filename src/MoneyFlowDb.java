import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MoneyFlowDb {

    private static List<MoneyFlow> transactions = new ArrayList<>();

//    public MoneyFlowDb(List<MoneyFlow> transactions) {
//        this.transactions = transactions;
//    }

    public List<MoneyFlow> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<MoneyFlow> transactions) {
        this.transactions = transactions;
    }

    //    private  List<MoneyFlow> incomes = new ArrayList<>();
//    private  List<MoneyFlow> outcomes = new ArrayList<>();
//
//    public List<MoneyFlow> getIncomes() {
//        return incomes;
//    }
//
//    public void setIncomes(List<MoneyFlow> incomes) {
//        this.incomes = incomes;
//    }
//
//    public List<MoneyFlow> getOutcomes() {
//        return outcomes;
//    }
//
//    public void setOutcomes(List<MoneyFlow> outcomes) {
//        this.outcomes = outcomes;
//    }
//
//    public void addIncomes(MoneyFlow moneyFlow){
//            incomes.add(moneyFlow);
//    }
//
//    public void addOutcomes(MoneyFlow moneyFlow){
//            outcomes.add(moneyFlow);
//    }

    public void addTransactions(MoneyFlow moneyFlow){
            transactions.add(moneyFlow);
    }
}
