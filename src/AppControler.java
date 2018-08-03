import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class AppControler {

    private static final int INCOME = 1;
    private static final int OUTGO = 2;
    private static final int SHOW = 3;
    private static final int DISC_READ = 4;
    private static final int DISC_WRITE = 5;
    private static final int SHUT_DOWN = 6;

    private MoneyFlowDb moneyFlowDb = new MoneyFlowDb();
    Scanner scanner = new Scanner(System.in);

    private String initFileName = "transactions.txt";


    void mainLoop()  {
        try {
            moneyFlowDb.setTransactions(FileUtils.csvToTransactionList(initFileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        int option = 0;
        do {
            MoneyFlowIO.showMainMenu();
            option = scanner.nextInt();
            scanner.nextLine();
            executeOption(option);
        } while (option != SHUT_DOWN);
    }


    private void executeOption(int option) {
        double amount;
        String descr;
        MoneyFlow moneyFlow;
        switch (option) {
            case INCOME:
                System.out.println("Podaj kwotę:");
                amount = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Skąd ta kasa?");
                descr = scanner.nextLine();
                moneyFlow = new MoneyFlow(true, amount, descr, LocalDate.now());
                moneyFlowDb.addTransactions(moneyFlow);
                break;
            case OUTGO:
                System.out.println("Podaj kwotę:");
                amount = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Na co wydałeś te " + amount + "zeta");
                descr = scanner.nextLine();
                moneyFlow = new MoneyFlow(false, amount, descr, LocalDate.now());
                moneyFlowDb.addTransactions(moneyFlow);
                break;
            case SHOW:
                for (MoneyFlow mf : moneyFlowDb.getTransactions()) {
                    System.out.println(mf.toString());
                }
                double saldo = Statistics.getSaldo(moneyFlowDb.getTransactions());
                System.out.println("Saldo:" + saldo);

                break;
            case SHUT_DOWN:
                System.out.println("Bye bye");
                break;
            default:
                System.out.println("Nieznana opcja");
        }
    }

    private void getStats() {

    }

}
