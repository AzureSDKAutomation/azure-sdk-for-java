// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.ManagedInstanceEncryptionProtectorInner;
import com.azure.resourcemanager.sql.generated.models.EncryptionProtectorName;
import com.azure.resourcemanager.sql.generated.models.ManagedInstanceEncryptionProtector;
import com.azure.resourcemanager.sql.generated.models.ServerKeyType;

public final class ManagedInstanceEncryptionProtectorImpl
    implements ManagedInstanceEncryptionProtector,
        ManagedInstanceEncryptionProtector.Definition,
        ManagedInstanceEncryptionProtector.Update {
    private ManagedInstanceEncryptionProtectorInner innerObject;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public String serverKeyName() {
        return this.innerModel().serverKeyName();
    }

    public ServerKeyType serverKeyType() {
        return this.innerModel().serverKeyType();
    }

    public String uri() {
        return this.innerModel().uri();
    }

    public String thumbprint() {
        return this.innerModel().thumbprint();
    }

    public Boolean autoRotationEnabled() {
        return this.innerModel().autoRotationEnabled();
    }

    public ManagedInstanceEncryptionProtectorInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String managedInstanceName;

    private EncryptionProtectorName encryptionProtectorName;

    public ManagedInstanceEncryptionProtectorImpl withExistingManagedInstance(
        String resourceGroupName, String managedInstanceName) {
        this.resourceGroupName = resourceGroupName;
        this.managedInstanceName = managedInstanceName;
        return this;
    }

    public ManagedInstanceEncryptionProtector create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getManagedInstanceEncryptionProtectors()
                .createOrUpdate(
                    resourceGroupName, managedInstanceName, encryptionProtectorName, this.innerModel(), Context.NONE);
        return this;
    }

    public ManagedInstanceEncryptionProtector create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getManagedInstanceEncryptionProtectors()
                .createOrUpdate(
                    resourceGroupName, managedInstanceName, encryptionProtectorName, this.innerModel(), context);
        return this;
    }

    ManagedInstanceEncryptionProtectorImpl(
        EncryptionProtectorName name, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerObject = new ManagedInstanceEncryptionProtectorInner();
        this.serviceManager = serviceManager;
        this.encryptionProtectorName = name;
    }

    public ManagedInstanceEncryptionProtectorImpl update() {
        return this;
    }

    public ManagedInstanceEncryptionProtector apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getManagedInstanceEncryptionProtectors()
                .createOrUpdate(
                    resourceGroupName, managedInstanceName, encryptionProtectorName, this.innerModel(), Context.NONE);
        return this;
    }

    public ManagedInstanceEncryptionProtector apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getManagedInstanceEncryptionProtectors()
                .createOrUpdate(
                    resourceGroupName, managedInstanceName, encryptionProtectorName, this.innerModel(), context);
        return this;
    }

    ManagedInstanceEncryptionProtectorImpl(
        ManagedInstanceEncryptionProtectorInner innerObject,
        com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.managedInstanceName = Utils.getValueFromIdByName(innerObject.id(), "managedInstances");
        this.encryptionProtectorName =
            EncryptionProtectorName.fromString(Utils.getValueFromIdByName(innerObject.id(), "encryptionProtector"));
    }

    public ManagedInstanceEncryptionProtector refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getManagedInstanceEncryptionProtectors()
                .getWithResponse(resourceGroupName, managedInstanceName, encryptionProtectorName, Context.NONE)
                .getValue();
        return this;
    }

    public ManagedInstanceEncryptionProtector refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getManagedInstanceEncryptionProtectors()
                .getWithResponse(resourceGroupName, managedInstanceName, encryptionProtectorName, context)
                .getValue();
        return this;
    }

    public ManagedInstanceEncryptionProtectorImpl withServerKeyName(String serverKeyName) {
        this.innerModel().withServerKeyName(serverKeyName);
        return this;
    }

    public ManagedInstanceEncryptionProtectorImpl withServerKeyType(ServerKeyType serverKeyType) {
        this.innerModel().withServerKeyType(serverKeyType);
        return this;
    }

    public ManagedInstanceEncryptionProtectorImpl withAutoRotationEnabled(Boolean autoRotationEnabled) {
        this.innerModel().withAutoRotationEnabled(autoRotationEnabled);
        return this;
    }
}
