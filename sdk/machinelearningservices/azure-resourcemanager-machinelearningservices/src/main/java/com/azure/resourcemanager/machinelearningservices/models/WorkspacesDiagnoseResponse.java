// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.machinelearningservices.fluent.models.DiagnoseResponseResultInner;

/** Contains all response data for the diagnose operation. */
public final class WorkspacesDiagnoseResponse
    extends ResponseBase<WorkspacesDiagnoseHeaders, DiagnoseResponseResultInner> {
    /**
     * Creates an instance of WorkspacesDiagnoseResponse.
     *
     * @param request the request which resulted in this WorkspacesDiagnoseResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public WorkspacesDiagnoseResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        DiagnoseResponseResultInner value,
        WorkspacesDiagnoseHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public DiagnoseResponseResultInner getValue() {
        return super.getValue();
    }
}
