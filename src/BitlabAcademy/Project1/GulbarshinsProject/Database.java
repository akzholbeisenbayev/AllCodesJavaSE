package BitlabAcademy.Project1.GulbarshinsProject;

public class Database {
    public static BankAccount allAccounts[] = new BankAccount[10];

    static{
        allAccounts[0]= new CityBankAccount("Gulbarshyn", "Utegen", 200000, "KZ5", "1402");
        allAccounts[1] = new CityBankAccount("Nurai", "Meirasheva" ,180000, "KZ1", "1107");
        allAccounts[2]= new CityBankAccount("Aidana", "Sarsenova", 100000, "KZ7", "2009");
        allAccounts[3]= new CityBankAccount("Aida", "Ayapbergenova", 20000, "KZ8", "1610");
        allAccounts[4] = new CityBankAccount("Asmiga", "Erkizkyzy", 36000, "KZ3", "2512");
        allAccounts[5] = new NationalBankAccount("Aru Kalibay", 78000, "NB8", "2307");
        allAccounts[6] = new NationalBankAccount("Gulim Kadirova", 56000, "NB5", "0709");
        allAccounts[7] =new NationalBankAccount("Meruert Zholdibayeva", 800000, "NB9", "1705");
        allAccounts[8]= new NationalBankAccount("Dinar Kairat", 650210, "NB7", "8963");
        allAccounts[9] = new NationalBankAccount("Zhandos Yerkeyev", 654231, "NB3", "0104");
    }
}