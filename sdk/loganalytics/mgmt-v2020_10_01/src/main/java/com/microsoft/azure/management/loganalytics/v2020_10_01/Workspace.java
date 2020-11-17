/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_10_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.loganalytics.v2020_10_01.implementation.LogAnalyticsManager;
import java.util.List;
import com.microsoft.azure.management.loganalytics.v2020_10_01.implementation.WorkspaceInner;

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
     * @return the forceQueryCmk value.
     */
    Boolean forceQueryCmk();

    /**
     * @return the privateLinkScopedResources value.
     */
    List<PrivateLinkScopedResource> privateLinkScopedResources();

    /**
     * @return the provisioningState value.
     */
    WorkspaceEntityStatus provisioningState();

    /**
     * @return the publicNetworkAccessForIngestion value.
     */
    PublicNetworkAccessType publicNetworkAccessForIngestion();

    /**
     * @return the publicNetworkAccessForQuery value.
     */
    PublicNetworkAccessType publicNetworkAccessForQuery();

    /**
     * @return the retentionInDays value.
     */
    Integer retentionInDays();

    /**
     * @return the sku value.
     */
    WorkspaceSku sku();

    /**
     * @return the workspaceCapping value.
     */
    WorkspaceCapping workspaceCapping();

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
         * The stage of the workspace definition allowing to specify ForceQueryCmk.
         */
        interface WithForceQueryCmk {
            /**
             * Specifies forceQueryCmk.
             * @param forceQueryCmk Indicates whether customer managed storage is mandatory for query management
             * @return the next definition stage
             */
            WithCreate withForceQueryCmk(Boolean forceQueryCmk);
        }

        /**
         * The stage of the workspace definition allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             * @param provisioningState The provisioning state of the workspace. Possible values include: 'Creating', 'Succeeded', 'Failed', 'Canceled', 'Deleting', 'ProvisioningAccount', 'Updating'
             * @return the next definition stage
             */
            WithCreate withProvisioningState(WorkspaceEntityStatus provisioningState);
        }

        /**
         * The stage of the workspace definition allowing to specify PublicNetworkAccessForIngestion.
         */
        interface WithPublicNetworkAccessForIngestion {
            /**
             * Specifies publicNetworkAccessForIngestion.
             * @param publicNetworkAccessForIngestion The network access type for accessing Log Analytics ingestion. Possible values include: 'Enabled', 'Disabled'
             * @return the next definition stage
             */
            WithCreate withPublicNetworkAccessForIngestion(PublicNetworkAccessType publicNetworkAccessForIngestion);
        }

        /**
         * The stage of the workspace definition allowing to specify PublicNetworkAccessForQuery.
         */
        interface WithPublicNetworkAccessForQuery {
            /**
             * Specifies publicNetworkAccessForQuery.
             * @param publicNetworkAccessForQuery The network access type for accessing Log Analytics query. Possible values include: 'Enabled', 'Disabled'
             * @return the next definition stage
             */
            WithCreate withPublicNetworkAccessForQuery(PublicNetworkAccessType publicNetworkAccessForQuery);
        }

        /**
         * The stage of the workspace definition allowing to specify RetentionInDays.
         */
        interface WithRetentionInDays {
            /**
             * Specifies retentionInDays.
             * @param retentionInDays The workspace data retention in days, between 30 and 730
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
            WithCreate withSku(WorkspaceSku sku);
        }

        /**
         * The stage of the workspace definition allowing to specify WorkspaceCapping.
         */
        interface WithWorkspaceCapping {
            /**
             * Specifies workspaceCapping.
             * @param workspaceCapping The daily volume cap for ingestion
             * @return the next definition stage
             */
            WithCreate withWorkspaceCapping(WorkspaceCapping workspaceCapping);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Workspace>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithETag, DefinitionStages.WithForceQueryCmk, DefinitionStages.WithProvisioningState, DefinitionStages.WithPublicNetworkAccessForIngestion, DefinitionStages.WithPublicNetworkAccessForQuery, DefinitionStages.WithRetentionInDays, DefinitionStages.WithSku, DefinitionStages.WithWorkspaceCapping {
        }
    }
    /**
     * The template for a Workspace update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Workspace>, Resource.UpdateWithTags<Update>, UpdateStages.WithForceQueryCmk, UpdateStages.WithProvisioningState, UpdateStages.WithPublicNetworkAccessForIngestion, UpdateStages.WithPublicNetworkAccessForQuery, UpdateStages.WithRetentionInDays, UpdateStages.WithSku, UpdateStages.WithWorkspaceCapping {
    }

    /**
     * Grouping of Workspace update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the workspace update allowing to specify ForceQueryCmk.
         */
        interface WithForceQueryCmk {
            /**
             * Specifies forceQueryCmk.
             * @param forceQueryCmk Indicates whether customer managed storage is mandatory for query management
             * @return the next update stage
             */
            Update withForceQueryCmk(Boolean forceQueryCmk);
        }

        /**
         * The stage of the workspace update allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             * @param provisioningState The provisioning state of the workspace. Possible values include: 'Creating', 'Succeeded', 'Failed', 'Canceled', 'Deleting', 'ProvisioningAccount', 'Updating'
             * @return the next update stage
             */
            Update withProvisioningState(WorkspaceEntityStatus provisioningState);
        }

        /**
         * The stage of the workspace update allowing to specify PublicNetworkAccessForIngestion.
         */
        interface WithPublicNetworkAccessForIngestion {
            /**
             * Specifies publicNetworkAccessForIngestion.
             * @param publicNetworkAccessForIngestion The network access type for accessing Log Analytics ingestion. Possible values include: 'Enabled', 'Disabled'
             * @return the next update stage
             */
            Update withPublicNetworkAccessForIngestion(PublicNetworkAccessType publicNetworkAccessForIngestion);
        }

        /**
         * The stage of the workspace update allowing to specify PublicNetworkAccessForQuery.
         */
        interface WithPublicNetworkAccessForQuery {
            /**
             * Specifies publicNetworkAccessForQuery.
             * @param publicNetworkAccessForQuery The network access type for accessing Log Analytics query. Possible values include: 'Enabled', 'Disabled'
             * @return the next update stage
             */
            Update withPublicNetworkAccessForQuery(PublicNetworkAccessType publicNetworkAccessForQuery);
        }

        /**
         * The stage of the workspace update allowing to specify RetentionInDays.
         */
        interface WithRetentionInDays {
            /**
             * Specifies retentionInDays.
             * @param retentionInDays The workspace data retention in days, between 30 and 730
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
            Update withSku(WorkspaceSku sku);
        }

        /**
         * The stage of the workspace update allowing to specify WorkspaceCapping.
         */
        interface WithWorkspaceCapping {
            /**
             * Specifies workspaceCapping.
             * @param workspaceCapping The daily volume cap for ingestion
             * @return the next update stage
             */
            Update withWorkspaceCapping(WorkspaceCapping workspaceCapping);
        }

    }
}
