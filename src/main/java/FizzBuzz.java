public class FizzBuzz {

    private int fizzNumber;
    private int buzzNumber;

    public FizzBuzz(int fizzNumber, int buzzNumber) {
        this.fizzNumber = fizzNumber;
        this.buzzNumber = buzzNumber;
    }

    public String processNumber(int input) {
        if (isModulo3(input) && isModulo5(input)) {
            return "FizzBuzz";
        }

        if (isModulo3(input)) {
            return "Fizz";
        }

        if (isModulo5(input)) {
            return "Buzz";
        }

        return String.valueOf(input);
    }

    private boolean isModulo3(int input) {
        return input % fizzNumber == 0;
    }

    private boolean isModulo5(int input) {
        return input % buzzNumber == 0;
    }
}
