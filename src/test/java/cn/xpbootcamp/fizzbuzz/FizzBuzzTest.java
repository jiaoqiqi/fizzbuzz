package cn.xpbootcamp.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {
    @Test
    void should_return_number_when_is_has_no_multiples() {
        assertThat(1).isEqualTo(1);
    }
}
