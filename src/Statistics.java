import java.util.ArrayList;
import java.util.List;

public class Statistics {
    public static double getSaldo(List<MoneyFlow> db) {
        double sum = 0;
        for (MoneyFlow tmp: db) {
            if (tmp.isIncome())
                sum = sum + tmp.getAmount();
            else sum = sum - tmp.getAmount();
        }
        return sum;
    }
}
