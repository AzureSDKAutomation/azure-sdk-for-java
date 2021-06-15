// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.delegatednetwork.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.delegatednetwork.fluent.models.OrchestratorInner;
import com.azure.resourcemanager.delegatednetwork.models.Orchestrator;
import com.azure.resourcemanager.delegatednetwork.models.OrchestratorIdentity;
import com.azure.resourcemanager.delegatednetwork.models.OrchestratorKind;
import com.azure.resourcemanager.delegatednetwork.models.OrchestratorResourceProperties;
import com.azure.resourcemanager.delegatednetwork.models.OrchestratorResourceUpdateParameters;
import java.util.Collections;
import java.util.Map;

public final class OrchestratorImpl implements Orchestrator, Orchestrator.Definition, Orchestrator.Update {
    private OrchestratorInner innerObject;

    private final com.azure.resourcemanager.delegatednetwork.DelegatedNetworkManager serviceManager;

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

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public OrchestratorKind kind() {
        return this.innerModel().kind();
    }

    public OrchestratorIdentity identity() {
        return this.innerModel().identity();
    }

    public OrchestratorResourceProperties properties() {
        return this.innerModel().properties();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public OrchestratorInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.delegatednetwork.DelegatedNetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String resourceName;

    private OrchestratorResourceUpdateParameters updateParameters;

    public OrchestratorImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Orchestrator create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getOrchestratorInstanceServices()
                .create(resourceGroupName, resourceName, this.innerModel(), Context.NONE);
        return this;
    }

    public Orchestrator create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getOrchestratorInstanceServices()
                .create(resourceGroupName, resourceName, this.innerModel(), context);
        return this;
    }

    OrchestratorImpl(String name, com.azure.resourcemanager.delegatednetwork.DelegatedNetworkManager serviceManager) {
        this.innerObject = new OrchestratorInner();
        this.serviceManager = serviceManager;
        this.resourceName = name;
    }

    public OrchestratorImpl update() {
        this.updateParameters = new OrchestratorResourceUpdateParameters();
        return this;
    }

    public Orchestrator apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getOrchestratorInstanceServices()
                .patchWithResponse(resourceGroupName, resourceName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public Orchestrator apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getOrchestratorInstanceServices()
                .patchWithResponse(resourceGroupName, resourceName, updateParameters, context)
                .getValue();
        return this;
    }

    OrchestratorImpl(
        OrchestratorInner innerObject,
        com.azure.resourcemanager.delegatednetwork.DelegatedNetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.resourceName = Utils.getValueFromIdByName(innerObject.id(), "orchestrators");
    }

    public Orchestrator refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getOrchestratorInstanceServices()
                .getByResourceGroupWithResponse(resourceGroupName, resourceName, Context.NONE)
                .getValue();
        return this;
    }

    public Orchestrator refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getOrchestratorInstanceServices()
                .getByResourceGroupWithResponse(resourceGroupName, resourceName, context)
                .getValue();
        return this;
    }

    public OrchestratorImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public OrchestratorImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public OrchestratorImpl withKind(OrchestratorKind kind) {
        this.innerModel().withKind(kind);
        return this;
    }

    public OrchestratorImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public OrchestratorImpl withIdentity(OrchestratorIdentity identity) {
        this.innerModel().withIdentity(identity);
        return this;
    }

    public OrchestratorImpl withProperties(OrchestratorResourceProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
