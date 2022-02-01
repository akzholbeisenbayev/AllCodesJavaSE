package BitlabAcademy.OOP.Project.studentsSolution;

public class Database{

    public static BankAccount allAccounts[] = new BankAccount[10];

    static{
        allAccounts[0] = new CityBankAccount("Dauren","Abilkassym",20000,"KZ2101", "2101");
        allAccounts[1] = new CityBankAccount("Daniyar","Bulegenov",10000,"KZ2210", "2210");
        allAccounts[2] = new NationalBankAccount("Oleg Mun",2000,"KZ1201", "1201");
        allAccounts[3] = new NationalBankAccount("Aruzhan Parzhan", 15000, "KZ3003", "3003");
        allAccounts[4] = new NationalBankAccount("Anna Voinova", 17000, "RU2607", "2607");
        allAccounts[5] = new CityBankAccount("Nargiza", "Sharafdinova", 5000, "KZ2601", "2601");
        allAccounts[6] = new CityBankAccount("Maksat", "Oraz", 300, "KZ1111", "1111");
        allAccounts[7] = new NationalBankAccount("Amir Dikhanbayev", 19500, "KZ0610", "0610");
        allAccounts[8] = new NationalBankAccount("Maksim Kharitonov", 30000, "RU1605", "1605");
        allAccounts[9] = new CityBankAccount("Shyngys", "Elemesov", 14500, "KZ2407", "2407");

    }

}