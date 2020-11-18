/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.privatedns.v2020_01_01.implementation;

import com.microsoft.azure.management.privatedns.v2020_01_01.RecordSet;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.privatedns.v2020_01_01.AaaaRecord;
import com.microsoft.azure.management.privatedns.v2020_01_01.ARecord;
import com.microsoft.azure.management.privatedns.v2020_01_01.CnameRecord;
import java.util.Map;
import com.microsoft.azure.management.privatedns.v2020_01_01.MxRecord;
import com.microsoft.azure.management.privatedns.v2020_01_01.PtrRecord;
import com.microsoft.azure.management.privatedns.v2020_01_01.SoaRecord;
import com.microsoft.azure.management.privatedns.v2020_01_01.SrvRecord;
import com.microsoft.azure.management.privatedns.v2020_01_01.TxtRecord;

class RecordSetImpl extends WrapperImpl<RecordSetInner> implements RecordSet {
    private final privatednsManager manager;
    RecordSetImpl(RecordSetInner inner, privatednsManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public privatednsManager manager() {
        return this.manager;
    }

    @Override
    public List<AaaaRecord> aaaaRecords() {
        return this.inner().aaaaRecords();
    }

    @Override
    public List<ARecord> aRecords() {
        return this.inner().aRecords();
    }

    @Override
    public CnameRecord cnameRecord() {
        return this.inner().cnameRecord();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String fqdn() {
        return this.inner().fqdn();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Boolean isAutoRegistered() {
        return this.inner().isAutoRegistered();
    }

    @Override
    public Map<String, String> metadata() {
        return this.inner().metadata();
    }

    @Override
    public List<MxRecord> mxRecords() {
        return this.inner().mxRecords();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public List<PtrRecord> ptrRecords() {
        return this.inner().ptrRecords();
    }

    @Override
    public SoaRecord soaRecord() {
        return this.inner().soaRecord();
    }

    @Override
    public List<SrvRecord> srvRecords() {
        return this.inner().srvRecords();
    }

    @Override
    public Long ttl() {
        return this.inner().ttl();
    }

    @Override
    public List<TxtRecord> txtRecords() {
        return this.inner().txtRecords();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
