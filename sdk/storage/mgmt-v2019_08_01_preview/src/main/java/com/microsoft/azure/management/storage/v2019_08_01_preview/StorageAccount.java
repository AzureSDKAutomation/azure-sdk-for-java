/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_08_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.storage.v2019_08_01_preview.implementation.StorageManager;
import com.microsoft.azure.management.storage.v2019_08_01_preview.implementation.SkuInner;
import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.storage.v2019_08_01_preview.implementation.StorageAccountInner;

/**
 * Type representing StorageAccount.
 */
public interface StorageAccount extends HasInner<StorageAccountInner>, Resource, GroupableResourceCore<StorageManager, StorageAccountInner>, HasResourceGroup, Refreshable<StorageAccount>, Updatable<StorageAccount.Update>, HasManager<StorageManager> {
    /**
     * @return the accessTier value.
     */
    AccessTier accessTier();

    /**
     * @return the allowBlobPublicAccess value.
     */
    Boolean allowBlobPublicAccess();

    /**
     * @return the azureFilesIdentityBasedAuthentication value.
     */
    AzureFilesIdentityBasedAuthentication azureFilesIdentityBasedAuthentication();

    /**
     * @return the blobRestoreStatus value.
     */
    BlobRestoreStatus blobRestoreStatus();

    /**
     * @return the creationTime value.
     */
    DateTime creationTime();

    /**
     * @return the customDomain value.
     */
    CustomDomain customDomain();

    /**
     * @return the enableHttpsTrafficOnly value.
     */
    Boolean enableHttpsTrafficOnly();

    /**
     * @return the encryption value.
     */
    Encryption encryption();

    /**
     * @return the extendedLocation value.
     */
    ExtendedLocation extendedLocation();

    /**
     * @return the failoverInProgress value.
     */
    Boolean failoverInProgress();

    /**
     * @return the geoReplicationStats value.
     */
    GeoReplicationStats geoReplicationStats();

    /**
     * @return the identity value.
     */
    Identity identity();

    /**
     * @return the isHnsEnabled value.
     */
    Boolean isHnsEnabled();

    /**
     * @return the isLocalUserEnabled value.
     */
    Boolean isLocalUserEnabled();

    /**
     * @return the kind value.
     */
    Kind kind();

    /**
     * @return the largeFileSharesState value.
     */
    LargeFileSharesState largeFileSharesState();

    /**
     * @return the lastGeoFailoverTime value.
     */
    DateTime lastGeoFailoverTime();

    /**
     * @return the minimumTlsVersion value.
     */
    MinimumTlsVersion minimumTlsVersion();

    /**
     * @return the networkRuleSet value.
     */
    NetworkRuleSet networkRuleSet();

    /**
     * @return the primaryEndpoints value.
     */
    Endpoints primaryEndpoints();

    /**
     * @return the primaryLocation value.
     */
    String primaryLocation();

    /**
     * @return the privateEndpointConnections value.
     */
    List<PrivateEndpointConnection> privateEndpointConnections();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the routingPreference value.
     */
    RoutingPreference routingPreference();

    /**
     * @return the secondaryEndpoints value.
     */
    Endpoints secondaryEndpoints();

    /**
     * @return the secondaryLocation value.
     */
    String secondaryLocation();

    /**
     * @return the sku value.
     */
    SkuInner sku();

    /**
     * @return the statusOfPrimary value.
     */
    AccountStatus statusOfPrimary();

    /**
     * @return the statusOfSecondary value.
     */
    AccountStatus statusOfSecondary();

    /**
     * The entirety of the StorageAccount definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithKind, DefinitionStages.WithSku, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of StorageAccount definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a StorageAccount definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the StorageAccount definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithKind> {
        }

        /**
         * The stage of the storageaccount definition allowing to specify Kind.
         */
        interface WithKind {
           /**
            * Specifies kind.
            * @param kind Required. Indicates the type of storage account. Possible values include: 'Storage', 'StorageV2', 'BlobStorage', 'FileStorage', 'BlockBlobStorage'
            * @return the next definition stage
*/
            WithSku withKind(Kind kind);
        }

        /**
         * The stage of the storageaccount definition allowing to specify Sku.
         */
        interface WithSku {
           /**
            * Specifies sku.
            * @param sku Required. Gets or sets the SKU name
            * @return the next definition stage
*/
            WithCreate withSku(SkuInner sku);
        }

