/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.postgresql.v2020_10_05_privatepreview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.postgresql.v2020_10_05_privatepreview.implementation.DBForPostgreSqlManager;
import com.microsoft.azure.management.postgresql.v2020_10_05_privatepreview.implementation.ServerGroupInner;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

/**
 * Type representing ServerGroup.
 */
public interface ServerGroup extends HasInner<ServerGroupInner>, HasManager<DBForPostgreSqlManager> {
    /**
     * @return the administratorLogin value.
     */
    String administratorLogin();

    /**
     * @return the backupRetentionDays value.
     */
    Integer backupRetentionDays();

    /**
     * @return the citusVersion value.
     */
    ServerCitusVersion citusVersion();

    /**
     * @return the earliestRestoreTime value.
     */
    DateTime earliestRestoreTime();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the isMx value.
     */
    Boolean isMx();

    /**
     * @return the isZfs value.
     */
    Boolean isZfs();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the resourceProviderType value.
     */
    ResourceProviderType resourceProviderType();

    /**
     * @return the serverRoleGroups value.
     */
    List<ServerRoleGroup> serverRoleGroups();

    /**
     * @return the state value.
     */
    ServerState state();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the version value.
     */
    ServerVersion version();

    /**
     * @return the vnetInjArgs value.
     */
    VnetInjArgs vnetInjArgs();

}
