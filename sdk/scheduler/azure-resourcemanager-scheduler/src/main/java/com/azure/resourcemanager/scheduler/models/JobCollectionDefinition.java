// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scheduler.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.scheduler.fluent.models.JobCollectionDefinitionInner;
import java.util.Map;

/** An immutable client-side representation of JobCollectionDefinition. */
public interface JobCollectionDefinition {
    /**
     * Gets the id property: Gets the job collection resource identifier.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the type property: Gets the job collection resource type.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the name property: Gets or sets the job collection resource name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the location property: Gets or sets the storage account location.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Gets or sets the tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the properties property: Gets or sets the job collection properties.
     *
     * @return the properties value.
     */
    JobCollectionProperties properties();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.scheduler.fluent.models.JobCollectionDefinitionInner object.
     *
     * @return the inner object.
     */
    JobCollectionDefinitionInner innerModel();

    /** The entirety of the JobCollectionDefinition definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithResourceGroup, DefinitionStages.WithCreate {
    }
    /** The JobCollectionDefinition definition stages. */
    interface DefinitionStages {
        /** The first stage of the JobCollectionDefinition definition. */
        interface Blank extends WithResourceGroup {
        }
        /** The stage of the JobCollectionDefinition definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The resource group name.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the JobCollectionDefinition definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithLocation,
                DefinitionStages.WithTags,
                DefinitionStages.WithName,
                DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            JobCollectionDefinition create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            JobCollectionDefinition create(Context context);
        }
        /** The stage of the JobCollectionDefinition definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location Gets or sets the storage account location.
             * @return the next definition stage.
             */
            WithCreate withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location Gets or sets the storage account location.
             * @return the next definition stage.
             */
            WithCreate withRegion(String location);
        }
        /** The stage of the JobCollectionDefinition definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Gets or sets the tags..
             *
             * @param tags Gets or sets the tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the JobCollectionDefinition definition allowing to specify name. */
        interface WithName {
            /**
             * Specifies the name property: Gets or sets the job collection resource name..
             *
             * @param name Gets or sets the job collection resource name.
             * @return the next definition stage.
             */
            WithCreate withName(String name);
        }
        /** The stage of the JobCollectionDefinition definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Gets or sets the job collection properties..
             *
             * @param properties Gets or sets the job collection properties.
             * @return the next definition stage.
             */
            WithCreate withProperties(JobCollectionProperties properties);
        }
    }
    /**
     * Begins update for the JobCollectionDefinition resource.
     *
     * @return the stage of resource update.
     */
    JobCollectionDefinition.Update update();

    /** The template for JobCollectionDefinition update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithName, UpdateStages.WithProperties {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        JobCollectionDefinition apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        JobCollectionDefinition apply(Context context);
    }
    /** The JobCollectionDefinition update stages. */
    interface UpdateStages {
        /** The stage of the JobCollectionDefinition update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Gets or sets the tags..
             *
             * @param tags Gets or sets the tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the JobCollectionDefinition update allowing to specify name. */
        interface WithName {
            /**
             * Specifies the name property: Gets or sets the job collection resource name..
             *
             * @param name Gets or sets the job collection resource name.
             * @return the next definition stage.
             */
            Update withName(String name);
        }
        /** The stage of the JobCollectionDefinition update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Gets or sets the job collection properties..
             *
             * @param properties Gets or sets the job collection properties.
             * @return the next definition stage.
             */
            Update withProperties(JobCollectionProperties properties);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    JobCollectionDefinition refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    JobCollectionDefinition refresh(Context context);
}
