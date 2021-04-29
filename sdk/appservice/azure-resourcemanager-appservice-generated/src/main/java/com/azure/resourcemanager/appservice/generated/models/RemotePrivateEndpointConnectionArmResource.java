// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.RemotePrivateEndpointConnectionArmResourceInner;
import java.util.List;

/** An immutable client-side representation of RemotePrivateEndpointConnectionArmResource. */
public interface RemotePrivateEndpointConnectionArmResource {
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
     * Gets the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the provisioningState property: The provisioningState property.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the privateEndpoint property: PrivateEndpoint of a remote private endpoint connection.
     *
     * @return the privateEndpoint value.
     */
    ArmIdWrapper privateEndpoint();

    /**
     * Gets the privateLinkServiceConnectionState property: The state of a private link connection.
     *
     * @return the privateLinkServiceConnectionState value.
     */
    PrivateLinkConnectionState privateLinkServiceConnectionState();

    /**
     * Gets the ipAddresses property: Private IPAddresses mapped to the remote private endpoint.
     *
     * @return the ipAddresses value.
     */
    List<String> ipAddresses();

    /**
     * Gets the inner
     * com.azure.resourcemanager.appservice.generated.fluent.models.RemotePrivateEndpointConnectionArmResourceInner
     * object.
     *
     * @return the inner object.
     */
    RemotePrivateEndpointConnectionArmResourceInner innerModel();

    /** The entirety of the RemotePrivateEndpointConnectionArmResource definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The RemotePrivateEndpointConnectionArmResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the RemotePrivateEndpointConnectionArmResource definition. */
        interface Blank extends WithParentResource {
        }
        /**
         * The stage of the RemotePrivateEndpointConnectionArmResource definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, name.
             *
             * @param resourceGroupName Name of the resource group to which the resource belongs.
             * @param name Name of the site.
             * @return the next definition stage.
             */
            WithCreate withExistingSite(String resourceGroupName, String name);
        }
        /**
         * The stage of the RemotePrivateEndpointConnectionArmResource definition which contains all the minimum
         * required properties for the resource to be created, but also allows for any other optional properties to be
         * specified.
         */
        interface WithCreate extends DefinitionStages.WithKind, DefinitionStages.WithPrivateLinkServiceConnectionState {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            RemotePrivateEndpointConnectionArmResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            RemotePrivateEndpointConnectionArmResource create(Context context);
        }
        /** The stage of the RemotePrivateEndpointConnectionArmResource definition allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: Kind of resource..
             *
             * @param kind Kind of resource.
             * @return the next definition stage.
             */
            WithCreate withKind(String kind);
        }
        /**
         * The stage of the RemotePrivateEndpointConnectionArmResource definition allowing to specify
         * privateLinkServiceConnectionState.
         */
        interface WithPrivateLinkServiceConnectionState {
            /**
             * Specifies the privateLinkServiceConnectionState property: The state of a private link connection.
             *
             * @param privateLinkServiceConnectionState The state of a private link connection.
             * @return the next definition stage.
             */
            WithCreate withPrivateLinkServiceConnectionState(
                PrivateLinkConnectionState privateLinkServiceConnectionState);
        }
    }
    /**
     * Begins update for the RemotePrivateEndpointConnectionArmResource resource.
     *
     * @return the stage of resource update.
     */
    RemotePrivateEndpointConnectionArmResource.Update update();

    /** The template for RemotePrivateEndpointConnectionArmResource update. */
    interface Update extends UpdateStages.WithKind, UpdateStages.WithPrivateLinkServiceConnectionState {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        RemotePrivateEndpointConnectionArmResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        RemotePrivateEndpointConnectionArmResource apply(Context context);
    }
    /** The RemotePrivateEndpointConnectionArmResource update stages. */
    interface UpdateStages {
        /** The stage of the RemotePrivateEndpointConnectionArmResource update allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: Kind of resource..
             *
             * @param kind Kind of resource.
             * @return the next definition stage.
             */
            Update withKind(String kind);
        }
        /**
         * The stage of the RemotePrivateEndpointConnectionArmResource update allowing to specify
         * privateLinkServiceConnectionState.
         */
        interface WithPrivateLinkServiceConnectionState {
            /**
             * Specifies the privateLinkServiceConnectionState property: The state of a private link connection.
             *
             * @param privateLinkServiceConnectionState The state of a private link connection.
             * @return the next definition stage.
             */
            Update withPrivateLinkServiceConnectionState(PrivateLinkConnectionState privateLinkServiceConnectionState);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    RemotePrivateEndpointConnectionArmResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    RemotePrivateEndpointConnectionArmResource refresh(Context context);
}
