/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01.implementation;

import com.microsoft.azure.management.logic.v2016_06_01.WorkflowVersion;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import org.joda.time.DateTime;
import com.microsoft.azure.management.logic.v2016_06_01.ResourceReference;
import java.util.Map;
import com.microsoft.azure.management.logic.v2016_06_01.WorkflowParameter;
import com.microsoft.azure.management.logic.v2016_06_01.Sku;
import com.microsoft.azure.management.logic.v2016_06_01.WorkflowState;

class WorkflowVersionImpl extends IndexableRefreshableWrapperImpl<WorkflowVersion, WorkflowVersionInner> implements WorkflowVersion {
    private final LogicManager manager;
    private String resourceGroupName;
    private String workflowName;
    private String versionId;

    WorkflowVersionImpl(WorkflowVersionInner inner,  LogicManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.workflowName = IdParsingUtils.getValueFromIdByName(inner.id(), "workflows");
        this.versionId = IdParsingUtils.getValueFromIdByName(inner.id(), "versions");
    }

    @Override
    public LogicManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<WorkflowVersionInner> getInnerAsync() {
        WorkflowVersionsInner client = this.manager().inner().workflowVersions();
        return client.getAsync(this.resourceGroupName, this.workflowName, this.versionId);
    }



    @Override
    public String accessEndpoint() {
        return this.inner().accessEndpoint();
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
    public Object definition() {
        return this.inner().definition();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public ResourceReference integrationAccount() {
        return this.inner().integrationAccount();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Map<String, WorkflowParameter> parameters() {
        return this.inner().parameters();
    }

    @Override
    public Sku sku() {
        return this.inner().sku();
    }

    @Override
    public WorkflowState state() {
        return this.inner().state();
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
    public String version() {
        return this.inner().version();
    }

}
