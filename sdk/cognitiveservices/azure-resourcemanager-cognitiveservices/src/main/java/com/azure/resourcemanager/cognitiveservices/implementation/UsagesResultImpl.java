// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.implementation;

import com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager;
import com.azure.resourcemanager.cognitiveservices.fluent.models.UsagesResultInner;
import com.azure.resourcemanager.cognitiveservices.models.Usage;
import com.azure.resourcemanager.cognitiveservices.models.UsagesResult;
import java.util.Collections;
import java.util.List;

public final class UsagesResultImpl implements UsagesResult {
    private UsagesResultInner innerObject;

    private final CognitiveServicesManager serviceManager;

    UsagesResultImpl(UsagesResultInner innerObject, CognitiveServicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<Usage> value() {
        List<Usage> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public UsagesResultInner innerModel() {
        return this.innerObject;
    }

    private CognitiveServicesManager manager() {
        return this.serviceManager;
    }
}
