package javaCore.src.lesson7.levelB.b1;

/*
Создать класс BankAccount, который представляет банковский счет.
Каждый банковский счет имеет уникальный номер и баланс. Класс BankAccount должен содержать внутренний класс
Transaction, который представляет транзакцию на счете. Внутренний класс Transaction должен иметь методы для
 пополнения счёта и снятия средств с баланса, а также для получения информации о текущем балансе.
 В методе main класса Run проверьте работу вашего кода.

 */
public class BankAccount {
    private int id = (int) (1 + Math.random() * 81273);

    private class Transaction {
        private final int balance = (int) (20 + Math.random() * 124);
        private final int removeMoney = (int) (20 + Math.random() * 124);
        private final int addMoney = (int) (1 + Math.random() * 124);

        void addMoney() {
            System.out.println("Пополнение счета: " + id + ", на сумму: " + addMoney + ",остаток баланса: " + (balance + addMoney));
        }

        void removeMoney() {
            System.out.println("Снятие средств с счета: " + id + ", на сумму: " + removeMoney + ",остаток баланса: " + (balance - removeMoney));
        }

        void statusBalance() {
            System.out.println("Текущий баланс: " + balance + ", для счета " + id);
        }
    }

    public void print() {
        Transaction transaction = new Transaction();
        transaction.statusBalance();
        transaction.removeMoney();
        transaction.addMoney();


    }

}
