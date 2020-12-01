/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_02_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.netapp.v2020_02_01.implementation.CapacityPoolInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.netapp.v2020_02_01.implementation.NetAppManager;
import java.util.Map;

/**
 * Type representing CapacityPool.
 */
public interface CapacityPool extends HasInner<CapacityPoolInner>, Indexable, Refreshable<CapacityPool>, Updatable<CapacityPool.Update>, HasManager<NetAppManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the poolId value.
     */
    String poolId();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the serviceLevel value.
     */
    PoolServiceLevel serviceLevel();

    /**
     * @return the size value.
     */
    long size();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the CapacityPool definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithNetAppAccount, DefinitionStages.WithLocation, DefinitionStages.WithServiceLevel, DefinitionStages.WithSize, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of CapacityPool definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a CapacityPool definition.
         */
        interface Blank extends WithNetAppAccount {
        }

        /**
         * The stage of the capacitypool definition allowing to specify NetAppAccount.
         */
        interface WithNetAppAccount {
           /**
            * Specifies resourceGroupName, accountName.
            * @param resourceGroupName The name of the resource group
            * @param accountName The name of the NetApp account
            * @return the next definition stage
            */
            WithLocation withExistingNetAppAccount(String resourceGroupName, String accountName);
        }

        /**
         * The stage of the capacitypool definition allowing to specify Location.
         */
        interface WithLocation {
           /**
            * Specifies location.
            * @param location the location parameter value
            * @return the next definition stage
            */
            WithServiceLevel withLocation(String location);
        }

        /**
         * The stage of the capacitypool definition allowing to specify ServiceLevel.
         */
        interface WithServiceLevel {
           /**
            * Specifies serviceLevel.
            * @param serviceLevel The service level of the file system. Possible values include: 'Standard', 'Premium', 'Ultra'
            * @return the next definition stage
            */
            WithSize withServiceLevel(PoolServiceLevel serviceLevel);
        }

        /**
         * The stage of the capacitypool definition allowing to specify Size.
         */
        interface WithSize {
           /**
            * Specifies size.
            * @param size Provisioned size of the pool (in bytes). Allowed values are in 4TiB chunks (value must be multiply of 4398046511104)
            * @return the next definition stage
            */
            WithCreate withSize(long size);
        }

        /**
         * The stage of the capacitypool definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags the tags parameter value
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<CapacityPool>, DefinitionStages.WithTags {
        }
    }
    /**
     * The template for a CapacityPool update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<CapacityPool>, UpdateStages.WithServiceLevel, UpdateStages.WithSize, UpdateStages.WithTags {
    }

    /**
     * Grouping of CapacityPool update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the capacitypool update allowing to specify ServiceLevel.
         */
        interface WithServiceLevel {
            /**
             * Specifies serviceLevel.
             * @param serviceLevel The service level of the file system. Possible values include: 'Standard', 'Premium', 'Ultra'
             * @return the next update stage
             */
            Update withServiceLevel(PatchServiceLevel serviceLevel);
        }

        /**
         * The stage of the capacitypool update allowing to specify Size.
         */
        interface WithSize {
            /**
             * Specifies size.
             * @param size Provisioned size of the pool (in bytes). Allowed values are in 4TiB chunks (value must be multiply of 4398046511104)
             * @return the next update stage
             */
            Update withSize(Long size);
        }

        /**
         * The stage of the capacitypool update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags the tags parameter value
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

    }
}
