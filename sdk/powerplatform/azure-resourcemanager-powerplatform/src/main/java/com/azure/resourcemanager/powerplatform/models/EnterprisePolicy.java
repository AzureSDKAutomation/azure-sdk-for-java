// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.powerplatform.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.powerplatform.fluent.models.EnterprisePolicyInner;
import java.util.Map;

/** An immutable client-side representation of EnterprisePolicy. */
public interface EnterprisePolicy {
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
     * Gets the identity property: The identity of the EnterprisePolicy.
     *
     * @return the identity value.
     */
    EnterprisePolicyIdentity identity();

    /**
     * Gets the lockbox property: Settings concerning lockbox.
     *
     * @return the lockbox value.
     */
    PropertiesLockbox lockbox();

    /**
     * Gets the encryption property: The encryption settings for a configuration store.
     *
     * @return the encryption value.
     */
    PropertiesEncryption encryption();

    /**
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the trackedResourceLocation property: The Azure Region where the resource lives.
     *
     * @return the trackedResourceLocation value.
     */
    String trackedResourceLocation();

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
     * Gets the inner com.azure.resourcemanager.powerplatform.fluent.models.EnterprisePolicyInner object.
     *
     * @return the inner object.
     */
    EnterprisePolicyInner innerModel();

    /** The entirety of the EnterprisePolicy definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The EnterprisePolicy definition stages. */
    interface DefinitionStages {
        /** The first stage of the EnterprisePolicy definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the EnterprisePolicy definition allowing to specify location. */
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
        /** The stage of the EnterprisePolicy definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the EnterprisePolicy definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithIdentity,
                DefinitionStages.WithLockbox,
                DefinitionStages.WithEncryption,
                DefinitionStages.WithTrackedResourceLocation {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            EnterprisePolicy create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            EnterprisePolicy create(Context context);
        }
        /** The stage of the EnterprisePolicy definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the EnterprisePolicy definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity of the EnterprisePolicy..
             *
             * @param identity The identity of the EnterprisePolicy.
             * @return the next definition stage.
             */
            WithCreate withIdentity(EnterprisePolicyIdentity identity);
        }
        /** The stage of the EnterprisePolicy definition allowing to specify lockbox. */
        interface WithLockbox {
            /**
             * Specifies the lockbox property: Settings concerning lockbox..
             *
             * @param lockbox Settings concerning lockbox.
             * @return the next definition stage.
             */
            WithCreate withLockbox(PropertiesLockbox lockbox);
        }
        /** The stage of the EnterprisePolicy definition allowing to specify encryption. */
        interface WithEncryption {
            /**
             * Specifies the encryption property: The encryption settings for a configuration store..
             *
             * @param encryption The encryption settings for a configuration store.
             * @return the next definition stage.
             */
            WithCreate withEncryption(PropertiesEncryption encryption);
        }
        /** The stage of the EnterprisePolicy definition allowing to specify trackedResourceLocation. */
        interface WithTrackedResourceLocation {
            /**
             * Specifies the trackedResourceLocation property: The Azure Region where the resource lives.
             *
             * @param trackedResourceLocation The Azure Region where the resource lives.
             * @return the next definition stage.
             */
            WithCreate withTrackedResourceLocation(String trackedResourceLocation);
        }
    }
    /**
     * Begins update for the EnterprisePolicy resource.
     *
     * @return the stage of resource update.
     */
    EnterprisePolicy.Update update();

    /** The template for EnterprisePolicy update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithIdentity,
            UpdateStages.WithLockbox,
            UpdateStages.WithEncryption,
            UpdateStages.WithTrackedResourceLocation {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        EnterprisePolicy apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        EnterprisePolicy apply(Context context);
    }
    /** The EnterprisePolicy update stages. */
    interface UpdateStages {
        /** The stage of the EnterprisePolicy update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the EnterprisePolicy update allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity of the EnterprisePolicy..
             *
             * @param identity The identity of the EnterprisePolicy.
             * @return the next definition stage.
             */
            Update withIdentity(EnterprisePolicyIdentity identity);
        }
        /** The stage of the EnterprisePolicy update allowing to specify lockbox. */
        interface WithLockbox {
            /**
             * Specifies the lockbox property: Settings concerning lockbox..
             *
             * @param lockbox Settings concerning lockbox.
             * @return the next definition stage.
             */
            Update withLockbox(PropertiesLockbox lockbox);
        }
        /** The stage of the EnterprisePolicy update allowing to specify encryption. */
        interface WithEncryption {
            /**
             * Specifies the encryption property: The encryption settings for a configuration store..
             *
             * @param encryption The encryption settings for a configuration store.
             * @return the next definition stage.
             */
            Update withEncryption(PropertiesEncryption encryption);
        }
        /** The stage of the EnterprisePolicy update allowing to specify trackedResourceLocation. */
        interface WithTrackedResourceLocation {
            /**
             * Specifies the trackedResourceLocation property: The Azure Region where the resource lives.
             *
             * @param trackedResourceLocation The Azure Region where the resource lives.
             * @return the next definition stage.
             */
            Update withTrackedResourceLocation(String trackedResourceLocation);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    EnterprisePolicy refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    EnterprisePolicy refresh(Context context);
}
