package BitlabAcademy.Project1.ErnarsProject;

public class Database {
    public static BankAccount allAccounts[]= new BankAccount[10];
    static {
        allAccounts[0]=new CityBankAccount("Yernar","Baidolla",50000,"KZ010322312","0102");
        allAccounts[1]=new CityBankAccount("Nurbolat","Meshitbay",100000,"KZ010324589","0107");
        allAccounts[2]= new CityBankAccount("Yernar","Ratbek",150000,"KZ010326547","0201");
        allAccounts[3]= new CityBankAccount("Aman","Dastanov",250000,"KZ010321278","9988");
        allAccounts[4]= new CityBankAccount("Kydyrali","Zhansay",350000,"KZ010329635","7777");
        allAccounts[5]=new NationalBankAccount("Baidolla Yernar",80000,"RK000012345","7894");
        allAccounts[6]=new NationalBankAccount("Meshitbay Nurbolat",90000,"RK000012345","6666");
        allAccounts[7]=new NationalBankAccount("Ratbek Yernar",70000,"RK000012345","5555");
        allAccounts[8]=new NationalBankAccount("Dastanov Aman",60000,"RK000012345","4444");
        allAccounts[9]=new NationalBankAccount("Zhansay Kydyrali",50000,"RK000012345","3333");
    }
}
