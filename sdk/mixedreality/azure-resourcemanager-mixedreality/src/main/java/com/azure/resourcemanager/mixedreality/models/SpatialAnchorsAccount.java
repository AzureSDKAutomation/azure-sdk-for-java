// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mixedreality.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mixedreality.fluent.models.SpatialAnchorsAccountInner;
import java.util.Map;

/** An immutable client-side representation of SpatialAnchorsAccount. */
public interface SpatialAnchorsAccount {
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
     * Gets the identity property: The identity associated with this account.
     *
     * @return the identity value.
     */
    Identity identity();

    /**
     * Gets the plan property: The plan associated with this account.
     *
     * @return the plan value.
     */
    Identity plan();

    /**
     * Gets the sku property: The sku associated with this account.
     *
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the kind property: The kind of account, if supported.
     *
     * @return the kind value.
     */
    Sku kind();

    /**
     * Gets the systemData property: System metadata for this account.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the accountId property: unique id of certain account.
     *
     * @return the accountId value.
     */
    String accountId();

    /**
     * Gets the accountDomain property: Correspond domain name of certain Spatial Anchors Account.
     *
     * @return the accountDomain value.
     */
    String accountDomain();

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
     * Gets the inner com.azure.resourcemanager.mixedreality.fluent.models.SpatialAnchorsAccountInner object.
     *
     * @return the inner object.
     */
    SpatialAnchorsAccountInner innerModel();

    /** The entirety of the SpatialAnchorsAccount definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The SpatialAnchorsAccount definition stages. */
    interface DefinitionStages {
        /** The first stage of the SpatialAnchorsAccount definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the SpatialAnchorsAccount definition allowing to specify location. */
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
        /** The stage of the SpatialAnchorsAccount definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName Name of an Azure resource group.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the SpatialAnchorsAccount definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithIdentity,
                DefinitionStages.WithPlan,
                DefinitionStages.WithSku,
                DefinitionStages.WithKind {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            SpatialAnchorsAccount create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            SpatialAnchorsAccount create(Context context);
        }
        /** The stage of the SpatialAnchorsAccount definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the SpatialAnchorsAccount definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity associated with this account.
             *
             * @param identity The identity associated with this account.
             * @return the next definition stage.
             */
            WithCreate withIdentity(Identity identity);
        }
        /** The stage of the SpatialAnchorsAccount definition allowing to specify plan. */
        interface WithPlan {
            /**
             * Specifies the plan property: The plan associated with this account.
             *
             * @param plan The plan associated with this account.
             * @return the next definition stage.
             */
            WithCreate withPlan(Identity plan);
        }
        /** The stage of the SpatialAnchorsAccount definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The sku associated with this account.
             *
             * @param sku The sku associated with this account.
             * @return the next definition stage.
             */
            WithCreate withSku(Sku sku);
        }
        /** The stage of the SpatialAnchorsAccount definition allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: The kind of account, if supported.
             *
             * @param kind The kind of account, if supported.
             * @return the next definition stage.
             */
            WithCreate withKind(Sku kind);
        }
    }
    /**
     * Begins update for the SpatialAnchorsAccount resource.
     *
     * @return the stage of resource update.
     */
    SpatialAnchorsAccount.Update update();

    /** The template for SpatialAnchorsAccount update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithIdentity,
            UpdateStages.WithPlan,
            UpdateStages.WithSku,
            UpdateStages.WithKind {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        SpatialAnchorsAccount apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        SpatialAnchorsAccount apply(Context context);
    }
    /** The SpatialAnchorsAccount update stages. */
    interface UpdateStages {
        /** The stage of the SpatialAnchorsAccount update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the SpatialAnchorsAccount update allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity associated with this account.
             *
             * @param identity The identity associated with this account.
             * @return the next definition stage.
             */
            Update withIdentity(Identity identity);
        }
        /** The stage of the SpatialAnchorsAccount update allowing to specify plan. */
        interface WithPlan {
            /**
             * Specifies the plan property: The plan associated with this account.
             *
             * @param plan The plan associated with this account.
             * @return the next definition stage.
             */
            Update withPlan(Identity plan);
        }
        /** The stage of the SpatialAnchorsAccount update allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The sku associated with this account.
             *
             * @param sku The sku associated with this account.
             * @return the next definition stage.
             */
            Update withSku(Sku sku);
        }
        /** The stage of the SpatialAnchorsAccount update allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: The kind of account, if supported.
             *
             * @param kind The kind of account, if supported.
             * @return the next definition stage.
             */
            Update withKind(Sku kind);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    SpatialAnchorsAccount refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    SpatialAnchorsAccount refresh(Context context);

    /**
     * List Both of the 2 Keys of a Spatial Anchors Account.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return developer Keys of account.
     */
    AccountKeys listKeys();

    /**
     * List Both of the 2 Keys of a Spatial Anchors Account.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return developer Keys of account.
     */
    Response<AccountKeys> listKeysWithResponse(Context context);

    /**
     * Regenerate specified Key of a Spatial Anchors Account.
     *
     * @param regenerate Required information for key regeneration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return developer Keys of account.
     */
    AccountKeys regenerateKeys(AccountKeyRegenerateRequest regenerate);

    /**
     * Regenerate specified Key of a Spatial Anchors Account.
     *
     * @param regenerate Required information for key regeneration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return developer Keys of account.
     */
    Response<AccountKeys> regenerateKeysWithResponse(AccountKeyRegenerateRequest regenerate, Context context);
}
