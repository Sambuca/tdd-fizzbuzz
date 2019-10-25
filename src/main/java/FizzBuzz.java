public class FizzBuzz {

    private int fizzNumber;
    private int buzzNumber;

    public FizzBuzz(int fizzNumber, int buzzNumber) {
        this.fizzNumber = fizzNumber;
        this.buzzNumber = buzzNumber;
    }

    public String processNumber(int input) {
        if (isFizz(input) && isBuzz(input)) {
            return "FizzBuzz";
        }

        if (isFizz(input)) {
            return "Fizz";
        }

        if (isBuzz(input)) {
            return "Buzz";
        }

        return String.valueOf(input);
    }

    private boolean isFizz(int input) {
        return input % fizzNumber == 0;
    }

    private boolean isBuzz(int input) {
        return input % buzzNumber == 0;
    }
}
