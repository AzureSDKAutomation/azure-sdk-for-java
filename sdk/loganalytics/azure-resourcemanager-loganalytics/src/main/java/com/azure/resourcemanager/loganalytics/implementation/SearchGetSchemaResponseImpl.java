// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.implementation;

import com.azure.resourcemanager.loganalytics.LogAnalyticsManager;
import com.azure.resourcemanager.loganalytics.fluent.models.SearchGetSchemaResponseInner;
import com.azure.resourcemanager.loganalytics.models.SearchGetSchemaResponse;
import com.azure.resourcemanager.loganalytics.models.SearchMetadata;
import com.azure.resourcemanager.loganalytics.models.SearchSchemaValue;
import java.util.Collections;
import java.util.List;

public final class SearchGetSchemaResponseImpl implements SearchGetSchemaResponse {
    private SearchGetSchemaResponseInner innerObject;

    private final LogAnalyticsManager serviceManager;

    public SearchGetSchemaResponseImpl(SearchGetSchemaResponseInner innerObject, LogAnalyticsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public SearchMetadata metadata() {
        return this.innerModel().metadata();
    }

    public List<SearchSchemaValue> value() {
        List<SearchSchemaValue> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public SearchGetSchemaResponseInner innerModel() {
        return this.innerObject;
    }

    private LogAnalyticsManager manager() {
        return this.serviceManager;
    }
}
