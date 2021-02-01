// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cosmos.generated.fluent.models.DatabaseAccountGetResultsInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of DatabaseAccountGetResults. */
public interface DatabaseAccountGetResults {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the kind property: Indicates the type of database account. This can only be set at database account
     * creation.
     *
     * @return the kind value.
     */
    DatabaseAccountKind kind();

    /**
     * Gets the provisioningState property: The status of the Cosmos DB account at the time the operation was called.
     * The status can be one of following. 'Creating' – the Cosmos DB account is being created. When an account is in
     * Creating state, only properties that are specified as input for the Create Cosmos DB account operation are
     * returned. 'Succeeded' – the Cosmos DB account is active for use. 'Updating' – the Cosmos DB account is being
     * updated. 'Deleting' – the Cosmos DB account is being deleted. 'Failed' – the Cosmos DB account failed creation.
     * 'DeletionFailed' – the Cosmos DB account deletion failed.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the documentEndpoint property: The connection endpoint for the Cosmos DB database account.
     *
     * @return the documentEndpoint value.
     */
    String documentEndpoint();

    /**
     * Gets the databaseAccountOfferType property: The offer type for the Cosmos DB database account. Default value:
     * Standard.
     *
     * @return the databaseAccountOfferType value.
     */
    DatabaseAccountOfferType databaseAccountOfferType();

    /**
     * Gets the ipRules property: List of IpRules.
     *
     * @return the ipRules value.
     */
    List<IpAddressOrRange> ipRules();

    /**
     * Gets the isVirtualNetworkFilterEnabled property: Flag to indicate whether to enable/disable Virtual Network ACL
     * rules.
     *
     * @return the isVirtualNetworkFilterEnabled value.
     */
    Boolean isVirtualNetworkFilterEnabled();

    /**
     * Gets the enableAutomaticFailover property: Enables automatic failover of the write region in the rare event that
     * the region is unavailable due to an outage. Automatic failover will result in a new write region for the account
     * and is chosen based on the failover priorities configured for the account.
     *
     * @return the enableAutomaticFailover value.
     */
    Boolean enableAutomaticFailover();

    /**
     * Gets the consistencyPolicy property: The consistency policy for the Cosmos DB database account.
     *
     * @return the consistencyPolicy value.
     */
    ConsistencyPolicy consistencyPolicy();

    /**
     * Gets the capabilities property: List of Cosmos DB capabilities for the account.
     *
     * @return the capabilities value.
     */
    List<Capability> capabilities();

    /**
     * Gets the writeLocations property: An array that contains the write location for the Cosmos DB account.
     *
     * @return the writeLocations value.
     */
    List<Location> writeLocations();

    /**
     * Gets the readLocations property: An array that contains of the read locations enabled for the Cosmos DB account.
     *
     * @return the readLocations value.
     */
    List<Location> readLocations();

    /**
     * Gets the locations property: An array that contains all of the locations enabled for the Cosmos DB account.
     *
     * @return the locations value.
     */
    List<Location> locations();

    /**
     * Gets the failoverPolicies property: An array that contains the regions ordered by their failover priorities.
     *
     * @return the failoverPolicies value.
     */
    List<FailoverPolicy> failoverPolicies();

    /**
     * Gets the virtualNetworkRules property: List of Virtual Network ACL rules configured for the Cosmos DB account.
     *
     * @return the virtualNetworkRules value.
     */
    List<VirtualNetworkRule> virtualNetworkRules();

    /**
     * Gets the privateEndpointConnections property: List of Private Endpoint Connections configured for the Cosmos DB
     * account.
     *
     * @return the privateEndpointConnections value.
     */
    List<PrivateEndpointConnection> privateEndpointConnections();

    /**
     * Gets the enableMultipleWriteLocations property: Enables the account to write in multiple locations.
     *
     * @return the enableMultipleWriteLocations value.
     */
    Boolean enableMultipleWriteLocations();

    /**
     * Gets the enableCassandraConnector property: Enables the cassandra connector on the Cosmos DB C* account.
     *
     * @return the enableCassandraConnector value.
     */
    Boolean enableCassandraConnector();

    /**
     * Gets the connectorOffer property: The cassandra connector offer type for the Cosmos DB database C* account.
     *
     * @return the connectorOffer value.
     */
    ConnectorOffer connectorOffer();

