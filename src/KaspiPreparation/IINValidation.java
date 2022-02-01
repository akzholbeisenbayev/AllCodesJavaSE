package KaspiPreparation;


public class IINValidation
{
    public static void main(String[] args)
    {
        String iin = "990405350279";
        System.out.println(iinCheck(iin, "MAN"));
    }

    public static boolean iinCheck(String IIN, String gender)
    {
        Birthday birthday = new Birthday("15", "08", "2002");
         //Проверка на длину ИИН
        //https://ru.wikipedia.org/wiki/%D0%98%D0%BD%D0%B4%D0%B8%D0%B2%D0%B8%D0%B4%D1%83%D0%B0%D0%BB%D1%8C%D0%BD%D1%8B%D0%B9_%D0%B8%D0%B4%D0%B5%D0%BD%D1%82%D0%B8%D1%84%D0%B8%D0%BA%D0%B0%D1%86%D0%B8%D0%BE%D0%BD%D0%BD%D1%8B%D0%B9_%D0%BD%D0%BE%D0%BC%D0%B5%D1%80

        if (IIN.length()<12) return false;

        //Проверка ИИН на корректность даты рождения

        if(!IIN.substring(0,1).equals(birthday.getYear().substring(2,3)) || !IIN.substring(1,2).equals(birthday.getYear().substring(3,4))) return false;
        if(!IIN.substring(2,4).equals(birthday.getMonth())) return false;
        if(!IIN.substring(4,6).equals(birthday.getDay())) return false;


        //7 разряд век рождения и пол:

        //3 - для мужчин, родившихся в XX веке
        //4 - для женщин, родившихся в XX веке
        //5 - для мужчин, родившихся в XXI веке
        //6 - для женщин, родившихся в XXI веке

        if((Integer.parseInt(birthday.getYear())>=1900 && Integer.parseInt(birthday.getYear())<2000) && IIN.charAt(6) == '3' && gender.equals("WOMAN")) return false;
        else if((Integer.parseInt(birthday.getYear())>=1900 && Integer.parseInt(birthday.getYear())<2000) && IIN.charAt(6) == '4' && gender.equals("MAN")) return false;
        else if((Integer.parseInt(birthday.getYear())>=2000 && Integer.parseInt(birthday.getYear())<2100) && IIN.charAt(6) == '5' && gender.equals("WOMAN")) return false;
        else if((Integer.parseInt(birthday.getYear())>=2000 && Integer.parseInt(birthday.getYear())<2100) && IIN.charAt(6) == '6' && gender.equals("MAN")) return false;



        //8-11 разряды — заполняет орган Юстиции. Включает в себя порядковый номер регистрации в системе.
        //12 разряд — контрольная цифра, при расчете которой используется следующий алгоритм:
        //n12 = (1n1 + 2n2 + 3n3 + 4n4 + 5n5 + 6n6 + 7n7 + 8n8 + 9n9 + 10n10 + 11n11) mod 11
        //
        //функция mod 11 - возвращает остаток при делении на число 11.

        long First11Digits = Long.parseLong(IIN.substring(0,10)); // копируем первые 11 символов

        long temp = Long.parseLong(IIN.substring(11));

        long n12 = Long.parseLong(IIN.substring(0,1)) +
                2*Long.parseLong(IIN.substring(1,2)) +
                3*Long.parseLong(IIN.substring(2,3)) +
                4*Long.parseLong(IIN.substring(3,4)) +
                5*Long.parseLong(IIN.substring(4,5)) +
                6*Long.parseLong(IIN.substring(5,6)) +
                7*Long.parseLong(IIN.substring(6,7)) +
                8*Long.parseLong(IIN.substring(7,8)) +
                9*Long.parseLong(IIN.substring(8,9)) +
                10*Long.parseLong(IIN.substring(9,10)) +
                11*Long.parseLong(IIN.substring(10,11));

        long LastDigitOfIIN = n12 % 11;

        //Если полученное число равно 10, то расчёт контрольного разряда производится с другой последовательностью весов:
        //
        //n12 = (1n10 + 2n11 + 3n1 + 4n2+ 5n3 + 6n4 + 7n5 + 8n6 + 9n7 + 10n8 + 11n9) mod 11
        if(LastDigitOfIIN==10)
        {
            n12 =   3*Long.parseLong(IIN.substring(0,1)) +
                    4*Long.parseLong(IIN.substring(1,2)) +
                    5*Long.parseLong(IIN.substring(2,3)) +
                    6*Long.parseLong(IIN.substring(3,4)) +
                    7*Long.parseLong(IIN.substring(4,5)) +
                    8*Long.parseLong(IIN.substring(5,6)) +
                    9*Long.parseLong(IIN.substring(6,7)) +
                    10*Long.parseLong(IIN.substring(7,8)) +
                    11*Long.parseLong(IIN.substring(8,9)) +
                    Long.parseLong(IIN.substring(9,10)) +
                    2*Long.parseLong(IIN.substring(10,11));

            LastDigitOfIIN = n12%11;
        }

        return LastDigitOfIIN == temp && n12 != 0;
    }
}
