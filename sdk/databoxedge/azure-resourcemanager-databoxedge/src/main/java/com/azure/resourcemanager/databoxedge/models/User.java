// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.databoxedge.fluent.models.UserInner;
import java.util.List;

/** An immutable client-side representation of User. */
public interface User {
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
     * Gets the systemData property: User in DataBoxEdge Resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the encryptedPassword property: The password details.
     *
     * @return the encryptedPassword value.
     */
    AsymmetricEncryptedSecret encryptedPassword();

    /**
     * Gets the shareAccessRights property: List of shares that the user has rights on. This field should not be
     * specified during user creation.
     *
     * @return the shareAccessRights value.
     */
    List<ShareAccessRight> shareAccessRights();

    /**
     * Gets the userType property: Type of the user.
     *
     * @return the userType value.
     */
    UserType userType();

    /**
     * Gets the inner com.azure.resourcemanager.databoxedge.fluent.models.UserInner object.
     *
     * @return the inner object.
     */
    UserInner innerModel();

    /** The entirety of the User definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithUserType,
            DefinitionStages.WithCreate {
    }
    /** The User definition stages. */
    interface DefinitionStages {
        /** The first stage of the User definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the User definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies deviceName, resourceGroupName.
             *
             * @param deviceName The device name.
             * @param resourceGroupName The resource group name.
             * @return the next definition stage.
             */
            WithUserType withExistingDataBoxEdgeDevice(String deviceName, String resourceGroupName);
        }
        /** The stage of the User definition allowing to specify userType. */
        interface WithUserType {
            /**
             * Specifies the userType property: Type of the user..
             *
             * @param userType Type of the user.
             * @return the next definition stage.
             */
            WithCreate withUserType(UserType userType);
        }
        /**
         * The stage of the User definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithEncryptedPassword {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            User create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            User create(Context context);
        }
        /** The stage of the User definition allowing to specify encryptedPassword. */
        interface WithEncryptedPassword {
            /**
             * Specifies the encryptedPassword property: The password details..
             *
             * @param encryptedPassword The password details.
             * @return the next definition stage.
             */
            WithCreate withEncryptedPassword(AsymmetricEncryptedSecret encryptedPassword);
        }
    }
    /**
     * Begins update for the User resource.
     *
     * @return the stage of resource update.
     */
    User.Update update();

    /** The template for User update. */
    interface Update extends UpdateStages.WithEncryptedPassword, UpdateStages.WithUserType {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        User apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        User apply(Context context);
    }
    /** The User update stages. */
    interface UpdateStages {
        /** The stage of the User update allowing to specify encryptedPassword. */
        interface WithEncryptedPassword {
            /**
             * Specifies the encryptedPassword property: The password details..
             *
             * @param encryptedPassword The password details.
             * @return the next definition stage.
             */
            Update withEncryptedPassword(AsymmetricEncryptedSecret encryptedPassword);
        }
        /** The stage of the User update allowing to specify userType. */
        interface WithUserType {
            /**
             * Specifies the userType property: Type of the user..
             *
             * @param userType Type of the user.
             * @return the next definition stage.
             */
            Update withUserType(UserType userType);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    User refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    User refresh(Context context);
}
