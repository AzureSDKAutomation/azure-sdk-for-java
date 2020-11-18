/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020-12-01.implementation;

import com.microsoft.azure.management.synapse.v2020-12-01.RestorableDroppedSqlPool;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import org.joda.time.DateTime;

class RestorableDroppedSqlPoolImpl extends IndexableRefreshableWrapperImpl<RestorableDroppedSqlPool, RestorableDroppedSqlPoolInner> implements RestorableDroppedSqlPool {
    private final SynapseManager manager;
    private String resourceGroupName;
    private String workspaceName;
    private String restorableDroppedSqlPoolId;

    RestorableDroppedSqlPoolImpl(RestorableDroppedSqlPoolInner inner,  SynapseManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.workspaceName = IdParsingUtils.getValueFromIdByName(inner.id(), "workspaces");
        this.restorableDroppedSqlPoolId = IdParsingUtils.getValueFromIdByName(inner.id(), "restorableDroppedSqlPools");
    }

    @Override
    public SynapseManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<RestorableDroppedSqlPoolInner> getInnerAsync() {
        RestorableDroppedSqlPoolsInner client = this.manager().inner().restorableDroppedSqlPools();
        return client.getAsync(this.resourceGroupName, this.workspaceName, this.restorableDroppedSqlPoolId);
    }



    @Override
    public DateTime creationDate() {
        return this.inner().creationDate();
    }

    @Override
    public String databaseName() {
        return this.inner().databaseName();
    }

    @Override
    public DateTime deletionDate() {
        return this.inner().deletionDate();
    }

    @Override
    public DateTime earliestRestoreDate() {
        return this.inner().earliestRestoreDate();
    }

    @Override
    public String edition() {
        return this.inner().edition();
    }

    @Override
    public String elasticPoolName() {
        return this.inner().elasticPoolName();
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
    public String maxSizeBytes() {
        return this.inner().maxSizeBytes();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String serviceLevelObjective() {
        return this.inner().serviceLevelObjective();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
