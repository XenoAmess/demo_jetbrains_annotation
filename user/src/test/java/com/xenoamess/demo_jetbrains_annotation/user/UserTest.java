package com.xenoamess.demo_jetbrains_annotation.user;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static com.xenoamess.demo_jetbrains_annotation.user.User.invokeAdd;

public class UserTest {
    @Test
    public void invokeAddTest() {
        ClassLoader classLoader = this.getClass().getClassLoader();
        Assertions.assertThrows(
                ClassNotFoundException.class,
                () -> classLoader.loadClass("org.jetbrains.annotations.NotNull")
        );
        Assertions.assertEquals(3, invokeAdd(1, 2));
        Assertions.assertNotEquals(4, invokeAdd(2, 3));
    }
}
