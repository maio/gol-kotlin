package cz.maio.gameoflife

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AppTest {
    @Test
    fun `app works`() {
        val greeting = App().greeting
        assertThat(greeting).isEqualTo("FIXME")
    }
}
