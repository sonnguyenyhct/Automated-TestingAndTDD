public class NextDayCalculator {

    public static String nextDay(int day, int month, int year){
        int lastOffMonth = 31;
        switch (month){
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
                if (day == lastOffMonth){
                    day =1;
                    month++;
                }else {
                    day += 1;
                }
                break;
            case 2 :
                if (checkNamNhuan(year)){
                    lastOffMonth = 29;
                }else {
                    lastOffMonth = 28;
                }
                if (day == lastOffMonth){
                    day = 1;
                    month++;
                }else {
                    day += 1;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                lastOffMonth = 30;
                if (day == lastOffMonth){
                    day = 1;
                    month++;
                }else {
                    day += 1;
                }
                break;
            case 12 :
                lastOffMonth = 31;
                if (day == lastOffMonth){
                    day = 1;
                    month = 1;
                    year++;
                }else {
                    day++;
                }
        }
        return day + "-" + month + "-" + year;
    }
    public static boolean checkNamNhuan(int year){
        if (year%4 == 0){
            return year % 100 != 0 || year % 400 == 0;
        }else {
            return false;
        }
    }

}
