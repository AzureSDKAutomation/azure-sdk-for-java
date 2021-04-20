// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.ManagedDatabaseInner;
import java.time.OffsetDateTime;
import java.util.Map;

/** An immutable client-side representation of ManagedDatabase. */
public interface ManagedDatabase {
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
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the collation property: Collation of the managed database.
     *
     * @return the collation value.
     */
    String collation();

    /**
     * Gets the status property: Status of the database.
     *
     * @return the status value.
     */
    ManagedDatabaseStatus status();

    /**
     * Gets the creationDate property: Creation date of the database.
     *
     * @return the creationDate value.
     */
    OffsetDateTime creationDate();

    /**
     * Gets the earliestRestorePoint property: Earliest restore point in time for point in time restore.
     *
     * @return the earliestRestorePoint value.
     */
    OffsetDateTime earliestRestorePoint();

    /**
     * Gets the restorePointInTime property: Conditional. If createMode is PointInTimeRestore, this value is required.
     * Specifies the point in time (ISO8601 format) of the source database that will be restored to create the new
     * database.
     *
     * @return the restorePointInTime value.
     */
    OffsetDateTime restorePointInTime();

    /**
     * Gets the defaultSecondaryLocation property: Geo paired region.
     *
     * @return the defaultSecondaryLocation value.
     */
    String defaultSecondaryLocation();

    /**
     * Gets the catalogCollation property: Collation of the metadata catalog.
     *
     * @return the catalogCollation value.
     */
    CatalogCollationType catalogCollation();

    /**
     * Gets the createMode property: Managed database create mode. PointInTimeRestore: Create a database by restoring a
     * point in time backup of an existing database. SourceDatabaseName, SourceManagedInstanceName and PointInTime must
     * be specified. RestoreExternalBackup: Create a database by restoring from external backup files. Collation,
     * StorageContainerUri and StorageContainerSasToken must be specified. Recovery: Creates a database by restoring a
     * geo-replicated backup. RecoverableDatabaseId must be specified as the recoverable database resource ID to
     * restore. RestoreLongTermRetentionBackup: Create a database by restoring from a long term retention backup
     * (longTermRetentionBackupResourceId required).
     *
     * @return the createMode value.
     */
    ManagedDatabaseCreateMode createMode();

    /**
     * Gets the storageContainerUri property: Conditional. If createMode is RestoreExternalBackup, this value is
     * required. Specifies the uri of the storage container where backups for this restore are stored.
     *
     * @return the storageContainerUri value.
     */
    String storageContainerUri();

    /**
     * Gets the sourceDatabaseId property: The resource identifier of the source database associated with create
     * operation of this database.
     *
     * @return the sourceDatabaseId value.
     */
    String sourceDatabaseId();

    /**
     * Gets the restorableDroppedDatabaseId property: The restorable dropped database resource id to restore when
     * creating this database.
     *
     * @return the restorableDroppedDatabaseId value.
     */
    String restorableDroppedDatabaseId();

    /**
     * Gets the storageContainerSasToken property: Conditional. If createMode is RestoreExternalBackup, this value is
     * required. Specifies the storage container sas token.
     *
     * @return the storageContainerSasToken value.
     */
    String storageContainerSasToken();

    /**
     * Gets the failoverGroupId property: Instance Failover Group resource identifier that this managed database belongs
     * to.
     *
     * @return the failoverGroupId value.
     */
    String failoverGroupId();

    /**
     * Gets the recoverableDatabaseId property: The resource identifier of the recoverable database associated with
     * create operation of this database.
     *
     * @return the recoverableDatabaseId value.
     */
    String recoverableDatabaseId();

    /**
     * Gets the longTermRetentionBackupResourceId property: The name of the Long Term Retention backup to be used for
     * restore of this managed database.
     *
     * @return the longTermRetentionBackupResourceId value.
     */
    String longTermRetentionBackupResourceId();

    /**
     * Gets the autoCompleteRestore property: Whether to auto complete restore of this managed database.
     *
     * @return the autoCompleteRestore value.
     */
    Boolean autoCompleteRestore();