    /**
     * Gets the disableKeyBasedMetadataWriteAccess property: Disable write operations on metadata resources (databases,
     * containers, throughput) via account keys.
     *
     * @return the disableKeyBasedMetadataWriteAccess value.
     */
    Boolean disableKeyBasedMetadataWriteAccess();

    /**
     * Gets the keyVaultKeyUri property: The URI of the key vault.
     *
     * @return the keyVaultKeyUri value.
     */
    String keyVaultKeyUri();

    /**
     * Gets the publicNetworkAccess property: Whether requests from Public Network are allowed.
     *
     * @return the publicNetworkAccess value.
     */
    PublicNetworkAccess publicNetworkAccess();

    /**
     * Gets the enableFreeTier property: Flag to indicate whether Free Tier is enabled.
     *
     * @return the enableFreeTier value.
     */
    Boolean enableFreeTier();

    /**
     * Gets the apiProperties property: API specific properties.
     *
     * @return the apiProperties value.
     */
    ApiProperties apiProperties();

    /**
     * Gets the enableAnalyticalStorage property: Flag to indicate whether to enable storage analytics.
     *
     * @return the enableAnalyticalStorage value.
     */
    Boolean enableAnalyticalStorage();

    /**
     * Gets the backupPolicy property: The object representing the policy for taking backups on an account.
     *
     * @return the backupPolicy value.
     */
    BackupPolicy backupPolicy();

    /**
     * Gets the cors property: The CORS policy for the Cosmos DB database account.
     *
     * @return the cors value.
     */
    List<CorsPolicy> cors();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.cosmos.generated.fluent.models.DatabaseAccountGetResultsInner object.
     *
     * @return the inner object.
     */
    DatabaseAccountGetResultsInner innerModel();

