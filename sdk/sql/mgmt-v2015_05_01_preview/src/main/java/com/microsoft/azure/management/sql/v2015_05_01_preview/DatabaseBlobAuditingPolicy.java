/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.sql.v2015_05_01_preview.implementation.DatabaseBlobAuditingPolicyInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v2015_05_01_preview.implementation.SqlManager;
import java.util.List;
import java.util.UUID;

/**
 * Type representing DatabaseBlobAuditingPolicy.
 */
public interface DatabaseBlobAuditingPolicy extends HasInner<DatabaseBlobAuditingPolicyInner>, Indexable, Refreshable<DatabaseBlobAuditingPolicy>, Updatable<DatabaseBlobAuditingPolicy.Update>, HasManager<SqlManager> {
    /**
     * @return the auditActionsAndGroups value.
     */
    List<String> auditActionsAndGroups();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the isAzureMonitorTargetEnabled value.
     */
    Boolean isAzureMonitorTargetEnabled();

    /**
     * @return the isStorageSecondaryKeyInUse value.
     */
    Boolean isStorageSecondaryKeyInUse();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the queueDelayMs value.
     */
    Integer queueDelayMs();

    /**
     * @return the retentionDays value.
     */
    Integer retentionDays();

    /**
     * @return the state value.
     */
    BlobAuditingPolicyState state();

    /**
     * @return the storageAccountAccessKey value.
     */
    String storageAccountAccessKey();

    /**
     * @return the storageAccountSubscriptionId value.
     */
    UUID storageAccountSubscriptionId();

    /**
     * @return the storageEndpoint value.
     */
    String storageEndpoint();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the DatabaseBlobAuditingPolicy definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithDatabasis, DefinitionStages.WithState, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of DatabaseBlobAuditingPolicy definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a DatabaseBlobAuditingPolicy definition.
         */
        interface Blank extends WithDatabasis {
        }

        /**
         * The stage of the databaseblobauditingpolicy definition allowing to specify Databasis.
         */
        interface WithDatabasis {
           /**
            * Specifies resourceGroupName, serverName, databaseName.
            * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal
            * @param serverName The name of the server
            * @param databaseName The name of the database
            * @return the next definition stage
            */
            WithState withExistingDatabasis(String resourceGroupName, String serverName, String databaseName);
        }

        /**
         * The stage of the databaseblobauditingpolicy definition allowing to specify State.
         */
        interface WithState {
           /**
            * Specifies state.
            * @param state Specifies the state of the policy. If state is Enabled, storageEndpoint or isAzureMonitorTargetEnabled are required. Possible values include: 'Enabled', 'Disabled'
            * @return the next definition stage
            */
            WithCreate withState(BlobAuditingPolicyState state);
        }

        /**
         * The stage of the databaseblobauditingpolicy definition allowing to specify AuditActionsAndGroups.
         */
        interface WithAuditActionsAndGroups {
            /**
             * Specifies auditActionsAndGroups.
             * @param auditActionsAndGroups Specifies the Actions-Groups and Actions to audit.
 The recommended set of action groups to use is the following combination - this will audit all the queries and stored procedures executed against the database, as well as successful and failed logins:
 BATCH_COMPLETED_GROUP,
 SUCCESSFUL_DATABASE_AUTHENTICATION_GROUP,
 FAILED_DATABASE_AUTHENTICATION_GROUP.
 This above combination is also the set that is configured by default when enabling auditing from the Azure portal.
 The supported action groups to audit are (note: choose only specific groups that cover your auditing needs. Using unnecessary groups could lead to very large quantities of audit records):
 APPLICATION_ROLE_CHANGE_PASSWORD_GROUP
 BACKUP_RESTORE_GROUP
 DATABASE_LOGOUT_GROUP
 DATABASE_OBJECT_CHANGE_GROUP
 DATABASE_OBJECT_OWNERSHIP_CHANGE_GROUP
 DATABASE_OBJECT_PERMISSION_CHANGE_GROUP
 DATABASE_OPERATION_GROUP
 DATABASE_PERMISSION_CHANGE_GROUP
 DATABASE_PRINCIPAL_CHANGE_GROUP
 DATABASE_PRINCIPAL_IMPERSONATION_GROUP
 DATABASE_ROLE_MEMBER_CHANGE_GROUP
 FAILED_DATABASE_AUTHENTICATION_GROUP
 SCHEMA_OBJECT_ACCESS_GROUP
 SCHEMA_OBJECT_CHANGE_GROUP
 SCHEMA_OBJECT_OWNERSHIP_CHANGE_GROUP
 SCHEMA_OBJECT_PERMISSION_CHANGE_GROUP
 SUCCESSFUL_DATABASE_AUTHENTICATION_GROUP
 USER_CHANGE_PASSWORD_GROUP
 BATCH_STARTED_GROUP
 BATCH_COMPLETED_GROUP
 These are groups that cover all sql statements and stored procedures executed against the database, and should not be used in combination with other groups as this will result in duplicate audit logs.
 For more information, see [Database-Level Audit Action Groups](https://docs.microsoft.com/en-us/sql/relational-databases/security/auditing/sql-server-audit-action-groups-and-actions#database-level-audit-action-groups).
 For Database auditing policy, specific Actions can also be specified (note that Actions cannot be specified for Server auditing policy). The supported actions to audit are:
 SELECT
 UPDATE
 INSERT
 DELETE
 EXECUTE
 RECEIVE
 REFERENCES
 The general form for defining an action to be audited is:
 {action} ON {object} BY {principal}
 Note that &lt;object&gt; in the above format can refer to an object like a table, view, or stored procedure, or an entire database or schema. For the latter cases, the forms DATABASE::{db_name} and SCHEMA::{schema_name} are used, respectively.
 For example:
 SELECT on dbo.myTable by public
 SELECT on DATABASE::myDatabase by public
 SELECT on SCHEMA::mySchema by public
 For more information, see [Database-Level Audit Actions](https://docs.microsoft.com/en-us/sql/relational-databases/security/auditing/sql-server-audit-action-groups-and-actions#database-level-audit-actions)
             * @return the next definition stage
             */
            WithCreate withAuditActionsAndGroups(List<String> auditActionsAndGroups);
        }

