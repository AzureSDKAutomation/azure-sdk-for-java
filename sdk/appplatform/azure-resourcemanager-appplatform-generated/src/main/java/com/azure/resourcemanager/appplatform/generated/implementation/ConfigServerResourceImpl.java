// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.implementation;

import com.azure.resourcemanager.appplatform.generated.fluent.models.ConfigServerResourceInner;
import com.azure.resourcemanager.appplatform.generated.models.ConfigServerProperties;
import com.azure.resourcemanager.appplatform.generated.models.ConfigServerResource;

public final class ConfigServerResourceImpl implements ConfigServerResource {
    private ConfigServerResourceInner innerObject;

    private final com.azure.resourcemanager.appplatform.generated.AppPlatformManager serviceManager;

    ConfigServerResourceImpl(
        ConfigServerResourceInner innerObject,
        com.azure.resourcemanager.appplatform.generated.AppPlatformManager serviceManager) {
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

    public ConfigServerProperties properties() {
        return this.innerModel().properties();
    }

    public ConfigServerResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager() {
        return this.serviceManager;
    }
}
