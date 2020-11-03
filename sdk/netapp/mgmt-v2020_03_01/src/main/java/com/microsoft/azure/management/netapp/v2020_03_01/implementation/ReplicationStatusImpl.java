/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_03_01.implementation;

import com.microsoft.azure.management.netapp.v2020_03_01.ReplicationStatus;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.netapp.v2020_03_01.MirrorState;
import com.microsoft.azure.management.netapp.v2020_03_01.RelationshipStatus;

class ReplicationStatusImpl extends WrapperImpl<ReplicationStatusInner> implements ReplicationStatus {
    private final NetAppManager manager;
    ReplicationStatusImpl(ReplicationStatusInner inner, NetAppManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NetAppManager manager() {
        return this.manager;
    }

    @Override
    public String errorMessage() {
        return this.inner().errorMessage();
    }

    @Override
    public Boolean healthy() {
        return this.inner().healthy();
    }

    @Override
    public MirrorState mirrorState() {
        return this.inner().mirrorState();
    }

    @Override
    public RelationshipStatus relationshipStatus() {
        return this.inner().relationshipStatus();
    }

    @Override
    public String totalProgress() {
        return this.inner().totalProgress();
    }

}
