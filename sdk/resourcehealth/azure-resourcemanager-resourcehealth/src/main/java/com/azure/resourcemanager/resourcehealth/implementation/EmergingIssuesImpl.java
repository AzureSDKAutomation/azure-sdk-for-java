// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.resourcehealth.fluent.EmergingIssuesClient;
import com.azure.resourcemanager.resourcehealth.fluent.models.EmergingIssuesGetResultInner;
import com.azure.resourcemanager.resourcehealth.models.EmergingIssues;
import com.azure.resourcemanager.resourcehealth.models.EmergingIssuesGetResult;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class EmergingIssuesImpl implements EmergingIssues {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EmergingIssuesImpl.class);

    private final EmergingIssuesClient innerClient;

    private final com.azure.resourcemanager.resourcehealth.ResourcehealthManager serviceManager;

    public EmergingIssuesImpl(
        EmergingIssuesClient innerClient,
        com.azure.resourcemanager.resourcehealth.ResourcehealthManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public EmergingIssuesGetResult get() {
        EmergingIssuesGetResultInner inner = this.serviceClient().get();
        if (inner != null) {
            return new EmergingIssuesGetResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<EmergingIssuesGetResult> getWithResponse(Context context) {
        Response<EmergingIssuesGetResultInner> inner = this.serviceClient().getWithResponse(context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new EmergingIssuesGetResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<EmergingIssuesGetResult> list() {
        PagedIterable<EmergingIssuesGetResultInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new EmergingIssuesGetResultImpl(inner1, this.manager()));
    }

    public PagedIterable<EmergingIssuesGetResult> list(Context context) {
        PagedIterable<EmergingIssuesGetResultInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new EmergingIssuesGetResultImpl(inner1, this.manager()));
    }

    private EmergingIssuesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.resourcehealth.ResourcehealthManager manager() {
        return this.serviceManager;
    }
}
