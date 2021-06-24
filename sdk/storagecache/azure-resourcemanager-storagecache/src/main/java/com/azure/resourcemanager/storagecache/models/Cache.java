// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.storagecache.fluent.models.CacheInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of Cache. */
public interface Cache {
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
     * Gets the identity property: The identity of the cache, if configured.
     *
     * @return the identity value.
     */
    CacheIdentity identity();

    /**
     * Gets the systemData property: The system meta data relating to this resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the sku property: SKU for the Cache.
     *
     * @return the sku value.
     */
    CacheSku sku();

    /**
     * Gets the cacheSizeGB property: The size of this Cache, in GB.
     *
     * @return the cacheSizeGB value.
     */
    Integer cacheSizeGB();

    /**
     * Gets the health property: Health of the Cache.
     *
     * @return the health value.
     */
    CacheHealth health();

    /**
     * Gets the mountAddresses property: Array of IP addresses that can be used by clients mounting this Cache.
     *
     * @return the mountAddresses value.
     */
    List<String> mountAddresses();

    /**
     * Gets the provisioningState property: ARM provisioning state, see
     * https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/Addendum.md#provisioningstate-property.
     *
     * @return the provisioningState value.
     */
    ProvisioningStateType provisioningState();

    /**
     * Gets the subnet property: Subnet used for the Cache.
     *
     * @return the subnet value.
     */
    String subnet();

    /**
     * Gets the upgradeStatus property: Upgrade status of the Cache.
     *
     * @return the upgradeStatus value.
     */
    CacheUpgradeStatus upgradeStatus();

    /**
     * Gets the networkSettings property: Specifies network settings of the cache.
     *
     * @return the networkSettings value.
     */
    CacheNetworkSettings networkSettings();

    /**
     * Gets the encryptionSettings property: Specifies encryption settings of the cache.
     *
     * @return the encryptionSettings value.
     */
    CacheEncryptionSettings encryptionSettings();

    /**
     * Gets the securitySettings property: Specifies security settings of the cache.
     *
     * @return the securitySettings value.
     */
    CacheSecuritySettings securitySettings();

    /**
     * Gets the directoryServicesSettings property: Specifies Directory Services settings of the cache.
     *
     * @return the directoryServicesSettings value.
     */
    CacheDirectorySettings directoryServicesSettings();

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
     * Gets the inner com.azure.resourcemanager.storagecache.fluent.models.CacheInner object.
     *
     * @return the inner object.
     */
    CacheInner innerModel();

