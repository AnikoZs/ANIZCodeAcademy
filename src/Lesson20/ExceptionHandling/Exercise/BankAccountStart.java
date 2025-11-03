package Lesson20.ExceptionHandling.Exercise;

import java.util.Scanner;

public class BankAccountStart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount konto = new BankAccount(1000.0);

        System.out.println("Velkommen til Java Bank!");
        System.out.println("Din nuværende saldo er: " + konto.getSaldo() + " kr.");

        System.out.print("Indtast beløb, du vil hæve: ");
        double beløb = input.nextDouble();

        try {
            konto.withdraw(beløb);
            System.out.println("Transaktionen blev gennemført!");
        } catch (NegativeAmountException e) {
            System.out.println("Fejl: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Fejl: " + e.getMessage());
        } catch (BankSystemException e) {
            System.out.println("Teknisk fejl: " + e.getMessage());
            System.out.println("Prøv igen senere...");
        } catch (Exception e) {
            System.out.println("En uventet fejl opstod: " + e.getMessage());
        } finally {
            System.out.println("Tak fordi du brugte Java Bank!");
        }

        input.close();
    }
}
