// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Execute SSIS package activity. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("ExecuteSSISPackage")
@JsonFlatten
@Fluent
public class ExecuteSsisPackageActivity extends ExecutionActivity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExecuteSsisPackageActivity.class);

    /*
     * SSIS package location.
     */
    @JsonProperty(value = "typeProperties.packageLocation", required = true)
    private SsisPackageLocation packageLocation;

    /*
     * Specifies the runtime to execute SSIS package. The value should be "x86"
     * or "x64". Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.runtime")
    private Object runtime;

    /*
     * The logging level of SSIS package execution. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "typeProperties.loggingLevel")
    private Object loggingLevel;

    /*
     * The environment path to execute the SSIS package. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.environmentPath")
    private Object environmentPath;

    /*
     * The package execution credential.
     */
    @JsonProperty(value = "typeProperties.executionCredential")
    private SsisExecutionCredential executionCredential;

    /*
     * The integration runtime reference.
     */
    @JsonProperty(value = "typeProperties.connectVia", required = true)
    private IntegrationRuntimeReference connectVia;

    /*
     * The project level parameters to execute the SSIS package.
     */
    @JsonProperty(value = "typeProperties.projectParameters")
    private Map<String, SsisExecutionParameter> projectParameters;

    /*
     * The package level parameters to execute the SSIS package.
     */
    @JsonProperty(value = "typeProperties.packageParameters")
    private Map<String, SsisExecutionParameter> packageParameters;

    /*
     * The project level connection managers to execute the SSIS package.
     */
    @JsonProperty(value = "typeProperties.projectConnectionManagers")
    private Map<String, Map<String, SsisExecutionParameter>> projectConnectionManagers;

    /*
     * The package level connection managers to execute the SSIS package.
     */
    @JsonProperty(value = "typeProperties.packageConnectionManagers")
    private Map<String, Map<String, SsisExecutionParameter>> packageConnectionManagers;

    /*
     * The property overrides to execute the SSIS package.
     */
    @JsonProperty(value = "typeProperties.propertyOverrides")
    private Map<String, SsisPropertyOverride> propertyOverrides;

    /*
     * SSIS package execution log location.
     */
    @JsonProperty(value = "typeProperties.logLocation")
    private SsisLogLocation logLocation;

    /**
     * Get the packageLocation property: SSIS package location.
     *
     * @return the packageLocation value.
     */
    public SsisPackageLocation packageLocation() {
        return this.packageLocation;
    }

    /**
     * Set the packageLocation property: SSIS package location.
     *
     * @param packageLocation the packageLocation value to set.
     * @return the ExecuteSsisPackageActivity object itself.
     */
    public ExecuteSsisPackageActivity withPackageLocation(SsisPackageLocation packageLocation) {
        this.packageLocation = packageLocation;
        return this;
    }

    /**
     * Get the runtime property: Specifies the runtime to execute SSIS package. The value should be "x86" or "x64".
     * Type: string (or Expression with resultType string).
     *
     * @return the runtime value.
     */
    public Object runtime() {
        return this.runtime;
    }

    /**
     * Set the runtime property: Specifies the runtime to execute SSIS package. The value should be "x86" or "x64".
     * Type: string (or Expression with resultType string).
     *
     * @param runtime the runtime value to set.
     * @return the ExecuteSsisPackageActivity object itself.
     */
    public ExecuteSsisPackageActivity withRuntime(Object runtime) {
        this.runtime = runtime;
        return this;
    }

    /**
     * Get the loggingLevel property: The logging level of SSIS package execution. Type: string (or Expression with
     * resultType string).
     *
     * @return the loggingLevel value.
     */
    public Object loggingLevel() {
        return this.loggingLevel;
    }

    /**
     * Set the loggingLevel property: The logging level of SSIS package execution. Type: string (or Expression with
     * resultType string).
     *
     * @param loggingLevel the loggingLevel value to set.
     * @return the ExecuteSsisPackageActivity object itself.
     */
    public ExecuteSsisPackageActivity withLoggingLevel(Object loggingLevel) {
        this.loggingLevel = loggingLevel;
        return this;
    }

    /**
     * Get the environmentPath property: The environment path to execute the SSIS package. Type: string (or Expression
     * with resultType string).
     *
     * @return the environmentPath value.
     */
    public Object environmentPath() {
        return this.environmentPath;
    }

    /**
     * Set the environmentPath property: The environment path to execute the SSIS package. Type: string (or Expression
     * with resultType string).
     *
     * @param environmentPath the environmentPath value to set.
     * @return the ExecuteSsisPackageActivity object itself.
     */
    public ExecuteSsisPackageActivity withEnvironmentPath(Object environmentPath) {
        this.environmentPath = environmentPath;
        return this;
    }

    /**
     * Get the executionCredential property: The package execution credential.
     *
     * @return the executionCredential value.
     */
    public SsisExecutionCredential executionCredential() {
        return this.executionCredential;
    }

    /**
     * Set the executionCredential property: The package execution credential.
     *
     * @param executionCredential the executionCredential value to set.
     * @return the ExecuteSsisPackageActivity object itself.
     */
    public ExecuteSsisPackageActivity withExecutionCredential(SsisExecutionCredential executionCredential) {
        this.executionCredential = executionCredential;
        return this;
    }

    /**
     * Get the connectVia property: The integration runtime reference.
     *
     * @return the connectVia value.
     */
    public IntegrationRuntimeReference connectVia() {
        return this.connectVia;
    }

    /**
     * Set the connectVia property: The integration runtime reference.
     *
     * @param connectVia the connectVia value to set.
     * @return the ExecuteSsisPackageActivity object itself.
     */
    public ExecuteSsisPackageActivity withConnectVia(IntegrationRuntimeReference connectVia) {
        this.connectVia = connectVia;
        return this;
    }

    /**
     * Get the projectParameters property: The project level parameters to execute the SSIS package.
     *
     * @return the projectParameters value.
     */
    public Map<String, SsisExecutionParameter> projectParameters() {
        return this.projectParameters;
    }

    /**
     * Set the projectParameters property: The project level parameters to execute the SSIS package.
     *
     * @param projectParameters the projectParameters value to set.
     * @return the ExecuteSsisPackageActivity object itself.
     */
    public ExecuteSsisPackageActivity withProjectParameters(Map<String, SsisExecutionParameter> projectParameters) {
        this.projectParameters = projectParameters;
        return this;
    }

    /**
     * Get the packageParameters property: The package level parameters to execute the SSIS package.
     *
     * @return the packageParameters value.
     */
    public Map<String, SsisExecutionParameter> packageParameters() {
        return this.packageParameters;
    }

    /**
     * Set the packageParameters property: The package level parameters to execute the SSIS package.
     *
     * @param packageParameters the packageParameters value to set.
     * @return the ExecuteSsisPackageActivity object itself.
     */
    public ExecuteSsisPackageActivity withPackageParameters(Map<String, SsisExecutionParameter> packageParameters) {
        this.packageParameters = packageParameters;
        return this;
    }

    /**
     * Get the projectConnectionManagers property: The project level connection managers to execute the SSIS package.
     *
     * @return the projectConnectionManagers value.
     */
    public Map<String, Map<String, SsisExecutionParameter>> projectConnectionManagers() {
        return this.projectConnectionManagers;
    }

    /**
     * Set the projectConnectionManagers property: The project level connection managers to execute the SSIS package.
     *
     * @param projectConnectionManagers the projectConnectionManagers value to set.
     * @return the ExecuteSsisPackageActivity object itself.
     */
    public ExecuteSsisPackageActivity withProjectConnectionManagers(
        Map<String, Map<String, SsisExecutionParameter>> projectConnectionManagers) {
        this.projectConnectionManagers = projectConnectionManagers;
        return this;
    }

    /**
     * Get the packageConnectionManagers property: The package level connection managers to execute the SSIS package.
     *
     * @return the packageConnectionManagers value.
     */
    public Map<String, Map<String, SsisExecutionParameter>> packageConnectionManagers() {
        return this.packageConnectionManagers;
    }

    /**
     * Set the packageConnectionManagers property: The package level connection managers to execute the SSIS package.
     *
     * @param packageConnectionManagers the packageConnectionManagers value to set.
     * @return the ExecuteSsisPackageActivity object itself.
     */
    public ExecuteSsisPackageActivity withPackageConnectionManagers(
        Map<String, Map<String, SsisExecutionParameter>> packageConnectionManagers) {
        this.packageConnectionManagers = packageConnectionManagers;
        return this;
    }

    /**
     * Get the propertyOverrides property: The property overrides to execute the SSIS package.
     *
     * @return the propertyOverrides value.
     */
    public Map<String, SsisPropertyOverride> propertyOverrides() {
        return this.propertyOverrides;
    }

    /**
     * Set the propertyOverrides property: The property overrides to execute the SSIS package.
     *
     * @param propertyOverrides the propertyOverrides value to set.
     * @return the ExecuteSsisPackageActivity object itself.
     */
    public ExecuteSsisPackageActivity withPropertyOverrides(Map<String, SsisPropertyOverride> propertyOverrides) {
        this.propertyOverrides = propertyOverrides;
        return this;
    }

    /**
     * Get the logLocation property: SSIS package execution log location.
     *
     * @return the logLocation value.
     */
    public SsisLogLocation logLocation() {
        return this.logLocation;
    }

    /**
     * Set the logLocation property: SSIS package execution log location.
     *
     * @param logLocation the logLocation value to set.
     * @return the ExecuteSsisPackageActivity object itself.
     */
    public ExecuteSsisPackageActivity withLogLocation(SsisLogLocation logLocation) {
        this.logLocation = logLocation;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExecuteSsisPackageActivity withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExecuteSsisPackageActivity withPolicy(ActivityPolicy policy) {
        super.withPolicy(policy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExecuteSsisPackageActivity withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExecuteSsisPackageActivity withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExecuteSsisPackageActivity withDependsOn(List<ActivityDependency> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExecuteSsisPackageActivity withUserProperties(List<UserProperty> userProperties) {
        super.withUserProperties(userProperties);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (packageLocation() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property packageLocation in model ExecuteSsisPackageActivity"));
        } else {
            packageLocation().validate();
        }
        if (executionCredential() != null) {
            executionCredential().validate();
        }
        if (connectVia() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property connectVia in model ExecuteSsisPackageActivity"));
        } else {
            connectVia().validate();
        }
        if (projectParameters() != null) {
            projectParameters()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
        if (packageParameters() != null) {
            packageParameters()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
        if (projectConnectionManagers() != null) {
            projectConnectionManagers()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e
                                .values()
                                .forEach(
                                    e1 -> {
                                        if (e1 != null) {
                                            e1.validate();
                                        }
                                    });
                        }
                    });
        }
        if (packageConnectionManagers() != null) {
            packageConnectionManagers()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e
                                .values()
                                .forEach(
                                    e1 -> {
                                        if (e1 != null) {
                                            e1.validate();
                                        }
                                    });
                        }
                    });
        }
        if (propertyOverrides() != null) {
            propertyOverrides()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
        if (logLocation() != null) {
            logLocation().validate();
        }
    }
}
