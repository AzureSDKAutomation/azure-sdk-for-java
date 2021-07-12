// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Input for the task that validates connection to SQL Server and also validates source server requirements. */
@Fluent
public final class ConnectToSourceSqlServerTaskInput {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConnectToSourceSqlServerTaskInput.class);

    /*
     * Connection information for Source SQL Server
     */
    @JsonProperty(value = "sourceConnectionInfo", required = true)
    private SqlConnectionInfo sourceConnectionInfo;

    /*
     * Permission group for validations
     */
    @JsonProperty(value = "checkPermissionsGroup")
    private ServerLevelPermissionsGroup checkPermissionsGroup;

    /*
     * Flag for whether to collect databases from source server.
     */
    @JsonProperty(value = "collectDatabases")
    private Boolean collectDatabases;

    /*
     * Flag for whether to collect logins from source server.
     */
    @JsonProperty(value = "collectLogins")
    private Boolean collectLogins;

    /*
     * Flag for whether to collect agent jobs from source server.
     */
    @JsonProperty(value = "collectAgentJobs")
    private Boolean collectAgentJobs;

    /*
     * Flag for whether to collect TDE Certificate names from source server.
     */
    @JsonProperty(value = "collectTdeCertificateInfo")
    private Boolean collectTdeCertificateInfo;

    /*
     * Flag for whether to validate SSIS catalog is reachable on the source
     * server.
     */
    @JsonProperty(value = "validateSsisCatalogOnly")
    private Boolean validateSsisCatalogOnly;

    /**
     * Get the sourceConnectionInfo property: Connection information for Source SQL Server.
     *
     * @return the sourceConnectionInfo value.
     */
    public SqlConnectionInfo sourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    /**
     * Set the sourceConnectionInfo property: Connection information for Source SQL Server.
     *
     * @param sourceConnectionInfo the sourceConnectionInfo value to set.
     * @return the ConnectToSourceSqlServerTaskInput object itself.
     */
    public ConnectToSourceSqlServerTaskInput withSourceConnectionInfo(SqlConnectionInfo sourceConnectionInfo) {
        this.sourceConnectionInfo = sourceConnectionInfo;
        return this;
    }

    /**
     * Get the checkPermissionsGroup property: Permission group for validations.
     *
     * @return the checkPermissionsGroup value.
     */
    public ServerLevelPermissionsGroup checkPermissionsGroup() {
        return this.checkPermissionsGroup;
    }

    /**
     * Set the checkPermissionsGroup property: Permission group for validations.
     *
     * @param checkPermissionsGroup the checkPermissionsGroup value to set.
     * @return the ConnectToSourceSqlServerTaskInput object itself.
     */
    public ConnectToSourceSqlServerTaskInput withCheckPermissionsGroup(
        ServerLevelPermissionsGroup checkPermissionsGroup) {
        this.checkPermissionsGroup = checkPermissionsGroup;
        return this;
    }

    /**
     * Get the collectDatabases property: Flag for whether to collect databases from source server.
     *
     * @return the collectDatabases value.
     */
    public Boolean collectDatabases() {
        return this.collectDatabases;
    }

    /**
     * Set the collectDatabases property: Flag for whether to collect databases from source server.
     *
     * @param collectDatabases the collectDatabases value to set.
     * @return the ConnectToSourceSqlServerTaskInput object itself.
     */
    public ConnectToSourceSqlServerTaskInput withCollectDatabases(Boolean collectDatabases) {
        this.collectDatabases = collectDatabases;
        return this;
    }

    /**
     * Get the collectLogins property: Flag for whether to collect logins from source server.
     *
     * @return the collectLogins value.
     */
    public Boolean collectLogins() {
        return this.collectLogins;
    }

    /**
     * Set the collectLogins property: Flag for whether to collect logins from source server.
     *
     * @param collectLogins the collectLogins value to set.
     * @return the ConnectToSourceSqlServerTaskInput object itself.
     */
    public ConnectToSourceSqlServerTaskInput withCollectLogins(Boolean collectLogins) {
        this.collectLogins = collectLogins;
        return this;
    }

    /**
     * Get the collectAgentJobs property: Flag for whether to collect agent jobs from source server.
     *
     * @return the collectAgentJobs value.
     */
    public Boolean collectAgentJobs() {
        return this.collectAgentJobs;
    }

    /**
     * Set the collectAgentJobs property: Flag for whether to collect agent jobs from source server.
     *
     * @param collectAgentJobs the collectAgentJobs value to set.
     * @return the ConnectToSourceSqlServerTaskInput object itself.
     */
    public ConnectToSourceSqlServerTaskInput withCollectAgentJobs(Boolean collectAgentJobs) {
        this.collectAgentJobs = collectAgentJobs;
        return this;
    }

    /**
     * Get the collectTdeCertificateInfo property: Flag for whether to collect TDE Certificate names from source server.
     *
     * @return the collectTdeCertificateInfo value.
     */
    public Boolean collectTdeCertificateInfo() {
        return this.collectTdeCertificateInfo;
    }

    /**
     * Set the collectTdeCertificateInfo property: Flag for whether to collect TDE Certificate names from source server.
     *
     * @param collectTdeCertificateInfo the collectTdeCertificateInfo value to set.
     * @return the ConnectToSourceSqlServerTaskInput object itself.
     */
    public ConnectToSourceSqlServerTaskInput withCollectTdeCertificateInfo(Boolean collectTdeCertificateInfo) {
        this.collectTdeCertificateInfo = collectTdeCertificateInfo;
        return this;
    }

    /**
     * Get the validateSsisCatalogOnly property: Flag for whether to validate SSIS catalog is reachable on the source
     * server.
     *
     * @return the validateSsisCatalogOnly value.
     */
    public Boolean validateSsisCatalogOnly() {
        return this.validateSsisCatalogOnly;
    }

    /**
     * Set the validateSsisCatalogOnly property: Flag for whether to validate SSIS catalog is reachable on the source
     * server.
     *
     * @param validateSsisCatalogOnly the validateSsisCatalogOnly value to set.
     * @return the ConnectToSourceSqlServerTaskInput object itself.
     */
    public ConnectToSourceSqlServerTaskInput withValidateSsisCatalogOnly(Boolean validateSsisCatalogOnly) {
        this.validateSsisCatalogOnly = validateSsisCatalogOnly;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sourceConnectionInfo() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sourceConnectionInfo in model ConnectToSourceSqlServerTaskInput"));
        } else {
            sourceConnectionInfo().validate();
        }
    }
}
