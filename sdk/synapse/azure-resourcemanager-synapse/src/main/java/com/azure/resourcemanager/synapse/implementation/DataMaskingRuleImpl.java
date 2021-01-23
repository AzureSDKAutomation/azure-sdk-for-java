// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.synapse.SynapseManager;
import com.azure.resourcemanager.synapse.fluent.models.DataMaskingRuleInner;
import com.azure.resourcemanager.synapse.models.DataMaskingFunction;
import com.azure.resourcemanager.synapse.models.DataMaskingRule;
import com.azure.resourcemanager.synapse.models.DataMaskingRuleState;

public final class DataMaskingRuleImpl implements DataMaskingRule, DataMaskingRule.Definition, DataMaskingRule.Update {
    private DataMaskingRuleInner innerObject;

    private final SynapseManager serviceManager;

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

    public String kind() {
        return this.innerModel().kind();
    }

    public String idPropertiesId() {
        return this.innerModel().idPropertiesId();
    }

    public String aliasName() {
        return this.innerModel().aliasName();
    }

    public DataMaskingRuleState ruleState() {
        return this.innerModel().ruleState();
    }

    public String schemaName() {
        return this.innerModel().schemaName();
    }

    public String tableName() {
        return this.innerModel().tableName();
    }

    public String columnName() {
        return this.innerModel().columnName();
    }

    public DataMaskingFunction maskingFunction() {
        return this.innerModel().maskingFunction();
    }

    public String numberFrom() {
        return this.innerModel().numberFrom();
    }

    public String numberTo() {
        return this.innerModel().numberTo();
    }

    public String prefixSize() {
        return this.innerModel().prefixSize();
    }

    public String suffixSize() {
        return this.innerModel().suffixSize();
    }

    public String replacementString() {
        return this.innerModel().replacementString();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public DataMaskingRuleInner innerModel() {
        return this.innerObject;
    }

    private SynapseManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private String sqlPoolName;

    private String dataMaskingRuleName;

    public DataMaskingRuleImpl withExistingSqlPool(String resourceGroupName, String workspaceName, String sqlPoolName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        this.sqlPoolName = sqlPoolName;
        return this;
    }

    public DataMaskingRule create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataMaskingRules()
                .createOrUpdateWithResponse(
                    resourceGroupName, workspaceName, sqlPoolName, dataMaskingRuleName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public DataMaskingRule create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataMaskingRules()
                .createOrUpdateWithResponse(
                    resourceGroupName, workspaceName, sqlPoolName, dataMaskingRuleName, this.innerModel(), context)
                .getValue();
        return this;
    }

    DataMaskingRuleImpl(String name, SynapseManager serviceManager) {
        this.innerObject = new DataMaskingRuleInner();
        this.serviceManager = serviceManager;
        this.dataMaskingRuleName = name;
    }

    public DataMaskingRuleImpl update() {
        return this;
    }

    public DataMaskingRule apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataMaskingRules()
                .createOrUpdateWithResponse(
                    resourceGroupName, workspaceName, sqlPoolName, dataMaskingRuleName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public DataMaskingRule apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataMaskingRules()
                .createOrUpdateWithResponse(
                    resourceGroupName, workspaceName, sqlPoolName, dataMaskingRuleName, this.innerModel(), context)
                .getValue();
        return this;
    }

    DataMaskingRuleImpl(DataMaskingRuleInner innerObject, SynapseManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.workspaceName = Utils.getValueFromIdByName(innerObject.id(), "workspaces");
        this.sqlPoolName = Utils.getValueFromIdByName(innerObject.id(), "sqlPools");
        this.dataMaskingRuleName = Utils.getValueFromIdByName(innerObject.id(), "rules");
    }

    public DataMaskingRule refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataMaskingRules()
                .getWithResponse(resourceGroupName, workspaceName, sqlPoolName, dataMaskingRuleName, Context.NONE)
                .getValue();
        return this;
    }

    public DataMaskingRule refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataMaskingRules()
                .getWithResponse(resourceGroupName, workspaceName, sqlPoolName, dataMaskingRuleName, context)
                .getValue();
        return this;
    }

    public DataMaskingRuleImpl withAliasName(String aliasName) {
        this.innerModel().withAliasName(aliasName);
        return this;
    }

    public DataMaskingRuleImpl withRuleState(DataMaskingRuleState ruleState) {
        this.innerModel().withRuleState(ruleState);
        return this;
    }

    public DataMaskingRuleImpl withSchemaName(String schemaName) {
        this.innerModel().withSchemaName(schemaName);
        return this;
    }

    public DataMaskingRuleImpl withTableName(String tableName) {
        this.innerModel().withTableName(tableName);
        return this;
    }

    public DataMaskingRuleImpl withColumnName(String columnName) {
        this.innerModel().withColumnName(columnName);
        return this;
    }

    public DataMaskingRuleImpl withMaskingFunction(DataMaskingFunction maskingFunction) {
        this.innerModel().withMaskingFunction(maskingFunction);
        return this;
    }

    public DataMaskingRuleImpl withNumberFrom(String numberFrom) {
        this.innerModel().withNumberFrom(numberFrom);
        return this;
    }

    public DataMaskingRuleImpl withNumberTo(String numberTo) {
        this.innerModel().withNumberTo(numberTo);
        return this;
    }

    public DataMaskingRuleImpl withPrefixSize(String prefixSize) {
        this.innerModel().withPrefixSize(prefixSize);
        return this;
    }

    public DataMaskingRuleImpl withSuffixSize(String suffixSize) {
        this.innerModel().withSuffixSize(suffixSize);
        return this;
    }

    public DataMaskingRuleImpl withReplacementString(String replacementString) {
        this.innerModel().withReplacementString(replacementString);
        return this;
    }
}