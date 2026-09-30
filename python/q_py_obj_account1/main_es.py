class Cuenta:
    def __init__(self, deposito=0):
        self.saldo = deposito
    def depositar(self, suma):
        self.saldo += suma
    def retirar(self, suma):
        self.saldo -= suma
    def get_saldo(self):
        return self.saldo
def main():
    cuentas = {}
    cuentas[0] = Cuenta()
    cuentas[1] = Cuenta(253)
    cuentas[0].depositar(253)
    cuentas[1].depositar(253)
    cuentas[0].retirar(253-50)
    cuentas[1].retirar(253-100)
    print(cuentas[0].get_saldo() + cuentas[1].get_saldo())
main()