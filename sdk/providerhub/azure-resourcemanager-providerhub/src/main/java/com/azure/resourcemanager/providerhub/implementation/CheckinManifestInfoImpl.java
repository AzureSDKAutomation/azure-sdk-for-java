// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.implementation;

import com.azure.resourcemanager.providerhub.ProviderHubManager;
import com.azure.resourcemanager.providerhub.fluent.models.CheckinManifestInfoInner;
import com.azure.resourcemanager.providerhub.models.CheckinManifestInfo;

public final class CheckinManifestInfoImpl implements CheckinManifestInfo {
    private CheckinManifestInfoInner innerObject;

    private final ProviderHubManager serviceManager;

    CheckinManifestInfoImpl(CheckinManifestInfoInner innerObject, ProviderHubManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public boolean isCheckedIn() {
        return this.innerModel().isCheckedIn();
    }

    public String statusMessage() {
        return this.innerModel().statusMessage();
    }

    public String pullRequest() {
        return this.innerModel().pullRequest();
    }

    public String commitId() {
        return this.innerModel().commitId();
    }

    public CheckinManifestInfoInner innerModel() {
        return this.innerObject;
    }

    private ProviderHubManager manager() {
        return this.serviceManager;
    }
}
