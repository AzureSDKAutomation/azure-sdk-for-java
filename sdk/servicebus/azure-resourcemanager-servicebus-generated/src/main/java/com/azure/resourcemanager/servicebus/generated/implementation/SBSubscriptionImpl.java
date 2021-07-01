// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.implementation;

import com.azure.resourcemanager.servicebus.generated.fluent.models.SBSubscriptionInner;
import com.azure.resourcemanager.servicebus.generated.models.EntityStatus;
import com.azure.resourcemanager.servicebus.generated.models.MessageCountDetails;
import com.azure.resourcemanager.servicebus.generated.models.SBSubscription;
import java.time.Duration;
import java.time.OffsetDateTime;

public final class SBSubscriptionImpl implements SBSubscription {
    private SBSubscriptionInner innerObject;

    private final com.azure.resourcemanager.servicebus.generated.ServiceBusManager serviceManager;

    SBSubscriptionImpl(
        SBSubscriptionInner innerObject,
        com.azure.resourcemanager.servicebus.generated.ServiceBusManager serviceManager) {
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

    public Long messageCount() {
        return this.innerModel().messageCount();
    }

    public OffsetDateTime createdAt() {
        return this.innerModel().createdAt();
    }

    public OffsetDateTime accessedAt() {
        return this.innerModel().accessedAt();
    }

    public OffsetDateTime updatedAt() {
        return this.innerModel().updatedAt();
    }

    public MessageCountDetails countDetails() {
        return this.innerModel().countDetails();
    }

    public Duration lockDuration() {
        return this.innerModel().lockDuration();
    }

    public Boolean requiresSession() {
        return this.innerModel().requiresSession();
    }

    public Duration defaultMessageTimeToLive() {
        return this.innerModel().defaultMessageTimeToLive();
    }

    public Boolean deadLetteringOnFilterEvaluationExceptions() {
        return this.innerModel().deadLetteringOnFilterEvaluationExceptions();
    }

    public Boolean deadLetteringOnMessageExpiration() {
        return this.innerModel().deadLetteringOnMessageExpiration();
    }

    public Duration duplicateDetectionHistoryTimeWindow() {
        return this.innerModel().duplicateDetectionHistoryTimeWindow();
    }

    public Integer maxDeliveryCount() {
        return this.innerModel().maxDeliveryCount();
    }

    public EntityStatus status() {
        return this.innerModel().status();
    }

    public Boolean enableBatchedOperations() {
        return this.innerModel().enableBatchedOperations();
    }

    public Duration autoDeleteOnIdle() {
        return this.innerModel().autoDeleteOnIdle();
    }

    public String forwardTo() {
        return this.innerModel().forwardTo();
    }

    public String forwardDeadLetteredMessagesTo() {
        return this.innerModel().forwardDeadLetteredMessagesTo();
    }

    public SBSubscriptionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.servicebus.generated.ServiceBusManager manager() {
        return this.serviceManager;
    }
}
