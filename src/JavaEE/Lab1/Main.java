package JavaEE.Lab1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main
{
    public  static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);


        BigDecimal decimal1 = new BigDecimal("11111111111111111111111111111111111111111111111111111111111111111.0");
        BigDecimal decimal2 = new BigDecimal("222222222111111111.0");
        BigDecimal decimal3 = new BigDecimal("333333333333111111111.0");



        ScholarshipCard card2 = new ScholarshipCard("2", decimal2);
        ScholarshipCard card3 = new ScholarshipCard("3", decimal3);


        Student student1 = new Student("Akzhol");
        System.out.println(student1.getFirstName());

        Student student2 = new Student();
        student2.setFirstName("Akzhol");
        student2.setSecondName("Beisenbayev");
        System.out.println(student2.getFirstName() + '\n' + student2.getSecondName());
        System.out.println();

        Student student3 = new Student();
        student3.setFirstName("Akzhol");
        student3.setSecondName("Beisenbayev");
        student3.setId(1);
        System.out.println(student3.getFirstName() + '\n' + student3.getSecondName() + '\n' + student3.getId());
        System.out.println();

        Student student4 = new Student("Erasyl", "Eletay", 2, card2);
        System.out.println(student4.toString());
        System.out.println();

        Student student5 = new Student();
        student5.setFirstName("Orken");
        student5.setSecondName("Nagashbaiuly");
        student5.setId(3);
        student5.setCard(card3);
        System.out.println(student5.getFirstName() + " " + student5.getSecondName() + " с "
                            + student5.getCard() + " имеет " + student5.getCard().getBalance() + " тенге");
        System.out.println();

        student5.getCard().moneyWithdrawal(500.5);
        System.out.println("Остаток баланса " + student5.getFirstName() + " = " + student5.getCard().getBalance());
        student5.getCard().moneyRefill(2500.5);
        System.out.println("Остаток баланса " + student5.getFirstName() + " = " + student5.getCard().getBalance());



    }
}
