// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.implementation;

import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hybridnetwork.fluent.models.VendorInner;
import com.azure.resourcemanager.hybridnetwork.models.ProvisioningState;
import com.azure.resourcemanager.hybridnetwork.models.Vendor;
import java.util.Collections;
import java.util.List;

public final class VendorImpl implements Vendor, Vendor.Definition, Vendor.Update {
    private VendorInner innerObject;

    private final com.azure.resourcemanager.hybridnetwork.HybridNetworkManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public List<SubResource> skus() {
        List<SubResource> inner = this.innerModel().skus();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public VendorInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hybridnetwork.HybridNetworkManager manager() {
        return this.serviceManager;
    }

    private String vendorName;

    public Vendor create() {
        this.innerObject =
            serviceManager.serviceClient().getVendors().createOrUpdate(vendorName, this.innerModel(), Context.NONE);
        return this;
    }

    public Vendor create(Context context) {
        this.innerObject =
            serviceManager.serviceClient().getVendors().createOrUpdate(vendorName, this.innerModel(), context);
        return this;
    }

    VendorImpl(String name, com.azure.resourcemanager.hybridnetwork.HybridNetworkManager serviceManager) {
        this.innerObject = new VendorInner();
        this.serviceManager = serviceManager;
        this.vendorName = name;
    }

    public VendorImpl update() {
        return this;
    }

    public Vendor apply() {
        this.innerObject =
            serviceManager.serviceClient().getVendors().createOrUpdate(vendorName, this.innerModel(), Context.NONE);
        return this;
    }

    public Vendor apply(Context context) {
        this.innerObject =
            serviceManager.serviceClient().getVendors().createOrUpdate(vendorName, this.innerModel(), context);
        return this;
    }

    VendorImpl(VendorInner innerObject, com.azure.resourcemanager.hybridnetwork.HybridNetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.vendorName = Utils.getValueFromIdByName(innerObject.id(), "vendors");
    }

    public Vendor refresh() {
        this.innerObject =
            serviceManager.serviceClient().getVendors().getWithResponse(vendorName, Context.NONE).getValue();
        return this;
    }

    public Vendor refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getVendors().getWithResponse(vendorName, context).getValue();
        return this;
    }
}
