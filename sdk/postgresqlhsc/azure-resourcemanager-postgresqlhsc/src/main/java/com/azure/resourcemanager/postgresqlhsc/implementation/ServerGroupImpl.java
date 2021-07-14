// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlhsc.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.postgresqlhsc.fluent.models.ServerGroupInner;
import com.azure.resourcemanager.postgresqlhsc.models.CitusVersion;
import com.azure.resourcemanager.postgresqlhsc.models.CreateMode;
import com.azure.resourcemanager.postgresqlhsc.models.MaintenanceWindow;
import com.azure.resourcemanager.postgresqlhsc.models.PostgreSqlVersion;
import com.azure.resourcemanager.postgresqlhsc.models.ResourceProviderType;
import com.azure.resourcemanager.postgresqlhsc.models.ServerGroup;
import com.azure.resourcemanager.postgresqlhsc.models.ServerGroupForUpdate;
import com.azure.resourcemanager.postgresqlhsc.models.ServerGroupPropertiesDelegatedSubnetArguments;
import com.azure.resourcemanager.postgresqlhsc.models.ServerGroupPropertiesPrivateDnsZoneArguments;
import com.azure.resourcemanager.postgresqlhsc.models.ServerRoleGroup;
import com.azure.resourcemanager.postgresqlhsc.models.ServerState;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class ServerGroupImpl implements ServerGroup, ServerGroup.Definition, ServerGroup.Update {
    private ServerGroupInner innerObject;

    private final com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager serviceManager;

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

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public CreateMode createMode() {
        return this.innerModel().createMode();
    }

    public String administratorLogin() {
        return this.innerModel().administratorLogin();
    }

    public String administratorLoginPassword() {
        return this.innerModel().administratorLoginPassword();
    }

    public Integer backupRetentionDays() {
        return this.innerModel().backupRetentionDays();
    }

    public PostgreSqlVersion postgresqlVersion() {
        return this.innerModel().postgresqlVersion();
    }

    public CitusVersion citusVersion() {
        return this.innerModel().citusVersion();
    }

    public Boolean enableMx() {
        return this.innerModel().enableMx();
    }

    public Boolean enableZfs() {
        return this.innerModel().enableZfs();
    }

    public Boolean enableShardsOnCoordinator() {
        return this.innerModel().enableShardsOnCoordinator();
    }

    public ServerState state() {
        return this.innerModel().state();
    }

    public OffsetDateTime earliestRestoreTime() {
        return this.innerModel().earliestRestoreTime();
    }

    public ResourceProviderType resourceProviderType() {
        return this.innerModel().resourceProviderType();
    }

    public List<ServerRoleGroup> serverRoleGroups() {
        List<ServerRoleGroup> inner = this.innerModel().serverRoleGroups();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public MaintenanceWindow maintenanceWindow() {
        return this.innerModel().maintenanceWindow();
    }

    public String availabilityZone() {
        return this.innerModel().availabilityZone();
    }

    public String standbyAvailabilityZone() {
        return this.innerModel().standbyAvailabilityZone();
    }

    public ServerGroupPropertiesDelegatedSubnetArguments delegatedSubnetArguments() {
        return this.innerModel().delegatedSubnetArguments();
    }

    public ServerGroupPropertiesPrivateDnsZoneArguments privateDnsZoneArguments() {
        return this.innerModel().privateDnsZoneArguments();
    }

    public List<String> readReplicas() {
        List<String> inner = this.innerModel().readReplicas();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String sourceServerGroup() {
        return this.innerModel().sourceServerGroup();
    }

    public String sourceSubscriptionId() {
        return this.innerModel().sourceSubscriptionId();
    }

    public String sourceResourceGroupName() {
        return this.innerModel().sourceResourceGroupName();
    }

    public String sourceServerGroupName() {
        return this.innerModel().sourceServerGroupName();
    }

    public String sourceLocation() {
        return this.innerModel().sourceLocation();
    }

    public OffsetDateTime pointInTimeUtc() {
        return this.innerModel().pointInTimeUtc();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public ServerGroupInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serverGroupName;

    private ServerGroupForUpdate updateParameters;

    public ServerGroupImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public ServerGroup create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerGroups()
                .createOrUpdate(resourceGroupName, serverGroupName, this.innerModel(), Context.NONE);
        return this;
    }

    public ServerGroup create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerGroups()
                .createOrUpdate(resourceGroupName, serverGroupName, this.innerModel(), context);
        return this;
    }

    ServerGroupImpl(String name, com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager serviceManager) {
        this.innerObject = new ServerGroupInner();
        this.serviceManager = serviceManager;
        this.serverGroupName = name;
    }

    public ServerGroupImpl update() {
        this.updateParameters = new ServerGroupForUpdate();
        return this;
    }

    public ServerGroup apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerGroups()
                .update(resourceGroupName, serverGroupName, updateParameters, Context.NONE);
        return this;
    }

    public ServerGroup apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerGroups()
                .update(resourceGroupName, serverGroupName, updateParameters, context);
        return this;
    }

    ServerGroupImpl(
        ServerGroupInner innerObject, com.azure.resourcemanager.postgresqlhsc.PostgresqlhscManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serverGroupName = Utils.getValueFromIdByName(innerObject.id(), "serverGroupsv2");
    }

    public ServerGroup refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerGroups()
                .getByResourceGroupWithResponse(resourceGroupName, serverGroupName, Context.NONE)
                .getValue();
        return this;
    }

    public ServerGroup refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerGroups()
                .getByResourceGroupWithResponse(resourceGroupName, serverGroupName, context)
                .getValue();
        return this;
    }

    public void restart() {
        serviceManager.serverGroups().restart(resourceGroupName, serverGroupName);
    }

    public void restart(Context context) {
        serviceManager.serverGroups().restart(resourceGroupName, serverGroupName, context);
    }

    public void start() {
        serviceManager.serverGroups().start(resourceGroupName, serverGroupName);
    }

    public void start(Context context) {
        serviceManager.serverGroups().start(resourceGroupName, serverGroupName, context);
    }

    public void stop() {
        serviceManager.serverGroups().stop(resourceGroupName, serverGroupName);
    }

    public void stop(Context context) {
        serviceManager.serverGroups().stop(resourceGroupName, serverGroupName, context);
    }

    public ServerGroupImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ServerGroupImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ServerGroupImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public ServerGroupImpl withCreateMode(CreateMode createMode) {
        this.innerModel().withCreateMode(createMode);
        return this;
    }

    public ServerGroupImpl withAdministratorLogin(String administratorLogin) {
        this.innerModel().withAdministratorLogin(administratorLogin);
        return this;
    }

    public ServerGroupImpl withAdministratorLoginPassword(String administratorLoginPassword) {
        if (isInCreateMode()) {
            this.innerModel().withAdministratorLoginPassword(administratorLoginPassword);
            return this;
        } else {
            this.updateParameters.withAdministratorLoginPassword(administratorLoginPassword);
            return this;
        }
    }

    public ServerGroupImpl withBackupRetentionDays(Integer backupRetentionDays) {
        if (isInCreateMode()) {
            this.innerModel().withBackupRetentionDays(backupRetentionDays);
            return this;
        } else {
            this.updateParameters.withBackupRetentionDays(backupRetentionDays);
            return this;
        }
    }

    public ServerGroupImpl withPostgresqlVersion(PostgreSqlVersion postgresqlVersion) {
        if (isInCreateMode()) {
            this.innerModel().withPostgresqlVersion(postgresqlVersion);
            return this;
        } else {
            this.updateParameters.withPostgresqlVersion(postgresqlVersion);
            return this;
        }
    }

    public ServerGroupImpl withCitusVersion(CitusVersion citusVersion) {
        if (isInCreateMode()) {
            this.innerModel().withCitusVersion(citusVersion);
            return this;
        } else {
            this.updateParameters.withCitusVersion(citusVersion);
            return this;
        }
    }

    public ServerGroupImpl withEnableMx(Boolean enableMx) {
        this.innerModel().withEnableMx(enableMx);
        return this;
    }

    public ServerGroupImpl withEnableZfs(Boolean enableZfs) {
        this.innerModel().withEnableZfs(enableZfs);
        return this;
    }

    public ServerGroupImpl withEnableShardsOnCoordinator(Boolean enableShardsOnCoordinator) {
        if (isInCreateMode()) {
            this.innerModel().withEnableShardsOnCoordinator(enableShardsOnCoordinator);
            return this;
        } else {
            this.updateParameters.withEnableShardsOnCoordinator(enableShardsOnCoordinator);
            return this;
        }
    }

    public ServerGroupImpl withServerRoleGroups(List<ServerRoleGroup> serverRoleGroups) {
        if (isInCreateMode()) {
            this.innerModel().withServerRoleGroups(serverRoleGroups);
            return this;
        } else {
            this.updateParameters.withServerRoleGroups(serverRoleGroups);
            return this;
        }
    }

    public ServerGroupImpl withMaintenanceWindow(MaintenanceWindow maintenanceWindow) {
        if (isInCreateMode()) {
            this.innerModel().withMaintenanceWindow(maintenanceWindow);
            return this;
        } else {
            this.updateParameters.withMaintenanceWindow(maintenanceWindow);
            return this;
        }
    }

    public ServerGroupImpl withAvailabilityZone(String availabilityZone) {
        if (isInCreateMode()) {
            this.innerModel().withAvailabilityZone(availabilityZone);
            return this;
        } else {
            this.updateParameters.withAvailabilityZone(availabilityZone);
            return this;
        }
    }

    public ServerGroupImpl withStandbyAvailabilityZone(String standbyAvailabilityZone) {
        if (isInCreateMode()) {
            this.innerModel().withStandbyAvailabilityZone(standbyAvailabilityZone);
            return this;
        } else {
            this.updateParameters.withStandbyAvailabilityZone(standbyAvailabilityZone);
            return this;
        }
    }

    public ServerGroupImpl withDelegatedSubnetArguments(
        ServerGroupPropertiesDelegatedSubnetArguments delegatedSubnetArguments) {
        this.innerModel().withDelegatedSubnetArguments(delegatedSubnetArguments);
        return this;
    }

    public ServerGroupImpl withPrivateDnsZoneArguments(
        ServerGroupPropertiesPrivateDnsZoneArguments privateDnsZoneArguments) {
        this.innerModel().withPrivateDnsZoneArguments(privateDnsZoneArguments);
        return this;
    }

    public ServerGroupImpl withSourceSubscriptionId(String sourceSubscriptionId) {
        this.innerModel().withSourceSubscriptionId(sourceSubscriptionId);
        return this;
    }

    public ServerGroupImpl withSourceResourceGroupName(String sourceResourceGroupName) {
        this.innerModel().withSourceResourceGroupName(sourceResourceGroupName);
        return this;
    }

    public ServerGroupImpl withSourceServerGroupName(String sourceServerGroupName) {
        this.innerModel().withSourceServerGroupName(sourceServerGroupName);
        return this;
    }

    public ServerGroupImpl withSourceLocation(String sourceLocation) {
        this.innerModel().withSourceLocation(sourceLocation);
        return this;
    }

    public ServerGroupImpl withPointInTimeUtc(OffsetDateTime pointInTimeUtc) {
        this.innerModel().withPointInTimeUtc(pointInTimeUtc);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