        /**
         * The stage of the databaseblobauditingpolicy definition allowing to specify IsAzureMonitorTargetEnabled.
         */
        interface WithIsAzureMonitorTargetEnabled {
            /**
             * Specifies isAzureMonitorTargetEnabled.
             * @param isAzureMonitorTargetEnabled Specifies whether audit events are sent to Azure Monitor.
 In order to send the events to Azure Monitor, specify 'state' as 'Enabled' and 'isAzureMonitorTargetEnabled' as true.
 When using REST API to configure auditing, Diagnostic Settings with 'SQLSecurityAuditEvents' diagnostic logs category on the database should be also created.
 Note that for server level audit you should use the 'master' database as {databaseName}.
 Diagnostic Settings URI format:
 PUT https://management.azure.com/subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/providers/microsoft.insights/diagnosticSettings/{settingsName}?api-version=2017-05-01-preview
 For more information, see [Diagnostic Settings REST API](https://go.microsoft.com/fwlink/?linkid=2033207)
 or [Diagnostic Settings PowerShell](https://go.microsoft.com/fwlink/?linkid=2033043)
             * @return the next definition stage
             */
            WithCreate withIsAzureMonitorTargetEnabled(Boolean isAzureMonitorTargetEnabled);
        }

        /**
         * The stage of the databaseblobauditingpolicy definition allowing to specify IsStorageSecondaryKeyInUse.
         */
        interface WithIsStorageSecondaryKeyInUse {
            /**
             * Specifies isStorageSecondaryKeyInUse.
             * @param isStorageSecondaryKeyInUse Specifies whether storageAccountAccessKey value is the storage's secondary key
             * @return the next definition stage
             */
            WithCreate withIsStorageSecondaryKeyInUse(Boolean isStorageSecondaryKeyInUse);
        }

        /**
         * The stage of the databaseblobauditingpolicy definition allowing to specify QueueDelayMs.
         */
        interface WithQueueDelayMs {
            /**
             * Specifies queueDelayMs.
             * @param queueDelayMs Specifies the amount of time in milliseconds that can elapse before audit actions are forced to be processed.
 The default minimum value is 1000 (1 second). The maximum is 2,147,483,647
             * @return the next definition stage
             */
            WithCreate withQueueDelayMs(Integer queueDelayMs);
        }

        /**
         * The stage of the databaseblobauditingpolicy definition allowing to specify RetentionDays.
         */
        interface WithRetentionDays {
            /**
             * Specifies retentionDays.
             * @param retentionDays Specifies the number of days to keep in the audit logs in the storage account
             * @return the next definition stage
             */
            WithCreate withRetentionDays(Integer retentionDays);
        }

        /**
         * The stage of the databaseblobauditingpolicy definition allowing to specify StorageAccountAccessKey.
         */
        interface WithStorageAccountAccessKey {
            /**
             * Specifies storageAccountAccessKey.
             * @param storageAccountAccessKey Specifies the identifier key of the auditing storage account. If state is Enabled and storageEndpoint is specified, storageAccountAccessKey is required
             * @return the next definition stage
             */
            WithCreate withStorageAccountAccessKey(String storageAccountAccessKey);
        }

