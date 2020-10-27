/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus.v2018_01_01_preview.implementation;

import com.microsoft.azure.management.servicebus.v2018_01_01_preview.SBTopic;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import org.joda.time.DateTime;
import com.microsoft.azure.management.servicebus.v2018_01_01_preview.MessageCountDetails;
import org.joda.time.Period;
import com.microsoft.azure.management.servicebus.v2018_01_01_preview.EntityStatus;

class SBTopicImpl extends CreatableUpdatableImpl<SBTopic, SBTopicInner, SBTopicImpl> implements SBTopic, SBTopic.Definition, SBTopic.Update {
    private final ServiceBusManager manager;
    private String resourceGroupName;
    private String namespaceName;
    private String topicName;

    SBTopicImpl(String name, ServiceBusManager manager) {
        super(name, new SBTopicInner());
        this.manager = manager;
        // Set resource name
        this.topicName = name;
        //
    }

    SBTopicImpl(SBTopicInner inner, ServiceBusManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.topicName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.namespaceName = IdParsingUtils.getValueFromIdByName(inner.id(), "namespaces");
        this.topicName = IdParsingUtils.getValueFromIdByName(inner.id(), "topics");
        //
    }

    @Override
    public ServiceBusManager manager() {
        return this.manager;
    }

    @Override
    public Observable<SBTopic> createResourceAsync() {
        TopicsInner client = this.manager().inner().topics();
        return client.createOrUpdateAsync(this.resourceGroupName, this.namespaceName, this.topicName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<SBTopic> updateResourceAsync() {
        TopicsInner client = this.manager().inner().topics();
        return client.createOrUpdateAsync(this.resourceGroupName, this.namespaceName, this.topicName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<SBTopicInner> getInnerAsync() {
        TopicsInner client = this.manager().inner().topics();
        return client.getAsync(this.resourceGroupName, this.namespaceName, this.topicName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public DateTime accessedAt() {
        return this.inner().accessedAt();
    }

    @Override
    public Period autoDeleteOnIdle() {
        return this.inner().autoDeleteOnIdle();
    }

    @Override
    public MessageCountDetails countDetails() {
        return this.inner().countDetails();
    }

    @Override
    public DateTime createdAt() {
        return this.inner().createdAt();
    }

    @Override
    public Period defaultMessageTimeToLive() {
        return this.inner().defaultMessageTimeToLive();
    }

    @Override
    public Period duplicateDetectionHistoryTimeWindow() {
        return this.inner().duplicateDetectionHistoryTimeWindow();
    }

    @Override
    public Boolean enableBatchedOperations() {
        return this.inner().enableBatchedOperations();
    }

    @Override
    public Boolean enableExpress() {
        return this.inner().enableExpress();
    }

    @Override
    public Boolean enablePartitioning() {
        return this.inner().enablePartitioning();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Integer maxSizeInMegabytes() {
        return this.inner().maxSizeInMegabytes();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Boolean requiresDuplicateDetection() {
        return this.inner().requiresDuplicateDetection();
    }

    @Override
    public Long sizeInBytes() {
        return this.inner().sizeInBytes();
    }

    @Override
    public EntityStatus status() {
        return this.inner().status();
    }

    @Override
    public Integer subscriptionCount() {
        return this.inner().subscriptionCount();
    }

    @Override
    public Boolean supportOrdering() {
        return this.inner().supportOrdering();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public DateTime updatedAt() {
        return this.inner().updatedAt();
    }

    @Override
    public SBTopicImpl withExistingNamespace(String resourceGroupName, String namespaceName) {
        this.resourceGroupName = resourceGroupName;
        this.namespaceName = namespaceName;
        return this;
    }

    @Override
    public SBTopicImpl withAutoDeleteOnIdle(Period autoDeleteOnIdle) {
        this.inner().withAutoDeleteOnIdle(autoDeleteOnIdle);
        return this;
    }

    @Override
    public SBTopicImpl withDefaultMessageTimeToLive(Period defaultMessageTimeToLive) {
        this.inner().withDefaultMessageTimeToLive(defaultMessageTimeToLive);
        return this;
    }

    @Override
    public SBTopicImpl withDuplicateDetectionHistoryTimeWindow(Period duplicateDetectionHistoryTimeWindow) {
        this.inner().withDuplicateDetectionHistoryTimeWindow(duplicateDetectionHistoryTimeWindow);
        return this;
    }

    @Override
    public SBTopicImpl withEnableBatchedOperations(Boolean enableBatchedOperations) {
        this.inner().withEnableBatchedOperations(enableBatchedOperations);
        return this;
    }

    @Override
    public SBTopicImpl withEnableExpress(Boolean enableExpress) {
        this.inner().withEnableExpress(enableExpress);
        return this;
    }

    @Override
    public SBTopicImpl withEnablePartitioning(Boolean enablePartitioning) {
        this.inner().withEnablePartitioning(enablePartitioning);
        return this;
    }

    @Override
    public SBTopicImpl withMaxSizeInMegabytes(Integer maxSizeInMegabytes) {
        this.inner().withMaxSizeInMegabytes(maxSizeInMegabytes);
        return this;
    }

    @Override
    public SBTopicImpl withRequiresDuplicateDetection(Boolean requiresDuplicateDetection) {
        this.inner().withRequiresDuplicateDetection(requiresDuplicateDetection);
        return this;
    }

    @Override
    public SBTopicImpl withStatus(EntityStatus status) {
        this.inner().withStatus(status);
        return this;
    }

    @Override
    public SBTopicImpl withSupportOrdering(Boolean supportOrdering) {
        this.inner().withSupportOrdering(supportOrdering);
        return this;
    }

}
