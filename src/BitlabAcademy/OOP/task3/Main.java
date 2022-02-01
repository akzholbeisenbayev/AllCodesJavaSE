package BitlabAcademy.OOP.task3;

public class Main
{
    public static void main(String[] args) {
        Phone phone1=new Phone("Samsung","Galaxy S10",450000 );
        Phone phone2=new Phone("Iphone", "8", 350000);
        Phone phone3 = new Phone("Huawei", "S7", 310000);
        Phone phone4= new Phone("Redmi", "A10", 125000);
        Phone phone5 = new Phone("Oppo", "A20", 78000);

        Phone[] phones = new Phone[5];
        phones[0] = phone1;
        phones[1] = phone2;
        phones[2] = phone3;
        phones[3] = phone4;
        phones[4] = phone5;

        for(int i=0; i<phones.length; i++)
        {
            System.out.println(phones[i].getDate());
        }

    }
}
