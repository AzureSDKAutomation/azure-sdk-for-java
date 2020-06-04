/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.implementation;

import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.Job;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.ARMException;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.JobProperties;

class JobImpl extends IndexableRefreshableWrapperImpl<Job, JobInner> implements Job {
    private final RecoveryServicesManager manager;
    private String jobName;

    JobImpl(JobInner inner,  RecoveryServicesManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.jobName = IdParsingUtils.getValueFromIdByName(inner.id(), "replicationJobs");
    }

    @Override
    public RecoveryServicesManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<JobInner> getInnerAsync() {
        ReplicationJobsInner client = this.manager().inner().replicationJobs();
        return client.getAsync(this.jobName);
    }



    @Override
    public String endTime() {
        return this.inner().endTime();
    }

    @Override
    public ARMException error() {
        return this.inner().error();
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
    public String name() {
        return this.inner().name();
    }

    @Override
    public JobProperties properties() {
        return this.inner().properties();
    }

    @Override
    public String startTime() {
        return this.inner().startTime();
    }

    @Override
    public String status() {
        return this.inner().status();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
