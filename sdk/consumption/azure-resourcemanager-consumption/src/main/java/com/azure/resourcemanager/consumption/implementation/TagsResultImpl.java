// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.implementation;

import com.azure.resourcemanager.consumption.ConsumptionManager;
import com.azure.resourcemanager.consumption.fluent.models.TagsResultInner;
import com.azure.resourcemanager.consumption.models.Tag;
import com.azure.resourcemanager.consumption.models.TagsResult;
import java.util.Collections;
import java.util.List;

public final class TagsResultImpl implements TagsResult {
    private TagsResultInner innerObject;

    private final ConsumptionManager serviceManager;

    public TagsResultImpl(TagsResultInner innerObject, ConsumptionManager serviceManager) {
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

    public List<Tag> tags() {
        List<Tag> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public TagsResultInner innerModel() {
        return this.innerObject;
    }

    private ConsumptionManager manager() {
        return this.serviceManager;
    }
}