    /** The entirety of the DatabaseAccountGetResults definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithLocations,
            DefinitionStages.WithCreate {
    }
    /** The DatabaseAccountGetResults definition stages. */
    interface DefinitionStages {
        /** The first stage of the DatabaseAccountGetResults definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the DatabaseAccountGetResults definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the DatabaseAccountGetResults definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithLocations withExistingResourceGroup(String resourceGroupName);
        }
        /** The stage of the DatabaseAccountGetResults definition allowing to specify locations. */
        interface WithLocations {
            /**
             * Specifies the locations property: An array that contains the georeplication locations enabled for the
             * Cosmos DB account..
             *
             * @param locations An array that contains the georeplication locations enabled for the Cosmos DB account.
             * @return the next definition stage.
             */
            WithCreate withLocations(List<Location> locations);
        }
        /**
         * The stage of the DatabaseAccountGetResults definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithKind,
                DefinitionStages.WithConsistencyPolicy,
                DefinitionStages.WithIpRules,
                DefinitionStages.WithIsVirtualNetworkFilterEnabled,
                DefinitionStages.WithEnableAutomaticFailover,
                DefinitionStages.WithCapabilities,
                DefinitionStages.WithVirtualNetworkRules,
                DefinitionStages.WithEnableMultipleWriteLocations,
                DefinitionStages.WithEnableCassandraConnector,
                DefinitionStages.WithConnectorOffer,
                DefinitionStages.WithDisableKeyBasedMetadataWriteAccess,
                DefinitionStages.WithKeyVaultKeyUri,
                DefinitionStages.WithEnableFreeTier,
                DefinitionStages.WithApiProperties,
                DefinitionStages.WithEnableAnalyticalStorage,
                DefinitionStages.WithBackupPolicy,
                DefinitionStages.WithCors {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            DatabaseAccountGetResults create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            DatabaseAccountGetResults create(Context context);
        }
        /** The stage of the DatabaseAccountGetResults definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the DatabaseAccountGetResults definition allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: Indicates the type of database account. This can only be set at database
             * account creation..
             *
             * @param kind Indicates the type of database account. This can only be set at database account creation.
             * @return the next definition stage.
             */
            WithCreate withKind(DatabaseAccountKind kind);
        }
        /** The stage of the DatabaseAccountGetResults definition allowing to specify consistencyPolicy. */
        interface WithConsistencyPolicy {
            /**
             * Specifies the consistencyPolicy property: The consistency policy for the Cosmos DB account..
             *
             * @param consistencyPolicy The consistency policy for the Cosmos DB account.
             * @return the next definition stage.
             */
            WithCreate withConsistencyPolicy(ConsistencyPolicy consistencyPolicy);
        }
        /** The stage of the DatabaseAccountGetResults definition allowing to specify ipRules. */
        interface WithIpRules {
            /**
             * Specifies the ipRules property: List of IpRules..
             *
             * @param ipRules List of IpRules.
             * @return the next definition stage.
             */
            WithCreate withIpRules(List<IpAddressOrRange> ipRules);
        }
        /** The stage of the DatabaseAccountGetResults definition allowing to specify isVirtualNetworkFilterEnabled. */
        interface WithIsVirtualNetworkFilterEnabled {
            /**
             * Specifies the isVirtualNetworkFilterEnabled property: Flag to indicate whether to enable/disable Virtual
             * Network ACL rules..
             *
             * @param isVirtualNetworkFilterEnabled Flag to indicate whether to enable/disable Virtual Network ACL
             *     rules.
             * @return the next definition stage.
             */
            WithCreate withIsVirtualNetworkFilterEnabled(Boolean isVirtualNetworkFilterEnabled);
        }
        /** The stage of the DatabaseAccountGetResults definition allowing to specify enableAutomaticFailover. */
        interface WithEnableAutomaticFailover {
            /**
             * Specifies the enableAutomaticFailover property: Enables automatic failover of the write region in the
             * rare event that the region is unavailable due to an outage. Automatic failover will result in a new write
             * region for the account and is chosen based on the failover priorities configured for the account..
             *
             * @param enableAutomaticFailover Enables automatic failover of the write region in the rare event that the
             *     region is unavailable due to an outage. Automatic failover will result in a new write region for the
             *     account and is chosen based on the failover priorities configured for the account.
             * @return the next definition stage.
             */
            WithCreate withEnableAutomaticFailover(Boolean enableAutomaticFailover);
        }
        /** The stage of the DatabaseAccountGetResults definition allowing to specify capabilities. */
        interface WithCapabilities {
            /**
             * Specifies the capabilities property: List of Cosmos DB capabilities for the account.
             *
             * @param capabilities List of Cosmos DB capabilities for the account.
             * @return the next definition stage.
             */
            WithCreate withCapabilities(List<Capability> capabilities);
        }
        /** The stage of the DatabaseAccountGetResults definition allowing to specify virtualNetworkRules. */
        interface WithVirtualNetworkRules {
            /**
             * Specifies the virtualNetworkRules property: List of Virtual Network ACL rules configured for the Cosmos
             * DB account..
             *
             * @param virtualNetworkRules List of Virtual Network ACL rules configured for the Cosmos DB account.
             * @return the next definition stage.
             */
            WithCreate withVirtualNetworkRules(List<VirtualNetworkRule> virtualNetworkRules);
        }
        /** The stage of the DatabaseAccountGetResults definition allowing to specify enableMultipleWriteLocations. */
        interface WithEnableMultipleWriteLocations {
            /**
             * Specifies the enableMultipleWriteLocations property: Enables the account to write in multiple locations.
             *
             * @param enableMultipleWriteLocations Enables the account to write in multiple locations.
             * @return the next definition stage.
             */
            WithCreate withEnableMultipleWriteLocations(Boolean enableMultipleWriteLocations);
        }
        /** The stage of the DatabaseAccountGetResults definition allowing to specify enableCassandraConnector. */
        interface WithEnableCassandraConnector {
            /**
             * Specifies the enableCassandraConnector property: Enables the cassandra connector on the Cosmos DB C*
             * account.
             *
             * @param enableCassandraConnector Enables the cassandra connector on the Cosmos DB C* account.
             * @return the next definition stage.
             */
            WithCreate withEnableCassandraConnector(Boolean enableCassandraConnector);
        }
        /** The stage of the DatabaseAccountGetResults definition allowing to specify connectorOffer. */
        interface WithConnectorOffer {
            /**
             * Specifies the connectorOffer property: The cassandra connector offer type for the Cosmos DB database C*
             * account..
             *
             * @param connectorOffer The cassandra connector offer type for the Cosmos DB database C* account.
             * @return the next definition stage.
             */
            WithCreate withConnectorOffer(ConnectorOffer connectorOffer);
        }
        /**
         * The stage of the DatabaseAccountGetResults definition allowing to specify disableKeyBasedMetadataWriteAccess.
         */
        interface WithDisableKeyBasedMetadataWriteAccess {
            /**
             * Specifies the disableKeyBasedMetadataWriteAccess property: Disable write operations on metadata resources
             * (databases, containers, throughput) via account keys.
             *
             * @param disableKeyBasedMetadataWriteAccess Disable write operations on metadata resources (databases,
             *     containers, throughput) via account keys.
             * @return the next definition stage.
             */
            WithCreate withDisableKeyBasedMetadataWriteAccess(Boolean disableKeyBasedMetadataWriteAccess);
        }
        /** The stage of the DatabaseAccountGetResults definition allowing to specify keyVaultKeyUri. */
        interface WithKeyVaultKeyUri {
            /**
             * Specifies the keyVaultKeyUri property: The URI of the key vault.
             *
             * @param keyVaultKeyUri The URI of the key vault.
             * @return the next definition stage.
             */
            WithCreate withKeyVaultKeyUri(String keyVaultKeyUri);
        }
        /** The stage of the DatabaseAccountGetResults definition allowing to specify enableFreeTier. */
        interface WithEnableFreeTier {
            /**
             * Specifies the enableFreeTier property: Flag to indicate whether Free Tier is enabled..
             *
             * @param enableFreeTier Flag to indicate whether Free Tier is enabled.
             * @return the next definition stage.
             */
            WithCreate withEnableFreeTier(Boolean enableFreeTier);
        }
        /** The stage of the DatabaseAccountGetResults definition allowing to specify apiProperties. */
        interface WithApiProperties {
            /**
             * Specifies the apiProperties property: API specific properties. Currently, supported only for MongoDB
             * API..
             *
             * @param apiProperties API specific properties. Currently, supported only for MongoDB API.
             * @return the next definition stage.
             */
            WithCreate withApiProperties(ApiProperties apiProperties);
        }
        /** The stage of the DatabaseAccountGetResults definition allowing to specify enableAnalyticalStorage. */
        interface WithEnableAnalyticalStorage {
            /**
             * Specifies the enableAnalyticalStorage property: Flag to indicate whether to enable storage analytics..
             *
             * @param enableAnalyticalStorage Flag to indicate whether to enable storage analytics.
             * @return the next definition stage.
             */
            WithCreate withEnableAnalyticalStorage(Boolean enableAnalyticalStorage);
        }
        /** The stage of the DatabaseAccountGetResults definition allowing to specify backupPolicy. */
        interface WithBackupPolicy {
            /**
             * Specifies the backupPolicy property: The object representing the policy for taking backups on an
             * account..
             *
             * @param backupPolicy The object representing the policy for taking backups on an account.
             * @return the next definition stage.
             */
            WithCreate withBackupPolicy(BackupPolicy backupPolicy);
        }
        /** The stage of the DatabaseAccountGetResults definition allowing to specify cors. */
        interface WithCors {
            /**
             * Specifies the cors property: The CORS policy for the Cosmos DB database account..
             *
             * @param cors The CORS policy for the Cosmos DB database account.
             * @return the next definition stage.
             */
            WithCreate withCors(List<CorsPolicy> cors);
        }
    }
    /**
     * Begins update for the DatabaseAccountGetResults resource.
     *
     * @return the stage of resource update.
     */
    DatabaseAccountGetResults.Update update();

    /** The template for DatabaseAccountGetResults update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithConsistencyPolicy,
            UpdateStages.WithLocations,
            UpdateStages.WithIpRules,
            UpdateStages.WithIsVirtualNetworkFilterEnabled,
            UpdateStages.WithEnableAutomaticFailover,
            UpdateStages.WithCapabilities,
            UpdateStages.WithVirtualNetworkRules,
            UpdateStages.WithEnableMultipleWriteLocations,
            UpdateStages.WithEnableCassandraConnector,
            UpdateStages.WithConnectorOffer,
            UpdateStages.WithDisableKeyBasedMetadataWriteAccess,
            UpdateStages.WithKeyVaultKeyUri,
            UpdateStages.WithEnableFreeTier,
            UpdateStages.WithApiProperties,
            UpdateStages.WithEnableAnalyticalStorage,
            UpdateStages.WithBackupPolicy,
            UpdateStages.WithCors {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        DatabaseAccountGetResults apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        DatabaseAccountGetResults apply(Context context);
    }
    /** The DatabaseAccountGetResults update stages. */
    interface UpdateStages {
        /** The stage of the DatabaseAccountGetResults update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Tags are a list of key-value pairs that describe the resource. These tags
             * can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be
             * provided for a resource. Each tag must have a key no greater than 128 characters and value no greater
             * than 256 characters. For example, the default experience for a template type is set with
             * "defaultExperience": "Cassandra". Current "defaultExperience" values also include "Table", "Graph",
             * "DocumentDB", and "MongoDB"..
             *
             * @param tags Tags are a list of key-value pairs that describe the resource. These tags can be used in
             *     viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for
             *     a resource. Each tag must have a key no greater than 128 characters and value no greater than 256
             *     characters. For example, the default experience for a template type is set with "defaultExperience":
             *     "Cassandra". Current "defaultExperience" values also include "Table", "Graph", "DocumentDB", and
             *     "MongoDB".
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the DatabaseAccountGetResults update allowing to specify consistencyPolicy. */
        interface WithConsistencyPolicy {
            /**
             * Specifies the consistencyPolicy property: The consistency policy for the Cosmos DB account..
             *
             * @param consistencyPolicy The consistency policy for the Cosmos DB account.
             * @return the next definition stage.
             */
            Update withConsistencyPolicy(ConsistencyPolicy consistencyPolicy);
        }
        /** The stage of the DatabaseAccountGetResults update allowing to specify locations. */
        interface WithLocations {
            /**
             * Specifies the locations property: An array that contains the georeplication locations enabled for the
             * Cosmos DB account..
             *
             * @param locations An array that contains the georeplication locations enabled for the Cosmos DB account.
             * @return the next definition stage.
             */
            Update withLocations(List<Location> locations);
        }
        /** The stage of the DatabaseAccountGetResults update allowing to specify ipRules. */
        interface WithIpRules {
            /**
             * Specifies the ipRules property: List of IpRules..
             *
             * @param ipRules List of IpRules.
             * @return the next definition stage.
             */
            Update withIpRules(List<IpAddressOrRange> ipRules);
        }
        /** The stage of the DatabaseAccountGetResults update allowing to specify isVirtualNetworkFilterEnabled. */
        interface WithIsVirtualNetworkFilterEnabled {
            /**
             * Specifies the isVirtualNetworkFilterEnabled property: Flag to indicate whether to enable/disable Virtual
             * Network ACL rules..
             *
             * @param isVirtualNetworkFilterEnabled Flag to indicate whether to enable/disable Virtual Network ACL
             *     rules.
             * @return the next definition stage.
             */
            Update withIsVirtualNetworkFilterEnabled(Boolean isVirtualNetworkFilterEnabled);
        }
        /** The stage of the DatabaseAccountGetResults update allowing to specify enableAutomaticFailover. */
        interface WithEnableAutomaticFailover {
            /**
             * Specifies the enableAutomaticFailover property: Enables automatic failover of the write region in the
             * rare event that the region is unavailable due to an outage. Automatic failover will result in a new write
             * region for the account and is chosen based on the failover priorities configured for the account..
             *
             * @param enableAutomaticFailover Enables automatic failover of the write region in the rare event that the
             *     region is unavailable due to an outage. Automatic failover will result in a new write region for the
             *     account and is chosen based on the failover priorities configured for the account.
             * @return the next definition stage.
             */
            Update withEnableAutomaticFailover(Boolean enableAutomaticFailover);
        }
        /** The stage of the DatabaseAccountGetResults update allowing to specify capabilities. */
        interface WithCapabilities {
            /**
             * Specifies the capabilities property: List of Cosmos DB capabilities for the account.
             *
             * @param capabilities List of Cosmos DB capabilities for the account.
             * @return the next definition stage.
             */
            Update withCapabilities(List<Capability> capabilities);
        }
        /** The stage of the DatabaseAccountGetResults update allowing to specify virtualNetworkRules. */
        interface WithVirtualNetworkRules {
            /**
             * Specifies the virtualNetworkRules property: List of Virtual Network ACL rules configured for the Cosmos
             * DB account..
             *
             * @param virtualNetworkRules List of Virtual Network ACL rules configured for the Cosmos DB account.
             * @return the next definition stage.
             */
            Update withVirtualNetworkRules(List<VirtualNetworkRule> virtualNetworkRules);
        }
        /** The stage of the DatabaseAccountGetResults update allowing to specify enableMultipleWriteLocations. */
        interface WithEnableMultipleWriteLocations {
            /**
             * Specifies the enableMultipleWriteLocations property: Enables the account to write in multiple locations.
             *
             * @param enableMultipleWriteLocations Enables the account to write in multiple locations.
             * @return the next definition stage.
             */
            Update withEnableMultipleWriteLocations(Boolean enableMultipleWriteLocations);
        }
        /** The stage of the DatabaseAccountGetResults update allowing to specify enableCassandraConnector. */
        interface WithEnableCassandraConnector {
            /**
             * Specifies the enableCassandraConnector property: Enables the cassandra connector on the Cosmos DB C*
             * account.
             *
             * @param enableCassandraConnector Enables the cassandra connector on the Cosmos DB C* account.
             * @return the next definition stage.
             */
            Update withEnableCassandraConnector(Boolean enableCassandraConnector);
        }
        /** The stage of the DatabaseAccountGetResults update allowing to specify connectorOffer. */
        interface WithConnectorOffer {
            /**
             * Specifies the connectorOffer property: The cassandra connector offer type for the Cosmos DB database C*
             * account..
             *
             * @param connectorOffer The cassandra connector offer type for the Cosmos DB database C* account.
             * @return the next definition stage.
             */
            Update withConnectorOffer(ConnectorOffer connectorOffer);
        }
        /** The stage of the DatabaseAccountGetResults update allowing to specify disableKeyBasedMetadataWriteAccess. */
        interface WithDisableKeyBasedMetadataWriteAccess {
            /**
             * Specifies the disableKeyBasedMetadataWriteAccess property: Disable write operations on metadata resources
             * (databases, containers, throughput) via account keys.
             *
             * @param disableKeyBasedMetadataWriteAccess Disable write operations on metadata resources (databases,
             *     containers, throughput) via account keys.
             * @return the next definition stage.
             */
            Update withDisableKeyBasedMetadataWriteAccess(Boolean disableKeyBasedMetadataWriteAccess);
        }
        /** The stage of the DatabaseAccountGetResults update allowing to specify keyVaultKeyUri. */
        interface WithKeyVaultKeyUri {
            /**
             * Specifies the keyVaultKeyUri property: The URI of the key vault.
             *
             * @param keyVaultKeyUri The URI of the key vault.
             * @return the next definition stage.
             */
            Update withKeyVaultKeyUri(String keyVaultKeyUri);
        }
        /** The stage of the DatabaseAccountGetResults update allowing to specify enableFreeTier. */
        interface WithEnableFreeTier {
            /**
             * Specifies the enableFreeTier property: Flag to indicate whether Free Tier is enabled..
             *
             * @param enableFreeTier Flag to indicate whether Free Tier is enabled.
             * @return the next definition stage.
             */
            Update withEnableFreeTier(Boolean enableFreeTier);
        }
        /** The stage of the DatabaseAccountGetResults update allowing to specify apiProperties. */
        interface WithApiProperties {
            /**
             * Specifies the apiProperties property: API specific properties. Currently, supported only for MongoDB
             * API..
             *
             * @param apiProperties API specific properties. Currently, supported only for MongoDB API.
             * @return the next definition stage.
             */
            Update withApiProperties(ApiProperties apiProperties);
        }
        /** The stage of the DatabaseAccountGetResults update allowing to specify enableAnalyticalStorage. */
        interface WithEnableAnalyticalStorage {
            /**
             * Specifies the enableAnalyticalStorage property: Flag to indicate whether to enable storage analytics..
             *
             * @param enableAnalyticalStorage Flag to indicate whether to enable storage analytics.
             * @return the next definition stage.
             */
            Update withEnableAnalyticalStorage(Boolean enableAnalyticalStorage);
        }
        /** The stage of the DatabaseAccountGetResults update allowing to specify backupPolicy. */
        interface WithBackupPolicy {
            /**
             * Specifies the backupPolicy property: The object representing the policy for taking backups on an
             * account..
             *
             * @param backupPolicy The object representing the policy for taking backups on an account.
             * @return the next definition stage.
             */
            Update withBackupPolicy(BackupPolicy backupPolicy);
        }
        /** The stage of the DatabaseAccountGetResults update allowing to specify cors. */
        interface WithCors {
            /**
             * Specifies the cors property: The CORS policy for the Cosmos DB database account..
             *
             * @param cors The CORS policy for the Cosmos DB database account.
             * @return the next definition stage.
             */
            Update withCors(List<CorsPolicy> cors);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    DatabaseAccountGetResults refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    DatabaseAccountGetResults refresh(Context context);
}
