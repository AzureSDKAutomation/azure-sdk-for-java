// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.models.DatabaseInner;
import com.azure.resourcemanager.sql.generated.models.CatalogCollationType;
import com.azure.resourcemanager.sql.generated.models.CreateMode;
import com.azure.resourcemanager.sql.generated.models.Database;
import com.azure.resourcemanager.sql.generated.models.DatabaseLicenseType;
import com.azure.resourcemanager.sql.generated.models.DatabaseReadScale;
import com.azure.resourcemanager.sql.generated.models.DatabaseStatus;
import com.azure.resourcemanager.sql.generated.models.DatabaseUpdate;
import com.azure.resourcemanager.sql.generated.models.ExportDatabaseDefinition;
import com.azure.resourcemanager.sql.generated.models.ImportExistingDatabaseDefinition;
import com.azure.resourcemanager.sql.generated.models.ImportExportOperationResult;
import com.azure.resourcemanager.sql.generated.models.ReplicaType;
import com.azure.resourcemanager.sql.generated.models.ResourceMoveDefinition;
import com.azure.resourcemanager.sql.generated.models.SampleName;
import com.azure.resourcemanager.sql.generated.models.SecondaryType;
import com.azure.resourcemanager.sql.generated.models.Sku;
import com.azure.resourcemanager.sql.generated.models.StorageAccountType;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;

public final class DatabaseImpl implements Database, Database.Definition, Database.Update {
    private DatabaseInner innerObject;

    private final SqlManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public Sku sku() {
        return this.innerModel().sku();
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public String managedBy() {
        return this.innerModel().managedBy();
    }

    public CreateMode createMode() {
        return this.innerModel().createMode();
    }

    public String collation() {
        return this.innerModel().collation();
    }

    public Long maxSizeBytes() {
        return this.innerModel().maxSizeBytes();
    }

    public SampleName sampleName() {
        return this.innerModel().sampleName();
    }

    public String elasticPoolId() {
        return this.innerModel().elasticPoolId();
    }

    public String sourceDatabaseId() {
        return this.innerModel().sourceDatabaseId();
    }

    public DatabaseStatus status() {
        return this.innerModel().status();
    }

    public UUID databaseId() {
        return this.innerModel().databaseId();
    }

    public OffsetDateTime creationDate() {
        return this.innerModel().creationDate();
    }

    public String currentServiceObjectiveName() {
        return this.innerModel().currentServiceObjectiveName();
    }

    public String requestedServiceObjectiveName() {
        return this.innerModel().requestedServiceObjectiveName();
    }

    public String defaultSecondaryLocation() {
        return this.innerModel().defaultSecondaryLocation();
    }

    public String failoverGroupId() {
        return this.innerModel().failoverGroupId();
    }

    public OffsetDateTime restorePointInTime() {
        return this.innerModel().restorePointInTime();
    }

    public OffsetDateTime sourceDatabaseDeletionDate() {
        return this.innerModel().sourceDatabaseDeletionDate();
    }

    public String recoveryServicesRecoveryPointId() {
        return this.innerModel().recoveryServicesRecoveryPointId();
    }

    public String longTermRetentionBackupResourceId() {
        return this.innerModel().longTermRetentionBackupResourceId();
    }

    public String recoverableDatabaseId() {
        return this.innerModel().recoverableDatabaseId();
    }

    public String restorableDroppedDatabaseId() {
        return this.innerModel().restorableDroppedDatabaseId();
    }

    public CatalogCollationType catalogCollation() {
        return this.innerModel().catalogCollation();
    }

    public Boolean zoneRedundant() {
        return this.innerModel().zoneRedundant();
    }

    public DatabaseLicenseType licenseType() {
        return this.innerModel().licenseType();
    }

    public Long maxLogSizeBytes() {
        return this.innerModel().maxLogSizeBytes();
    }

    public OffsetDateTime earliestRestoreDate() {
        return this.innerModel().earliestRestoreDate();
    }

    public DatabaseReadScale readScale() {
        return this.innerModel().readScale();
    }

    public Integer highAvailabilityReplicaCount() {
        return this.innerModel().highAvailabilityReplicaCount();
    }

    public SecondaryType secondaryType() {
        return this.innerModel().secondaryType();
    }

    public Sku currentSku() {
        return this.innerModel().currentSku();
    }

    public Integer autoPauseDelay() {
        return this.innerModel().autoPauseDelay();
    }

    public StorageAccountType storageAccountType() {
        return this.innerModel().storageAccountType();
    }

    public Double minCapacity() {
        return this.innerModel().minCapacity();
    }

    public OffsetDateTime pausedDate() {
        return this.innerModel().pausedDate();
    }

    public OffsetDateTime resumedDate() {
        return this.innerModel().resumedDate();
    }

    public String maintenanceConfigurationId() {
        return this.innerModel().maintenanceConfigurationId();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public DatabaseInner innerModel() {
        return this.innerObject;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serverName;

    private String databaseName;

    private DatabaseUpdate updateParameters;

    public DatabaseImpl withExistingServer(String resourceGroupName, String serverName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        return this;
    }

    public Database create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabases()
                .createOrUpdate(resourceGroupName, serverName, databaseName, this.innerModel(), Context.NONE);
        return this;
    }

    public Database create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabases()
                .createOrUpdate(resourceGroupName, serverName, databaseName, this.innerModel(), context);
        return this;
    }

    DatabaseImpl(String name, SqlManager serviceManager) {
        this.innerObject = new DatabaseInner();
        this.serviceManager = serviceManager;
        this.databaseName = name;
    }

    public DatabaseImpl update() {
        this.updateParameters = new DatabaseUpdate();
        return this;
    }

    public Database apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabases()
                .update(resourceGroupName, serverName, databaseName, updateParameters, Context.NONE);
        return this;
    }

