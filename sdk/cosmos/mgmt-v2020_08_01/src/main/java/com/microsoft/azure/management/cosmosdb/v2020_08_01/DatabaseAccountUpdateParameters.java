/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_08_01;

import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Parameters for patching Azure Cosmos DB database account properties.
 */
@JsonFlatten
public class DatabaseAccountUpdateParameters {
    /**
     * The tags property.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * The location of the resource group to which the resource belongs.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * The consistency policy for the Cosmos DB account.
     */
    @JsonProperty(value = "properties.consistencyPolicy")
    private ConsistencyPolicy consistencyPolicy;

    /**
     * An array that contains the georeplication locations enabled for the
     * Cosmos DB account.
     */
    @JsonProperty(value = "properties.locations")
    private List<Location> locations;

    /**
     * List of IpRules.
     */
    @JsonProperty(value = "properties.ipRules")
    private List<IpAddressOrRange> ipRules;

    /**
     * Flag to indicate whether to enable/disable Virtual Network ACL rules.
     */
    @JsonProperty(value = "properties.isVirtualNetworkFilterEnabled")
    private Boolean isVirtualNetworkFilterEnabled;

    /**
     * Enables automatic failover of the write region in the rare event that
     * the region is unavailable due to an outage. Automatic failover will
     * result in a new write region for the account and is chosen based on the
     * failover priorities configured for the account.
     */
    @JsonProperty(value = "properties.enableAutomaticFailover")
    private Boolean enableAutomaticFailover;

    /**
     * List of Cosmos DB capabilities for the account.
     */
    @JsonProperty(value = "properties.capabilities")
    private List<Capability> capabilities;

    /**
     * List of Virtual Network ACL rules configured for the Cosmos DB account.
     */
    @JsonProperty(value = "properties.virtualNetworkRules")
    private List<VirtualNetworkRule> virtualNetworkRules;

    /**
     * Enables the account to write in multiple locations.
     */
    @JsonProperty(value = "properties.enableMultipleWriteLocations")
    private Boolean enableMultipleWriteLocations;

    /**
     * Enables the cassandra connector on the Cosmos DB C* account.
     */
    @JsonProperty(value = "properties.enableCassandraConnector")
    private Boolean enableCassandraConnector;

    /**
     * The cassandra connector offer type for the Cosmos DB database C*
     * account. Possible values include: 'Small'.
     */
    @JsonProperty(value = "properties.connectorOffer")
    private ConnectorOffer connectorOffer;

    /**
     * Disable write operations on metadata resources (databases, containers,
     * throughput) via account keys.
     */
    @JsonProperty(value = "properties.disableKeyBasedMetadataWriteAccess")
    private Boolean disableKeyBasedMetadataWriteAccess;

    /**
     * The URI of the key vault.
     */
    @JsonProperty(value = "properties.keyVaultKeyUri")
    private String keyVaultKeyUri;

    /**
     * Whether requests from Public Network are allowed. Possible values
     * include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "properties.publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /**
     * Flag to indicate whether Free Tier is enabled.
     */
    @JsonProperty(value = "properties.enableFreeTier")
    private Boolean enableFreeTier;

    /**
     * API specific properties. Currently, supported only for MongoDB API.
     */
    @JsonProperty(value = "properties.apiProperties")
    private ApiProperties apiProperties;

    /**
     * Flag to indicate whether to enable storage analytics.
     */
    @JsonProperty(value = "properties.enableAnalyticalStorage")
    private Boolean enableAnalyticalStorage;

    /**
     * The CORS policy for the Cosmos DB database account.
     */
    @JsonProperty(value = "properties.cors")
    private List<CorsPolicy> cors;

    /**
     * The identity property.
     */
    @JsonProperty(value = "identity")
    private ManagedServiceIdentity identity;

    /**
     * Get the tags value.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags value.
     *
     * @param tags the tags value to set
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the location of the resource group to which the resource belongs.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location of the resource group to which the resource belongs.
     *
     * @param location the location value to set
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the consistency policy for the Cosmos DB account.
     *
     * @return the consistencyPolicy value
     */
    public ConsistencyPolicy consistencyPolicy() {
        return this.consistencyPolicy;
    }

