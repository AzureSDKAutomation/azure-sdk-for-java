// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.HubRouteTableInner;
import java.util.List;

/** An immutable client-side representation of HubRouteTable. */
public interface HubRouteTable {
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
     * Gets the type property: Resource type.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the routes property: List of all routes.
     *
     * @return the routes value.
     */
    List<HubRoute> routes();

    /**
     * Gets the labels property: List of labels associated with this route table.
     *
     * @return the labels value.
     */
    List<String> labels();

    /**
     * Gets the associatedConnections property: List of all connections associated with this route table.
     *
     * @return the associatedConnections value.
     */
    List<String> associatedConnections();

    /**
     * Gets the propagatingConnections property: List of all connections that advertise to this route table.
     *
     * @return the propagatingConnections value.
     */
    List<String> propagatingConnections();

    /**
     * Gets the provisioningState property: The provisioning state of the RouteTable resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.HubRouteTableInner object.
     *
     * @return the inner object.
     */
    HubRouteTableInner innerModel();

    /** The entirety of the HubRouteTable definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The HubRouteTable definition stages. */
    interface DefinitionStages {
        /** The first stage of the HubRouteTable definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the HubRouteTable definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, virtualHubName.
             *
             * @param resourceGroupName The resource group name of the VirtualHub.
             * @param virtualHubName The name of the VirtualHub.
             * @return the next definition stage.
             */
            WithCreate withExistingVirtualHub(String resourceGroupName, String virtualHubName);
        }
        /**
         * The stage of the HubRouteTable definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithName, DefinitionStages.WithRoutes, DefinitionStages.WithLabels {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            HubRouteTable create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            HubRouteTable create(Context context);
        }
        /** The stage of the HubRouteTable definition allowing to specify name. */
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
        /** The stage of the HubRouteTable definition allowing to specify routes. */
        interface WithRoutes {
            /**
             * Specifies the routes property: List of all routes..
             *
             * @param routes List of all routes.
             * @return the next definition stage.
             */
            WithCreate withRoutes(List<HubRoute> routes);
        }
        /** The stage of the HubRouteTable definition allowing to specify labels. */
        interface WithLabels {
            /**
             * Specifies the labels property: List of labels associated with this route table..
             *
             * @param labels List of labels associated with this route table.
             * @return the next definition stage.
             */
            WithCreate withLabels(List<String> labels);
        }
    }
    /**
     * Begins update for the HubRouteTable resource.
     *
     * @return the stage of resource update.
     */
    HubRouteTable.Update update();

    /** The template for HubRouteTable update. */
    interface Update extends UpdateStages.WithName, UpdateStages.WithRoutes, UpdateStages.WithLabels {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        HubRouteTable apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        HubRouteTable apply(Context context);
    }
    /** The HubRouteTable update stages. */
    interface UpdateStages {
        /** The stage of the HubRouteTable update allowing to specify name. */
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
        /** The stage of the HubRouteTable update allowing to specify routes. */
        interface WithRoutes {
            /**
             * Specifies the routes property: List of all routes..
             *
             * @param routes List of all routes.
             * @return the next definition stage.
             */
            Update withRoutes(List<HubRoute> routes);
        }
        /** The stage of the HubRouteTable update allowing to specify labels. */
        interface WithLabels {
            /**
             * Specifies the labels property: List of labels associated with this route table..
             *
             * @param labels List of labels associated with this route table.
             * @return the next definition stage.
             */
            Update withLabels(List<String> labels);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    HubRouteTable refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    HubRouteTable refresh(Context context);
}
