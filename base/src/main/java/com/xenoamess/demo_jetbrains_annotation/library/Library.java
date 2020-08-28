package com.xenoamess.demo_jetbrains_annotation.library;

import org.jetbrains.annotations.NotNull;

public class Library {
    public static @NotNull Integer add(@NotNull Integer a, @NotNull Integer b) {
        return a + b;
    }
}
