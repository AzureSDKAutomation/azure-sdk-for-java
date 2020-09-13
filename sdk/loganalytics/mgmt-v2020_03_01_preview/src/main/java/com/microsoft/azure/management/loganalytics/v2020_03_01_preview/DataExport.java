/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_03_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.implementation.DataExportInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.implementation.LogAnalyticsManager;
import java.util.List;

/**
 * Type representing DataExport.
 */
public interface DataExport extends HasInner<DataExportInner>, Indexable, Refreshable<DataExport>, Updatable<DataExport.Update>, HasManager<LogAnalyticsManager> {
    /**
     * @return the createdDate value.
     */
    String createdDate();

    /**
     * @return the dataExportId value.
     */
    String dataExportId();

    /**
     * @return the dataExportType value.
     */
    Type dataExportType();

    /**
     * @return the enable value.
     */
    Boolean enable();

    /**
     * @return the eventHubName value.
     */
    String eventHubName();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the lastModifiedDate value.
     */
    String lastModifiedDate();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the resourceId value.
     */
    String resourceId();

    /**
     * @return the tableNames value.
     */
    List<String> tableNames();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the DataExport definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithWorkspace, DefinitionStages.WithResourceId, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of DataExport definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a DataExport definition.
         */
        interface Blank extends WithWorkspace {
        }

        /**
         * The stage of the dataexport definition allowing to specify Workspace.
         */
        interface WithWorkspace {
           /**
            * Specifies resourceGroupName, workspaceName.
            * @param resourceGroupName The name of the resource group. The name is case insensitive
            * @param workspaceName The name of the workspace
            * @return the next definition stage
            */
            WithResourceId withExistingWorkspace(String resourceGroupName, String workspaceName);
        }

        /**
         * The stage of the dataexport definition allowing to specify ResourceId.
         */
        interface WithResourceId {
           /**
            * Specifies resourceId.
            * @param resourceId The destination resource ID. This can be copied from the Properties entry of the destination resource in Azure
            * @return the next definition stage
            */
            WithCreate withResourceId(String resourceId);
        }

        /**
         * The stage of the dataexport definition allowing to specify CreatedDate.
         */
        interface WithCreatedDate {
            /**
             * Specifies createdDate.
             * @param createdDate The latest data export rule modification time
             * @return the next definition stage
             */
            WithCreate withCreatedDate(String createdDate);
        }

        /**
         * The stage of the dataexport definition allowing to specify DataExportId.
         */
        interface WithDataExportId {
            /**
             * Specifies dataExportId.
             * @param dataExportId The data export rule ID
             * @return the next definition stage
             */
            WithCreate withDataExportId(String dataExportId);
        }

        /**
         * The stage of the dataexport definition allowing to specify Enable.
         */
        interface WithEnable {
            /**
             * Specifies enable.
             * @param enable Active when enabled
             * @return the next definition stage
             */
            WithCreate withEnable(Boolean enable);
        }

        /**
         * The stage of the dataexport definition allowing to specify EventHubName.
         */
        interface WithEventHubName {
            /**
             * Specifies eventHubName.
             * @param eventHubName Optional. Allows to define an Event Hub name. Not applicable when destination is Storage Account
             * @return the next definition stage
             */
            WithCreate withEventHubName(String eventHubName);
        }

        /**
         * The stage of the dataexport definition allowing to specify LastModifiedDate.
         */
        interface WithLastModifiedDate {
            /**
             * Specifies lastModifiedDate.
             * @param lastModifiedDate Date and time when the export was last modified
             * @return the next definition stage
             */
            WithCreate withLastModifiedDate(String lastModifiedDate);
        }

        /**
         * The stage of the dataexport definition allowing to specify TableNames.
         */
        interface WithTableNames {
            /**
             * Specifies tableNames.
             * @param tableNames An array of tables to export, for example: [“Heartbeat, SecurityEvent”]
             * @return the next definition stage
             */
            WithCreate withTableNames(List<String> tableNames);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<DataExport>, DefinitionStages.WithCreatedDate, DefinitionStages.WithDataExportId, DefinitionStages.WithEnable, DefinitionStages.WithEventHubName, DefinitionStages.WithLastModifiedDate, DefinitionStages.WithTableNames {
        }
    }
    /**
     * The template for a DataExport update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<DataExport>, UpdateStages.WithCreatedDate, UpdateStages.WithDataExportId, UpdateStages.WithEnable, UpdateStages.WithEventHubName, UpdateStages.WithLastModifiedDate, UpdateStages.WithTableNames {
    }

    /**
     * Grouping of DataExport update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the dataexport update allowing to specify CreatedDate.
         */
        interface WithCreatedDate {
            /**
             * Specifies createdDate.
             * @param createdDate The latest data export rule modification time
             * @return the next update stage
             */
            Update withCreatedDate(String createdDate);
        }

        /**
         * The stage of the dataexport update allowing to specify DataExportId.
         */
        interface WithDataExportId {
            /**
             * Specifies dataExportId.
             * @param dataExportId The data export rule ID
             * @return the next update stage
             */
            Update withDataExportId(String dataExportId);
        }

        /**
         * The stage of the dataexport update allowing to specify Enable.
         */
        interface WithEnable {
            /**
             * Specifies enable.
             * @param enable Active when enabled
             * @return the next update stage
             */
            Update withEnable(Boolean enable);
        }

        /**
         * The stage of the dataexport update allowing to specify EventHubName.
         */
        interface WithEventHubName {
            /**
             * Specifies eventHubName.
             * @param eventHubName Optional. Allows to define an Event Hub name. Not applicable when destination is Storage Account
             * @return the next update stage
             */
            Update withEventHubName(String eventHubName);
        }

        /**
         * The stage of the dataexport update allowing to specify LastModifiedDate.
         */
        interface WithLastModifiedDate {
            /**
             * Specifies lastModifiedDate.
             * @param lastModifiedDate Date and time when the export was last modified
             * @return the next update stage
             */
            Update withLastModifiedDate(String lastModifiedDate);
        }

        /**
         * The stage of the dataexport update allowing to specify TableNames.
         */
        interface WithTableNames {
            /**
             * Specifies tableNames.
             * @param tableNames An array of tables to export, for example: [“Heartbeat, SecurityEvent”]
             * @return the next update stage
             */
            Update withTableNames(List<String> tableNames);
        }

    }
}
