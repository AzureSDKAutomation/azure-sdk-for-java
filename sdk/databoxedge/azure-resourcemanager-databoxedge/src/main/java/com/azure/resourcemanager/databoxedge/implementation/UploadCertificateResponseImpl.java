// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.implementation;

import com.azure.resourcemanager.databoxedge.DataBoxEdgeManager;
import com.azure.resourcemanager.databoxedge.fluent.models.UploadCertificateResponseInner;
import com.azure.resourcemanager.databoxedge.models.AuthenticationType;
import com.azure.resourcemanager.databoxedge.models.UploadCertificateResponse;

public final class UploadCertificateResponseImpl implements UploadCertificateResponse {
    private UploadCertificateResponseInner innerObject;

    private final DataBoxEdgeManager serviceManager;

    UploadCertificateResponseImpl(UploadCertificateResponseInner innerObject, DataBoxEdgeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public AuthenticationType authType() {
        return this.innerModel().authType();
    }

    public String resourceId() {
        return this.innerModel().resourceId();
    }

    public String aadAuthority() {
        return this.innerModel().aadAuthority();
    }

    public String aadTenantId() {
        return this.innerModel().aadTenantId();
    }

    public String servicePrincipalClientId() {
        return this.innerModel().servicePrincipalClientId();
    }

    public String servicePrincipalObjectId() {
        return this.innerModel().servicePrincipalObjectId();
    }

    public String azureManagementEndpointAudience() {
        return this.innerModel().azureManagementEndpointAudience();
    }

    public String aadAudience() {
        return this.innerModel().aadAudience();
    }

    public UploadCertificateResponseInner innerModel() {
        return this.innerObject;
    }

    private DataBoxEdgeManager manager() {
        return this.serviceManager;
    }
}
