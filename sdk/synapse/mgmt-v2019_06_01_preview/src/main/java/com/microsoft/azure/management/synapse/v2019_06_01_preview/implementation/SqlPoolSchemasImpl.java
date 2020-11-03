/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.SqlPoolSchemas;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.SqlPoolSchema;

class SqlPoolSchemasImpl extends WrapperImpl<SqlPoolSchemasInner> implements SqlPoolSchemas {
    private final SynapseManager manager;

    SqlPoolSchemasImpl(SynapseManager manager) {
        super(manager.inner().sqlPoolSchemas());
        this.manager = manager;
    }

    public SynapseManager manager() {
        return this.manager;
    }

    private SqlPoolSchemaImpl wrapModel(SqlPoolSchemaInner inner) {
        return  new SqlPoolSchemaImpl(inner, manager());
    }

    @Override
    public Observable<SqlPoolSchema> listAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName) {
        SqlPoolSchemasInner client = this.inner();
        return client.listAsync(resourceGroupName, workspaceName, sqlPoolName)
        .flatMapIterable(new Func1<Page<SqlPoolSchemaInner>, Iterable<SqlPoolSchemaInner>>() {
            @Override
            public Iterable<SqlPoolSchemaInner> call(Page<SqlPoolSchemaInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SqlPoolSchemaInner, SqlPoolSchema>() {
            @Override
            public SqlPoolSchema call(SqlPoolSchemaInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<SqlPoolSchema> getAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String schemaName) {
        SqlPoolSchemasInner client = this.inner();
        return client.getAsync(resourceGroupName, workspaceName, sqlPoolName, schemaName)
        .flatMap(new Func1<SqlPoolSchemaInner, Observable<SqlPoolSchema>>() {
            @Override
            public Observable<SqlPoolSchema> call(SqlPoolSchemaInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((SqlPoolSchema)wrapModel(inner));
                }
            }
       });
    }

}
