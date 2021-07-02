// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azureactivedirectory.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.azureactivedirectory.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.azureactivedirectory.models.PrivateEndpoint;
import com.azure.resourcemanager.azureactivedirectory.models.PrivateEndpointConnection;
import com.azure.resourcemanager.azureactivedirectory.models.PrivateEndpointConnectionProvisioningState;
import com.azure.resourcemanager.azureactivedirectory.models.PrivateLinkServiceConnectionState;
import com.azure.resourcemanager.azureactivedirectory.models.TagsResource;
import java.util.Collections;
import java.util.Map;

public final class PrivateEndpointConnectionImpl
    implements PrivateEndpointConnection, PrivateEndpointConnection.Definition, PrivateEndpointConnection.Update {
    private PrivateEndpointConnectionInner innerObject;

    private final com.azure.resourcemanager.azureactivedirectory.AzureactivedirectoryManager serviceManager;

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

    public PrivateEndpoint privateEndpoint() {
        return this.innerModel().privateEndpoint();
    }

    public PrivateLinkServiceConnectionState privateLinkServiceConnectionState() {
        return this.innerModel().privateLinkServiceConnectionState();
    }

    public PrivateEndpointConnectionProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public PrivateEndpointConnectionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azureactivedirectory.AzureactivedirectoryManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String policyName;

    private String privateEndpointConnectionName;

    private TagsResource updatePrivateLinkConnectionTags;

    public PrivateEndpointConnectionImpl withExistingPrivateLinkForAzureAd(
        String resourceGroupName, String policyName) {
        this.resourceGroupName = resourceGroupName;
        this.policyName = policyName;
        return this;
    }

    public PrivateEndpointConnection create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpointConnections()
                .create(resourceGroupName, policyName, privateEndpointConnectionName, this.innerModel(), Context.NONE);
        return this;
    }

    public PrivateEndpointConnection create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpointConnections()
                .create(resourceGroupName, policyName, privateEndpointConnectionName, this.innerModel(), context);
        return this;
    }

    PrivateEndpointConnectionImpl(
        String name, com.azure.resourcemanager.azureactivedirectory.AzureactivedirectoryManager serviceManager) {
        this.innerObject = new PrivateEndpointConnectionInner();
        this.serviceManager = serviceManager;
        this.privateEndpointConnectionName = name;
    }

    public PrivateEndpointConnectionImpl update() {
        this.updatePrivateLinkConnectionTags = new TagsResource();
        return this;
    }

    public PrivateEndpointConnection apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpointConnections()
                .updateTagsWithResponse(
                    resourceGroupName,
                    policyName,
                    privateEndpointConnectionName,
                    updatePrivateLinkConnectionTags,
                    Context.NONE)
                .getValue();
        return this;
    }

    public PrivateEndpointConnection apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpointConnections()
                .updateTagsWithResponse(
                    resourceGroupName,
                    policyName,
                    privateEndpointConnectionName,
                    updatePrivateLinkConnectionTags,
                    context)
                .getValue();
        return this;
    }

    PrivateEndpointConnectionImpl(
        PrivateEndpointConnectionInner innerObject,
        com.azure.resourcemanager.azureactivedirectory.AzureactivedirectoryManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.policyName = Utils.getValueFromIdByName(innerObject.id(), "privateLinkForAzureAd");
        this.privateEndpointConnectionName = Utils.getValueFromIdByName(innerObject.id(), "privateEndpointConnections");
    }

    public PrivateEndpointConnection refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpointConnections()
                .getWithResponse(resourceGroupName, policyName, privateEndpointConnectionName, Context.NONE)
                .getValue();
        return this;
    }

    public PrivateEndpointConnection refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateEndpointConnections()
                .getWithResponse(resourceGroupName, policyName, privateEndpointConnectionName, context)
                .getValue();
        return this;
    }

    public PrivateEndpointConnectionImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public PrivateEndpointConnectionImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public PrivateEndpointConnectionImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updatePrivateLinkConnectionTags.withTags(tags);
            return this;
        }
    }

    public PrivateEndpointConnectionImpl withPrivateEndpoint(PrivateEndpoint privateEndpoint) {
        this.innerModel().withPrivateEndpoint(privateEndpoint);
        return this;
    }

    public PrivateEndpointConnectionImpl withPrivateLinkServiceConnectionState(
        PrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        this.innerModel().withPrivateLinkServiceConnectionState(privateLinkServiceConnectionState);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
