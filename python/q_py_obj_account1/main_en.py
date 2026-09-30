class Account:
    def __init__(self, deposit=0):
        self.balance = deposit
         
    def deposit(self, sum):
        self.balance += sum
         
    def withdraw(self, sum):
        self.balance -= sum
    def get_balance(self):
        return self.balance
         
def main():
    accounts = {}
    accounts[0] = Account()
    accounts[1] = Account(444)
         
    accounts[0].deposit(444)
    accounts[1].deposit(444)
    accounts[0].withdraw(444-50)
    accounts[1].withdraw(444-100)
    print(accounts[0].get_balance() + accounts[1].get_balance())
main()