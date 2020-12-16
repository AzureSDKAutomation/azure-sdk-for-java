// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.implementation;

import com.azure.resourcemanager.containerservice.generated.ContainerServiceManager;
import com.azure.resourcemanager.containerservice.generated.fluent.models.CredentialResultsInner;
import com.azure.resourcemanager.containerservice.generated.models.CredentialResult;
import com.azure.resourcemanager.containerservice.generated.models.CredentialResults;
import java.util.Collections;
import java.util.List;

public final class CredentialResultsImpl implements CredentialResults {
    private CredentialResultsInner innerObject;

    private final ContainerServiceManager serviceManager;

    public CredentialResultsImpl(CredentialResultsInner innerObject, ContainerServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<CredentialResult> kubeconfigs() {
        List<CredentialResult> inner = this.innerModel().kubeconfigs();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public CredentialResultsInner innerModel() {
        return this.innerObject;
    }

    private ContainerServiceManager manager() {
        return this.serviceManager;
    }
}
