package com.amazonaws.mobileconnectors.apigateway;

import android.util.Pair;

public interface HeaderProvider {
    Pair<String, String> getHeader();
}