        /**
         * The stage of the databaseblobauditingpolicy definition allowing to specify StorageAccountSubscriptionId.
         */
        interface WithStorageAccountSubscriptionId {
            /**
             * Specifies storageAccountSubscriptionId.
             * @param storageAccountSubscriptionId Specifies the blob storage subscription Id
             * @return the next definition stage
             */
            WithCreate withStorageAccountSubscriptionId(UUID storageAccountSubscriptionId);
        }

        /**
         * The stage of the databaseblobauditingpolicy definition allowing to specify StorageEndpoint.
         */
        interface WithStorageEndpoint {
            /**
             * Specifies storageEndpoint.
             * @param storageEndpoint Specifies the blob storage endpoint (e.g. https://MyAccount.blob.core.windows.net). If state is Enabled, storageEndpoint or isAzureMonitorTargetEnabled is required
             * @return the next definition stage
             */
            WithCreate withStorageEndpoint(String storageEndpoint);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<DatabaseBlobAuditingPolicy>, DefinitionStages.WithAuditActionsAndGroups, DefinitionStages.WithIsAzureMonitorTargetEnabled, DefinitionStages.WithIsStorageSecondaryKeyInUse, DefinitionStages.WithQueueDelayMs, DefinitionStages.WithRetentionDays, DefinitionStages.WithStorageAccountAccessKey, DefinitionStages.WithStorageAccountSubscriptionId, DefinitionStages.WithStorageEndpoint {
        }
    }
    /**
     * The template for a DatabaseBlobAuditingPolicy update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<DatabaseBlobAuditingPolicy>, UpdateStages.WithAuditActionsAndGroups, UpdateStages.WithIsAzureMonitorTargetEnabled, UpdateStages.WithIsStorageSecondaryKeyInUse, UpdateStages.WithQueueDelayMs, UpdateStages.WithRetentionDays, UpdateStages.WithStorageAccountAccessKey, UpdateStages.WithStorageAccountSubscriptionId, UpdateStages.WithStorageEndpoint {
    }

    /**
     * Grouping of DatabaseBlobAuditingPolicy update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the databaseblobauditingpolicy update allowing to specify AuditActionsAndGroups.
         */
        interface WithAuditActionsAndGroups {
            /**
             * Specifies auditActionsAndGroups.
             * @param auditActionsAndGroups Specifies the Actions-Groups and Actions to audit.
 The recommended set of action groups to use is the following combination - this will audit all the queries and stored procedures executed against the database, as well as successful and failed logins:
 BATCH_COMPLETED_GROUP,
 SUCCESSFUL_DATABASE_AUTHENTICATION_GROUP,
 FAILED_DATABASE_AUTHENTICATION_GROUP.
 This above combination is also the set that is configured by default when enabling auditing from the Azure portal.
 The supported action groups to audit are (note: choose only specific groups that cover your auditing needs. Using unnecessary groups could lead to very large quantities of audit records):
 APPLICATION_ROLE_CHANGE_PASSWORD_GROUP
 BACKUP_RESTORE_GROUP
 DATABASE_LOGOUT_GROUP
 DATABASE_OBJECT_CHANGE_GROUP
 DATABASE_OBJECT_OWNERSHIP_CHANGE_GROUP
 DATABASE_OBJECT_PERMISSION_CHANGE_GROUP
 DATABASE_OPERATION_GROUP
 DATABASE_PERMISSION_CHANGE_GROUP
 DATABASE_PRINCIPAL_CHANGE_GROUP
 DATABASE_PRINCIPAL_IMPERSONATION_GROUP
 DATABASE_ROLE_MEMBER_CHANGE_GROUP
 FAILED_DATABASE_AUTHENTICATION_GROUP
 SCHEMA_OBJECT_ACCESS_GROUP
 SCHEMA_OBJECT_CHANGE_GROUP
 SCHEMA_OBJECT_OWNERSHIP_CHANGE_GROUP
 SCHEMA_OBJECT_PERMISSION_CHANGE_GROUP
 SUCCESSFUL_DATABASE_AUTHENTICATION_GROUP
 USER_CHANGE_PASSWORD_GROUP
 BATCH_STARTED_GROUP
 BATCH_COMPLETED_GROUP
 These are groups that cover all sql statements and stored procedures executed against the database, and should not be used in combination with other groups as this will result in duplicate audit logs.
 For more information, see [Database-Level Audit Action Groups](https://docs.microsoft.com/en-us/sql/relational-databases/security/auditing/sql-server-audit-action-groups-and-actions#database-level-audit-action-groups).
 For Database auditing policy, specific Actions can also be specified (note that Actions cannot be specified for Server auditing policy). The supported actions to audit are:
 SELECT
 UPDATE
 INSERT
 DELETE
 EXECUTE
 RECEIVE
 REFERENCES
 The general form for defining an action to be audited is:
 {action} ON {object} BY {principal}
 Note that &lt;object&gt; in the above format can refer to an object like a table, view, or stored procedure, or an entire database or schema. For the latter cases, the forms DATABASE::{db_name} and SCHEMA::{schema_name} are used, respectively.
 For example:
 SELECT on dbo.myTable by public
 SELECT on DATABASE::myDatabase by public
 SELECT on SCHEMA::mySchema by public
 For more information, see [Database-Level Audit Actions](https://docs.microsoft.com/en-us/sql/relational-databases/security/auditing/sql-server-audit-action-groups-and-actions#database-level-audit-actions)
             * @return the next update stage
             */
            Update withAuditActionsAndGroups(List<String> auditActionsAndGroups);
        }

