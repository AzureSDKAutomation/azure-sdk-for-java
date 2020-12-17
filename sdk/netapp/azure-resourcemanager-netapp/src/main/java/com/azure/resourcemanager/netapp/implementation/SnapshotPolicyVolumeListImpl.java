// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.implementation;

import com.azure.resourcemanager.netapp.NetAppManager;
import com.azure.resourcemanager.netapp.fluent.models.SnapshotPolicyVolumeListInner;
import com.azure.resourcemanager.netapp.models.SnapshotPolicyVolumeList;
import java.util.Collections;
import java.util.List;

public final class SnapshotPolicyVolumeListImpl implements SnapshotPolicyVolumeList {
    private SnapshotPolicyVolumeListInner innerObject;

    private final NetAppManager serviceManager;

    SnapshotPolicyVolumeListImpl(SnapshotPolicyVolumeListInner innerObject, NetAppManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<Object> value() {
        List<Object> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public SnapshotPolicyVolumeListInner innerModel() {
        return this.innerObject;
    }

    private NetAppManager manager() {
        return this.serviceManager;
    }
}
