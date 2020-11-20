/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_08_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.storage.v2019_08_01_preview.implementation.LocalUserInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.storage.v2019_08_01_preview.implementation.StorageManager;
import java.util.List;

/**
 * Type representing LocalUser.
 */
public interface LocalUser extends HasInner<LocalUserInner>, Indexable, Refreshable<LocalUser>, Updatable<LocalUser.Update>, HasManager<StorageManager> {
    /**
     * @return the hasSharedKey value.
     */
    Boolean hasSharedKey();

    /**
     * @return the hasSshKey value.
     */
    Boolean hasSshKey();

    /**
     * @return the homeDirectory value.
     */
    String homeDirectory();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the permissionScopes value.
     */
    List<PermissionScope> permissionScopes();

    /**
     * @return the sharedKey value.
     */
    String sharedKey();

    /**
     * @return the sid value.
     */
    String sid();

    /**
     * @return the sshAuthorizedKeys value.
     */
    List<SshPublicKey> sshAuthorizedKeys();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the LocalUser definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithStorageAccount, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of LocalUser definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a LocalUser definition.
         */
        interface Blank extends WithStorageAccount {
        }

        /**
         * The stage of the localuser definition allowing to specify StorageAccount.
         */
        interface WithStorageAccount {
           /**
            * Specifies resourceGroupName, accountName.
            * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive
            * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only
            * @return the next definition stage
            */
            WithCreate withExistingStorageAccount(String resourceGroupName, String accountName);
        }

        /**
         * The stage of the localuser definition allowing to specify HomeDirectory.
         */
        interface WithHomeDirectory {
            /**
             * Specifies homeDirectory.
             * @param homeDirectory Optional, local user home directory
             * @return the next definition stage
             */
            WithCreate withHomeDirectory(String homeDirectory);
        }

        /**
         * The stage of the localuser definition allowing to specify PermissionScopes.
         */
        interface WithPermissionScopes {
            /**
             * Specifies permissionScopes.
             * @param permissionScopes The permission scopes of the local user
             * @return the next definition stage
             */
            WithCreate withPermissionScopes(List<PermissionScope> permissionScopes);
        }

        /**
         * The stage of the localuser definition allowing to specify SharedKey.
         */
        interface WithSharedKey {
            /**
             * Specifies sharedKey.
             * @param sharedKey the sharedKey parameter value
             * @return the next definition stage
             */
            WithCreate withSharedKey(String sharedKey);
        }

        /**
         * The stage of the localuser definition allowing to specify SshAuthorizedKeys.
         */
        interface WithSshAuthorizedKeys {
            /**
             * Specifies sshAuthorizedKeys.
             * @param sshAuthorizedKeys the sshAuthorizedKeys parameter value
             * @return the next definition stage
             */
            WithCreate withSshAuthorizedKeys(List<SshPublicKey> sshAuthorizedKeys);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<LocalUser>, DefinitionStages.WithHomeDirectory, DefinitionStages.WithPermissionScopes, DefinitionStages.WithSharedKey, DefinitionStages.WithSshAuthorizedKeys {
        }
    }
    /**
     * The template for a LocalUser update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<LocalUser>, UpdateStages.WithHomeDirectory, UpdateStages.WithPermissionScopes, UpdateStages.WithSharedKey, UpdateStages.WithSshAuthorizedKeys {
    }

    /**
     * Grouping of LocalUser update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the localuser update allowing to specify HomeDirectory.
         */
        interface WithHomeDirectory {
            /**
             * Specifies homeDirectory.
             * @param homeDirectory Optional, local user home directory
             * @return the next update stage
             */
            Update withHomeDirectory(String homeDirectory);
        }

        /**
         * The stage of the localuser update allowing to specify PermissionScopes.
         */
        interface WithPermissionScopes {
            /**
             * Specifies permissionScopes.
             * @param permissionScopes The permission scopes of the local user
             * @return the next update stage
             */
            Update withPermissionScopes(List<PermissionScope> permissionScopes);
        }

        /**
         * The stage of the localuser update allowing to specify SharedKey.
         */
        interface WithSharedKey {
            /**
             * Specifies sharedKey.
             * @param sharedKey the sharedKey parameter value
             * @return the next update stage
             */
            Update withSharedKey(String sharedKey);
        }

        /**
         * The stage of the localuser update allowing to specify SshAuthorizedKeys.
         */
        interface WithSshAuthorizedKeys {
            /**
             * Specifies sshAuthorizedKeys.
             * @param sshAuthorizedKeys the sshAuthorizedKeys parameter value
             * @return the next update stage
             */
            Update withSshAuthorizedKeys(List<SshPublicKey> sshAuthorizedKeys);
        }

    }
}
