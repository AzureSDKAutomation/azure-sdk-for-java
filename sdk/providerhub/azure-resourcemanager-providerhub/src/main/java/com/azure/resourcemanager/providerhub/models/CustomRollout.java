// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.providerhub.fluent.models.CustomRolloutInner;
import com.azure.resourcemanager.providerhub.fluent.models.CustomRolloutPropertiesInner;

/** An immutable client-side representation of CustomRollout. */
public interface CustomRollout {
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
     * Gets the properties property: Properties of the rollout.
     *
     * @return the properties value.
     */
    CustomRolloutProperties properties();

    /**
     * Gets the inner com.azure.resourcemanager.providerhub.fluent.models.CustomRolloutInner object.
     *
     * @return the inner object.
     */
    CustomRolloutInner innerModel();

    /** The entirety of the CustomRollout definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithProperties,
            DefinitionStages.WithCreate {
    }
    /** The CustomRollout definition stages. */
    interface DefinitionStages {
        /** The first stage of the CustomRollout definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the CustomRollout definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies providerNamespace.
             *
             * @param providerNamespace The name of the resource provider hosted within ProviderHub.
             * @return the next definition stage.
             */
            WithProperties withExistingProviderRegistration(String providerNamespace);
        }
        /** The stage of the CustomRollout definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Properties of the rollout..
             *
             * @param properties Properties of the rollout.
             * @return the next definition stage.
             */
            WithCreate withProperties(CustomRolloutPropertiesInner properties);
        }
        /**
         * The stage of the CustomRollout definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            CustomRollout create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            CustomRollout create(Context context);
        }
    }
    /**
     * Begins update for the CustomRollout resource.
     *
     * @return the stage of resource update.
     */
    CustomRollout.Update update();

    /** The template for CustomRollout update. */
    interface Update extends UpdateStages.WithProperties {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        CustomRollout apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        CustomRollout apply(Context context);
    }
    /** The CustomRollout update stages. */
    interface UpdateStages {
        /** The stage of the CustomRollout update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Properties of the rollout..
             *
             * @param properties Properties of the rollout.
             * @return the next definition stage.
             */
            Update withProperties(CustomRolloutPropertiesInner properties);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    CustomRollout refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    CustomRollout refresh(Context context);
}
