// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.implementation;

import com.azure.resourcemanager.appplatform.generated.AppPlatformManager;
import com.azure.resourcemanager.appplatform.generated.fluent.models.ResourceUploadDefinitionInner;
import com.azure.resourcemanager.appplatform.generated.models.ResourceUploadDefinition;

public final class ResourceUploadDefinitionImpl implements ResourceUploadDefinition {
    private ResourceUploadDefinitionInner innerObject;

    private final AppPlatformManager serviceManager;

    ResourceUploadDefinitionImpl(ResourceUploadDefinitionInner innerObject, AppPlatformManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String relativePath() {
        return this.innerModel().relativePath();
    }

    public String uploadUrl() {
        return this.innerModel().uploadUrl();
    }

    public ResourceUploadDefinitionInner innerModel() {
        return this.innerObject;
    }

    private AppPlatformManager manager() {
        return this.serviceManager;
    }
}