    /** The entirety of the Cache definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The Cache definition stages. */
    interface DefinitionStages {
        /** The first stage of the Cache definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the Cache definition allowing to specify location. */
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
        /** The stage of the Cache definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName Target resource group.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the Cache definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithIdentity,
                DefinitionStages.WithSku,
                DefinitionStages.WithCacheSizeGB,
                DefinitionStages.WithSubnet,
                DefinitionStages.WithNetworkSettings,
                DefinitionStages.WithEncryptionSettings,
                DefinitionStages.WithSecuritySettings,
                DefinitionStages.WithDirectoryServicesSettings {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Cache create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Cache create(Context context);
        }
        /** The stage of the Cache definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the Cache definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity of the cache, if configured..
             *
             * @param identity The identity of the cache, if configured.
             * @return the next definition stage.
             */
            WithCreate withIdentity(CacheIdentity identity);
        }
        /** The stage of the Cache definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: SKU for the Cache..
             *
             * @param sku SKU for the Cache.
             * @return the next definition stage.
             */
            WithCreate withSku(CacheSku sku);
        }
        /** The stage of the Cache definition allowing to specify cacheSizeGB. */
        interface WithCacheSizeGB {
            /**
             * Specifies the cacheSizeGB property: The size of this Cache, in GB..
             *
             * @param cacheSizeGB The size of this Cache, in GB.
             * @return the next definition stage.
             */
            WithCreate withCacheSizeGB(Integer cacheSizeGB);
        }
        /** The stage of the Cache definition allowing to specify subnet. */
        interface WithSubnet {
            /**
             * Specifies the subnet property: Subnet used for the Cache..
             *
             * @param subnet Subnet used for the Cache.
             * @return the next definition stage.
             */
            WithCreate withSubnet(String subnet);
        }
        /** The stage of the Cache definition allowing to specify networkSettings. */
        interface WithNetworkSettings {
            /**
             * Specifies the networkSettings property: Specifies network settings of the cache..
             *
             * @param networkSettings Specifies network settings of the cache.
             * @return the next definition stage.
             */
            WithCreate withNetworkSettings(CacheNetworkSettings networkSettings);
        }
        /** The stage of the Cache definition allowing to specify encryptionSettings. */
        interface WithEncryptionSettings {
            /**
             * Specifies the encryptionSettings property: Specifies encryption settings of the cache..
             *
             * @param encryptionSettings Specifies encryption settings of the cache.
             * @return the next definition stage.
             */
            WithCreate withEncryptionSettings(CacheEncryptionSettings encryptionSettings);
        }
        /** The stage of the Cache definition allowing to specify securitySettings. */
        interface WithSecuritySettings {
            /**
             * Specifies the securitySettings property: Specifies security settings of the cache..
             *
             * @param securitySettings Specifies security settings of the cache.
             * @return the next definition stage.
             */
            WithCreate withSecuritySettings(CacheSecuritySettings securitySettings);
        }
        /** The stage of the Cache definition allowing to specify directoryServicesSettings. */
        interface WithDirectoryServicesSettings {
            /**
             * Specifies the directoryServicesSettings property: Specifies Directory Services settings of the cache..
             *
             * @param directoryServicesSettings Specifies Directory Services settings of the cache.
             * @return the next definition stage.
             */
            WithCreate withDirectoryServicesSettings(CacheDirectorySettings directoryServicesSettings);
        }
    }
    /**
     * Begins update for the Cache resource.
     *
     * @return the stage of resource update.
     */
    Cache.Update update();

    /** The template for Cache update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithIdentity,
            UpdateStages.WithSku,
            UpdateStages.WithNetworkSettings,
            UpdateStages.WithEncryptionSettings,
            UpdateStages.WithSecuritySettings,
            UpdateStages.WithDirectoryServicesSettings {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Cache apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Cache apply(Context context);
    }
    /** The Cache update stages. */
    interface UpdateStages {
        /** The stage of the Cache update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the Cache update allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity of the cache, if configured..
             *
             * @param identity The identity of the cache, if configured.
             * @return the next definition stage.
             */
            Update withIdentity(CacheIdentity identity);
        }
        /** The stage of the Cache update allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: SKU for the Cache..
             *
             * @param sku SKU for the Cache.
             * @return the next definition stage.
             */
            Update withSku(CacheSku sku);
        }
        /** The stage of the Cache update allowing to specify networkSettings. */
        interface WithNetworkSettings {
            /**
             * Specifies the networkSettings property: Specifies network settings of the cache..
             *
             * @param networkSettings Specifies network settings of the cache.
             * @return the next definition stage.
             */
            Update withNetworkSettings(CacheNetworkSettings networkSettings);
        }
        /** The stage of the Cache update allowing to specify encryptionSettings. */
        interface WithEncryptionSettings {
            /**
             * Specifies the encryptionSettings property: Specifies encryption settings of the cache..
             *
             * @param encryptionSettings Specifies encryption settings of the cache.
             * @return the next definition stage.
             */
            Update withEncryptionSettings(CacheEncryptionSettings encryptionSettings);
        }
        /** The stage of the Cache update allowing to specify securitySettings. */
        interface WithSecuritySettings {
            /**
             * Specifies the securitySettings property: Specifies security settings of the cache..
             *
             * @param securitySettings Specifies security settings of the cache.
             * @return the next definition stage.
             */
            Update withSecuritySettings(CacheSecuritySettings securitySettings);
        }
        /** The stage of the Cache update allowing to specify directoryServicesSettings. */
        interface WithDirectoryServicesSettings {
            /**
             * Specifies the directoryServicesSettings property: Specifies Directory Services settings of the cache..
             *
             * @param directoryServicesSettings Specifies Directory Services settings of the cache.
             * @return the next definition stage.
             */
            Update withDirectoryServicesSettings(CacheDirectorySettings directoryServicesSettings);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Cache refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Cache refresh(Context context);

    /**
     * Tells a Cache to write generate debug info for support to process.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void debugInfo();

    /**
     * Tells a Cache to write generate debug info for support to process.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void debugInfo(Context context);

    /**
     * Tells a Cache to write all dirty data to the Storage Target(s). During the flush, clients will see errors
     * returned until the flush is complete.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void flush();

    /**
     * Tells a Cache to write all dirty data to the Storage Target(s). During the flush, clients will see errors
     * returned until the flush is complete.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void flush(Context context);

    /**
     * Tells a Stopped state Cache to transition to Active state.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start();

    /**
     * Tells a Stopped state Cache to transition to Active state.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(Context context);

    /**
     * Tells an Active Cache to transition to Stopped state.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop();

    /**
     * Tells an Active Cache to transition to Stopped state.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(Context context);

    /**
     * Upgrade a Cache's firmware if a new version is available. Otherwise, this operation has no effect.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void upgradeFirmware();

    /**
     * Upgrade a Cache's firmware if a new version is available. Otherwise, this operation has no effect.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void upgradeFirmware(Context context);
}
