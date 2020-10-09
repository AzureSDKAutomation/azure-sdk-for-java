/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.peering.v2020_10_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.peering.v2020_10_01.implementation.PeeringRegisteredAsnInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.peering.v2020_10_01.implementation.PeeringManager;

/**
 * Type representing PeeringRegisteredAsn.
 */
public interface PeeringRegisteredAsn extends HasInner<PeeringRegisteredAsnInner>, Indexable, Refreshable<PeeringRegisteredAsn>, Updatable<PeeringRegisteredAsn.Update>, HasManager<PeeringManager> {
    /**
     * @return the asn value.
     */
    Integer asn();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the peeringServicePrefixKey value.
     */
    String peeringServicePrefixKey();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the PeeringRegisteredAsn definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithPeering, DefinitionStages.WithAsn, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of PeeringRegisteredAsn definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a PeeringRegisteredAsn definition.
         */
        interface Blank extends WithPeering {
        }

        /**
         * The stage of the peeringregisteredasn definition allowing to specify Peering.
         */
        interface WithPeering {
           /**
            * Specifies resourceGroupName, peeringName.
            * @param resourceGroupName The name of the resource group
            * @param peeringName The name of the peering
            * @return the next definition stage
            */
            WithAsn withExistingPeering(String resourceGroupName, String peeringName);
        }

        /**
         * The stage of the peeringregisteredasn definition allowing to specify Asn.
         */
        interface WithAsn {
           /**
            * Specifies asn.
            * @param asn The customer's ASN from which traffic originates
            * @return the next definition stage
            */
            WithCreate withAsn(Integer asn);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<PeeringRegisteredAsn> {
        }
    }
    /**
     * The template for a PeeringRegisteredAsn update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<PeeringRegisteredAsn>, UpdateStages.WithAsn {
    }

    /**
     * Grouping of PeeringRegisteredAsn update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the peeringregisteredasn update allowing to specify Asn.
         */
        interface WithAsn {
            /**
             * Specifies asn.
             * @param asn The customer's ASN from which traffic originates
             * @return the next update stage
             */
            Update withAsn(Integer asn);
        }

    }
}
