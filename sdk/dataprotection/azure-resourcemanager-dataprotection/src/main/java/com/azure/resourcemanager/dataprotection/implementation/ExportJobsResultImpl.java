// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.implementation;

import com.azure.resourcemanager.dataprotection.DataProtectionManager;
import com.azure.resourcemanager.dataprotection.fluent.models.ExportJobsResultInner;
import com.azure.resourcemanager.dataprotection.models.ExportJobsResult;

public final class ExportJobsResultImpl implements ExportJobsResult {
    private ExportJobsResultInner innerObject;

    private final DataProtectionManager serviceManager;

    ExportJobsResultImpl(ExportJobsResultInner innerObject, DataProtectionManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String blobUrl() {
        return this.innerModel().blobUrl();
    }

    public String blobSasKey() {
        return this.innerModel().blobSasKey();
    }

    public String excelFileBlobUrl() {
        return this.innerModel().excelFileBlobUrl();
    }

    public String excelFileBlobSasKey() {
        return this.innerModel().excelFileBlobSasKey();
    }

    public ExportJobsResultInner innerModel() {
        return this.innerObject;
    }

    private DataProtectionManager manager() {
        return this.serviceManager;
    }
}
