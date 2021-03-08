// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.synapse.SynapseManager;
import com.azure.resourcemanager.synapse.fluent.models.BigDataPoolResourceInfoInner;
import com.azure.resourcemanager.synapse.models.AutoPauseProperties;
import com.azure.resourcemanager.synapse.models.AutoScaleProperties;
import com.azure.resourcemanager.synapse.models.BigDataPoolPatchInfo;
import com.azure.resourcemanager.synapse.models.BigDataPoolResourceInfo;
import com.azure.resourcemanager.synapse.models.DynamicExecutorAllocation;
import com.azure.resourcemanager.synapse.models.LibraryInfo;
import com.azure.resourcemanager.synapse.models.LibraryRequirements;
import com.azure.resourcemanager.synapse.models.NodeSize;
import com.azure.resourcemanager.synapse.models.NodeSizeFamily;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class BigDataPoolResourceInfoImpl
    implements BigDataPoolResourceInfo, BigDataPoolResourceInfo.Definition, BigDataPoolResourceInfo.Update {
    private BigDataPoolResourceInfoInner innerObject;

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

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public AutoScaleProperties autoScale() {
        return this.innerModel().autoScale();
    }

    public OffsetDateTime creationDate() {
        return this.innerModel().creationDate();
    }

    public AutoPauseProperties autoPause() {
        return this.innerModel().autoPause();
    }

    public Boolean isComputeIsolationEnabled() {
        return this.innerModel().isComputeIsolationEnabled();
    }

    public Boolean sessionLevelPackagesEnabled() {
        return this.innerModel().sessionLevelPackagesEnabled();
    }

    public Integer cacheSize() {
        return this.innerModel().cacheSize();
    }

    public DynamicExecutorAllocation dynamicExecutorAllocation() {
        return this.innerModel().dynamicExecutorAllocation();
    }

    public String sparkEventsFolder() {
        return this.innerModel().sparkEventsFolder();
    }

    public Integer nodeCount() {
        return this.innerModel().nodeCount();
    }

    public LibraryRequirements libraryRequirements() {
        return this.innerModel().libraryRequirements();
    }

    public List<LibraryInfo> customLibraries() {
        List<LibraryInfo> inner = this.innerModel().customLibraries();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public LibraryRequirements sparkConfigProperties() {
        return this.innerModel().sparkConfigProperties();
    }

    public String sparkVersion() {
        return this.innerModel().sparkVersion();
    }

    public String defaultSparkLogFolder() {
        return this.innerModel().defaultSparkLogFolder();
    }

    public NodeSize nodeSize() {
        return this.innerModel().nodeSize();
    }

    public NodeSizeFamily nodeSizeFamily() {
        return this.innerModel().nodeSizeFamily();
    }

    public OffsetDateTime lastSucceededTimestamp() {
        return this.innerModel().lastSucceededTimestamp();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public BigDataPoolResourceInfoInner innerModel() {
        return this.innerObject;
    }

    private SynapseManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private String bigDataPoolName;

    private Boolean createForce;

    private BigDataPoolPatchInfo updateBigDataPoolPatchInfo;

    public BigDataPoolResourceInfoImpl withExistingWorkspace(String resourceGroupName, String workspaceName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        return this;
    }

    public BigDataPoolResourceInfo create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBigDataPools()
                .createOrUpdate(
                    resourceGroupName, workspaceName, bigDataPoolName, this.innerModel(), createForce, Context.NONE);
        return this;
    }

    public BigDataPoolResourceInfo create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBigDataPools()
                .createOrUpdate(
                    resourceGroupName, workspaceName, bigDataPoolName, this.innerModel(), createForce, context);
        return this;
    }

    BigDataPoolResourceInfoImpl(String name, SynapseManager serviceManager) {
        this.innerObject = new BigDataPoolResourceInfoInner();
        this.serviceManager = serviceManager;
        this.bigDataPoolName = name;
        this.createForce = null;
    }

    public BigDataPoolResourceInfoImpl update() {
        this.updateBigDataPoolPatchInfo = new BigDataPoolPatchInfo();
        return this;
    }

    public BigDataPoolResourceInfo apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBigDataPools()
                .updateWithResponse(
                    resourceGroupName, workspaceName, bigDataPoolName, updateBigDataPoolPatchInfo, Context.NONE)
                .getValue();
        return this;
    }

    public BigDataPoolResourceInfo apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBigDataPools()
                .updateWithResponse(
                    resourceGroupName, workspaceName, bigDataPoolName, updateBigDataPoolPatchInfo, context)
                .getValue();
        return this;
    }

    BigDataPoolResourceInfoImpl(BigDataPoolResourceInfoInner innerObject, SynapseManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.workspaceName = Utils.getValueFromIdByName(innerObject.id(), "workspaces");
        this.bigDataPoolName = Utils.getValueFromIdByName(innerObject.id(), "bigDataPools");
    }

    public BigDataPoolResourceInfo refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBigDataPools()
                .getWithResponse(resourceGroupName, workspaceName, bigDataPoolName, Context.NONE)
                .getValue();
        return this;
    }

    public BigDataPoolResourceInfo refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBigDataPools()
                .getWithResponse(resourceGroupName, workspaceName, bigDataPoolName, context)
                .getValue();
        return this;
    }

    public BigDataPoolResourceInfoImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public BigDataPoolResourceInfoImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public BigDataPoolResourceInfoImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateBigDataPoolPatchInfo.withTags(tags);
            return this;
        }
    }

    public BigDataPoolResourceInfoImpl withProvisioningState(String provisioningState) {
        this.innerModel().withProvisioningState(provisioningState);
        return this;
    }

    public BigDataPoolResourceInfoImpl withAutoScale(AutoScaleProperties autoScale) {
        this.innerModel().withAutoScale(autoScale);
        return this;
    }

    public BigDataPoolResourceInfoImpl withCreationDate(OffsetDateTime creationDate) {
        this.innerModel().withCreationDate(creationDate);
        return this;
    }

    public BigDataPoolResourceInfoImpl withAutoPause(AutoPauseProperties autoPause) {
        this.innerModel().withAutoPause(autoPause);
        return this;
    }

    public BigDataPoolResourceInfoImpl withIsComputeIsolationEnabled(Boolean isComputeIsolationEnabled) {
        this.innerModel().withIsComputeIsolationEnabled(isComputeIsolationEnabled);
        return this;
    }

    public BigDataPoolResourceInfoImpl withSessionLevelPackagesEnabled(Boolean sessionLevelPackagesEnabled) {
        this.innerModel().withSessionLevelPackagesEnabled(sessionLevelPackagesEnabled);
        return this;
    }

    public BigDataPoolResourceInfoImpl withCacheSize(Integer cacheSize) {
        this.innerModel().withCacheSize(cacheSize);
        return this;
    }

    public BigDataPoolResourceInfoImpl withDynamicExecutorAllocation(
        DynamicExecutorAllocation dynamicExecutorAllocation) {
        this.innerModel().withDynamicExecutorAllocation(dynamicExecutorAllocation);
        return this;
    }

    public BigDataPoolResourceInfoImpl withSparkEventsFolder(String sparkEventsFolder) {
        this.innerModel().withSparkEventsFolder(sparkEventsFolder);
        return this;
    }

    public BigDataPoolResourceInfoImpl withNodeCount(Integer nodeCount) {
        this.innerModel().withNodeCount(nodeCount);
        return this;
    }

    public BigDataPoolResourceInfoImpl withLibraryRequirements(LibraryRequirements libraryRequirements) {
        this.innerModel().withLibraryRequirements(libraryRequirements);
        return this;
    }

    public BigDataPoolResourceInfoImpl withCustomLibraries(List<LibraryInfo> customLibraries) {
        this.innerModel().withCustomLibraries(customLibraries);
        return this;
    }

    public BigDataPoolResourceInfoImpl withSparkConfigProperties(LibraryRequirements sparkConfigProperties) {
        this.innerModel().withSparkConfigProperties(sparkConfigProperties);
        return this;
    }

    public BigDataPoolResourceInfoImpl withSparkVersion(String sparkVersion) {
        this.innerModel().withSparkVersion(sparkVersion);
        return this;
    }

    public BigDataPoolResourceInfoImpl withDefaultSparkLogFolder(String defaultSparkLogFolder) {
        this.innerModel().withDefaultSparkLogFolder(defaultSparkLogFolder);
        return this;
    }

    public BigDataPoolResourceInfoImpl withNodeSize(NodeSize nodeSize) {
        this.innerModel().withNodeSize(nodeSize);
        return this;
    }

    public BigDataPoolResourceInfoImpl withNodeSizeFamily(NodeSizeFamily nodeSizeFamily) {
        this.innerModel().withNodeSizeFamily(nodeSizeFamily);
        return this;
    }

    public BigDataPoolResourceInfoImpl withForce(Boolean force) {
        this.createForce = force;
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
