// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCircuitConnectionInner;

/** An immutable client-side representation of ExpressRouteCircuitConnection. */
public interface ExpressRouteCircuitConnection {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the type property: Type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the expressRouteCircuitPeering property: Reference to Express Route Circuit Private Peering Resource of the
     * circuit initiating connection.
     *
     * @return the expressRouteCircuitPeering value.
     */
    SubResource expressRouteCircuitPeering();

    /**
     * Gets the peerExpressRouteCircuitPeering property: Reference to Express Route Circuit Private Peering Resource of
     * the peered circuit.
     *
     * @return the peerExpressRouteCircuitPeering value.
     */
    SubResource peerExpressRouteCircuitPeering();

    /**
     * Gets the addressPrefix property: /29 IP address space to carve out Customer addresses for tunnels.
     *
     * @return the addressPrefix value.
     */
    String addressPrefix();

    /**
     * Gets the authorizationKey property: The authorization key.
     *
     * @return the authorizationKey value.
     */
    String authorizationKey();

    /**
     * Gets the ipv6CircuitConnectionConfig property: IPv6 Address PrefixProperties of the express route circuit
     * connection.
     *
     * @return the ipv6CircuitConnectionConfig value.
     */
    Ipv6CircuitConnectionConfig ipv6CircuitConnectionConfig();

    /**
     * Gets the circuitConnectionStatus property: Express Route Circuit connection state.
     *
     * @return the circuitConnectionStatus value.
     */
    CircuitConnectionStatus circuitConnectionStatus();

    /**
     * Gets the provisioningState property: The provisioning state of the express route circuit connection resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCircuitConnectionInner
     * object.
     *
     * @return the inner object.
     */
    ExpressRouteCircuitConnectionInner innerModel();

