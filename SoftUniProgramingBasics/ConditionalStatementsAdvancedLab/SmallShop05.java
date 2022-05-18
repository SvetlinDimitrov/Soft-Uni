package SoftUniProgramingBasics.ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class SmallShop05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double number = Double.parseDouble(scanner.nextLine());
        double price = 0;
//        switch (city) {
//            case "Sofia":
//                if (product.equals("coffee")) {
//                    price = 0.50;
//                }
//                if (product.equals("water")) {
//                    price = 0.80;
//                }
//                if (product.equals("beer")) {
//                    price = 1.20;
//                }
//                if (product.equals("sweets")) {
//                    price = 1.45;
//                }
//                if (product.equals("peanuts")) {
//                    price = 1.60;
//                }
//                break;
//            case "Plovdiv":
//                if (product.equals("coffee")) {
//                    price = 0.40;
//                }
//                if (product.equals("water")) {
//                    price = 0.70;
//                }
//                if (product.equals("beer")) {
//                    price = 1.15;
//                }
//                if (product.equals("sweets")) {
//                    price = 1.30;
//                }
//                if (product.equals("peanuts")) {
//                    price = 1.50;
//                }
//                break;
//            case "Varna":
//                if (product.equals("coffee")) {
//                    price = 0.45;
//                }
//                if (product.equals("water")) {
//                    price = 0.70;
//                }
//                if (product.equals("beer")) {
//                    price = 1.10;
//                }
//                if (product.equals("sweets")) {
//                    price = 1.35;
//                }
//                if (product.equals("peanuts")) {
//                    price = 1.55;
//                }
//                break;
//
//        }
        if (city.equals("Sofia") && product.equals("coffee")) {
            price = 0.50;
        } else if (city.equals("Sofia") && product.equals("water")) {
            price = 0.80;
        } else if (city.equals("Sofia") && product.equals("beer")) {
            price = 1.20;
        } else if (city.equals("Sofia") && product.equals("sweets")) {
            price = 1.45;
        } else if (city.equals("Sofia") && product.equals("peanuts")) {
            price = 1.60;
        }
        if (city.equals("Plovdiv") && product.equals("coffee")) {
            price = 0.40;
        } else if (city.equals("Plovdiv") && product.equals("water")) {
            price = 0.70;
        } else if (city.equals("Plovdiv") && product.equals("beer")) {
            price = 1.15;
        } else if (city.equals("Plovdiv") && product.equals("sweets")) {
            price = 1.30;
        } else if (city.equals("Plovdiv") && product.equals("peanuts")) {
            price = 1.50;
        }
        if (city.equals("Varna") && product.equals("coffee")) {
            price = 0.45;
        } else if (city.equals("Varna") && product.equals("water")) {
            price = 0.70;
        } else if (city.equals("Varna") && product.equals("beer")) {
            price = 1.10;
        } else if (city.equals("Varna") && product.equals("sweets")) {
            price = 1.35;
        } else if (city.equals("Varna") && product.equals("peanuts")) {
            price = 1.55;
        }

        System.out.println(number * price);
        }
    }
