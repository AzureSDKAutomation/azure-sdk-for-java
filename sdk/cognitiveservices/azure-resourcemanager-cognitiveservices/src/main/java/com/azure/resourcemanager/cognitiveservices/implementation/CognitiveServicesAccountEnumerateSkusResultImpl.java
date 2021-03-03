// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.implementation;

import com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager;
import com.azure.resourcemanager.cognitiveservices.fluent.models.CognitiveServicesAccountEnumerateSkusResultInner;
import com.azure.resourcemanager.cognitiveservices.models.CognitiveServicesAccountEnumerateSkusResult;
import com.azure.resourcemanager.cognitiveservices.models.CognitiveServicesResourceAndSku;
import java.util.Collections;
import java.util.List;

public final class CognitiveServicesAccountEnumerateSkusResultImpl
    implements CognitiveServicesAccountEnumerateSkusResult {
    private CognitiveServicesAccountEnumerateSkusResultInner innerObject;

    private final CognitiveServicesManager serviceManager;

    CognitiveServicesAccountEnumerateSkusResultImpl(
        CognitiveServicesAccountEnumerateSkusResultInner innerObject, CognitiveServicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<CognitiveServicesResourceAndSku> value() {
        List<CognitiveServicesResourceAndSku> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public CognitiveServicesAccountEnumerateSkusResultInner innerModel() {
        return this.innerObject;
    }

    private CognitiveServicesManager manager() {
        return this.serviceManager;
    }
}
