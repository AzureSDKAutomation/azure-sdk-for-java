// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.TransparentDataEncryptionActivitiesClient;
import com.azure.resourcemanager.sql.generated.fluent.models.TransparentDataEncryptionActivityInner;
import com.azure.resourcemanager.sql.generated.models.TransparentDataEncryptionActivities;
import com.azure.resourcemanager.sql.generated.models.TransparentDataEncryptionActivity;
import com.azure.resourcemanager.sql.generated.models.TransparentDataEncryptionName;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class TransparentDataEncryptionActivitiesImpl implements TransparentDataEncryptionActivities {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TransparentDataEncryptionActivitiesImpl.class);

    private final TransparentDataEncryptionActivitiesClient innerClient;

    private final SqlManager serviceManager;

    public TransparentDataEncryptionActivitiesImpl(
        TransparentDataEncryptionActivitiesClient innerClient, SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<TransparentDataEncryptionActivity> listByConfiguration(
        String resourceGroupName,
        String serverName,
        String databaseName,
        TransparentDataEncryptionName transparentDataEncryptionName) {
        PagedIterable<TransparentDataEncryptionActivityInner> inner =
            this
                .serviceClient()
                .listByConfiguration(resourceGroupName, serverName, databaseName, transparentDataEncryptionName);
        return Utils.mapPage(inner, inner1 -> new TransparentDataEncryptionActivityImpl(inner1, this.manager()));
    }

    public PagedIterable<TransparentDataEncryptionActivity> listByConfiguration(
        String resourceGroupName,
        String serverName,
        String databaseName,
        TransparentDataEncryptionName transparentDataEncryptionName,
        Context context) {
        PagedIterable<TransparentDataEncryptionActivityInner> inner =
            this
                .serviceClient()
                .listByConfiguration(
                    resourceGroupName, serverName, databaseName, transparentDataEncryptionName, context);
        return Utils.mapPage(inner, inner1 -> new TransparentDataEncryptionActivityImpl(inner1, this.manager()));
    }

    private TransparentDataEncryptionActivitiesClient serviceClient() {
        return this.innerClient;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }
}
