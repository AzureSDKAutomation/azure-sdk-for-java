// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.msi.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.msi.generated.fluent.models.IdentityInner;
import com.azure.resourcemanager.msi.generated.models.Identity;
import com.azure.resourcemanager.msi.generated.models.IdentityUpdate;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;

public final class IdentityImpl implements Identity, Identity.Definition, Identity.Update {
    private IdentityInner innerObject;

    private final com.azure.resourcemanager.msi.generated.ManagedServiceIdentityManager serviceManager;

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

    public UUID tenantId() {
        return this.innerModel().tenantId();
    }

    public UUID principalId() {
        return this.innerModel().principalId();
    }

    public UUID clientId() {
        return this.innerModel().clientId();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public IdentityInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.msi.generated.ManagedServiceIdentityManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String resourceName;

    private IdentityUpdate updateParameters;

    public IdentityImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Identity create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getUserAssignedIdentities()
                .createOrUpdateWithResponse(resourceGroupName, resourceName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public Identity create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getUserAssignedIdentities()
                .createOrUpdateWithResponse(resourceGroupName, resourceName, this.innerModel(), context)
                .getValue();
        return this;
    }

    IdentityImpl(String name, com.azure.resourcemanager.msi.generated.ManagedServiceIdentityManager serviceManager) {
        this.innerObject = new IdentityInner();
        this.serviceManager = serviceManager;
        this.resourceName = name;
    }

    public IdentityImpl update() {
        this.updateParameters = new IdentityUpdate();
        return this;
    }

    public Identity apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getUserAssignedIdentities()
                .updateWithResponse(resourceGroupName, resourceName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public Identity apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getUserAssignedIdentities()
                .updateWithResponse(resourceGroupName, resourceName, updateParameters, context)
                .getValue();
        return this;
    }

    IdentityImpl(
        IdentityInner innerObject,
        com.azure.resourcemanager.msi.generated.ManagedServiceIdentityManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.resourceName = Utils.getValueFromIdByName(innerObject.id(), "userAssignedIdentities");
    }

    public Identity refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getUserAssignedIdentities()
                .getByResourceGroupWithResponse(resourceGroupName, resourceName, Context.NONE)
                .getValue();
        return this;
    }

    public Identity refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getUserAssignedIdentities()
                .getByResourceGroupWithResponse(resourceGroupName, resourceName, context)
                .getValue();
        return this;
    }

    public IdentityImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public IdentityImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public IdentityImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
