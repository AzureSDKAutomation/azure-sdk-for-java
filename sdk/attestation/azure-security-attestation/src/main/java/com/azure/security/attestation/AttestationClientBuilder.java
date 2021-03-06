// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.attestation;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.Configuration;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.security.attestation.implementation.AttestationClientImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** A builder for creating a new instance of the AttestationClient type. */
@ServiceClientBuilder(
        serviceClients = {
            PolicyClient.class,
            PolicyCertificatesClient.class,
            AttestationClient.class,
            SigningCertificatesClient.class,
            MetadataConfigurationClient.class,
            PolicyAsyncClient.class,
            PolicyCertificatesAsyncClient.class,
            AttestationAsyncClient.class,
            SigningCertificatesAsyncClient.class,
            MetadataConfigurationAsyncClient.class
        })
public final class AttestationClientBuilder {
    private static final String SDK_NAME = "name";

    private static final String SDK_VERSION = "version";

    private final Map<String, String> properties = new HashMap<>();

    public AttestationClientBuilder() {
        this.pipelinePolicies = new ArrayList<>();
    }

    /*
     * The attestation instance base URI, for example
     * https://mytenant.attest.azure.net.
     */
    private String instanceUrl;

    /**
     * Sets The attestation instance base URI, for example https://mytenant.attest.azure.net.
     *
     * @param instanceUrl the instanceUrl value.
     * @return the AttestationClientBuilder.
     */
    public AttestationClientBuilder instanceUrl(String instanceUrl) {
        this.instanceUrl = instanceUrl;
        return this;
    }

    /*
     * The HTTP pipeline to send requests through
     */
    private HttpPipeline pipeline;

    /**
     * Sets The HTTP pipeline to send requests through.
     *
     * @param pipeline the pipeline value.
     * @return the AttestationClientBuilder.
     */
    public AttestationClientBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /*
     * The serializer to serialize an object into a string
     */
    private SerializerAdapter serializerAdapter;

    /**
     * Sets The serializer to serialize an object into a string.
     *
     * @param serializerAdapter the serializerAdapter value.
     * @return the AttestationClientBuilder.
     */
    public AttestationClientBuilder serializerAdapter(SerializerAdapter serializerAdapter) {
        this.serializerAdapter = serializerAdapter;
        return this;
    }

    /*
     * The HTTP client used to send the request.
     */
    private HttpClient httpClient;

