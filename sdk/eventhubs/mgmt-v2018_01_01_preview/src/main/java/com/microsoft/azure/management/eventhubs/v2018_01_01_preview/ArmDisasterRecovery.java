/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhubs.v2018_01_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.eventhubs.v2018_01_01_preview.implementation.ArmDisasterRecoveryInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.eventhubs.v2018_01_01_preview.implementation.EventHubsManager;

/**
 * Type representing ArmDisasterRecovery.
 */
public interface ArmDisasterRecovery extends HasInner<ArmDisasterRecoveryInner>, Indexable, Refreshable<ArmDisasterRecovery>, Updatable<ArmDisasterRecovery.Update>, HasManager<EventHubsManager> {
    /**
     * @return the alternateName value.
     */
    String alternateName();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the partnerNamespace value.
     */
    String partnerNamespace();

    /**
     * @return the pendingReplicationOperationsCount value.
     */
    Long pendingReplicationOperationsCount();

    /**
     * @return the provisioningState value.
     */
    ProvisioningStateDR provisioningState();

    /**
     * @return the role value.
     */
    RoleDisasterRecovery role();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the ArmDisasterRecovery definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithNamespace, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ArmDisasterRecovery definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ArmDisasterRecovery definition.
         */
        interface Blank extends WithNamespace {
        }

        /**
         * The stage of the armdisasterrecovery definition allowing to specify Namespace.
         */
        interface WithNamespace {
           /**
            * Specifies resourceGroupName, namespaceName.
            * @param resourceGroupName Name of the resource group within the azure subscription
            * @param namespaceName The Namespace name
            * @return the next definition stage
            */
            WithCreate withExistingNamespace(String resourceGroupName, String namespaceName);
        }

        /**
         * The stage of the armdisasterrecovery definition allowing to specify AlternateName.
         */
        interface WithAlternateName {
            /**
             * Specifies alternateName.
             * @param alternateName Alternate name specified when alias and namespace names are same
             * @return the next definition stage
             */
            WithCreate withAlternateName(String alternateName);
        }

        /**
         * The stage of the armdisasterrecovery definition allowing to specify PartnerNamespace.
         */
        interface WithPartnerNamespace {
            /**
             * Specifies partnerNamespace.
             * @param partnerNamespace ARM Id of the Primary/Secondary eventhub namespace name, which is part of GEO DR pairing
             * @return the next definition stage
             */
            WithCreate withPartnerNamespace(String partnerNamespace);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ArmDisasterRecovery>, DefinitionStages.WithAlternateName, DefinitionStages.WithPartnerNamespace {
        }
    }
    /**
     * The template for a ArmDisasterRecovery update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ArmDisasterRecovery>, UpdateStages.WithAlternateName, UpdateStages.WithPartnerNamespace {
    }

    /**
     * Grouping of ArmDisasterRecovery update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the armdisasterrecovery update allowing to specify AlternateName.
         */
        interface WithAlternateName {
            /**
             * Specifies alternateName.
             * @param alternateName Alternate name specified when alias and namespace names are same
             * @return the next update stage
             */
            Update withAlternateName(String alternateName);
        }

        /**
         * The stage of the armdisasterrecovery update allowing to specify PartnerNamespace.
         */
        interface WithPartnerNamespace {
            /**
             * Specifies partnerNamespace.
             * @param partnerNamespace ARM Id of the Primary/Secondary eventhub namespace name, which is part of GEO DR pairing
             * @return the next update stage
             */
            Update withPartnerNamespace(String partnerNamespace);
        }

    }
}
