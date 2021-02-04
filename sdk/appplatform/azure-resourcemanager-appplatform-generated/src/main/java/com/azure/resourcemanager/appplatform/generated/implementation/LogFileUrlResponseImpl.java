// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.implementation;

import com.azure.resourcemanager.appplatform.generated.AppPlatformManager;
import com.azure.resourcemanager.appplatform.generated.fluent.models.LogFileUrlResponseInner;
import com.azure.resourcemanager.appplatform.generated.models.LogFileUrlResponse;

public final class LogFileUrlResponseImpl implements LogFileUrlResponse {
    private LogFileUrlResponseInner innerObject;

    private final AppPlatformManager serviceManager;

    LogFileUrlResponseImpl(LogFileUrlResponseInner innerObject, AppPlatformManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String url() {
        return this.innerModel().url();
    }

    public LogFileUrlResponseInner innerModel() {
        return this.innerObject;
    }

    private AppPlatformManager manager() {
        return this.serviceManager;
    }
}
