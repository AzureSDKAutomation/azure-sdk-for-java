/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.DatabaseAccountGetResults;
import rx.Observable;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.DatabaseAccountUpdateParameters;
import java.util.List;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.DatabaseAccountCreateUpdateParameters;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.ApiProperties;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.BackupPolicy;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.Capability;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.ConnectorOffer;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.ConsistencyPolicy;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.CorsPolicy;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.CreateMode;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.DatabaseAccountOfferType;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.FailoverPolicy;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.IpAddressOrRange;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.DatabaseAccountKind;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.Location;
import java.util.ArrayList;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.PrivateEndpointConnection;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.PublicNetworkAccess;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.RestoreParameters;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.SystemData;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.VirtualNetworkRule;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.ManagedServiceIdentity;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.DatabaseAccountCreateUpdateProperties;
import rx.functions.Func1;

class DatabaseAccountGetResultsImpl extends GroupableResourceCoreImpl<DatabaseAccountGetResults, DatabaseAccountGetResultsInner, DatabaseAccountGetResultsImpl, CosmosDBManager> implements DatabaseAccountGetResults, DatabaseAccountGetResults.Definition, DatabaseAccountGetResults.Update {
    private DatabaseAccountCreateUpdateParameters createParameter;
    private DatabaseAccountUpdateParameters updateParameter;
    DatabaseAccountGetResultsImpl(String name, DatabaseAccountGetResultsInner inner, CosmosDBManager manager) {
        super(name, inner, manager);
        this.createParameter = new DatabaseAccountCreateUpdateParameters();
        this.updateParameter = new DatabaseAccountUpdateParameters();
    }

