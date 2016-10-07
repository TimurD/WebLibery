package com.java.spring.libery.interfaces;

import com.java.spring.libery.classes.User;

/**
 * Created by timur_000 on 05.10.2016.
 */
public interface SecureLibery {
    boolean loginIn(User user);
    void loginOut(User user);
}
