public class Homework5 {
    public static void main(String[] args) throws Exception{
        int number1 = 1;
        int number2 = 4;
        int number3 = 15;
        System.out.println("Find bigger number out of 2 provided: " + findBigger(number1, number2));
        System.out.println("Find lower number out of 2 provided: " + findLower(number3, number2));
        System.out.println("Check is number even: " + isEven(number2));
        System.out.println("Day converter: " + convertDayOfWeek(number2));
        System.out.println("Grade converter: " + gradeConverter("D"));
        System.out.println("Age categorization: " + ageCategory(number3));
    }

    private static int findBigger(int firstNumber, int secondNumber) throws Exception {
        if(firstNumber > secondNumber){
            return firstNumber;
        } else if (secondNumber > firstNumber){
            return secondNumber;
        } else {
            throw new Exception("Numbers are equal, can't perform calculation!");
        }
    }

    private static int findLower(int firstNumber, int secondNumber) throws Exception {
        if(firstNumber < secondNumber){
            return firstNumber;
        } else if (secondNumber < firstNumber){
            return secondNumber;
        } else {
            throw new Exception("Numbers are equal, can't perform calculation!");
        }
    }

    private static boolean isEven(int number){
        return (number % 2) == 0;
    }

    private static String convertDayOfWeek(int dayNumber) throws Exception {
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        // We need lower provided index because it starts from 1 and array index - from 0
        int index = dayNumber - 1;
        if(index >= 1 && index <= 7){
            return daysOfWeek[index];
        } else {
            throw new Exception("Provided day number is incorrect: " + dayNumber + "\n Should be from 1 to 7");
        }
    }

    private static String gradeConverter(String letterGrade) throws Exception {
        return switch (letterGrade) {
            case "A" -> "Excellent";
            case "B" -> "Good";
            case "C" -> "Fair";
            case "D" -> "Poor";
            case "E" -> "Very Poor";
            case "F" -> "Disaster";
            default -> throw new Exception("Wrong letter grade provided: " + letterGrade +
                    "\nShould be one of: A. B, C, D, E, F");
        };
    }

    private static String ageCategory(int age) throws Exception {
        if(age >= 0 && age <= 12){
            return "Kid";
        } else if(age > 12 && age <= 17){
            return "Teenager";
        } else if(age > 17 && age <= 50){
            return "Adult";
        } else if(age > 50 && age < 101){
            return "Elder";
        } else {
            throw new Exception("Wrong age provided: " + age + "\n Should be from 0 to 100");
        }
    }
}
