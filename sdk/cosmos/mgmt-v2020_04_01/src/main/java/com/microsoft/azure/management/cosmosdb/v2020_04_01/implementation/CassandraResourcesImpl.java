/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.cosmosdb.v2020_04_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.cosmosdb.v2020_04_01.CassandraResources;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.cosmosdb.v2020_04_01.CassandraKeyspaceGetResults;
import java.util.List;
import rx.Completable;
import com.microsoft.azure.management.cosmosdb.v2020_04_01.ThroughputSettingsGetResults;
import com.microsoft.azure.management.cosmosdb.v2020_04_01.ThroughputSettingsUpdateParameters;
import com.microsoft.azure.management.cosmosdb.v2020_04_01.CassandraTableGetResults;

class CassandraResourcesImpl extends WrapperImpl<CassandraResourcesInner> implements CassandraResources {
    private final CosmosDBManager manager;

    CassandraResourcesImpl(CosmosDBManager manager) {
        super(manager.inner().cassandraResources());
        this.manager = manager;
    }

    public CosmosDBManager manager() {
        return this.manager;
    }

    @Override
    public CassandraKeyspaceGetResultsImpl defineCassandraKeyspace(String name) {
        return wrapCassandraKeyspaceModel(name);
    }

    @Override
    public CassandraTableGetResultsImpl defineTable(String name) {
        return wrapTableModel(name);
    }

    private CassandraKeyspaceGetResultsImpl wrapCassandraKeyspaceModel(String name) {
        return new CassandraKeyspaceGetResultsImpl(name, this.manager());
    }

    private CassandraTableGetResultsImpl wrapTableModel(String name) {
        return new CassandraTableGetResultsImpl(name, this.manager());
    }

    private CassandraKeyspaceGetResultsImpl wrapCassandraKeyspaceGetResultsModel(CassandraKeyspaceGetResultsInner inner) {
        return  new CassandraKeyspaceGetResultsImpl(inner, manager());
    }

    private CassandraTableGetResultsImpl wrapCassandraTableGetResultsModel(CassandraTableGetResultsInner inner) {
        return  new CassandraTableGetResultsImpl(inner, manager());
    }

