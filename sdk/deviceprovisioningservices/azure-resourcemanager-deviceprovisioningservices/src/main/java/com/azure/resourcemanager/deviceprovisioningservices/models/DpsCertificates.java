// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceprovisioningservices.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import java.time.OffsetDateTime;

/** Resource collection API of DpsCertificates. */
public interface DpsCertificates {
    /**
     * Get the certificate from the provisioning service.
     *
     * @param certificateName Name of the certificate to retrieve.
     * @param resourceGroupName Resource group identifier.
     * @param provisioningServiceName Name of the provisioning service the certificate is associated with.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the certificate from the provisioning service.
     */
    CertificateResponse get(String certificateName, String resourceGroupName, String provisioningServiceName);

    /**
     * Get the certificate from the provisioning service.
     *
     * @param certificateName Name of the certificate to retrieve.
     * @param resourceGroupName Resource group identifier.
     * @param provisioningServiceName Name of the provisioning service the certificate is associated with.
     * @param ifMatch ETag of the certificate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the certificate from the provisioning service.
     */
    Response<CertificateResponse> getWithResponse(
        String certificateName,
        String resourceGroupName,
        String provisioningServiceName,
        String ifMatch,
        Context context);

    /**
     * Deletes the specified certificate associated with the Provisioning Service.
     *
     * @param resourceGroupName Resource group identifier.
     * @param ifMatch ETag of the certificate.
     * @param provisioningServiceName The name of the provisioning service.
     * @param certificateName This is a mandatory field, and is the logical name of the certificate that the
     *     provisioning service will access by.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String ifMatch, String provisioningServiceName, String certificateName);

    /**
     * Deletes the specified certificate associated with the Provisioning Service.
     *
     * @param resourceGroupName Resource group identifier.
     * @param ifMatch ETag of the certificate.
     * @param provisioningServiceName The name of the provisioning service.
     * @param certificateName This is a mandatory field, and is the logical name of the certificate that the
     *     provisioning service will access by.
     * @param certificateName1 This is optional, and it is the Common Name of the certificate.
     * @param certificateRawBytes Raw data within the certificate.
     * @param certificateIsVerified Indicates if certificate has been verified by owner of the private key.
     * @param certificatePurpose A description that mentions the purpose of the certificate.
     * @param certificateCreated Time the certificate is created.
     * @param certificateLastUpdated Time the certificate is last updated.
     * @param certificateHasPrivateKey Indicates if the certificate contains a private key.
     * @param certificateNonce Random number generated to indicate Proof of Possession.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName,
        String ifMatch,
        String provisioningServiceName,
        String certificateName,
        String certificateName1,
        byte[] certificateRawBytes,
        Boolean certificateIsVerified,
        CertificatePurpose certificatePurpose,
        OffsetDateTime certificateCreated,
        OffsetDateTime certificateLastUpdated,
        Boolean certificateHasPrivateKey,
        String certificateNonce,
        Context context);

    /**
     * Get all the certificates tied to the provisioning service.
     *
     * @param resourceGroupName Name of resource group.
     * @param provisioningServiceName Name of provisioning service to retrieve certificates for.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the certificates tied to the provisioning service.
     */
    CertificateListDescription list(String resourceGroupName, String provisioningServiceName);

    /**
     * Get all the certificates tied to the provisioning service.
     *
     * @param resourceGroupName Name of resource group.
     * @param provisioningServiceName Name of provisioning service to retrieve certificates for.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the certificates tied to the provisioning service.
     */
    Response<CertificateListDescription> listWithResponse(
        String resourceGroupName, String provisioningServiceName, Context context);

    /**
     * Generate verification code for Proof of Possession.
     *
     * @param certificateName The mandatory logical name of the certificate, that the provisioning service uses to
     *     access.
     * @param ifMatch ETag of the certificate. This is required to update an existing certificate, and ignored while
     *     creating a brand new certificate.
     * @param resourceGroupName name of resource group.
     * @param provisioningServiceName Name of provisioning service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of the response of the verification code.
     */
    VerificationCodeResponse generateVerificationCode(
        String certificateName, String ifMatch, String resourceGroupName, String provisioningServiceName);

