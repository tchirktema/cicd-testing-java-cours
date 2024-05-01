package tech.zerofiltre.testing.calcul.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionFormatterTest {

  private SolutionFormatter solutionFormatter;

  @BeforeEach
  void initFormatter() {
    solutionFormatter = new SolutionFormatterImpl();
  }

  @Test
  void format_shouldFormatAnyBigNumber() {
    // GIVEN
    final int number = 1234567890;

    // WHEN
    final String result = solutionFormatter.format(number);

    // THEN
    assertThat(result).isEqualTo("1\u202F234\u202F567\u202F890");
  }

}
