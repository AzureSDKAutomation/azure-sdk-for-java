/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01.implementation;

import com.microsoft.azure.management.appservice.v2019_08_01.SiteExtensionInfo;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.appservice.v2019_08_01.SiteExtensionType;
import org.joda.time.DateTime;

class SiteExtensionInfoImpl extends CreatableUpdatableImpl<SiteExtensionInfo, SiteExtensionInfoInner, SiteExtensionInfoImpl> implements SiteExtensionInfo, SiteExtensionInfo.Definition, SiteExtensionInfo.Update {
    private final CertificateRegistrationManager manager;
    private String resourceGroupName;
    private String name;
    private String siteExtensionId;

    SiteExtensionInfoImpl(String name, CertificateRegistrationManager manager) {
        super(name, new SiteExtensionInfoInner());
        this.manager = manager;
        // Set resource name
        this.siteExtensionId = name;
        //
    }

    SiteExtensionInfoImpl(SiteExtensionInfoInner inner, CertificateRegistrationManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.siteExtensionId = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.name = IdParsingUtils.getValueFromIdByName(inner.id(), "sites");
        this.siteExtensionId = IdParsingUtils.getValueFromIdByName(inner.id(), "siteextensions");
        //
    }

    @Override
    public CertificateRegistrationManager manager() {
        return this.manager;
    }

    @Override
    public Observable<SiteExtensionInfo> createResourceAsync() {
        WebAppsInner client = this.manager().inner().webApps();
        return client.installSiteExtensionAsync(this.resourceGroupName, this.name, this.siteExtensionId)
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<SiteExtensionInfo> updateResourceAsync() {
        WebAppsInner client = this.manager().inner().webApps();
        return client.installSiteExtensionAsync(this.resourceGroupName, this.name, this.siteExtensionId)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<SiteExtensionInfoInner> getInnerAsync() {
        WebAppsInner client = this.manager().inner().webApps();
        return client.getSiteExtensionAsync(this.resourceGroupName, this.name, this.siteExtensionId);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public List<String> authors() {
        return this.inner().authors();
    }

    @Override
    public String comment() {
        return this.inner().comment();
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public Integer downloadCount() {
        return this.inner().downloadCount();
    }

    @Override
    public String extensionId() {
        return this.inner().extensionId();
    }

    @Override
    public SiteExtensionType extensionType() {
        return this.inner().extensionType();
    }

    @Override
    public String extensionUrl() {
        return this.inner().extensionUrl();
    }

    @Override
    public String feedUrl() {
        return this.inner().feedUrl();
    }

    @Override
    public String iconUrl() {
        return this.inner().iconUrl();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public DateTime installedDateTime() {
        return this.inner().installedDateTime();
    }

    @Override
    public String installerCommandLineParams() {
        return this.inner().installerCommandLineParams();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String licenseUrl() {
        return this.inner().licenseUrl();
    }

    @Override
    public Boolean localIsLatestVersion() {
        return this.inner().localIsLatestVersion();
    }

    @Override
    public String localPath() {
        return this.inner().localPath();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String projectUrl() {
        return this.inner().projectUrl();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public DateTime publishedDateTime() {
        return this.inner().publishedDateTime();
    }

    @Override
    public String summary() {
        return this.inner().summary();
    }

    @Override
    public String title() {
        return this.inner().title();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String version() {
        return this.inner().version();
    }

    @Override
    public SiteExtensionInfoImpl withExistingSite(String resourceGroupName, String name) {
        this.resourceGroupName = resourceGroupName;
        this.name = name;
        return this;
    }

}
