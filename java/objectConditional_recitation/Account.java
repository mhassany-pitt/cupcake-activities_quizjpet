class Account {

    private final double RATE = 0.01; 
    private String acctName;
    private long acctNumber;
    private double balance;
  
    public Account (String owner, long account, double initial) {
      acctName = owner;
      acctNumber = account;
      balance = initial;
    }
  
    public double deposit (double amount) {
      if (amount > 0) {
        balance = balance + amount;
      }
      return balance;
    }
    public double withdraw (double amount, double fee) {
      if (amount > 0 && fee >= 0 && amount+fee < balance) {
        balance = balance - amount - fee;
      }
      return balance;
    }
    public double addInterest () {
      balance += (balance * RATE);
      return balance;
    }
    public double getBalance() {
      return balance;
    }
    public long getAcctNumber() {
      return acctNumber;
    }
  }