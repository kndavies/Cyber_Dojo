package fizzBuzz;

public class FizzBuzz {

    public static String answer(int number) {
        if(number % 3 == 0 && number % 5 == 0)
            return "FizzBuzz";
        else if(number % 3 == 0)
            return "Fizz";
        else if(number % 5 == 0)
            return "Buzz";
        else
            return Integer.toString(number);
    }

    public static String showOutput(int start, int end) {
        String output = "";
        for(int i = start; i <= end; i++)  {
            output += answer(i) + "\n";
        }
        return output;
        }

}
