/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview.implementation;

import com.microsoft.azure.management.sql.v2017_03_01_preview.ManagedDatabase;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.sql.v2017_03_01_preview.ManagedDatabaseUpdate;
import org.joda.time.DateTime;
import java.util.Map;
import com.microsoft.azure.management.sql.v2017_03_01_preview.ManagedDatabaseStatus;
import com.microsoft.azure.management.sql.v2017_03_01_preview.CatalogCollationType;
import com.microsoft.azure.management.sql.v2017_03_01_preview.ManagedDatabaseCreateMode;
import rx.functions.Func1;

class ManagedDatabaseImpl extends CreatableUpdatableImpl<ManagedDatabase, ManagedDatabaseInner, ManagedDatabaseImpl> implements ManagedDatabase, ManagedDatabase.Definition, ManagedDatabase.Update {
    private final SqlManager manager;
    private String resourceGroupName;
    private String managedInstanceName;
    private String databaseName;
    private ManagedDatabaseUpdate updateParameter;

    ManagedDatabaseImpl(String name, SqlManager manager) {
        super(name, new ManagedDatabaseInner());
        this.manager = manager;
        // Set resource name
        this.databaseName = name;
        //
        this.updateParameter = new ManagedDatabaseUpdate();
    }

    ManagedDatabaseImpl(ManagedDatabaseInner inner, SqlManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.databaseName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.managedInstanceName = IdParsingUtils.getValueFromIdByName(inner.id(), "managedInstances");
        this.databaseName = IdParsingUtils.getValueFromIdByName(inner.id(), "databases");
        //
        this.updateParameter = new ManagedDatabaseUpdate();
    }

