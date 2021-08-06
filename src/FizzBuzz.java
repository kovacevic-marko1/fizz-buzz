public class FizzBuzz {

    private static void fizzBuzz (int num) {
        for (int i = 1; i < num; i++) {
            String output = "";
            if (i % 3 == 0) { output += "Fizz"; }
            if (i % 5 == 0) { output += "Buzz"; }
            if (output == "") { output = String.valueOf(i); }

            System.out.println(output);
        }
    }

    public static void main(String[] args) {
        fizzBuzz(100);
    }
}
