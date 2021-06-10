// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azureactivedirectory.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azureactivedirectory.fluent.DiagnosticSettingsClient;
import com.azure.resourcemanager.azureactivedirectory.fluent.models.DiagnosticSettingsResourceCollectionInner;
import com.azure.resourcemanager.azureactivedirectory.fluent.models.DiagnosticSettingsResourceInner;
import com.azure.resourcemanager.azureactivedirectory.models.DiagnosticSettings;
import com.azure.resourcemanager.azureactivedirectory.models.DiagnosticSettingsResource;
import com.azure.resourcemanager.azureactivedirectory.models.DiagnosticSettingsResourceCollection;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DiagnosticSettingsImpl implements DiagnosticSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DiagnosticSettingsImpl.class);

    private final DiagnosticSettingsClient innerClient;

    private final com.azure.resourcemanager.azureactivedirectory.AzureactivedirectoryManager serviceManager;

    public DiagnosticSettingsImpl(
        DiagnosticSettingsClient innerClient,
        com.azure.resourcemanager.azureactivedirectory.AzureactivedirectoryManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public DiagnosticSettingsResourceCollection list() {
        DiagnosticSettingsResourceCollectionInner inner = this.serviceClient().list();
        if (inner != null) {
            return new DiagnosticSettingsResourceCollectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DiagnosticSettingsResourceCollection> listWithResponse(Context context) {
        Response<DiagnosticSettingsResourceCollectionInner> inner = this.serviceClient().listWithResponse(context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DiagnosticSettingsResourceCollectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DiagnosticSettingsResource get(String name) {
        DiagnosticSettingsResourceInner inner = this.serviceClient().get(name);
        if (inner != null) {
            return new DiagnosticSettingsResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DiagnosticSettingsResource> getWithResponse(String name, Context context) {
        Response<DiagnosticSettingsResourceInner> inner = this.serviceClient().getWithResponse(name, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DiagnosticSettingsResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DiagnosticSettingsResource createOrUpdate(String name, DiagnosticSettingsResourceInner parameters) {
        DiagnosticSettingsResourceInner inner = this.serviceClient().createOrUpdate(name, parameters);
        if (inner != null) {
            return new DiagnosticSettingsResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DiagnosticSettingsResource> createOrUpdateWithResponse(
        String name, DiagnosticSettingsResourceInner parameters, Context context) {
        Response<DiagnosticSettingsResourceInner> inner =
            this.serviceClient().createOrUpdateWithResponse(name, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DiagnosticSettingsResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String name) {
        this.serviceClient().delete(name);
    }

    public Response<Void> deleteWithResponse(String name, Context context) {
        return this.serviceClient().deleteWithResponse(name, context);
    }

    private DiagnosticSettingsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.azureactivedirectory.AzureactivedirectoryManager manager() {
        return this.serviceManager;
    }
}
