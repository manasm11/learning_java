import java.util.Arrays;

public class Account {

    public Account(int id) {
        this.id = id;
    }

    private static final int MAX_NUMBER_OF_TRANSACTIONS = 10;

    int id;
    Transaction[] transactions;
    int transactionTopIndex;

    {
        transactions = new Transaction[MAX_NUMBER_OF_TRANSACTIONS];
        transactionTopIndex = -1;
    }

    public void sendMoneyToAccount(Account accountTo, double moneyAmount) {
        Transaction transaction = new Transaction(this, accountTo, moneyAmount, StandardAccountOperations.MONEY_TRANSFER_SEND);
        addTransaction(transaction);
        accountTo.receiveMoney(this, moneyAmount);
    }

    public void withdrawMoney(double moneyAmount) {
        Transaction transaction = new Transaction(this, null, moneyAmount, StandardAccountOperations.WITHDRAW);
        addTransaction(transaction);
    }

    public void receiveMoney(Account accountFrom, double moneyAmount) {
        Transaction transaction = new Transaction(accountFrom, this, moneyAmount, StandardAccountOperations.MONEY_TRANSFER_RECEIVE);
        addTransaction(transaction);
    }

    Transaction[] getTransactions() {
        return transactions.clone();
    }

    private void addTransaction(Transaction transaction) {
        if (transactionTopIndex >= transactions.length - 1) {
            transactions = Arrays.copyOf(transactions, transactions.length * 2);
        }
        transactions[++transactionTopIndex] = transaction;
    }

    @Override
    public String toString() {
        return "Account ID: " + this.id;
    }

    public static class Transaction {
        Account accountFrom;
        Account accountTo;
        double moneyAmount;
        StandardAccountOperations operation;

        public Account getAccountFrom() {
            return accountFrom;
        }

        public void setAccountFrom(Account accountFrom) {
            this.accountFrom = accountFrom;
        }

        public Account getAccountTo() {
            return accountTo;
        }

        public void setAccountTo(Account accountTo) {
            this.accountTo = accountTo;
        }

        public double getMoneyAmount() {
            return moneyAmount;
        }

        public void setMoneyAmount(double moneyAmount) {
            this.moneyAmount = moneyAmount;
        }

        public StandardAccountOperations getOperation() {
            return operation;
        }

        public void setOperation(StandardAccountOperations operation) {
            this.operation = operation;
        }

        public Transaction(Account accountFrom, Account accountTo, double moneyAmount, StandardAccountOperations operation) {
            this.accountFrom = accountFrom;
            this.accountTo = accountTo;
            this.moneyAmount = moneyAmount;
            this.operation = operation;
        }

        @Override
        public String toString() {
            return "Transaction [accountFrom=" + accountFrom + ", accountTo=" + accountTo
                    + ", moneyAmount=" + moneyAmount + ", operation=" + operation + "]";
        }
    }
}
