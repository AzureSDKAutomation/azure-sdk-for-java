// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.SensitivityLabelInner;

/** An immutable client-side representation of SensitivityLabel. */
public interface SensitivityLabel {
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
     * Gets the managedBy property: Resource that manages the sensitivity label.
     *
     * @return the managedBy value.
     */
    String managedBy();

    /**
     * Gets the schemaName property: The schema name.
     *
     * @return the schemaName value.
     */
    String schemaName();

    /**
     * Gets the tableName property: The table name.
     *
     * @return the tableName value.
     */
    String tableName();

    /**
     * Gets the columnName property: The column name.
     *
     * @return the columnName value.
     */
    String columnName();

    /**
     * Gets the labelName property: The label name.
     *
     * @return the labelName value.
     */
    String labelName();

    /**
     * Gets the labelId property: The label ID.
     *
     * @return the labelId value.
     */
    String labelId();

    /**
     * Gets the informationType property: The information type.
     *
     * @return the informationType value.
     */
    String informationType();

    /**
     * Gets the informationTypeId property: The information type ID.
     *
     * @return the informationTypeId value.
     */
    String informationTypeId();

    /**
     * Gets the isDisabled property: Is sensitivity recommendation disabled. Applicable for recommended sensitivity
     * label only. Specifies whether the sensitivity recommendation on this column is disabled (dismissed) or not.
     *
     * @return the isDisabled value.
     */
    Boolean isDisabled();

    /**
     * Gets the rank property: The rank property.
     *
     * @return the rank value.
     */
    SensitivityLabelRank rank();

    /**
     * Gets the inner com.azure.resourcemanager.sql.generated.fluent.models.SensitivityLabelInner object.
     *
     * @return the inner object.
     */
    SensitivityLabelInner innerModel();

    /** The entirety of the SensitivityLabel definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The SensitivityLabel definition stages. */
    interface DefinitionStages {
        /** The first stage of the SensitivityLabel definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the SensitivityLabel definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, serverName, databaseName, schemaName, tableName.
             *
             * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this
             *     value from the Azure Resource Manager API or the portal.
             * @param serverName The name of the server.
             * @param databaseName The name of the database.
             * @param schemaName The name of the schema.
             * @param tableName The name of the table.
             * @return the next definition stage.
             */
            WithCreate withExistingTable(
                String resourceGroupName, String serverName, String databaseName, String schemaName, String tableName);
        }
        /**
         * The stage of the SensitivityLabel definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithLabelName,
                DefinitionStages.WithLabelId,
                DefinitionStages.WithInformationType,
                DefinitionStages.WithInformationTypeId,
                DefinitionStages.WithRank {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            SensitivityLabel create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            SensitivityLabel create(Context context);
        }
        /** The stage of the SensitivityLabel definition allowing to specify labelName. */
        interface WithLabelName {
            /**
             * Specifies the labelName property: The label name..
             *
             * @param labelName The label name.
             * @return the next definition stage.
             */
            WithCreate withLabelName(String labelName);
        }
        /** The stage of the SensitivityLabel definition allowing to specify labelId. */
        interface WithLabelId {
            /**
             * Specifies the labelId property: The label ID..
             *
             * @param labelId The label ID.
             * @return the next definition stage.
             */
            WithCreate withLabelId(String labelId);
        }
        /** The stage of the SensitivityLabel definition allowing to specify informationType. */
        interface WithInformationType {
            /**
             * Specifies the informationType property: The information type..
             *
             * @param informationType The information type.
             * @return the next definition stage.
             */
            WithCreate withInformationType(String informationType);
        }
        /** The stage of the SensitivityLabel definition allowing to specify informationTypeId. */
        interface WithInformationTypeId {
            /**
             * Specifies the informationTypeId property: The information type ID..
             *
             * @param informationTypeId The information type ID.
             * @return the next definition stage.
             */
            WithCreate withInformationTypeId(String informationTypeId);
        }
        /** The stage of the SensitivityLabel definition allowing to specify rank. */
        interface WithRank {
            /**
             * Specifies the rank property: The rank property..
             *
             * @param rank The rank property.
             * @return the next definition stage.
             */
            WithCreate withRank(SensitivityLabelRank rank);
        }
    }
    /**
     * Begins update for the SensitivityLabel resource.
     *
     * @return the stage of resource update.
     */
    SensitivityLabel.Update update();

    /** The template for SensitivityLabel update. */
    interface Update
        extends UpdateStages.WithLabelName,
            UpdateStages.WithLabelId,
            UpdateStages.WithInformationType,
            UpdateStages.WithInformationTypeId,
            UpdateStages.WithRank {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        SensitivityLabel apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        SensitivityLabel apply(Context context);
    }
    /** The SensitivityLabel update stages. */
    interface UpdateStages {
        /** The stage of the SensitivityLabel update allowing to specify labelName. */
        interface WithLabelName {
            /**
             * Specifies the labelName property: The label name..
             *
             * @param labelName The label name.
             * @return the next definition stage.
             */
            Update withLabelName(String labelName);
        }
        /** The stage of the SensitivityLabel update allowing to specify labelId. */
        interface WithLabelId {
            /**
             * Specifies the labelId property: The label ID..
             *
             * @param labelId The label ID.
             * @return the next definition stage.
             */
            Update withLabelId(String labelId);
        }
        /** The stage of the SensitivityLabel update allowing to specify informationType. */
        interface WithInformationType {
            /**
             * Specifies the informationType property: The information type..
             *
             * @param informationType The information type.
             * @return the next definition stage.
             */
            Update withInformationType(String informationType);
        }
        /** The stage of the SensitivityLabel update allowing to specify informationTypeId. */
        interface WithInformationTypeId {
            /**
             * Specifies the informationTypeId property: The information type ID..
             *
             * @param informationTypeId The information type ID.
             * @return the next definition stage.
             */
            Update withInformationTypeId(String informationTypeId);
        }
        /** The stage of the SensitivityLabel update allowing to specify rank. */
        interface WithRank {
            /**
             * Specifies the rank property: The rank property..
             *
             * @param rank The rank property.
             * @return the next definition stage.
             */
            Update withRank(SensitivityLabelRank rank);
        }
    }
}
