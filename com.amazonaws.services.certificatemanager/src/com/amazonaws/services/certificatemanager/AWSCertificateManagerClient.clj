(ns com.amazonaws.services.certificatemanager.AWSCertificateManagerClient
  "Client for accessing ACM. All service calls made using this client are blocking, and will not return until the
  service call completes.

  AWS Certificate Manager

  Welcome to the AWS Certificate Manager (ACM) API documentation.


  You can use ACM to manage SSL/TLS certificates for your AWS-based websites and applications. For general information
  about using ACM, see the  AWS Certificate Manager User
  Guide ."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.certificatemanager AWSCertificateManagerClient]))

(defn ->aws-certificate-manager-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to ACM (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AWSCertificateManagerClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AWSCertificateManagerClient aws-credentials-provider client-configuration request-metric-collector))
  (^AWSCertificateManagerClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSCertificateManagerClient aws-credentials client-configuration))
  (^AWSCertificateManagerClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSCertificateManagerClient client-configuration))
  (^AWSCertificateManagerClient []
    (new AWSCertificateManagerClient )))

(defn *builder
  "returns: `com.amazonaws.services.certificatemanager.AWSCertificateManagerClientBuilder`"
  (^com.amazonaws.services.certificatemanager.AWSCertificateManagerClientBuilder []
    (AWSCertificateManagerClient/builder )))

(defn waiters
  "returns: `com.amazonaws.services.certificatemanager.waiters.AWSCertificateManagerWaiters`"
  (^com.amazonaws.services.certificatemanager.waiters.AWSCertificateManagerWaiters [^AWSCertificateManagerClient this]
    (-> this (.waiters))))

(defn list-certificates
  "Retrieves a list of certificate ARNs and domain names. You can request that only certificates that match a
   specific status be listed. You can also filter by specific attributes of the certificate.

  request - `com.amazonaws.services.certificatemanager.model.ListCertificatesRequest`

  returns: Result of the ListCertificates operation returned by the service. - `com.amazonaws.services.certificatemanager.model.ListCertificatesResult`

  throws: com.amazonaws.services.certificatemanager.model.InvalidArgsException - One or more of of request parameters specified is not valid."
  (^com.amazonaws.services.certificatemanager.model.ListCertificatesResult [^AWSCertificateManagerClient this ^com.amazonaws.services.certificatemanager.model.ListCertificatesRequest request]
    (-> this (.listCertificates request))))

(defn renew-certificate
  "Renews an eligable ACM certificate. At this time, only exported private certificates can be renewed with this
   operation. In order to renew your ACM PCA certificates with ACM, you must first grant the ACM service principal
   permission to do so. For more information, see Testing Managed Renewal in the
   ACM User Guide.

  request - `com.amazonaws.services.certificatemanager.model.RenewCertificateRequest`

  returns: Result of the RenewCertificate operation returned by the service. - `com.amazonaws.services.certificatemanager.model.RenewCertificateResult`

  throws: com.amazonaws.services.certificatemanager.model.ResourceNotFoundException - The specified certificate cannot be found in the caller's account or the caller's account cannot be found."
  (^com.amazonaws.services.certificatemanager.model.RenewCertificateResult [^AWSCertificateManagerClient this ^com.amazonaws.services.certificatemanager.model.RenewCertificateRequest request]
    (-> this (.renewCertificate request))))

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

  request - `com.amazonaws.services.certificatemanager.model.ImportCertificateRequest`

  returns: Result of the ImportCertificate operation returned by the service. - `com.amazonaws.services.certificatemanager.model.ImportCertificateResult`

  throws: com.amazonaws.services.certificatemanager.model.ResourceNotFoundException - The specified certificate cannot be found in the caller's account or the caller's account cannot be found."
  (^com.amazonaws.services.certificatemanager.model.ImportCertificateResult [^AWSCertificateManagerClient this ^com.amazonaws.services.certificatemanager.model.ImportCertificateRequest request]
    (-> this (.importCertificate request))))

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

  request - `com.amazonaws.services.certificatemanager.model.RequestCertificateRequest`

  returns: Result of the RequestCertificate operation returned by the service. - `com.amazonaws.services.certificatemanager.model.RequestCertificateResult`

  throws: com.amazonaws.services.certificatemanager.model.LimitExceededException - An ACM limit has been exceeded."
  (^com.amazonaws.services.certificatemanager.model.RequestCertificateResult [^AWSCertificateManagerClient this ^com.amazonaws.services.certificatemanager.model.RequestCertificateRequest request]
    (-> this (.requestCertificate request))))

