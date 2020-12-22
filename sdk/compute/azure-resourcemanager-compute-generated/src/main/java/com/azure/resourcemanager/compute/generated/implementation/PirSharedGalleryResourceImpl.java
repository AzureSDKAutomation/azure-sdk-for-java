// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.resourcemanager.compute.generated.ComputeManager;
import com.azure.resourcemanager.compute.generated.fluent.models.PirSharedGalleryResourceInner;
import com.azure.resourcemanager.compute.generated.models.PirSharedGalleryResource;

public final class PirSharedGalleryResourceImpl implements PirSharedGalleryResource {
    private PirSharedGalleryResourceInner innerObject;

    private final ComputeManager serviceManager;

    PirSharedGalleryResourceImpl(PirSharedGalleryResourceInner innerObject, ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public String location() {
        return this.innerModel().location();
    }

    public String uniqueId() {
        return this.innerModel().uniqueId();
    }

    public PirSharedGalleryResourceInner innerModel() {
        return this.innerObject;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }
}
