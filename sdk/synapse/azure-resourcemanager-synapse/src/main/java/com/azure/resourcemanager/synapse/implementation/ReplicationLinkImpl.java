// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.resourcemanager.synapse.SynapseManager;
import com.azure.resourcemanager.synapse.fluent.models.ReplicationLinkInner;
import com.azure.resourcemanager.synapse.models.ReplicationLink;
import com.azure.resourcemanager.synapse.models.ReplicationRole;
import com.azure.resourcemanager.synapse.models.ReplicationState;
import java.time.OffsetDateTime;

public final class ReplicationLinkImpl implements ReplicationLink {
    private ReplicationLinkInner innerObject;

    private final SynapseManager serviceManager;

    public ReplicationLinkImpl(ReplicationLinkInner innerObject, SynapseManager serviceManager) {
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

    public String location() {
        return this.innerModel().location();
    }

    public Boolean isTerminationAllowed() {
        return this.innerModel().isTerminationAllowed();
    }

    public String replicationMode() {
        return this.innerModel().replicationMode();
    }

    public String partnerServer() {
        return this.innerModel().partnerServer();
    }

    public String partnerDatabase() {
        return this.innerModel().partnerDatabase();
    }

    public String partnerLocation() {
        return this.innerModel().partnerLocation();
    }

    public ReplicationRole role() {
        return this.innerModel().role();
    }

    public ReplicationRole partnerRole() {
        return this.innerModel().partnerRole();
    }

    public OffsetDateTime startTime() {
        return this.innerModel().startTime();
    }

    public Integer percentComplete() {
        return this.innerModel().percentComplete();
    }

    public ReplicationState replicationState() {
        return this.innerModel().replicationState();
    }

    public ReplicationLinkInner innerModel() {
        return this.innerObject;
    }

    private SynapseManager manager() {
        return this.serviceManager;
    }
}
