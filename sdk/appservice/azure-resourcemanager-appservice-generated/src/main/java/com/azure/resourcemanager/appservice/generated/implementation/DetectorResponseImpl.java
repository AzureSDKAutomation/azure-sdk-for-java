// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.fluent.models.DetectorResponseInner;
import com.azure.resourcemanager.appservice.generated.models.DataProviderMetadata;
import com.azure.resourcemanager.appservice.generated.models.DetectorInfo;
import com.azure.resourcemanager.appservice.generated.models.DetectorResponse;
import com.azure.resourcemanager.appservice.generated.models.DiagnosticData;
import com.azure.resourcemanager.appservice.generated.models.QueryUtterancesResults;
import com.azure.resourcemanager.appservice.generated.models.Status;
import java.util.Collections;
import java.util.List;

public final class DetectorResponseImpl implements DetectorResponse {
    private DetectorResponseInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    DetectorResponseImpl(
        DetectorResponseInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public DetectorInfo metadata() {
        return this.innerModel().metadata();
    }

    public List<DiagnosticData> dataset() {
        List<DiagnosticData> inner = this.innerModel().dataset();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Status status() {
        return this.innerModel().status();
    }

    public List<DataProviderMetadata> dataProvidersMetadata() {
        List<DataProviderMetadata> inner = this.innerModel().dataProvidersMetadata();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public QueryUtterancesResults suggestedUtterances() {
        return this.innerModel().suggestedUtterances();
    }

    public DetectorResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}
