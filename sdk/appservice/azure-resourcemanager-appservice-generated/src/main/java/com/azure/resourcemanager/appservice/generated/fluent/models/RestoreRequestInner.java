// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.models.BackupRestoreOperationType;
import com.azure.resourcemanager.appservice.generated.models.DatabaseBackupSetting;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Description of a restore request. */
@JsonFlatten
@Fluent
public class RestoreRequestInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RestoreRequestInner.class);

    /*
     * SAS URL to the container.
     */
    @JsonProperty(value = "properties.storageAccountUrl")
    private String storageAccountUrl;

    /*
     * Name of a blob which contains the backup.
     */
    @JsonProperty(value = "properties.blobName")
    private String blobName;

    /*
     * <code>true</code> if the restore operation can overwrite target app;
     * otherwise, <code>false</code>. <code>true</code> is needed if trying to
     * restore over an existing app.
     */
    @JsonProperty(value = "properties.overwrite")
    private Boolean overwrite;

    /*
     * Name of an app.
     */
    @JsonProperty(value = "properties.siteName")
    private String siteName;

    /*
     * Collection of databases which should be restored. This list has to match
     * the list of databases included in the backup.
     */
    @JsonProperty(value = "properties.databases")
    private List<DatabaseBackupSetting> databases;

    /*
     * Changes a logic when restoring an app with custom domains.
     * <code>true</code> to remove custom domains automatically. If
     * <code>false</code>, custom domains are added to
     * the app's object when it is being restored, but that might fail due to
     * conflicts during the operation.
     */
    @JsonProperty(value = "properties.ignoreConflictingHostNames")
    private Boolean ignoreConflictingHostNames;

    /*
     * Ignore the databases and only restore the site content
     */
    @JsonProperty(value = "properties.ignoreDatabases")
    private Boolean ignoreDatabases;

    /*
     * Specify app service plan that will own restored site.
     */
    @JsonProperty(value = "properties.appServicePlan")
    private String appServicePlan;

    /*
     * Operation type.
     */
    @JsonProperty(value = "properties.operationType")
    private BackupRestoreOperationType operationType;

    /*
     * <code>true</code> if SiteConfig.ConnectionStrings should be set in new
     * app; otherwise, <code>false</code>.
     */
    @JsonProperty(value = "properties.adjustConnectionStrings")
    private Boolean adjustConnectionStrings;

    /*
     * App Service Environment name, if needed (only when restoring an app to
     * an App Service Environment).
     */
    @JsonProperty(value = "properties.hostingEnvironment")
    private String hostingEnvironment;

    /**
     * Get the storageAccountUrl property: SAS URL to the container.
     *
     * @return the storageAccountUrl value.
     */
    public String storageAccountUrl() {
        return this.storageAccountUrl;
    }

    /**
     * Set the storageAccountUrl property: SAS URL to the container.
     *
     * @param storageAccountUrl the storageAccountUrl value to set.
     * @return the RestoreRequestInner object itself.
     */
    public RestoreRequestInner withStorageAccountUrl(String storageAccountUrl) {
        this.storageAccountUrl = storageAccountUrl;
        return this;
    }

    /**
     * Get the blobName property: Name of a blob which contains the backup.
     *
     * @return the blobName value.
     */
    public String blobName() {
        return this.blobName;
    }

    /**
     * Set the blobName property: Name of a blob which contains the backup.
     *
     * @param blobName the blobName value to set.
     * @return the RestoreRequestInner object itself.
     */
    public RestoreRequestInner withBlobName(String blobName) {
        this.blobName = blobName;
        return this;
    }

    /**
     * Get the overwrite property: &lt;code&gt;true&lt;/code&gt; if the restore operation can overwrite target app;
     * otherwise, &lt;code&gt;false&lt;/code&gt;. &lt;code&gt;true&lt;/code&gt; is needed if trying to restore over an
     * existing app.
     *
     * @return the overwrite value.
     */
    public Boolean overwrite() {
        return this.overwrite;
    }

    /**
     * Set the overwrite property: &lt;code&gt;true&lt;/code&gt; if the restore operation can overwrite target app;
     * otherwise, &lt;code&gt;false&lt;/code&gt;. &lt;code&gt;true&lt;/code&gt; is needed if trying to restore over an
     * existing app.
     *
     * @param overwrite the overwrite value to set.
     * @return the RestoreRequestInner object itself.
     */
    public RestoreRequestInner withOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }

    /**
     * Get the siteName property: Name of an app.
     *
     * @return the siteName value.
     */
    public String siteName() {
        return this.siteName;
    }

    /**
     * Set the siteName property: Name of an app.
     *
     * @param siteName the siteName value to set.
     * @return the RestoreRequestInner object itself.
     */
    public RestoreRequestInner withSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }

    /**
     * Get the databases property: Collection of databases which should be restored. This list has to match the list of
     * databases included in the backup.
     *
     * @return the databases value.
     */
    public List<DatabaseBackupSetting> databases() {
        return this.databases;
    }

    /**
     * Set the databases property: Collection of databases which should be restored. This list has to match the list of
     * databases included in the backup.
     *
     * @param databases the databases value to set.
     * @return the RestoreRequestInner object itself.
     */
    public RestoreRequestInner withDatabases(List<DatabaseBackupSetting> databases) {
        this.databases = databases;
        return this;
    }

    /**
     * Get the ignoreConflictingHostNames property: Changes a logic when restoring an app with custom domains.
     * &lt;code&gt;true&lt;/code&gt; to remove custom domains automatically. If &lt;code&gt;false&lt;/code&gt;, custom
     * domains are added to the app's object when it is being restored, but that might fail due to conflicts during the
     * operation.
     *
     * @return the ignoreConflictingHostNames value.
     */
    public Boolean ignoreConflictingHostNames() {
        return this.ignoreConflictingHostNames;
    }

    /**
     * Set the ignoreConflictingHostNames property: Changes a logic when restoring an app with custom domains.
     * &lt;code&gt;true&lt;/code&gt; to remove custom domains automatically. If &lt;code&gt;false&lt;/code&gt;, custom
     * domains are added to the app's object when it is being restored, but that might fail due to conflicts during the
     * operation.
     *
     * @param ignoreConflictingHostNames the ignoreConflictingHostNames value to set.
     * @return the RestoreRequestInner object itself.
     */
    public RestoreRequestInner withIgnoreConflictingHostNames(Boolean ignoreConflictingHostNames) {
        this.ignoreConflictingHostNames = ignoreConflictingHostNames;
        return this;
    }

    /**
     * Get the ignoreDatabases property: Ignore the databases and only restore the site content.
     *
     * @return the ignoreDatabases value.
     */
    public Boolean ignoreDatabases() {
        return this.ignoreDatabases;
    }

    /**
     * Set the ignoreDatabases property: Ignore the databases and only restore the site content.
     *
     * @param ignoreDatabases the ignoreDatabases value to set.
     * @return the RestoreRequestInner object itself.
     */
    public RestoreRequestInner withIgnoreDatabases(Boolean ignoreDatabases) {
        this.ignoreDatabases = ignoreDatabases;
        return this;
    }

    /**
     * Get the appServicePlan property: Specify app service plan that will own restored site.
     *
     * @return the appServicePlan value.
     */
    public String appServicePlan() {
        return this.appServicePlan;
    }

    /**
     * Set the appServicePlan property: Specify app service plan that will own restored site.
     *
     * @param appServicePlan the appServicePlan value to set.
     * @return the RestoreRequestInner object itself.
     */
    public RestoreRequestInner withAppServicePlan(String appServicePlan) {
        this.appServicePlan = appServicePlan;
        return this;
    }

    /**
     * Get the operationType property: Operation type.
     *
     * @return the operationType value.
     */
    public BackupRestoreOperationType operationType() {
        return this.operationType;
    }

    /**
     * Set the operationType property: Operation type.
     *
     * @param operationType the operationType value to set.
     * @return the RestoreRequestInner object itself.
     */
    public RestoreRequestInner withOperationType(BackupRestoreOperationType operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * Get the adjustConnectionStrings property: &lt;code&gt;true&lt;/code&gt; if SiteConfig.ConnectionStrings should be
     * set in new app; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the adjustConnectionStrings value.
     */
    public Boolean adjustConnectionStrings() {
        return this.adjustConnectionStrings;
    }

    /**
     * Set the adjustConnectionStrings property: &lt;code&gt;true&lt;/code&gt; if SiteConfig.ConnectionStrings should be
     * set in new app; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param adjustConnectionStrings the adjustConnectionStrings value to set.
     * @return the RestoreRequestInner object itself.
     */
    public RestoreRequestInner withAdjustConnectionStrings(Boolean adjustConnectionStrings) {
        this.adjustConnectionStrings = adjustConnectionStrings;
        return this;
    }

    /**
     * Get the hostingEnvironment property: App Service Environment name, if needed (only when restoring an app to an
     * App Service Environment).
     *
     * @return the hostingEnvironment value.
     */
    public String hostingEnvironment() {
        return this.hostingEnvironment;
    }

    /**
     * Set the hostingEnvironment property: App Service Environment name, if needed (only when restoring an app to an
     * App Service Environment).
     *
     * @param hostingEnvironment the hostingEnvironment value to set.
     * @return the RestoreRequestInner object itself.
     */
    public RestoreRequestInner withHostingEnvironment(String hostingEnvironment) {
        this.hostingEnvironment = hostingEnvironment;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RestoreRequestInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (databases() != null) {
            databases().forEach(e -> e.validate());
        }
    }
}
