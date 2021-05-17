// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.testbase.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The summary of a test. */
@Fluent
public final class OSUpdateTestSummary {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OSUpdateTestSummary.class);

    /*
     * The operating system name. e.g. Windows 10 1809.
     */
    @JsonProperty(value = "osName")
    private String osName;

    /*
     * The name of the tested release (OS update).
     */
    @JsonProperty(value = "releaseName")
    private String releaseName;

    /*
     * The build version of the tested release (OS update)
     */
    @JsonProperty(value = "buildVersion")
    private String buildVersion;

    /*
     * The build revision of the tested release (OS update)
     */
    @JsonProperty(value = "buildRevision")
    private String buildRevision;

    /*
     * The release version date.
     */
    @JsonProperty(value = "releaseVersionDate")
    private OffsetDateTime releaseVersionDate;

    /*
     * The flighting ring, only for release of feature updates.
     */
    @JsonProperty(value = "flightingRing")
    private String flightingRing;

    /*
     * The execution status of the test.
     */
    @JsonProperty(value = "executionStatus")
    private ExecutionStatus executionStatus;

    /*
     * The grade of the test.
     */
    @JsonProperty(value = "grade")
    private Grade grade;

    /*
     * The run time of the test.
     */
    @JsonProperty(value = "testRunTime")
    private String testRunTime;

    /*
     * The test type of the package
     */
    @JsonProperty(value = "testType")
    private String testType;

    /**
     * Get the osName property: The operating system name. e.g. Windows 10 1809.
     *
     * @return the osName value.
     */
    public String osName() {
        return this.osName;
    }

    /**
     * Set the osName property: The operating system name. e.g. Windows 10 1809.
     *
     * @param osName the osName value to set.
     * @return the OSUpdateTestSummary object itself.
     */
    public OSUpdateTestSummary withOsName(String osName) {
        this.osName = osName;
        return this;
    }

    /**
     * Get the releaseName property: The name of the tested release (OS update).
     *
     * @return the releaseName value.
     */
    public String releaseName() {
        return this.releaseName;
    }

    /**
     * Set the releaseName property: The name of the tested release (OS update).
     *
     * @param releaseName the releaseName value to set.
     * @return the OSUpdateTestSummary object itself.
     */
    public OSUpdateTestSummary withReleaseName(String releaseName) {
        this.releaseName = releaseName;
        return this;
    }

    /**
     * Get the buildVersion property: The build version of the tested release (OS update).
     *
     * @return the buildVersion value.
     */
    public String buildVersion() {
        return this.buildVersion;
    }

    /**
     * Set the buildVersion property: The build version of the tested release (OS update).
     *
     * @param buildVersion the buildVersion value to set.
     * @return the OSUpdateTestSummary object itself.
     */
    public OSUpdateTestSummary withBuildVersion(String buildVersion) {
        this.buildVersion = buildVersion;
        return this;
    }

    /**
     * Get the buildRevision property: The build revision of the tested release (OS update).
     *
     * @return the buildRevision value.
     */
    public String buildRevision() {
        return this.buildRevision;
    }

    /**
     * Set the buildRevision property: The build revision of the tested release (OS update).
     *
     * @param buildRevision the buildRevision value to set.
     * @return the OSUpdateTestSummary object itself.
     */
    public OSUpdateTestSummary withBuildRevision(String buildRevision) {
        this.buildRevision = buildRevision;
        return this;
    }

    /**
     * Get the releaseVersionDate property: The release version date.
     *
     * @return the releaseVersionDate value.
     */
    public OffsetDateTime releaseVersionDate() {
        return this.releaseVersionDate;
    }

    /**
     * Set the releaseVersionDate property: The release version date.
     *
     * @param releaseVersionDate the releaseVersionDate value to set.
     * @return the OSUpdateTestSummary object itself.
     */
    public OSUpdateTestSummary withReleaseVersionDate(OffsetDateTime releaseVersionDate) {
        this.releaseVersionDate = releaseVersionDate;
        return this;
    }

    /**
     * Get the flightingRing property: The flighting ring, only for release of feature updates.
     *
     * @return the flightingRing value.
     */
    public String flightingRing() {
        return this.flightingRing;
    }

    /**
     * Set the flightingRing property: The flighting ring, only for release of feature updates.
     *
     * @param flightingRing the flightingRing value to set.
     * @return the OSUpdateTestSummary object itself.
     */
    public OSUpdateTestSummary withFlightingRing(String flightingRing) {
        this.flightingRing = flightingRing;
        return this;
    }

    /**
     * Get the executionStatus property: The execution status of the test.
     *
     * @return the executionStatus value.
     */
    public ExecutionStatus executionStatus() {
        return this.executionStatus;
    }

    /**
     * Set the executionStatus property: The execution status of the test.
     *
     * @param executionStatus the executionStatus value to set.
     * @return the OSUpdateTestSummary object itself.
     */
    public OSUpdateTestSummary withExecutionStatus(ExecutionStatus executionStatus) {
        this.executionStatus = executionStatus;
        return this;
    }

    /**
     * Get the grade property: The grade of the test.
     *
     * @return the grade value.
     */
    public Grade grade() {
        return this.grade;
    }

    /**
     * Set the grade property: The grade of the test.
     *
     * @param grade the grade value to set.
     * @return the OSUpdateTestSummary object itself.
     */
    public OSUpdateTestSummary withGrade(Grade grade) {
        this.grade = grade;
        return this;
    }

    /**
     * Get the testRunTime property: The run time of the test.
     *
     * @return the testRunTime value.
     */
    public String testRunTime() {
        return this.testRunTime;
    }

    /**
     * Set the testRunTime property: The run time of the test.
     *
     * @param testRunTime the testRunTime value to set.
     * @return the OSUpdateTestSummary object itself.
     */
    public OSUpdateTestSummary withTestRunTime(String testRunTime) {
        this.testRunTime = testRunTime;
        return this;
    }

    /**
     * Get the testType property: The test type of the package.
     *
     * @return the testType value.
     */
    public String testType() {
        return this.testType;
    }

    /**
     * Set the testType property: The test type of the package.
     *
     * @param testType the testType value to set.
     * @return the OSUpdateTestSummary object itself.
     */
    public OSUpdateTestSummary withTestType(String testType) {
        this.testType = testType;
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