    private Observable<CassandraKeyspaceGetResultsInner> getCassandraKeyspaceGetResultsInnerUsingCassandraResourcesInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String accountName = IdParsingUtils.getValueFromIdByName(id, "databaseAccounts");
        String keyspaceName = IdParsingUtils.getValueFromIdByName(id, "cassandraKeyspaces");
        CassandraResourcesInner client = this.inner();
        return client.getCassandraKeyspaceAsync(resourceGroupName, accountName, keyspaceName);
    }

    private Observable<CassandraTableGetResultsInner> getCassandraTableGetResultsInnerUsingCassandraResourcesInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String accountName = IdParsingUtils.getValueFromIdByName(id, "databaseAccounts");
        String keyspaceName = IdParsingUtils.getValueFromIdByName(id, "cassandraKeyspaces");
        String tableName = IdParsingUtils.getValueFromIdByName(id, "tables");
        CassandraResourcesInner client = this.inner();
        return client.getCassandraTableAsync(resourceGroupName, accountName, keyspaceName, tableName);
    }

    @Override
    public Observable<CassandraKeyspaceGetResults> getCassandraKeyspaceAsync(String resourceGroupName, String accountName, String keyspaceName) {
        CassandraResourcesInner client = this.inner();
        return client.getCassandraKeyspaceAsync(resourceGroupName, accountName, keyspaceName)
        .flatMap(new Func1<CassandraKeyspaceGetResultsInner, Observable<CassandraKeyspaceGetResults>>() {
            @Override
            public Observable<CassandraKeyspaceGetResults> call(CassandraKeyspaceGetResultsInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((CassandraKeyspaceGetResults)wrapCassandraKeyspaceGetResultsModel(inner));
                }
            }
       });
    }

    @Override
    public Observable<CassandraKeyspaceGetResults> listCassandraKeyspacesAsync(String resourceGroupName, String accountName) {
        CassandraResourcesInner client = this.inner();
        return client.listCassandraKeyspacesAsync(resourceGroupName, accountName)
        .flatMap(new Func1<List<CassandraKeyspaceGetResultsInner>, Observable<CassandraKeyspaceGetResultsInner>>() {
            @Override
            public Observable<CassandraKeyspaceGetResultsInner> call(List<CassandraKeyspaceGetResultsInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<CassandraKeyspaceGetResultsInner, CassandraKeyspaceGetResults>() {
            @Override
            public CassandraKeyspaceGetResults call(CassandraKeyspaceGetResultsInner inner) {
                return wrapCassandraKeyspaceGetResultsModel(inner);
            }
        });
    }

    @Override
    public Completable deleteCassandraKeyspaceAsync(String resourceGroupName, String accountName, String keyspaceName) {
        CassandraResourcesInner client = this.inner();
        return client.deleteCassandraKeyspaceAsync(resourceGroupName, accountName, keyspaceName).toCompletable();
    }

    @Override
    public Observable<ThroughputSettingsGetResults> getCassandraKeyspaceThroughputAsync(String resourceGroupName, String accountName, String keyspaceName) {
        CassandraResourcesInner client = this.inner();
        return client.getCassandraKeyspaceThroughputAsync(resourceGroupName, accountName, keyspaceName)
        .map(new Func1<ThroughputSettingsGetResultsInner, ThroughputSettingsGetResults>() {
            @Override
            public ThroughputSettingsGetResults call(ThroughputSettingsGetResultsInner inner) {
                return new ThroughputSettingsGetResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ThroughputSettingsGetResults> updateCassandraKeyspaceThroughputAsync(String resourceGroupName, String accountName, String keyspaceName, ThroughputSettingsUpdateParameters updateThroughputParameters) {
        CassandraResourcesInner client = this.inner();
        return client.updateCassandraKeyspaceThroughputAsync(resourceGroupName, accountName, keyspaceName, updateThroughputParameters)
        .map(new Func1<ThroughputSettingsGetResultsInner, ThroughputSettingsGetResults>() {
            @Override
            public ThroughputSettingsGetResults call(ThroughputSettingsGetResultsInner inner) {
                return new ThroughputSettingsGetResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ThroughputSettingsGetResults> migrateCassandraKeyspaceToAutoscaleAsync(String resourceGroupName, String accountName, String keyspaceName) {
        CassandraResourcesInner client = this.inner();
        return client.migrateCassandraKeyspaceToAutoscaleAsync(resourceGroupName, accountName, keyspaceName)
        .map(new Func1<ThroughputSettingsGetResultsInner, ThroughputSettingsGetResults>() {
            @Override
            public ThroughputSettingsGetResults call(ThroughputSettingsGetResultsInner inner) {
                return new ThroughputSettingsGetResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ThroughputSettingsGetResults> migrateCassandraKeyspaceToManualThroughputAsync(String resourceGroupName, String accountName, String keyspaceName) {
        CassandraResourcesInner client = this.inner();
        return client.migrateCassandraKeyspaceToManualThroughputAsync(resourceGroupName, accountName, keyspaceName)
        .map(new Func1<ThroughputSettingsGetResultsInner, ThroughputSettingsGetResults>() {
            @Override
            public ThroughputSettingsGetResults call(ThroughputSettingsGetResultsInner inner) {
                return new ThroughputSettingsGetResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ThroughputSettingsGetResults> getCassandraTableThroughputAsync(String resourceGroupName, String accountName, String keyspaceName, String tableName) {
        CassandraResourcesInner client = this.inner();
        return client.getCassandraTableThroughputAsync(resourceGroupName, accountName, keyspaceName, tableName)
        .map(new Func1<ThroughputSettingsGetResultsInner, ThroughputSettingsGetResults>() {
            @Override
            public ThroughputSettingsGetResults call(ThroughputSettingsGetResultsInner inner) {
                return new ThroughputSettingsGetResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ThroughputSettingsGetResults> updateCassandraTableThroughputAsync(String resourceGroupName, String accountName, String keyspaceName, String tableName, ThroughputSettingsUpdateParameters updateThroughputParameters) {
        CassandraResourcesInner client = this.inner();
        return client.updateCassandraTableThroughputAsync(resourceGroupName, accountName, keyspaceName, tableName, updateThroughputParameters)
        .map(new Func1<ThroughputSettingsGetResultsInner, ThroughputSettingsGetResults>() {
            @Override
            public ThroughputSettingsGetResults call(ThroughputSettingsGetResultsInner inner) {
                return new ThroughputSettingsGetResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ThroughputSettingsGetResults> migrateCassandraTableToAutoscaleAsync(String resourceGroupName, String accountName, String keyspaceName, String tableName) {
        CassandraResourcesInner client = this.inner();
        return client.migrateCassandraTableToAutoscaleAsync(resourceGroupName, accountName, keyspaceName, tableName)
        .map(new Func1<ThroughputSettingsGetResultsInner, ThroughputSettingsGetResults>() {
            @Override
            public ThroughputSettingsGetResults call(ThroughputSettingsGetResultsInner inner) {
                return new ThroughputSettingsGetResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ThroughputSettingsGetResults> migrateCassandraTableToManualThroughputAsync(String resourceGroupName, String accountName, String keyspaceName, String tableName) {
        CassandraResourcesInner client = this.inner();
        return client.migrateCassandraTableToManualThroughputAsync(resourceGroupName, accountName, keyspaceName, tableName)
        .map(new Func1<ThroughputSettingsGetResultsInner, ThroughputSettingsGetResults>() {
            @Override
            public ThroughputSettingsGetResults call(ThroughputSettingsGetResultsInner inner) {
                return new ThroughputSettingsGetResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<CassandraTableGetResults> getCassandraTableAsync(String resourceGroupName, String accountName, String keyspaceName, String tableName) {
        CassandraResourcesInner client = this.inner();
        return client.getCassandraTableAsync(resourceGroupName, accountName, keyspaceName, tableName)
        .flatMap(new Func1<CassandraTableGetResultsInner, Observable<CassandraTableGetResults>>() {
            @Override
            public Observable<CassandraTableGetResults> call(CassandraTableGetResultsInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((CassandraTableGetResults)wrapCassandraTableGetResultsModel(inner));
                }
            }
       });
    }

    @Override
    public Observable<CassandraTableGetResults> listCassandraTablesAsync(String resourceGroupName, String accountName, String keyspaceName) {
        CassandraResourcesInner client = this.inner();
        return client.listCassandraTablesAsync(resourceGroupName, accountName, keyspaceName)
        .flatMap(new Func1<List<CassandraTableGetResultsInner>, Observable<CassandraTableGetResultsInner>>() {
            @Override
            public Observable<CassandraTableGetResultsInner> call(List<CassandraTableGetResultsInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<CassandraTableGetResultsInner, CassandraTableGetResults>() {
            @Override
            public CassandraTableGetResults call(CassandraTableGetResultsInner inner) {
                return wrapCassandraTableGetResultsModel(inner);
            }
        });
    }

    @Override
    public Completable deleteCassandraTableAsync(String resourceGroupName, String accountName, String keyspaceName, String tableName) {
        CassandraResourcesInner client = this.inner();
        return client.deleteCassandraTableAsync(resourceGroupName, accountName, keyspaceName, tableName).toCompletable();
    }

}
