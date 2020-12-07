// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthbot.implementation;

import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.healthbot.HealthbotManager;
import com.azure.resourcemanager.healthbot.fluent.DeletesClient;
import com.azure.resourcemanager.healthbot.models.Deletes;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DeletesImpl implements Deletes {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DeletesImpl.class);

    private final DeletesClient innerClient;

    private final HealthbotManager serviceManager;

    public DeletesImpl(DeletesClient innerClient, HealthbotManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void bot(String resourceGroupName, String resourceName) {
        this.serviceClient().bot(resourceGroupName, resourceName);
    }

    public void bot(String resourceGroupName, String resourceName, Context context) {
        this.serviceClient().bot(resourceGroupName, resourceName, context);
    }

    private DeletesClient serviceClient() {
        return this.innerClient;
    }

    private HealthbotManager manager() {
        return this.serviceManager;
    }
}
