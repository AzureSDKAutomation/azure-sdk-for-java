// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.resourcemanager.synapse.SynapseManager;
import com.azure.resourcemanager.synapse.fluent.models.SsisObjectMetadataListResponseInner;
import com.azure.resourcemanager.synapse.models.SsisObjectMetadata;
import com.azure.resourcemanager.synapse.models.SsisObjectMetadataListResponse;
import java.util.Collections;
import java.util.List;

public final class SsisObjectMetadataListResponseImpl implements SsisObjectMetadataListResponse {
    private SsisObjectMetadataListResponseInner innerObject;

    private final SynapseManager serviceManager;

    SsisObjectMetadataListResponseImpl(SsisObjectMetadataListResponseInner innerObject, SynapseManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<SsisObjectMetadata> value() {
        List<SsisObjectMetadata> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String nextLink() {
        return this.innerModel().nextLink();
    }

    public SsisObjectMetadataListResponseInner innerModel() {
        return this.innerObject;
    }

    private SynapseManager manager() {
        return this.serviceManager;
    }
}
