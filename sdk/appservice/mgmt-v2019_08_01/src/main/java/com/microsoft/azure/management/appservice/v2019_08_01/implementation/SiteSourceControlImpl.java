/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01.implementation;

import com.microsoft.azure.management.appservice.v2019_08_01.SiteSourceControl;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.appservice.v2019_08_01.GitHubActionConfiguration;

class SiteSourceControlImpl extends WrapperImpl<SiteSourceControlInner> implements SiteSourceControl {
    private final CertificateRegistrationManager manager;
    SiteSourceControlImpl(SiteSourceControlInner inner, CertificateRegistrationManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public CertificateRegistrationManager manager() {
        return this.manager;
    }

    @Override
    public String branch() {
        return this.inner().branch();
    }

    @Override
    public Boolean deploymentRollbackEnabled() {
        return this.inner().deploymentRollbackEnabled();
    }

    @Override
    public GitHubActionConfiguration gitHubActionConfiguration() {
        return this.inner().gitHubActionConfiguration();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Boolean isGitHubAction() {
        return this.inner().isGitHubAction();
    }

    @Override
    public Boolean isManualIntegration() {
        return this.inner().isManualIntegration();
    }

    @Override
    public Boolean isMercurial() {
        return this.inner().isMercurial();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String repoUrl() {
        return this.inner().repoUrl();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
