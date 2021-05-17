// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.testbase.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The summary of a Test Analysis Result. */
@Fluent
public final class TestResultAnalysisSummary {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TestResultAnalysisSummary.class);

    /*
     * Metric name
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The analysis status.
     */
    @JsonProperty(value = "analysisStatus")
    private AnalysisStatus analysisStatus;

    /*
     * The grade of the test result.
     */
    @JsonProperty(value = "grade")
    private Grade grade;

    /**
     * Get the name property: Metric name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Metric name.
     *
     * @param name the name value to set.
     * @return the TestResultAnalysisSummary object itself.
     */
    public TestResultAnalysisSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the analysisStatus property: The analysis status.
     *
     * @return the analysisStatus value.
     */
    public AnalysisStatus analysisStatus() {
        return this.analysisStatus;
    }

    /**
     * Set the analysisStatus property: The analysis status.
     *
     * @param analysisStatus the analysisStatus value to set.
     * @return the TestResultAnalysisSummary object itself.
     */
    public TestResultAnalysisSummary withAnalysisStatus(AnalysisStatus analysisStatus) {
        this.analysisStatus = analysisStatus;
        return this;
    }

    /**
     * Get the grade property: The grade of the test result.
     *
     * @return the grade value.
     */
    public Grade grade() {
        return this.grade;
    }

    /**
     * Set the grade property: The grade of the test result.
     *
     * @param grade the grade value to set.
     * @return the TestResultAnalysisSummary object itself.
     */
    public TestResultAnalysisSummary withGrade(Grade grade) {
        this.grade = grade;
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
