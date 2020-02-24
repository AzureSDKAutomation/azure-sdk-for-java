/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview.implementation;

import com.microsoft.azure.management.sql.v2017_03_01_preview.BlobAuditingPolicyState;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * A database blob auditing policy.
 */
@JsonFlatten
public class DatabaseBlobAuditingPolicyInner extends ProxyResource {
    /**
     * Resource kind.
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private String kind;

    /**
     * Specifies the state of the policy. If state is Enabled, storageEndpoint
     * or isAzureMonitorTargetEnabled are required. Possible values include:
     * 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "properties.state", required = true)
    private BlobAuditingPolicyState state;

    /**
     * Specifies the blob storage endpoint (e.g.
     * https://MyAccount.blob.core.windows.net). If state is Enabled,
     * storageEndpoint or isAzureMonitorTargetEnabled is required.
     */
    @JsonProperty(value = "properties.storageEndpoint")
    private String storageEndpoint;

    /**
     * Specifies the identifier key of the auditing storage account. If state
     * is Enabled and storageEndpoint is specified, storageAccountAccessKey is
     * required.
     */
    @JsonProperty(value = "properties.storageAccountAccessKey")
    private String storageAccountAccessKey;

    /**
     * Specifies the number of days to keep in the audit logs in the storage
     * account.
     */
    @JsonProperty(value = "properties.retentionDays")
    private Integer retentionDays;

    /**
     * Specifies the Actions-Groups and Actions to audit.
     *
     * The recommended set of action groups to use is the following combination
     * - this will audit all the queries and stored procedures executed against
     * the database, as well as successful and failed logins:
     *
     * BATCH_COMPLETED_GROUP,
     * SUCCESSFUL_DATABASE_AUTHENTICATION_GROUP,
     * FAILED_DATABASE_AUTHENTICATION_GROUP.
     *
     * This above combination is also the set that is configured by default
     * when enabling auditing from the Azure portal.
     *
     * The supported action groups to audit are (note: choose only specific
     * groups that cover your auditing needs. Using unnecessary groups could
     * lead to very large quantities of audit records):
     *
     * APPLICATION_ROLE_CHANGE_PASSWORD_GROUP
     * BACKUP_RESTORE_GROUP
     * DATABASE_LOGOUT_GROUP
     * DATABASE_OBJECT_CHANGE_GROUP
     * DATABASE_OBJECT_OWNERSHIP_CHANGE_GROUP
     * DATABASE_OBJECT_PERMISSION_CHANGE_GROUP
     * DATABASE_OPERATION_GROUP
     * DATABASE_PERMISSION_CHANGE_GROUP
     * DATABASE_PRINCIPAL_CHANGE_GROUP
     * DATABASE_PRINCIPAL_IMPERSONATION_GROUP
     * DATABASE_ROLE_MEMBER_CHANGE_GROUP
     * FAILED_DATABASE_AUTHENTICATION_GROUP
     * SCHEMA_OBJECT_ACCESS_GROUP
     * SCHEMA_OBJECT_CHANGE_GROUP
     * SCHEMA_OBJECT_OWNERSHIP_CHANGE_GROUP
     * SCHEMA_OBJECT_PERMISSION_CHANGE_GROUP
     * SUCCESSFUL_DATABASE_AUTHENTICATION_GROUP
     * USER_CHANGE_PASSWORD_GROUP
     * BATCH_STARTED_GROUP
     * BATCH_COMPLETED_GROUP
     *
     * These are groups that cover all sql statements and stored procedures
     * executed against the database, and should not be used in combination
     * with other groups as this will result in duplicate audit logs.
     *
     * For more information, see [Database-Level Audit Action
     * Groups](https://docs.microsoft.com/en-us/sql/relational-databases/security/auditing/sql-server-audit-action-groups-and-actions#database-level-audit-action-groups).
     *
     * For Database auditing policy, specific Actions can also be specified
     * (note that Actions cannot be specified for Server auditing policy). The
     * supported actions to audit are:
     * SELECT
     * UPDATE
     * INSERT
     * DELETE
     * EXECUTE
     * RECEIVE
     * REFERENCES
     *
     * The general form for defining an action to be audited is:
     * {action} ON {object} BY {principal}
     *
     * Note that &lt;object&gt; in the above format can refer to an object like
     * a table, view, or stored procedure, or an entire database or schema. For
     * the latter cases, the forms DATABASE::{db_name} and
     * SCHEMA::{schema_name} are used, respectively.
     *
     * For example:
     * SELECT on dbo.myTable by public
     * SELECT on DATABASE::myDatabase by public
     * SELECT on SCHEMA::mySchema by public
     *
     * For more information, see [Database-Level Audit
     * Actions](https://docs.microsoft.com/en-us/sql/relational-databases/security/auditing/sql-server-audit-action-groups-and-actions#database-level-audit-actions).
     */
    @JsonProperty(value = "properties.auditActionsAndGroups")
    private List<String> auditActionsAndGroups;

    /**
     * Specifies the blob storage subscription Id.
     */
    @JsonProperty(value = "properties.storageAccountSubscriptionId")
    private UUID storageAccountSubscriptionId;

