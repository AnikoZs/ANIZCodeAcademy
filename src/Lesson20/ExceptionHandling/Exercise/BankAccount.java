package Lesson20.ExceptionHandling.Exercise;

import java.util.Random;

public class BankAccount {
    private double saldo;

    public BankAccount(double startSaldo) {
        this.saldo = startSaldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void withdraw(double beløb) throws BankSystemException {
        // Simuler en risiko for systemfejl
        Random random = new Random();
        int chance = random.nextInt(10); // 0-9
        if (chance == 0) { // 10% risiko for systemfejl
            throw new BankSystemException("Systemfejl: forbindelsen til banken blev afbrudt.");
        }

        // Valider beløb
        if (beløb < 0) {
            throw new NegativeAmountException("Beløbet kan ikke være negativt!");
        }

        if (beløb > saldo) {
            throw new InsufficientFundsException("Saldoen er for lav! Du har kun " + saldo + " kr.");
        }

        // Udfør hævning
        saldo -= beløb;
        System.out.println("Du har hævet " + beløb + " kr. Ny saldo: " + saldo + " kr.");
    }
}