    @Override
    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ManagedDatabase> createResourceAsync() {
        ManagedDatabasesInner client = this.manager().inner().managedDatabases();
        return client.createOrUpdateAsync(this.resourceGroupName, this.managedInstanceName, this.databaseName, this.inner())
            .map(new Func1<ManagedDatabaseInner, ManagedDatabaseInner>() {
               @Override
               public ManagedDatabaseInner call(ManagedDatabaseInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ManagedDatabase> updateResourceAsync() {
        ManagedDatabasesInner client = this.manager().inner().managedDatabases();
        return client.updateAsync(this.resourceGroupName, this.managedInstanceName, this.databaseName, this.updateParameter)
            .map(new Func1<ManagedDatabaseInner, ManagedDatabaseInner>() {
               @Override
               public ManagedDatabaseInner call(ManagedDatabaseInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ManagedDatabaseInner> getInnerAsync() {
        ManagedDatabasesInner client = this.manager().inner().managedDatabases();
        return client.getAsync(this.resourceGroupName, this.managedInstanceName, this.databaseName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new ManagedDatabaseUpdate();
    }

    @Override
    public CatalogCollationType catalogCollation() {
        return this.inner().catalogCollation();
    }

    @Override
    public String collation() {
        return this.inner().collation();
    }

    @Override
    public ManagedDatabaseCreateMode createMode() {
        return this.inner().createMode();
    }

    @Override
    public DateTime creationDate() {
        return this.inner().creationDate();
    }

    @Override
    public String defaultSecondaryLocation() {
        return this.inner().defaultSecondaryLocation();
    }

    @Override
    public DateTime earliestRestorePoint() {
        return this.inner().earliestRestorePoint();
    }

    @Override
    public String failoverGroupId() {
        return this.inner().failoverGroupId();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String longTermRetentionBackupResourceId() {
        return this.inner().longTermRetentionBackupResourceId();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String recoverableDatabaseId() {
        return this.inner().recoverableDatabaseId();
    }

    @Override
    public String restorableDroppedDatabaseId() {
        return this.inner().restorableDroppedDatabaseId();
    }

    @Override
    public DateTime restorePointInTime() {
        return this.inner().restorePointInTime();
    }

    @Override
    public String sourceDatabaseId() {
        return this.inner().sourceDatabaseId();
    }

    @Override
    public ManagedDatabaseStatus status() {
        return this.inner().status();
    }

    @Override
    public String storageContainerSasToken() {
        return this.inner().storageContainerSasToken();
    }

    @Override
    public String storageContainerUri() {
        return this.inner().storageContainerUri();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public ManagedDatabaseImpl withExistingManagedInstance(String resourceGroupName, String managedInstanceName) {
        this.resourceGroupName = resourceGroupName;
        this.managedInstanceName = managedInstanceName;
        return this;
    }

    @Override
    public ManagedDatabaseImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public ManagedDatabaseImpl withCatalogCollation(CatalogCollationType catalogCollation) {
        if (isInCreateMode()) {
            this.inner().withCatalogCollation(catalogCollation);
        } else {
            this.updateParameter.withCatalogCollation(catalogCollation);
        }
        return this;
    }

    @Override
    public ManagedDatabaseImpl withCollation(String collation) {
        if (isInCreateMode()) {
            this.inner().withCollation(collation);
        } else {
            this.updateParameter.withCollation(collation);
        }
        return this;
    }

    @Override
    public ManagedDatabaseImpl withCreateMode(ManagedDatabaseCreateMode createMode) {
        if (isInCreateMode()) {
            this.inner().withCreateMode(createMode);
        } else {
            this.updateParameter.withCreateMode(createMode);
        }
        return this;
    }

    @Override
    public ManagedDatabaseImpl withLongTermRetentionBackupResourceId(String longTermRetentionBackupResourceId) {
        if (isInCreateMode()) {
            this.inner().withLongTermRetentionBackupResourceId(longTermRetentionBackupResourceId);
        } else {
            this.updateParameter.withLongTermRetentionBackupResourceId(longTermRetentionBackupResourceId);
        }
        return this;
    }

    @Override
    public ManagedDatabaseImpl withRecoverableDatabaseId(String recoverableDatabaseId) {
        if (isInCreateMode()) {
            this.inner().withRecoverableDatabaseId(recoverableDatabaseId);
        } else {
            this.updateParameter.withRecoverableDatabaseId(recoverableDatabaseId);
        }
        return this;
    }

    @Override
    public ManagedDatabaseImpl withRestorableDroppedDatabaseId(String restorableDroppedDatabaseId) {
        if (isInCreateMode()) {
            this.inner().withRestorableDroppedDatabaseId(restorableDroppedDatabaseId);
        } else {
            this.updateParameter.withRestorableDroppedDatabaseId(restorableDroppedDatabaseId);
        }
        return this;
    }

    @Override
    public ManagedDatabaseImpl withRestorePointInTime(DateTime restorePointInTime) {
        if (isInCreateMode()) {
            this.inner().withRestorePointInTime(restorePointInTime);
        } else {
            this.updateParameter.withRestorePointInTime(restorePointInTime);
        }
        return this;
    }

    @Override
    public ManagedDatabaseImpl withSourceDatabaseId(String sourceDatabaseId) {
        if (isInCreateMode()) {
            this.inner().withSourceDatabaseId(sourceDatabaseId);
        } else {
            this.updateParameter.withSourceDatabaseId(sourceDatabaseId);
        }
        return this;
    }

    @Override
    public ManagedDatabaseImpl withStorageContainerSasToken(String storageContainerSasToken) {
        if (isInCreateMode()) {
            this.inner().withStorageContainerSasToken(storageContainerSasToken);
        } else {
            this.updateParameter.withStorageContainerSasToken(storageContainerSasToken);
        }
        return this;
    }

    @Override
    public ManagedDatabaseImpl withStorageContainerUri(String storageContainerUri) {
        if (isInCreateMode()) {
            this.inner().withStorageContainerUri(storageContainerUri);
        } else {
            this.updateParameter.withStorageContainerUri(storageContainerUri);
        }
        return this;
    }

    @Override
    public ManagedDatabaseImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.inner().withTags(tags);
        } else {
            this.updateParameter.withTags(tags);
        }
        return this;
    }

}
