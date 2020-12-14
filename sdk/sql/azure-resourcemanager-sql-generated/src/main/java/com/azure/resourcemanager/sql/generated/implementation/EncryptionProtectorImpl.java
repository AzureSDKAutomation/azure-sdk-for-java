// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.models.EncryptionProtectorInner;
import com.azure.resourcemanager.sql.generated.models.EncryptionProtector;
import com.azure.resourcemanager.sql.generated.models.EncryptionProtectorName;
import com.azure.resourcemanager.sql.generated.models.ServerKeyType;

public final class EncryptionProtectorImpl
    implements EncryptionProtector, EncryptionProtector.Definition, EncryptionProtector.Update {
    private EncryptionProtectorInner innerObject;

    private final SqlManager serviceManager;

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

    public String location() {
        return this.innerModel().location();
    }

    public String subregion() {
        return this.innerModel().subregion();
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

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public EncryptionProtectorInner innerModel() {
        return this.innerObject;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serverName;

    private EncryptionProtectorName encryptionProtectorName;

    public EncryptionProtectorImpl withExistingServer(String resourceGroupName, String serverName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        return this;
    }

    public EncryptionProtector create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEncryptionProtectors()
                .createOrUpdate(
                    resourceGroupName, serverName, encryptionProtectorName, this.innerModel(), Context.NONE);
        return this;
    }

    public EncryptionProtector create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEncryptionProtectors()
                .createOrUpdate(resourceGroupName, serverName, encryptionProtectorName, this.innerModel(), context);
        return this;
    }

    public EncryptionProtectorImpl(EncryptionProtectorName name, SqlManager serviceManager) {
        this.innerObject = new EncryptionProtectorInner();
        this.serviceManager = serviceManager;
        this.encryptionProtectorName = name;
    }

    public EncryptionProtectorImpl update() {
        return this;
    }

    public EncryptionProtector apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEncryptionProtectors()
                .createOrUpdate(
                    resourceGroupName, serverName, encryptionProtectorName, this.innerModel(), Context.NONE);
        return this;
    }

    public EncryptionProtector apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEncryptionProtectors()
                .createOrUpdate(resourceGroupName, serverName, encryptionProtectorName, this.innerModel(), context);
        return this;
    }

    public EncryptionProtectorImpl(EncryptionProtectorInner innerObject, SqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serverName = Utils.getValueFromIdByName(innerObject.id(), "servers");
        this.encryptionProtectorName =
            EncryptionProtectorName.fromString(Utils.getValueFromIdByName(innerObject.id(), "encryptionProtector"));
    }

    public EncryptionProtector refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEncryptionProtectors()
                .getWithResponse(resourceGroupName, serverName, encryptionProtectorName, Context.NONE)
                .getValue();
        return this;
    }

    public EncryptionProtector refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEncryptionProtectors()
                .getWithResponse(resourceGroupName, serverName, encryptionProtectorName, context)
                .getValue();
        return this;
    }

    public EncryptionProtectorImpl withServerKeyName(String serverKeyName) {
        this.innerModel().withServerKeyName(serverKeyName);
        return this;
    }

    public EncryptionProtectorImpl withServerKeyType(ServerKeyType serverKeyType) {
        this.innerModel().withServerKeyType(serverKeyType);
        return this;
    }
}
