//Создать класс BankAccount который будет иметь два поля 	accountNumber и balance.
// Реализовать в классе методы setBalance() который будет задавать баланс ,
// credit() метод должен начислять средства на счет, debit() - снимать средтва со  счета.
// Реализовать условие что если сумма снятия меньше чем остаток на счету - вывести сообщение : “Сумма снятия больше чем остаок на счету!” . Создать обьект класса и проверить работу программы.
public class BankAccount {
    int accountNumber;
    double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void credit(double addSum) {
        if (addSum < 0) {
            System.out.println("Сумма не может быть отрицательной");
        } else balance += addSum;
    }

    public void debit(double minusSum) {
        if (minusSum < 0) {
            System.out.println("Сумма снятия не может быть отрицательной");
        } else if (balance < minusSum) {
            System.out.println("Сумма снятия больше чем остаток на счету!");
        } else balance -= minusSum;
    }

    public static void main(String[] args) {
        BankAccount bankaccount = new BankAccount();
        bankaccount.setBalance(100);
        bankaccount.credit(20);
        bankaccount.debit(5);
        System.out.println(bankaccount.balance);
    }
}
