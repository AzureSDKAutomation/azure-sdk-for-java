/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2015_11_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.loganalytics.v2015_11_01_preview.implementation.LogAnalyticsManager;
import com.microsoft.azure.management.loganalytics.v2015_11_01_preview.implementation.WorkspaceInner;

/**
 * Type representing Workspace.
 */
public interface Workspace extends HasInner<WorkspaceInner>, Resource, GroupableResourceCore<LogAnalyticsManager, WorkspaceInner>, HasResourceGroup, Refreshable<Workspace>, Updatable<Workspace.Update>, HasManager<LogAnalyticsManager> {
    /**
     * @return the customerId value.
     */
    String customerId();

    /**
     * @return the eTag value.
     */
    String eTag();

    /**
     * @return the portalUrl value.
     */
    String portalUrl();

    /**
     * @return the provisioningState value.
     */
    EntityStatus provisioningState();

    /**
     * @return the retentionInDays value.
     */
    Integer retentionInDays();

    /**
     * @return the sku value.
     */
    Sku sku();

    /**
     * @return the source value.
     */
    String source();

    /**
     * The entirety of the Workspace definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Workspace definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Workspace definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the Workspace definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the workspace definition allowing to specify ETag.
         */
        interface WithETag {
            /**
             * Specifies eTag.
             * @param eTag The ETag of the workspace
             * @return the next definition stage
             */
            WithCreate withETag(String eTag);
        }

        /**
         * The stage of the workspace definition allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             * @param provisioningState The provisioning state of the workspace. Possible values include: 'Creating', 'Succeeded', 'Failed', 'Canceled', 'Deleting', 'ProvisioningAccount'
             * @return the next definition stage
             */
            WithCreate withProvisioningState(EntityStatus provisioningState);
        }

        /**
         * The stage of the workspace definition allowing to specify RetentionInDays.
         */
        interface WithRetentionInDays {
            /**
             * Specifies retentionInDays.
             * @param retentionInDays The workspace data retention in days. -1 means Unlimited retention for the Unlimited Sku. 730 days is the maximum allowed for all other Skus
             * @return the next definition stage
             */
            WithCreate withRetentionInDays(Integer retentionInDays);
        }

        /**
         * The stage of the workspace definition allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku The SKU of the workspace
             * @return the next definition stage
             */
            WithCreate withSku(Sku sku);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Workspace>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithETag, DefinitionStages.WithProvisioningState, DefinitionStages.WithRetentionInDays, DefinitionStages.WithSku {
        }
    }
    /**
     * The template for a Workspace update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Workspace>, Resource.UpdateWithTags<Update>, UpdateStages.WithETag, UpdateStages.WithProvisioningState, UpdateStages.WithRetentionInDays, UpdateStages.WithSku {
    }

    /**
     * Grouping of Workspace update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the workspace update allowing to specify ETag.
         */
        interface WithETag {
            /**
             * Specifies eTag.
             * @param eTag The ETag of the workspace
             * @return the next update stage
             */
            Update withETag(String eTag);
        }

        /**
         * The stage of the workspace update allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             * @param provisioningState The provisioning state of the workspace. Possible values include: 'Creating', 'Succeeded', 'Failed', 'Canceled', 'Deleting', 'ProvisioningAccount'
             * @return the next update stage
             */
            Update withProvisioningState(EntityStatus provisioningState);
        }

        /**
         * The stage of the workspace update allowing to specify RetentionInDays.
         */
        interface WithRetentionInDays {
            /**
             * Specifies retentionInDays.
             * @param retentionInDays The workspace data retention in days. -1 means Unlimited retention for the Unlimited Sku. 730 days is the maximum allowed for all other Skus
             * @return the next update stage
             */
            Update withRetentionInDays(Integer retentionInDays);
        }

        /**
         * The stage of the workspace update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku The SKU of the workspace
             * @return the next update stage
             */
            Update withSku(Sku sku);
        }

    }
}
