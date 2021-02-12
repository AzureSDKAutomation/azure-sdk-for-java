// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.servicebus.generated.ServiceBusManager;
import com.azure.resourcemanager.servicebus.generated.fluent.models.SBTopicInner;
import com.azure.resourcemanager.servicebus.generated.models.EntityStatus;
import com.azure.resourcemanager.servicebus.generated.models.MessageCountDetails;
import com.azure.resourcemanager.servicebus.generated.models.SBTopic;
import java.time.Duration;
import java.time.OffsetDateTime;

public final class SBTopicImpl implements SBTopic, SBTopic.Definition, SBTopic.Update {
    private SBTopicInner innerObject;

    private final ServiceBusManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public Long sizeInBytes() {
        return this.innerModel().sizeInBytes();
    }

    public OffsetDateTime createdAt() {
        return this.innerModel().createdAt();
    }

    public OffsetDateTime updatedAt() {
        return this.innerModel().updatedAt();
    }

    public OffsetDateTime accessedAt() {
        return this.innerModel().accessedAt();
    }

    public Integer subscriptionCount() {
        return this.innerModel().subscriptionCount();
    }

    public MessageCountDetails countDetails() {
        return this.innerModel().countDetails();
    }

    public Duration defaultMessageTimeToLive() {
        return this.innerModel().defaultMessageTimeToLive();
    }

    public Integer maxSizeInMegabytes() {
        return this.innerModel().maxSizeInMegabytes();
    }

    public Boolean requiresDuplicateDetection() {
        return this.innerModel().requiresDuplicateDetection();
    }

    public Duration duplicateDetectionHistoryTimeWindow() {
        return this.innerModel().duplicateDetectionHistoryTimeWindow();
    }

    public Boolean enableBatchedOperations() {
        return this.innerModel().enableBatchedOperations();
    }

    public EntityStatus status() {
        return this.innerModel().status();
    }

    public Boolean supportOrdering() {
        return this.innerModel().supportOrdering();
    }

    public Duration autoDeleteOnIdle() {
        return this.innerModel().autoDeleteOnIdle();
    }

    public Boolean enablePartitioning() {
        return this.innerModel().enablePartitioning();
    }

    public Boolean enableExpress() {
        return this.innerModel().enableExpress();
    }

    public SBTopicInner innerModel() {
        return this.innerObject;
    }

    private ServiceBusManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String namespaceName;

    private String topicName;

    public SBTopicImpl withExistingNamespace(String resourceGroupName, String namespaceName) {
        this.resourceGroupName = resourceGroupName;
        this.namespaceName = namespaceName;
        return this;
    }

    public SBTopic create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTopics()
                .createOrUpdateWithResponse(
                    resourceGroupName, namespaceName, topicName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public SBTopic create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTopics()
                .createOrUpdateWithResponse(resourceGroupName, namespaceName, topicName, this.innerModel(), context)
                .getValue();
        return this;
    }

    SBTopicImpl(String name, ServiceBusManager serviceManager) {
        this.innerObject = new SBTopicInner();
        this.serviceManager = serviceManager;
        this.topicName = name;
    }

    public SBTopicImpl update() {
        return this;
    }

    public SBTopic apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTopics()
                .createOrUpdateWithResponse(
                    resourceGroupName, namespaceName, topicName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public SBTopic apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTopics()
                .createOrUpdateWithResponse(resourceGroupName, namespaceName, topicName, this.innerModel(), context)
                .getValue();
        return this;
    }

    SBTopicImpl(SBTopicInner innerObject, ServiceBusManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.namespaceName = Utils.getValueFromIdByName(innerObject.id(), "namespaces");
        this.topicName = Utils.getValueFromIdByName(innerObject.id(), "topics");
    }

    public SBTopic refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTopics()
                .getWithResponse(resourceGroupName, namespaceName, topicName, Context.NONE)
                .getValue();
        return this;
    }

    public SBTopic refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTopics()
                .getWithResponse(resourceGroupName, namespaceName, topicName, context)
                .getValue();
        return this;
    }

    public SBTopicImpl withDefaultMessageTimeToLive(Duration defaultMessageTimeToLive) {
        this.innerModel().withDefaultMessageTimeToLive(defaultMessageTimeToLive);
        return this;
    }

    public SBTopicImpl withMaxSizeInMegabytes(Integer maxSizeInMegabytes) {
        this.innerModel().withMaxSizeInMegabytes(maxSizeInMegabytes);
        return this;
    }

    public SBTopicImpl withRequiresDuplicateDetection(Boolean requiresDuplicateDetection) {
        this.innerModel().withRequiresDuplicateDetection(requiresDuplicateDetection);
        return this;
    }

    public SBTopicImpl withDuplicateDetectionHistoryTimeWindow(Duration duplicateDetectionHistoryTimeWindow) {
        this.innerModel().withDuplicateDetectionHistoryTimeWindow(duplicateDetectionHistoryTimeWindow);
        return this;
    }

    public SBTopicImpl withEnableBatchedOperations(Boolean enableBatchedOperations) {
        this.innerModel().withEnableBatchedOperations(enableBatchedOperations);
        return this;
    }

    public SBTopicImpl withStatus(EntityStatus status) {
        this.innerModel().withStatus(status);
        return this;
    }

    public SBTopicImpl withSupportOrdering(Boolean supportOrdering) {
        this.innerModel().withSupportOrdering(supportOrdering);
        return this;
    }

    public SBTopicImpl withAutoDeleteOnIdle(Duration autoDeleteOnIdle) {
        this.innerModel().withAutoDeleteOnIdle(autoDeleteOnIdle);
        return this;
    }

    public SBTopicImpl withEnablePartitioning(Boolean enablePartitioning) {
        this.innerModel().withEnablePartitioning(enablePartitioning);
        return this;
    }

    public SBTopicImpl withEnableExpress(Boolean enableExpress) {
        this.innerModel().withEnableExpress(enableExpress);
        return this;
    }
}
