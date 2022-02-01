package BitlabAcademy.Project1.DiasSProject;

public class Database {
    public static BankAccount allAccounts[] = new BankAccount[10];

    static{

        allAccounts[0]=new CityBankAccount("Emil'","Mavlutov",20000,"KZC010322312","7182");
        allAccounts[1]=new CityBankAccount("Aman","Abitov",5000,"KZC010378551","2002");
        allAccounts[2]=new CityBankAccount("Erkezhan","Emileva",60000,"KZC010388931","2341");
        allAccounts[3]=new CityBankAccount("Alexander","Shin",38900,"KZC010354789","5598");
        allAccounts[4]=new CityBankAccount("Valeriya","Konstnova",77000,"KZC010344012","4422");

        allAccounts[5]=new NationalBankAccount("Sabitova Symbat",2000,"KZN010476238","4466");
        allAccounts[6]=new NationalBankAccount("Tyrlybekova Sandira",22000,"KZN010467891","7794");
        allAccounts[7]=new NationalBankAccount("Khasenova Nazerke",90000,"KZN010487562","9924");
        allAccounts[8]=new NationalBankAccount("Artem Rostov",8600,"KZN010423896","4345");
        allAccounts[9]=new NationalBankAccount("Kambarov Dulat",71000,"KZN010487891","4567");

    }
}