import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Меню операцій\n" +
                "1 - Перевірити чи є місяць ... \n" +
                "2 - Вивести всі місяці з такою ж порою року\n" +
                "3 - Вивести всі місяці які мають таку саму кількість днів\n" +
                "4 - Вивести на екран всі місяці які мають меншу кількість днів\n" +
                "5 - Вивести на екран всі місяці які мають більшу кількість днів\n" +
                "6 - Вивести на екран наступну пору року \n" +
                "7 - Вивести на екран попередню пору року \n" +
                "8 - Вивести на екран всі місяці які мають парну кількість днів \n" +
                "9 - Вивести на екран всі місяці які мають непарну кількість днів\n" +
                "10 - Вивести на екран чи введений з консолі місяць має парну кількість днів \n" +
                "0 - Вихід з програми\n");
        int enterNumber;
        do {
            System.out.println("Введіть вибраний номер: ");
            enterNumber = sc.nextInt();
            switch (enterNumber) {
                case 1: {
                    System.out.print("Enter mounth: ");
                    String enterMonth = sc.next();
                    System.out.println("Місяць " + Months.parse(enterMonth.toUpperCase()) + " існує");
                    break;
                }
                case 2: {
                    System.out.println("Введіть пору року: ");
                    String enterSeason = sc.next();
                    Season season = Season.parse(enterSeason.toUpperCase());
                    if (Season.UNKNOWN == season) {
                        System.out.println(season);
                        break;
                    }
                    for (int i = 0; i < Months.values().length; i++) {
                        if (Months.values()[i].getSeason() == season) {
                            System.out.println(Months.values()[i]);
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("Введіть кількість днів в місяці: ");
                    int enterDays = sc.nextInt();
                    for (int i = 0; i < Months.values().length; i++) {
                        if (Months.values()[i].getDays() == enterDays) {
                            System.out.println(Months.values()[i]);
                        }
                    }
                    break;

                }
                case 4: {
                    System.out.println("Введіть кількість днів в місяці: ");
                    int enterDaysMax = sc.nextInt();
                    for (int i = 0; i < Months.values().length; i++) {
                        if (Months.values()[i].getDays() < enterDaysMax) {
                            System.out.println(Months.values()[i]);
                        }
                    }
                    break;
                }
                case 5: {
                    System.out.println("Введіть кількість днів в місяці: ");
                    int enterDaysMin = sc.nextInt();
                    for (int i = 0; i < Months.values().length; i++) {
                        if (Months.values()[i].getDays() > enterDaysMin) {
                            System.out.println(Months.values()[i]);
                        }
                    }
                    break;
                }
                case 6: {
                    System.out.println("Введіть пору року: ");
                    String enterSeason = sc.next();
                    for (int i = 0; i < Season.values().length; i++) {
                        if (Season.values()[i].equals(Season.parse(enterSeason.toUpperCase()))) {
                            if(i== Season.values().length-2){
                                System.out.println(Season.values()[0]);
                            }else {
                                System.out.println(Season.values()[i + 1]);
                            }
                        }
                    }
                    break;

                }
                case 7:{
                    System.out.println("Введіть пору року: ");
                    String enterSeason = sc.next();
                    for (int i = 0; i < Season.values().length; i++) {
                        if (Season.values()[i].equals(Season.parse(enterSeason.toUpperCase()))) {
                            if(i== 0){
                                System.out.println(Season.values()[Season.values().length-2]);
                            }else {
                                System.out.println(Season.values()[i - 1]);
                            }
                        }
                    }
                    break;
                }
                case 8: {
                    for (int i = 0; i < Months.values().length-1; i++) {
                        if (Months.values()[i].getDays()%2==0) {
                            System.out.println(Months.values()[i]);
                        }
                    }
                    break;
                }
                case 9: {
                    for (int i = 0; i < Months.values().length-1; i++) {
                        if (Months.values()[i].getDays()%2!=0) {
                            System.out.println(Months.values()[i]);
                        }
                    }
                    break;
                }
                case 10: {
                    System.out.println("Введіть місяць: ");
                    String enterMonths =sc.next();
                    if(Months.parse(enterMonths.toUpperCase()).getDays()%2==0){
                        System.out.println("Місяць " + enterMonths + " парний");
                    }else {
                        System.out.println("Місяць " + enterMonths + " непарний");
                    }
                    break;
                }


            }
        } while (enterNumber != 0);
    }

}