    /** The entirety of the ExpressRouteCircuitConnection definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The ExpressRouteCircuitConnection definition stages. */
    interface DefinitionStages {
        /** The first stage of the ExpressRouteCircuitConnection definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the ExpressRouteCircuitConnection definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, circuitName, peeringName.
             *
             * @param resourceGroupName The name of the resource group.
             * @param circuitName The name of the express route circuit.
             * @param peeringName The name of the peering.
             * @return the next definition stage.
             */
            WithCreate withExistingPeering(String resourceGroupName, String circuitName, String peeringName);
        }
        /**
         * The stage of the ExpressRouteCircuitConnection definition which contains all the minimum required properties
         * for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithName,
                DefinitionStages.WithExpressRouteCircuitPeering,
                DefinitionStages.WithPeerExpressRouteCircuitPeering,
                DefinitionStages.WithAddressPrefix,
                DefinitionStages.WithAuthorizationKey,
                DefinitionStages.WithIpv6CircuitConnectionConfig {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ExpressRouteCircuitConnection create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ExpressRouteCircuitConnection create(Context context);
        }
        /** The stage of the ExpressRouteCircuitConnection definition allowing to specify name. */
        interface WithName {
            /**
             * Specifies the name property: The name of the resource that is unique within a resource group. This name
             * can be used to access the resource..
             *
             * @param name The name of the resource that is unique within a resource group. This name can be used to
             *     access the resource.
             * @return the next definition stage.
             */
            WithCreate withName(String name);
        }
        /** The stage of the ExpressRouteCircuitConnection definition allowing to specify expressRouteCircuitPeering. */
        interface WithExpressRouteCircuitPeering {
            /**
             * Specifies the expressRouteCircuitPeering property: Reference to Express Route Circuit Private Peering
             * Resource of the circuit initiating connection..
             *
             * @param expressRouteCircuitPeering Reference to Express Route Circuit Private Peering Resource of the
             *     circuit initiating connection.
             * @return the next definition stage.
             */
            WithCreate withExpressRouteCircuitPeering(SubResource expressRouteCircuitPeering);
        }
        /**
         * The stage of the ExpressRouteCircuitConnection definition allowing to specify peerExpressRouteCircuitPeering.
         */
        interface WithPeerExpressRouteCircuitPeering {
            /**
             * Specifies the peerExpressRouteCircuitPeering property: Reference to Express Route Circuit Private Peering
             * Resource of the peered circuit..
             *
             * @param peerExpressRouteCircuitPeering Reference to Express Route Circuit Private Peering Resource of the
             *     peered circuit.
             * @return the next definition stage.
             */
            WithCreate withPeerExpressRouteCircuitPeering(SubResource peerExpressRouteCircuitPeering);
        }
        /** The stage of the ExpressRouteCircuitConnection definition allowing to specify addressPrefix. */
        interface WithAddressPrefix {
            /**
             * Specifies the addressPrefix property: /29 IP address space to carve out Customer addresses for tunnels..
             *
             * @param addressPrefix /29 IP address space to carve out Customer addresses for tunnels.
             * @return the next definition stage.
             */
            WithCreate withAddressPrefix(String addressPrefix);
        }
        /** The stage of the ExpressRouteCircuitConnection definition allowing to specify authorizationKey. */
        interface WithAuthorizationKey {
            /**
             * Specifies the authorizationKey property: The authorization key..
             *
             * @param authorizationKey The authorization key.
             * @return the next definition stage.
             */
            WithCreate withAuthorizationKey(String authorizationKey);
        }
        /**
         * The stage of the ExpressRouteCircuitConnection definition allowing to specify ipv6CircuitConnectionConfig.
         */
        interface WithIpv6CircuitConnectionConfig {
            /**
             * Specifies the ipv6CircuitConnectionConfig property: IPv6 Address PrefixProperties of the express route
             * circuit connection..
             *
             * @param ipv6CircuitConnectionConfig IPv6 Address PrefixProperties of the express route circuit connection.
             * @return the next definition stage.
             */
            WithCreate withIpv6CircuitConnectionConfig(Ipv6CircuitConnectionConfig ipv6CircuitConnectionConfig);
        }
    }
    /**
     * Begins update for the ExpressRouteCircuitConnection resource.
     *
     * @return the stage of resource update.
     */
    ExpressRouteCircuitConnection.Update update();

    /** The template for ExpressRouteCircuitConnection update. */
    interface Update
        extends UpdateStages.WithName,
            UpdateStages.WithExpressRouteCircuitPeering,
            UpdateStages.WithPeerExpressRouteCircuitPeering,
            UpdateStages.WithAddressPrefix,
            UpdateStages.WithAuthorizationKey,
            UpdateStages.WithIpv6CircuitConnectionConfig {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ExpressRouteCircuitConnection apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ExpressRouteCircuitConnection apply(Context context);
    }
    /** The ExpressRouteCircuitConnection update stages. */
    interface UpdateStages {
        /** The stage of the ExpressRouteCircuitConnection update allowing to specify name. */
        interface WithName {
            /**
             * Specifies the name property: The name of the resource that is unique within a resource group. This name
             * can be used to access the resource..
             *
             * @param name The name of the resource that is unique within a resource group. This name can be used to
             *     access the resource.
             * @return the next definition stage.
             */
            Update withName(String name);
        }
        /** The stage of the ExpressRouteCircuitConnection update allowing to specify expressRouteCircuitPeering. */
        interface WithExpressRouteCircuitPeering {
            /**
             * Specifies the expressRouteCircuitPeering property: Reference to Express Route Circuit Private Peering
             * Resource of the circuit initiating connection..
             *
             * @param expressRouteCircuitPeering Reference to Express Route Circuit Private Peering Resource of the
             *     circuit initiating connection.
             * @return the next definition stage.
             */
            Update withExpressRouteCircuitPeering(SubResource expressRouteCircuitPeering);
        }
        /** The stage of the ExpressRouteCircuitConnection update allowing to specify peerExpressRouteCircuitPeering. */
        interface WithPeerExpressRouteCircuitPeering {
            /**
             * Specifies the peerExpressRouteCircuitPeering property: Reference to Express Route Circuit Private Peering
             * Resource of the peered circuit..
             *
             * @param peerExpressRouteCircuitPeering Reference to Express Route Circuit Private Peering Resource of the
             *     peered circuit.
             * @return the next definition stage.
             */
            Update withPeerExpressRouteCircuitPeering(SubResource peerExpressRouteCircuitPeering);
        }
        /** The stage of the ExpressRouteCircuitConnection update allowing to specify addressPrefix. */
        interface WithAddressPrefix {
            /**
             * Specifies the addressPrefix property: /29 IP address space to carve out Customer addresses for tunnels..
             *
             * @param addressPrefix /29 IP address space to carve out Customer addresses for tunnels.
             * @return the next definition stage.
             */
            Update withAddressPrefix(String addressPrefix);
        }
        /** The stage of the ExpressRouteCircuitConnection update allowing to specify authorizationKey. */
        interface WithAuthorizationKey {
            /**
             * Specifies the authorizationKey property: The authorization key..
             *
             * @param authorizationKey The authorization key.
             * @return the next definition stage.
             */
            Update withAuthorizationKey(String authorizationKey);
        }
        /** The stage of the ExpressRouteCircuitConnection update allowing to specify ipv6CircuitConnectionConfig. */
        interface WithIpv6CircuitConnectionConfig {
            /**
             * Specifies the ipv6CircuitConnectionConfig property: IPv6 Address PrefixProperties of the express route
             * circuit connection..
             *
             * @param ipv6CircuitConnectionConfig IPv6 Address PrefixProperties of the express route circuit connection.
             * @return the next definition stage.
             */
            Update withIpv6CircuitConnectionConfig(Ipv6CircuitConnectionConfig ipv6CircuitConnectionConfig);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ExpressRouteCircuitConnection refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ExpressRouteCircuitConnection refresh(Context context);
}
