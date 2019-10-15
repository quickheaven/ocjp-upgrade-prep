package ca.quickheaven.ocjp.practice.test.two;

import ca.quickheaven.ocjp.practice.test.vo.Account;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Question44 {

    public static void main(String[] args) {
        Account account1 = new Account(1, 50.0);
        Account account2 = new Account(2, 200.00);

        Map<Integer, Account> accounts = new HashMap<>();
        accounts.put(account1.getId(), account1);
        accounts.put(account2.getId(), account2);

        BiFunction<Integer, Account, Account> deposit = (i, a) -> { // 1
            if (a.getBalance() < 100.0) {
                return new Account(i, a.getBalance() + 100.00); // 2
            } else {
                return a;
            }
        };

        accounts.compute(3, deposit); // 3
        Account account = accounts.get(1);
        System.out.print(account);

        // What happens when the above code is compiled and run?
        // >> An exception is thrown at runtime
        // Since we pass 3 as a key to the compute method, an Account associated with this key does not exist, leading to
        // a NullPointerException when the method Account.getBalance is called at line // 2
    }
}