    /**
     * Set the consistency policy for the Cosmos DB account.
     *
     * @param consistencyPolicy the consistencyPolicy value to set
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withConsistencyPolicy(ConsistencyPolicy consistencyPolicy) {
        this.consistencyPolicy = consistencyPolicy;
        return this;
    }

    /**
     * Get an array that contains the georeplication locations enabled for the Cosmos DB account.
     *
     * @return the locations value
     */
    public List<Location> locations() {
        return this.locations;
    }

    /**
     * Set an array that contains the georeplication locations enabled for the Cosmos DB account.
     *
     * @param locations the locations value to set
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withLocations(List<Location> locations) {
        this.locations = locations;
        return this;
    }

    /**
     * Get list of IpRules.
     *
     * @return the ipRules value
     */
    public List<IpAddressOrRange> ipRules() {
        return this.ipRules;
    }

    /**
     * Set list of IpRules.
     *
     * @param ipRules the ipRules value to set
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withIpRules(List<IpAddressOrRange> ipRules) {
        this.ipRules = ipRules;
        return this;
    }

    /**
     * Get flag to indicate whether to enable/disable Virtual Network ACL rules.
     *
     * @return the isVirtualNetworkFilterEnabled value
     */
    public Boolean isVirtualNetworkFilterEnabled() {
        return this.isVirtualNetworkFilterEnabled;
    }

    /**
     * Set flag to indicate whether to enable/disable Virtual Network ACL rules.
     *
     * @param isVirtualNetworkFilterEnabled the isVirtualNetworkFilterEnabled value to set
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withIsVirtualNetworkFilterEnabled(Boolean isVirtualNetworkFilterEnabled) {
        this.isVirtualNetworkFilterEnabled = isVirtualNetworkFilterEnabled;
        return this;
    }

    /**
     * Get enables automatic failover of the write region in the rare event that the region is unavailable due to an outage. Automatic failover will result in a new write region for the account and is chosen based on the failover priorities configured for the account.
     *
     * @return the enableAutomaticFailover value
     */
    public Boolean enableAutomaticFailover() {
        return this.enableAutomaticFailover;
    }

    /**
     * Set enables automatic failover of the write region in the rare event that the region is unavailable due to an outage. Automatic failover will result in a new write region for the account and is chosen based on the failover priorities configured for the account.
     *
     * @param enableAutomaticFailover the enableAutomaticFailover value to set
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withEnableAutomaticFailover(Boolean enableAutomaticFailover) {
        this.enableAutomaticFailover = enableAutomaticFailover;
        return this;
    }

    /**
     * Get list of Cosmos DB capabilities for the account.
     *
     * @return the capabilities value
     */
    public List<Capability> capabilities() {
        return this.capabilities;
    }

    /**
     * Set list of Cosmos DB capabilities for the account.
     *
     * @param capabilities the capabilities value to set
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withCapabilities(List<Capability> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Get list of Virtual Network ACL rules configured for the Cosmos DB account.
     *
     * @return the virtualNetworkRules value
     */
    public List<VirtualNetworkRule> virtualNetworkRules() {
        return this.virtualNetworkRules;
    }

    /**
     * Set list of Virtual Network ACL rules configured for the Cosmos DB account.
     *
     * @param virtualNetworkRules the virtualNetworkRules value to set
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withVirtualNetworkRules(List<VirtualNetworkRule> virtualNetworkRules) {
        this.virtualNetworkRules = virtualNetworkRules;
        return this;
    }

    /**
     * Get enables the account to write in multiple locations.
     *
     * @return the enableMultipleWriteLocations value
     */
    public Boolean enableMultipleWriteLocations() {
        return this.enableMultipleWriteLocations;
    }

    /**
     * Set enables the account to write in multiple locations.
     *
     * @param enableMultipleWriteLocations the enableMultipleWriteLocations value to set
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withEnableMultipleWriteLocations(Boolean enableMultipleWriteLocations) {
        this.enableMultipleWriteLocations = enableMultipleWriteLocations;
        return this;
    }

    /**
     * Get enables the cassandra connector on the Cosmos DB C* account.
     *
     * @return the enableCassandraConnector value
     */
    public Boolean enableCassandraConnector() {
        return this.enableCassandraConnector;
    }