        /**
         * The stage of the storageaccount definition allowing to specify AccessTier.
         */
        interface WithAccessTier {
            /**
             * Specifies accessTier.
             * @param accessTier Required for storage accounts where kind = BlobStorage. The access tier used for billing. Possible values include: 'Hot', 'Cool'
             * @return the next definition stage
             */
            WithCreate withAccessTier(AccessTier accessTier);
        }

        /**
         * The stage of the storageaccount definition allowing to specify AllowBlobPublicAccess.
         */
        interface WithAllowBlobPublicAccess {
            /**
             * Specifies allowBlobPublicAccess.
             * @param allowBlobPublicAccess Allow or disallow public access to all blobs or containers in the storage account. The default interpretation is true for this property
             * @return the next definition stage
             */
            WithCreate withAllowBlobPublicAccess(Boolean allowBlobPublicAccess);
        }

        /**
         * The stage of the storageaccount definition allowing to specify AzureFilesIdentityBasedAuthentication.
         */
        interface WithAzureFilesIdentityBasedAuthentication {
            /**
             * Specifies azureFilesIdentityBasedAuthentication.
             * @param azureFilesIdentityBasedAuthentication Provides the identity based authentication settings for Azure Files
             * @return the next definition stage
             */
            WithCreate withAzureFilesIdentityBasedAuthentication(AzureFilesIdentityBasedAuthentication azureFilesIdentityBasedAuthentication);
        }

        /**
         * The stage of the storageaccount definition allowing to specify CustomDomain.
         */
        interface WithCustomDomain {
            /**
             * Specifies customDomain.
             * @param customDomain User domain assigned to the storage account. Name is the CNAME source. Only one custom domain is supported per storage account at this time. To clear the existing custom domain, use an empty string for the custom domain name property
             * @return the next definition stage
             */
            WithCreate withCustomDomain(CustomDomain customDomain);
        }

        /**
         * The stage of the storageaccount definition allowing to specify EnableHttpsTrafficOnly.
         */
        interface WithEnableHttpsTrafficOnly {
            /**
             * Specifies enableHttpsTrafficOnly.
             * @param enableHttpsTrafficOnly Allows https traffic only to storage service if sets to true. The default value is true since API version 2019-04-01
             * @return the next definition stage
             */
            WithCreate withEnableHttpsTrafficOnly(Boolean enableHttpsTrafficOnly);
        }

        /**
         * The stage of the storageaccount definition allowing to specify Encryption.
         */
        interface WithEncryption {
            /**
             * Specifies encryption.
             * @param encryption Not applicable. Azure Storage encryption is enabled for all storage accounts and cannot be disabled
             * @return the next definition stage
             */
            WithCreate withEncryption(Encryption encryption);
        }

        /**
         * The stage of the storageaccount definition allowing to specify ExtendedLocation.
         */
        interface WithExtendedLocation {
            /**
             * Specifies extendedLocation.
             * @param extendedLocation Optional. Set the extended location of the resource. If not set, the storage account will be created in Azure main region. Otherwise it will be created in the specified extended location
             * @return the next definition stage
             */
            WithCreate withExtendedLocation(ExtendedLocation extendedLocation);
        }