(defn export-certificate
  "Exports a private certificate issued by a private certificate authority (CA) for use anywhere. You can export the
   certificate, the certificate chain, and the encrypted private key associated with the public key embedded in the
   certificate. You must store the private key securely. The private key is a 2048 bit RSA key. You must provide a
   passphrase for the private key when exporting it. You can use the following OpenSSL command to decrypt it later.
   Provide the passphrase when prompted.


   openssl rsa -in encrypted_key.pem -out decrypted_key.pem

  request - `com.amazonaws.services.certificatemanager.model.ExportCertificateRequest`

  returns: Result of the ExportCertificate operation returned by the service. - `com.amazonaws.services.certificatemanager.model.ExportCertificateResult`

  throws: com.amazonaws.services.certificatemanager.model.ResourceNotFoundException - The specified certificate cannot be found in the caller's account or the caller's account cannot be found."
  (^com.amazonaws.services.certificatemanager.model.ExportCertificateResult [^AWSCertificateManagerClient this ^com.amazonaws.services.certificatemanager.model.ExportCertificateRequest request]
    (-> this (.exportCertificate request))))

(defn shutdown
  "Description copied from class: AmazonWebServiceClient"
  ([^AWSCertificateManagerClient this]
    (-> this (.shutdown))))

(defn describe-certificate
  "Returns detailed metadata about the specified ACM certificate.

  request - `com.amazonaws.services.certificatemanager.model.DescribeCertificateRequest`

  returns: Result of the DescribeCertificate operation returned by the service. - `com.amazonaws.services.certificatemanager.model.DescribeCertificateResult`

  throws: com.amazonaws.services.certificatemanager.model.ResourceNotFoundException - The specified certificate cannot be found in the caller's account or the caller's account cannot be found."
  (^com.amazonaws.services.certificatemanager.model.DescribeCertificateResult [^AWSCertificateManagerClient this ^com.amazonaws.services.certificatemanager.model.DescribeCertificateRequest request]
    (-> this (.describeCertificate request))))

(defn delete-certificate
  "Deletes a certificate and its associated private key. If this action succeeds, the certificate no longer appears
   in the list that can be displayed by calling the ListCertificates action or be retrieved by calling the
   GetCertificate action. The certificate will not be available for use by AWS services integrated with ACM.



   You cannot delete an ACM certificate that is being used by another AWS service. To delete a certificate that is
   in use, the certificate association must first be removed.

  request - `com.amazonaws.services.certificatemanager.model.DeleteCertificateRequest`

  returns: Result of the DeleteCertificate operation returned by the service. - `com.amazonaws.services.certificatemanager.model.DeleteCertificateResult`

  throws: com.amazonaws.services.certificatemanager.model.ResourceNotFoundException - The specified certificate cannot be found in the caller's account or the caller's account cannot be found."
  (^com.amazonaws.services.certificatemanager.model.DeleteCertificateResult [^AWSCertificateManagerClient this ^com.amazonaws.services.certificatemanager.model.DeleteCertificateRequest request]
    (-> this (.deleteCertificate request))))

(defn remove-tags-from-certificate
  "Remove one or more tags from an ACM certificate. A tag consists of a key-value pair. If you do not specify the
   value portion of the tag when calling this function, the tag will be removed regardless of value. If you specify
   a value, the tag is removed only if it is associated with the specified value.


   To add tags to a certificate, use the AddTagsToCertificate action. To view all of the tags that have been
   applied to a specific ACM certificate, use the ListTagsForCertificate action.

  request - `com.amazonaws.services.certificatemanager.model.RemoveTagsFromCertificateRequest`

  returns: Result of the RemoveTagsFromCertificate operation returned by the service. - `com.amazonaws.services.certificatemanager.model.RemoveTagsFromCertificateResult`

  throws: com.amazonaws.services.certificatemanager.model.ResourceNotFoundException - The specified certificate cannot be found in the caller's account or the caller's account cannot be found."
  (^com.amazonaws.services.certificatemanager.model.RemoveTagsFromCertificateResult [^AWSCertificateManagerClient this ^com.amazonaws.services.certificatemanager.model.RemoveTagsFromCertificateRequest request]
    (-> this (.removeTagsFromCertificate request))))

