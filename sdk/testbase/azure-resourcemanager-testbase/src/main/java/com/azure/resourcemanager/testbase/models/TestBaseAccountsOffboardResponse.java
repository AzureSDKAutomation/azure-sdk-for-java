// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.testbase.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the offboard operation. */
public final class TestBaseAccountsOffboardResponse extends ResponseBase<TestBaseAccountsOffboardHeaders, Void> {
    /**
     * Creates an instance of TestBaseAccountsOffboardResponse.
     *
     * @param request the request which resulted in this TestBaseAccountsOffboardResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public TestBaseAccountsOffboardResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        Void value,
        TestBaseAccountsOffboardHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}
