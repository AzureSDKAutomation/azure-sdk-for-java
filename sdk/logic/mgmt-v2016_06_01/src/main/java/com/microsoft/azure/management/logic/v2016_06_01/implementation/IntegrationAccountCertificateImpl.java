/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01.implementation;

import com.microsoft.azure.management.logic.v2016_06_01.IntegrationAccountCertificate;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.Map;
import org.joda.time.DateTime;
import com.microsoft.azure.management.logic.v2016_06_01.KeyVaultKeyReference;

class IntegrationAccountCertificateImpl extends CreatableUpdatableImpl<IntegrationAccountCertificate, IntegrationAccountCertificateInner, IntegrationAccountCertificateImpl> implements IntegrationAccountCertificate, IntegrationAccountCertificate.Definition, IntegrationAccountCertificate.Update {
    private final LogicManager manager;
    private String resourceGroupName;
    private String integrationAccountName;
    private String certificateName;

    IntegrationAccountCertificateImpl(String name, LogicManager manager) {
        super(name, new IntegrationAccountCertificateInner());
        this.manager = manager;
        // Set resource name
        this.certificateName = name;
        //
    }

    IntegrationAccountCertificateImpl(IntegrationAccountCertificateInner inner, LogicManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.certificateName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.integrationAccountName = IdParsingUtils.getValueFromIdByName(inner.id(), "integrationAccounts");
        this.certificateName = IdParsingUtils.getValueFromIdByName(inner.id(), "certificates");
        //
    }

    @Override
    public LogicManager manager() {
        return this.manager;
    }

    @Override
    public Observable<IntegrationAccountCertificate> createResourceAsync() {
        CertificatesInner client = this.manager().inner().certificates();
        return client.createOrUpdateAsync(this.resourceGroupName, this.integrationAccountName, this.certificateName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<IntegrationAccountCertificate> updateResourceAsync() {
        CertificatesInner client = this.manager().inner().certificates();
        return client.createOrUpdateAsync(this.resourceGroupName, this.integrationAccountName, this.certificateName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<IntegrationAccountCertificateInner> getInnerAsync() {
        CertificatesInner client = this.manager().inner().certificates();
        return client.getAsync(this.resourceGroupName, this.integrationAccountName, this.certificateName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public DateTime changedTime() {
        return this.inner().changedTime();
    }

    @Override
    public DateTime createdTime() {
        return this.inner().createdTime();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public KeyVaultKeyReference keyVal() {
        return this.inner().key();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public Object metadata() {
        return this.inner().metadata();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String publicCertificate() {
        return this.inner().publicCertificate();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public IntegrationAccountCertificateImpl withExistingIntegrationAccount(String resourceGroupName, String integrationAccountName) {
        this.resourceGroupName = resourceGroupName;
        this.integrationAccountName = integrationAccountName;
        return this;
    }

    @Override
    public IntegrationAccountCertificateImpl withKey(KeyVaultKeyReference key) {
        this.inner().withKey(key);
        return this;
    }

    @Override
    public IntegrationAccountCertificateImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public IntegrationAccountCertificateImpl withMetadata(Object metadata) {
        this.inner().withMetadata(metadata);
        return this;
    }

    @Override
    public IntegrationAccountCertificateImpl withPublicCertificate(String publicCertificate) {
        this.inner().withPublicCertificate(publicCertificate);
        return this;
    }

    @Override
    public IntegrationAccountCertificateImpl withTags(Map<String, String> tags) {
        this.inner().withTags(tags);
        return this;
    }

}
