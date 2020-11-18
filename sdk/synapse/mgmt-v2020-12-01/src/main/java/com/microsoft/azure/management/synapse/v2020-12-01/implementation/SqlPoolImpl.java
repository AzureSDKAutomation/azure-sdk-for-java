/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020-12-01.implementation;

import com.microsoft.azure.management.synapse.v2020-12-01.SqlPool;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.synapse.v2020-12-01.SqlPoolPatchInfo;
import java.util.Map;
import org.joda.time.DateTime;
import com.microsoft.azure.management.synapse.v2020-12-01.Sku;
import rx.functions.Func1;

class SqlPoolImpl extends CreatableUpdatableImpl<SqlPool, SqlPoolInner, SqlPoolImpl> implements SqlPool, SqlPool.Definition, SqlPool.Update {
    private final SynapseManager manager;
    private String resourceGroupName;
    private String workspaceName;
    private String sqlPoolName;
    private SqlPoolPatchInfo updateParameter;

    SqlPoolImpl(String name, SynapseManager manager) {
        super(name, new SqlPoolInner());
        this.manager = manager;
        // Set resource name
        this.sqlPoolName = name;
        //
        this.updateParameter = new SqlPoolPatchInfo();
    }

    SqlPoolImpl(SqlPoolInner inner, SynapseManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.sqlPoolName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.workspaceName = IdParsingUtils.getValueFromIdByName(inner.id(), "workspaces");
        this.sqlPoolName = IdParsingUtils.getValueFromIdByName(inner.id(), "sqlPools");
        //
        this.updateParameter = new SqlPoolPatchInfo();
    }

    @Override
    public SynapseManager manager() {
        return this.manager;
    }

    @Override
    public Observable<SqlPool> createResourceAsync() {
        SqlPoolsInner client = this.manager().inner().sqlPools();
        return client.createAsync(this.resourceGroupName, this.workspaceName, this.sqlPoolName, this.inner())
            .map(new Func1<SqlPoolInner, SqlPoolInner>() {
               @Override
               public SqlPoolInner call(SqlPoolInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<SqlPool> updateResourceAsync() {
        SqlPoolsInner client = this.manager().inner().sqlPools();
        return client.updateAsync(this.resourceGroupName, this.workspaceName, this.sqlPoolName, this.updateParameter)
            .map(new Func1<SqlPoolInner, SqlPoolInner>() {
               @Override
               public SqlPoolInner call(SqlPoolInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<SqlPoolInner> getInnerAsync() {
        SqlPoolsInner client = this.manager().inner().sqlPools();
        return client.getAsync(this.resourceGroupName, this.workspaceName, this.sqlPoolName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new SqlPoolPatchInfo();
    }

    @Override
    public String collation() {
        return this.inner().collation();
    }

    @Override
    public String createMode() {
        return this.inner().createMode();
    }

    @Override
    public DateTime creationDate() {
        return this.inner().creationDate();
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
    public Long maxSizeBytes() {
        return this.inner().maxSizeBytes();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String recoverableDatabaseId() {
        return this.inner().recoverableDatabaseId();
    }

    @Override
    public String restorePointInTime() {
        return this.inner().restorePointInTime();
    }

    @Override
    public Sku sku() {
        return this.inner().sku();
    }

    @Override
    public String sourceDatabaseId() {
        return this.inner().sourceDatabaseId();
    }

    @Override
    public String status() {
        return this.inner().status();
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
    public SqlPoolImpl withExistingWorkspace(String resourceGroupName, String workspaceName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        return this;
    }

    @Override
    public SqlPoolImpl withLocation(String location) {
        if (isInCreateMode()) {
            this.inner().withLocation(location);
        } else {
            this.updateParameter.withLocation(location);
        }
        return this;
    }

    @Override
    public SqlPoolImpl withCollation(String collation) {
        if (isInCreateMode()) {
            this.inner().withCollation(collation);
        } else {
            this.updateParameter.withCollation(collation);
        }
        return this;
    }

    @Override
    public SqlPoolImpl withCreateMode(String createMode) {
        if (isInCreateMode()) {
            this.inner().withCreateMode(createMode);
        } else {
            this.updateParameter.withCreateMode(createMode);
        }
        return this;
    }

    @Override
    public SqlPoolImpl withCreationDate(DateTime creationDate) {
        if (isInCreateMode()) {
            this.inner().withCreationDate(creationDate);
        } else {
            this.updateParameter.withCreationDate(creationDate);
        }
        return this;
    }

    @Override
    public SqlPoolImpl withMaxSizeBytes(Long maxSizeBytes) {
        if (isInCreateMode()) {
            this.inner().withMaxSizeBytes(maxSizeBytes);
        } else {
            this.updateParameter.withMaxSizeBytes(maxSizeBytes);
        }
        return this;
    }

    @Override
    public SqlPoolImpl withProvisioningState(String provisioningState) {
        if (isInCreateMode()) {
            this.inner().withProvisioningState(provisioningState);
        } else {
            this.updateParameter.withProvisioningState(provisioningState);
        }
        return this;
    }

    @Override
    public SqlPoolImpl withRecoverableDatabaseId(String recoverableDatabaseId) {
        if (isInCreateMode()) {
            this.inner().withRecoverableDatabaseId(recoverableDatabaseId);
        } else {
            this.updateParameter.withRecoverableDatabaseId(recoverableDatabaseId);
        }
        return this;
    }

    @Override
    public SqlPoolImpl withRestorePointInTime(String restorePointInTime) {
        if (isInCreateMode()) {
            this.inner().withRestorePointInTime(restorePointInTime);
        } else {
            this.updateParameter.withRestorePointInTime(restorePointInTime);
        }
        return this;
    }

    @Override
    public SqlPoolImpl withSku(Sku sku) {
        if (isInCreateMode()) {
            this.inner().withSku(sku);
        } else {
            this.updateParameter.withSku(sku);
        }
        return this;
    }

    @Override
    public SqlPoolImpl withSourceDatabaseId(String sourceDatabaseId) {
        if (isInCreateMode()) {
            this.inner().withSourceDatabaseId(sourceDatabaseId);
        } else {
            this.updateParameter.withSourceDatabaseId(sourceDatabaseId);
        }
        return this;
    }

    @Override
    public SqlPoolImpl withStatus(String status) {
        if (isInCreateMode()) {
            this.inner().withStatus(status);
        } else {
            this.updateParameter.withStatus(status);
        }
        return this;
    }

    @Override
    public SqlPoolImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.inner().withTags(tags);
        } else {
            this.updateParameter.withTags(tags);
        }
        return this;
    }

}
