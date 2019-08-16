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


package com.mastercard.developer.mdes_digital_enablement_client.api;

import com.mastercard.developer.mdes_digital_enablement_client.ApiException;
import com.mastercard.developer.mdes_digital_enablement_client.model.ErrorsResponse;
import com.mastercard.developer.mdes_digital_enablement_client.model.NotifyTokenUpdatedRequestSchema;
import com.mastercard.developer.mdes_digital_enablement_client.model.NotifyTokenUpdatedResponseSchema;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NotifyTokenUpdatedApi
 */
@Ignore
public class NotifyTokenUpdatedApiTest {

    private final NotifyTokenUpdatedApi api = new NotifyTokenUpdatedApi();

    
    /**
     * Outbound API used by MDES to notify the Token Requestor of significant Token updates, such as when the Token is activated, suspended, unsuspended or deleted; or when information about the Token or its product configuration has changed.
     *
     * This API is used by MDES to notify the Token Requestor of significant Token updates. Typical notification scenarios include  &lt;br&gt; &lt;br&gt;  1. Informing the merchant a token is active 2. Informing the merchant a token has been suspended by the Issuer 3. Informing the merchant a token has been unsuspended by the Issuer 4. Informing the merchant a token has been deleted by the Issuer 5. Informing the merchant of a product configuration change (such as a change in Card Art) 6. Informing the merchant of underlying changes to the FPAN metadata associated to the token&lt;br&gt;   __Connection Security__&lt;br&gt; Mastercard will connect via TLS protocol and verify the server certificate before establishing a connection to the client endpoint. During this handshake, the client server can request TLS client authentication. Mastercard will present a client certificate which identifies as “ws.mastercard.com” This client certificate is issued by the Entrust L1K certificate and should be available in most trust stores.  &lt;br&gt;&lt;br&gt; __Conditional Objects__&lt;br&gt; The contents of the notifyTokenUpdated API will vary depending which of the above scneraios triggered the notification. &lt;br&gt;   1. *productConfig* - Provided when Product Configuration has changed (e.g. such as card art).      2. *tokenInfo* - Provided when either the details of the token or associated FPAN have changed (such as token or PAN expiry).      The optional objects will always contain a minimum set of data which be returned regardless of whether or not updates have been made. These fields are denoted as required fields.&lt;br&gt;     
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void notifyTokenUpdateForTokenStateChangeTest() throws ApiException {
        NotifyTokenUpdatedRequestSchema notifyTokenUpdatedRequestSchema = null;
        NotifyTokenUpdatedResponseSchema response = api.notifyTokenUpdateForTokenStateChange(notifyTokenUpdatedRequestSchema);

        // TODO: test validations
    }
    
}
