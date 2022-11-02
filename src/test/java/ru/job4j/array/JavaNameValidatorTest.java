package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;
import static ru.job4j.array.JavaNameValidator.isNameValid;

/**
 * 1. СтажерКатегория
 * 1.1. Базовый Синтаксис.Тема
 * 1.1.6. Массивы
 * 6.9. String - это массив [#504884]
 * Test
 *
 * @author Dmitry Stepanov, user Dmitry
 * @since 02.11.2022
 */
class JavaNameValidatorTest {
    @Test
    void whenEmptyNameInvalid() {
        assertThat(isNameValid("")).isFalse();
    }

    @Test
    void whenFullLatValid() {
        assertThat(isNameValid("first")).isTrue();
    }

    @Test
    void whenFullLatAndSomeUpperCaseLettersValid() {
        assertThat(isNameValid("fIRST")).isTrue();
    }

    @Test
    void whenLatNumberValid() {
        assertThat(isNameValid("first1")).isTrue();
    }

    @Test
    void whenLatWithSpecialSymbolUnderValid() {
        assertThat(isNameValid("first_user")).isTrue();
    }

    @Test
    void whenNumberInValid() {
        assertThat(isNameValid("123")).isFalse();
    }

    @Test
    void whenFirstLatinUpperCaseIsInvalid() {
        assertThat(isNameValid("First")).isFalse();
    }

    @Test
    void whenLatNumberAndTwoSpecialSymbolsUnderValid() {
        assertThat(isNameValid("fir$t_u$er_1")).isTrue();
    }
}