// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearningservices.fluent.models.JobBaseResourceInner;

/** An immutable client-side representation of JobBaseResource. */
public interface JobBaseResource {
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
     * Gets the properties property: Job base definition.
     *
     * @return the properties value.
     */
    JobBase properties();

    /**
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the inner com.azure.resourcemanager.machinelearningservices.fluent.models.JobBaseResourceInner object.
     *
     * @return the inner object.
     */
    JobBaseResourceInner innerModel();

    /** The entirety of the JobBaseResource definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithProperties,
            DefinitionStages.WithCreate {
    }
    /** The JobBaseResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the JobBaseResource definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the JobBaseResource definition allowing to specify parent resource. */
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
        /** The stage of the JobBaseResource definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Job base definition.
             *
             * @param properties Job base definition.
             * @return the next definition stage.
             */
            WithCreate withProperties(JobBase properties);
        }
        /**
         * The stage of the JobBaseResource definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            JobBaseResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            JobBaseResource create(Context context);
        }
    }
    /**
     * Begins update for the JobBaseResource resource.
     *
     * @return the stage of resource update.
     */
    JobBaseResource.Update update();

    /** The template for JobBaseResource update. */
    interface Update extends UpdateStages.WithProperties {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        JobBaseResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        JobBaseResource apply(Context context);
    }
    /** The JobBaseResource update stages. */
    interface UpdateStages {
        /** The stage of the JobBaseResource update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Job base definition.
             *
             * @param properties Job base definition.
             * @return the next definition stage.
             */
            Update withProperties(JobBase properties);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    JobBaseResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    JobBaseResource refresh(Context context);
}
