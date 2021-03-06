// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.datafactory.fluent.models.CreateDataFlowDebugSessionResponseInner;

/** Contains all response data for the create operation. */
public final class DataFlowDebugSessionsCreateResponse
    extends ResponseBase<DataFlowDebugSessionsCreateHeaders, CreateDataFlowDebugSessionResponseInner> {
    /**
     * Creates an instance of DataFlowDebugSessionsCreateResponse.
     *
     * @param request the request which resulted in this DataFlowDebugSessionsCreateResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public DataFlowDebugSessionsCreateResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        CreateDataFlowDebugSessionResponseInner value,
        DataFlowDebugSessionsCreateHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public CreateDataFlowDebugSessionResponseInner getValue() {
        return super.getValue();
    }
}
