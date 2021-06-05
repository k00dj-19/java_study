package study;
import java.util.Scanner;
import java.io.IOException;
class Accounting{
    public double valueOfSupply;
    public double vatRate;
    public double expenseRate;
    public void print() {
        System.out.println("Value of supply : "+ valueOfSupply);
        System.out.println("VAT : "+ getVAT());
        System.out.println("Total : "+ getTotal());
        System.out.println("Expense : "+ getExpense());
        System.out.println("Income : "+ getIncome());
        
        for(int i = 0; i < getDividend().length; i ++){
                System.out.println("Dividend" + (i+1) + " : " + getDividend()[i]);
        }

        // System.out.println("Dividend1 : "+ dividend1);
        // System.out.println("Dividend2 : "+ dividend2);
        // System.out.println("Dividend3 : "+ dividend3); 
    }
    public double[] getDividend(){
        double dividend1;
        double dividend2;
        double dividend3;
        
        if(getIncome() > 10000.0) {
            dividend1 = getIncome() * 0.5;
            dividend2 = getIncome() * 0.3;
            dividend3 = getIncome() * 0.2;
        } else {
            dividend1 = getIncome() * 1.0;
            dividend2 = getIncome() * 0;
            dividend3 = getIncome() * 0;
        }
        double[] dividendArr = new double[] {dividend1, dividend2, dividend3};
        return dividendArr;
    }
    public double getIncome() {
        return valueOfSupply - getExpense();
    }
    public double getExpense() {
        return valueOfSupply * expenseRate;
    }
    public double getTotal() {
        return valueOfSupply + getVAT();
    }
    public double getVAT() {
        return valueOfSupply * vatRate;
    } 
    public double getValueOfSupply() {
       
        return valueOfSupply;
    }
}

public class AccountingApp {
    
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
 
        Accounting a1 = new Accounting();
        System.out.print("값을 입력하세요 : ");
        a1.valueOfSupply= sc.nextDouble(); 
        a1.vatRate = 0.1;
        a1.expenseRate = 0.3;
        a1.print();
       
        Accounting a2 = new Accounting();
        System.out.print("값을 입력하세요 : ");
        a2.valueOfSupply = sc.nextDouble();
        a2.vatRate = 0.2;
        a2.expenseRate = 0.1;
        a2.print();
        
        sc.close();
    }
    
}
