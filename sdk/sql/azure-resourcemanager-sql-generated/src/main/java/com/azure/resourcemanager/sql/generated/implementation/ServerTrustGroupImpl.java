// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.models.ServerTrustGroupInner;
import com.azure.resourcemanager.sql.generated.models.ServerInfo;
import com.azure.resourcemanager.sql.generated.models.ServerTrustGroup;
import java.util.Collections;
import java.util.List;

public final class ServerTrustGroupImpl
    implements ServerTrustGroup, ServerTrustGroup.Definition, ServerTrustGroup.Update {
    private ServerTrustGroupInner innerObject;

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

    public List<ServerInfo> groupMembers() {
        List<ServerInfo> inner = this.innerModel().groupMembers();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> trustScopes() {
        List<String> inner = this.innerModel().trustScopes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ServerTrustGroupInner innerModel() {
        return this.innerObject;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String locationName;

    private String serverTrustGroupName;

    public ServerTrustGroupImpl withExistingLocation(String resourceGroupName, String locationName) {
        this.resourceGroupName = resourceGroupName;
        this.locationName = locationName;
        return this;
    }

    public ServerTrustGroup create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerTrustGroups()
                .createOrUpdate(resourceGroupName, locationName, serverTrustGroupName, this.innerModel(), Context.NONE);
        return this;
    }

    public ServerTrustGroup create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerTrustGroups()
                .createOrUpdate(resourceGroupName, locationName, serverTrustGroupName, this.innerModel(), context);
        return this;
    }

    public ServerTrustGroupImpl(String name, SqlManager serviceManager) {
        this.innerObject = new ServerTrustGroupInner();
        this.serviceManager = serviceManager;
        this.serverTrustGroupName = name;
    }

    public ServerTrustGroupImpl update() {
        return this;
    }

    public ServerTrustGroup apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerTrustGroups()
                .createOrUpdate(resourceGroupName, locationName, serverTrustGroupName, this.innerModel(), Context.NONE);
        return this;
    }

    public ServerTrustGroup apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerTrustGroups()
                .createOrUpdate(resourceGroupName, locationName, serverTrustGroupName, this.innerModel(), context);
        return this;
    }

    public ServerTrustGroupImpl(ServerTrustGroupInner innerObject, SqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.locationName = Utils.getValueFromIdByName(innerObject.id(), "locations");
        this.serverTrustGroupName = Utils.getValueFromIdByName(innerObject.id(), "serverTrustGroups");
    }

    public ServerTrustGroup refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerTrustGroups()
                .getWithResponse(resourceGroupName, locationName, serverTrustGroupName, Context.NONE)
                .getValue();
        return this;
    }

    public ServerTrustGroup refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerTrustGroups()
                .getWithResponse(resourceGroupName, locationName, serverTrustGroupName, context)
                .getValue();
        return this;
    }

    public ServerTrustGroupImpl withGroupMembers(List<ServerInfo> groupMembers) {
        this.innerModel().withGroupMembers(groupMembers);
        return this;
    }

    public ServerTrustGroupImpl withTrustScopes(List<String> trustScopes) {
        this.innerModel().withTrustScopes(trustScopes);
        return this;
    }
}