        /**
         * The stage of the databaseblobauditingpolicy update allowing to specify IsAzureMonitorTargetEnabled.
         */
        interface WithIsAzureMonitorTargetEnabled {
            /**
             * Specifies isAzureMonitorTargetEnabled.
             * @param isAzureMonitorTargetEnabled Specifies whether audit events are sent to Azure Monitor.
 In order to send the events to Azure Monitor, specify 'state' as 'Enabled' and 'isAzureMonitorTargetEnabled' as true.
 When using REST API to configure auditing, Diagnostic Settings with 'SQLSecurityAuditEvents' diagnostic logs category on the database should be also created.
 Note that for server level audit you should use the 'master' database as {databaseName}.
 Diagnostic Settings URI format:
 PUT https://management.azure.com/subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/providers/microsoft.insights/diagnosticSettings/{settingsName}?api-version=2017-05-01-preview
 For more information, see [Diagnostic Settings REST API](https://go.microsoft.com/fwlink/?linkid=2033207)
 or [Diagnostic Settings PowerShell](https://go.microsoft.com/fwlink/?linkid=2033043)
             * @return the next update stage
             */
            Update withIsAzureMonitorTargetEnabled(Boolean isAzureMonitorTargetEnabled);
        }

        /**
         * The stage of the databaseblobauditingpolicy update allowing to specify IsStorageSecondaryKeyInUse.
         */
        interface WithIsStorageSecondaryKeyInUse {
            /**
             * Specifies isStorageSecondaryKeyInUse.
             * @param isStorageSecondaryKeyInUse Specifies whether storageAccountAccessKey value is the storage's secondary key
             * @return the next update stage
             */
            Update withIsStorageSecondaryKeyInUse(Boolean isStorageSecondaryKeyInUse);
        }

        /**
         * The stage of the databaseblobauditingpolicy update allowing to specify QueueDelayMs.
         */
        interface WithQueueDelayMs {
            /**
             * Specifies queueDelayMs.
             * @param queueDelayMs Specifies the amount of time in milliseconds that can elapse before audit actions are forced to be processed.
 The default minimum value is 1000 (1 second). The maximum is 2,147,483,647
             * @return the next update stage
             */
            Update withQueueDelayMs(Integer queueDelayMs);
        }

        /**
         * The stage of the databaseblobauditingpolicy update allowing to specify RetentionDays.
         */
        interface WithRetentionDays {
            /**
             * Specifies retentionDays.
             * @param retentionDays Specifies the number of days to keep in the audit logs in the storage account
             * @return the next update stage
             */
            Update withRetentionDays(Integer retentionDays);
        }

        /**
         * The stage of the databaseblobauditingpolicy update allowing to specify StorageAccountAccessKey.
         */
        interface WithStorageAccountAccessKey {
            /**
             * Specifies storageAccountAccessKey.
             * @param storageAccountAccessKey Specifies the identifier key of the auditing storage account. If state is Enabled and storageEndpoint is specified, storageAccountAccessKey is required
             * @return the next update stage
             */
            Update withStorageAccountAccessKey(String storageAccountAccessKey);
        }

        /**
         * The stage of the databaseblobauditingpolicy update allowing to specify StorageAccountSubscriptionId.
         */
        interface WithStorageAccountSubscriptionId {
            /**
             * Specifies storageAccountSubscriptionId.
             * @param storageAccountSubscriptionId Specifies the blob storage subscription Id
             * @return the next update stage
             */
            Update withStorageAccountSubscriptionId(UUID storageAccountSubscriptionId);
        }

        /**
         * The stage of the databaseblobauditingpolicy update allowing to specify StorageEndpoint.
         */
        interface WithStorageEndpoint {
            /**
             * Specifies storageEndpoint.
             * @param storageEndpoint Specifies the blob storage endpoint (e.g. https://MyAccount.blob.core.windows.net). If state is Enabled, storageEndpoint or isAzureMonitorTargetEnabled is required
             * @return the next update stage
             */
            Update withStorageEndpoint(String storageEndpoint);
        }

    }
}
