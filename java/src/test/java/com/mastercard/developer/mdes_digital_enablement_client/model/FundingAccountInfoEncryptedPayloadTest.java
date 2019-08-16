/*
 * MDES for Merchants
 * The MDES APIs are designed as RPC style stateless web services where each API endpoint represents an operation to be performed.  All request and response payloads are sent in the JSON (JavaScript Object Notation) data-interchange format. Each endpoint in the API specifies the HTTP Method used to access it. All strings in request and response objects are to be UTF-8 encoded.  Each API URI includes the major and minor version of API that it conforms to.  This will allow multiple concurrent versions of the API to be deployed simultaneously. <br> __Authentication__ Mastercard uses OAuth 1.0a with body hash extension for authenticating the API clients. This requires every request that you send to  Mastercard to be signed with an RSA private key. A private-public RSA key pair must be generated consisting of: <br> 1 . A private key for the OAuth signature for API requests. It is recommended to keep the private key in a password-protected or hardware keystore. <br> 2. A public key is shared with Mastercard during the project setup process through either a certificate signing request (CSR) or the API Key Generator. Mastercard will use the public key to verify the OAuth signature that is provided on every API call.<br>  An OAUTH1.0a signer library is available on [GitHub](https://github.com/Mastercard/oauth1-signer-java) <br>  __Encryption__<br>  All communications between Issuer web service and the Mastercard gateway is encrypted using TLS. <br> __Additional Encryption of Sensitive Data__ In addition to the OAuth authentication, when using MDES Digital Enablement Service, any PCI sensitive and all account holder Personally Identifiable Information (PII) data must be encrypted. This requirement applies to the API fields containing encryptedData. Sensitive data is encrypted using a symmetric session (one-time-use) key. The symmetric session key is then wrapped with an RSA Public Key supplied by Mastercard during API setup phase (the Customer Encryption Key). <br>  Java Client Encryption Library available on [GitHub](https://github.com/Mastercard/client-encryption-java) 
 *
 * The version of the OpenAPI document: 1.2.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mastercard.developer.mdes_digital_enablement_client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mastercard.developer.mdes_digital_enablement_client.model.FundingAccountData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for FundingAccountInfoEncryptedPayload
 */
public class FundingAccountInfoEncryptedPayloadTest {
    private final FundingAccountInfoEncryptedPayload model = new FundingAccountInfoEncryptedPayload();

    /**
     * Model tests for FundingAccountInfoEncryptedPayload
     */
    @Test
    public void testFundingAccountInfoEncryptedPayload() {
        // TODO: test FundingAccountInfoEncryptedPayload
    }

    /**
     * Test the property 'publicKeyFingerprint'
     */
    @Test
    public void publicKeyFingerprintTest() {
        // TODO: test publicKeyFingerprint
    }

    /**
     * Test the property 'encryptedKey'
     */
    @Test
    public void encryptedKeyTest() {
        // TODO: test encryptedKey
    }

    /**
     * Test the property 'oaepHashingAlgorithm'
     */
    @Test
    public void oaepHashingAlgorithmTest() {
        // TODO: test oaepHashingAlgorithm
    }

    /**
     * Test the property 'iv'
     */
    @Test
    public void ivTest() {
        // TODO: test iv
    }

    /**
     * Test the property 'encryptedData'
     */
    @Test
    public void encryptedDataTest() {
        // TODO: test encryptedData
    }

}
