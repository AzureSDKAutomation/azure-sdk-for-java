// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scheduler.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.scheduler.fluent.models.JobDefinitionInner;

/** An immutable client-side representation of JobDefinition. */
public interface JobDefinition {
    /**
     * Gets the id property: Gets the job resource identifier.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the type property: Gets the job resource type.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the name property: Gets the job resource name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the properties property: Gets or sets the job properties.
     *
     * @return the properties value.
     */
    JobProperties properties();

    /**
     * Gets the inner com.azure.resourcemanager.scheduler.fluent.models.JobDefinitionInner object.
     *
     * @return the inner object.
     */
    JobDefinitionInner innerModel();

    /** The entirety of the JobDefinition definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The JobDefinition definition stages. */
    interface DefinitionStages {
        /** The first stage of the JobDefinition definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the JobDefinition definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, jobCollectionName.
             *
             * @param resourceGroupName The resource group name.
             * @param jobCollectionName The job collection name.
             * @return the next definition stage.
             */
            WithCreate withExistingJobCollection(String resourceGroupName, String jobCollectionName);
        }
        /**
         * The stage of the JobDefinition definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            JobDefinition create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            JobDefinition create(Context context);
        }
        /** The stage of the JobDefinition definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Gets or sets the job properties..
             *
             * @param properties Gets or sets the job properties.
             * @return the next definition stage.
             */
            WithCreate withProperties(JobProperties properties);
        }
    }
    /**
     * Begins update for the JobDefinition resource.
     *
     * @return the stage of resource update.
     */
    JobDefinition.Update update();

    /** The template for JobDefinition update. */
    interface Update extends UpdateStages.WithProperties {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        JobDefinition apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        JobDefinition apply(Context context);
    }
    /** The JobDefinition update stages. */
    interface UpdateStages {
        /** The stage of the JobDefinition update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Gets or sets the job properties..
             *
             * @param properties Gets or sets the job properties.
             * @return the next definition stage.
             */
            Update withProperties(JobProperties properties);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    JobDefinition refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    JobDefinition refresh(Context context);
}
