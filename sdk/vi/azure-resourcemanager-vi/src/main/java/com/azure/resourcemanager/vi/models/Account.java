// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vi.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.vi.fluent.models.AccountInner;
import java.util.Map;

/** An immutable client-side representation of Account. */
public interface Account {
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
     * Gets the systemData property: The system meta data relating to this resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the accountId property: The account's data-plane ID.
     *
     * @return the accountId value.
     */
    String accountId();

    /**
     * Gets the accountName property: The account's name.
     *
     * @return the accountName value.
     */
    String accountName();

    /**
     * Gets the mediaServices property: The media services details.
     *
     * @return the mediaServices value.
     */
    MediaServices mediaServices();

    /**
     * Gets the provisioningState property: Gets the status of the account at the time the operation was called.
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
     * Gets the inner com.azure.resourcemanager.vi.fluent.models.AccountInner object.
     *
     * @return the inner object.
     */
    AccountInner innerModel();

    /** The entirety of the Account definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The Account definition stages. */
    interface DefinitionStages {
        /** The first stage of the Account definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the Account definition allowing to specify location. */
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
        /** The stage of the Account definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the Account definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithMediaServices {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Account create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Account create(Context context);
        }
        /** The stage of the Account definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the Account definition allowing to specify mediaServices. */
        interface WithMediaServices {
            /**
             * Specifies the mediaServices property: The media services details.
             *
             * @param mediaServices The media services details.
             * @return the next definition stage.
             */
            WithCreate withMediaServices(MediaServices mediaServices);
        }
    }
    /**
     * Begins update for the Account resource.
     *
     * @return the stage of resource update.
     */
    Account.Update update();

    /** The template for Account update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithMediaServices {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Account apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Account apply(Context context);
    }
    /** The Account update stages. */
    interface UpdateStages {
        /** The stage of the Account update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the Account update allowing to specify mediaServices. */
        interface WithMediaServices {
            /**
             * Specifies the mediaServices property: The media services details.
             *
             * @param mediaServices The media services details.
             * @return the next definition stage.
             */
            Update withMediaServices(MediaServices mediaServices);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Account refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Account refresh(Context context);
}
