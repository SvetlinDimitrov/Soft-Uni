package HckerRank_Practice;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class IBAN_Generator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // first two words ot IBAN
        String country = "BG"; // code of the country


        //the next eight characters depend on behalf of the bank
        System.out.println("1 Айкарт АД");
        System.out.println("2 Алианц Банк България АД");
        System.out.println("3 БНП Париба Пърсънъл Файненс С.А. - клон БЪЛГАРИЯ");
        System.out.println("4 БНП Париба С. А. - клон София");
        System.out.println("5 Банка ДСК АД");
        System.out.println("6 Бигбанк АС - клон България");
        System.out.println("7 Българо-американска кредитна банка АД");
        System.out.println("8 Българска банка за развитие АД");
        System.out.println("9 Българска народна банка");
        System.out.println("10 Варенголд Банк АГ, клон София");
        System.out.println("11 Вива Пеймънт Сървисис ЕС ЕЙ - клон България АД");
        System.out.println("12 Еконт Финансови услуги ЕООД");
        System.out.println("13 ИНГ Банк Н.В. - кл. София");
        System.out.println("14 Изи пеймънт Сървисиз ООД");
        System.out.println("15 Изипей АД");
        System.out.println("16 Инвестбанк АД");
        System.out.println("17 Интернешънъл Асет Банк АД");
        System.out.println("18 Майфин ЕАД");
        System.out.println("19 Обединена българска банка АД");
        System.out.println("20 Общинска банка АД");
        System.out.println("21 Пейнетикс АДД");
        System.out.println("22 ПроКредит Банк (България) АД");
        System.out.println("23 Първа инвестиционна банка АД");
        System.out.println("24 Райфайзенбанк (България) ЕАД");
        System.out.println("25 Ситибанк Европа АД, клон България");
        System.out.println("26 ТИ БИ АЙ Банк ЕАД");
        System.out.println("27 Те-Дже Зираат Банкасъ - клон София");
        System.out.println("28 Тексим Банк АД");
        System.out.println("29 Тенен Пеймънтс АД");
        System.out.println("30 Токуда Банк АД");
        System.out.println("31 Транзакт Юръп ЕАД");
        System.out.println("32 Транскарт Файненшъл Сървисис ЕАД");
        System.out.println("33 Търговска банка Д АД");
        System.out.println("34 УниКредит Булбанк АД");
        System.out.println("35 Централна кооперативна банка АД");
        System.out.println("36 Юробанк България АД");

        System.out.println("Choose the number of your bank name:");
        int numberBank = Integer.parseInt(scanner.nextLine());
        String nameOfTheBank = "";
        String identifierPSP = "";
        switch (numberBank) {
            case 1:
                nameOfTheBank = "Айкарт АД";
                identifierPSP = "INTF4001";
                break;
            case 2:
                nameOfTheBank = "Алианц Банк България АД";
                identifierPSP = "BUIN9561";
                break;
            case 3:
                nameOfTheBank = "БНП Париба Пърсънъл Файненс С.А. - клон БЪЛГАРИЯ";
                identifierPSP = "BPEF9290";
                break;
            case 4:
                nameOfTheBank = "БНП Париба С. А. - клон София";
                identifierPSP = "BNPA9440";
                break;
            case 5:
                nameOfTheBank = "Банка ДСК АД";
                identifierPSP = "STSA9300";
                break;
            case 6:
                nameOfTheBank = "Бигбанк АС - клон България";
                identifierPSP = "BIGK9879";
                break;
            case 7:
                nameOfTheBank = "Българо-американска кредитна банка АД";
                identifierPSP = "BGUS9160";
                break;
            case 8:
                nameOfTheBank = "Българска банка за развитие АД";
                identifierPSP = "NASB9620";
                break;
            case 9:
                nameOfTheBank = "Българска народна банка";
                identifierPSP = "BNBG9661";
                break;
            case 10:
                nameOfTheBank = "Варенголд Банк АГ, клон София";
                identifierPSP = "VGAG9876";
                break;
            case 11:
                nameOfTheBank = "Вива Пеймънт Сървисис ЕС ЕЙ - клон България АД";
                identifierPSP = "VPAY4011";
                break;
            case 12:
                nameOfTheBank = "Еконт Финансови услуги ЕООД";
                identifierPSP = "ECFE4014";
                break;
            case 13:
                nameOfTheBank = "ИНГ Банк Н.В. - кл. София";
                identifierPSP = "INGB9145";
                break;
            case 14:
                nameOfTheBank = "Изи пеймънт Сървисиз ООД";
                identifierPSP = "EAPS4008";
                break;
            case 15:
                nameOfTheBank = "Изипей АД";
                identifierPSP = "ESPY4004";
                break;
            case 16:
                nameOfTheBank = "Инвестбанк АД";
                identifierPSP = "IORT9120";
                break;
            case 17:
                nameOfTheBank = "Интернешънъл Асет Банк АД";
                identifierPSP = "IABG9470";
                break;
            case 18:
                nameOfTheBank = "Майфин ЕАД";
                identifierPSP = "MYFN4012";
                break;
            case 19:
                nameOfTheBank = "Обединена българска банка АД";
                identifierPSP = "UBBS9200";
                break;
            case 20:
                nameOfTheBank = "Общинска банка АД";
                identifierPSP = "SOMB9130";
                break;
            case 21:
                nameOfTheBank = "Пейнетикс АДД";
                identifierPSP = "PATC4002";
                break;
            case 22:
                nameOfTheBank = "ПроКредит Банк (България) АД";
                identifierPSP = "PRCB9230";
                break;
            case 23:
                nameOfTheBank = "Първа инвестиционна банка АД";
                identifierPSP = "FINV9150";
                break;
            case 24:
                nameOfTheBank = "Райфайзенбанк (България) ЕАД";
                identifierPSP = "RZBB9155";
                break;
            case 25:
                nameOfTheBank = "Ситибанк Европа АД, клон България";
                identifierPSP = "CITI9250";
                break;
            case 26:
                nameOfTheBank = "ТИ БИ АЙ Банк ЕАД";
                identifierPSP = "TBIB9310";
                break;
            case 27:
                nameOfTheBank = "Те-Дже Зираат Банкасъ - клон София";
                identifierPSP = "TCZB9350";
                break;
            case 28:
                nameOfTheBank = "Тексим Банк АД";
                identifierPSP = "TEXI9545";
                break;
            case 29:
                nameOfTheBank = "Тенен Пеймънтс АД";
                identifierPSP = "TEPJ4013";
                break;
            case 30:
                nameOfTheBank = "Токуда Банк АД";
                identifierPSP = "CREX9260";
                break;
            case 31:
                nameOfTheBank = "Транзакт Юръп ЕАД";
                identifierPSP = "TRUD4005";
                break;
            case 32:
                nameOfTheBank = "Транскарт Файненшъл Сървисис ЕАД";
                identifierPSP = "TRIV4003";
                break;
            case 33:
                nameOfTheBank = "Търговска банка Д АД";
                identifierPSP = "DEMI9240";
                break;
            case 34:
                nameOfTheBank = "УниКредит Булбанк АД";
                identifierPSP = "UNCR9660";
                break;
            case 35:
                nameOfTheBank = "Централна кооперативна банка АД";
                identifierPSP = "CECB9790";
                break;
            case 36:
                nameOfTheBank = "Юробанк България АД";
                identifierPSP = "BPBI9920";
                break;

        }
        //generator for the last 8 numbers
        Random random = new Random();
        String lastEightNumbers = "";
        for (int i = 1; i <= 8; i++) {
            int x = random.nextInt(9) + 1;
            lastEightNumbers += x;
        }

        // control number
        String IbanReverse = String.format("%s00%s%s00", identifierPSP, lastEightNumbers, country);
        String numberOfIban = "";

        for (int i = IbanReverse.length() - 1; i >= 0; i--) {
            char singleWord = IbanReverse.charAt(i);
            switch (singleWord) {
                case 'A':
                    numberOfIban += 10;
                    break;
                case 'B':
                    numberOfIban += 11;
                    break;
                case 'C':
                    numberOfIban += 12;
                    break;
                case 'D':
                    numberOfIban += 13;
                    break;
                case 'E':
                    numberOfIban += 14;
                    break;
                case 'F':
                    numberOfIban += 15;
                    break;
                case 'G':
                    numberOfIban += 16;
                    break;
                case 'H':
                    numberOfIban += 17;
                    break;
                case 'I':
                    numberOfIban += 18;
                    break;
                case 'J':
                    numberOfIban += 19;
                    break;
                case 'K':
                    numberOfIban += 20;
                    break;
                case 'L':
                    numberOfIban += 21;
                    break;
                case 'M':
                    numberOfIban += 22;
                    break;
                case 'N':
                    numberOfIban += 23;
                    break;
                case 'O':
                    numberOfIban += 24;
                    break;
                case 'P':
                    numberOfIban += 25;
                    break;
                case 'Q':
                    numberOfIban += 26;
                    break;
                case 'R':
                    numberOfIban += 27;
                    break;
                case 'S':
                    numberOfIban += 28;
                    break;
                case 'T':
                    numberOfIban += 29;
                    break;
                case 'U':
                    numberOfIban += 30;
                    break;
                case 'V':
                    numberOfIban += 31;
                    break;
                case 'W':
                    numberOfIban += 32;
                    break;
                case 'X':
                    numberOfIban += 33;
                    break;
                case 'Y':
                    numberOfIban += 34;
                    break;
                case 'Z':
                    numberOfIban += 35;
                    break;
                default:
                    numberOfIban += singleWord;
            }
        }
        BigDecimal sumIban = new BigDecimal(numberOfIban);
        sumIban = sumIban.remainder(BigDecimal.valueOf(97));
        BigDecimal controlNumber = BigDecimal.valueOf(98).subtract(sumIban);

        DecimalFormat df = new DecimalFormat("00");
        String formattedControlNumber = df.format(controlNumber);