    /**
     * Sets The HTTP client used to send the request.
     *
     * @param httpClient the httpClient value.
     * @return the AttestationClientBuilder.
     */
    public AttestationClientBuilder httpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }

    /*
     * The configuration store that is used during construction of the service
     * client.
     */
    private Configuration configuration;

    /**
     * Sets The configuration store that is used during construction of the service client.
     *
     * @param configuration the configuration value.
     * @return the AttestationClientBuilder.
     */
    public AttestationClientBuilder configuration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    /*
     * The logging configuration for HTTP requests and responses.
     */
    private HttpLogOptions httpLogOptions;

    /**
     * Sets The logging configuration for HTTP requests and responses.
     *
     * @param httpLogOptions the httpLogOptions value.
     * @return the AttestationClientBuilder.
     */
    public AttestationClientBuilder httpLogOptions(HttpLogOptions httpLogOptions) {
        this.httpLogOptions = httpLogOptions;
        return this;
    }

    /*
     * The retry policy that will attempt to retry failed requests, if
     * applicable.
     */
    private RetryPolicy retryPolicy;

    /**
     * Sets The retry policy that will attempt to retry failed requests, if applicable.
     *
     * @param retryPolicy the retryPolicy value.
     * @return the AttestationClientBuilder.
     */
    public AttestationClientBuilder retryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    /*
     * The list of Http pipeline policies to add.
     */
    private List<HttpPipelinePolicy> pipelinePolicies;

    /**
     * Adds a custom Http pipeline policy.
     *
     * @param customPolicy The custom Http pipeline policy to add.
     * @return the AttestationClientBuilder.
     */
    public AttestationClientBuilder addPolicy(HttpPipelinePolicy customPolicy) {
        pipelinePolicies.add(customPolicy);
        return this;
    }

    /**
     * Builds an instance of AttestationClientImpl with the provided parameters.
     *
     * @return an instance of AttestationClientImpl.
     */
    private AttestationClientImpl buildInnerClient() {
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        if (serializerAdapter == null) {
            this.serializerAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        }
        AttestationClientImpl client = new AttestationClientImpl(pipeline, serializerAdapter, instanceUrl);
        return client;
    }

    private HttpPipeline createHttpPipeline() {
        Configuration buildConfiguration =
                (configuration == null) ? Configuration.getGlobalConfiguration() : configuration;
        if (httpLogOptions == null) {
            httpLogOptions = new HttpLogOptions();
        }
        List<HttpPipelinePolicy> policies = new ArrayList<>();
        String clientName = properties.getOrDefault(SDK_NAME, "UnknownName");
        String clientVersion = properties.getOrDefault(SDK_VERSION, "UnknownVersion");
        policies.add(
                new UserAgentPolicy(httpLogOptions.getApplicationId(), clientName, clientVersion, buildConfiguration));
        HttpPolicyProviders.addBeforeRetryPolicies(policies);
        policies.add(retryPolicy == null ? new RetryPolicy() : retryPolicy);
        policies.add(new CookiePolicy());
        policies.addAll(this.pipelinePolicies);
        HttpPolicyProviders.addAfterRetryPolicies(policies);
        policies.add(new HttpLoggingPolicy(httpLogOptions));
        HttpPipeline httpPipeline =
                new HttpPipelineBuilder()
                        .policies(policies.toArray(new HttpPipelinePolicy[0]))
                        .httpClient(httpClient)
                        .build();
        return httpPipeline;
    }

    /**
     * Builds an instance of PolicyAsyncClient async client.
     *
     * @return an instance of PolicyAsyncClient.
     */
    public PolicyAsyncClient buildPolicyAsyncClient() {
        return new PolicyAsyncClient(buildInnerClient().getPolicies());
    }

    /**
     * Builds an instance of PolicyCertificatesAsyncClient async client.
     *
     * @return an instance of PolicyCertificatesAsyncClient.
     */
    public PolicyCertificatesAsyncClient buildPolicyCertificatesAsyncClient() {
        return new PolicyCertificatesAsyncClient(buildInnerClient().getPolicyCertificates());
    }

    /**
     * Builds an instance of AttestationAsyncClient async client.
     *
     * @return an instance of AttestationAsyncClient.
     */
    public AttestationAsyncClient buildAttestationAsyncClient() {
        return new AttestationAsyncClient(buildInnerClient().getAttestations());
    }

    /**
     * Builds an instance of SigningCertificatesAsyncClient async client.
     *
     * @return an instance of SigningCertificatesAsyncClient.
     */
    public SigningCertificatesAsyncClient buildSigningCertificatesAsyncClient() {
        return new SigningCertificatesAsyncClient(buildInnerClient().getSigningCertificates());
    }

    /**
     * Builds an instance of MetadataConfigurationAsyncClient async client.
     *
     * @return an instance of MetadataConfigurationAsyncClient.
     */
    public MetadataConfigurationAsyncClient buildMetadataConfigurationAsyncClient() {
        return new MetadataConfigurationAsyncClient(buildInnerClient().getMetadataConfigurations());
    }

    /**
     * Builds an instance of PolicyClient sync client.
     *
     * @return an instance of PolicyClient.
     */
    public PolicyClient buildPolicyClient() {
        return new PolicyClient(buildInnerClient().getPolicies());
    }

    /**
     * Builds an instance of PolicyCertificatesClient sync client.
     *
     * @return an instance of PolicyCertificatesClient.
     */
    public PolicyCertificatesClient buildPolicyCertificatesClient() {
        return new PolicyCertificatesClient(buildInnerClient().getPolicyCertificates());
    }

    /**
     * Builds an instance of AttestationClient sync client.
     *
     * @return an instance of AttestationClient.
     */
    public AttestationClient buildAttestationClient() {
        return new AttestationClient(buildInnerClient().getAttestations());
    }

    /**
     * Builds an instance of SigningCertificatesClient sync client.
     *
     * @return an instance of SigningCertificatesClient.
     */
    public SigningCertificatesClient buildSigningCertificatesClient() {
        return new SigningCertificatesClient(buildInnerClient().getSigningCertificates());
    }

    /**
     * Builds an instance of MetadataConfigurationClient sync client.
     *
     * @return an instance of MetadataConfigurationClient.
     */
    public MetadataConfigurationClient buildMetadataConfigurationClient() {
        return new MetadataConfigurationClient(buildInnerClient().getMetadataConfigurations());
    }
}
