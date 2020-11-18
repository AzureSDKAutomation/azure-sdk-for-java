/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020-12-01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.synapse.v2020-12-01.implementation.KeyInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.synapse.v2020-12-01.implementation.SynapseManager;

/**
 * Type representing Key.
 */
public interface Key extends HasInner<KeyInner>, Indexable, Refreshable<Key>, Updatable<Key.Update>, HasManager<SynapseManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the isActiveCMK value.
     */
    Boolean isActiveCMK();

    /**
     * @return the keyVaultUrl value.
     */
    String keyVaultUrl();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the Key definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithWorkspace, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Key definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Key definition.
         */
        interface Blank extends WithWorkspace {
        }

        /**
         * The stage of the key definition allowing to specify Workspace.
         */
        interface WithWorkspace {
           /**
            * Specifies resourceGroupName, workspaceName.
            * @param resourceGroupName The name of the resource group. The name is case insensitive
            * @param workspaceName The name of the workspace
            * @return the next definition stage
            */
            WithCreate withExistingWorkspace(String resourceGroupName, String workspaceName);
        }

        /**
         * The stage of the key definition allowing to specify IsActiveCMK.
         */
        interface WithIsActiveCMK {
            /**
             * Specifies isActiveCMK.
             * @param isActiveCMK Used to activate the workspace after a customer managed key is provided
             * @return the next definition stage
             */
            WithCreate withIsActiveCMK(Boolean isActiveCMK);
        }

        /**
         * The stage of the key definition allowing to specify KeyVaultUrl.
         */
        interface WithKeyVaultUrl {
            /**
             * Specifies keyVaultUrl.
             * @param keyVaultUrl The Key Vault Url of the workspace key
             * @return the next definition stage
             */
            WithCreate withKeyVaultUrl(String keyVaultUrl);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Key>, DefinitionStages.WithIsActiveCMK, DefinitionStages.WithKeyVaultUrl {
        }
    }
    /**
     * The template for a Key update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Key>, UpdateStages.WithIsActiveCMK, UpdateStages.WithKeyVaultUrl {
    }

    /**
     * Grouping of Key update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the key update allowing to specify IsActiveCMK.
         */
        interface WithIsActiveCMK {
            /**
             * Specifies isActiveCMK.
             * @param isActiveCMK Used to activate the workspace after a customer managed key is provided
             * @return the next update stage
             */
            Update withIsActiveCMK(Boolean isActiveCMK);
        }

        /**
         * The stage of the key update allowing to specify KeyVaultUrl.
         */
        interface WithKeyVaultUrl {
            /**
             * Specifies keyVaultUrl.
             * @param keyVaultUrl The Key Vault Url of the workspace key
             * @return the next update stage
             */
            Update withKeyVaultUrl(String keyVaultUrl);
        }

    }
}
