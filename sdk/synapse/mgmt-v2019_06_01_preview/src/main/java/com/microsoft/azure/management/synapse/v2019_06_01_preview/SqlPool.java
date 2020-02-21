/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation.SqlPoolInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation.SynapseManager;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * Type representing SqlPool.
 */
public interface SqlPool extends HasInner<SqlPoolInner>, Indexable, Refreshable<SqlPool>, Updatable<SqlPool.Update>, HasManager<SynapseManager> {
    /**
     * @return the collation value.
     */
    String collation();

    /**
     * @return the createMode value.
     */
    String createMode();

    /**
     * @return the creationDate value.
     */
    DateTime creationDate();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the maxSizeBytes value.
     */
    Long maxSizeBytes();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the recoverableDatabaseId value.
     */
    String recoverableDatabaseId();

    /**
     * @return the restorePointInTime value.
     */
    DateTime restorePointInTime();

    /**
     * @return the sku value.
     */
    Sku sku();

    /**
     * @return the sourceDatabaseId value.
     */
    String sourceDatabaseId();

    /**
     * @return the status value.
     */
    String status();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the SqlPool definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithWorkspace, DefinitionStages.WithLocation, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of SqlPool definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a SqlPool definition.
         */
        interface Blank extends WithWorkspace {
        }

        /**
         * The stage of the sqlpool definition allowing to specify Workspace.
         */
        interface WithWorkspace {
           /**
            * Specifies resourceGroupName, workspaceName.
            * @param resourceGroupName The name of the resource group. The name is case insensitive
            * @param workspaceName The name of the workspace
            * @return the next definition stage
            */
            WithLocation withExistingWorkspace(String resourceGroupName, String workspaceName);
        }

        /**
         * The stage of the sqlpool definition allowing to specify Location.
         */
        interface WithLocation {
           /**
            * Specifies location.
            * @param location The geo-location where the resource lives
            * @return the next definition stage
            */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the sqlpool definition allowing to specify Collation.
         */
        interface WithCollation {
            /**
             * Specifies collation.
             * @param collation Collation mode
             * @return the next definition stage
             */
            WithCreate withCollation(String collation);
        }

        /**
         * The stage of the sqlpool definition allowing to specify CreateMode.
         */
        interface WithCreateMode {
            /**
             * Specifies createMode.
             * @param createMode What is this?
             * @return the next definition stage
             */
            WithCreate withCreateMode(String createMode);
        }

        /**
         * The stage of the sqlpool definition allowing to specify CreationDate.
         */
        interface WithCreationDate {
            /**
             * Specifies creationDate.
             * @param creationDate Date the SQL pool was created
             * @return the next definition stage
             */
            WithCreate withCreationDate(DateTime creationDate);
        }

        /**
         * The stage of the sqlpool definition allowing to specify MaxSizeBytes.
         */
        interface WithMaxSizeBytes {
            /**
             * Specifies maxSizeBytes.
             * @param maxSizeBytes Maximum size in bytes
             * @return the next definition stage
             */
            WithCreate withMaxSizeBytes(Long maxSizeBytes);
        }

        /**
         * The stage of the sqlpool definition allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             * @param provisioningState Resource state
             * @return the next definition stage
             */
            WithCreate withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the sqlpool definition allowing to specify RecoverableDatabaseId.
         */
        interface WithRecoverableDatabaseId {
            /**
             * Specifies recoverableDatabaseId.
             * @param recoverableDatabaseId Backup database to restore from
             * @return the next definition stage
             */
            WithCreate withRecoverableDatabaseId(String recoverableDatabaseId);
        }

        /**
         * The stage of the sqlpool definition allowing to specify RestorePointInTime.
         */
        interface WithRestorePointInTime {
            /**
             * Specifies restorePointInTime.
             * @param restorePointInTime Snapshot time to restore
             * @return the next definition stage
             */
            WithCreate withRestorePointInTime(DateTime restorePointInTime);
        }

        /**
         * The stage of the sqlpool definition allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku SQL pool SKU
             * @return the next definition stage
             */
            WithCreate withSku(Sku sku);
        }

        /**
         * The stage of the sqlpool definition allowing to specify SourceDatabaseId.
         */
        interface WithSourceDatabaseId {
            /**
             * Specifies sourceDatabaseId.
             * @param sourceDatabaseId Source database to create from
             * @return the next definition stage
             */
            WithCreate withSourceDatabaseId(String sourceDatabaseId);
        }

