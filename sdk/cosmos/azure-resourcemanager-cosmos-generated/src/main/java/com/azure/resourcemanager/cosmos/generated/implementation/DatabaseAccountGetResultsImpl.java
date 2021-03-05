// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cosmos.generated.CosmosDBManager;
import com.azure.resourcemanager.cosmos.generated.fluent.models.DatabaseAccountGetResultsInner;
import com.azure.resourcemanager.cosmos.generated.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.cosmos.generated.models.ApiProperties;
import com.azure.resourcemanager.cosmos.generated.models.BackupPolicy;
import com.azure.resourcemanager.cosmos.generated.models.Capability;
import com.azure.resourcemanager.cosmos.generated.models.ConnectorOffer;
import com.azure.resourcemanager.cosmos.generated.models.ConsistencyPolicy;
import com.azure.resourcemanager.cosmos.generated.models.CorsPolicy;
import com.azure.resourcemanager.cosmos.generated.models.CreateMode;
import com.azure.resourcemanager.cosmos.generated.models.DatabaseAccountCreateUpdateParameters;
import com.azure.resourcemanager.cosmos.generated.models.DatabaseAccountCreateUpdateProperties;
import com.azure.resourcemanager.cosmos.generated.models.DatabaseAccountGetResults;
import com.azure.resourcemanager.cosmos.generated.models.DatabaseAccountKind;
import com.azure.resourcemanager.cosmos.generated.models.DatabaseAccountListConnectionStringsResult;
import com.azure.resourcemanager.cosmos.generated.models.DatabaseAccountListKeysResult;
import com.azure.resourcemanager.cosmos.generated.models.DatabaseAccountListReadOnlyKeysResult;
import com.azure.resourcemanager.cosmos.generated.models.DatabaseAccountOfferType;
import com.azure.resourcemanager.cosmos.generated.models.DatabaseAccountRegenerateKeyParameters;
import com.azure.resourcemanager.cosmos.generated.models.DatabaseAccountUpdateParameters;
import com.azure.resourcemanager.cosmos.generated.models.FailoverPolicies;
import com.azure.resourcemanager.cosmos.generated.models.FailoverPolicy;
import com.azure.resourcemanager.cosmos.generated.models.IpAddressOrRange;
import com.azure.resourcemanager.cosmos.generated.models.Location;
import com.azure.resourcemanager.cosmos.generated.models.ManagedServiceIdentity;
import com.azure.resourcemanager.cosmos.generated.models.NetworkAclBypass;
import com.azure.resourcemanager.cosmos.generated.models.PrivateEndpointConnection;
import com.azure.resourcemanager.cosmos.generated.models.PublicNetworkAccess;
import com.azure.resourcemanager.cosmos.generated.models.RegionForOnlineOffline;
import com.azure.resourcemanager.cosmos.generated.models.RestoreParameters;
import com.azure.resourcemanager.cosmos.generated.models.SystemData;
import com.azure.resourcemanager.cosmos.generated.models.VirtualNetworkRule;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class DatabaseAccountGetResultsImpl
    implements DatabaseAccountGetResults, DatabaseAccountGetResults.Definition, DatabaseAccountGetResults.Update {
    private DatabaseAccountGetResultsInner innerObject;

    private final CosmosDBManager serviceManager;

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

    public ManagedServiceIdentity identity() {
        return this.innerModel().identity();
    }

    public DatabaseAccountKind kind() {
        return this.innerModel().kind();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String documentEndpoint() {
        return this.innerModel().documentEndpoint();
    }

    public DatabaseAccountOfferType databaseAccountOfferType() {
        return this.innerModel().databaseAccountOfferType();
    }

    public List<IpAddressOrRange> ipRules() {
        List<IpAddressOrRange> inner = this.innerModel().ipRules();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Boolean isVirtualNetworkFilterEnabled() {
        return this.innerModel().isVirtualNetworkFilterEnabled();
    }

    public Boolean enableAutomaticFailover() {
        return this.innerModel().enableAutomaticFailover();
    }

    public ConsistencyPolicy consistencyPolicy() {
        return this.innerModel().consistencyPolicy();
    }

    public List<Capability> capabilities() {
        List<Capability> inner = this.innerModel().capabilities();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<Location> writeLocations() {
        List<Location> inner = this.innerModel().writeLocations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<Location> readLocations() {
        List<Location> inner = this.innerModel().readLocations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<Location> locations() {
        List<Location> inner = this.innerModel().locations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<FailoverPolicy> failoverPolicies() {
        List<FailoverPolicy> inner = this.innerModel().failoverPolicies();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<VirtualNetworkRule> virtualNetworkRules() {
        List<VirtualNetworkRule> inner = this.innerModel().virtualNetworkRules();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<PrivateEndpointConnection> privateEndpointConnections() {
        List<PrivateEndpointConnectionInner> inner = this.innerModel().privateEndpointConnections();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public Boolean enableMultipleWriteLocations() {
        return this.innerModel().enableMultipleWriteLocations();
    }

    public Boolean enableCassandraConnector() {
        return this.innerModel().enableCassandraConnector();
    }

    public ConnectorOffer connectorOffer() {
        return this.innerModel().connectorOffer();
    }

    public Boolean disableKeyBasedMetadataWriteAccess() {
        return this.innerModel().disableKeyBasedMetadataWriteAccess();
    }

    public String keyVaultKeyUri() {
        return this.innerModel().keyVaultKeyUri();
    }

    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerModel().publicNetworkAccess();
    }

    public Boolean enableFreeTier() {
        return this.innerModel().enableFreeTier();
    }

    public ApiProperties apiProperties() {
        return this.innerModel().apiProperties();
    }

    public Boolean enableAnalyticalStorage() {
        return this.innerModel().enableAnalyticalStorage();
    }

    public String instanceId() {
        return this.innerModel().instanceId();
    }

    public CreateMode createMode() {
        return this.innerModel().createMode();
    }

    public RestoreParameters restoreParameters() {
        return this.innerModel().restoreParameters();
    }

    public BackupPolicy backupPolicy() {
        return this.innerModel().backupPolicy();
    }

    public List<CorsPolicy> cors() {
        List<CorsPolicy> inner = this.innerModel().cors();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public NetworkAclBypass networkAclBypass() {
        return this.innerModel().networkAclBypass();
    }

    public List<String> networkAclBypassResourceIds() {
        List<String> inner = this.innerModel().networkAclBypassResourceIds();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public DatabaseAccountGetResultsInner innerModel() {
        return this.innerObject;
    }

    private CosmosDBManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private DatabaseAccountCreateUpdateParameters createCreateUpdateParameters;

    private DatabaseAccountUpdateParameters updateUpdateParameters;

    public DatabaseAccountGetResultsImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public DatabaseAccountGetResults create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabaseAccounts()
                .createOrUpdate(resourceGroupName, accountName, createCreateUpdateParameters, Context.NONE);
        return this;
    }

    public DatabaseAccountGetResults create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabaseAccounts()
                .createOrUpdate(resourceGroupName, accountName, createCreateUpdateParameters, context);
        return this;
    }

    DatabaseAccountGetResultsImpl(String name, CosmosDBManager serviceManager) {
        this.innerObject = new DatabaseAccountGetResultsInner();
        this.serviceManager = serviceManager;
        this.accountName = name;
        this.createCreateUpdateParameters = new DatabaseAccountCreateUpdateParameters();
    }

    public DatabaseAccountGetResultsImpl update() {
        this.updateUpdateParameters = new DatabaseAccountUpdateParameters();
        return this;
    }

    public DatabaseAccountGetResults apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabaseAccounts()
                .update(resourceGroupName, accountName, updateUpdateParameters, Context.NONE);
        return this;
    }

    public DatabaseAccountGetResults apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabaseAccounts()
                .update(resourceGroupName, accountName, updateUpdateParameters, context);
        return this;
    }

    DatabaseAccountGetResultsImpl(DatabaseAccountGetResultsInner innerObject, CosmosDBManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "databaseAccounts");
    }

    public DatabaseAccountGetResults refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabaseAccounts()
                .getByResourceGroupWithResponse(resourceGroupName, accountName, Context.NONE)
                .getValue();
        return this;
    }

    public DatabaseAccountGetResults refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabaseAccounts()
                .getByResourceGroupWithResponse(resourceGroupName, accountName, context)
                .getValue();
        return this;
    }

    public void failoverPriorityChange(FailoverPolicies failoverParameters) {
        serviceManager.databaseAccounts().failoverPriorityChange(resourceGroupName, accountName, failoverParameters);
    }

    public void failoverPriorityChange(FailoverPolicies failoverParameters, Context context) {
        serviceManager
            .databaseAccounts()
            .failoverPriorityChange(resourceGroupName, accountName, failoverParameters, context);
    }

    public DatabaseAccountListKeysResult listKeys() {
        return serviceManager.databaseAccounts().listKeys(resourceGroupName, accountName);
    }

    public Response<DatabaseAccountListKeysResult> listKeysWithResponse(Context context) {
        return serviceManager.databaseAccounts().listKeysWithResponse(resourceGroupName, accountName, context);
    }

    public DatabaseAccountListConnectionStringsResult listConnectionStrings() {
        return serviceManager.databaseAccounts().listConnectionStrings(resourceGroupName, accountName);
    }

    public Response<DatabaseAccountListConnectionStringsResult> listConnectionStringsWithResponse(Context context) {
        return serviceManager
            .databaseAccounts()
            .listConnectionStringsWithResponse(resourceGroupName, accountName, context);
    }

    public void offlineRegion(RegionForOnlineOffline regionParameterForOffline) {
        serviceManager.databaseAccounts().offlineRegion(resourceGroupName, accountName, regionParameterForOffline);
    }

    public void offlineRegion(RegionForOnlineOffline regionParameterForOffline, Context context) {
        serviceManager
            .databaseAccounts()
            .offlineRegion(resourceGroupName, accountName, regionParameterForOffline, context);
    }

    public void onlineRegion(RegionForOnlineOffline regionParameterForOnline) {
        serviceManager.databaseAccounts().onlineRegion(resourceGroupName, accountName, regionParameterForOnline);
    }

    public void onlineRegion(RegionForOnlineOffline regionParameterForOnline, Context context) {
        serviceManager
            .databaseAccounts()
            .onlineRegion(resourceGroupName, accountName, regionParameterForOnline, context);
    }

    public DatabaseAccountListReadOnlyKeysResult listReadOnlyKeys() {
        return serviceManager.databaseAccounts().listReadOnlyKeys(resourceGroupName, accountName);
    }

    public Response<DatabaseAccountListReadOnlyKeysResult> listReadOnlyKeysWithResponse(Context context) {
        return serviceManager.databaseAccounts().listReadOnlyKeysWithResponse(resourceGroupName, accountName, context);
    }

    public void regenerateKey(DatabaseAccountRegenerateKeyParameters keyToRegenerate) {
        serviceManager.databaseAccounts().regenerateKey(resourceGroupName, accountName, keyToRegenerate);
    }

    public void regenerateKey(DatabaseAccountRegenerateKeyParameters keyToRegenerate, Context context) {
        serviceManager.databaseAccounts().regenerateKey(resourceGroupName, accountName, keyToRegenerate, context);
    }

    public DatabaseAccountGetResultsImpl withRegion(Region location) {
        this.createCreateUpdateParameters.withLocation(location.toString());
        return this;
    }

    public DatabaseAccountGetResultsImpl withRegion(String location) {
        this.createCreateUpdateParameters.withLocation(location);
        return this;
    }

    public DatabaseAccountGetResultsImpl withProperties(DatabaseAccountCreateUpdateProperties properties) {
        this.createCreateUpdateParameters.withProperties(properties);
        return this;
    }

    public DatabaseAccountGetResultsImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.createCreateUpdateParameters.withTags(tags);
            return this;
        } else {
            this.updateUpdateParameters.withTags(tags);
            return this;
        }
    }

    public DatabaseAccountGetResultsImpl withIdentity(ManagedServiceIdentity identity) {
        if (isInCreateMode()) {
            this.createCreateUpdateParameters.withIdentity(identity);
            return this;
        } else {
            this.updateUpdateParameters.withIdentity(identity);
            return this;
        }
    }

    public DatabaseAccountGetResultsImpl withKind(DatabaseAccountKind kind) {
        this.createCreateUpdateParameters.withKind(kind);
        return this;
    }

    public DatabaseAccountGetResultsImpl withConsistencyPolicy(ConsistencyPolicy consistencyPolicy) {
        this.updateUpdateParameters.withConsistencyPolicy(consistencyPolicy);
        return this;
    }

    public DatabaseAccountGetResultsImpl withLocations(List<Location> locations) {
        this.updateUpdateParameters.withLocations(locations);
        return this;
    }

    public DatabaseAccountGetResultsImpl withIpRules(List<IpAddressOrRange> ipRules) {
        this.updateUpdateParameters.withIpRules(ipRules);
        return this;
    }

    public DatabaseAccountGetResultsImpl withIsVirtualNetworkFilterEnabled(Boolean isVirtualNetworkFilterEnabled) {
        this.updateUpdateParameters.withIsVirtualNetworkFilterEnabled(isVirtualNetworkFilterEnabled);
        return this;
    }

    public DatabaseAccountGetResultsImpl withEnableAutomaticFailover(Boolean enableAutomaticFailover) {
        this.updateUpdateParameters.withEnableAutomaticFailover(enableAutomaticFailover);
        return this;
    }

    public DatabaseAccountGetResultsImpl withCapabilities(List<Capability> capabilities) {
        this.updateUpdateParameters.withCapabilities(capabilities);
        return this;
    }

    public DatabaseAccountGetResultsImpl withVirtualNetworkRules(List<VirtualNetworkRule> virtualNetworkRules) {
        this.updateUpdateParameters.withVirtualNetworkRules(virtualNetworkRules);
        return this;
    }

    public DatabaseAccountGetResultsImpl withEnableMultipleWriteLocations(Boolean enableMultipleWriteLocations) {
        this.updateUpdateParameters.withEnableMultipleWriteLocations(enableMultipleWriteLocations);
        return this;
    }

    public DatabaseAccountGetResultsImpl withEnableCassandraConnector(Boolean enableCassandraConnector) {
        this.updateUpdateParameters.withEnableCassandraConnector(enableCassandraConnector);
        return this;
    }

    public DatabaseAccountGetResultsImpl withConnectorOffer(ConnectorOffer connectorOffer) {
        this.updateUpdateParameters.withConnectorOffer(connectorOffer);
        return this;
    }

    public DatabaseAccountGetResultsImpl withDisableKeyBasedMetadataWriteAccess(
        Boolean disableKeyBasedMetadataWriteAccess) {
        this.updateUpdateParameters.withDisableKeyBasedMetadataWriteAccess(disableKeyBasedMetadataWriteAccess);
        return this;
    }

    public DatabaseAccountGetResultsImpl withKeyVaultKeyUri(String keyVaultKeyUri) {
        this.updateUpdateParameters.withKeyVaultKeyUri(keyVaultKeyUri);
        return this;
    }

    public DatabaseAccountGetResultsImpl withEnableFreeTier(Boolean enableFreeTier) {
        this.updateUpdateParameters.withEnableFreeTier(enableFreeTier);
        return this;
    }

    public DatabaseAccountGetResultsImpl withApiProperties(ApiProperties apiProperties) {
        this.updateUpdateParameters.withApiProperties(apiProperties);
        return this;
    }

    public DatabaseAccountGetResultsImpl withEnableAnalyticalStorage(Boolean enableAnalyticalStorage) {
        this.updateUpdateParameters.withEnableAnalyticalStorage(enableAnalyticalStorage);
        return this;
    }

    public DatabaseAccountGetResultsImpl withBackupPolicy(BackupPolicy backupPolicy) {
        this.updateUpdateParameters.withBackupPolicy(backupPolicy);
        return this;
    }

    public DatabaseAccountGetResultsImpl withCors(List<CorsPolicy> cors) {
        this.updateUpdateParameters.withCors(cors);
        return this;
    }

    public DatabaseAccountGetResultsImpl withNetworkAclBypass(NetworkAclBypass networkAclBypass) {
        this.updateUpdateParameters.withNetworkAclBypass(networkAclBypass);
        return this;
    }

    public DatabaseAccountGetResultsImpl withNetworkAclBypassResourceIds(List<String> networkAclBypassResourceIds) {
        this.updateUpdateParameters.withNetworkAclBypassResourceIds(networkAclBypassResourceIds);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
