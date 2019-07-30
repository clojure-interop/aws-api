(ns com.amazonaws.services.certificatemanager.AWSCertificateManager
  "Interface for accessing ACM.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSCertificateManager instead.


  AWS Certificate Manager

  Welcome to the AWS Certificate Manager (ACM) API documentation.


  You can use ACM to manage SSL/TLS certificates for your AWS-based websites and applications. For general information
  about using ACM, see the  AWS Certificate Manager User
  Guide ."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.certificatemanager AWSCertificateManager]))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AWSCertificateManager this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn waiters
  "returns: `com.amazonaws.services.certificatemanager.waiters.AWSCertificateManagerWaiters`"
  (^com.amazonaws.services.certificatemanager.waiters.AWSCertificateManagerWaiters [^AWSCertificateManager this]
    (-> this (.waiters))))

(defn list-certificates
  "Retrieves a list of certificate ARNs and domain names. You can request that only certificates that match a
   specific status be listed. You can also filter by specific attributes of the certificate.

  list-certificates-request - `com.amazonaws.services.certificatemanager.model.ListCertificatesRequest`

  returns: Result of the ListCertificates operation returned by the service. - `com.amazonaws.services.certificatemanager.model.ListCertificatesResult`

  throws: com.amazonaws.services.certificatemanager.model.InvalidArgsException - One or more of of request parameters specified is not valid."
  (^com.amazonaws.services.certificatemanager.model.ListCertificatesResult [^AWSCertificateManager this ^com.amazonaws.services.certificatemanager.model.ListCertificatesRequest list-certificates-request]
    (-> this (.listCertificates list-certificates-request))))

(defn renew-certificate
  "Renews an eligable ACM certificate. At this time, only exported private certificates can be renewed with this
   operation. In order to renew your ACM PCA certificates with ACM, you must first grant the ACM service principal
   permission to do so. For more information, see Testing Managed Renewal in the
   ACM User Guide.

  renew-certificate-request - `com.amazonaws.services.certificatemanager.model.RenewCertificateRequest`

  returns: Result of the RenewCertificate operation returned by the service. - `com.amazonaws.services.certificatemanager.model.RenewCertificateResult`

  throws: com.amazonaws.services.certificatemanager.model.ResourceNotFoundException - The specified certificate cannot be found in the caller's account or the caller's account cannot be found."
  (^com.amazonaws.services.certificatemanager.model.RenewCertificateResult [^AWSCertificateManager this ^com.amazonaws.services.certificatemanager.model.RenewCertificateRequest renew-certificate-request]
    (-> this (.renewCertificate renew-certificate-request))))

(defn import-certificate
  "Imports a certificate into AWS Certificate Manager (ACM) to use with services that are integrated with ACM. Note
   that integrated services allow
   only certificate types and keys they support to be associated with their resources. Further, their support
   differs depending on whether the certificate is imported into IAM or into ACM. For more information, see the
   documentation for each service. For more information about importing certificates into ACM, see Importing Certificates in the
   AWS Certificate Manager User Guide.



   ACM does not provide managed
   renewal for certificates that you import.



   Note the following guidelines when importing third party certificates:




   You must enter the private key that matches the certificate you are importing.




   The private key must be unencrypted. You cannot import a private key that is protected by a password or a
   passphrase.




   If the certificate you are importing is not self-signed, you must enter its certificate chain.




   If a certificate chain is included, the issuer must be the subject of one of the certificates in the chain.




   The certificate, private key, and certificate chain must be PEM-encoded.




   The current time must be between the Not Before and Not After certificate fields.




   The Issuer field must not be empty.




   The OCSP authority URL, if present, must not exceed 1000 characters.




   To import a new certificate, omit the CertificateArn argument. Include this argument only when you
   want to replace a previously imported certificate.




   When you import a certificate by using the CLI, you must specify the certificate, the certificate chain, and the
   private key by their file names preceded by file://. For example, you can specify a certificate
   saved in the C:\\temp folder as file://C:\\temp\\certificate_to_import.pem. If you are
   making an HTTP or HTTPS Query request, include these arguments as BLOBs.




   When you import a certificate by using an SDK, you must specify the certificate, the certificate chain, and the
   private key files in the manner required by the programming language you're using.




   This operation returns the Amazon Resource Name (ARN)
   of the imported certificate.

  import-certificate-request - `com.amazonaws.services.certificatemanager.model.ImportCertificateRequest`

  returns: Result of the ImportCertificate operation returned by the service. - `com.amazonaws.services.certificatemanager.model.ImportCertificateResult`

  throws: com.amazonaws.services.certificatemanager.model.ResourceNotFoundException - The specified certificate cannot be found in the caller's account or the caller's account cannot be found."
  (^com.amazonaws.services.certificatemanager.model.ImportCertificateResult [^AWSCertificateManager this ^com.amazonaws.services.certificatemanager.model.ImportCertificateRequest import-certificate-request]
    (-> this (.importCertificate import-certificate-request))))

