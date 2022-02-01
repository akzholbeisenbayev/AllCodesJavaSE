package BitlabAcademy.Project1.DaniyarsProject;

public class Database
{
    public static BankAccount allAccounts[] = new BankAccount[10];
    static{

        allAccounts[0] = new CityBankAccount("Ilyas","Zhuanyshev","KZC010322312","0102", 20000);
        allAccounts[1] = new CityBankAccount("Erbol","Assanbek","KZC010322313","0101", 10000);
        allAccounts[2] = new NationalBankAccount("Ilyas Zhuanyshev","KZN0000000","0102", 200);
        allAccounts[3] = new CityBankAccount("Ilyas1","Zhuanyshev1","KZC001111","0103", 460000);
        allAccounts[4] = new CityBankAccount("Erbol1","Assanbek1","KZC1112222","0104", 450000);
        allAccounts[5] = new NationalBankAccount("Ilyas Zhuanyshev1","KZN333333","0105", 300);
        allAccounts[6] = new CityBankAccount("Ilyas2","Zhuanyshev2","KZC44444","0106", 100000);
        allAccounts[7] = new CityBankAccount("Erbol2","Assanbek2","KZC55555","0107", 90000);
        allAccounts[8] = new NationalBankAccount("Ilyas Zhuanyshev2","KZN166666","0108", 400);
        // Таким образом на ваше усмотрение мы должны заполнить список всех счетов

    }
}