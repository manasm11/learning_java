public interface AccountInterface {
    void sendMoneyToAccount(Account accountTo, double moneyAmount);

    void withdrawMoney(double moneyAmount);

    void receiveMoney(Account accountFrom, double moneyAmount);
}
