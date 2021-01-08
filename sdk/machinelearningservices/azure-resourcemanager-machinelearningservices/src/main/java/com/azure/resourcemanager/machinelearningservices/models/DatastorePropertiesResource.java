// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearningservices.fluent.models.DatastorePropertiesInner;
import com.azure.resourcemanager.machinelearningservices.fluent.models.DatastorePropertiesResourceInner;

/** An immutable client-side representation of DatastorePropertiesResource. */
public interface DatastorePropertiesResource {
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
     * Gets the properties property: The properties property.
     *
     * @return the properties value.
     */
    DatastoreProperties properties();

    /**
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the inner com.azure.resourcemanager.machinelearningservices.fluent.models.DatastorePropertiesResourceInner
     * object.
     *
     * @return the inner object.
     */
    DatastorePropertiesResourceInner innerModel();

    /** The entirety of the DatastorePropertiesResource definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithProperties,
            DefinitionStages.WithCreate {
    }
    /** The DatastorePropertiesResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the DatastorePropertiesResource definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the DatastorePropertiesResource definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, workspaceName.
             *
             * @param resourceGroupName Name of the resource group in which workspace is located.
             * @param workspaceName Name of Azure Machine Learning workspace.
             * @return the next definition stage.
             */
            WithProperties withExistingWorkspace(String resourceGroupName, String workspaceName);
        }
        /** The stage of the DatastorePropertiesResource definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: The properties property..
             *
             * @param properties The properties property.
             * @return the next definition stage.
             */
            WithCreate withProperties(DatastorePropertiesInner properties);
        }
        /**
         * The stage of the DatastorePropertiesResource definition which contains all the minimum required properties
         * for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            DatastorePropertiesResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            DatastorePropertiesResource create(Context context);
        }
    }
    /**
     * Begins update for the DatastorePropertiesResource resource.
     *
     * @return the stage of resource update.
     */
    DatastorePropertiesResource.Update update();

    /** The template for DatastorePropertiesResource update. */
    interface Update extends UpdateStages.WithProperties {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        DatastorePropertiesResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        DatastorePropertiesResource apply(Context context);
    }
    /** The DatastorePropertiesResource update stages. */
    interface UpdateStages {
        /** The stage of the DatastorePropertiesResource update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: The properties property..
             *
             * @param properties The properties property.
             * @return the next definition stage.
             */
            Update withProperties(DatastorePropertiesInner properties);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    DatastorePropertiesResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    DatastorePropertiesResource refresh(Context context);
}
