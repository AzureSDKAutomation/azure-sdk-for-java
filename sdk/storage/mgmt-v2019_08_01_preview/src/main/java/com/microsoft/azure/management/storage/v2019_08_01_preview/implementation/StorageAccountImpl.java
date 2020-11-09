/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_08_01_preview.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.storage.v2019_08_01_preview.StorageAccount;
import rx.Observable;
import com.microsoft.azure.management.storage.v2019_08_01_preview.StorageAccountUpdateParameters;
import com.microsoft.azure.management.storage.v2019_08_01_preview.StorageAccountCreateParameters;
import com.microsoft.azure.management.storage.v2019_08_01_preview.AccessTier;
import com.microsoft.azure.management.storage.v2019_08_01_preview.AzureFilesIdentityBasedAuthentication;
import com.microsoft.azure.management.storage.v2019_08_01_preview.BlobRestoreStatus;
import org.joda.time.DateTime;
import com.microsoft.azure.management.storage.v2019_08_01_preview.CustomDomain;
import com.microsoft.azure.management.storage.v2019_08_01_preview.Encryption;
import com.microsoft.azure.management.storage.v2019_08_01_preview.ExtendedLocation;
import com.microsoft.azure.management.storage.v2019_08_01_preview.GeoReplicationStats;
import com.microsoft.azure.management.storage.v2019_08_01_preview.Identity;
import com.microsoft.azure.management.storage.v2019_08_01_preview.Kind;
import com.microsoft.azure.management.storage.v2019_08_01_preview.LargeFileSharesState;
import com.microsoft.azure.management.storage.v2019_08_01_preview.MinimumTlsVersion;
import com.microsoft.azure.management.storage.v2019_08_01_preview.NetworkRuleSet;
import com.microsoft.azure.management.storage.v2019_08_01_preview.Endpoints;
import java.util.ArrayList;
import com.microsoft.azure.management.storage.v2019_08_01_preview.PrivateEndpointConnection;
import java.util.List;
import com.microsoft.azure.management.storage.v2019_08_01_preview.ProvisioningState;
import com.microsoft.azure.management.storage.v2019_08_01_preview.RoutingPreference;
import com.microsoft.azure.management.storage.v2019_08_01_preview.AccountStatus;
import rx.functions.Func1;

class StorageAccountImpl extends GroupableResourceCoreImpl<StorageAccount, StorageAccountInner, StorageAccountImpl, StorageManager> implements StorageAccount, StorageAccount.Definition, StorageAccount.Update {
    private StorageAccountCreateParameters createParameter;
    private StorageAccountUpdateParameters updateParameter;
    StorageAccountImpl(String name, StorageAccountInner inner, StorageManager manager) {
        super(name, inner, manager);
        this.createParameter = new StorageAccountCreateParameters();
        this.updateParameter = new StorageAccountUpdateParameters();
    }

