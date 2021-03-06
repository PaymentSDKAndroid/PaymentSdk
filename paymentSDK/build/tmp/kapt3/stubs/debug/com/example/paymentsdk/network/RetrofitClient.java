package com.example.paymentsdk.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/example/paymentsdk/network/RetrofitClient;", "", "()V", "Companion", "paymentSDK_debug"})
public final class RetrofitClient {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.paymentsdk.network.RetrofitClient.Companion Companion = null;
    private static final java.lang.String BASE_URL = "https://stage-api.stage-easymerchant.io/api/tokenizer/";
    
    public RetrofitClient() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/paymentsdk/network/RetrofitClient$Companion;", "", "()V", "BASE_URL", "", "getRetrofitInstance", "Lretrofit2/Retrofit;", "paymentCard", "Lcom/example/paymentsdk/view/PaymentCard;", "paymentSDK_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final retrofit2.Retrofit getRetrofitInstance(@org.jetbrains.annotations.NotNull()
        com.example.paymentsdk.view.PaymentCard paymentCard) {
            return null;
        }
    }
}