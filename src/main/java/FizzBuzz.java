public class FizzBuzz {

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
        return input % 3 == 0;
    }

    private boolean isModulo5(int input) {
        return input % 5 == 0;
    }
}
