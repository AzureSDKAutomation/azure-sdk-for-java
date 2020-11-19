/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.postgresql.v2017_12_01.implementation;

import com.microsoft.azure.management.postgresql.v2017_12_01.ServerPerformanceTierProperties;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.postgresql.v2017_12_01.PerformanceTierServiceLevelObjectives;

class ServerPerformanceTierPropertiesImpl extends WrapperImpl<PerformanceTierPropertiesInner> implements ServerPerformanceTierProperties {
    private final DBForPostgreSQLManager manager;

    ServerPerformanceTierPropertiesImpl(PerformanceTierPropertiesInner inner,  DBForPostgreSQLManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DBForPostgreSQLManager manager() {
        return this.manager;
    }



    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Integer maxBackupRetentionDays() {
        return this.inner().maxBackupRetentionDays();
    }

    @Override
    public Integer maxLargeStorageMB() {
        return this.inner().maxLargeStorageMB();
    }

    @Override
    public Integer maxStorageMB() {
        return this.inner().maxStorageMB();
    }

    @Override
    public Integer minBackupRetentionDays() {
        return this.inner().minBackupRetentionDays();
    }

    @Override
    public Integer minLargeStorageMB() {
        return this.inner().minLargeStorageMB();
    }

    @Override
    public Integer minStorageMB() {
        return this.inner().minStorageMB();
    }

    @Override
    public List<PerformanceTierServiceLevelObjectives> serviceLevelObjectives() {
        return this.inner().serviceLevelObjectives();
    }

}
