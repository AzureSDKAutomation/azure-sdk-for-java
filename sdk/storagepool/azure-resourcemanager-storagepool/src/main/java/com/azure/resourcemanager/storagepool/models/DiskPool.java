// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagepool.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.storagepool.fluent.models.DiskPoolInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of DiskPool. */
public interface DiskPool {
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
     * Gets the systemData property: Resource metadata required by ARM RPC.
     *
     * @return the systemData value.
     */
    SystemMetadata systemData();

    /**
     * Gets the provisioningState property: State of the operation on the resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningStates provisioningState();

    /**
     * Gets the availabilityZones property: Logical zone for Disk Pool resource; example: ["1"].
     *
     * @return the availabilityZones value.
     */
    List<String> availabilityZones();

    /**
     * Gets the status property: Operational status of the Disk Pool.
     *
     * @return the status value.
     */
    OperationalStatus status();

    /**
     * Gets the disks property: List of Azure Managed Disks to attach to a Disk Pool.
     *
     * @return the disks value.
     */
    List<Disk> disks();

    /**
     * Gets the subnetId property: Azure Resource ID of a Subnet for the Disk Pool.
     *
     * @return the subnetId value.
     */
    String subnetId();

    /**
     * Gets the additionalCapabilities property: List of additional capabilities for Disk Pool.
     *
     * @return the additionalCapabilities value.
     */
    List<String> additionalCapabilities();

    /**
     * Gets the nameSkuName property: Sku name.
     *
     * @return the nameSkuName value.
     */
    String nameSkuName();

    /**
     * Gets the tier property: Sku tier.
     *
     * @return the tier value.
     */
    String tier();

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
     * Gets the inner com.azure.resourcemanager.storagepool.fluent.models.DiskPoolInner object.
     *
     * @return the inner object.
     */
    DiskPoolInner innerModel();

    /** The entirety of the DiskPool definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithSku,
            DefinitionStages.WithSubnetId,
            DefinitionStages.WithCreate {
    }
    /** The DiskPool definition stages. */
    interface DefinitionStages {
        /** The first stage of the DiskPool definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the DiskPool definition allowing to specify location. */
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
        /** The stage of the DiskPool definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithSku withExistingResourceGroup(String resourceGroupName);
        }
        /** The stage of the DiskPool definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: Determines the SKU of the Disk Pool.
             *
             * @param sku Determines the SKU of the Disk Pool.
             * @return the next definition stage.
             */
            WithSubnetId withSku(Sku sku);
        }
        /** The stage of the DiskPool definition allowing to specify subnetId. */
        interface WithSubnetId {
            /**
             * Specifies the subnetId property: Azure Resource ID of a Subnet for the Disk Pool..
             *
             * @param subnetId Azure Resource ID of a Subnet for the Disk Pool.
             * @return the next definition stage.
             */
            WithCreate withSubnetId(String subnetId);
        }
        /**
         * The stage of the DiskPool definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithAvailabilityZones,
                DefinitionStages.WithDisks,
                DefinitionStages.WithAdditionalCapabilities {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            DiskPool create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            DiskPool create(Context context);
        }
        /** The stage of the DiskPool definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the DiskPool definition allowing to specify availabilityZones. */
        interface WithAvailabilityZones {
            /**
             * Specifies the availabilityZones property: Logical zone for Disk Pool resource; example: ["1"]..
             *
             * @param availabilityZones Logical zone for Disk Pool resource; example: ["1"].
             * @return the next definition stage.
             */
            WithCreate withAvailabilityZones(List<String> availabilityZones);
        }
        /** The stage of the DiskPool definition allowing to specify disks. */
        interface WithDisks {
            /**
             * Specifies the disks property: List of Azure Managed Disks to attach to a Disk Pool..
             *
             * @param disks List of Azure Managed Disks to attach to a Disk Pool.
             * @return the next definition stage.
             */
            WithCreate withDisks(List<Disk> disks);
        }
        /** The stage of the DiskPool definition allowing to specify additionalCapabilities. */
        interface WithAdditionalCapabilities {
            /**
             * Specifies the additionalCapabilities property: List of additional capabilities for a Disk Pool..
             *
             * @param additionalCapabilities List of additional capabilities for a Disk Pool.
             * @return the next definition stage.
             */
            WithCreate withAdditionalCapabilities(List<String> additionalCapabilities);
        }
    }
    /**
     * Begins update for the DiskPool resource.
     *
     * @return the stage of resource update.
     */
    DiskPool.Update update();

    /** The template for DiskPool update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithDisks {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        DiskPool apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        DiskPool apply(Context context);
    }
    /** The DiskPool update stages. */
    interface UpdateStages {
        /** The stage of the DiskPool update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the DiskPool update allowing to specify disks. */
        interface WithDisks {
            /**
             * Specifies the disks property: List of Azure Managed Disks to attach to a Disk Pool..
             *
             * @param disks List of Azure Managed Disks to attach to a Disk Pool.
             * @return the next definition stage.
             */
            Update withDisks(List<Disk> disks);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    DiskPool refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    DiskPool refresh(Context context);

    /**
     * The operation to start a Disk Pool.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start();

    /**
     * The operation to start a Disk Pool.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(Context context);

    /**
     * Shuts down the Disk Pool and releases the compute resources. You are not billed for the compute resources that
     * this Disk Pool uses.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deallocate();

    /**
     * Shuts down the Disk Pool and releases the compute resources. You are not billed for the compute resources that
     * this Disk Pool uses.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deallocate(Context context);
}
