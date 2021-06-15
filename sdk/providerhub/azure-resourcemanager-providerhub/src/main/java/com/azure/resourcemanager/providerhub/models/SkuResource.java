// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.providerhub.fluent.models.SkuResourceInner;
import java.util.List;

/** An immutable client-side representation of SkuResource. */
public interface SkuResource {
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
    SkuResourceProperties properties();

    /**
     * Gets the inner com.azure.resourcemanager.providerhub.fluent.models.SkuResourceInner object.
     *
     * @return the inner object.
     */
    SkuResourceInner innerModel();

    /** The entirety of the SkuResource definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithSkuSettings,
            DefinitionStages.WithCreate {
    }
    /** The SkuResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the SkuResource definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the SkuResource definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies providerNamespace, resourceType.
             *
             * @param providerNamespace The name of the resource provider hosted within ProviderHub.
             * @param resourceType The resource type.
             * @return the next definition stage.
             */
            WithSkuSettings withExistingResourcetypeRegistration(String providerNamespace, String resourceType);
        }
        /** The stage of the SkuResource definition allowing to specify skuSettings. */
        interface WithSkuSettings {
            /**
             * Specifies the skuSettings property: The skuSettings property..
             *
             * @param skuSettings The skuSettings property.
             * @return the next definition stage.
             */
            WithCreate withSkuSettings(List<SkuSetting> skuSettings);
        }
        /**
         * The stage of the SkuResource definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithProvisioningState {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            SkuResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            SkuResource create(Context context);
        }
        /** The stage of the SkuResource definition allowing to specify provisioningState. */
        interface WithProvisioningState {
            /**
             * Specifies the provisioningState property: The provisioningState property..
             *
             * @param provisioningState The provisioningState property.
             * @return the next definition stage.
             */
            WithCreate withProvisioningState(ProvisioningState provisioningState);
        }
    }
    /**
     * Begins update for the SkuResource resource.
     *
     * @return the stage of resource update.
     */
    SkuResource.Update update();

    /** The template for SkuResource update. */
    interface Update extends UpdateStages.WithSkuSettings, UpdateStages.WithProvisioningState {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        SkuResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        SkuResource apply(Context context);
    }
    /** The SkuResource update stages. */
    interface UpdateStages {
        /** The stage of the SkuResource update allowing to specify skuSettings. */
        interface WithSkuSettings {
            /**
             * Specifies the skuSettings property: The skuSettings property..
             *
             * @param skuSettings The skuSettings property.
             * @return the next definition stage.
             */
            Update withSkuSettings(List<SkuSetting> skuSettings);
        }
        /** The stage of the SkuResource update allowing to specify provisioningState. */
        interface WithProvisioningState {
            /**
             * Specifies the provisioningState property: The provisioningState property..
             *
             * @param provisioningState The provisioningState property.
             * @return the next definition stage.
             */
            Update withProvisioningState(ProvisioningState provisioningState);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    SkuResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    SkuResource refresh(Context context);
}
