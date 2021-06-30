// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.implementation;

import com.azure.resourcemanager.resources.generated.fluent.models.TemplateHashResultInner;
import com.azure.resourcemanager.resources.generated.models.TemplateHashResult;

public final class TemplateHashResultImpl implements TemplateHashResult {
    private TemplateHashResultInner innerObject;

    private final com.azure.resourcemanager.resources.generated.ResourceManager serviceManager;

    TemplateHashResultImpl(
        TemplateHashResultInner innerObject,
        com.azure.resourcemanager.resources.generated.ResourceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String minifiedTemplate() {
        return this.innerModel().minifiedTemplate();
    }

    public String templateHash() {
        return this.innerModel().templateHash();
    }

    public TemplateHashResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.resources.generated.ResourceManager manager() {
        return this.serviceManager;
    }
}
