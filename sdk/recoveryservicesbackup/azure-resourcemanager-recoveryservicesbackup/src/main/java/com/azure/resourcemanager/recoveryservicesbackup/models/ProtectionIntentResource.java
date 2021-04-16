// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.ProtectionIntentResourceInner;
import java.util.Map;

/** An immutable client-side representation of ProtectionIntentResource. */
public interface ProtectionIntentResource {
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
     * Gets the properties property: ProtectionIntentResource properties.
     *
     * @return the properties value.
     */
    ProtectionIntent properties();

    /**
     * Gets the etag property: Optional ETag.
     *
     * @return the etag value.
     */
    String etag();

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
     * Gets the inner com.azure.resourcemanager.recoveryservicesbackup.fluent.models.ProtectionIntentResourceInner
     * object.
     *
     * @return the inner object.
     */
    ProtectionIntentResourceInner innerModel();

    /** The entirety of the ProtectionIntentResource definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithCreate {
    }
    /** The ProtectionIntentResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the ProtectionIntentResource definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the ProtectionIntentResource definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }
        /** The stage of the ProtectionIntentResource definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies vaultName, resourceGroupName, fabricName.
             *
             * @param vaultName The name of the recovery services vault.
             * @param resourceGroupName The name of the resource group where the recovery services vault is present.
             * @param fabricName Fabric name associated with the backup item.
             * @return the next definition stage.
             */
            WithCreate withExistingBackupFabric(String vaultName, String resourceGroupName, String fabricName);
        }
        /**
         * The stage of the ProtectionIntentResource definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags, DefinitionStages.WithProperties, DefinitionStages.WithEtag {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ProtectionIntentResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ProtectionIntentResource create(Context context);
        }
        /** The stage of the ProtectionIntentResource definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the ProtectionIntentResource definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: ProtectionIntentResource properties.
             *
             * @param properties ProtectionIntentResource properties.
             * @return the next definition stage.
             */
            WithCreate withProperties(ProtectionIntent properties);
        }
        /** The stage of the ProtectionIntentResource definition allowing to specify etag. */
        interface WithEtag {
            /**
             * Specifies the etag property: Optional ETag..
             *
             * @param etag Optional ETag.
             * @return the next definition stage.
             */
            WithCreate withEtag(String etag);
        }
    }
    /**
     * Begins update for the ProtectionIntentResource resource.
     *
     * @return the stage of resource update.
     */
    ProtectionIntentResource.Update update();

    /** The template for ProtectionIntentResource update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithProperties, UpdateStages.WithEtag {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ProtectionIntentResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ProtectionIntentResource apply(Context context);
    }
    /** The ProtectionIntentResource update stages. */
    interface UpdateStages {
        /** The stage of the ProtectionIntentResource update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the ProtectionIntentResource update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: ProtectionIntentResource properties.
             *
             * @param properties ProtectionIntentResource properties.
             * @return the next definition stage.
             */
            Update withProperties(ProtectionIntent properties);
        }
        /** The stage of the ProtectionIntentResource update allowing to specify etag. */
        interface WithEtag {
            /**
             * Specifies the etag property: Optional ETag..
             *
             * @param etag Optional ETag.
             * @return the next definition stage.
             */
            Update withEtag(String etag);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ProtectionIntentResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ProtectionIntentResource refresh(Context context);
}
