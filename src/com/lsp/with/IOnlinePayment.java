package com.lsp.with;

// Dedicated interface for all types of online payments.
public interface IOnlinePayment extends IPayment {
    Boolean authenticate();
}
