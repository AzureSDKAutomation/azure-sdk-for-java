/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.privatedns.v2020_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.privatedns.v2020_06_01.implementation.VirtualNetworkLinkInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.privatedns.v2020_06_01.implementation.privatednsManager;
import java.util.Map;
import com.microsoft.azure.SubResource;

/**
 * Type representing VirtualNetworkLink.
 */
public interface VirtualNetworkLink extends HasInner<VirtualNetworkLinkInner>, Indexable, Refreshable<VirtualNetworkLink>, Updatable<VirtualNetworkLink.Update>, HasManager<privatednsManager> {
    /**
     * @return the etag value.
     */
    String etag();

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
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the registrationEnabled value.
     */
    Boolean registrationEnabled();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the virtualNetwork value.
     */
    SubResource virtualNetwork();

    /**
     * @return the virtualNetworkLinkState value.
     */
    VirtualNetworkLinkState virtualNetworkLinkState();

    /**
     * The entirety of the VirtualNetworkLink definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithPrivateDnsZone, DefinitionStages.WithIfMatch, DefinitionStages.WithIfNoneMatch, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of VirtualNetworkLink definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a VirtualNetworkLink definition.
         */
        interface Blank extends WithPrivateDnsZone {
        }

        /**
         * The stage of the virtualnetworklink definition allowing to specify PrivateDnsZone.
         */
        interface WithPrivateDnsZone {
           /**
            * Specifies resourceGroupName, privateZoneName.
            * @param resourceGroupName The name of the resource group
            * @param privateZoneName The name of the Private DNS zone (without a terminating dot)
            * @return the next definition stage
            */
            WithIfMatch withExistingPrivateDnsZone(String resourceGroupName, String privateZoneName);
        }

        /**
         * The stage of the virtualnetworklink definition allowing to specify IfMatch.
         */
        interface WithIfMatch {
           /**
            * Specifies ifMatch.
            * @param ifMatch The ETag of the virtual network link to the Private DNS zone. Omit this value to always overwrite the current virtual network link. Specify the last-seen ETag value to prevent accidentally overwriting any concurrent changes
            * @return the next definition stage
            */
            WithIfNoneMatch withIfMatch(String ifMatch);
        }

        /**
         * The stage of the virtualnetworklink definition allowing to specify IfNoneMatch.
         */
        interface WithIfNoneMatch {
           /**
            * Specifies ifNoneMatch.
            * @param ifNoneMatch Set to '*' to allow a new virtual network link to the Private DNS zone to be created, but to prevent updating an existing link. Other values will be ignored
            * @return the next definition stage
            */
            WithCreate withIfNoneMatch(String ifNoneMatch);
        }

        /**
         * The stage of the virtualnetworklink definition allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             * @param etag The ETag of the virtual network link
             * @return the next definition stage
             */
            WithCreate withEtag(String etag);
        }

        /**
         * The stage of the virtualnetworklink definition allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location The Azure Region where the resource lives
             * @return the next definition stage
             */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the virtualnetworklink definition allowing to specify RegistrationEnabled.
         */
        interface WithRegistrationEnabled {
            /**
             * Specifies registrationEnabled.
             * @param registrationEnabled Is auto-registration of virtual machine records in the virtual network in the Private DNS zone enabled?
             * @return the next definition stage
             */
            WithCreate withRegistrationEnabled(Boolean registrationEnabled);
        }

        /**
         * The stage of the virtualnetworklink definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Resource tags
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the virtualnetworklink definition allowing to specify VirtualNetwork.
         */
        interface WithVirtualNetwork {
            /**
             * Specifies virtualNetwork.
             * @param virtualNetwork The reference of the virtual network
             * @return the next definition stage
             */
            WithCreate withVirtualNetwork(SubResource virtualNetwork);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<VirtualNetworkLink>, DefinitionStages.WithEtag, DefinitionStages.WithLocation, DefinitionStages.WithRegistrationEnabled, DefinitionStages.WithTags, DefinitionStages.WithVirtualNetwork {
        }
    }
    /**
     * The template for a VirtualNetworkLink update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<VirtualNetworkLink>, UpdateStages.WithIfMatch, UpdateStages.WithEtag, UpdateStages.WithLocation, UpdateStages.WithRegistrationEnabled, UpdateStages.WithTags, UpdateStages.WithVirtualNetwork {
    }

    /**
     * Grouping of VirtualNetworkLink update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the virtualnetworklink update allowing to specify IfMatch.
         */
        interface WithIfMatch {
            /**
             * Specifies ifMatch.
             * @param ifMatch The ETag of the virtual network link to the Private DNS zone. Omit this value to always overwrite the current virtual network link. Specify the last-seen ETag value to prevent accidentally overwriting any concurrent changes
             * @return the next update stage
             */
            Update withIfMatch(String ifMatch);
        }

        /**
         * The stage of the virtualnetworklink update allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             * @param etag The ETag of the virtual network link
             * @return the next update stage
             */
            Update withEtag(String etag);
        }

        /**
         * The stage of the virtualnetworklink update allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location The Azure Region where the resource lives
             * @return the next update stage
             */
            Update withLocation(String location);
        }

        /**
         * The stage of the virtualnetworklink update allowing to specify RegistrationEnabled.
         */
        interface WithRegistrationEnabled {
            /**
             * Specifies registrationEnabled.
             * @param registrationEnabled Is auto-registration of virtual machine records in the virtual network in the Private DNS zone enabled?
             * @return the next update stage
             */
            Update withRegistrationEnabled(Boolean registrationEnabled);
        }

        /**
         * The stage of the virtualnetworklink update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Resource tags
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the virtualnetworklink update allowing to specify VirtualNetwork.
         */
        interface WithVirtualNetwork {
            /**
             * Specifies virtualNetwork.
             * @param virtualNetwork The reference of the virtual network
             * @return the next update stage
             */
            Update withVirtualNetwork(SubResource virtualNetwork);
        }

    }
}
