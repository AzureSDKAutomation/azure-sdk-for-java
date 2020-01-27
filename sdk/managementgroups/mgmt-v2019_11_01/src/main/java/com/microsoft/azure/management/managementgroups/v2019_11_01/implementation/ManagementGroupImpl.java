/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.managementgroups.v2019_11_01.implementation;

import com.microsoft.azure.management.managementgroups.v2019_11_01.ManagementGroup;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.managementgroups.v2019_11_01.PatchManagementGroupRequest;
import java.util.List;
import com.microsoft.azure.management.managementgroups.v2019_11_01.ManagementGroupChildInfo;
import com.microsoft.azure.management.managementgroups.v2019_11_01.ManagementGroupDetails;
import com.microsoft.azure.management.managementgroups.v2019_11_01.ManagementGroupPathElement;
import rx.functions.Func1;

class ManagementGroupImpl extends CreatableUpdatableImpl<ManagementGroup, ManagementGroupInner, ManagementGroupImpl> implements ManagementGroup, ManagementGroup.Update {
    private String groupId;
    private String ucacheControl;
    private PatchManagementGroupRequest updateParameter;
    private final ManagementManager manager;

    ManagementGroupImpl(String name, ManagementManager manager) {
        super(name, new ManagementGroupInner());
        this.manager = manager;
        // Set resource name
        this.groupId = name;
        //
        this.updateParameter = new PatchManagementGroupRequest();
    }

    ManagementGroupImpl(ManagementGroupInner inner, ManagementManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.groupId = inner.name();
        // set resource ancestor and positional variables
        this.groupId = IdParsingUtils.getValueFromIdByName(inner.id(), "managementGroups");
        // set other parameters for create and update
        this.updateParameter = new PatchManagementGroupRequest();
    }

    @Override
    public ManagementManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ManagementGroup> createResourceAsync() {
        ManagementGroupsInner client = this.manager().inner().managementGroups();
        return null; // NOP createResourceAsync implementation as create is not supported
    }

    @Override
    public Observable<ManagementGroup> updateResourceAsync() {
        ManagementGroupsInner client = this.manager().inner().managementGroups();
        return client.updateAsync(this.groupId, this.updateParameter, this.ucacheControl)
            .map(new Func1<ManagementGroupInner, ManagementGroupInner>() {
               @Override
               public ManagementGroupInner call(ManagementGroupInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ManagementGroupInner> getInnerAsync() {
        ManagementGroupsInner client = this.manager().inner().managementGroups();
        return client.getAsync(this.groupId);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new PatchManagementGroupRequest();
    }

    @Override
    public List<ManagementGroupChildInfo> children() {
        return this.inner().children();
    }

    @Override
    public ManagementGroupDetails details() {
        return this.inner().details();
    }

    @Override
    public String displayName() {
        return this.inner().displayName();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public List<ManagementGroupPathElement> path() {
        return this.inner().path();
    }

    @Override
    public List<String> roles() {
        return this.inner().roles();
    }

    @Override
    public String tenantId() {
        return this.inner().tenantId();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public ManagementGroupImpl withCacheControl(String cacheControl) {
        this.ucacheControl = cacheControl;
        return this;
    }

    @Override
    public ManagementGroupImpl withDisplayName(String displayName) {
        this.updateParameter.withDisplayName(displayName);
        return this;
    }

    @Override
    public ManagementGroupImpl withParentId(String parentId) {
        this.updateParameter.withParentId(parentId);
        return this;
    }

}
