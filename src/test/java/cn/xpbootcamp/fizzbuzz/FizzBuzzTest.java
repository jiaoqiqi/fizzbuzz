package cn.xpbootcamp.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {
    @Test
    void should_return_2_when_sound_off_given_2 (){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.soundOff(2)).isEqualTo("2");
    }

    @Test
    void should_return_Fizz_when_sound_off_given_3 (){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.soundOff(3)).isEqualTo("Fizz");
    }

    @Test
    void should_return_Buzz_when_sound_off_given_5 (){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.soundOff(5)).isEqualTo("Buzz");
    }

    @Test
    void should_return_Whizz_when_sound_off_given_7 (){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.soundOff(7)).isEqualTo("Whizz");
    }

    @Test
    void should_return_FizzBuzz_when_sound_off_given_15 (){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.soundOff(15)).isEqualTo("FizzBuzz");
    }

    @Test
    void should_return_FizzWhizz_when_sound_off_given_21 (){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.soundOff(21)).isEqualTo("FizzWhizz");
    }
}
