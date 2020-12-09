// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.resourcemanager.compute.generated.ComputeManager;
import com.azure.resourcemanager.compute.generated.fluent.models.SharedGalleryImageVersionInner;
import com.azure.resourcemanager.compute.generated.models.SharedGalleryImageVersion;
import java.time.OffsetDateTime;

public final class SharedGalleryImageVersionImpl implements SharedGalleryImageVersion {
    private SharedGalleryImageVersionInner innerObject;

    private final ComputeManager serviceManager;

    public SharedGalleryImageVersionImpl(SharedGalleryImageVersionInner innerObject, ComputeManager serviceManager) {
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

    public OffsetDateTime publishedDate() {
        return this.innerModel().publishedDate();
    }

    public OffsetDateTime endOfLifeDate() {
        return this.innerModel().endOfLifeDate();
    }

    public SharedGalleryImageVersionInner innerModel() {
        return this.innerObject;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }
}
