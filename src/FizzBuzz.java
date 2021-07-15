public class FizzBuzz {
    public static void main(String[] args) {

        // a for loop that starts from 1 and iterates to 100
        for (int i = 1; i <= 100; i++) {

            // if the number is a multiple of 3 and 5, it prints FizzBuzz
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }

            // if the number is only a multiple of 3, it prints Fizz
            else if (i % 3 == 0){
                System.out.println("Fizz");
            }

            // if the number is only a multiple of 5, it prints Buzz
            else if (i % 5 == 0){
                System.out.println("Buzz");
            }

            // if the number is neither a multiple of 3 nor 5, it prints the number
            else {
                System.out.println(i);
            }
        }
    }
}
