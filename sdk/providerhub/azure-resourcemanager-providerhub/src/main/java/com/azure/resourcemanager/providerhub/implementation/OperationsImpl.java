// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.providerhub.ProviderhubManager;
import com.azure.resourcemanager.providerhub.fluent.OperationsClient;
import com.azure.resourcemanager.providerhub.fluent.models.OperationsContentInner;
import com.azure.resourcemanager.providerhub.fluent.models.OperationsDefinitionInner;
import com.azure.resourcemanager.providerhub.models.Operations;
import com.azure.resourcemanager.providerhub.models.OperationsContent;
import com.azure.resourcemanager.providerhub.models.OperationsDefinition;
import com.azure.resourcemanager.providerhub.models.OperationsPutContent;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class OperationsImpl implements Operations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationsImpl.class);

    private final OperationsClient innerClient;

    private final ProviderhubManager serviceManager;

    public OperationsImpl(OperationsClient innerClient, ProviderhubManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<OperationsDefinition> list() {
        PagedIterable<OperationsDefinitionInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new OperationsDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<OperationsDefinition> list(Context context) {
        PagedIterable<OperationsDefinitionInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new OperationsDefinitionImpl(inner1, this.manager()));
    }

    public List<OperationsDefinition> listByProviderRegistration(String providerNamespace) {
        List<OperationsDefinitionInner> inner = this.serviceClient().listByProviderRegistration(providerNamespace);
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new OperationsDefinitionImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public Response<List<OperationsDefinition>> listByProviderRegistrationWithResponse(
        String providerNamespace, Context context) {
        Response<List<OperationsDefinitionInner>> inner =
            this.serviceClient().listByProviderRegistrationWithResponse(providerNamespace, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                inner
                    .getValue()
                    .stream()
                    .map(inner1 -> new OperationsDefinitionImpl(inner1, this.manager()))
                    .collect(Collectors.toList()));
        } else {
            return null;
        }
    }

    public OperationsContent createOrUpdate(String providerNamespace, OperationsPutContent operationsPutContent) {
        OperationsContentInner inner = this.serviceClient().createOrUpdate(providerNamespace, operationsPutContent);
        if (inner != null) {
            return new OperationsContentImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<OperationsContent> createOrUpdateWithResponse(
        String providerNamespace, OperationsPutContent operationsPutContent, Context context) {
        Response<OperationsContentInner> inner =
            this.serviceClient().createOrUpdateWithResponse(providerNamespace, operationsPutContent, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new OperationsContentImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String providerNamespace) {
        this.serviceClient().delete(providerNamespace);
    }

    public Response<Void> deleteWithResponse(String providerNamespace, Context context) {
        return this.serviceClient().deleteWithResponse(providerNamespace, context);
    }

    private OperationsClient serviceClient() {
        return this.innerClient;
    }

    private ProviderhubManager manager() {
        return this.serviceManager;
    }
}