    /**
     * Specifies whether storageAccountAccessKey value is the storage's
     * secondary key.
     */
    @JsonProperty(value = "properties.isStorageSecondaryKeyInUse")
    private Boolean isStorageSecondaryKeyInUse;

    /**
     * Specifies whether audit events are sent to Azure Monitor.
     * In order to send the events to Azure Monitor, specify 'state' as
     * 'Enabled' and 'isAzureMonitorTargetEnabled' as true.
     *
     * When using REST API to configure auditing, Diagnostic Settings with
     * 'SQLSecurityAuditEvents' diagnostic logs category on the database should
     * be also created.
     * Note that for server level audit you should use the 'master' database as
     * {databaseName}.
     *
     * Diagnostic Settings URI format:
     * PUT
     * https://management.azure.com/subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/providers/microsoft.insights/diagnosticSettings/{settingsName}?api-version=2017-05-01-preview
     *
     * For more information, see [Diagnostic Settings REST
     * API](https://go.microsoft.com/fwlink/?linkid=2033207)
     * or [Diagnostic Settings
     * PowerShell](https://go.microsoft.com/fwlink/?linkid=2033043).
     */
    @JsonProperty(value = "properties.isAzureMonitorTargetEnabled")
    private Boolean isAzureMonitorTargetEnabled;

    /**
     * Specifies the amount of time in milliseconds that can elapse before
     * audit actions are forced to be processed.
     * The default minimum value is 1000 (1 second). The maximum is
     * 2,147,483,647.
     */
    @JsonProperty(value = "properties.queueDelayMs")
    private Integer queueDelayMs;

    /**
     * Get resource kind.
     *
     * @return the kind value
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Get specifies the state of the policy. If state is Enabled, storageEndpoint or isAzureMonitorTargetEnabled are required. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the state value
     */
    public BlobAuditingPolicyState state() {
        return this.state;
    }

    /**
     * Set specifies the state of the policy. If state is Enabled, storageEndpoint or isAzureMonitorTargetEnabled are required. Possible values include: 'Enabled', 'Disabled'.
     *
     * @param state the state value to set
     * @return the DatabaseBlobAuditingPolicyInner object itself.
     */
    public DatabaseBlobAuditingPolicyInner withState(BlobAuditingPolicyState state) {
        this.state = state;
        return this;
    }

    /**
     * Get specifies the blob storage endpoint (e.g. https://MyAccount.blob.core.windows.net). If state is Enabled, storageEndpoint or isAzureMonitorTargetEnabled is required.
     *
     * @return the storageEndpoint value
     */
    public String storageEndpoint() {
        return this.storageEndpoint;
    }

    /**
     * Set specifies the blob storage endpoint (e.g. https://MyAccount.blob.core.windows.net). If state is Enabled, storageEndpoint or isAzureMonitorTargetEnabled is required.
     *
     * @param storageEndpoint the storageEndpoint value to set
     * @return the DatabaseBlobAuditingPolicyInner object itself.
     */
    public DatabaseBlobAuditingPolicyInner withStorageEndpoint(String storageEndpoint) {
        this.storageEndpoint = storageEndpoint;
        return this;
    }

    /**
     * Get specifies the identifier key of the auditing storage account. If state is Enabled and storageEndpoint is specified, storageAccountAccessKey is required.
     *
     * @return the storageAccountAccessKey value
     */
    public String storageAccountAccessKey() {
        return this.storageAccountAccessKey;
    }

    /**
     * Set specifies the identifier key of the auditing storage account. If state is Enabled and storageEndpoint is specified, storageAccountAccessKey is required.
     *
     * @param storageAccountAccessKey the storageAccountAccessKey value to set
     * @return the DatabaseBlobAuditingPolicyInner object itself.
     */
    public DatabaseBlobAuditingPolicyInner withStorageAccountAccessKey(String storageAccountAccessKey) {
        this.storageAccountAccessKey = storageAccountAccessKey;
        return this;
    }

    /**
     * Get specifies the number of days to keep in the audit logs in the storage account.
     *
     * @return the retentionDays value
     */
    public Integer retentionDays() {
        return this.retentionDays;
    }