        /**
         * The stage of the sqlpool definition allowing to specify Status.
         */
        interface WithStatus {
            /**
             * Specifies status.
             * @param status Resource status
             * @return the next definition stage
             */
            WithCreate withStatus(String status);
        }

        /**
         * The stage of the sqlpool definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Resource tags
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<SqlPool>, DefinitionStages.WithCollation, DefinitionStages.WithCreateMode, DefinitionStages.WithCreationDate, DefinitionStages.WithMaxSizeBytes, DefinitionStages.WithProvisioningState, DefinitionStages.WithRecoverableDatabaseId, DefinitionStages.WithRestorePointInTime, DefinitionStages.WithSku, DefinitionStages.WithSourceDatabaseId, DefinitionStages.WithStatus, DefinitionStages.WithTags {
        }
    }
    /**
     * The template for a SqlPool update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<SqlPool>, UpdateStages.WithCollation, UpdateStages.WithCreateMode, UpdateStages.WithCreationDate, UpdateStages.WithLocation, UpdateStages.WithMaxSizeBytes, UpdateStages.WithProvisioningState, UpdateStages.WithRecoverableDatabaseId, UpdateStages.WithRestorePointInTime, UpdateStages.WithSku, UpdateStages.WithSourceDatabaseId, UpdateStages.WithStatus, UpdateStages.WithTags {
    }

    /**
     * Grouping of SqlPool update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the sqlpool update allowing to specify Collation.
         */
        interface WithCollation {
            /**
             * Specifies collation.
             * @param collation Collation mode
             * @return the next update stage
             */
            Update withCollation(String collation);
        }

        /**
         * The stage of the sqlpool update allowing to specify CreateMode.
         */
        interface WithCreateMode {
            /**
             * Specifies createMode.
             * @param createMode What is this?
             * @return the next update stage
             */
            Update withCreateMode(String createMode);
        }

        /**
         * The stage of the sqlpool update allowing to specify CreationDate.
         */
        interface WithCreationDate {
            /**
             * Specifies creationDate.
             * @param creationDate Date the SQL pool was created
             * @return the next update stage
             */
            Update withCreationDate(DateTime creationDate);
        }

        /**
         * The stage of the sqlpool update allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location The geo-location where the resource lives
             * @return the next update stage
             */
            Update withLocation(String location);
        }

        /**
         * The stage of the sqlpool update allowing to specify MaxSizeBytes.
         */
        interface WithMaxSizeBytes {
            /**
             * Specifies maxSizeBytes.
             * @param maxSizeBytes Maximum size in bytes
             * @return the next update stage
             */
            Update withMaxSizeBytes(Long maxSizeBytes);
        }

        /**
         * The stage of the sqlpool update allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             * @param provisioningState Resource state
             * @return the next update stage
             */
            Update withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the sqlpool update allowing to specify RecoverableDatabaseId.
         */
        interface WithRecoverableDatabaseId {
            /**
             * Specifies recoverableDatabaseId.
             * @param recoverableDatabaseId Backup database to restore from
             * @return the next update stage
             */
            Update withRecoverableDatabaseId(String recoverableDatabaseId);
        }

        /**
         * The stage of the sqlpool update allowing to specify RestorePointInTime.
         */
        interface WithRestorePointInTime {
            /**
             * Specifies restorePointInTime.
             * @param restorePointInTime Snapshot time to restore
             * @return the next update stage
             */
            Update withRestorePointInTime(DateTime restorePointInTime);
        }

        /**
         * The stage of the sqlpool update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku SQL pool SKU
             * @return the next update stage
             */
            Update withSku(Sku sku);
        }

        /**
         * The stage of the sqlpool update allowing to specify SourceDatabaseId.
         */
        interface WithSourceDatabaseId {
            /**
             * Specifies sourceDatabaseId.
             * @param sourceDatabaseId Source database to create from
             * @return the next update stage
             */
            Update withSourceDatabaseId(String sourceDatabaseId);
        }

        /**
         * The stage of the sqlpool update allowing to specify Status.
         */
        interface WithStatus {
            /**
             * Specifies status.
             * @param status Resource status
             * @return the next update stage
             */
            Update withStatus(String status);
        }

        /**
         * The stage of the sqlpool update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Resource tags
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

    }
}
