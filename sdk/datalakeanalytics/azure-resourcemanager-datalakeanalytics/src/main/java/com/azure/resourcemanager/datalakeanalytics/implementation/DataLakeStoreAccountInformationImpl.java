// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.implementation;

import com.azure.resourcemanager.datalakeanalytics.DataLakeAnalyticsManager;
import com.azure.resourcemanager.datalakeanalytics.fluent.models.DataLakeStoreAccountInformationInner;
import com.azure.resourcemanager.datalakeanalytics.models.DataLakeStoreAccountInformation;

public final class DataLakeStoreAccountInformationImpl implements DataLakeStoreAccountInformation {
    private DataLakeStoreAccountInformationInner innerObject;

    private final DataLakeAnalyticsManager serviceManager;

    DataLakeStoreAccountInformationImpl(
        DataLakeStoreAccountInformationInner innerObject, DataLakeAnalyticsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String suffix() {
        return this.innerModel().suffix();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public DataLakeStoreAccountInformationInner innerModel() {
        return this.innerObject;
    }

    private DataLakeAnalyticsManager manager() {
        return this.serviceManager;
    }
}