    @Override
    public Observable<DatabaseAccountGetResults> createResourceAsync() {
        DatabaseAccountsInner client = this.manager().inner().databaseAccounts();
        this.createParameter.withLocation(inner().location());
        this.createParameter.withTags(inner().getTags());
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.createParameter)
            .map(new Func1<DatabaseAccountGetResultsInner, DatabaseAccountGetResultsInner>() {
               @Override
               public DatabaseAccountGetResultsInner call(DatabaseAccountGetResultsInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<DatabaseAccountGetResults> updateResourceAsync() {
        DatabaseAccountsInner client = this.manager().inner().databaseAccounts();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<DatabaseAccountGetResultsInner, DatabaseAccountGetResultsInner>() {
               @Override
               public DatabaseAccountGetResultsInner call(DatabaseAccountGetResultsInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<DatabaseAccountGetResultsInner> getInnerAsync() {
        DatabaseAccountsInner client = this.manager().inner().databaseAccounts();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createParameter = new DatabaseAccountCreateUpdateParameters();
        this.updateParameter = new DatabaseAccountUpdateParameters();
    }

    @Override
    public ApiProperties apiProperties() {
        return this.inner().apiProperties();
    }

    @Override
    public BackupPolicy backupPolicy() {
        return this.inner().backupPolicy();
    }

    @Override
    public List<Capability> capabilities() {
        return this.inner().capabilities();
    }

    @Override
    public ConnectorOffer connectorOffer() {
        return this.inner().connectorOffer();
    }

    @Override
    public ConsistencyPolicy consistencyPolicy() {
        return this.inner().consistencyPolicy();
    }

    @Override
    public List<CorsPolicy> cors() {
        return this.inner().cors();
    }

    @Override
    public CreateMode createMode() {
        return this.inner().createMode();
    }

    @Override
    public DatabaseAccountOfferType databaseAccountOfferType() {
        return this.inner().databaseAccountOfferType();
    }

    @Override
    public Boolean disableKeyBasedMetadataWriteAccess() {
        return this.inner().disableKeyBasedMetadataWriteAccess();
    }

    @Override
    public String documentEndpoint() {
        return this.inner().documentEndpoint();
    }

    @Override
    public Boolean enableAnalyticalStorage() {
        return this.inner().enableAnalyticalStorage();
    }

    @Override
    public Boolean enableAutomaticFailover() {
        return this.inner().enableAutomaticFailover();
    }

    @Override
    public Boolean enableCassandraConnector() {
        return this.inner().enableCassandraConnector();
    }

    @Override
    public Boolean enableFreeTier() {
        return this.inner().enableFreeTier();
    }

    @Override
    public Boolean enableMultipleWriteLocations() {
        return this.inner().enableMultipleWriteLocations();
    }

    @Override
    public List<FailoverPolicy> failoverPolicies() {
        return this.inner().failoverPolicies();
    }

    @Override
    public ManagedServiceIdentity identity() {
        return this.inner().identity();
    }

    @Override
    public String instanceId() {
        return this.inner().instanceId();
    }

    @Override
    public List<IpAddressOrRange> ipRules() {
        return this.inner().ipRules();
    }

    @Override
    public Boolean isVirtualNetworkFilterEnabled() {
        return this.inner().isVirtualNetworkFilterEnabled();
    }

    @Override
    public String keyVaultKeyUri() {
        return this.inner().keyVaultKeyUri();
    }

    @Override
    public DatabaseAccountKind kind() {
        return this.inner().kind();
    }

    @Override
    public List<Location> locations() {
        return this.inner().locations();
    }

    @Override
    public List<PrivateEndpointConnection> privateEndpointConnections() {
        List<PrivateEndpointConnection> lst = new ArrayList<PrivateEndpointConnection>();
        if (this.inner().privateEndpointConnections() != null) {
            for (PrivateEndpointConnectionInner inner : this.inner().privateEndpointConnections()) {
                lst.add( new PrivateEndpointConnectionImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public PublicNetworkAccess publicNetworkAccess() {
        return this.inner().publicNetworkAccess();
    }

    @Override
    public List<Location> readLocations() {
        return this.inner().readLocations();
    }

    @Override
    public RestoreParameters restoreParameters() {
        return this.inner().restoreParameters();
    }

    @Override
    public SystemData systemData() {
        return this.inner().systemData();
    }

    @Override
    public List<VirtualNetworkRule> virtualNetworkRules() {
        return this.inner().virtualNetworkRules();
    }

    @Override
    public List<Location> writeLocations() {
        return this.inner().writeLocations();
    }

    @Override
    public DatabaseAccountGetResultsImpl withProperties(DatabaseAccountCreateUpdateProperties properties) {
        this.createParameter.withProperties(properties);
        return this;
    }

    @Override
    public DatabaseAccountGetResultsImpl withKind(DatabaseAccountKind kind) {
        this.createParameter.withKind(kind);
        return this;
    }

    @Override
    public DatabaseAccountGetResultsImpl withApiProperties(ApiProperties apiProperties) {
        this.updateParameter.withApiProperties(apiProperties);
        return this;
    }

    @Override
    public DatabaseAccountGetResultsImpl withBackupPolicy(BackupPolicy backupPolicy) {
        this.updateParameter.withBackupPolicy(backupPolicy);
        return this;
    }

    @Override
    public DatabaseAccountGetResultsImpl withCapabilities(List<Capability> capabilities) {
        this.updateParameter.withCapabilities(capabilities);
        return this;
    }

    @Override
    public DatabaseAccountGetResultsImpl withConnectorOffer(ConnectorOffer connectorOffer) {
        this.updateParameter.withConnectorOffer(connectorOffer);
        return this;
    }

    @Override
    public DatabaseAccountGetResultsImpl withConsistencyPolicy(ConsistencyPolicy consistencyPolicy) {
        this.updateParameter.withConsistencyPolicy(consistencyPolicy);
        return this;
    }

    @Override
    public DatabaseAccountGetResultsImpl withCors(List<CorsPolicy> cors) {
        this.updateParameter.withCors(cors);
        return this;
    }

    @Override
    public DatabaseAccountGetResultsImpl withDisableKeyBasedMetadataWriteAccess(Boolean disableKeyBasedMetadataWriteAccess) {
        this.updateParameter.withDisableKeyBasedMetadataWriteAccess(disableKeyBasedMetadataWriteAccess);
        return this;
    }

    @Override
    public DatabaseAccountGetResultsImpl withEnableAnalyticalStorage(Boolean enableAnalyticalStorage) {
        this.updateParameter.withEnableAnalyticalStorage(enableAnalyticalStorage);
        return this;
    }

    @Override
    public DatabaseAccountGetResultsImpl withEnableAutomaticFailover(Boolean enableAutomaticFailover) {
        this.updateParameter.withEnableAutomaticFailover(enableAutomaticFailover);
        return this;
    }

    @Override
    public DatabaseAccountGetResultsImpl withEnableCassandraConnector(Boolean enableCassandraConnector) {
        this.updateParameter.withEnableCassandraConnector(enableCassandraConnector);
        return this;
    }

    @Override
    public DatabaseAccountGetResultsImpl withEnableFreeTier(Boolean enableFreeTier) {
        this.updateParameter.withEnableFreeTier(enableFreeTier);
        return this;
    }

    @Override
    public DatabaseAccountGetResultsImpl withEnableMultipleWriteLocations(Boolean enableMultipleWriteLocations) {
        this.updateParameter.withEnableMultipleWriteLocations(enableMultipleWriteLocations);
        return this;
    }

    @Override
    public DatabaseAccountGetResultsImpl withIpRules(List<IpAddressOrRange> ipRules) {
        this.updateParameter.withIpRules(ipRules);
        return this;
    }

    @Override
    public DatabaseAccountGetResultsImpl withIsVirtualNetworkFilterEnabled(Boolean isVirtualNetworkFilterEnabled) {
        this.updateParameter.withIsVirtualNetworkFilterEnabled(isVirtualNetworkFilterEnabled);
        return this;
    }

    @Override
    public DatabaseAccountGetResultsImpl withKeyVaultKeyUri(String keyVaultKeyUri) {
        this.updateParameter.withKeyVaultKeyUri(keyVaultKeyUri);
        return this;
    }

    @Override
    public DatabaseAccountGetResultsImpl withLocations(List<Location> locations) {
        this.updateParameter.withLocations(locations);
        return this;
    }

    @Override
    public DatabaseAccountGetResultsImpl withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.updateParameter.withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    @Override
    public DatabaseAccountGetResultsImpl withVirtualNetworkRules(List<VirtualNetworkRule> virtualNetworkRules) {
        this.updateParameter.withVirtualNetworkRules(virtualNetworkRules);
        return this;
    }

    @Override
    public DatabaseAccountGetResultsImpl withIdentity(ManagedServiceIdentity identity) {
        if (isInCreateMode()) {
            this.createParameter.withIdentity(identity);
        } else {
            this.updateParameter.withIdentity(identity);
        }
        return this;
    }

}
