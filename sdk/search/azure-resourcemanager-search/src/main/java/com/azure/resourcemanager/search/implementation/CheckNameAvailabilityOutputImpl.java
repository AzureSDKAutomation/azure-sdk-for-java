// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.implementation;

import com.azure.resourcemanager.search.fluent.models.CheckNameAvailabilityOutputInner;
import com.azure.resourcemanager.search.models.CheckNameAvailabilityOutput;
import com.azure.resourcemanager.search.models.UnavailableNameReason;

public final class CheckNameAvailabilityOutputImpl implements CheckNameAvailabilityOutput {
    private CheckNameAvailabilityOutputInner innerObject;

    private final com.azure.resourcemanager.search.SearchManager serviceManager;

    CheckNameAvailabilityOutputImpl(
        CheckNameAvailabilityOutputInner innerObject, com.azure.resourcemanager.search.SearchManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Boolean isNameAvailable() {
        return this.innerModel().isNameAvailable();
    }

    public UnavailableNameReason reason() {
        return this.innerModel().reason();
    }

    public String message() {
        return this.innerModel().message();
    }

    public CheckNameAvailabilityOutputInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.search.SearchManager manager() {
        return this.serviceManager;
    }
}