    /**
     * Set enables the cassandra connector on the Cosmos DB C* account.
     *
     * @param enableCassandraConnector the enableCassandraConnector value to set
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withEnableCassandraConnector(Boolean enableCassandraConnector) {
        this.enableCassandraConnector = enableCassandraConnector;
        return this;
    }

    /**
     * Get the cassandra connector offer type for the Cosmos DB database C* account. Possible values include: 'Small'.
     *
     * @return the connectorOffer value
     */
    public ConnectorOffer connectorOffer() {
        return this.connectorOffer;
    }

    /**
     * Set the cassandra connector offer type for the Cosmos DB database C* account. Possible values include: 'Small'.
     *
     * @param connectorOffer the connectorOffer value to set
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withConnectorOffer(ConnectorOffer connectorOffer) {
        this.connectorOffer = connectorOffer;
        return this;
    }

    /**
     * Get disable write operations on metadata resources (databases, containers, throughput) via account keys.
     *
     * @return the disableKeyBasedMetadataWriteAccess value
     */
    public Boolean disableKeyBasedMetadataWriteAccess() {
        return this.disableKeyBasedMetadataWriteAccess;
    }

    /**
     * Set disable write operations on metadata resources (databases, containers, throughput) via account keys.
     *
     * @param disableKeyBasedMetadataWriteAccess the disableKeyBasedMetadataWriteAccess value to set
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withDisableKeyBasedMetadataWriteAccess(Boolean disableKeyBasedMetadataWriteAccess) {
        this.disableKeyBasedMetadataWriteAccess = disableKeyBasedMetadataWriteAccess;
        return this;
    }

    /**
     * Get the URI of the key vault.
     *
     * @return the keyVaultKeyUri value
     */
    public String keyVaultKeyUri() {
        return this.keyVaultKeyUri;
    }

    /**
     * Set the URI of the key vault.
     *
     * @param keyVaultKeyUri the keyVaultKeyUri value to set
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withKeyVaultKeyUri(String keyVaultKeyUri) {
        this.keyVaultKeyUri = keyVaultKeyUri;
        return this;
    }

    /**
     * Get whether requests from Public Network are allowed. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the publicNetworkAccess value
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set whether requests from Public Network are allowed. Possible values include: 'Enabled', 'Disabled'.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get flag to indicate whether Free Tier is enabled.
     *
     * @return the enableFreeTier value
     */
    public Boolean enableFreeTier() {
        return this.enableFreeTier;
    }

    /**
     * Set flag to indicate whether Free Tier is enabled.
     *
     * @param enableFreeTier the enableFreeTier value to set
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withEnableFreeTier(Boolean enableFreeTier) {
        this.enableFreeTier = enableFreeTier;
        return this;
    }

    /**
     * Get aPI specific properties. Currently, supported only for MongoDB API.
     *
     * @return the apiProperties value
     */
    public ApiProperties apiProperties() {
        return this.apiProperties;
    }

    /**
     * Set aPI specific properties. Currently, supported only for MongoDB API.
     *
     * @param apiProperties the apiProperties value to set
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withApiProperties(ApiProperties apiProperties) {
        this.apiProperties = apiProperties;
        return this;
    }

    /**
     * Get flag to indicate whether to enable storage analytics.
     *
     * @return the enableAnalyticalStorage value
     */
    public Boolean enableAnalyticalStorage() {
        return this.enableAnalyticalStorage;
    }

    /**
     * Set flag to indicate whether to enable storage analytics.
     *
     * @param enableAnalyticalStorage the enableAnalyticalStorage value to set
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withEnableAnalyticalStorage(Boolean enableAnalyticalStorage) {
        this.enableAnalyticalStorage = enableAnalyticalStorage;
        return this;
    }

    /**
     * Get the CORS policy for the Cosmos DB database account.
     *
     * @return the cors value
     */
    public List<CorsPolicy> cors() {
        return this.cors;
    }

    /**
     * Set the CORS policy for the Cosmos DB database account.
     *
     * @param cors the cors value to set
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withCors(List<CorsPolicy> cors) {
        this.cors = cors;
        return this;
    }

    /**
     * Get the identity value.
     *
     * @return the identity value
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity value.
     *
     * @param identity the identity value to set
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

}
