// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.implementation;

import com.azure.resourcemanager.servicebus.generated.ServiceBusManager;
import com.azure.resourcemanager.servicebus.generated.fluent.models.EventhubInner;
import com.azure.resourcemanager.servicebus.generated.models.CaptureDescription;
import com.azure.resourcemanager.servicebus.generated.models.EntityStatus;
import com.azure.resourcemanager.servicebus.generated.models.Eventhub;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

public final class EventhubImpl implements Eventhub {
    private EventhubInner innerObject;

    private final ServiceBusManager serviceManager;

    EventhubImpl(EventhubInner innerObject, ServiceBusManager serviceManager) {
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

    public List<String> partitionIds() {
        List<String> inner = this.innerModel().partitionIds();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public OffsetDateTime createdAt() {
        return this.innerModel().createdAt();
    }

    public OffsetDateTime updatedAt() {
        return this.innerModel().updatedAt();
    }

    public Long messageRetentionInDays() {
        return this.innerModel().messageRetentionInDays();
    }

    public Long partitionCount() {
        return this.innerModel().partitionCount();
    }

    public EntityStatus status() {
        return this.innerModel().status();
    }

    public CaptureDescription captureDescription() {
        return this.innerModel().captureDescription();
    }

    public EventhubInner innerModel() {
        return this.innerObject;
    }

    private ServiceBusManager manager() {
        return this.serviceManager;
    }
}
