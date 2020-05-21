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
}
