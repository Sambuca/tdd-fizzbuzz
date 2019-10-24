import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void initializeProject() {
        // given

        // when

        // then
        assertThat(true, is(true));
    }

    @Test
    public void shouldProcessInput() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz(3,5);

        // when
        String output = fizzBuzz.processNumber(1);

        // then
        assertThat(output, is("1"));
    }

    @Test
    public void shouldProcessInput_2() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz(3,5);

        // when
        String output = fizzBuzz.processNumber(2);

        // then
        assertThat(output, is("2"));
    }

    @Test
    public void shouldProcessInput_3() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz(3,5);

        // when
        String output = fizzBuzz.processNumber(3);

        // then
        assertThat(output, is("Fizz"));
    }

    @Test
    public void shouldProcessInput_4() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz(3,5);

        // when
        String output = fizzBuzz.processNumber(4);

        // then
        assertThat(output, is("4"));
    }

    @Test
    public void shouldProcessInput_5() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz(3,5);

        // when
        String output = fizzBuzz.processNumber(5);

        // then
        assertThat(output, is("Buzz"));
    }

    @Test
    public void shouldProcessInput_6() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz(3,5);

        // when
        String output = fizzBuzz.processNumber(6);

        // then
        assertThat(output, is("Fizz"));
    }

    @Test
    public void shouldProcessInput_10() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz(3,5);

        // when
        String output = fizzBuzz.processNumber(10);

        // then
        assertThat(output, is("Buzz"));
    }

    @Test
    public void shouldProcessInput_15() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz(3,5);

        // when
        String output = fizzBuzz.processNumber(15);

        // then
        assertThat(output, is("FizzBuzz"));
    }

    @Test
    public void shouldProcessInput_27() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz(2,7);

        // when

        // then
        assertThat(fizzBuzz.processNumber(2), is("Fizz"));
        assertThat(fizzBuzz.processNumber(3), is("3"));
        assertThat(fizzBuzz.processNumber(4), is("Fizz"));
        assertThat(fizzBuzz.processNumber(7), is("Buzz"));
        assertThat(fizzBuzz.processNumber(14), is("FizzBuzz"));
    }

}