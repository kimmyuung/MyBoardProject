package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class UserTest {

    @DisplayName("password reset")
    @Test
    void passwordTest() {
        // given
        User user = new User();
        // when
        user.initPassword();
        // then
        assertThat(user.getPassword()).isNotNull();
    }
}