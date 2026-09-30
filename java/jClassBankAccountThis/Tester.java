public class Tester {
	  public static void main(String[] args) {    

	        BankAccountThis myBankAccount = new BankAccountThis(54.0);
	        myBankAccount.monthlyFee();
	        double result = myBankAccount.getBalance();
	      System.out.println(result);
    }
	}