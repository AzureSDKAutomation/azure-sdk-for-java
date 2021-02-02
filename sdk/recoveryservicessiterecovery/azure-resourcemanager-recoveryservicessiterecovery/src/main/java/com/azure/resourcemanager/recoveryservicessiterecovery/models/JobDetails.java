// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/** Job details based on specific job type. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "instanceType",
    defaultImpl = JobDetails.class)
@JsonTypeName("JobDetails")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AsrJobDetails", value = AsrJobDetails.class),
    @JsonSubTypes.Type(name = "ExportJobDetails", value = ExportJobDetails.class),
    @JsonSubTypes.Type(name = "FailoverJobDetails", value = FailoverJobDetails.class),
    @JsonSubTypes.Type(name = "SwitchProtectionJobDetails", value = SwitchProtectionJobDetails.class),
    @JsonSubTypes.Type(name = "TestFailoverJobDetails", value = TestFailoverJobDetails.class)
})
@Fluent
public class JobDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(JobDetails.class);

    /*
     * The affected object properties like source server, source cloud, target
     * server, target cloud etc. based on the workflow object details.
     */
    @JsonProperty(value = "affectedObjectDetails")
    private Map<String, String> affectedObjectDetails;

    /**
     * Get the affectedObjectDetails property: The affected object properties like source server, source cloud, target
     * server, target cloud etc. based on the workflow object details.
     *
     * @return the affectedObjectDetails value.
     */
    public Map<String, String> affectedObjectDetails() {
        return this.affectedObjectDetails;
    }

    /**
     * Set the affectedObjectDetails property: The affected object properties like source server, source cloud, target
     * server, target cloud etc. based on the workflow object details.
     *
     * @param affectedObjectDetails the affectedObjectDetails value to set.
     * @return the JobDetails object itself.
     */
    public JobDetails withAffectedObjectDetails(Map<String, String> affectedObjectDetails) {
        this.affectedObjectDetails = affectedObjectDetails;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
