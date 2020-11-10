/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.dns.v2016_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.dns.v2016_04_01.implementation.RecordSetInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.dns.v2016_04_01.implementation.NetworkManager;
import java.util.List;
import java.util.Map;

/**
 * Type representing RecordSet.
 */
public interface RecordSet extends HasInner<RecordSetInner>, HasManager<NetworkManager> {
    /**
     * @return the aaaaRecords value.
     */
    List<AaaaRecord> aaaaRecords();

    /**
     * @return the aRecords value.
     */
    List<ARecord> aRecords();

    /**
     * @return the cnameRecord value.
     */
    CnameRecord cnameRecord();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the fqdn value.
     */
    String fqdn();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the metadata value.
     */
    Map<String, String> metadata();

    /**
     * @return the mxRecords value.
     */
    List<MxRecord> mxRecords();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the nsRecords value.
     */
    List<NsRecord> nsRecords();

    /**
     * @return the ptrRecords value.
     */
    List<PtrRecord> ptrRecords();

    /**
     * @return the soaRecord value.
     */
    SoaRecord soaRecord();

    /**
     * @return the srvRecords value.
     */
    List<SrvRecord> srvRecords();

    /**
     * @return the tTL value.
     */
    Long tTL();

    /**
     * @return the txtRecords value.
     */
    List<TxtRecord> txtRecords();

    /**
     * @return the type value.
     */
    String type();

}
