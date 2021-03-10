// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.implementation;

import com.azure.resourcemanager.consumption.fluent.models.PriceSheetResultInner;
import com.azure.resourcemanager.consumption.models.PriceSheetProperties;
import com.azure.resourcemanager.consumption.models.PriceSheetResult;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class PriceSheetResultImpl implements PriceSheetResult {
    private PriceSheetResultInner innerObject;

    private final com.azure.resourcemanager.consumption.ConsumptionManager serviceManager;

    PriceSheetResultImpl(
        PriceSheetResultInner innerObject, com.azure.resourcemanager.consumption.ConsumptionManager serviceManager) {
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

    public List<PriceSheetProperties> pricesheets() {
        List<PriceSheetProperties> inner = this.innerModel().pricesheets();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String nextLink() {
        return this.innerModel().nextLink();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public PriceSheetResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.consumption.ConsumptionManager manager() {
        return this.serviceManager;
    }
}
