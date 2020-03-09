/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhubs.v2018_01_01_preview.implementation;

import com.microsoft.azure.management.eventhubs.v2018_01_01_preview.Eventhub;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.List;
import org.joda.time.DateTime;
import com.microsoft.azure.management.eventhubs.v2018_01_01_preview.EntityStatus;
import com.microsoft.azure.management.eventhubs.v2018_01_01_preview.CaptureDescription;

class EventhubImpl extends CreatableUpdatableImpl<Eventhub, EventhubInner, EventhubImpl> implements Eventhub, Eventhub.Definition, Eventhub.Update {
    private final EventHubsManager manager;
    private String resourceGroupName;
    private String namespaceName;
    private String eventHubName;

    EventhubImpl(String name, EventHubsManager manager) {
        super(name, new EventhubInner());
        this.manager = manager;
        // Set resource name
        this.eventHubName = name;
        //
    }

    EventhubImpl(EventhubInner inner, EventHubsManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.eventHubName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.namespaceName = IdParsingUtils.getValueFromIdByName(inner.id(), "namespaces");
        this.eventHubName = IdParsingUtils.getValueFromIdByName(inner.id(), "eventhubs");
        //
    }

    @Override
    public EventHubsManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Eventhub> createResourceAsync() {
        EventHubsInner client = this.manager().inner().eventHubs();
        return client.createOrUpdateAsync(this.resourceGroupName, this.namespaceName, this.eventHubName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Eventhub> updateResourceAsync() {
        EventHubsInner client = this.manager().inner().eventHubs();
        return client.createOrUpdateAsync(this.resourceGroupName, this.namespaceName, this.eventHubName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<EventhubInner> getInnerAsync() {
        EventHubsInner client = this.manager().inner().eventHubs();
        return client.getAsync(this.resourceGroupName, this.namespaceName, this.eventHubName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public CaptureDescription captureDescription() {
        return this.inner().captureDescription();
    }

    @Override
    public DateTime createdAt() {
        return this.inner().createdAt();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Long messageRetentionInDays() {
        return this.inner().messageRetentionInDays();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Long partitionCount() {
        return this.inner().partitionCount();
    }

    @Override
    public List<String> partitionIds() {
        return this.inner().partitionIds();
    }

    @Override
    public EntityStatus status() {
        return this.inner().status();
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
    public EventhubImpl withExistingNamespace(String resourceGroupName, String namespaceName) {
        this.resourceGroupName = resourceGroupName;
        this.namespaceName = namespaceName;
        return this;
    }

    @Override
    public EventhubImpl withCaptureDescription(CaptureDescription captureDescription) {
        this.inner().withCaptureDescription(captureDescription);
        return this;
    }

    @Override
    public EventhubImpl withMessageRetentionInDays(Long messageRetentionInDays) {
        this.inner().withMessageRetentionInDays(messageRetentionInDays);
        return this;
    }

    @Override
    public EventhubImpl withPartitionCount(Long partitionCount) {
        this.inner().withPartitionCount(partitionCount);
        return this;
    }

    @Override
    public EventhubImpl withStatus(EntityStatus status) {
        this.inner().withStatus(status);
        return this;
    }

}