(defn list-tags-for-certificate
  "Lists the tags that have been applied to the ACM certificate. Use the certificate's Amazon Resource Name (ARN) to
   specify the certificate. To add a tag to an ACM certificate, use the AddTagsToCertificate action. To
   delete a tag, use the RemoveTagsFromCertificate action.

  request - `com.amazonaws.services.certificatemanager.model.ListTagsForCertificateRequest`

  returns: Result of the ListTagsForCertificate operation returned by the service. - `com.amazonaws.services.certificatemanager.model.ListTagsForCertificateResult`

  throws: com.amazonaws.services.certificatemanager.model.ResourceNotFoundException - The specified certificate cannot be found in the caller's account or the caller's account cannot be found."
  (^com.amazonaws.services.certificatemanager.model.ListTagsForCertificateResult [^AWSCertificateManagerClient this ^com.amazonaws.services.certificatemanager.model.ListTagsForCertificateRequest request]
    (-> this (.listTagsForCertificate request))))

(defn resend-validation-email
  "Resends the email that requests domain ownership validation. The domain owner or an authorized representative
   must approve the ACM certificate before it can be issued. The certificate can be approved by clicking a link in
   the mail to navigate to the Amazon certificate approval website and then clicking I Approve. However, the
   validation email can be blocked by spam filters. Therefore, if you do not receive the original mail, you can
   request that the mail be resent within 72 hours of requesting the ACM certificate. If more than 72 hours have
   elapsed since your original request or since your last attempt to resend validation mail, you must request a new
   certificate. For more information about setting up your contact email addresses, see Configure Email for your Domain.

  request - `com.amazonaws.services.certificatemanager.model.ResendValidationEmailRequest`

  returns: Result of the ResendValidationEmail operation returned by the service. - `com.amazonaws.services.certificatemanager.model.ResendValidationEmailResult`

  throws: com.amazonaws.services.certificatemanager.model.ResourceNotFoundException - The specified certificate cannot be found in the caller's account or the caller's account cannot be found."
  (^com.amazonaws.services.certificatemanager.model.ResendValidationEmailResult [^AWSCertificateManagerClient this ^com.amazonaws.services.certificatemanager.model.ResendValidationEmailRequest request]
    (-> this (.resendValidationEmail request))))

(defn update-certificate-options
  "Updates a certificate. Currently, you can use this function to specify whether to opt in to or out of recording
   your certificate in a certificate transparency log. For more information, see
   Opting Out of Certificate Transparency Logging.

  request - `com.amazonaws.services.certificatemanager.model.UpdateCertificateOptionsRequest`

  returns: Result of the UpdateCertificateOptions operation returned by the service. - `com.amazonaws.services.certificatemanager.model.UpdateCertificateOptionsResult`

  throws: com.amazonaws.services.certificatemanager.model.ResourceNotFoundException - The specified certificate cannot be found in the caller's account or the caller's account cannot be found."
  (^com.amazonaws.services.certificatemanager.model.UpdateCertificateOptionsResult [^AWSCertificateManagerClient this ^com.amazonaws.services.certificatemanager.model.UpdateCertificateOptionsRequest request]
    (-> this (.updateCertificateOptions request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSCertificateManagerClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-certificate
  "Retrieves a certificate specified by an ARN and its certificate chain . The chain is an ordered list of
   certificates that contains the end entity certificate, intermediate certificates of subordinate CAs, and the root
   certificate in that order. The certificate and certificate chain are base64 encoded. If you want to decode the
   certificate to see the individual fields, you can use OpenSSL.

  request - `com.amazonaws.services.certificatemanager.model.GetCertificateRequest`

  returns: Result of the GetCertificate operation returned by the service. - `com.amazonaws.services.certificatemanager.model.GetCertificateResult`

  throws: com.amazonaws.services.certificatemanager.model.ResourceNotFoundException - The specified certificate cannot be found in the caller's account or the caller's account cannot be found."
  (^com.amazonaws.services.certificatemanager.model.GetCertificateResult [^AWSCertificateManagerClient this ^com.amazonaws.services.certificatemanager.model.GetCertificateRequest request]
    (-> this (.getCertificate request))))

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

  request - `com.amazonaws.services.certificatemanager.model.AddTagsToCertificateRequest`

  returns: Result of the AddTagsToCertificate operation returned by the service. - `com.amazonaws.services.certificatemanager.model.AddTagsToCertificateResult`

  throws: com.amazonaws.services.certificatemanager.model.ResourceNotFoundException - The specified certificate cannot be found in the caller's account or the caller's account cannot be found."
  (^com.amazonaws.services.certificatemanager.model.AddTagsToCertificateResult [^AWSCertificateManagerClient this ^com.amazonaws.services.certificatemanager.model.AddTagsToCertificateRequest request]
    (-> this (.addTagsToCertificate request))))

