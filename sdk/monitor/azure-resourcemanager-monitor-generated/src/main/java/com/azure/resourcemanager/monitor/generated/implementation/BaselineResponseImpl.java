// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

import com.azure.resourcemanager.monitor.generated.fluent.models.BaselineMetadataValueInner;
import com.azure.resourcemanager.monitor.generated.fluent.models.BaselineResponseInner;
import com.azure.resourcemanager.monitor.generated.fluent.models.LocalizableStringInner;
import com.azure.resourcemanager.monitor.generated.models.Baseline;
import com.azure.resourcemanager.monitor.generated.models.BaselineMetadataValue;
import com.azure.resourcemanager.monitor.generated.models.BaselineResponse;
import com.azure.resourcemanager.monitor.generated.models.LocalizableString;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class BaselineResponseImpl implements BaselineResponse {
    private BaselineResponseInner innerObject;

    private final com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager;

    BaselineResponseImpl(
        BaselineResponseInner innerObject, com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String type() {
        return this.innerModel().type();
    }

    public LocalizableString name() {
        LocalizableStringInner inner = this.innerModel().name();
        if (inner != null) {
            return new LocalizableStringImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public String timespan() {
        return this.innerModel().timespan();
    }

    public Duration interval() {
        return this.innerModel().interval();
    }

    public String aggregation() {
        return this.innerModel().aggregation();
    }

    public List<OffsetDateTime> timestamps() {
        List<OffsetDateTime> inner = this.innerModel().timestamps();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<Baseline> baseline() {
        List<Baseline> inner = this.innerModel().baseline();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<BaselineMetadataValue> metadata() {
        List<BaselineMetadataValueInner> inner = this.innerModel().metadata();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new BaselineMetadataValueImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public BaselineResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.monitor.generated.MonitorManager manager() {
        return this.serviceManager;
    }
}
