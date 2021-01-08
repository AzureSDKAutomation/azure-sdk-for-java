// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearningservices.fluent.models.BatchEndpointInner;
import com.azure.resourcemanager.machinelearningservices.fluent.models.BatchEndpointTrackedResourceInner;
import java.util.Map;

/** An immutable client-side representation of BatchEndpointTrackedResource. */
public interface BatchEndpointTrackedResource {
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
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the kind property: The kind property.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the identity property: The identity property.
     *
     * @return the identity value.
     */
    ManagedIdentity identity();

    /**
     * Gets the properties property: Batch endpoint configuration.
     *
     * @return the properties value.
     */
    BatchEndpoint properties();

    /**
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

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
     * Gets the inner com.azure.resourcemanager.machinelearningservices.fluent.models.BatchEndpointTrackedResourceInner
     * object.
     *
     * @return the inner object.
     */
    BatchEndpointTrackedResourceInner innerModel();

    /** The entirety of the BatchEndpointTrackedResource definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithProperties,
            DefinitionStages.WithCreate {
    }
    /** The BatchEndpointTrackedResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the BatchEndpointTrackedResource definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the BatchEndpointTrackedResource definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }
        /** The stage of the BatchEndpointTrackedResource definition allowing to specify parent resource. */
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
        /** The stage of the BatchEndpointTrackedResource definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Batch endpoint configuration.
             *
             * @param properties Batch endpoint configuration.
             * @return the next definition stage.
             */
            WithCreate withProperties(BatchEndpointInner properties);
        }
        /**
         * The stage of the BatchEndpointTrackedResource definition which contains all the minimum required properties
         * for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags, DefinitionStages.WithKind, DefinitionStages.WithIdentity {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            BatchEndpointTrackedResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            BatchEndpointTrackedResource create(Context context);
        }
        /** The stage of the BatchEndpointTrackedResource definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the BatchEndpointTrackedResource definition allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: The kind property..
             *
             * @param kind The kind property.
             * @return the next definition stage.
             */
            WithCreate withKind(String kind);
        }
        /** The stage of the BatchEndpointTrackedResource definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity property..
             *
             * @param identity The identity property.
             * @return the next definition stage.
             */
            WithCreate withIdentity(ManagedIdentity identity);
        }
    }
    /**
     * Begins update for the BatchEndpointTrackedResource resource.
     *
     * @return the stage of resource update.
     */
    BatchEndpointTrackedResource.Update update();

    /** The template for BatchEndpointTrackedResource update. */
    interface Update
        extends UpdateStages.WithTags, UpdateStages.WithKind, UpdateStages.WithIdentity, UpdateStages.WithProperties {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        BatchEndpointTrackedResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        BatchEndpointTrackedResource apply(Context context);
    }
    /** The BatchEndpointTrackedResource update stages. */
    interface UpdateStages {
        /** The stage of the BatchEndpointTrackedResource update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the BatchEndpointTrackedResource update allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: The kind property..
             *
             * @param kind The kind property.
             * @return the next definition stage.
             */
            Update withKind(String kind);
        }
        /** The stage of the BatchEndpointTrackedResource update allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity property..
             *
             * @param identity The identity property.
             * @return the next definition stage.
             */
            Update withIdentity(ManagedIdentity identity);
        }
        /** The stage of the BatchEndpointTrackedResource update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Batch endpoint configuration.
             *
             * @param properties Batch endpoint configuration.
             * @return the next definition stage.
             */
            Update withProperties(BatchEndpointInner properties);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    BatchEndpointTrackedResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    BatchEndpointTrackedResource refresh(Context context);
}
