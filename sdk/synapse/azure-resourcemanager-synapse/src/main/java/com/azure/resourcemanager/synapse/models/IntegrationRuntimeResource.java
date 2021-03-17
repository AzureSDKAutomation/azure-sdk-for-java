// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.synapse.fluent.models.IntegrationRuntimeResourceInner;

/** An immutable client-side representation of IntegrationRuntimeResource. */
public interface IntegrationRuntimeResource {
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
     * Gets the etag property: Resource Etag.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the properties property: Integration runtime properties.
     *
     * @return the properties value.
     */
    IntegrationRuntime properties();

    /**
     * Gets the inner com.azure.resourcemanager.synapse.fluent.models.IntegrationRuntimeResourceInner object.
     *
     * @return the inner object.
     */
    IntegrationRuntimeResourceInner innerModel();

    /** The entirety of the IntegrationRuntimeResource definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithProperties,
            DefinitionStages.WithCreate {
    }
    /** The IntegrationRuntimeResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the IntegrationRuntimeResource definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the IntegrationRuntimeResource definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, workspaceName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param workspaceName The name of the workspace.
             * @return the next definition stage.
             */
            WithProperties withExistingWorkspace(String resourceGroupName, String workspaceName);
        }
        /** The stage of the IntegrationRuntimeResource definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Integration runtime properties..
             *
             * @param properties Integration runtime properties.
             * @return the next definition stage.
             */
            WithCreate withProperties(IntegrationRuntime properties);
        }
        /**
         * The stage of the IntegrationRuntimeResource definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithIfMatch {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            IntegrationRuntimeResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            IntegrationRuntimeResource create(Context context);
        }
        /** The stage of the IntegrationRuntimeResource definition allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: ETag of the integration runtime entity. Should only be specified for
             * update, for which it should match existing entity or can be * for unconditional update..
             *
             * @param ifMatch ETag of the integration runtime entity. Should only be specified for update, for which it
             *     should match existing entity or can be * for unconditional update.
             * @return the next definition stage.
             */
            WithCreate withIfMatch(String ifMatch);
        }
    }
    /**
     * Begins update for the IntegrationRuntimeResource resource.
     *
     * @return the stage of resource update.
     */
    IntegrationRuntimeResource.Update update();

    /** The template for IntegrationRuntimeResource update. */
    interface Update extends UpdateStages.WithAutoUpdate, UpdateStages.WithUpdateDelayOffset {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        IntegrationRuntimeResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        IntegrationRuntimeResource apply(Context context);
    }
    /** The IntegrationRuntimeResource update stages. */
    interface UpdateStages {
        /** The stage of the IntegrationRuntimeResource update allowing to specify autoUpdate. */
        interface WithAutoUpdate {
            /**
             * Specifies the autoUpdate property: Enables or disables the auto-update feature of the self-hosted
             * integration runtime. See https://go.microsoft.com/fwlink/?linkid=854189..
             *
             * @param autoUpdate Enables or disables the auto-update feature of the self-hosted integration runtime. See
             *     https://go.microsoft.com/fwlink/?linkid=854189.
             * @return the next definition stage.
             */
            Update withAutoUpdate(IntegrationRuntimeAutoUpdate autoUpdate);
        }
        /** The stage of the IntegrationRuntimeResource update allowing to specify updateDelayOffset. */
        interface WithUpdateDelayOffset {
            /**
             * Specifies the updateDelayOffset property: The time offset (in hours) in the day, e.g., PT03H is 3 hours.
             * The integration runtime auto update will happen on that time..
             *
             * @param updateDelayOffset The time offset (in hours) in the day, e.g., PT03H is 3 hours. The integration
             *     runtime auto update will happen on that time.
             * @return the next definition stage.
             */
            Update withUpdateDelayOffset(String updateDelayOffset);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    IntegrationRuntimeResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    IntegrationRuntimeResource refresh(Context context);
}
