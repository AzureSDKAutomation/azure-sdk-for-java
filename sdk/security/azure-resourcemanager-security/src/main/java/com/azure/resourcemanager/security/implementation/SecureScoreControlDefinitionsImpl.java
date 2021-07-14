// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.SecureScoreControlDefinitionsClient;
import com.azure.resourcemanager.security.fluent.models.SecureScoreControlDefinitionItemInner;
import com.azure.resourcemanager.security.models.SecureScoreControlDefinitionItem;
import com.azure.resourcemanager.security.models.SecureScoreControlDefinitions;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class SecureScoreControlDefinitionsImpl implements SecureScoreControlDefinitions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SecureScoreControlDefinitionsImpl.class);

    private final SecureScoreControlDefinitionsClient innerClient;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    public SecureScoreControlDefinitionsImpl(
        SecureScoreControlDefinitionsClient innerClient,
        com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<SecureScoreControlDefinitionItem> list() {
        PagedIterable<SecureScoreControlDefinitionItemInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new SecureScoreControlDefinitionItemImpl(inner1, this.manager()));
    }

    public PagedIterable<SecureScoreControlDefinitionItem> list(Context context) {
        PagedIterable<SecureScoreControlDefinitionItemInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new SecureScoreControlDefinitionItemImpl(inner1, this.manager()));
    }

    public PagedIterable<SecureScoreControlDefinitionItem> listBySubscription() {
        PagedIterable<SecureScoreControlDefinitionItemInner> inner = this.serviceClient().listBySubscription();
        return Utils.mapPage(inner, inner1 -> new SecureScoreControlDefinitionItemImpl(inner1, this.manager()));
    }

    public PagedIterable<SecureScoreControlDefinitionItem> listBySubscription(Context context) {
        PagedIterable<SecureScoreControlDefinitionItemInner> inner = this.serviceClient().listBySubscription(context);
        return Utils.mapPage(inner, inner1 -> new SecureScoreControlDefinitionItemImpl(inner1, this.manager()));
    }

    private SecureScoreControlDefinitionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }
}
