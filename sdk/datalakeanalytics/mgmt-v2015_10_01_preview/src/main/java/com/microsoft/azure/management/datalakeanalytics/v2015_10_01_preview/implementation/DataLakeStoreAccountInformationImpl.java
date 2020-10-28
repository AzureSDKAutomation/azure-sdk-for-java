/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalakeanalytics.v2015_10_01_preview.implementation;

import com.microsoft.azure.management.datalakeanalytics.v2015_10_01_preview.DataLakeStoreAccountInformation;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;

class DataLakeStoreAccountInformationImpl extends IndexableRefreshableWrapperImpl<DataLakeStoreAccountInformation, DataLakeStoreAccountInformationInner> implements DataLakeStoreAccountInformation {
    private final DataLakeAnalyticsManager manager;
    private String resourceGroupName;
    private String accountName;
    private String dataLakeStoreAccountName;

    DataLakeStoreAccountInformationImpl(DataLakeStoreAccountInformationInner inner,  DataLakeAnalyticsManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "accounts");
        this.dataLakeStoreAccountName = IdParsingUtils.getValueFromIdByName(inner.id(), "dataLakeStoreAccounts");
    }

    @Override
    public DataLakeAnalyticsManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<DataLakeStoreAccountInformationInner> getInnerAsync() {
        DataLakeStoreAccountsInner client = this.manager().inner().dataLakeStoreAccounts();
        return client.getAsync(this.resourceGroupName, this.accountName, this.dataLakeStoreAccountName);
    }



    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String suffix() {
        return this.inner().suffix();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
