package BitlabAcademy.OOP.F;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Client clients[] = new Client[10];
        int index = 0;
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("PRESS [1] TO ADD CLIENT");
            System.out.println("PRESS [2] LIST ALL CLIENTS");
            System.out.println("PRESS [3] TO LIST FREE TIME");
            System.out.println("PRESS [4] FIND CLIENT BY ID");
            System.out.println("PRESS [5] EDIT RECORDING OF CLIENT");
            System.out.println("PRESS [6] TO DELETE RECORDING CLIENT");
            System.out.println("PRESS [0] TO EXIT");

            int variant = in.nextInt();

            if(variant==0) {
                break;
            }else if (variant == 1) {
                System.out.println("Insert id: ");
                int id = in.nextInt();
                System.out.println("Insert name: ");
                String name = in.next();
                System.out.println("Insert time: ");
                String time = in.next();
                System.out.println("Insert price: ");
                int price = in.nextInt();
                System.out.println("Insert care: ");
                String care = in.next();
                System.out.println("Insert placeNumber: ");
                int placeNumber = in.nextInt();

                Client c1 = new Client(id, name, time, price, care, placeNumber, false);
                clients[index] = c1;
                index++;

            } else if (variant == 2) {
                for (int i = 0; i < index; i++) {
                    if(!clients[i].getIsdeleted())
                        clients[i].getData();
                }
            } else if (variant == 3) {
                String time[] = {"9:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00"};
                boolean isFreeTime = true;
                for (int i = 0; i < time.length; i++) {
                    isFreeTime = true;
                    for (int j = 0; j < index; j++) {
                        if (clients[j].getTime().equals(time[i])) {
                            isFreeTime = false;
                            break;
                        }
                    }
                    if (isFreeTime)
                        System.out.println(time[i]);
                }
            } else if (variant == 4) {
                System.out.println("Insert id: ");
                int id = in.nextInt();
                boolean isIdFinded = false;
                for(int i=0; i<index; i++)
                {
                    if(!clients[i].getIsdeleted()){
                        if(clients[i].getId()==id)
                        {
                            isIdFinded = true;
                            clients[i].getData();
                            break;
                        }
                    }
                }
                
                if(isIdFinded==false)
                    System.out.println("We don't have client with that id");
            }else if(variant==5)
            {
                System.out.println("What is your name: ");
                String name = in.next();
                System.out.println("What time do you have an appointment?: ");
                String time = in.next();

                for(int i=0; i<index; i++)
                {
                    if(!clients[i].getIsdeleted()) {
                        if (clients[i].getName().equals(name) && clients[i].getTime().equals(time)) {
                            System.out.println("Insert CARE to what you want to change: ");
                            String care = in.next();
                            clients[i].setCare(care);
                            System.out.println("Insert PLACE NUMBER to what you want to change: ");
                            int placeNumber = in.nextInt();
                            clients[i].setPlaceNumber(placeNumber);
                            System.out.println("Successfully changed!");
                        }
                    }
                }
            }else if(variant==6)
            {
                System.out.println("Insert your id");
                int id = in.nextInt();
                boolean isHaveIndex = false;
                for(int i=0; i<index; i++)
                {
                    if(!clients[i].getIsdeleted()) {
                        if (clients[i].getId() == id) {
                            isHaveIndex = true;
                            clients[i].setIsDeleted(true);
                            break;
                        }
                    }
                }

                if(isHaveIndex==false)
                {
                    System.out.println("We don't have client with that id");
                }else
                    System.out.println("Successfully deleted!");
            }
        }
    }
}
