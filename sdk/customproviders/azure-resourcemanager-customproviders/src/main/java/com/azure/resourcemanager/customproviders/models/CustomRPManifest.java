// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customproviders.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.customproviders.fluent.models.CustomRPManifestInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of CustomRPManifest. */
public interface CustomRPManifest {
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
     * Gets the actions property: A list of actions that the custom resource provider implements.
     *
     * @return the actions value.
     */
    List<CustomRPActionRouteDefinition> actions();

    /**
     * Gets the resourceTypes property: A list of resource types that the custom resource provider implements.
     *
     * @return the resourceTypes value.
     */
    List<CustomRPResourceTypeRouteDefinition> resourceTypes();

    /**
     * Gets the validations property: A list of validations to run on the custom resource provider's requests.
     *
     * @return the validations value.
     */
    List<CustomRPValidations> validations();

    /**
     * Gets the provisioningState property: The provisioning state of the resource provider.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

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
     * Gets the inner com.azure.resourcemanager.customproviders.fluent.models.CustomRPManifestInner object.
     *
     * @return the inner object.
     */
    CustomRPManifestInner innerModel();

    /** The entirety of the CustomRPManifest definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The CustomRPManifest definition stages. */
    interface DefinitionStages {
        /** The first stage of the CustomRPManifest definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the CustomRPManifest definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the CustomRPManifest definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the CustomRPManifest definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithActions,
                DefinitionStages.WithResourceTypes,
                DefinitionStages.WithValidations {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            CustomRPManifest create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            CustomRPManifest create(Context context);
        }
        /** The stage of the CustomRPManifest definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the CustomRPManifest definition allowing to specify actions. */
        interface WithActions {
            /**
             * Specifies the actions property: A list of actions that the custom resource provider implements..
             *
             * @param actions A list of actions that the custom resource provider implements.
             * @return the next definition stage.
             */
            WithCreate withActions(List<CustomRPActionRouteDefinition> actions);
        }
        /** The stage of the CustomRPManifest definition allowing to specify resourceTypes. */
        interface WithResourceTypes {
            /**
             * Specifies the resourceTypes property: A list of resource types that the custom resource provider
             * implements..
             *
             * @param resourceTypes A list of resource types that the custom resource provider implements.
             * @return the next definition stage.
             */
            WithCreate withResourceTypes(List<CustomRPResourceTypeRouteDefinition> resourceTypes);
        }
        /** The stage of the CustomRPManifest definition allowing to specify validations. */
        interface WithValidations {
            /**
             * Specifies the validations property: A list of validations to run on the custom resource provider's
             * requests..
             *
             * @param validations A list of validations to run on the custom resource provider's requests.
             * @return the next definition stage.
             */
            WithCreate withValidations(List<CustomRPValidations> validations);
        }
    }
    /**
     * Begins update for the CustomRPManifest resource.
     *
     * @return the stage of resource update.
     */
    CustomRPManifest.Update update();

    /** The template for CustomRPManifest update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        CustomRPManifest apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        CustomRPManifest apply(Context context);
    }
    /** The CustomRPManifest update stages. */
    interface UpdateStages {
        /** The stage of the CustomRPManifest update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    CustomRPManifest refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    CustomRPManifest refresh(Context context);
}
