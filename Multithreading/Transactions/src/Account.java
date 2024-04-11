public class Account {
    private long money;
    private String accNumber;
    private boolean isWorked;

    public Account(long money, String accNumber, boolean isWorked) {
        this.money = money;
        this.accNumber = accNumber;
        this.isWorked = isWorked;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public boolean isWorked() {
        return isWorked;
    }

    public void setWorked(boolean blocked) {
        isWorked = blocked;
    }
}
