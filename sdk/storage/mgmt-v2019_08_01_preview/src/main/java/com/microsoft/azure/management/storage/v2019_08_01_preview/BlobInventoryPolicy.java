/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_08_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.storage.v2019_08_01_preview.implementation.BlobInventoryPolicyInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.storage.v2019_08_01_preview.implementation.StorageManager;
import java.util.List;
import org.joda.time.DateTime;

/**
 * Type representing BlobInventoryPolicy.
 */
public interface BlobInventoryPolicy extends HasInner<BlobInventoryPolicyInner>, Indexable, Refreshable<BlobInventoryPolicy>, Updatable<BlobInventoryPolicy.Update>, HasManager<StorageManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the lastModifiedTime value.
     */
    DateTime lastModifiedTime();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the policy value.
     */
    BlobInventoryPolicySchema policy();

    /**
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the BlobInventoryPolicy definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithStorageAccount, DefinitionStages.WithPolicy, DefinitionStages.WithSystemData, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of BlobInventoryPolicy definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a BlobInventoryPolicy definition.
         */
        interface Blank extends WithStorageAccount {
        }

        /**
         * The stage of the blobinventorypolicy definition allowing to specify StorageAccount.
         */
        interface WithStorageAccount {
           /**
            * Specifies resourceGroupName, accountName.
            * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive
            * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only
            * @return the next definition stage
            */
            WithPolicy withExistingStorageAccount(String resourceGroupName, String accountName);
        }

        /**
         * The stage of the blobinventorypolicy definition allowing to specify Policy.
         */
        interface WithPolicy {
           /**
            * Specifies policy.
            * @param policy The storage account blob inventory policy object. It is composed of policy rules
            * @return the next definition stage
            */
            WithSystemData withPolicy(BlobInventoryPolicySchema policy);
        }

        /**
         * The stage of the blobinventorypolicy definition allowing to specify SystemData.
         */
        interface WithSystemData {
           /**
            * Specifies systemData.
            * @param systemData the systemData parameter value
            * @return the next definition stage
            */
            WithCreate withSystemData(SystemData systemData);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<BlobInventoryPolicy> {
        }
    }
    /**
     * The template for a BlobInventoryPolicy update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<BlobInventoryPolicy>, UpdateStages.WithPolicy, UpdateStages.WithSystemData {
    }

    /**
     * Grouping of BlobInventoryPolicy update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the blobinventorypolicy update allowing to specify Policy.
         */
        interface WithPolicy {
            /**
             * Specifies policy.
             * @param policy The storage account blob inventory policy object. It is composed of policy rules
             * @return the next update stage
             */
            Update withPolicy(BlobInventoryPolicySchema policy);
        }

        /**
         * The stage of the blobinventorypolicy update allowing to specify SystemData.
         */
        interface WithSystemData {
            /**
             * Specifies systemData.
             * @param systemData the systemData parameter value
             * @return the next update stage
             */
            Update withSystemData(SystemData systemData);
        }

    }
}
