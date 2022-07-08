package org.autotelegram.messenger;

public interface GenericProvider<F, T> {
    T provide(F obj);
}
