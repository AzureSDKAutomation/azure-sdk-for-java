/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.synapse.v2020_12_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.synapse.v2020_12_01.SqlPoolColumns;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.synapse.v2020_12_01.TableSchemaSqlPoolWorkspaceSqlPoolColumnModel;

class SqlPoolColumnsImpl extends WrapperImpl<SqlPoolColumnsInner> implements SqlPoolColumns {
    private final SynapseManager manager;

    SqlPoolColumnsImpl(SynapseManager manager) {
        super(manager.inner().sqlPoolColumns());
        this.manager = manager;
    }

    public SynapseManager manager() {
        return this.manager;
    }

    private TableSchemaSqlPoolWorkspaceSqlPoolColumnModelImpl wrapModel(SqlPoolColumnInner inner) {
        return  new TableSchemaSqlPoolWorkspaceSqlPoolColumnModelImpl(inner, manager());
    }

    @Override
    public Observable<TableSchemaSqlPoolWorkspaceSqlPoolColumnModel> getAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String schemaName, String tableName, String columnName) {
        SqlPoolColumnsInner client = this.inner();
        return client.getAsync(resourceGroupName, workspaceName, sqlPoolName, schemaName, tableName, columnName)
        .flatMap(new Func1<SqlPoolColumnInner, Observable<TableSchemaSqlPoolWorkspaceSqlPoolColumnModel>>() {
            @Override
            public Observable<TableSchemaSqlPoolWorkspaceSqlPoolColumnModel> call(SqlPoolColumnInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((TableSchemaSqlPoolWorkspaceSqlPoolColumnModel)wrapModel(inner));
                }
            }
       });
    }

}