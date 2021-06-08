// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.testbase.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.testbase.fluent.models.CustomerEventResourceInner;
import com.azure.resourcemanager.testbase.models.CustomerEventResource;
import com.azure.resourcemanager.testbase.models.NotificationEventReceiver;
import java.util.Collections;
import java.util.List;

public final class CustomerEventResourceImpl implements CustomerEventResource, CustomerEventResource.Definition {
    private CustomerEventResourceInner innerObject;

    private final com.azure.resourcemanager.testbase.TestBaseManager serviceManager;

    CustomerEventResourceImpl(
        CustomerEventResourceInner innerObject, com.azure.resourcemanager.testbase.TestBaseManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String eventName() {
        return this.innerModel().eventName();
    }

    public List<NotificationEventReceiver> receivers() {
        List<NotificationEventReceiver> inner = this.innerModel().receivers();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public CustomerEventResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.testbase.TestBaseManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String testBaseAccountName;

    private String customerEventName;

    public CustomerEventResourceImpl withExistingTestBaseAccount(String resourceGroupName, String testBaseAccountName) {
        this.resourceGroupName = resourceGroupName;
        this.testBaseAccountName = testBaseAccountName;
        return this;
    }

    public CustomerEventResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCustomerEvents()
                .create(resourceGroupName, testBaseAccountName, customerEventName, this.innerModel(), Context.NONE);
        return this;
    }

    public CustomerEventResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCustomerEvents()
                .create(resourceGroupName, testBaseAccountName, customerEventName, this.innerModel(), context);
        return this;
    }

    CustomerEventResourceImpl(String name, com.azure.resourcemanager.testbase.TestBaseManager serviceManager) {
        this.innerObject = new CustomerEventResourceInner();
        this.serviceManager = serviceManager;
        this.customerEventName = name;
    }

    public CustomerEventResource refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCustomerEvents()
                .getWithResponse(resourceGroupName, testBaseAccountName, customerEventName, Context.NONE)
                .getValue();
        return this;
    }

    public CustomerEventResource refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCustomerEvents()
                .getWithResponse(resourceGroupName, testBaseAccountName, customerEventName, context)
                .getValue();
        return this;
    }

    public CustomerEventResourceImpl withEventName(String eventName) {
        this.innerModel().withEventName(eventName);
        return this;
    }

    public CustomerEventResourceImpl withReceivers(List<NotificationEventReceiver> receivers) {
        this.innerModel().withReceivers(receivers);
        return this;
    }
}
