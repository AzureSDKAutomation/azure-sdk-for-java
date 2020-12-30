// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.JobDetailsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.JobResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.JobDetails;
import com.azure.resourcemanager.recoveryservicesbackup.models.JobResource;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class JobDetailsImpl implements JobDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(JobDetailsImpl.class);

    private final JobDetailsClient innerClient;

    private final RecoveryServicesBackupManager serviceManager;

    public JobDetailsImpl(JobDetailsClient innerClient, RecoveryServicesBackupManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public JobResource get(String vaultName, String resourceGroupName, String jobName) {
        JobResourceInner inner = this.serviceClient().get(vaultName, resourceGroupName, jobName);
        if (inner != null) {
            return new JobResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<JobResource> getWithResponse(
        String vaultName, String resourceGroupName, String jobName, Context context) {
        Response<JobResourceInner> inner =
            this.serviceClient().getWithResponse(vaultName, resourceGroupName, jobName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new JobResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private JobDetailsClient serviceClient() {
        return this.innerClient;
    }

    private RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }
}