    /**
     * Gets the lastBackupName property: Last backup file name for restore of this managed database.
     *
     * @return the lastBackupName value.
     */
    String lastBackupName();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.sql.generated.fluent.models.ManagedDatabaseInner object.
     *
     * @return the inner object.
     */
    ManagedDatabaseInner innerModel();

    /** The entirety of the ManagedDatabase definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithCreate {
    }
    /** The ManagedDatabase definition stages. */
    interface DefinitionStages {
        /** The first stage of the ManagedDatabase definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the ManagedDatabase definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }
        /** The stage of the ManagedDatabase definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, managedInstanceName.
             *
             * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this
             *     value from the Azure Resource Manager API or the portal.
             * @param managedInstanceName The name of the managed instance.
             * @return the next definition stage.
             */
            WithCreate withExistingManagedInstance(String resourceGroupName, String managedInstanceName);
        }
        /**
         * The stage of the ManagedDatabase definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithCollation,
                DefinitionStages.WithRestorePointInTime,
                DefinitionStages.WithCatalogCollation,
                DefinitionStages.WithCreateMode,
                DefinitionStages.WithStorageContainerUri,
                DefinitionStages.WithSourceDatabaseId,
                DefinitionStages.WithRestorableDroppedDatabaseId,
                DefinitionStages.WithStorageContainerSasToken,
                DefinitionStages.WithRecoverableDatabaseId,
                DefinitionStages.WithLongTermRetentionBackupResourceId,
                DefinitionStages.WithAutoCompleteRestore,
                DefinitionStages.WithLastBackupName {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ManagedDatabase create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ManagedDatabase create(Context context);
        }
        /** The stage of the ManagedDatabase definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the ManagedDatabase definition allowing to specify collation. */
        interface WithCollation {
            /**
             * Specifies the collation property: Collation of the managed database..
             *
             * @param collation Collation of the managed database.
             * @return the next definition stage.
             */
            WithCreate withCollation(String collation);
        }
        /** The stage of the ManagedDatabase definition allowing to specify restorePointInTime. */
        interface WithRestorePointInTime {
            /**
             * Specifies the restorePointInTime property: Conditional. If createMode is PointInTimeRestore, this value
             * is required. Specifies the point in time (ISO8601 format) of the source database that will be restored to
             * create the new database..
             *
             * @param restorePointInTime Conditional. If createMode is PointInTimeRestore, this value is required.
             *     Specifies the point in time (ISO8601 format) of the source database that will be restored to create
             *     the new database.
             * @return the next definition stage.
             */
            WithCreate withRestorePointInTime(OffsetDateTime restorePointInTime);
        }
        /** The stage of the ManagedDatabase definition allowing to specify catalogCollation. */
        interface WithCatalogCollation {
            /**
             * Specifies the catalogCollation property: Collation of the metadata catalog..
             *
             * @param catalogCollation Collation of the metadata catalog.
             * @return the next definition stage.
             */
            WithCreate withCatalogCollation(CatalogCollationType catalogCollation);
        }
        /** The stage of the ManagedDatabase definition allowing to specify createMode. */
        interface WithCreateMode {
            /**
             * Specifies the createMode property: Managed database create mode. PointInTimeRestore: Create a database by
             * restoring a point in time backup of an existing database. SourceDatabaseName, SourceManagedInstanceName
             * and PointInTime must be specified. RestoreExternalBackup: Create a database by restoring from external
             * backup files. Collation, StorageContainerUri and StorageContainerSasToken must be specified. Recovery:
             * Creates a database by restoring a geo-replicated backup. RecoverableDatabaseId must be specified as the
             * recoverable database resource ID to restore. RestoreLongTermRetentionBackup: Create a database by
             * restoring from a long term retention backup (longTermRetentionBackupResourceId required)..
             *
             * @param createMode Managed database create mode. PointInTimeRestore: Create a database by restoring a
             *     point in time backup of an existing database. SourceDatabaseName, SourceManagedInstanceName and
             *     PointInTime must be specified. RestoreExternalBackup: Create a database by restoring from external
             *     backup files. Collation, StorageContainerUri and StorageContainerSasToken must be specified.
             *     Recovery: Creates a database by restoring a geo-replicated backup. RecoverableDatabaseId must be
             *     specified as the recoverable database resource ID to restore. RestoreLongTermRetentionBackup: Create
             *     a database by restoring from a long term retention backup (longTermRetentionBackupResourceId
             *     required).
             * @return the next definition stage.
             */
            WithCreate withCreateMode(ManagedDatabaseCreateMode createMode);
        }
        /** The stage of the ManagedDatabase definition allowing to specify storageContainerUri. */
        interface WithStorageContainerUri {
            /**
             * Specifies the storageContainerUri property: Conditional. If createMode is RestoreExternalBackup, this
             * value is required. Specifies the uri of the storage container where backups for this restore are stored..
             *
             * @param storageContainerUri Conditional. If createMode is RestoreExternalBackup, this value is required.
             *     Specifies the uri of the storage container where backups for this restore are stored.
             * @return the next definition stage.
             */
            WithCreate withStorageContainerUri(String storageContainerUri);
        }
        /** The stage of the ManagedDatabase definition allowing to specify sourceDatabaseId. */
        interface WithSourceDatabaseId {
            /**
             * Specifies the sourceDatabaseId property: The resource identifier of the source database associated with
             * create operation of this database..
             *
             * @param sourceDatabaseId The resource identifier of the source database associated with create operation
             *     of this database.
             * @return the next definition stage.
             */
            WithCreate withSourceDatabaseId(String sourceDatabaseId);
        }
        /** The stage of the ManagedDatabase definition allowing to specify restorableDroppedDatabaseId. */
        interface WithRestorableDroppedDatabaseId {
            /**
             * Specifies the restorableDroppedDatabaseId property: The restorable dropped database resource id to
             * restore when creating this database..
             *
             * @param restorableDroppedDatabaseId The restorable dropped database resource id to restore when creating
             *     this database.
             * @return the next definition stage.
             */
            WithCreate withRestorableDroppedDatabaseId(String restorableDroppedDatabaseId);
        }
        /** The stage of the ManagedDatabase definition allowing to specify storageContainerSasToken. */
        interface WithStorageContainerSasToken {
            /**
             * Specifies the storageContainerSasToken property: Conditional. If createMode is RestoreExternalBackup,
             * this value is required. Specifies the storage container sas token..
             *
             * @param storageContainerSasToken Conditional. If createMode is RestoreExternalBackup, this value is
             *     required. Specifies the storage container sas token.
             * @return the next definition stage.
             */
            WithCreate withStorageContainerSasToken(String storageContainerSasToken);
        }
        /** The stage of the ManagedDatabase definition allowing to specify recoverableDatabaseId. */
        interface WithRecoverableDatabaseId {
            /**
             * Specifies the recoverableDatabaseId property: The resource identifier of the recoverable database
             * associated with create operation of this database..
             *
             * @param recoverableDatabaseId The resource identifier of the recoverable database associated with create
             *     operation of this database.
             * @return the next definition stage.
             */
            WithCreate withRecoverableDatabaseId(String recoverableDatabaseId);
        }
        /** The stage of the ManagedDatabase definition allowing to specify longTermRetentionBackupResourceId. */
        interface WithLongTermRetentionBackupResourceId {
            /**
             * Specifies the longTermRetentionBackupResourceId property: The name of the Long Term Retention backup to
             * be used for restore of this managed database..
             *
             * @param longTermRetentionBackupResourceId The name of the Long Term Retention backup to be used for
             *     restore of this managed database.
             * @return the next definition stage.
             */
            WithCreate withLongTermRetentionBackupResourceId(String longTermRetentionBackupResourceId);
        }
        /** The stage of the ManagedDatabase definition allowing to specify autoCompleteRestore. */
        interface WithAutoCompleteRestore {
            /**
             * Specifies the autoCompleteRestore property: Whether to auto complete restore of this managed database..
             *
             * @param autoCompleteRestore Whether to auto complete restore of this managed database.
             * @return the next definition stage.
             */
            WithCreate withAutoCompleteRestore(Boolean autoCompleteRestore);
        }
        /** The stage of the ManagedDatabase definition allowing to specify lastBackupName. */
        interface WithLastBackupName {
            /**
             * Specifies the lastBackupName property: Last backup file name for restore of this managed database..
             *
             * @param lastBackupName Last backup file name for restore of this managed database.
             * @return the next definition stage.
             */
            WithCreate withLastBackupName(String lastBackupName);
        }
    }
    /**
     * Begins update for the ManagedDatabase resource.
     *
     * @return the stage of resource update.
     */
    ManagedDatabase.Update update();

    /** The template for ManagedDatabase update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithCollation,
            UpdateStages.WithRestorePointInTime,
            UpdateStages.WithCatalogCollation,
            UpdateStages.WithCreateMode,
            UpdateStages.WithStorageContainerUri,
            UpdateStages.WithSourceDatabaseId,
            UpdateStages.WithRestorableDroppedDatabaseId,
            UpdateStages.WithStorageContainerSasToken,
            UpdateStages.WithRecoverableDatabaseId,
            UpdateStages.WithLongTermRetentionBackupResourceId,
            UpdateStages.WithLastBackupName {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ManagedDatabase apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ManagedDatabase apply(Context context);
    }
    /** The ManagedDatabase update stages. */
    interface UpdateStages {
        /** The stage of the ManagedDatabase update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the ManagedDatabase update allowing to specify collation. */
        interface WithCollation {
            /**
             * Specifies the collation property: Collation of the managed database..
             *
             * @param collation Collation of the managed database.
             * @return the next definition stage.
             */
            Update withCollation(String collation);
        }
        /** The stage of the ManagedDatabase update allowing to specify restorePointInTime. */
        interface WithRestorePointInTime {
            /**
             * Specifies the restorePointInTime property: Conditional. If createMode is PointInTimeRestore, this value
             * is required. Specifies the point in time (ISO8601 format) of the source database that will be restored to
             * create the new database..
             *
             * @param restorePointInTime Conditional. If createMode is PointInTimeRestore, this value is required.
             *     Specifies the point in time (ISO8601 format) of the source database that will be restored to create
             *     the new database.
             * @return the next definition stage.
             */
            Update withRestorePointInTime(OffsetDateTime restorePointInTime);
        }
        /** The stage of the ManagedDatabase update allowing to specify catalogCollation. */
        interface WithCatalogCollation {
            /**
             * Specifies the catalogCollation property: Collation of the metadata catalog..
             *
             * @param catalogCollation Collation of the metadata catalog.
             * @return the next definition stage.
             */
            Update withCatalogCollation(CatalogCollationType catalogCollation);
        }
        /** The stage of the ManagedDatabase update allowing to specify createMode. */
        interface WithCreateMode {
            /**
             * Specifies the createMode property: Managed database create mode. PointInTimeRestore: Create a database by
             * restoring a point in time backup of an existing database. SourceDatabaseName, SourceManagedInstanceName
             * and PointInTime must be specified. RestoreExternalBackup: Create a database by restoring from external
             * backup files. Collation, StorageContainerUri and StorageContainerSasToken must be specified. Recovery:
             * Creates a database by restoring a geo-replicated backup. RecoverableDatabaseId must be specified as the
             * recoverable database resource ID to restore. RestoreLongTermRetentionBackup: Create a database by
             * restoring from a long term retention backup (longTermRetentionBackupResourceId required)..
             *
             * @param createMode Managed database create mode. PointInTimeRestore: Create a database by restoring a
             *     point in time backup of an existing database. SourceDatabaseName, SourceManagedInstanceName and
             *     PointInTime must be specified. RestoreExternalBackup: Create a database by restoring from external
             *     backup files. Collation, StorageContainerUri and StorageContainerSasToken must be specified.
             *     Recovery: Creates a database by restoring a geo-replicated backup. RecoverableDatabaseId must be
             *     specified as the recoverable database resource ID to restore. RestoreLongTermRetentionBackup: Create
             *     a database by restoring from a long term retention backup (longTermRetentionBackupResourceId
             *     required).
             * @return the next definition stage.
             */
            Update withCreateMode(ManagedDatabaseCreateMode createMode);
        }
        /** The stage of the ManagedDatabase update allowing to specify storageContainerUri. */
        interface WithStorageContainerUri {
            /**
             * Specifies the storageContainerUri property: Conditional. If createMode is RestoreExternalBackup, this
             * value is required. Specifies the uri of the storage container where backups for this restore are stored..
             *
             * @param storageContainerUri Conditional. If createMode is RestoreExternalBackup, this value is required.
             *     Specifies the uri of the storage container where backups for this restore are stored.
             * @return the next definition stage.
             */
            Update withStorageContainerUri(String storageContainerUri);
        }
        /** The stage of the ManagedDatabase update allowing to specify sourceDatabaseId. */
        interface WithSourceDatabaseId {
            /**
             * Specifies the sourceDatabaseId property: The resource identifier of the source database associated with
             * create operation of this database..
             *
             * @param sourceDatabaseId The resource identifier of the source database associated with create operation
             *     of this database.
             * @return the next definition stage.
             */
            Update withSourceDatabaseId(String sourceDatabaseId);
        }
        /** The stage of the ManagedDatabase update allowing to specify restorableDroppedDatabaseId. */
        interface WithRestorableDroppedDatabaseId {
            /**
             * Specifies the restorableDroppedDatabaseId property: The restorable dropped database resource id to
             * restore when creating this database..
             *
             * @param restorableDroppedDatabaseId The restorable dropped database resource id to restore when creating
             *     this database.
             * @return the next definition stage.
             */
            Update withRestorableDroppedDatabaseId(String restorableDroppedDatabaseId);
        }
        /** The stage of the ManagedDatabase update allowing to specify storageContainerSasToken. */
        interface WithStorageContainerSasToken {
            /**
             * Specifies the storageContainerSasToken property: Conditional. If createMode is RestoreExternalBackup,
             * this value is required. Specifies the storage container sas token..
             *
             * @param storageContainerSasToken Conditional. If createMode is RestoreExternalBackup, this value is
             *     required. Specifies the storage container sas token.
             * @return the next definition stage.
             */
            Update withStorageContainerSasToken(String storageContainerSasToken);
        }
        /** The stage of the ManagedDatabase update allowing to specify recoverableDatabaseId. */
        interface WithRecoverableDatabaseId {
            /**
             * Specifies the recoverableDatabaseId property: The resource identifier of the recoverable database
             * associated with create operation of this database..
             *
             * @param recoverableDatabaseId The resource identifier of the recoverable database associated with create
             *     operation of this database.
             * @return the next definition stage.
             */
            Update withRecoverableDatabaseId(String recoverableDatabaseId);
        }
        /** The stage of the ManagedDatabase update allowing to specify longTermRetentionBackupResourceId. */
        interface WithLongTermRetentionBackupResourceId {
            /**
             * Specifies the longTermRetentionBackupResourceId property: The name of the Long Term Retention backup to
             * be used for restore of this managed database..
             *
             * @param longTermRetentionBackupResourceId The name of the Long Term Retention backup to be used for
             *     restore of this managed database.
             * @return the next definition stage.
             */
            Update withLongTermRetentionBackupResourceId(String longTermRetentionBackupResourceId);
        }
        /** The stage of the ManagedDatabase update allowing to specify lastBackupName. */
        interface WithLastBackupName {
            /**
             * Specifies the lastBackupName property: Last backup file name for restore of this managed database..
             *
             * @param lastBackupName Last backup file name for restore of this managed database.
             * @return the next definition stage.
             */
            Update withLastBackupName(String lastBackupName);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ManagedDatabase refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ManagedDatabase refresh(Context context);

    /**
     * Completes the restore operation on a managed database.
     *
     * @param parameters The definition for completing the restore of this managed database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void completeRestore(CompleteDatabaseRestoreDefinition parameters);

    /**
     * Completes the restore operation on a managed database.
     *
     * @param parameters The definition for completing the restore of this managed database.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void completeRestore(CompleteDatabaseRestoreDefinition parameters, Context context);
}
