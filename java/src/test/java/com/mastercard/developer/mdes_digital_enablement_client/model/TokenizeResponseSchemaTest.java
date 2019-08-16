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
import com.mastercard.developer.mdes_digital_enablement_client.model.AuthenticationMethods;
import com.mastercard.developer.mdes_digital_enablement_client.model.Error;
import com.mastercard.developer.mdes_digital_enablement_client.model.ProductConfig;
import com.mastercard.developer.mdes_digital_enablement_client.model.TokenDetail;
import com.mastercard.developer.mdes_digital_enablement_client.model.TokenInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for TokenizeResponseSchema
 */
public class TokenizeResponseSchemaTest {
    private final TokenizeResponseSchema model = new TokenizeResponseSchema();

    /**
     * Model tests for TokenizeResponseSchema
     */
    @Test
    public void testTokenizeResponseSchema() {
        // TODO: test TokenizeResponseSchema
    }

    /**
     * Test the property 'responseHost'
     */
    @Test
    public void responseHostTest() {
        // TODO: test responseHost
    }

    /**
     * Test the property 'responseId'
     */
    @Test
    public void responseIdTest() {
        // TODO: test responseId
    }

    /**
     * Test the property 'decision'
     */
    @Test
    public void decisionTest() {
        // TODO: test decision
    }

    /**
     * Test the property 'authenticationMethods'
     */
    @Test
    public void authenticationMethodsTest() {
        // TODO: test authenticationMethods
    }

    /**
     * Test the property 'tokenUniqueReference'
     */
    @Test
    public void tokenUniqueReferenceTest() {
        // TODO: test tokenUniqueReference
    }

    /**
     * Test the property 'panUniqueReference'
     */
    @Test
    public void panUniqueReferenceTest() {
        // TODO: test panUniqueReference
    }

    /**
     * Test the property 'productConfig'
     */
    @Test
    public void productConfigTest() {
        // TODO: test productConfig
    }

    /**
     * Test the property 'tokenInfo'
     */
    @Test
    public void tokenInfoTest() {
        // TODO: test tokenInfo
    }

    /**
     * Test the property 'tokenDetail'
     */
    @Test
    public void tokenDetailTest() {
        // TODO: test tokenDetail
    }

    /**
     * Test the property 'errorCode'
     */
    @Test
    public void errorCodeTest() {
        // TODO: test errorCode
    }

    /**
     * Test the property 'errorDescription'
     */
    @Test
    public void errorDescriptionTest() {
        // TODO: test errorDescription
    }

    /**
     * Test the property 'errors'
     */
    @Test
    public void errorsTest() {
        // TODO: test errors
    }

}