        /**
         * The stage of the storageaccount definition allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity The identity of the resource
             * @return the next definition stage
             */
            WithCreate withIdentity(Identity identity);
        }

        /**
         * The stage of the storageaccount definition allowing to specify IsHnsEnabled.
         */
        interface WithIsHnsEnabled {
            /**
             * Specifies isHnsEnabled.
             * @param isHnsEnabled Account HierarchicalNamespace enabled if sets to true
             * @return the next definition stage
             */
            WithCreate withIsHnsEnabled(Boolean isHnsEnabled);
        }

        /**
         * The stage of the storageaccount definition allowing to specify IsLocalUserEnabled.
         */
        interface WithIsLocalUserEnabled {
            /**
             * Specifies isLocalUserEnabled.
             * @param isLocalUserEnabled Enable or disable local user feature of the storage account
             * @return the next definition stage
             */
            WithCreate withIsLocalUserEnabled(Boolean isLocalUserEnabled);
        }

        /**
         * The stage of the storageaccount definition allowing to specify LargeFileSharesState.
         */
        interface WithLargeFileSharesState {
            /**
             * Specifies largeFileSharesState.
             * @param largeFileSharesState Allow large file shares if sets to Enabled. It cannot be disabled once it is enabled. Possible values include: 'Disabled', 'Enabled'
             * @return the next definition stage
             */
            WithCreate withLargeFileSharesState(LargeFileSharesState largeFileSharesState);
        }

        /**
         * The stage of the storageaccount definition allowing to specify MinimumTlsVersion.
         */
        interface WithMinimumTlsVersion {
            /**
             * Specifies minimumTlsVersion.
             * @param minimumTlsVersion Set the minimum TLS version to be permitted on requests to storage. The default interpretation is TLS 1.0 for this property. Possible values include: 'TLS1_0', 'TLS1_1', 'TLS1_2'
             * @return the next definition stage
             */
            WithCreate withMinimumTlsVersion(MinimumTlsVersion minimumTlsVersion);
        }

        /**
         * The stage of the storageaccount definition allowing to specify NetworkRuleSet.
         */
        interface WithNetworkRuleSet {
            /**
             * Specifies networkRuleSet.
             * @param networkRuleSet Network rule set
             * @return the next definition stage
             */
            WithCreate withNetworkRuleSet(NetworkRuleSet networkRuleSet);
        }

        /**
         * The stage of the storageaccount definition allowing to specify RoutingPreference.
         */
        interface WithRoutingPreference {
            /**
             * Specifies routingPreference.
             * @param routingPreference Maintains information about the network routing choice opted by the user for data transfer
             * @return the next definition stage
             */
            WithCreate withRoutingPreference(RoutingPreference routingPreference);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<StorageAccount>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithAccessTier, DefinitionStages.WithAllowBlobPublicAccess, DefinitionStages.WithAzureFilesIdentityBasedAuthentication, DefinitionStages.WithCustomDomain, DefinitionStages.WithEnableHttpsTrafficOnly, DefinitionStages.WithEncryption, DefinitionStages.WithExtendedLocation, DefinitionStages.WithIdentity, DefinitionStages.WithIsHnsEnabled, DefinitionStages.WithIsLocalUserEnabled, DefinitionStages.WithLargeFileSharesState, DefinitionStages.WithMinimumTlsVersion, DefinitionStages.WithNetworkRuleSet, DefinitionStages.WithRoutingPreference {
        }
    }
    /**
     * The template for a StorageAccount update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<StorageAccount>, Resource.UpdateWithTags<Update>, UpdateStages.WithAccessTier, UpdateStages.WithAllowBlobPublicAccess, UpdateStages.WithAzureFilesIdentityBasedAuthentication, UpdateStages.WithCustomDomain, UpdateStages.WithEnableHttpsTrafficOnly, UpdateStages.WithEncryption, UpdateStages.WithIdentity, UpdateStages.WithIsLocalUserEnabled, UpdateStages.WithKind, UpdateStages.WithLargeFileSharesState, UpdateStages.WithMinimumTlsVersion, UpdateStages.WithNetworkRuleSet, UpdateStages.WithRoutingPreference, UpdateStages.WithSku {
    }

    /**
     * Grouping of StorageAccount update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the storageaccount update allowing to specify AccessTier.
         */
        interface WithAccessTier {
            /**
             * Specifies accessTier.
             * @param accessTier Required for storage accounts where kind = BlobStorage. The access tier used for billing. Possible values include: 'Hot', 'Cool'
             * @return the next update stage
             */
            Update withAccessTier(AccessTier accessTier);
        }

        /**
         * The stage of the storageaccount update allowing to specify AllowBlobPublicAccess.
         */
        interface WithAllowBlobPublicAccess {
            /**
             * Specifies allowBlobPublicAccess.
             * @param allowBlobPublicAccess Allow or disallow public access to all blobs or containers in the storage account. The default interpretation is true for this property
             * @return the next update stage
             */
            Update withAllowBlobPublicAccess(Boolean allowBlobPublicAccess);
        }

        /**
         * The stage of the storageaccount update allowing to specify AzureFilesIdentityBasedAuthentication.
         */
        interface WithAzureFilesIdentityBasedAuthentication {
            /**
             * Specifies azureFilesIdentityBasedAuthentication.
             * @param azureFilesIdentityBasedAuthentication Provides the identity based authentication settings for Azure Files
             * @return the next update stage
             */
            Update withAzureFilesIdentityBasedAuthentication(AzureFilesIdentityBasedAuthentication azureFilesIdentityBasedAuthentication);
        }

        /**
         * The stage of the storageaccount update allowing to specify CustomDomain.
         */
        interface WithCustomDomain {
            /**
             * Specifies customDomain.
             * @param customDomain Custom domain assigned to the storage account by the user. Name is the CNAME source. Only one custom domain is supported per storage account at this time. To clear the existing custom domain, use an empty string for the custom domain name property
             * @return the next update stage
             */
            Update withCustomDomain(CustomDomain customDomain);
        }

        /**
         * The stage of the storageaccount update allowing to specify EnableHttpsTrafficOnly.
         */
        interface WithEnableHttpsTrafficOnly {
            /**
             * Specifies enableHttpsTrafficOnly.
             * @param enableHttpsTrafficOnly Allows https traffic only to storage service if sets to true
             * @return the next update stage
             */
            Update withEnableHttpsTrafficOnly(Boolean enableHttpsTrafficOnly);
        }

        /**
         * The stage of the storageaccount update allowing to specify Encryption.
         */
        interface WithEncryption {
            /**
             * Specifies encryption.
             * @param encryption Provides the encryption settings on the account. The default setting is unencrypted
             * @return the next update stage
             */
            Update withEncryption(Encryption encryption);
        }

        /**
         * The stage of the storageaccount update allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity The identity of the resource
             * @return the next update stage
             */
            Update withIdentity(Identity identity);
        }

        /**
         * The stage of the storageaccount update allowing to specify IsLocalUserEnabled.
         */
        interface WithIsLocalUserEnabled {
            /**
             * Specifies isLocalUserEnabled.
             * @param isLocalUserEnabled Enable or disable local user feature of the storage account
             * @return the next update stage
             */
            Update withIsLocalUserEnabled(Boolean isLocalUserEnabled);
        }

        /**
         * The stage of the storageaccount update allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             * @param kind Optional. Indicates the type of storage account. Currently only StorageV2 value supported by server. Possible values include: 'Storage', 'StorageV2', 'BlobStorage', 'FileStorage', 'BlockBlobStorage'
             * @return the next update stage
             */
            Update withKind(Kind kind);
        }

        /**
         * The stage of the storageaccount update allowing to specify LargeFileSharesState.
         */
        interface WithLargeFileSharesState {
            /**
             * Specifies largeFileSharesState.
             * @param largeFileSharesState Allow large file shares if sets to Enabled. It cannot be disabled once it is enabled. Possible values include: 'Disabled', 'Enabled'
             * @return the next update stage
             */
            Update withLargeFileSharesState(LargeFileSharesState largeFileSharesState);
        }

        /**
         * The stage of the storageaccount update allowing to specify MinimumTlsVersion.
         */
        interface WithMinimumTlsVersion {
            /**
             * Specifies minimumTlsVersion.
             * @param minimumTlsVersion Set the minimum TLS version to be permitted on requests to storage. The default interpretation is TLS 1.0 for this property. Possible values include: 'TLS1_0', 'TLS1_1', 'TLS1_2'
             * @return the next update stage
             */
            Update withMinimumTlsVersion(MinimumTlsVersion minimumTlsVersion);
        }

        /**
         * The stage of the storageaccount update allowing to specify NetworkRuleSet.
         */
        interface WithNetworkRuleSet {
            /**
             * Specifies networkRuleSet.
             * @param networkRuleSet Network rule set
             * @return the next update stage
             */
            Update withNetworkRuleSet(NetworkRuleSet networkRuleSet);
        }

        /**
         * The stage of the storageaccount update allowing to specify RoutingPreference.
         */
        interface WithRoutingPreference {
            /**
             * Specifies routingPreference.
             * @param routingPreference Maintains information about the network routing choice opted by the user for data transfer
             * @return the next update stage
             */
            Update withRoutingPreference(RoutingPreference routingPreference);
        }

        /**
         * The stage of the storageaccount update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku Gets or sets the SKU name. Note that the SKU name cannot be updated to Standard_ZRS, Premium_LRS or Premium_ZRS, nor can accounts of those SKU names be updated to any other value
             * @return the next update stage
             */
            Update withSku(SkuInner sku);
        }

    }
}
