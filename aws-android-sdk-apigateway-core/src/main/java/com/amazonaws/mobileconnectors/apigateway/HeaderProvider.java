package com.amazonaws.mobileconnectors.apigateway;

import java.util.Map;

public interface HeaderProvider {
    Map<String, String> getHeaders();
}