(defn request-certificate
  "Requests an ACM certificate for use with other AWS services. To request an ACM certificate, you must specify a
   fully qualified domain name (FQDN) in the DomainName parameter. You can also specify additional
   FQDNs in the SubjectAlternativeNames parameter.


   If you are requesting a private certificate, domain validation is not required. If you are requesting a public
   certificate, each domain name that you specify must be validated to verify that you own or control the domain.
   You can use DNS
   validation or email
   validation. We recommend that you use DNS validation. ACM issues public certificates after receiving approval
   from the domain owner.

  request-certificate-request - `com.amazonaws.services.certificatemanager.model.RequestCertificateRequest`

  returns: Result of the RequestCertificate operation returned by the service. - `com.amazonaws.services.certificatemanager.model.RequestCertificateResult`

  throws: com.amazonaws.services.certificatemanager.model.LimitExceededException - An ACM limit has been exceeded."
  (^com.amazonaws.services.certificatemanager.model.RequestCertificateResult [^AWSCertificateManager this ^com.amazonaws.services.certificatemanager.model.RequestCertificateRequest request-certificate-request]
    (-> this (.requestCertificate request-certificate-request))))

(defn export-certificate
  "Exports a private certificate issued by a private certificate authority (CA) for use anywhere. You can export the
   certificate, the certificate chain, and the encrypted private key associated with the public key embedded in the
   certificate. You must store the private key securely. The private key is a 2048 bit RSA key. You must provide a
   passphrase for the private key when exporting it. You can use the following OpenSSL command to decrypt it later.
   Provide the passphrase when prompted.


   openssl rsa -in encrypted_key.pem -out decrypted_key.pem

  export-certificate-request - `com.amazonaws.services.certificatemanager.model.ExportCertificateRequest`

  returns: Result of the ExportCertificate operation returned by the service. - `com.amazonaws.services.certificatemanager.model.ExportCertificateResult`

  throws: com.amazonaws.services.certificatemanager.model.ResourceNotFoundException - The specified certificate cannot be found in the caller's account or the caller's account cannot be found."
  (^com.amazonaws.services.certificatemanager.model.ExportCertificateResult [^AWSCertificateManager this ^com.amazonaws.services.certificatemanager.model.ExportCertificateRequest export-certificate-request]
    (-> this (.exportCertificate export-certificate-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSCertificateManager this]
    (-> this (.shutdown))))

(defn describe-certificate
  "Returns detailed metadata about the specified ACM certificate.

  describe-certificate-request - `com.amazonaws.services.certificatemanager.model.DescribeCertificateRequest`

  returns: Result of the DescribeCertificate operation returned by the service. - `com.amazonaws.services.certificatemanager.model.DescribeCertificateResult`

  throws: com.amazonaws.services.certificatemanager.model.ResourceNotFoundException - The specified certificate cannot be found in the caller's account or the caller's account cannot be found."
  (^com.amazonaws.services.certificatemanager.model.DescribeCertificateResult [^AWSCertificateManager this ^com.amazonaws.services.certificatemanager.model.DescribeCertificateRequest describe-certificate-request]
    (-> this (.describeCertificate describe-certificate-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"acm.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://acm.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AWSCertificateManager this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn delete-certificate
  "Deletes a certificate and its associated private key. If this action succeeds, the certificate no longer appears
   in the list that can be displayed by calling the ListCertificates action or be retrieved by calling the
   GetCertificate action. The certificate will not be available for use by AWS services integrated with ACM.



   You cannot delete an ACM certificate that is being used by another AWS service. To delete a certificate that is
   in use, the certificate association must first be removed.

  delete-certificate-request - `com.amazonaws.services.certificatemanager.model.DeleteCertificateRequest`

  returns: Result of the DeleteCertificate operation returned by the service. - `com.amazonaws.services.certificatemanager.model.DeleteCertificateResult`

  throws: com.amazonaws.services.certificatemanager.model.ResourceNotFoundException - The specified certificate cannot be found in the caller's account or the caller's account cannot be found."
  (^com.amazonaws.services.certificatemanager.model.DeleteCertificateResult [^AWSCertificateManager this ^com.amazonaws.services.certificatemanager.model.DeleteCertificateRequest delete-certificate-request]
    (-> this (.deleteCertificate delete-certificate-request))))

(defn remove-tags-from-certificate
  "Remove one or more tags from an ACM certificate. A tag consists of a key-value pair. If you do not specify the
   value portion of the tag when calling this function, the tag will be removed regardless of value. If you specify
   a value, the tag is removed only if it is associated with the specified value.


   To add tags to a certificate, use the AddTagsToCertificate action. To view all of the tags that have been
   applied to a specific ACM certificate, use the ListTagsForCertificate action.

  remove-tags-from-certificate-request - `com.amazonaws.services.certificatemanager.model.RemoveTagsFromCertificateRequest`

  returns: Result of the RemoveTagsFromCertificate operation returned by the service. - `com.amazonaws.services.certificatemanager.model.RemoveTagsFromCertificateResult`

  throws: com.amazonaws.services.certificatemanager.model.ResourceNotFoundException - The specified certificate cannot be found in the caller's account or the caller's account cannot be found."
  (^com.amazonaws.services.certificatemanager.model.RemoveTagsFromCertificateResult [^AWSCertificateManager this ^com.amazonaws.services.certificatemanager.model.RemoveTagsFromCertificateRequest remove-tags-from-certificate-request]
    (-> this (.removeTagsFromCertificate remove-tags-from-certificate-request))))

(defn list-tags-for-certificate
  "Lists the tags that have been applied to the ACM certificate. Use the certificate's Amazon Resource Name (ARN) to
   specify the certificate. To add a tag to an ACM certificate, use the AddTagsToCertificate action. To
   delete a tag, use the RemoveTagsFromCertificate action.

  list-tags-for-certificate-request - `com.amazonaws.services.certificatemanager.model.ListTagsForCertificateRequest`

  returns: Result of the ListTagsForCertificate operation returned by the service. - `com.amazonaws.services.certificatemanager.model.ListTagsForCertificateResult`

  throws: com.amazonaws.services.certificatemanager.model.ResourceNotFoundException - The specified certificate cannot be found in the caller's account or the caller's account cannot be found."
  (^com.amazonaws.services.certificatemanager.model.ListTagsForCertificateResult [^AWSCertificateManager this ^com.amazonaws.services.certificatemanager.model.ListTagsForCertificateRequest list-tags-for-certificate-request]
    (-> this (.listTagsForCertificate list-tags-for-certificate-request))))

(defn resend-validation-email
  "Resends the email that requests domain ownership validation. The domain owner or an authorized representative
   must approve the ACM certificate before it can be issued. The certificate can be approved by clicking a link in
   the mail to navigate to the Amazon certificate approval website and then clicking I Approve. However, the
   validation email can be blocked by spam filters. Therefore, if you do not receive the original mail, you can
   request that the mail be resent within 72 hours of requesting the ACM certificate. If more than 72 hours have
   elapsed since your original request or since your last attempt to resend validation mail, you must request a new
   certificate. For more information about setting up your contact email addresses, see Configure Email for your Domain.

  resend-validation-email-request - `com.amazonaws.services.certificatemanager.model.ResendValidationEmailRequest`

  returns: Result of the ResendValidationEmail operation returned by the service. - `com.amazonaws.services.certificatemanager.model.ResendValidationEmailResult`

  throws: com.amazonaws.services.certificatemanager.model.ResourceNotFoundException - The specified certificate cannot be found in the caller's account or the caller's account cannot be found."
  (^com.amazonaws.services.certificatemanager.model.ResendValidationEmailResult [^AWSCertificateManager this ^com.amazonaws.services.certificatemanager.model.ResendValidationEmailRequest resend-validation-email-request]
    (-> this (.resendValidationEmail resend-validation-email-request))))

(defn update-certificate-options
  "Updates a certificate. Currently, you can use this function to specify whether to opt in to or out of recording
   your certificate in a certificate transparency log. For more information, see
   Opting Out of Certificate Transparency Logging.

  update-certificate-options-request - `com.amazonaws.services.certificatemanager.model.UpdateCertificateOptionsRequest`

  returns: Result of the UpdateCertificateOptions operation returned by the service. - `com.amazonaws.services.certificatemanager.model.UpdateCertificateOptionsResult`

  throws: com.amazonaws.services.certificatemanager.model.ResourceNotFoundException - The specified certificate cannot be found in the caller's account or the caller's account cannot be found."
  (^com.amazonaws.services.certificatemanager.model.UpdateCertificateOptionsResult [^AWSCertificateManager this ^com.amazonaws.services.certificatemanager.model.UpdateCertificateOptionsRequest update-certificate-options-request]
    (-> this (.updateCertificateOptions update-certificate-options-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSCertificateManager this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-certificate
  "Retrieves a certificate specified by an ARN and its certificate chain . The chain is an ordered list of
   certificates that contains the end entity certificate, intermediate certificates of subordinate CAs, and the root
   certificate in that order. The certificate and certificate chain are base64 encoded. If you want to decode the
   certificate to see the individual fields, you can use OpenSSL.

  get-certificate-request - `com.amazonaws.services.certificatemanager.model.GetCertificateRequest`

  returns: Result of the GetCertificate operation returned by the service. - `com.amazonaws.services.certificatemanager.model.GetCertificateResult`

  throws: com.amazonaws.services.certificatemanager.model.ResourceNotFoundException - The specified certificate cannot be found in the caller's account or the caller's account cannot be found."
  (^com.amazonaws.services.certificatemanager.model.GetCertificateResult [^AWSCertificateManager this ^com.amazonaws.services.certificatemanager.model.GetCertificateRequest get-certificate-request]
    (-> this (.getCertificate get-certificate-request))))

(defn add-tags-to-certificate
  "Adds one or more tags to an ACM certificate. Tags are labels that you can use to identify and organize your AWS
   resources. Each tag consists of a key and an optional value. You specify the
   certificate on input by its Amazon Resource Name (ARN). You specify the tag by using a key-value pair.


   You can apply a tag to just one certificate if you want to identify a specific characteristic of that
   certificate, or you can apply the same tag to multiple certificates if you want to filter for a common
   relationship among those certificates. Similarly, you can apply the same tag to multiple resources if you want to
   specify a relationship among those resources. For example, you can add the same tag to an ACM certificate and an
   Elastic Load Balancing load balancer to indicate that they are both used by the same website. For more
   information, see Tagging ACM
   certificates.


   To remove one or more tags, use the RemoveTagsFromCertificate action. To view all of the tags that have
   been applied to the certificate, use the ListTagsForCertificate action.

  add-tags-to-certificate-request - `com.amazonaws.services.certificatemanager.model.AddTagsToCertificateRequest`

  returns: Result of the AddTagsToCertificate operation returned by the service. - `com.amazonaws.services.certificatemanager.model.AddTagsToCertificateResult`

  throws: com.amazonaws.services.certificatemanager.model.ResourceNotFoundException - The specified certificate cannot be found in the caller's account or the caller's account cannot be found."
  (^com.amazonaws.services.certificatemanager.model.AddTagsToCertificateResult [^AWSCertificateManager this ^com.amazonaws.services.certificatemanager.model.AddTagsToCertificateRequest add-tags-to-certificate-request]
    (-> this (.addTagsToCertificate add-tags-to-certificate-request))))

