package com.xenoamess.demo_jetbrains_annotation.user;

import com.xenoamess.demo_jetbrains_annotation.library.Library;

public class User {
    public static int invokeAdd(int a, int b) {
        return Library.add(a, b);
    }
}
