package HckerRank_Practice;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class IBAN_Generator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // first two words ot IBAN
        String country = "BG"; // code of the country


        //the next eight characters depend on behalf of the bank
        String [] nameOfTheBankArray = new String [36];
        String [] identifierPSPArray = new String [36];

        System.out.println("0 Айкарт АД");
        nameOfTheBankArray [0] = "Айкарт АД";
        identifierPSPArray [0] = "INTF4001";

        System.out.println("1 Алианц Банк България АД");
        nameOfTheBankArray [1] = "Алианц Банк България АД";
        identifierPSPArray [1] = "BUIN9561";

        System.out.println("2 БНП Париба Пърсънъл Файненс С.А. - клон БЪЛГАРИЯ");
        nameOfTheBankArray [2] = "БНП Париба Пърсънъл Файненс С.А. - клон БЪЛГАРИЯ";
        identifierPSPArray [2] = "BPEF9290";

        System.out.println("3 БНП Париба С. А. - клон София");
        nameOfTheBankArray [3] = "БНП Париба С. А. - клон София";
        identifierPSPArray [3] = "BNPA9440";

        System.out.println("4 Банка ДСК АД");
        nameOfTheBankArray [4] = "Банка ДСК АД";
        identifierPSPArray [4] = "STSA9300";

        System.out.println("5 Бигбанк АС - клон България");
        nameOfTheBankArray [5] = "Банка ДСК АД";
        identifierPSPArray [5] = "BIGK9879";

        System.out.println("6 Българо-американска кредитна банка АД");
        nameOfTheBankArray [6] = "Българо-американска кредитна банка АД";
        identifierPSPArray [6] = "BGUS9160";

        System.out.println("7 Българска банка за развитие АД");
        nameOfTheBankArray [7] = "Българска банка за развитие АД";
        identifierPSPArray [7] = "NASB9620";

        System.out.println("8 Българска народна банка");
        nameOfTheBankArray [8] = "Българска народна банка";
        identifierPSPArray [8] = "BNBG9661";

        System.out.println("9 Варенголд Банк АГ, клон София");
        nameOfTheBankArray [9] = "Варенголд Банк АГ, клон София";
        identifierPSPArray [9] = "VGAG9876";

        System.out.println("10 Вива Пеймънт Сървисис ЕС ЕЙ - клон България АД");
        nameOfTheBankArray [10] = "Вива Пеймънт Сървисис ЕС ЕЙ - клон България АД";
        identifierPSPArray [10] = "VPAY4011";

        System.out.println("11 Еконт Финансови услуги ЕООД");
        nameOfTheBankArray [11] = "Еконт Финансови услуги ЕООД";
        identifierPSPArray [11] = "ECFE4014";

        System.out.println("12 ИНГ Банк Н.В. - кл. София");
        nameOfTheBankArray [12] = "ИНГ Банк Н.В. - кл. София";
        identifierPSPArray [12] = "INGB9145";

        System.out.println("13 Изи пеймънт Сървисиз ООД");
        nameOfTheBankArray [13] = "Изи пеймънт Сървисиз ООД";
        identifierPSPArray [13] = "EAPS4008";

        System.out.println("14 Изипей АД");
        nameOfTheBankArray [14] = "Изипей АД";
        identifierPSPArray [14] = "ESPY4004";

        System.out.println("15 Инвестбанк АД");
        nameOfTheBankArray [15] = "Инвестбанк АД";
        identifierPSPArray [15] = "IORT9120";

        System.out.println("16 Интернешънъл Асет Банк АД");
        nameOfTheBankArray [16] = "Интернешънъл Асет Банк АД";
        identifierPSPArray [16] = "IABG9470";

        System.out.println("17 Майфин ЕАД");
        nameOfTheBankArray [17] = "Майфин ЕАД";
        identifierPSPArray [17] = "MYFN4012";

        System.out.println("18 Обединена българска банка АД");
        nameOfTheBankArray [18] = "Обединена българска банка АД";
        identifierPSPArray [18] = "UBBS9200";

        System.out.println("19 Общинска банка АД");
        nameOfTheBankArray [19] = "Общинска банка АД";
        identifierPSPArray [19] = "SOMB9130";

        System.out.println("20 Пейнетикс АДД");
        nameOfTheBankArray [20] = "Пейнетикс АДД";
        identifierPSPArray [20] = "PATC4002";

        System.out.println("21 ПроКредит Банк (България) АД");
        nameOfTheBankArray [21] = "ПроКредит Банк (България) АД";
        identifierPSPArray [21] = "PRCB9230";

        System.out.println("22 Първа инвестиционна банка АД");
        nameOfTheBankArray [22] = "Първа инвестиционна банка АД";
        identifierPSPArray [22] = "FINV9150";

        System.out.println("23 Райфайзенбанк (България) ЕАД");
        nameOfTheBankArray [23] = "Райфайзенбанк (България) ЕАД";
        identifierPSPArray [23] = "RZBB9155";

        System.out.println("24 Ситибанк Европа АД, клон България");
        nameOfTheBankArray [24] = "Ситибанк Европа АД, клон България";
        identifierPSPArray [24] = "CITI9250";

        System.out.println("25 ТИ БИ АЙ Банк ЕАД");
        nameOfTheBankArray [25] = "ТИ БИ АЙ Банк ЕАД";
        identifierPSPArray [25] = "TBIB9310";

        System.out.println("26 Те-Дже Зираат Банкасъ - клон София");
        nameOfTheBankArray [26] = "Те-Дже Зираат Банкасъ - клон София";
        identifierPSPArray [26] = "TCZB9350";

        System.out.println("27 Тексим Банк АД");
        nameOfTheBankArray [27] = "Тексим Банк АД";
        identifierPSPArray [27] = "TEXI9545";

        System.out.println("28 Тенен Пеймънтс АД");
        nameOfTheBankArray [28] = "Тенен Пеймънтс АД";
        identifierPSPArray [28] = "TEPJ4013";

        System.out.println("29 Токуда Банк АД");
        nameOfTheBankArray [29] = "Токуда Банк АД";
        identifierPSPArray [29] = "CREX9260";

        System.out.println("30 Транзакт Юръп ЕАД");
        nameOfTheBankArray [30] = "Транзакт Юръп ЕАД";
        identifierPSPArray [30] = "TRUD4005";

        System.out.println("31 Транскарт Файненшъл Сървисис ЕАД");
        nameOfTheBankArray [31] = "Транзакт Юръп ЕАД";
        identifierPSPArray [31] = "TRIV4003";

        System.out.println("32 Търговска банка Д АД");
        nameOfTheBankArray [32] = "Търговска банка Д АД";
        identifierPSPArray [32] = "DEMI9240";


        System.out.println("33 УниКредит Булбанк АД");
        nameOfTheBankArray [33] = "УниКредит Булбанк АД";
        identifierPSPArray [33] = "UNCR9660";

        System.out.println("34 Централна кооперативна банка АД");
        nameOfTheBankArray [34] = "Централна кооперативна банка АД";
        identifierPSPArray [34] = "CECB9790";

        System.out.println("35 Юробанк България АД");
        nameOfTheBankArray [35] = "Юробанк България АД";
        identifierPSPArray [35] = "BPBI9920";

        System.out.println("Choose the number of your bank name:");
        int numberBank = Integer.parseInt(scanner.nextLine());


        //generator for the last 8 numbers
        Random random = new Random();
        String lastEightNumbers = "";
        for (int i = 1; i <= 8; i++) {
            int x = random.nextInt(9) + 1;
            lastEightNumbers += x;
        }

        // control number
        String IbanReverse = String.format("%s00%s%s00", identifierPSPArray[numberBank], lastEightNumbers, country);
        String numberOfIban = "";

        for (int i = IbanReverse.length() - 1; i >= 0; i--) {
            char singleWord = IbanReverse.charAt(i);
            numberOfIban += charToInt(singleWord);
        }
        BigInteger sumIban = new BigInteger(numberOfIban);
        sumIban = sumIban.remainder(BigInteger.valueOf(97));
        BigInteger controlNumber = BigInteger.valueOf(98).subtract(sumIban);


        System.out.printf("If your bank is \"%s\"%n", nameOfTheBankArray[numberBank]);
        System.out.println("Your IBAN code is:");
        String Iban = String.format("%s%,d%s00%s", country, controlNumber, identifierPSPArray[numberBank], lastEightNumbers);
        System.out.println(Iban);

        //verification for valid Iban

        String IbanReverseAgain = String.format("%s00%s%s%,d", identifierPSPArray[numberBank], lastEightNumbers, country, controlNumber);
        numberOfIban = "";

        for (int i = IbanReverse.length() - 1; i >= 0; i--) {
            char singleWord = IbanReverse.charAt(i);
            numberOfIban += charToInt(singleWord);
        }
        BigInteger sumIbanVerify = new BigInteger(numberOfIban);
        sumIbanVerify = sumIbanVerify.remainder(BigInteger.valueOf(97));
        sumIbanVerify = BigInteger.valueOf(98).subtract(sumIbanVerify);

        BigInteger one = new BigInteger("1");
        int res = sumIbanVerify.compareTo(one);

        if ( res == 0){
            System.out.println("The IBAN code is valid");
        }else {
            System.out.println("The Iban code is not valid");
        }

    }
    public static int charToInt (char letter ) {
        int numberOfIban =0 ;
        switch (letter) {
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


        }
        return numberOfIban;
        ////A = 10 G = 16 M = 22 S = 28 Y = 34
        ////B = 11 H = 17 N = 23 T = 29 Z = 35
        ////C = 12 I = 18 O = 24 U = 30
        ////D = 13 J = 19 P = 25 V = 31
        ////E = 14 K = 20 Q = 26 W = 32
        ////F = 15 L = 21 R = 27 X = 33
    }
}