    /**
     * Set specifies the number of days to keep in the audit logs in the storage account.
     *
     * @param retentionDays the retentionDays value to set
     * @return the DatabaseBlobAuditingPolicyInner object itself.
     */
    public DatabaseBlobAuditingPolicyInner withRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }

    /**
     * Get specifies the Actions-Groups and Actions to audit.
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
     For more information, see [Database-Level Audit Actions](https://docs.microsoft.com/en-us/sql/relational-databases/security/auditing/sql-server-audit-action-groups-and-actions#database-level-audit-actions).
     *
     * @return the auditActionsAndGroups value
     */
    public List<String> auditActionsAndGroups() {
        return this.auditActionsAndGroups;
    }

    /**
     * Set specifies the Actions-Groups and Actions to audit.
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
     For more information, see [Database-Level Audit Actions](https://docs.microsoft.com/en-us/sql/relational-databases/security/auditing/sql-server-audit-action-groups-and-actions#database-level-audit-actions).
     *
     * @param auditActionsAndGroups the auditActionsAndGroups value to set
     * @return the DatabaseBlobAuditingPolicyInner object itself.
     */
    public DatabaseBlobAuditingPolicyInner withAuditActionsAndGroups(List<String> auditActionsAndGroups) {
        this.auditActionsAndGroups = auditActionsAndGroups;
        return this;
    }

    /**
     * Get specifies the blob storage subscription Id.
     *
     * @return the storageAccountSubscriptionId value
     */
    public UUID storageAccountSubscriptionId() {
        return this.storageAccountSubscriptionId;
    }

    /**
     * Set specifies the blob storage subscription Id.
     *
     * @param storageAccountSubscriptionId the storageAccountSubscriptionId value to set
     * @return the DatabaseBlobAuditingPolicyInner object itself.
     */
    public DatabaseBlobAuditingPolicyInner withStorageAccountSubscriptionId(UUID storageAccountSubscriptionId) {
        this.storageAccountSubscriptionId = storageAccountSubscriptionId;
        return this;
    }

    /**
     * Get specifies whether storageAccountAccessKey value is the storage's secondary key.
     *
     * @return the isStorageSecondaryKeyInUse value
     */
    public Boolean isStorageSecondaryKeyInUse() {
        return this.isStorageSecondaryKeyInUse;
    }

    /**
     * Set specifies whether storageAccountAccessKey value is the storage's secondary key.
     *
     * @param isStorageSecondaryKeyInUse the isStorageSecondaryKeyInUse value to set
     * @return the DatabaseBlobAuditingPolicyInner object itself.
     */
    public DatabaseBlobAuditingPolicyInner withIsStorageSecondaryKeyInUse(Boolean isStorageSecondaryKeyInUse) {
        this.isStorageSecondaryKeyInUse = isStorageSecondaryKeyInUse;
        return this;
    }

    /**
     * Get specifies whether audit events are sent to Azure Monitor.
     In order to send the events to Azure Monitor, specify 'state' as 'Enabled' and 'isAzureMonitorTargetEnabled' as true.
     When using REST API to configure auditing, Diagnostic Settings with 'SQLSecurityAuditEvents' diagnostic logs category on the database should be also created.
     Note that for server level audit you should use the 'master' database as {databaseName}.
     Diagnostic Settings URI format:
     PUT https://management.azure.com/subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/providers/microsoft.insights/diagnosticSettings/{settingsName}?api-version=2017-05-01-preview
     For more information, see [Diagnostic Settings REST API](https://go.microsoft.com/fwlink/?linkid=2033207)
     or [Diagnostic Settings PowerShell](https://go.microsoft.com/fwlink/?linkid=2033043).
     *
     * @return the isAzureMonitorTargetEnabled value
     */
    public Boolean isAzureMonitorTargetEnabled() {
        return this.isAzureMonitorTargetEnabled;
    }

    /**
     * Set specifies whether audit events are sent to Azure Monitor.
     In order to send the events to Azure Monitor, specify 'state' as 'Enabled' and 'isAzureMonitorTargetEnabled' as true.
     When using REST API to configure auditing, Diagnostic Settings with 'SQLSecurityAuditEvents' diagnostic logs category on the database should be also created.
     Note that for server level audit you should use the 'master' database as {databaseName}.
     Diagnostic Settings URI format:
     PUT https://management.azure.com/subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/providers/microsoft.insights/diagnosticSettings/{settingsName}?api-version=2017-05-01-preview
     For more information, see [Diagnostic Settings REST API](https://go.microsoft.com/fwlink/?linkid=2033207)
     or [Diagnostic Settings PowerShell](https://go.microsoft.com/fwlink/?linkid=2033043).
     *
     * @param isAzureMonitorTargetEnabled the isAzureMonitorTargetEnabled value to set
     * @return the DatabaseBlobAuditingPolicyInner object itself.
     */
    public DatabaseBlobAuditingPolicyInner withIsAzureMonitorTargetEnabled(Boolean isAzureMonitorTargetEnabled) {
        this.isAzureMonitorTargetEnabled = isAzureMonitorTargetEnabled;
        return this;
    }

    /**
     * Get specifies the amount of time in milliseconds that can elapse before audit actions are forced to be processed.
     The default minimum value is 1000 (1 second). The maximum is 2,147,483,647.
     *
     * @return the queueDelayMs value
     */
    public Integer queueDelayMs() {
        return this.queueDelayMs;
    }

    /**
     * Set specifies the amount of time in milliseconds that can elapse before audit actions are forced to be processed.
     The default minimum value is 1000 (1 second). The maximum is 2,147,483,647.
     *
     * @param queueDelayMs the queueDelayMs value to set
     * @return the DatabaseBlobAuditingPolicyInner object itself.
     */
    public DatabaseBlobAuditingPolicyInner withQueueDelayMs(Integer queueDelayMs) {
        this.queueDelayMs = queueDelayMs;
        return this;
    }

}
