package OOP.Interface.task2;

public class Main
{
    public static void main(String[] args)
    {
            Warehouse warehouse = new Warehouse();
            Picker picker = new Picker(warehouse);
            Courier courier = new Courier(warehouse);
            System.out.println("________________________ПЕРВЫЙ СКЛАД:________________________");
            System.out.println();
            System.out.println(warehouse + "\n Workers: \n" + picker + "\n" + courier);

            picker.doWork();
            courier.doWork();
            picker.bonus();
            courier.bonus();
            System.out.println(warehouse + "\n Workers: \n" + picker + "\n" + courier);

            picker.doWork();
            courier.doWork();
            picker.bonus();
            courier.bonus();

            for(int i=1; i<1501; i++)
            {
                courier.doWork();
                picker.doWork();
            }
            System.out.println(warehouse + "\n Workers: \n" + picker + "\n" + courier);
            System.out.println();
            System.out.println("________________________ВТОРОЙ СКЛАД:________________________");
            System.out.println();
            Warehouse warehouse2 = new Warehouse();
            Picker picker2 = new Picker(warehouse2);
            Courier courier2 = new Courier(warehouse2);
            picker2.doWork();
            courier2.doWork();
            System.out.println(warehouse2 + "\n Workers: \n" + picker2 + "\n" + courier2);

    }
}
//Warehouse{countOrder=0, balance=0} Picker{salary=0} OOP.Interface.task2.Courier@7ba4f24f
//Warehouse{countOrder=1, balance=1000} Picker{salary=80} OOP.Interface.task2.Courier@7ba4f24f
//Warehouse{countOrder=1, balance=1000} Picker{salary=80} OOP.Interface.task2.Courier@7ba4f24f
//Warehouse{countOrder=1501, balance=1501000} Picker{salary=360240} OOP.Interface.task2.Courier@7ba4f24f