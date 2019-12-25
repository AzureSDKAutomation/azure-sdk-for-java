/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.microsoft.azure.management.appservice.v2018_02_01.HostingEnvironmentDiagnostics;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;

class HostingEnvironmentDiagnosticsImpl extends WrapperImpl<HostingEnvironmentDiagnosticsInner> implements HostingEnvironmentDiagnostics {
    private final CertificateRegistrationManager manager;
    private String resourceGroupName;
    private String name;
    private String diagnosticsName;

    HostingEnvironmentDiagnosticsImpl(HostingEnvironmentDiagnosticsInner inner,  CertificateRegistrationManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public CertificateRegistrationManager manager() {
        return this.manager;
    }



    @Override
    public String diagnosicsOutput() {
        return this.inner().diagnosicsOutput();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

}
