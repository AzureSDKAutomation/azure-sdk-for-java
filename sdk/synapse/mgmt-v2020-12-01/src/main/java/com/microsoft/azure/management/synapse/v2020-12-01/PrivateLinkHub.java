/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020-12-01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.synapse.v2020-12-01.implementation.SynapseManager;
import java.util.List;
import com.microsoft.azure.management.synapse.v2020-12-01.implementation.PrivateLinkHubInner;

/**
 * Type representing PrivateLinkHub.
 */
public interface PrivateLinkHub extends HasInner<PrivateLinkHubInner>, Resource, GroupableResourceCore<SynapseManager, PrivateLinkHubInner>, HasResourceGroup, Refreshable<PrivateLinkHub>, Updatable<PrivateLinkHub.Update>, HasManager<SynapseManager> {
    /**
     * @return the privateEndpointConnections value.
     */
    List<PrivateEndpointConnectionForPrivateLinkHubBasic> privateEndpointConnections();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * The entirety of the PrivateLinkHub definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of PrivateLinkHub definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a PrivateLinkHub definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the PrivateLinkHub definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the privatelinkhub definition allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             * @param provisioningState PrivateLinkHub provisioning state
             * @return the next definition stage
             */
            WithCreate withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<PrivateLinkHub>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithProvisioningState {
        }
    }
    /**
     * The template for a PrivateLinkHub update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<PrivateLinkHub>, Resource.UpdateWithTags<Update>, UpdateStages.WithProvisioningState {
    }

    /**
     * Grouping of PrivateLinkHub update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the privatelinkhub update allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             * @param provisioningState PrivateLinkHub provisioning state
             * @return the next update stage
             */
            Update withProvisioningState(String provisioningState);
        }

    }
}
