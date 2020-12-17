// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagesync.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the list operation. */
public final class StorageSyncServicesListResponse
    extends ResponseBase<StorageSyncServicesListHeaders, StorageSyncServiceArray> {
    /**
     * Creates an instance of StorageSyncServicesListResponse.
     *
     * @param request the request which resulted in this StorageSyncServicesListResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public StorageSyncServicesListResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        StorageSyncServiceArray value,
        StorageSyncServicesListHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public StorageSyncServiceArray getValue() {
        return super.getValue();
    }
}