    public Database apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabases()
                .update(resourceGroupName, serverName, databaseName, updateParameters, context);
        return this;
    }

    DatabaseImpl(DatabaseInner innerObject, SqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serverName = Utils.getValueFromIdByName(innerObject.id(), "servers");
        this.databaseName = Utils.getValueFromIdByName(innerObject.id(), "databases");
    }

    public Database refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabases()
                .getWithResponse(resourceGroupName, serverName, databaseName, Context.NONE)
                .getValue();
        return this;
    }

    public Database refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabases()
                .getWithResponse(resourceGroupName, serverName, databaseName, context)
                .getValue();
        return this;
    }

    public Database pause() {
        return serviceManager.databases().pause(resourceGroupName, serverName, databaseName);
    }

    public Database pause(Context context) {
        return serviceManager.databases().pause(resourceGroupName, serverName, databaseName, context);
    }

    public Database resume() {
        return serviceManager.databases().resume(resourceGroupName, serverName, databaseName);
    }

    public Database resume(Context context) {
        return serviceManager.databases().resume(resourceGroupName, serverName, databaseName, context);
    }

    public void failover(ReplicaType replicaType) {
        serviceManager.databases().failover(resourceGroupName, serverName, databaseName, replicaType);
    }

    public void failover() {
        serviceManager.databases().failover(resourceGroupName, serverName, databaseName);
    }

    public void failover(ReplicaType replicaType, Context context) {
        serviceManager.databases().failover(resourceGroupName, serverName, databaseName, replicaType, context);
    }

    public void upgradeDataWarehouse() {
        serviceManager.databases().upgradeDataWarehouse(resourceGroupName, serverName, databaseName);
    }

    public void upgradeDataWarehouse(Context context) {
        serviceManager.databases().upgradeDataWarehouse(resourceGroupName, serverName, databaseName, context);
    }

    public void rename(ResourceMoveDefinition parameters) {
        serviceManager.databases().rename(resourceGroupName, serverName, databaseName, parameters);
    }

    public Response<Void> renameWithResponse(ResourceMoveDefinition parameters, Context context) {
        return serviceManager
            .databases()
            .renameWithResponse(resourceGroupName, serverName, databaseName, parameters, context);
    }

    public ImportExportOperationResult importMethod(ImportExistingDatabaseDefinition parameters) {
        return serviceManager.databases().importMethod(resourceGroupName, serverName, databaseName, parameters);
    }

    public ImportExportOperationResult importMethod(ImportExistingDatabaseDefinition parameters, Context context) {
        return serviceManager
            .databases()
            .importMethod(resourceGroupName, serverName, databaseName, parameters, context);
    }

    public ImportExportOperationResult export(ExportDatabaseDefinition parameters) {
        return serviceManager.databases().export(resourceGroupName, serverName, databaseName, parameters);
    }

    public ImportExportOperationResult export(ExportDatabaseDefinition parameters, Context context) {
        return serviceManager.databases().export(resourceGroupName, serverName, databaseName, parameters, context);
    }

    public Database pause() {
        return serviceManager.databases().pause(resourceGroupName, serverName, databaseName);
    }

    public Database pause(Context context) {
        return serviceManager.databases().pause(resourceGroupName, serverName, databaseName, context);
    }

    public Database resume() {
        return serviceManager.databases().resume(resourceGroupName, serverName, databaseName);
    }

    public Database resume(Context context) {
        return serviceManager.databases().resume(resourceGroupName, serverName, databaseName, context);
    }

    public void failover(ReplicaType replicaType) {
        serviceManager.databases().failover(resourceGroupName, serverName, databaseName, replicaType);
    }

    public void failover() {
        serviceManager.databases().failover(resourceGroupName, serverName, databaseName);
    }

    public void failover(ReplicaType replicaType, Context context) {
        serviceManager.databases().failover(resourceGroupName, serverName, databaseName, replicaType, context);
    }

    public void upgradeDataWarehouse() {
        serviceManager.databases().upgradeDataWarehouse(resourceGroupName, serverName, databaseName);
    }

    public void upgradeDataWarehouse(Context context) {
        serviceManager.databases().upgradeDataWarehouse(resourceGroupName, serverName, databaseName, context);
    }

    public void rename(ResourceMoveDefinition parameters) {
        serviceManager.databases().rename(resourceGroupName, serverName, databaseName, parameters);
    }

    public Response<Void> renameWithResponse(ResourceMoveDefinition parameters, Context context) {
        return serviceManager
            .databases()
            .renameWithResponse(resourceGroupName, serverName, databaseName, parameters, context);
    }

    public DatabaseImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public DatabaseImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public DatabaseImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public DatabaseImpl withSku(Sku sku) {
        if (isInCreateMode()) {
            this.innerModel().withSku(sku);
            return this;
        } else {
            this.updateParameters.withSku(sku);
            return this;
        }
    }

    public DatabaseImpl withCreateMode(CreateMode createMode) {
        if (isInCreateMode()) {
            this.innerModel().withCreateMode(createMode);
            return this;
        } else {
            this.updateParameters.withCreateMode(createMode);
            return this;
        }
    }

    public DatabaseImpl withCollation(String collation) {
        if (isInCreateMode()) {
            this.innerModel().withCollation(collation);
            return this;
        } else {
            this.updateParameters.withCollation(collation);
            return this;
        }
    }

    public DatabaseImpl withMaxSizeBytes(Long maxSizeBytes) {
        if (isInCreateMode()) {
            this.innerModel().withMaxSizeBytes(maxSizeBytes);
            return this;
        } else {
            this.updateParameters.withMaxSizeBytes(maxSizeBytes);
            return this;
        }
    }

    public DatabaseImpl withSampleName(SampleName sampleName) {
        if (isInCreateMode()) {
            this.innerModel().withSampleName(sampleName);
            return this;
        } else {
            this.updateParameters.withSampleName(sampleName);
            return this;
        }
    }

    public DatabaseImpl withElasticPoolId(String elasticPoolId) {
        if (isInCreateMode()) {
            this.innerModel().withElasticPoolId(elasticPoolId);
            return this;
        } else {
            this.updateParameters.withElasticPoolId(elasticPoolId);
            return this;
        }
    }

    public DatabaseImpl withSourceDatabaseId(String sourceDatabaseId) {
        if (isInCreateMode()) {
            this.innerModel().withSourceDatabaseId(sourceDatabaseId);
            return this;
        } else {
            this.updateParameters.withSourceDatabaseId(sourceDatabaseId);
            return this;
        }
    }

    public DatabaseImpl withRestorePointInTime(OffsetDateTime restorePointInTime) {
        if (isInCreateMode()) {
            this.innerModel().withRestorePointInTime(restorePointInTime);
            return this;
        } else {
            this.updateParameters.withRestorePointInTime(restorePointInTime);
            return this;
        }
    }

    public DatabaseImpl withSourceDatabaseDeletionDate(OffsetDateTime sourceDatabaseDeletionDate) {
        if (isInCreateMode()) {
            this.innerModel().withSourceDatabaseDeletionDate(sourceDatabaseDeletionDate);
            return this;
        } else {
            this.updateParameters.withSourceDatabaseDeletionDate(sourceDatabaseDeletionDate);
            return this;
        }
    }

    public DatabaseImpl withRecoveryServicesRecoveryPointId(String recoveryServicesRecoveryPointId) {
        if (isInCreateMode()) {
            this.innerModel().withRecoveryServicesRecoveryPointId(recoveryServicesRecoveryPointId);
            return this;
        } else {
            this.updateParameters.withRecoveryServicesRecoveryPointId(recoveryServicesRecoveryPointId);
            return this;
        }
    }

    public DatabaseImpl withLongTermRetentionBackupResourceId(String longTermRetentionBackupResourceId) {
        if (isInCreateMode()) {
            this.innerModel().withLongTermRetentionBackupResourceId(longTermRetentionBackupResourceId);
            return this;
        } else {
            this.updateParameters.withLongTermRetentionBackupResourceId(longTermRetentionBackupResourceId);
            return this;
        }
    }

    public DatabaseImpl withRecoverableDatabaseId(String recoverableDatabaseId) {
        if (isInCreateMode()) {
            this.innerModel().withRecoverableDatabaseId(recoverableDatabaseId);
            return this;
        } else {
            this.updateParameters.withRecoverableDatabaseId(recoverableDatabaseId);
            return this;
        }
    }

    public DatabaseImpl withRestorableDroppedDatabaseId(String restorableDroppedDatabaseId) {
        if (isInCreateMode()) {
            this.innerModel().withRestorableDroppedDatabaseId(restorableDroppedDatabaseId);
            return this;
        } else {
            this.updateParameters.withRestorableDroppedDatabaseId(restorableDroppedDatabaseId);
            return this;
        }
    }

    public DatabaseImpl withCatalogCollation(CatalogCollationType catalogCollation) {
        if (isInCreateMode()) {
            this.innerModel().withCatalogCollation(catalogCollation);
            return this;
        } else {
            this.updateParameters.withCatalogCollation(catalogCollation);
            return this;
        }
    }

    public DatabaseImpl withZoneRedundant(Boolean zoneRedundant) {
        if (isInCreateMode()) {
            this.innerModel().withZoneRedundant(zoneRedundant);
            return this;
        } else {
            this.updateParameters.withZoneRedundant(zoneRedundant);
            return this;
        }
    }

    public DatabaseImpl withLicenseType(DatabaseLicenseType licenseType) {
        if (isInCreateMode()) {
            this.innerModel().withLicenseType(licenseType);
            return this;
        } else {
            this.updateParameters.withLicenseType(licenseType);
            return this;
        }
    }

    public DatabaseImpl withReadScale(DatabaseReadScale readScale) {
        if (isInCreateMode()) {
            this.innerModel().withReadScale(readScale);
            return this;
        } else {
            this.updateParameters.withReadScale(readScale);
            return this;
        }
    }

    public DatabaseImpl withHighAvailabilityReplicaCount(Integer highAvailabilityReplicaCount) {
        if (isInCreateMode()) {
            this.innerModel().withHighAvailabilityReplicaCount(highAvailabilityReplicaCount);
            return this;
        } else {
            this.updateParameters.withHighAvailabilityReplicaCount(highAvailabilityReplicaCount);
            return this;
        }
    }

    public DatabaseImpl withSecondaryType(SecondaryType secondaryType) {
        if (isInCreateMode()) {
            this.innerModel().withSecondaryType(secondaryType);
            return this;
        } else {
            this.updateParameters.withSecondaryType(secondaryType);
            return this;
        }
    }

    public DatabaseImpl withAutoPauseDelay(Integer autoPauseDelay) {
        if (isInCreateMode()) {
            this.innerModel().withAutoPauseDelay(autoPauseDelay);
            return this;
        } else {
            this.updateParameters.withAutoPauseDelay(autoPauseDelay);
            return this;
        }
    }

    public DatabaseImpl withStorageAccountType(StorageAccountType storageAccountType) {
        if (isInCreateMode()) {
            this.innerModel().withStorageAccountType(storageAccountType);
            return this;
        } else {
            this.updateParameters.withStorageAccountType(storageAccountType);
            return this;
        }
    }

    public DatabaseImpl withMinCapacity(Double minCapacity) {
        if (isInCreateMode()) {
            this.innerModel().withMinCapacity(minCapacity);
            return this;
        } else {
            this.updateParameters.withMinCapacity(minCapacity);
            return this;
        }
    }

    public DatabaseImpl withMaintenanceConfigurationId(String maintenanceConfigurationId) {
        if (isInCreateMode()) {
            this.innerModel().withMaintenanceConfigurationId(maintenanceConfigurationId);
            return this;
        } else {
            this.updateParameters.withMaintenanceConfigurationId(maintenanceConfigurationId);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
