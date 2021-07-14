// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.RuleResultsInner;
import com.azure.resourcemanager.security.models.RuleResults;
import com.azure.resourcemanager.security.models.RuleResultsInput;
import com.azure.resourcemanager.security.models.RuleResultsProperties;
import java.util.List;

public final class RuleResultsImpl implements RuleResults, RuleResults.Definition, RuleResults.Update {
    private RuleResultsInner innerObject;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public RuleResultsProperties properties() {
        return this.innerModel().properties();
    }

    public RuleResultsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }

    private String ruleId;

    private String resourceId;

    private String createWorkspaceId;

    private RuleResultsInput createBody;

    private String updateWorkspaceId;

    private RuleResultsInput updateBody;

    public RuleResultsImpl withExistingResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    public RuleResults create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlVulnerabilityAssessmentBaselineRules()
                .createOrUpdateWithResponse(ruleId, createWorkspaceId, resourceId, createBody, Context.NONE)
                .getValue();
        return this;
    }

    public RuleResults create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlVulnerabilityAssessmentBaselineRules()
                .createOrUpdateWithResponse(ruleId, createWorkspaceId, resourceId, createBody, context)
                .getValue();
        return this;
    }

    RuleResultsImpl(String name, com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerObject = new RuleResultsInner();
        this.serviceManager = serviceManager;
        this.ruleId = name;
        this.createWorkspaceId = null;
        this.createBody = new RuleResultsInput();
    }

    public RuleResultsImpl update() {
        this.updateWorkspaceId = null;
        this.updateBody = new RuleResultsInput();
        return this;
    }

    public RuleResults apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlVulnerabilityAssessmentBaselineRules()
                .createOrUpdateWithResponse(ruleId, updateWorkspaceId, resourceId, updateBody, Context.NONE)
                .getValue();
        return this;
    }

    public RuleResults apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlVulnerabilityAssessmentBaselineRules()
                .createOrUpdateWithResponse(ruleId, updateWorkspaceId, resourceId, updateBody, context)
                .getValue();
        return this;
    }

    RuleResultsImpl(RuleResultsInner innerObject, com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.ruleId =
            Utils
                .getValueFromIdByParameterName(
                    innerObject.id(),
                    "/{resourceId}/providers/Microsoft.Security/sqlVulnerabilityAssessments/default/baselineRules"
                        + "/{ruleId}",
                    "ruleId");
        this.resourceId =
            Utils
                .getValueFromIdByParameterName(
                    innerObject.id(),
                    "/{resourceId}/providers/Microsoft.Security/sqlVulnerabilityAssessments/default/baselineRules"
                        + "/{ruleId}",
                    "resourceId");
    }

    public RuleResultsImpl withLatestScan(Boolean latestScan) {
        if (isInCreateMode()) {
            this.createBody.withLatestScan(latestScan);
            return this;
        } else {
            this.updateBody.withLatestScan(latestScan);
            return this;
        }
    }

    public RuleResultsImpl withResults(List<List<String>> results) {
        if (isInCreateMode()) {
            this.createBody.withResults(results);
            return this;
        } else {
            this.updateBody.withResults(results);
            return this;
        }
    }

    public RuleResultsImpl withWorkspaceId(String workspaceId) {
        if (isInCreateMode()) {
            this.createWorkspaceId = workspaceId;
            return this;
        } else {
            this.updateWorkspaceId = workspaceId;
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