    @Override
    public Observable<StorageAccount> createResourceAsync() {
        StorageAccountsInner client = this.manager().inner().storageAccounts();
        this.createParameter.withLocation(inner().location());
        this.createParameter.withTags(inner().getTags());
        return client.createAsync(this.resourceGroupName(), this.name(), this.createParameter)
            .map(new Func1<StorageAccountInner, StorageAccountInner>() {
               @Override
               public StorageAccountInner call(StorageAccountInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<StorageAccount> updateResourceAsync() {
        StorageAccountsInner client = this.manager().inner().storageAccounts();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<StorageAccountInner, StorageAccountInner>() {
               @Override
               public StorageAccountInner call(StorageAccountInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<StorageAccountInner> getInnerAsync() {
        StorageAccountsInner client = this.manager().inner().storageAccounts();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createParameter = new StorageAccountCreateParameters();
        this.updateParameter = new StorageAccountUpdateParameters();
    }

    @Override
    public AccessTier accessTier() {
        return this.inner().accessTier();
    }

    @Override
    public Boolean allowBlobPublicAccess() {
        return this.inner().allowBlobPublicAccess();
    }

    @Override
    public AzureFilesIdentityBasedAuthentication azureFilesIdentityBasedAuthentication() {
        return this.inner().azureFilesIdentityBasedAuthentication();
    }

    @Override
    public BlobRestoreStatus blobRestoreStatus() {
        BlobRestoreStatusInner inner = this.inner().blobRestoreStatus();
        if (inner != null) {
            return  new BlobRestoreStatusImpl(inner, manager());
        } else {
            return null;
        }
    }

    @Override
    public DateTime creationTime() {
        return this.inner().creationTime();
    }

    @Override
    public CustomDomain customDomain() {
        return this.inner().customDomain();
    }

    @Override
    public Boolean enableHttpsTrafficOnly() {
        return this.inner().enableHttpsTrafficOnly();
    }

    @Override
    public Encryption encryption() {
        return this.inner().encryption();
    }

    @Override
    public ExtendedLocation extendedLocation() {
        return this.inner().extendedLocation();
    }

    @Override
    public Boolean failoverInProgress() {
        return this.inner().failoverInProgress();
    }

    @Override
    public GeoReplicationStats geoReplicationStats() {
        return this.inner().geoReplicationStats();
    }

    @Override
    public Identity identity() {
        return this.inner().identity();
    }

    @Override
    public Boolean isHnsEnabled() {
        return this.inner().isHnsEnabled();
    }

    @Override
    public Boolean isSftpEnabled() {
        return this.inner().isSftpEnabled();
    }

    @Override
    public Kind kind() {
        return this.inner().kind();
    }

    @Override
    public LargeFileSharesState largeFileSharesState() {
        return this.inner().largeFileSharesState();
    }

    @Override
    public DateTime lastGeoFailoverTime() {
        return this.inner().lastGeoFailoverTime();
    }

    @Override
    public MinimumTlsVersion minimumTlsVersion() {
        return this.inner().minimumTlsVersion();
    }

    @Override
    public NetworkRuleSet networkRuleSet() {
        return this.inner().networkRuleSet();
    }

    @Override
    public Endpoints primaryEndpoints() {
        return this.inner().primaryEndpoints();
    }

    @Override
    public String primaryLocation() {
        return this.inner().primaryLocation();
    }

    @Override
    public List<PrivateEndpointConnection> privateEndpointConnections() {
        List<PrivateEndpointConnection> lst = new ArrayList<PrivateEndpointConnection>();
        if (this.inner().privateEndpointConnections() != null) {
            for (PrivateEndpointConnectionInner inner : this.inner().privateEndpointConnections()) {
                lst.add( new PrivateEndpointConnectionImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public RoutingPreference routingPreference() {
        return this.inner().routingPreference();
    }

    @Override
    public Endpoints secondaryEndpoints() {
        return this.inner().secondaryEndpoints();
    }

    @Override
    public String secondaryLocation() {
        return this.inner().secondaryLocation();
    }

    @Override
    public SkuInner sku() {
        return this.inner().sku();
    }

    @Override
    public AccountStatus statusOfPrimary() {
        return this.inner().statusOfPrimary();
    }

    @Override
    public AccountStatus statusOfSecondary() {
        return this.inner().statusOfSecondary();
    }

    @Override
    public StorageAccountImpl withExtendedLocation(ExtendedLocation extendedLocation) {
        this.createParameter.withExtendedLocation(extendedLocation);
        return this;
    }

    @Override
    public StorageAccountImpl withIsHnsEnabled(Boolean isHnsEnabled) {
        this.createParameter.withIsHnsEnabled(isHnsEnabled);
        return this;
    }

    @Override
    public StorageAccountImpl withKind(Kind kind) {
        if (isInCreateMode()) {
            this.createParameter.withKind(kind);
        } else {
            this.updateParameter.withKind(kind);
        }
        return this;
    }

    @Override
    public StorageAccountImpl withSku(SkuInner sku) {
        if (isInCreateMode()) {
            this.createParameter.withSku(sku);
        } else {
            this.updateParameter.withSku(sku);
        }
        return this;
    }

    @Override
    public StorageAccountImpl withAccessTier(AccessTier accessTier) {
        if (isInCreateMode()) {
            this.createParameter.withAccessTier(accessTier);
        } else {
            this.updateParameter.withAccessTier(accessTier);
        }
        return this;
    }

    @Override
    public StorageAccountImpl withAllowBlobPublicAccess(Boolean allowBlobPublicAccess) {
        if (isInCreateMode()) {
            this.createParameter.withAllowBlobPublicAccess(allowBlobPublicAccess);
        } else {
            this.updateParameter.withAllowBlobPublicAccess(allowBlobPublicAccess);
        }
        return this;
    }

    @Override
    public StorageAccountImpl withAzureFilesIdentityBasedAuthentication(AzureFilesIdentityBasedAuthentication azureFilesIdentityBasedAuthentication) {
        if (isInCreateMode()) {
            this.createParameter.withAzureFilesIdentityBasedAuthentication(azureFilesIdentityBasedAuthentication);
        } else {
            this.updateParameter.withAzureFilesIdentityBasedAuthentication(azureFilesIdentityBasedAuthentication);
        }
        return this;
    }

    @Override
    public StorageAccountImpl withCustomDomain(CustomDomain customDomain) {
        if (isInCreateMode()) {
            this.createParameter.withCustomDomain(customDomain);
        } else {
            this.updateParameter.withCustomDomain(customDomain);
        }
        return this;
    }

    @Override
    public StorageAccountImpl withEnableHttpsTrafficOnly(Boolean enableHttpsTrafficOnly) {
        if (isInCreateMode()) {
            this.createParameter.withEnableHttpsTrafficOnly(enableHttpsTrafficOnly);
        } else {
            this.updateParameter.withEnableHttpsTrafficOnly(enableHttpsTrafficOnly);
        }
        return this;
    }

    @Override
    public StorageAccountImpl withEncryption(Encryption encryption) {
        if (isInCreateMode()) {
            this.createParameter.withEncryption(encryption);
        } else {
            this.updateParameter.withEncryption(encryption);
        }
        return this;
    }

    @Override
    public StorageAccountImpl withIdentity(Identity identity) {
        if (isInCreateMode()) {
            this.createParameter.withIdentity(identity);
        } else {
            this.updateParameter.withIdentity(identity);
        }
        return this;
    }

    @Override
    public StorageAccountImpl withIsSftpEnabled(Boolean isSftpEnabled) {
        if (isInCreateMode()) {
            this.createParameter.withIsSftpEnabled(isSftpEnabled);
        } else {
            this.updateParameter.withIsSftpEnabled(isSftpEnabled);
        }
        return this;
    }

    @Override
    public StorageAccountImpl withLargeFileSharesState(LargeFileSharesState largeFileSharesState) {
        if (isInCreateMode()) {
            this.createParameter.withLargeFileSharesState(largeFileSharesState);
        } else {
            this.updateParameter.withLargeFileSharesState(largeFileSharesState);
        }
        return this;
    }

    @Override
    public StorageAccountImpl withMinimumTlsVersion(MinimumTlsVersion minimumTlsVersion) {
        if (isInCreateMode()) {
            this.createParameter.withMinimumTlsVersion(minimumTlsVersion);
        } else {
            this.updateParameter.withMinimumTlsVersion(minimumTlsVersion);
        }
        return this;
    }

    @Override
    public StorageAccountImpl withNetworkRuleSet(NetworkRuleSet networkRuleSet) {
        if (isInCreateMode()) {
            this.createParameter.withNetworkRuleSet(networkRuleSet);
        } else {
            this.updateParameter.withNetworkRuleSet(networkRuleSet);
        }
        return this;
    }

    @Override
    public StorageAccountImpl withRoutingPreference(RoutingPreference routingPreference) {
        if (isInCreateMode()) {
            this.createParameter.withRoutingPreference(routingPreference);
        } else {
            this.updateParameter.withRoutingPreference(routingPreference);
        }
        return this;
    }

}
