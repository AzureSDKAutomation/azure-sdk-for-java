// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.ProtectionIntentResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionIntent;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionIntentResource;
import java.util.Collections;
import java.util.Map;

public final class ProtectionIntentResourceImpl
    implements ProtectionIntentResource, ProtectionIntentResource.Definition, ProtectionIntentResource.Update {
    private ProtectionIntentResourceInner innerObject;

    private final RecoveryServicesBackupManager serviceManager;

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

    public ProtectionIntent properties() {
        return this.innerModel().properties();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public ProtectionIntentResourceInner innerModel() {
        return this.innerObject;
    }

    private RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }

    private String vaultName;

    private String resourceGroupName;

    private String fabricName;

    private String intentObjectName;

    public ProtectionIntentResourceImpl withExistingBackupFabric(
        String vaultName, String resourceGroupName, String fabricName) {
        this.vaultName = vaultName;
        this.resourceGroupName = resourceGroupName;
        this.fabricName = fabricName;
        return this;
    }

    public ProtectionIntentResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getProtectionIntents()
                .createOrUpdateWithResponse(
                    vaultName, resourceGroupName, fabricName, intentObjectName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public ProtectionIntentResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getProtectionIntents()
                .createOrUpdateWithResponse(
                    vaultName, resourceGroupName, fabricName, intentObjectName, this.innerModel(), context)
                .getValue();
        return this;
    }

    ProtectionIntentResourceImpl(String name, RecoveryServicesBackupManager serviceManager) {
        this.innerObject = new ProtectionIntentResourceInner();
        this.serviceManager = serviceManager;
        this.intentObjectName = name;
    }

    public ProtectionIntentResourceImpl update() {
        return this;
    }

    public ProtectionIntentResource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getProtectionIntents()
                .createOrUpdateWithResponse(
                    vaultName, resourceGroupName, fabricName, intentObjectName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public ProtectionIntentResource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getProtectionIntents()
                .createOrUpdateWithResponse(
                    vaultName, resourceGroupName, fabricName, intentObjectName, this.innerModel(), context)
                .getValue();
        return this;
    }

    ProtectionIntentResourceImpl(
        ProtectionIntentResourceInner innerObject, RecoveryServicesBackupManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.vaultName = Utils.getValueFromIdByName(innerObject.id(), "vaults");
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.fabricName = Utils.getValueFromIdByName(innerObject.id(), "backupFabrics");
        this.intentObjectName = Utils.getValueFromIdByName(innerObject.id(), "backupProtectionIntent");
    }

    public ProtectionIntentResource refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getProtectionIntents()
                .getWithResponse(vaultName, resourceGroupName, fabricName, intentObjectName, Context.NONE)
                .getValue();
        return this;
    }

    public ProtectionIntentResource refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getProtectionIntents()
                .getWithResponse(vaultName, resourceGroupName, fabricName, intentObjectName, context)
                .getValue();
        return this;
    }

    public ProtectionIntentResourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ProtectionIntentResourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ProtectionIntentResourceImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public ProtectionIntentResourceImpl withProperties(ProtectionIntent properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    public ProtectionIntentResourceImpl withEtag(String etag) {
        this.innerModel().withEtag(etag);
        return this;
    }
}
