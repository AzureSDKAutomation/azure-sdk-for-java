// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.appservice.generated.fluent.models.WorkerAppRevisionInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of WorkerAppRevision. */
public interface WorkerAppRevision {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the createdTime property: Timestamp describing when the revision was created by controller.
     *
     * @return the createdTime value.
     */
    OffsetDateTime createdTime();

    /**
     * Gets the fqdn property: Fully qualified domain name of the revision.
     *
     * @return the fqdn value.
     */
    String fqdn();

    /**
     * Gets the template property: Worker App Revision Template with all possible settings and the defaults if user did
     * not provide them. The defaults are populated as they were at the creation time.
     *
     * @return the template value.
     */
    WorkerAppTemplate template();

    /**
     * Gets the active property: Boolean describing if the Revision is Active.
     *
     * @return the active value.
     */
    Boolean active();

    /**
     * Gets the replicas property: Number of pods currently running for this revision.
     *
     * @return the replicas value.
     */
    Integer replicas();

    /**
     * Gets the history property: Defines the events with respect to Provisioning and Scaling the Revision.
     *
     * @return the history value.
     */
    List<WorkerAppRevisionEvent> history();

    /**
     * Gets the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.WorkerAppRevisionInner object.
     *
     * @return the inner object.
     */
    WorkerAppRevisionInner innerModel();
}
