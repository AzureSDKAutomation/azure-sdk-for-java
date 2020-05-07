/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.peering.v2019_09_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.peering.v2019_09_01_preview.implementation.PeeringManager;
import com.microsoft.azure.management.peering.v2019_09_01_preview.implementation.PeeringServiceInner;

/**
 * Type representing PeeringService.
 */
public interface PeeringService extends HasInner<PeeringServiceInner>, Resource, GroupableResourceCore<PeeringManager, PeeringServiceInner>, HasResourceGroup, Refreshable<PeeringService>, Updatable<PeeringService.Update>, HasManager<PeeringManager> {
    /**
     * @return the peeringServiceLocation value.
     */
    String peeringServiceLocation();

    /**
     * @return the peeringServiceProvider value.
     */
    String peeringServiceProvider();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * The entirety of the PeeringService definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of PeeringService definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a PeeringService definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the PeeringService definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the peeringservice definition allowing to specify PeeringServiceLocation.
         */
        interface WithPeeringServiceLocation {
            /**
             * Specifies peeringServiceLocation.
             * @param peeringServiceLocation The PeeringServiceLocation of the Customer
             * @return the next definition stage
             */
            WithCreate withPeeringServiceLocation(String peeringServiceLocation);
        }

        /**
         * The stage of the peeringservice definition allowing to specify PeeringServiceProvider.
         */
        interface WithPeeringServiceProvider {
            /**
             * Specifies peeringServiceProvider.
             * @param peeringServiceProvider The MAPS Provider Name
             * @return the next definition stage
             */
            WithCreate withPeeringServiceProvider(String peeringServiceProvider);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<PeeringService>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithPeeringServiceLocation, DefinitionStages.WithPeeringServiceProvider {
        }
    }
    /**
     * The template for a PeeringService update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<PeeringService>, Resource.UpdateWithTags<Update>, UpdateStages.WithPeeringServiceLocation, UpdateStages.WithPeeringServiceProvider {
    }

    /**
     * Grouping of PeeringService update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the peeringservice update allowing to specify PeeringServiceLocation.
         */
        interface WithPeeringServiceLocation {
            /**
             * Specifies peeringServiceLocation.
             * @param peeringServiceLocation The PeeringServiceLocation of the Customer
             * @return the next update stage
             */
            Update withPeeringServiceLocation(String peeringServiceLocation);
        }

        /**
         * The stage of the peeringservice update allowing to specify PeeringServiceProvider.
         */
        interface WithPeeringServiceProvider {
            /**
             * Specifies peeringServiceProvider.
             * @param peeringServiceProvider The MAPS Provider Name
             * @return the next update stage
             */
            Update withPeeringServiceProvider(String peeringServiceProvider);
        }

    }
}
