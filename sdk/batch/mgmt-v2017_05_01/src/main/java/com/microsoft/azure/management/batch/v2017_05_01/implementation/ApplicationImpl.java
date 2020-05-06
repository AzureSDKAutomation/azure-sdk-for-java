/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.v2017_05_01.implementation;

import com.microsoft.azure.management.batch.v2017_05_01.Application;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import java.util.ArrayList;
import com.microsoft.azure.management.batch.v2017_05_01.ApplicationPackage;
import java.util.List;

class ApplicationImpl extends IndexableRefreshableWrapperImpl<Application, ApplicationInner> implements Application {
    private final BatchManager manager;
    private String resourceGroupName;
    private String accountName;
    private String applicationId;

    ApplicationImpl(ApplicationInner inner,  BatchManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "batchAccounts");
        this.applicationId = IdParsingUtils.getValueFromIdByName(inner.id(), "applications");
    }

    @Override
    public BatchManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<ApplicationInner> getInnerAsync() {
        ApplicationsInner client = this.manager().inner().applications();
        return client.getAsync(this.resourceGroupName, this.accountName, this.applicationId);
    }



    @Override
    public Boolean allowUpdates() {
        return this.inner().allowUpdates();
    }

    @Override
    public String defaultVersion() {
        return this.inner().defaultVersion();
    }

    @Override
    public String displayName() {
        return this.inner().displayName();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public List<ApplicationPackage> packages() {
        List<ApplicationPackage> lst = new ArrayList<ApplicationPackage>();
        if (this.inner().packages() != null) {
            for (ApplicationPackageInner inner : this.inner().packages()) {
                lst.add( new ApplicationPackageImpl(inner, manager()));
            }
        }
        return lst;
    }

}
