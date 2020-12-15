// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.models.ManagedInstanceInner;
import com.azure.resourcemanager.sql.generated.models.ManagedInstance;
import com.azure.resourcemanager.sql.generated.models.ManagedInstanceLicenseType;
import com.azure.resourcemanager.sql.generated.models.ManagedInstancePecProperty;
import com.azure.resourcemanager.sql.generated.models.ManagedInstancePropertiesProvisioningState;
import com.azure.resourcemanager.sql.generated.models.ManagedInstanceProxyOverride;
import com.azure.resourcemanager.sql.generated.models.ManagedInstanceUpdate;
import com.azure.resourcemanager.sql.generated.models.ManagedServerCreateMode;
import com.azure.resourcemanager.sql.generated.models.ResourceIdentity;
import com.azure.resourcemanager.sql.generated.models.Sku;
import com.azure.resourcemanager.sql.generated.models.StorageAccountType;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class ManagedInstanceImpl implements ManagedInstance, ManagedInstance.Definition, ManagedInstance.Update {
    private ManagedInstanceInner innerObject;

    private final SqlManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ResourceIdentity identity() {
        return this.innerModel().identity();
    }

    public Sku sku() {
        return this.innerModel().sku();
    }

    public ManagedInstancePropertiesProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public ManagedServerCreateMode managedInstanceCreateMode() {
        return this.innerModel().managedInstanceCreateMode();
    }

    public String fullyQualifiedDomainName() {
        return this.innerModel().fullyQualifiedDomainName();
    }

    public String administratorLogin() {
        return this.innerModel().administratorLogin();
    }

    public String administratorLoginPassword() {
        return this.innerModel().administratorLoginPassword();
    }

    public String subnetId() {
        return this.innerModel().subnetId();
    }

    public String state() {
        return this.innerModel().state();
    }

    public ManagedInstanceLicenseType licenseType() {
        return this.innerModel().licenseType();
    }

    public Integer vCores() {
        return this.innerModel().vCores();
    }

    public Integer storageSizeInGB() {
        return this.innerModel().storageSizeInGB();
    }

    public String collation() {
        return this.innerModel().collation();
    }

    public String dnsZone() {
        return this.innerModel().dnsZone();
    }

    public String dnsZonePartner() {
        return this.innerModel().dnsZonePartner();
    }

    public Boolean publicDataEndpointEnabled() {
        return this.innerModel().publicDataEndpointEnabled();
    }

    public String sourceManagedInstanceId() {
        return this.innerModel().sourceManagedInstanceId();
    }

    public OffsetDateTime restorePointInTime() {
        return this.innerModel().restorePointInTime();
    }

    public ManagedInstanceProxyOverride proxyOverride() {
        return this.innerModel().proxyOverride();
    }

    public String timezoneId() {
        return this.innerModel().timezoneId();
    }

    public String instancePoolId() {
        return this.innerModel().instancePoolId();
    }

    public String maintenanceConfigurationId() {
        return this.innerModel().maintenanceConfigurationId();
    }

    public List<ManagedInstancePecProperty> privateEndpointConnections() {
        List<ManagedInstancePecProperty> inner = this.innerModel().privateEndpointConnections();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String minimalTlsVersion() {
        return this.innerModel().minimalTlsVersion();
    }

    public StorageAccountType storageAccountType() {
        return this.innerModel().storageAccountType();
    }

    public Boolean zoneRedundant() {
        return this.innerModel().zoneRedundant();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public ManagedInstanceInner innerModel() {
        return this.innerObject;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String managedInstanceName;

    private ManagedInstanceUpdate updateParameters;

    public ManagedInstanceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public ManagedInstance create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getManagedInstances()
                .createOrUpdate(resourceGroupName, managedInstanceName, this.innerModel(), Context.NONE);
        return this;
    }

    public ManagedInstance create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getManagedInstances()
                .createOrUpdate(resourceGroupName, managedInstanceName, this.innerModel(), context);
        return this;
    }

    public ManagedInstanceImpl(String name, SqlManager serviceManager) {
        this.innerObject = new ManagedInstanceInner();
        this.serviceManager = serviceManager;
        this.managedInstanceName = name;
    }

    public ManagedInstanceImpl update() {
        this.updateParameters = new ManagedInstanceUpdate();
        return this;
    }

    public ManagedInstance apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getManagedInstances()
                .update(resourceGroupName, managedInstanceName, updateParameters, Context.NONE);
        return this;
    }

    public ManagedInstance apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getManagedInstances()
                .update(resourceGroupName, managedInstanceName, updateParameters, context);
        return this;
    }

    public ManagedInstanceImpl(ManagedInstanceInner innerObject, SqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.managedInstanceName = Utils.getValueFromIdByName(innerObject.id(), "managedInstances");
    }

    public ManagedInstance refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getManagedInstances()
                .getByResourceGroupWithResponse(resourceGroupName, managedInstanceName, Context.NONE)
                .getValue();
        return this;
    }

    public ManagedInstance refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getManagedInstances()
                .getByResourceGroupWithResponse(resourceGroupName, managedInstanceName, context)
                .getValue();
        return this;
    }

    public ManagedInstanceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ManagedInstanceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ManagedInstanceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public ManagedInstanceImpl withIdentity(ResourceIdentity identity) {
        if (isInCreateMode()) {
            this.innerModel().withIdentity(identity);
            return this;
        } else {
            this.updateParameters.withIdentity(identity);
            return this;
        }
    }

    public ManagedInstanceImpl withSku(Sku sku) {
        if (isInCreateMode()) {
            this.innerModel().withSku(sku);
            return this;
        } else {
            this.updateParameters.withSku(sku);
            return this;
        }
    }

    public ManagedInstanceImpl withManagedInstanceCreateMode(ManagedServerCreateMode managedInstanceCreateMode) {
        if (isInCreateMode()) {
            this.innerModel().withManagedInstanceCreateMode(managedInstanceCreateMode);
            return this;
        } else {
            this.updateParameters.withManagedInstanceCreateMode(managedInstanceCreateMode);
            return this;
        }
    }

    public ManagedInstanceImpl withAdministratorLogin(String administratorLogin) {
        if (isInCreateMode()) {
            this.innerModel().withAdministratorLogin(administratorLogin);
            return this;
        } else {
            this.updateParameters.withAdministratorLogin(administratorLogin);
            return this;
        }
    }

    public ManagedInstanceImpl withAdministratorLoginPassword(String administratorLoginPassword) {
        if (isInCreateMode()) {
            this.innerModel().withAdministratorLoginPassword(administratorLoginPassword);
            return this;
        } else {
            this.updateParameters.withAdministratorLoginPassword(administratorLoginPassword);
            return this;
        }
    }

    public ManagedInstanceImpl withSubnetId(String subnetId) {
        if (isInCreateMode()) {
            this.innerModel().withSubnetId(subnetId);
            return this;
        } else {
            this.updateParameters.withSubnetId(subnetId);
            return this;
        }
    }

    public ManagedInstanceImpl withLicenseType(ManagedInstanceLicenseType licenseType) {
        if (isInCreateMode()) {
            this.innerModel().withLicenseType(licenseType);
            return this;
        } else {
            this.updateParameters.withLicenseType(licenseType);
            return this;
        }
    }

    public ManagedInstanceImpl withVCores(Integer vCores) {
        if (isInCreateMode()) {
            this.innerModel().withVCores(vCores);
            return this;
        } else {
            this.updateParameters.withVCores(vCores);
            return this;
        }
    }

    public ManagedInstanceImpl withStorageSizeInGB(Integer storageSizeInGB) {
        if (isInCreateMode()) {
            this.innerModel().withStorageSizeInGB(storageSizeInGB);
            return this;
        } else {
            this.updateParameters.withStorageSizeInGB(storageSizeInGB);
            return this;
        }
    }

    public ManagedInstanceImpl withCollation(String collation) {
        if (isInCreateMode()) {
            this.innerModel().withCollation(collation);
            return this;
        } else {
            this.updateParameters.withCollation(collation);
            return this;
        }
    }

    public ManagedInstanceImpl withDnsZonePartner(String dnsZonePartner) {
        if (isInCreateMode()) {
            this.innerModel().withDnsZonePartner(dnsZonePartner);
            return this;
        } else {
            this.updateParameters.withDnsZonePartner(dnsZonePartner);
            return this;
        }
    }

    public ManagedInstanceImpl withPublicDataEndpointEnabled(Boolean publicDataEndpointEnabled) {
        if (isInCreateMode()) {
            this.innerModel().withPublicDataEndpointEnabled(publicDataEndpointEnabled);
            return this;
        } else {
            this.updateParameters.withPublicDataEndpointEnabled(publicDataEndpointEnabled);
            return this;
        }
    }

    public ManagedInstanceImpl withSourceManagedInstanceId(String sourceManagedInstanceId) {
        if (isInCreateMode()) {
            this.innerModel().withSourceManagedInstanceId(sourceManagedInstanceId);
            return this;
        } else {
            this.updateParameters.withSourceManagedInstanceId(sourceManagedInstanceId);
            return this;
        }
    }

    public ManagedInstanceImpl withRestorePointInTime(OffsetDateTime restorePointInTime) {
        if (isInCreateMode()) {
            this.innerModel().withRestorePointInTime(restorePointInTime);
            return this;
        } else {
            this.updateParameters.withRestorePointInTime(restorePointInTime);
            return this;
        }
    }

    public ManagedInstanceImpl withProxyOverride(ManagedInstanceProxyOverride proxyOverride) {
        if (isInCreateMode()) {
            this.innerModel().withProxyOverride(proxyOverride);
            return this;
        } else {
            this.updateParameters.withProxyOverride(proxyOverride);
            return this;
        }
    }

    public ManagedInstanceImpl withTimezoneId(String timezoneId) {
        if (isInCreateMode()) {
            this.innerModel().withTimezoneId(timezoneId);
            return this;
        } else {
            this.updateParameters.withTimezoneId(timezoneId);
            return this;
        }
    }

    public ManagedInstanceImpl withInstancePoolId(String instancePoolId) {
        if (isInCreateMode()) {
            this.innerModel().withInstancePoolId(instancePoolId);
            return this;
        } else {
            this.updateParameters.withInstancePoolId(instancePoolId);
            return this;
        }
    }

    public ManagedInstanceImpl withMaintenanceConfigurationId(String maintenanceConfigurationId) {
        if (isInCreateMode()) {
            this.innerModel().withMaintenanceConfigurationId(maintenanceConfigurationId);
            return this;
        } else {
            this.updateParameters.withMaintenanceConfigurationId(maintenanceConfigurationId);
            return this;
        }
    }

    public ManagedInstanceImpl withMinimalTlsVersion(String minimalTlsVersion) {
        if (isInCreateMode()) {
            this.innerModel().withMinimalTlsVersion(minimalTlsVersion);
            return this;
        } else {
            this.updateParameters.withMinimalTlsVersion(minimalTlsVersion);
            return this;
        }
    }

    public ManagedInstanceImpl withStorageAccountType(StorageAccountType storageAccountType) {
        if (isInCreateMode()) {
            this.innerModel().withStorageAccountType(storageAccountType);
            return this;
        } else {
            this.updateParameters.withStorageAccountType(storageAccountType);
            return this;
        }
    }

    public ManagedInstanceImpl withZoneRedundant(Boolean zoneRedundant) {
        if (isInCreateMode()) {
            this.innerModel().withZoneRedundant(zoneRedundant);
            return this;
        } else {
            this.updateParameters.withZoneRedundant(zoneRedundant);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
