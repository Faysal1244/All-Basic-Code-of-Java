package ENCOACADEMY.Encapsulation;

import java.util.Scanner;

public class Employee {

    private String name;
    private long accountId;
    private String email;
    private double empBalance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAccountId() {

        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getEmpBalance() {
        System.out.println("Please Enter Your Name");
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println("Please Enter Your Account Number : ");
        long ac_no = sc.nextLong();
        if (s.equals(name) && ac_no == accountId) {
            System.out.println(empBalance);
        }
        else{
            System.out.println("Wrong Information");
        }
        return empBalance;
    }

    public void setEmpBalance(double empBalance) {
        this.empBalance = empBalance;
    }


}

