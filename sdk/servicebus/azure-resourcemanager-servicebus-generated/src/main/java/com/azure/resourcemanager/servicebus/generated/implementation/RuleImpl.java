// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.servicebus.generated.ServiceBusManager;
import com.azure.resourcemanager.servicebus.generated.fluent.models.RuleInner;
import com.azure.resourcemanager.servicebus.generated.models.Action;
import com.azure.resourcemanager.servicebus.generated.models.CorrelationFilter;
import com.azure.resourcemanager.servicebus.generated.models.FilterType;
import com.azure.resourcemanager.servicebus.generated.models.Rule;
import com.azure.resourcemanager.servicebus.generated.models.SqlFilter;

public final class RuleImpl implements Rule, Rule.Definition, Rule.Update {
    private RuleInner innerObject;

    private final ServiceBusManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public Action action() {
        return this.innerModel().action();
    }

    public FilterType filterType() {
        return this.innerModel().filterType();
    }

    public SqlFilter sqlFilter() {
        return this.innerModel().sqlFilter();
    }

    public CorrelationFilter correlationFilter() {
        return this.innerModel().correlationFilter();
    }

    public RuleInner innerModel() {
        return this.innerObject;
    }

    private ServiceBusManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String namespaceName;

    private String topicName;

    private String subscriptionName;

    private String ruleName;

    public RuleImpl withExistingResourceGroup(
        String resourceGroupName, String namespaceName, String topicName, String subscriptionName) {
        this.resourceGroupName = resourceGroupName;
        this.namespaceName = namespaceName;
        this.topicName = topicName;
        this.subscriptionName = subscriptionName;
        return this;
    }

    public Rule create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRules()
                .createOrUpdateWithResponse(
                    resourceGroupName,
                    namespaceName,
                    topicName,
                    subscriptionName,
                    ruleName,
                    this.innerModel(),
                    Context.NONE)
                .getValue();
        return this;
    }

    public Rule create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRules()
                .createOrUpdateWithResponse(
                    resourceGroupName, namespaceName, topicName, subscriptionName, ruleName, this.innerModel(), context)
                .getValue();
        return this;
    }

    public RuleImpl(String name, ServiceBusManager serviceManager) {
        this.innerObject = new RuleInner();
        this.serviceManager = serviceManager;
        this.ruleName = name;
    }

    public RuleImpl update() {
        return this;
    }

    public Rule apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRules()
                .createOrUpdateWithResponse(
                    resourceGroupName,
                    namespaceName,
                    topicName,
                    subscriptionName,
                    ruleName,
                    this.innerModel(),
                    Context.NONE)
                .getValue();
        return this;
    }

    public Rule apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRules()
                .createOrUpdateWithResponse(
                    resourceGroupName, namespaceName, topicName, subscriptionName, ruleName, this.innerModel(), context)
                .getValue();
        return this;
    }

    public RuleImpl(RuleInner innerObject, ServiceBusManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.namespaceName = Utils.getValueFromIdByName(innerObject.id(), "namespaces");
        this.topicName = Utils.getValueFromIdByName(innerObject.id(), "topics");
        this.subscriptionName = Utils.getValueFromIdByName(innerObject.id(), "subscriptions");
        this.ruleName = Utils.getValueFromIdByName(innerObject.id(), "rules");
    }

    public Rule refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRules()
                .getWithResponse(resourceGroupName, namespaceName, topicName, subscriptionName, ruleName, Context.NONE)
                .getValue();
        return this;
    }

    public Rule refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRules()
                .getWithResponse(resourceGroupName, namespaceName, topicName, subscriptionName, ruleName, context)
                .getValue();
        return this;
    }

    public RuleImpl withAction(Action action) {
        this.innerModel().withAction(action);
        return this;
    }

    public RuleImpl withFilterType(FilterType filterType) {
        this.innerModel().withFilterType(filterType);
        return this;
    }

    public RuleImpl withSqlFilter(SqlFilter sqlFilter) {
        this.innerModel().withSqlFilter(sqlFilter);
        return this;
    }

    public RuleImpl withCorrelationFilter(CorrelationFilter correlationFilter) {
        this.innerModel().withCorrelationFilter(correlationFilter);
        return this;
    }
}
