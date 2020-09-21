public class FizzBuzz {
    public static String fizzBuzzTranslate(int number){
        if (number > 0){
            if (number%3==0 && number%5==0){
                return "FizzBuzz";
            }else if (number%3 == 0 ){
                return "Fizz";
            }else if (number%5 == 0){
                return "Buzz";
            }else if (checkNumberExist(number,3)){
                return "Fizz";
            }else if (checkNumberExist(number,5)){
                return "Buzz";
            }else{
                if (number <= 10){
                    return translate1_10(number);
                }else {
                    return translate11_99(number);
                }
            }
        }else {
            return "Nhap so nguyen duong";
        }
    }

    public static boolean checkNumberExist(int number,int numberCheck){
        while (number/10 == 0){
            if (number%10 == numberCheck){
                return true;
            }
            number = number/10;
        }
        return false;
    }
    public static String translate1_10(int number){
        switch (number){
            case 1 :
                return "mot";
            case 2 :
                return "hai";
            case 3 :
                return "ba";
            case 4 :
                return "bon";
            case 5 :
                return "nam";
            case 6 :
                return "sau";
            case 7 :
                return "bay";
            case 8 :
                return "tam";
            case 9 :
                return "chin";
            case 10 :
                return "muoi";
            default:
                return "loi";
        }
    }
    public static String translate11_99(int number){
        int firstNumber = number/10;
        int secondNumber = number%10;
        return translate1_10(firstNumber) + translate1_10(secondNumber);
    }

}
