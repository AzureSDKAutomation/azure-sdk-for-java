/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.appservice.v2019_08_01.Domain;
import rx.Observable;
import com.microsoft.azure.management.appservice.v2019_08_01.DomainPatchResource;
import java.util.List;
import org.joda.time.DateTime;
import com.microsoft.azure.management.appservice.v2019_08_01.Contact;
import com.microsoft.azure.management.appservice.v2019_08_01.DomainStatus;
import com.microsoft.azure.management.appservice.v2019_08_01.ProvisioningState;
import com.microsoft.azure.management.appservice.v2019_08_01.HostName;
import com.microsoft.azure.management.appservice.v2019_08_01.DomainPurchaseConsent;
import com.microsoft.azure.management.appservice.v2019_08_01.DnsType;
import rx.functions.Func1;

class DomainImpl extends GroupableResourceCoreImpl<Domain, DomainInner, DomainImpl, CertificateRegistrationManager> implements Domain, Domain.Definition, Domain.Update {
    private DomainPatchResource updateParameter;
    DomainImpl(String name, DomainInner inner, CertificateRegistrationManager manager) {
        super(name, inner, manager);
        this.updateParameter = new DomainPatchResource();
    }

    @Override
    public Observable<Domain> createResourceAsync() {
        DomainsInner client = this.manager().inner().domains();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(new Func1<DomainInner, DomainInner>() {
               @Override
               public DomainInner call(DomainInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Domain> updateResourceAsync() {
        DomainsInner client = this.manager().inner().domains();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<DomainInner, DomainInner>() {
               @Override
               public DomainInner call(DomainInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<DomainInner> getInnerAsync() {
        DomainsInner client = this.manager().inner().domains();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new DomainPatchResource();
    }

    @Override
    public String authCode() {
        return this.inner().authCode();
    }

    @Override
    public Boolean autoRenew() {
        return this.inner().autoRenew();
    }

    @Override
    public DomainPurchaseConsent consent() {
        return this.inner().consent();
    }

    @Override
    public Contact contactAdmin() {
        return this.inner().contactAdmin();
    }

    @Override
    public Contact contactBilling() {
        return this.inner().contactBilling();
    }

    @Override
    public Contact contactRegistrant() {
        return this.inner().contactRegistrant();
    }

    @Override
    public Contact contactTech() {
        return this.inner().contactTech();
    }

    @Override
    public DateTime createdTime() {
        return this.inner().createdTime();
    }

    @Override
    public DnsType dnsType() {
        return this.inner().dnsType();
    }

    @Override
    public String dnsZoneId() {
        return this.inner().dnsZoneId();
    }

    @Override
    public List<String> domainNotRenewableReasons() {
        return this.inner().domainNotRenewableReasons();
    }

    @Override
    public DateTime expirationTime() {
        return this.inner().expirationTime();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public DateTime lastRenewedTime() {
        return this.inner().lastRenewedTime();
    }

    @Override
    public List<HostName> managedHostNames() {
        return this.inner().managedHostNames();
    }

    @Override
    public List<String> nameServers() {
        return this.inner().nameServers();
    }

    @Override
    public Boolean privacy() {
        return this.inner().privacy();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public Boolean readyForDnsRecordManagement() {
        return this.inner().readyForDnsRecordManagement();
    }

    @Override
    public DomainStatus registrationStatus() {
        return this.inner().registrationStatus();
    }

    @Override
    public DnsType targetDnsType() {
        return this.inner().targetDnsType();
    }

    @Override
    public DomainImpl withConsent(DomainPurchaseConsent consent) {
        this.inner().withConsent(consent);
        return this;
    }

    @Override
    public DomainImpl withContactAdmin(Contact contactAdmin) {
        this.inner().withContactAdmin(contactAdmin);
        return this;
    }

    @Override
    public DomainImpl withContactBilling(Contact contactBilling) {
        this.inner().withContactBilling(contactBilling);
        return this;
    }

    @Override
    public DomainImpl withContactRegistrant(Contact contactRegistrant) {
        this.inner().withContactRegistrant(contactRegistrant);
        return this;
    }

    @Override
    public DomainImpl withContactTech(Contact contactTech) {
        this.inner().withContactTech(contactTech);
        return this;
    }

    @Override
    public DomainImpl withAuthCode(String authCode) {
        if (isInCreateMode()) {
            this.inner().withAuthCode(authCode);
        } else {
            this.updateParameter.withAuthCode(authCode);
        }
        return this;
    }

    @Override
    public DomainImpl withAutoRenew(Boolean autoRenew) {
        if (isInCreateMode()) {
            this.inner().withAutoRenew(autoRenew);
        } else {
            this.updateParameter.withAutoRenew(autoRenew);
        }
        return this;
    }

    @Override
    public DomainImpl withDnsType(DnsType dnsType) {
        if (isInCreateMode()) {
            this.inner().withDnsType(dnsType);
        } else {
            this.updateParameter.withDnsType(dnsType);
        }
        return this;
    }

    @Override
    public DomainImpl withDnsZoneId(String dnsZoneId) {
        if (isInCreateMode()) {
            this.inner().withDnsZoneId(dnsZoneId);
        } else {
            this.updateParameter.withDnsZoneId(dnsZoneId);
        }
        return this;
    }

    @Override
    public DomainImpl withKind(String kind) {
        if (isInCreateMode()) {
            this.inner().withKind(kind);
        } else {
            this.updateParameter.withKind(kind);
        }
        return this;
    }

    @Override
    public DomainImpl withPrivacy(Boolean privacy) {
        if (isInCreateMode()) {
            this.inner().withPrivacy(privacy);
        } else {
            this.updateParameter.withPrivacy(privacy);
        }
        return this;
    }

    @Override
    public DomainImpl withTargetDnsType(DnsType targetDnsType) {
        if (isInCreateMode()) {
            this.inner().withTargetDnsType(targetDnsType);
        } else {
            this.updateParameter.withTargetDnsType(targetDnsType);
        }
        return this;
    }

}
