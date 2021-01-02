public class BankAccount {
    String owner;
    int money;

    BankAccount(String owner, int moneyAmount) {
        this.owner = owner;
        this.money = moneyAmount;

    }

    String getOwner() {
        return this.owner;
    }

    String getMoney() {
        String moneyResult;
        moneyResult = Integer.toString(this.money);
        return moneyResult;
    }

}