//A = 10 G = 16 M = 22 S = 28 Y = 34
//B = 11 H = 17 N = 23 T = 29 Z = 35
//C = 12 I = 18 O = 24 U = 30
//D = 13 J = 19 P = 25 V = 31
//E = 14 K = 20 Q = 26 W = 32
//F = 15 L = 21 R = 27 X = 33


        System.out.printf("If your bank is \"%s\"%n", nameOfTheBank);
        System.out.println("Your IBAN code is:");
        String Iban = String.format("%s%s%s00%s", country, formattedControlNumber, identifierPSP, lastEightNumbers);
        System.out.println(Iban);

        //verification for valid Iban

        String IbanReverseAgain = String.format("%s00%s%s%s", identifierPSP, lastEightNumbers, country, formattedControlNumber);
        numberOfIban = "";

        for (int i = IbanReverse.length() - 1; i >= 0; i--) {
            char singleWord = IbanReverse.charAt(i);
            switch (singleWord) {
                case 'A':
                    numberOfIban += 10;
                    break;
                case 'B':
                    numberOfIban += 11;
                    break;
                case 'C':
                    numberOfIban += 12;
                    break;
                case 'D':
                    numberOfIban += 13;
                    break;
                case 'E':
                    numberOfIban += 14;
                    break;
                case 'F':
                    numberOfIban += 15;
                    break;
                case 'G':
                    numberOfIban += 16;
                    break;
                case 'H':
                    numberOfIban += 17;
                    break;
                case 'I':
                    numberOfIban += 18;
                    break;
                case 'J':
                    numberOfIban += 19;
                    break;
                case 'K':
                    numberOfIban += 20;
                    break;
                case 'L':
                    numberOfIban += 21;
                    break;
                case 'M':
                    numberOfIban += 22;
                    break;
                case 'N':
                    numberOfIban += 23;
                    break;
                case 'O':
                    numberOfIban += 24;
                    break;
                case 'P':
                    numberOfIban += 25;
                    break;
                case 'Q':
                    numberOfIban += 26;
                    break;
                case 'R':
                    numberOfIban += 27;
                    break;
                case 'S':
                    numberOfIban += 28;
                    break;
                case 'T':
                    numberOfIban += 29;
                    break;
                case 'U':
                    numberOfIban += 30;
                    break;
                case 'V':
                    numberOfIban += 31;
                    break;
                case 'W':
                    numberOfIban += 32;
                    break;
                case 'X':
                    numberOfIban += 33;
                    break;
                case 'Y':
                    numberOfIban += 34;
                    break;
                case 'Z':
                    numberOfIban += 35;
                    break;
                default:
                    numberOfIban += singleWord;
            }
        }
        BigDecimal sumIbanVerify = new BigDecimal(numberOfIban);
        sumIbanVerify = sumIbanVerify.remainder(BigDecimal.valueOf(97));
        sumIbanVerify = BigDecimal.valueOf(98).subtract(sumIbanVerify);
        BigDecimal one = new BigDecimal(1);
        int res = sumIbanVerify.compareTo(one);

        if ( res == 0){
            System.out.println("The IBAN code is valid");
        }else {
            System.out.println("The Iban code is not valid");
        }

    }
}