    /**
     * Generate verification code for Proof of Possession.
     *
     * @param certificateName The mandatory logical name of the certificate, that the provisioning service uses to
     *     access.
     * @param ifMatch ETag of the certificate. This is required to update an existing certificate, and ignored while
     *     creating a brand new certificate.
     * @param resourceGroupName name of resource group.
     * @param provisioningServiceName Name of provisioning service.
     * @param certificateName1 Common Name for the certificate.
     * @param certificateRawBytes Raw data of certificate.
     * @param certificateIsVerified Indicates if the certificate has been verified by owner of the private key.
     * @param certificatePurpose Description mentioning the purpose of the certificate.
     * @param certificateCreated Certificate creation time.
     * @param certificateLastUpdated Certificate last updated time.
     * @param certificateHasPrivateKey Indicates if the certificate contains private key.
     * @param certificateNonce Random number generated to indicate Proof of Possession.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of the response of the verification code.
     */
    Response<VerificationCodeResponse> generateVerificationCodeWithResponse(
        String certificateName,
        String ifMatch,
        String resourceGroupName,
        String provisioningServiceName,
        String certificateName1,
        byte[] certificateRawBytes,
        Boolean certificateIsVerified,
        CertificatePurpose certificatePurpose,
        OffsetDateTime certificateCreated,
        OffsetDateTime certificateLastUpdated,
        Boolean certificateHasPrivateKey,
        String certificateNonce,
        Context context);

    /**
     * Verifies the certificate's private key possession by providing the leaf cert issued by the verifying pre uploaded
     * certificate.
     *
     * @param certificateName The mandatory logical name of the certificate, that the provisioning service uses to
     *     access.
     * @param ifMatch ETag of the certificate.
     * @param resourceGroupName Resource group name.
     * @param provisioningServiceName Provisioning service name.
     * @param request The JSON-serialized leaf certificate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the X509 Certificate.
     */
    CertificateResponse verifyCertificate(
        String certificateName,
        String ifMatch,
        String resourceGroupName,
        String provisioningServiceName,
        VerificationCodeRequest request);

    /**
     * Verifies the certificate's private key possession by providing the leaf cert issued by the verifying pre uploaded
     * certificate.
     *
     * @param certificateName The mandatory logical name of the certificate, that the provisioning service uses to
     *     access.
     * @param ifMatch ETag of the certificate.
     * @param resourceGroupName Resource group name.
     * @param provisioningServiceName Provisioning service name.
     * @param request The JSON-serialized leaf certificate.
     * @param certificateName1 Common Name for the certificate.
     * @param certificateRawBytes Raw data of certificate.
     * @param certificateIsVerified Indicates if the certificate has been verified by owner of the private key.
     * @param certificatePurpose Describe the purpose of the certificate.
     * @param certificateCreated Certificate creation time.
     * @param certificateLastUpdated Certificate last updated time.
     * @param certificateHasPrivateKey Indicates if the certificate contains private key.
     * @param certificateNonce Random number generated to indicate Proof of Possession.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the X509 Certificate.
     */
    Response<CertificateResponse> verifyCertificateWithResponse(
        String certificateName,
        String ifMatch,
        String resourceGroupName,
        String provisioningServiceName,
        VerificationCodeRequest request,
        String certificateName1,
        byte[] certificateRawBytes,
        Boolean certificateIsVerified,
        CertificatePurpose certificatePurpose,
        OffsetDateTime certificateCreated,
        OffsetDateTime certificateLastUpdated,
        Boolean certificateHasPrivateKey,
        String certificateNonce,
        Context context);

    /**
     * Get the certificate from the provisioning service.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the certificate from the provisioning service.
     */
    CertificateResponse getById(String id);

    /**
     * Get the certificate from the provisioning service.
     *
     * @param id the resource ID.
     * @param ifMatch ETag of the certificate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the certificate from the provisioning service.
     */
    Response<CertificateResponse> getByIdWithResponse(String id, String ifMatch, Context context);

    /**
     * Deletes the specified certificate associated with the Provisioning Service.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the specified certificate associated with the Provisioning Service.
     *
     * @param id the resource ID.
     * @param ifMatch ETag of the certificate.
     * @param certificateName1 This is optional, and it is the Common Name of the certificate.
     * @param certificateRawBytes Raw data within the certificate.
     * @param certificateIsVerified Indicates if certificate has been verified by owner of the private key.
     * @param certificatePurpose A description that mentions the purpose of the certificate.
     * @param certificateCreated Time the certificate is created.
     * @param certificateLastUpdated Time the certificate is last updated.
     * @param certificateHasPrivateKey Indicates if the certificate contains a private key.
     * @param certificateNonce Random number generated to indicate Proof of Possession.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteByIdWithResponse(
        String id,
        String ifMatch,
        String certificateName1,
        byte[] certificateRawBytes,
        Boolean certificateIsVerified,
        CertificatePurpose certificatePurpose,
        OffsetDateTime certificateCreated,
        OffsetDateTime certificateLastUpdated,
        Boolean certificateHasPrivateKey,
        String certificateNonce,
        Context context);

    /**
     * Begins definition for a new CertificateResponse resource.
     *
     * @param name resource name.
     * @return the first stage of the new CertificateResponse definition.
     */
    CertificateResponse.DefinitionStages.Blank define(String name);
}
