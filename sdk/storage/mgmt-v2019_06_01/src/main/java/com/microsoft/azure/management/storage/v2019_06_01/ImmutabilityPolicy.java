/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.storage.v2019_06_01.implementation.ImmutabilityPolicyInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.storage.v2019_06_01.implementation.StorageManager;

/**
 * Type representing ImmutabilityPolicy.
 */
public interface ImmutabilityPolicy extends HasInner<ImmutabilityPolicyInner>, Indexable, Refreshable<ImmutabilityPolicy>, Updatable<ImmutabilityPolicy.Update>, HasManager<StorageManager> {
    /**
     * @return the allowProtectedAppendWrites value.
     */
    Boolean allowProtectedAppendWrites();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the immutabilityPeriodSinceCreationInDays value.
     */
    Integer immutabilityPeriodSinceCreationInDays();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the state value.
     */
    ImmutabilityPolicyState state();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the ImmutabilityPolicy definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithContainer, DefinitionStages.WithIfMatch, DefinitionStages.WithImmutabilityPeriodSinceCreationInDays, DefinitionStages.WithAllowProtectedAppendWrites, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ImmutabilityPolicy definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ImmutabilityPolicy definition.
         */
        interface Blank extends WithContainer {
        }

        /**
         * The stage of the immutabilitypolicy definition allowing to specify Container.
         */
        interface WithContainer {
           /**
            * Specifies resourceGroupName, accountName, containerName.
            * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive
            * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only
            * @param containerName The name of the blob container within the specified storage account. Blob container names must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-) character must be immediately preceded and followed by a letter or number
            * @return the next definition stage
            */
            WithIfMatch withExistingContainer(String resourceGroupName, String accountName, String containerName);
        }

        /**
         * The stage of the immutabilitypolicy definition allowing to specify IfMatch.
         */
        interface WithIfMatch {
           /**
            * Specifies ifMatch.
            * @param ifMatch The entity state (ETag) version of the immutability policy to update. A value of "*" can be used to apply the operation only if the immutability policy already exists. If omitted, this operation will always be applied
            * @return the next definition stage
            */
            WithImmutabilityPeriodSinceCreationInDays withIfMatch(String ifMatch);
        }

        /**
         * The stage of the immutabilitypolicy definition allowing to specify ImmutabilityPeriodSinceCreationInDays.
         */
        interface WithImmutabilityPeriodSinceCreationInDays {
           /**
            * Specifies immutabilityPeriodSinceCreationInDays.
            * @param immutabilityPeriodSinceCreationInDays The immutability period for the blobs in the container since the policy creation, in days
            * @return the next definition stage
            */
            WithAllowProtectedAppendWrites withImmutabilityPeriodSinceCreationInDays(Integer immutabilityPeriodSinceCreationInDays);
        }

        /**
         * The stage of the immutabilitypolicy definition allowing to specify AllowProtectedAppendWrites.
         */
        interface WithAllowProtectedAppendWrites {
           /**
            * Specifies allowProtectedAppendWrites.
            * @param allowProtectedAppendWrites This property can only be changed for unlocked time-based retention policies. When enabled, new blocks can be written to an append blob while maintaining immutability protection and compliance. Only new blocks can be added and any existing blocks cannot be modified or deleted. This property cannot be changed with ExtendImmutabilityPolicy API
            * @return the next definition stage
            */
            WithCreate withAllowProtectedAppendWrites(Boolean allowProtectedAppendWrites);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ImmutabilityPolicy> {
        }
    }
    /**
     * The template for a ImmutabilityPolicy update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ImmutabilityPolicy>, UpdateStages.WithIfMatch, UpdateStages.WithImmutabilityPeriodSinceCreationInDays, UpdateStages.WithAllowProtectedAppendWrites {
    }

    /**
     * Grouping of ImmutabilityPolicy update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the immutabilitypolicy update allowing to specify IfMatch.
         */
        interface WithIfMatch {
            /**
             * Specifies ifMatch.
             * @param ifMatch The entity state (ETag) version of the immutability policy to update. A value of "*" can be used to apply the operation only if the immutability policy already exists. If omitted, this operation will always be applied
             * @return the next update stage
             */
            Update withIfMatch(String ifMatch);
        }

        /**
         * The stage of the immutabilitypolicy update allowing to specify ImmutabilityPeriodSinceCreationInDays.
         */
        interface WithImmutabilityPeriodSinceCreationInDays {
            /**
             * Specifies immutabilityPeriodSinceCreationInDays.
             * @param immutabilityPeriodSinceCreationInDays The immutability period for the blobs in the container since the policy creation, in days
             * @return the next update stage
             */
            Update withImmutabilityPeriodSinceCreationInDays(Integer immutabilityPeriodSinceCreationInDays);
        }

        /**
         * The stage of the immutabilitypolicy update allowing to specify AllowProtectedAppendWrites.
         */
        interface WithAllowProtectedAppendWrites {
            /**
             * Specifies allowProtectedAppendWrites.
             * @param allowProtectedAppendWrites This property can only be changed for unlocked time-based retention policies. When enabled, new blocks can be written to an append blob while maintaining immutability protection and compliance. Only new blocks can be added and any existing blocks cannot be modified or deleted. This property cannot be changed with ExtendImmutabilityPolicy API
             * @return the next update stage
             */
            Update withAllowProtectedAppendWrites(Boolean allowProtectedAppendWrites);
        }

    }
}
