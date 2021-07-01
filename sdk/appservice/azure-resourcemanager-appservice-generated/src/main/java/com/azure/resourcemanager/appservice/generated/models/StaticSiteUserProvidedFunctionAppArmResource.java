// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.StaticSiteUserProvidedFunctionAppArmResourceInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of StaticSiteUserProvidedFunctionAppArmResource. */
public interface StaticSiteUserProvidedFunctionAppArmResource {
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
     * Gets the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the functionAppResourceId property: The resource id of the function app registered with the static site.
     *
     * @return the functionAppResourceId value.
     */
    String functionAppResourceId();

    /**
     * Gets the functionAppRegion property: The region of the function app registered with the static site.
     *
     * @return the functionAppRegion value.
     */
    String functionAppRegion();

    /**
     * Gets the createdOn property: The date and time on which the function app was registered with the static site.
     *
     * @return the createdOn value.
     */
    OffsetDateTime createdOn();

    /**
     * Gets the inner
     * com.azure.resourcemanager.appservice.generated.fluent.models.StaticSiteUserProvidedFunctionAppArmResourceInner
     * object.
     *
     * @return the inner object.
     */
    StaticSiteUserProvidedFunctionAppArmResourceInner innerModel();

    /** The entirety of the StaticSiteUserProvidedFunctionAppArmResource definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The StaticSiteUserProvidedFunctionAppArmResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the StaticSiteUserProvidedFunctionAppArmResource definition. */
        interface Blank extends WithParentResource {
        }
        /**
         * The stage of the StaticSiteUserProvidedFunctionAppArmResource definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, name, environmentName.
             *
             * @param resourceGroupName Name of the resource group to which the resource belongs.
             * @param name Name of the static site.
             * @param environmentName The stage site identifier.
             * @return the next definition stage.
             */
            WithCreate withExistingBuild(String resourceGroupName, String name, String environmentName);
        }
        /**
         * The stage of the StaticSiteUserProvidedFunctionAppArmResource definition which contains all the minimum
         * required properties for the resource to be created, but also allows for any other optional properties to be
         * specified.
         */
        interface WithCreate
            extends DefinitionStages.WithKind,
                DefinitionStages.WithFunctionAppResourceId,
                DefinitionStages.WithFunctionAppRegion,
                DefinitionStages.WithIsForced {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            StaticSiteUserProvidedFunctionAppArmResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            StaticSiteUserProvidedFunctionAppArmResource create(Context context);
        }
        /** The stage of the StaticSiteUserProvidedFunctionAppArmResource definition allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: Kind of resource..
             *
             * @param kind Kind of resource.
             * @return the next definition stage.
             */
            WithCreate withKind(String kind);
        }
        /**
         * The stage of the StaticSiteUserProvidedFunctionAppArmResource definition allowing to specify
         * functionAppResourceId.
         */
        interface WithFunctionAppResourceId {
            /**
             * Specifies the functionAppResourceId property: The resource id of the function app registered with the
             * static site.
             *
             * @param functionAppResourceId The resource id of the function app registered with the static site.
             * @return the next definition stage.
             */
            WithCreate withFunctionAppResourceId(String functionAppResourceId);
        }
        /**
         * The stage of the StaticSiteUserProvidedFunctionAppArmResource definition allowing to specify
         * functionAppRegion.
         */
        interface WithFunctionAppRegion {
            /**
             * Specifies the functionAppRegion property: The region of the function app registered with the static site.
             *
             * @param functionAppRegion The region of the function app registered with the static site.
             * @return the next definition stage.
             */
            WithCreate withFunctionAppRegion(String functionAppRegion);
        }
        /** The stage of the StaticSiteUserProvidedFunctionAppArmResource definition allowing to specify isForced. */
        interface WithIsForced {
            /**
             * Specifies the isForced property: Specify &lt;code&gt;true&lt;/code&gt; to force the update of the auth
             * configuration on the function app even if an AzureStaticWebApps provider is already configured on the
             * function app. The default is &lt;code&gt;false&lt;/code&gt;..
             *
             * @param isForced Specify &lt;code&gt;true&lt;/code&gt; to force the update of the auth configuration on
             *     the function app even if an AzureStaticWebApps provider is already configured on the function app.
             *     The default is &lt;code&gt;false&lt;/code&gt;.
             * @return the next definition stage.
             */
            WithCreate withIsForced(Boolean isForced);
        }
    }
    /**
     * Begins update for the StaticSiteUserProvidedFunctionAppArmResource resource.
     *
     * @return the stage of resource update.
     */
    StaticSiteUserProvidedFunctionAppArmResource.Update update();

    /** The template for StaticSiteUserProvidedFunctionAppArmResource update. */
    interface Update
        extends UpdateStages.WithKind,
            UpdateStages.WithFunctionAppResourceId,
            UpdateStages.WithFunctionAppRegion,
            UpdateStages.WithIsForced {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        StaticSiteUserProvidedFunctionAppArmResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        StaticSiteUserProvidedFunctionAppArmResource apply(Context context);
    }
    /** The StaticSiteUserProvidedFunctionAppArmResource update stages. */
    interface UpdateStages {
        /** The stage of the StaticSiteUserProvidedFunctionAppArmResource update allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: Kind of resource..
             *
             * @param kind Kind of resource.
             * @return the next definition stage.
             */
            Update withKind(String kind);
        }
        /**
         * The stage of the StaticSiteUserProvidedFunctionAppArmResource update allowing to specify
         * functionAppResourceId.
         */
        interface WithFunctionAppResourceId {
            /**
             * Specifies the functionAppResourceId property: The resource id of the function app registered with the
             * static site.
             *
             * @param functionAppResourceId The resource id of the function app registered with the static site.
             * @return the next definition stage.
             */
            Update withFunctionAppResourceId(String functionAppResourceId);
        }
        /**
         * The stage of the StaticSiteUserProvidedFunctionAppArmResource update allowing to specify functionAppRegion.
         */
        interface WithFunctionAppRegion {
            /**
             * Specifies the functionAppRegion property: The region of the function app registered with the static site.
             *
             * @param functionAppRegion The region of the function app registered with the static site.
             * @return the next definition stage.
             */
            Update withFunctionAppRegion(String functionAppRegion);
        }
        /** The stage of the StaticSiteUserProvidedFunctionAppArmResource update allowing to specify isForced. */
        interface WithIsForced {
            /**
             * Specifies the isForced property: Specify &lt;code&gt;true&lt;/code&gt; to force the update of the auth
             * configuration on the function app even if an AzureStaticWebApps provider is already configured on the
             * function app. The default is &lt;code&gt;false&lt;/code&gt;..
             *
             * @param isForced Specify &lt;code&gt;true&lt;/code&gt; to force the update of the auth configuration on
             *     the function app even if an AzureStaticWebApps provider is already configured on the function app.
             *     The default is &lt;code&gt;false&lt;/code&gt;.
             * @return the next definition stage.
             */
            Update withIsForced(Boolean isForced);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    StaticSiteUserProvidedFunctionAppArmResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    StaticSiteUserProvidedFunctionAppArmResource refresh(Context context);
}
