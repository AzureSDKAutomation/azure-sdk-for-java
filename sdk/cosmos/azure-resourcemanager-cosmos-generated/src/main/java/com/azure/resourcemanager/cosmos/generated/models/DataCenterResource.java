// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.cosmos.generated.fluent.models.DataCenterResourceInner;

/** An immutable client-side representation of DataCenterResource. */
public interface DataCenterResource {
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
     * Gets the properties property: Properties of a managed Cassandra data center.
     *
     * @return the properties value.
     */
    DataCenterResourceProperties properties();

    /**
     * Gets the inner com.azure.resourcemanager.cosmos.generated.fluent.models.DataCenterResourceInner object.
     *
     * @return the inner object.
     */
    DataCenterResourceInner innerModel();

    /** The entirety of the DataCenterResource definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The DataCenterResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the DataCenterResource definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the DataCenterResource definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, clusterName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param clusterName Managed Cassandra cluster name.
             * @return the next definition stage.
             */
            WithCreate withExistingCassandraCluster(String resourceGroupName, String clusterName);
        }
        /**
         * The stage of the DataCenterResource definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            DataCenterResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            DataCenterResource create(Context context);
        }
        /** The stage of the DataCenterResource definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Properties of a managed Cassandra data center..
             *
             * @param properties Properties of a managed Cassandra data center.
             * @return the next definition stage.
             */
            WithCreate withProperties(DataCenterResourceProperties properties);
        }
    }
    /**
     * Begins update for the DataCenterResource resource.
     *
     * @return the stage of resource update.
     */
    DataCenterResource.Update update();

    /** The template for DataCenterResource update. */
    interface Update extends UpdateStages.WithProperties {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        DataCenterResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        DataCenterResource apply(Context context);
    }
    /** The DataCenterResource update stages. */
    interface UpdateStages {
        /** The stage of the DataCenterResource update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Properties of a managed Cassandra data center..
             *
             * @param properties Properties of a managed Cassandra data center.
             * @return the next definition stage.
             */
            Update withProperties(DataCenterResourceProperties properties);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    DataCenterResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    DataCenterResource refresh(Context context);
}
