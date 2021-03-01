// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.fluent.models.RestorePointInner;
import java.util.List;

/** An immutable client-side representation of RestorePoint. */
public interface RestorePoint {
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
     * Gets the optionalProperties property: Optional properties to be passed for restore point creation (raw JSON).
     *
     * @return the optionalProperties value.
     */
    Object optionalProperties();

    /**
     * Gets the sourceMetadata property: Gets the details of the VM captured at the time of creation of restore point.
     *
     * @return the sourceMetadata value.
     */
    RestorePointSourceMetadata sourceMetadata();

    /**
     * Gets the provisioningState property: Gets the provisioning state of restore point, which only appears in the
     * response.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the consistencyMode property: Gets or sets the consistency mode for the restore point.
     *
     * @return the consistencyMode value.
     */
    ConsistencyModeTypes consistencyMode();

    /**
     * Gets the provisioningDetails property: Gets the provisioning details set by the server during Create restore
     * point operation.
     *
     * @return the provisioningDetails value.
     */
    RestorePointProvisioningDetails provisioningDetails();

    /**
     * Gets the excludeDisks property: List of disk resource ids that the customer wishes to exclude from the restore
     * point. If no disks are specified, all disks will be included.
     *
     * @return the excludeDisks value.
     */
    List<ApiEntityReference> excludeDisks();

    /**
     * Gets the inner com.azure.resourcemanager.compute.generated.fluent.models.RestorePointInner object.
     *
     * @return the inner object.
     */
    RestorePointInner innerModel();

    /** The entirety of the RestorePoint definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The RestorePoint definition stages. */
    interface DefinitionStages {
        /** The first stage of the RestorePoint definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the RestorePoint definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, restorePointCollectionName.
             *
             * @param resourceGroupName The name of the resource group.
             * @param restorePointCollectionName The name of the restore point collection.
             * @return the next definition stage.
             */
            WithCreate withExistingRestorePointCollection(String resourceGroupName, String restorePointCollectionName);
        }
        /**
         * The stage of the RestorePoint definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithOptionalProperties, DefinitionStages.WithExcludeDisks {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            RestorePoint create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            RestorePoint create(Context context);
        }
        /** The stage of the RestorePoint definition allowing to specify optionalProperties. */
        interface WithOptionalProperties {
            /**
             * Specifies the optionalProperties property: Optional properties to be passed for restore point creation
             * (raw JSON).
             *
             * @param optionalProperties Optional properties to be passed for restore point creation (raw JSON).
             * @return the next definition stage.
             */
            WithCreate withOptionalProperties(Object optionalProperties);
        }
        /** The stage of the RestorePoint definition allowing to specify excludeDisks. */
        interface WithExcludeDisks {
            /**
             * Specifies the excludeDisks property: List of disk resource ids that the customer wishes to exclude from
             * the restore point. If no disks are specified, all disks will be included..
             *
             * @param excludeDisks List of disk resource ids that the customer wishes to exclude from the restore point.
             *     If no disks are specified, all disks will be included.
             * @return the next definition stage.
             */
            WithCreate withExcludeDisks(List<ApiEntityReference> excludeDisks);
        }
    }
    /**
     * Begins update for the RestorePoint resource.
     *
     * @return the stage of resource update.
     */
    RestorePoint.Update update();

    /** The template for RestorePoint update. */
    interface Update extends UpdateStages.WithOptionalProperties, UpdateStages.WithExcludeDisks {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        RestorePoint apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        RestorePoint apply(Context context);
    }
    /** The RestorePoint update stages. */
    interface UpdateStages {
        /** The stage of the RestorePoint update allowing to specify optionalProperties. */
        interface WithOptionalProperties {
            /**
             * Specifies the optionalProperties property: Optional properties to be passed for restore point creation
             * (raw JSON).
             *
             * @param optionalProperties Optional properties to be passed for restore point creation (raw JSON).
             * @return the next definition stage.
             */
            Update withOptionalProperties(Object optionalProperties);
        }
        /** The stage of the RestorePoint update allowing to specify excludeDisks. */
        interface WithExcludeDisks {
            /**
             * Specifies the excludeDisks property: List of disk resource ids that the customer wishes to exclude from
             * the restore point. If no disks are specified, all disks will be included..
             *
             * @param excludeDisks List of disk resource ids that the customer wishes to exclude from the restore point.
             *     If no disks are specified, all disks will be included.
             * @return the next definition stage.
             */
            Update withExcludeDisks(List<ApiEntityReference> excludeDisks);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    RestorePoint refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    RestorePoint refresh(Context context);
}
