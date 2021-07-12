// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.implementation;

import com.azure.resourcemanager.appplatform.generated.fluent.models.AvailableRuntimeVersionsInner;
import com.azure.resourcemanager.appplatform.generated.models.AvailableRuntimeVersions;
import com.azure.resourcemanager.appplatform.generated.models.SupportedRuntimeVersion;
import java.util.Collections;
import java.util.List;

public final class AvailableRuntimeVersionsImpl implements AvailableRuntimeVersions {
    private AvailableRuntimeVersionsInner innerObject;

    private final com.azure.resourcemanager.appplatform.generated.AppPlatformManager serviceManager;

    AvailableRuntimeVersionsImpl(
        AvailableRuntimeVersionsInner innerObject,
        com.azure.resourcemanager.appplatform.generated.AppPlatformManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<SupportedRuntimeVersion> value() {
        List<SupportedRuntimeVersion> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public AvailableRuntimeVersionsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager() {
        return this.serviceManager;
    }
}
