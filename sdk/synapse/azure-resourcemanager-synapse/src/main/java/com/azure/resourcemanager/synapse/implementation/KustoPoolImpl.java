// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.synapse.fluent.models.KustoPoolInner;
import com.azure.resourcemanager.synapse.models.AzureSku;
import com.azure.resourcemanager.synapse.models.EngineType;
import com.azure.resourcemanager.synapse.models.KustoPool;
import com.azure.resourcemanager.synapse.models.KustoPoolUpdate;
import com.azure.resourcemanager.synapse.models.State;
import java.util.Collections;
import java.util.Map;

public final class KustoPoolImpl implements KustoPool, KustoPool.Definition, KustoPool.Update {
    private KustoPoolInner innerObject;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

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

    public AzureSku sku() {
        return this.innerModel().sku();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public State state() {
        return this.innerModel().state();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String uri() {
        return this.innerModel().uri();
    }

    public String dataIngestionUri() {
        return this.innerModel().dataIngestionUri();
    }

    public String stateReason() {
        return this.innerModel().stateReason();
    }

    public EngineType engineType() {
        return this.innerModel().engineType();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public KustoPoolInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }

    private String workspaceName;

    private String resourceGroupName;

    private String kustoPoolName;

    private String createIfMatch;

    private String createIfNoneMatch;

    private String updateIfMatch;

    private KustoPoolUpdate updateParameters;

    public KustoPoolImpl withExistingWorkspace(String workspaceName, String resourceGroupName) {
        this.workspaceName = workspaceName;
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public KustoPool create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getKustoPools()
                .createOrUpdate(
                    workspaceName,
                    resourceGroupName,
                    kustoPoolName,
                    this.innerModel(),
                    createIfMatch,
                    createIfNoneMatch,
                    Context.NONE);
        return this;
    }

    public KustoPool create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getKustoPools()
                .createOrUpdate(
                    workspaceName,
                    resourceGroupName,
                    kustoPoolName,
                    this.innerModel(),
                    createIfMatch,
                    createIfNoneMatch,
                    context);
        return this;
    }

    KustoPoolImpl(String name, com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerObject = new KustoPoolInner();
        this.serviceManager = serviceManager;
        this.kustoPoolName = name;
        this.createIfMatch = null;
        this.createIfNoneMatch = null;
    }

    public KustoPoolImpl update() {
        this.updateIfMatch = null;
        this.updateParameters = new KustoPoolUpdate();
        return this;
    }

    public KustoPool apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getKustoPools()
                .update(workspaceName, resourceGroupName, kustoPoolName, updateParameters, updateIfMatch, Context.NONE);
        return this;
    }

    public KustoPool apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getKustoPools()
                .update(workspaceName, resourceGroupName, kustoPoolName, updateParameters, updateIfMatch, context);
        return this;
    }

    KustoPoolImpl(KustoPoolInner innerObject, com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.workspaceName = Utils.getValueFromIdByName(innerObject.id(), "workspaces");
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.kustoPoolName = Utils.getValueFromIdByName(innerObject.id(), "kustoPools");
    }

    public KustoPool refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getKustoPools()
                .getWithResponse(workspaceName, kustoPoolName, resourceGroupName, Context.NONE)
                .getValue();
        return this;
    }

    public KustoPool refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getKustoPools()
                .getWithResponse(workspaceName, kustoPoolName, resourceGroupName, context)
                .getValue();
        return this;
    }

    public KustoPoolImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public KustoPoolImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public KustoPoolImpl withSku(AzureSku sku) {
        if (isInCreateMode()) {
            this.innerModel().withSku(sku);
            return this;
        } else {
            this.updateParameters.withSku(sku);
            return this;
        }
    }

    public KustoPoolImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public KustoPoolImpl withEngineType(EngineType engineType) {
        if (isInCreateMode()) {
            this.innerModel().withEngineType(engineType);
            return this;
        } else {
            this.updateParameters.withEngineType(engineType);
            return this;
        }
    }

    public KustoPoolImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.createIfMatch = ifMatch;
            return this;
        } else {
            this.updateIfMatch = ifMatch;
            return this;
        }
    }

    public KustoPoolImpl withIfNoneMatch(String ifNoneMatch) {
        this.createIfNoneMatch = ifNoneMatch;
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
