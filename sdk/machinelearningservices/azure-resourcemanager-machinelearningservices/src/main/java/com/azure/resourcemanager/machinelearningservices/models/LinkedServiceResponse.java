// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearningservices.fluent.models.LinkedServiceResponseInner;

/** An immutable client-side representation of LinkedServiceResponse. */
public interface LinkedServiceResponse {
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
     * Gets the location property: location of the linked service.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the identity property: Identity for the resource.
     *
     * @return the identity value.
     */
    Identity identity();

    /**
     * Gets the properties property: LinkedService specific properties.
     *
     * @return the properties value.
     */
    LinkedServiceProps properties();

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
     * Gets the inner com.azure.resourcemanager.machinelearningservices.fluent.models.LinkedServiceResponseInner object.
     *
     * @return the inner object.
     */
    LinkedServiceResponseInner innerModel();

    /** The entirety of the LinkedServiceResponse definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The LinkedServiceResponse definition stages. */
    interface DefinitionStages {
        /** The first stage of the LinkedServiceResponse definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the LinkedServiceResponse definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, workspaceName.
             *
             * @param resourceGroupName Name of the resource group in which workspace is located.
             * @param workspaceName Name of Azure Machine Learning workspace.
             * @return the next definition stage.
             */
            WithCreate withExistingWorkspace(String resourceGroupName, String workspaceName);
        }
        /**
         * The stage of the LinkedServiceResponse definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithLocation,
                DefinitionStages.WithName,
                DefinitionStages.WithIdentity,
                DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            LinkedServiceResponse create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            LinkedServiceResponse create(Context context);
        }
        /** The stage of the LinkedServiceResponse definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location location of the linked service.
             * @return the next definition stage.
             */
            WithCreate withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location location of the linked service.
             * @return the next definition stage.
             */
            WithCreate withRegion(String location);
        }
        /** The stage of the LinkedServiceResponse definition allowing to specify name. */
        interface WithName {
            /**
             * Specifies the name property: Friendly name of the linked service.
             *
             * @param name Friendly name of the linked service.
             * @return the next definition stage.
             */
            WithCreate withName(String name);
        }
        /** The stage of the LinkedServiceResponse definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: Identity for the resource..
             *
             * @param identity Identity for the resource.
             * @return the next definition stage.
             */
            WithCreate withIdentity(Identity identity);
        }
        /** The stage of the LinkedServiceResponse definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: LinkedService specific properties..
             *
             * @param properties LinkedService specific properties.
             * @return the next definition stage.
             */
            WithCreate withProperties(LinkedServiceProps properties);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    LinkedServiceResponse refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    LinkedServiceResponse refresh(Context context);
}
