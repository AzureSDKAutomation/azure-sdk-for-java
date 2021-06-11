// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.generated.fluent.DiagnosticSettingsCategoriesClient;
import com.azure.resourcemanager.monitor.generated.fluent.models.DiagnosticSettingsCategoryResourceCollectionInner;
import com.azure.resourcemanager.monitor.generated.fluent.models.DiagnosticSettingsCategoryResourceInner;
import com.azure.resourcemanager.monitor.generated.models.DiagnosticSettingsCategories;
import com.azure.resourcemanager.monitor.generated.models.DiagnosticSettingsCategoryResource;
import com.azure.resourcemanager.monitor.generated.models.DiagnosticSettingsCategoryResourceCollection;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DiagnosticSettingsCategoriesImpl implements DiagnosticSettingsCategories {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DiagnosticSettingsCategoriesImpl.class);

    private final DiagnosticSettingsCategoriesClient innerClient;

    private final com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager;

    public DiagnosticSettingsCategoriesImpl(
        DiagnosticSettingsCategoriesClient innerClient,
        com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public DiagnosticSettingsCategoryResource get(String resourceUri, String name) {
        DiagnosticSettingsCategoryResourceInner inner = this.serviceClient().get(resourceUri, name);
        if (inner != null) {
            return new DiagnosticSettingsCategoryResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DiagnosticSettingsCategoryResource> getWithResponse(
        String resourceUri, String name, Context context) {
        Response<DiagnosticSettingsCategoryResourceInner> inner =
            this.serviceClient().getWithResponse(resourceUri, name, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DiagnosticSettingsCategoryResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DiagnosticSettingsCategoryResourceCollection list(String resourceUri) {
        DiagnosticSettingsCategoryResourceCollectionInner inner = this.serviceClient().list(resourceUri);
        if (inner != null) {
            return new DiagnosticSettingsCategoryResourceCollectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DiagnosticSettingsCategoryResourceCollection> listWithResponse(
        String resourceUri, Context context) {
        Response<DiagnosticSettingsCategoryResourceCollectionInner> inner =
            this.serviceClient().listWithResponse(resourceUri, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DiagnosticSettingsCategoryResourceCollectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private DiagnosticSettingsCategoriesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.monitor.generated.MonitorManager manager() {
        return this.serviceManager;
    }
}
