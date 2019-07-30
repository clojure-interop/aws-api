(ns com.amazonaws.services.acmpca.AWSACMPCA
  "Interface for accessing ACM-PCA.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSACMPCA instead.



  This is the ACM Private CA API Reference. It provides descriptions, syntax, and usage examples for each of the
  actions and data types involved in creating and managing private certificate authorities (CA) for your organization.


  The documentation for each action shows the Query API request parameters and the XML response. Alternatively, you can
  use one of the AWS SDKs to access an API that's tailored to the programming language or platform that you're using.
  For more information, see AWS SDKs.



  Each ACM Private CA API action has a throttling limit which determines the number of times the action can be called
  per second. For more information, see API Rate Limits in ACM
  Private CA in the ACM Private CA user guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.acmpca AWSACMPCA]))

(defn restore-certificate-authority
  "Restores a certificate authority (CA) that is in the DELETED state. You can restore a CA during the
   period that you defined in the PermanentDeletionTimeInDays parameter of the
   DeleteCertificateAuthority action. Currently, you can specify 7 to 30 days. If you did not specify a
   PermanentDeletionTimeInDays value, by default you can restore the CA at any time in a 30 day period. You
   can check the time remaining in the restoration period of a private CA in the DELETED state by
   calling the DescribeCertificateAuthority or ListCertificateAuthorities actions. The status of a
   restored CA is set to its pre-deletion status when the RestoreCertificateAuthority action returns. To
   change its status to ACTIVE, call the UpdateCertificateAuthority action. If the private CA
   was in the PENDING_CERTIFICATE state at deletion, you must use the
   ImportCertificateAuthorityCertificate action to import a certificate authority into the private CA before
   it can be activated. You cannot restore a CA after the restoration period has ended.

  restore-certificate-authority-request - `com.amazonaws.services.acmpca.model.RestoreCertificateAuthorityRequest`

  returns: Result of the RestoreCertificateAuthority operation returned by the service. - `com.amazonaws.services.acmpca.model.RestoreCertificateAuthorityResult`

  throws: com.amazonaws.services.acmpca.model.ResourceNotFoundException - A resource such as a private CA, S3 bucket, certificate, or audit report cannot be found."
  (^com.amazonaws.services.acmpca.model.RestoreCertificateAuthorityResult [^AWSACMPCA this ^com.amazonaws.services.acmpca.model.RestoreCertificateAuthorityRequest restore-certificate-authority-request]
    (-> this (.restoreCertificateAuthority restore-certificate-authority-request))))

(defn waiters
  "returns: `com.amazonaws.services.acmpca.waiters.AWSACMPCAWaiters`"
  (^com.amazonaws.services.acmpca.waiters.AWSACMPCAWaiters [^AWSACMPCA this]
    (-> this (.waiters))))

(defn untag-certificate-authority
  "Remove one or more tags from your private CA. A tag consists of a key-value pair. If you do not specify the value
   portion of the tag when calling this action, the tag will be removed regardless of value. If you specify a value,
   the tag is removed only if it is associated with the specified value. To add tags to a private CA, use the
   TagCertificateAuthority. Call the ListTags action to see what tags are associated with your CA.

  untag-certificate-authority-request - `com.amazonaws.services.acmpca.model.UntagCertificateAuthorityRequest`

  returns: Result of the UntagCertificateAuthority operation returned by the service. - `com.amazonaws.services.acmpca.model.UntagCertificateAuthorityResult`

  throws: com.amazonaws.services.acmpca.model.ResourceNotFoundException - A resource such as a private CA, S3 bucket, certificate, or audit report cannot be found."
  (^com.amazonaws.services.acmpca.model.UntagCertificateAuthorityResult [^AWSACMPCA this ^com.amazonaws.services.acmpca.model.UntagCertificateAuthorityRequest untag-certificate-authority-request]
    (-> this (.untagCertificateAuthority untag-certificate-authority-request))))

(defn create-certificate-authority-audit-report
  "Creates an audit report that lists every time that your CA private key is used. The report is saved in the Amazon
   S3 bucket that you specify on input. The IssueCertificate and RevokeCertificate actions use the
   private key.

  create-certificate-authority-audit-report-request - `com.amazonaws.services.acmpca.model.CreateCertificateAuthorityAuditReportRequest`

  returns: Result of the CreateCertificateAuthorityAuditReport operation returned by the service. - `com.amazonaws.services.acmpca.model.CreateCertificateAuthorityAuditReportResult`

  throws: com.amazonaws.services.acmpca.model.RequestInProgressException - Your request is already in progress."
  (^com.amazonaws.services.acmpca.model.CreateCertificateAuthorityAuditReportResult [^AWSACMPCA this ^com.amazonaws.services.acmpca.model.CreateCertificateAuthorityAuditReportRequest create-certificate-authority-audit-report-request]
    (-> this (.createCertificateAuthorityAuditReport create-certificate-authority-audit-report-request))))

(defn list-tags
  "Lists the tags, if any, that are associated with your private CA. Tags are labels that you can use to identify
   and organize your CAs. Each tag consists of a key and an optional value. Call the TagCertificateAuthority
   action to add one or more tags to your CA. Call the UntagCertificateAuthority action to remove tags.

  list-tags-request - `com.amazonaws.services.acmpca.model.ListTagsRequest`

  returns: Result of the ListTags operation returned by the service. - `com.amazonaws.services.acmpca.model.ListTagsResult`

  throws: com.amazonaws.services.acmpca.model.ResourceNotFoundException - A resource such as a private CA, S3 bucket, certificate, or audit report cannot be found."
  (^com.amazonaws.services.acmpca.model.ListTagsResult [^AWSACMPCA this ^com.amazonaws.services.acmpca.model.ListTagsRequest list-tags-request]
    (-> this (.listTags list-tags-request))))

(defn import-certificate-authority-certificate
  "Imports a signed private CA certificate into ACM Private CA. This action is used when you are using a chain of
   trust whose root is located outside ACM Private CA. Before you can call this action, the following preparations
   must in place:




   In ACM Private CA, call the CreateCertificateAuthority action to create the private CA that that you plan
   to back with the imported certificate.




   Call the GetCertificateAuthorityCsr action to generate a certificate signing request (CSR).




   Sign the CSR using a root or intermediate CA hosted either by an on-premises PKI hierarchy or a commercial CA..




   Create a certificate chain and copy the signed certificate and the certificate chain to your working directory.




   The following requirements apply when you import a CA certificate.




   You cannot import a non-self-signed certificate for use as a root CA.




   You cannot import a self-signed certificate for use as a subordinate CA.




   Your certificate chain must not include the private CA certificate that you are importing.




   Your ACM Private CA-hosted or on-premises CA certificate must be the last certificate in your chain. The
   subordinate certificate, if any, that your root CA signed must be next to last. The subordinate certificate
   signed by the preceding subordinate CA must come next, and so on until your chain is built.




   The chain must be PEM-encoded.

  import-certificate-authority-certificate-request - `com.amazonaws.services.acmpca.model.ImportCertificateAuthorityCertificateRequest`

  returns: Result of the ImportCertificateAuthorityCertificate operation returned by the service. - `com.amazonaws.services.acmpca.model.ImportCertificateAuthorityCertificateResult`

  throws: com.amazonaws.services.acmpca.model.ResourceNotFoundException - A resource such as a private CA, S3 bucket, certificate, or audit report cannot be found."
  (^com.amazonaws.services.acmpca.model.ImportCertificateAuthorityCertificateResult [^AWSACMPCA this ^com.amazonaws.services.acmpca.model.ImportCertificateAuthorityCertificateRequest import-certificate-authority-certificate-request]
    (-> this (.importCertificateAuthorityCertificate import-certificate-authority-certificate-request))))

(defn describe-certificate-authority
  "Lists information about your private certificate authority (CA). You specify the private CA on input by its ARN
   (Amazon Resource Name). The output contains the status of your CA. This can be any of the following:




   CREATING - ACM Private CA is creating your private certificate authority.




   PENDING_CERTIFICATE - The certificate is pending. You must use your ACM Private CA-hosted or
   on-premises root or subordinate CA to sign your private CA CSR and then import it into PCA.




   ACTIVE - Your private CA is active.




   DISABLED - Your private CA has been disabled.




   EXPIRED - Your private CA certificate has expired.




   FAILED - Your private CA has failed. Your CA can fail because of problems such a network outage or
   backend AWS failure or other errors. A failed CA can never return to the pending state. You must create a new CA.




   DELETED - Your private CA is within the restoration period, after which it is permanently deleted.
   The length of time remaining in the CA's restoration period is also included in this action's output.

  describe-certificate-authority-request - `com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityRequest`

  returns: Result of the DescribeCertificateAuthority operation returned by the service. - `com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityResult`

  throws: com.amazonaws.services.acmpca.model.ResourceNotFoundException - A resource such as a private CA, S3 bucket, certificate, or audit report cannot be found."
  (^com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityResult [^AWSACMPCA this ^com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityRequest describe-certificate-authority-request]
    (-> this (.describeCertificateAuthority describe-certificate-authority-request))))

(defn list-permissions
  "Lists all the permissions, if any, that have been assigned by a private CA. Permissions can be granted with the
   CreatePermission action and revoked with the DeletePermission action.

  list-permissions-request - `com.amazonaws.services.acmpca.model.ListPermissionsRequest`

  returns: Result of the ListPermissions operation returned by the service. - `com.amazonaws.services.acmpca.model.ListPermissionsResult`

  throws: com.amazonaws.services.acmpca.model.ResourceNotFoundException - A resource such as a private CA, S3 bucket, certificate, or audit report cannot be found."
  (^com.amazonaws.services.acmpca.model.ListPermissionsResult [^AWSACMPCA this ^com.amazonaws.services.acmpca.model.ListPermissionsRequest list-permissions-request]
    (-> this (.listPermissions list-permissions-request))))

(defn delete-permission
  "Revokes permissions that a private CA assigned to a designated AWS service. Permissions can be created with the
   CreatePermission action and listed with the ListPermissions action.

  delete-permission-request - `com.amazonaws.services.acmpca.model.DeletePermissionRequest`

  returns: Result of the DeletePermission operation returned by the service. - `com.amazonaws.services.acmpca.model.DeletePermissionResult`

  throws: com.amazonaws.services.acmpca.model.ResourceNotFoundException - A resource such as a private CA, S3 bucket, certificate, or audit report cannot be found."
  (^com.amazonaws.services.acmpca.model.DeletePermissionResult [^AWSACMPCA this ^com.amazonaws.services.acmpca.model.DeletePermissionRequest delete-permission-request]
    (-> this (.deletePermission delete-permission-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSACMPCA this]
    (-> this (.shutdown))))

(defn describe-certificate-authority-audit-report
  "Lists information about a specific audit report created by calling the
   CreateCertificateAuthorityAuditReport action. Audit information is created every time the certificate
   authority (CA) private key is used. The private key is used when you call the IssueCertificate action or
   the RevokeCertificate action.

  describe-certificate-authority-audit-report-request - `com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityAuditReportRequest`

  returns: Result of the DescribeCertificateAuthorityAuditReport operation returned by the service. - `com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityAuditReportResult`

  throws: com.amazonaws.services.acmpca.model.ResourceNotFoundException - A resource such as a private CA, S3 bucket, certificate, or audit report cannot be found."
  (^com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityAuditReportResult [^AWSACMPCA this ^com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityAuditReportRequest describe-certificate-authority-audit-report-request]
    (-> this (.describeCertificateAuthorityAuditReport describe-certificate-authority-audit-report-request))))

(defn list-certificate-authorities
  "Lists the private certificate authorities that you created by using the CreateCertificateAuthority action.

  list-certificate-authorities-request - `com.amazonaws.services.acmpca.model.ListCertificateAuthoritiesRequest`

  returns: Result of the ListCertificateAuthorities operation returned by the service. - `com.amazonaws.services.acmpca.model.ListCertificateAuthoritiesResult`

  throws: com.amazonaws.services.acmpca.model.InvalidNextTokenException - The token specified in the NextToken argument is not valid. Use the token returned from your previous call to ListCertificateAuthorities."
  (^com.amazonaws.services.acmpca.model.ListCertificateAuthoritiesResult [^AWSACMPCA this ^com.amazonaws.services.acmpca.model.ListCertificateAuthoritiesRequest list-certificate-authorities-request]
    (-> this (.listCertificateAuthorities list-certificate-authorities-request))))

(defn tag-certificate-authority
  "Adds one or more tags to your private CA. Tags are labels that you can use to identify and organize your AWS
   resources. Each tag consists of a key and an optional value. You specify the private CA on input by its Amazon
   Resource Name (ARN). You specify the tag by using a key-value pair. You can apply a tag to just one private CA if
   you want to identify a specific characteristic of that CA, or you can apply the same tag to multiple private CAs
   if you want to filter for a common relationship among those CAs. To remove one or more tags, use the
   UntagCertificateAuthority action. Call the ListTags action to see what tags are associated with
   your CA.

  tag-certificate-authority-request - `com.amazonaws.services.acmpca.model.TagCertificateAuthorityRequest`

  returns: Result of the TagCertificateAuthority operation returned by the service. - `com.amazonaws.services.acmpca.model.TagCertificateAuthorityResult`

  throws: com.amazonaws.services.acmpca.model.ResourceNotFoundException - A resource such as a private CA, S3 bucket, certificate, or audit report cannot be found."
  (^com.amazonaws.services.acmpca.model.TagCertificateAuthorityResult [^AWSACMPCA this ^com.amazonaws.services.acmpca.model.TagCertificateAuthorityRequest tag-certificate-authority-request]
    (-> this (.tagCertificateAuthority tag-certificate-authority-request))))

(defn issue-certificate
  "Uses your private certificate authority (CA) to issue a client certificate. This action returns the Amazon
   Resource Name (ARN) of the certificate. You can retrieve the certificate by calling the GetCertificate
   action and specifying the ARN.



   You cannot use the ACM ListCertificateAuthorities action to retrieve the ARNs of the certificates that you
   issue by using ACM Private CA.

  issue-certificate-request - `com.amazonaws.services.acmpca.model.IssueCertificateRequest`

  returns: Result of the IssueCertificate operation returned by the service. - `com.amazonaws.services.acmpca.model.IssueCertificateResult`

  throws: com.amazonaws.services.acmpca.model.LimitExceededException - An ACM Private CA limit has been exceeded. See the exception message returned to determine the limit that was exceeded."
  (^com.amazonaws.services.acmpca.model.IssueCertificateResult [^AWSACMPCA this ^com.amazonaws.services.acmpca.model.IssueCertificateRequest issue-certificate-request]
    (-> this (.issueCertificate issue-certificate-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSACMPCA this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-certificate
  "Retrieves a certificate from your private CA. The ARN of the certificate is returned when you call the
   IssueCertificate action. You must specify both the ARN of your private CA and the ARN of the issued
   certificate when calling the GetCertificate action. You can retrieve the certificate if it is in the
   ISSUED state. You can call the CreateCertificateAuthorityAuditReport action to create a report that
   contains information about all of the certificates issued and revoked by your private CA.

  get-certificate-request - `com.amazonaws.services.acmpca.model.GetCertificateRequest`

  returns: Result of the GetCertificate operation returned by the service. - `com.amazonaws.services.acmpca.model.GetCertificateResult`

  throws: com.amazonaws.services.acmpca.model.RequestInProgressException - Your request is already in progress."
  (^com.amazonaws.services.acmpca.model.GetCertificateResult [^AWSACMPCA this ^com.amazonaws.services.acmpca.model.GetCertificateRequest get-certificate-request]
    (-> this (.getCertificate get-certificate-request))))

(defn revoke-certificate
  "Revokes a certificate that was issued inside ACM Private CA. If you enable a certificate revocation list (CRL)
   when you create or update your private CA, information about the revoked certificates will be included in the
   CRL. ACM Private CA writes the CRL to an S3 bucket that you specify. For more information about revocation, see
   the CrlConfiguration structure. ACM Private CA also writes revocation information to the audit report. For
   more information, see CreateCertificateAuthorityAuditReport.



   You cannot revoke a root CA self-signed certificate.

  revoke-certificate-request - `com.amazonaws.services.acmpca.model.RevokeCertificateRequest`

  returns: Result of the RevokeCertificate operation returned by the service. - `com.amazonaws.services.acmpca.model.RevokeCertificateResult`

  throws: com.amazonaws.services.acmpca.model.ResourceNotFoundException - A resource such as a private CA, S3 bucket, certificate, or audit report cannot be found."
  (^com.amazonaws.services.acmpca.model.RevokeCertificateResult [^AWSACMPCA this ^com.amazonaws.services.acmpca.model.RevokeCertificateRequest revoke-certificate-request]
    (-> this (.revokeCertificate revoke-certificate-request))))

(defn create-certificate-authority
  "Creates a root or subordinate private certificate authority (CA). You must specify the CA configuration, the
   certificate revocation list (CRL) configuration, the CA type, and an optional idempotency token to avoid
   accidental creation of multiple CAs. The CA configuration specifies the name of the algorithm and key size to be
   used to create the CA private key, the type of signing algorithm that the CA uses, and X.500 subject information.
   The CRL configuration specifies the CRL expiration period in days (the validity period of the CRL), the Amazon S3
   bucket that will contain the CRL, and a CNAME alias for the S3 bucket that is included in certificates issued by
   the CA. If successful, this action returns the Amazon Resource Name (ARN) of the CA.

  create-certificate-authority-request - `com.amazonaws.services.acmpca.model.CreateCertificateAuthorityRequest`

  returns: Result of the CreateCertificateAuthority operation returned by the service. - `com.amazonaws.services.acmpca.model.CreateCertificateAuthorityResult`

  throws: com.amazonaws.services.acmpca.model.InvalidArgsException - One or more of the specified arguments was not valid."
  (^com.amazonaws.services.acmpca.model.CreateCertificateAuthorityResult [^AWSACMPCA this ^com.amazonaws.services.acmpca.model.CreateCertificateAuthorityRequest create-certificate-authority-request]
    (-> this (.createCertificateAuthority create-certificate-authority-request))))

(defn delete-certificate-authority
  "Deletes a private certificate authority (CA). You must provide the Amazon Resource Name (ARN) of the private CA
   that you want to delete. You can find the ARN by calling the ListCertificateAuthorities action.



   Deleting a CA will invalidate other CAs and certificates below it in your CA hierarchy.



   Before you can delete a CA that you have created and activated, you must disable it. To do this, call the
   UpdateCertificateAuthority action and set the CertificateAuthorityStatus parameter to
   DISABLED.


   Additionally, you can delete a CA if you are waiting for it to be created (that is, the status of the CA is
   CREATING). You can also delete it if the CA has been created but you haven't yet imported the signed
   certificate into ACM Private CA (that is, the status of the CA is PENDING_CERTIFICATE).


   When you successfully call DeleteCertificateAuthority, the CA's status changes to DELETED.
   However, the CA won't be permanently deleted until the restoration period has passed. By default, if you do not
   set the PermanentDeletionTimeInDays parameter, the CA remains restorable for 30 days. You can set
   the parameter from 7 to 30 days. The DescribeCertificateAuthority action returns the time remaining in the
   restoration window of a private CA in the DELETED state. To restore an eligible CA, call the
   RestoreCertificateAuthority action.

  delete-certificate-authority-request - `com.amazonaws.services.acmpca.model.DeleteCertificateAuthorityRequest`

  returns: Result of the DeleteCertificateAuthority operation returned by the service. - `com.amazonaws.services.acmpca.model.DeleteCertificateAuthorityResult`

  throws: com.amazonaws.services.acmpca.model.ConcurrentModificationException - A previous update to your private CA is still ongoing."
  (^com.amazonaws.services.acmpca.model.DeleteCertificateAuthorityResult [^AWSACMPCA this ^com.amazonaws.services.acmpca.model.DeleteCertificateAuthorityRequest delete-certificate-authority-request]
    (-> this (.deleteCertificateAuthority delete-certificate-authority-request))))

(defn create-permission
  "Assigns permissions from a private CA to a designated AWS service. Services are specified by their service
   principals and can be given permission to create and retrieve certificates on a private CA. Services can also be
   given permission to list the active permissions that the private CA has granted. For ACM to automatically renew
   your private CA's certificates, you must assign all possible permissions from the CA to the ACM service
   principal.


   At this time, you can only assign permissions to ACM (acm.amazonaws.com). Permissions can be revoked
   with the DeletePermission action and listed with the ListPermissions action.

  create-permission-request - `com.amazonaws.services.acmpca.model.CreatePermissionRequest`

  returns: Result of the CreatePermission operation returned by the service. - `com.amazonaws.services.acmpca.model.CreatePermissionResult`

  throws: com.amazonaws.services.acmpca.model.ResourceNotFoundException - A resource such as a private CA, S3 bucket, certificate, or audit report cannot be found."
  (^com.amazonaws.services.acmpca.model.CreatePermissionResult [^AWSACMPCA this ^com.amazonaws.services.acmpca.model.CreatePermissionRequest create-permission-request]
    (-> this (.createPermission create-permission-request))))

(defn update-certificate-authority
  "Updates the status or configuration of a private certificate authority (CA). Your private CA must be in the
   ACTIVE or DISABLED state before you can update it. You can disable a private CA that is
   in the ACTIVE state or make a CA that is in the DISABLED state active again.

  update-certificate-authority-request - `com.amazonaws.services.acmpca.model.UpdateCertificateAuthorityRequest`

  returns: Result of the UpdateCertificateAuthority operation returned by the service. - `com.amazonaws.services.acmpca.model.UpdateCertificateAuthorityResult`

  throws: com.amazonaws.services.acmpca.model.ConcurrentModificationException - A previous update to your private CA is still ongoing."
  (^com.amazonaws.services.acmpca.model.UpdateCertificateAuthorityResult [^AWSACMPCA this ^com.amazonaws.services.acmpca.model.UpdateCertificateAuthorityRequest update-certificate-authority-request]
    (-> this (.updateCertificateAuthority update-certificate-authority-request))))

(defn get-certificate-authority-certificate
  "Retrieves the certificate and certificate chain for your private certificate authority (CA). Both the certificate
   and the chain are base64 PEM-encoded. The chain does not include the CA certificate. Each certificate in the
   chain signs the one before it.

  get-certificate-authority-certificate-request - `com.amazonaws.services.acmpca.model.GetCertificateAuthorityCertificateRequest`

  returns: Result of the GetCertificateAuthorityCertificate operation returned by the service. - `com.amazonaws.services.acmpca.model.GetCertificateAuthorityCertificateResult`

  throws: com.amazonaws.services.acmpca.model.ResourceNotFoundException - A resource such as a private CA, S3 bucket, certificate, or audit report cannot be found."
  (^com.amazonaws.services.acmpca.model.GetCertificateAuthorityCertificateResult [^AWSACMPCA this ^com.amazonaws.services.acmpca.model.GetCertificateAuthorityCertificateRequest get-certificate-authority-certificate-request]
    (-> this (.getCertificateAuthorityCertificate get-certificate-authority-certificate-request))))

(defn get-certificate-authority-csr
  "Retrieves the certificate signing request (CSR) for your private certificate authority (CA). The CSR is created
   when you call the CreateCertificateAuthority action. Sign the CSR with your ACM Private CA-hosted or
   on-premises root or subordinate CA. Then import the signed certificate back into ACM Private CA by calling the
   ImportCertificateAuthorityCertificate action. The CSR is returned as a base64 PEM-encoded string.

  get-certificate-authority-csr-request - `com.amazonaws.services.acmpca.model.GetCertificateAuthorityCsrRequest`

  returns: Result of the GetCertificateAuthorityCsr operation returned by the service. - `com.amazonaws.services.acmpca.model.GetCertificateAuthorityCsrResult`

  throws: com.amazonaws.services.acmpca.model.RequestInProgressException - Your request is already in progress."
  (^com.amazonaws.services.acmpca.model.GetCertificateAuthorityCsrResult [^AWSACMPCA this ^com.amazonaws.services.acmpca.model.GetCertificateAuthorityCsrRequest get-certificate-authority-csr-request]
    (-> this (.getCertificateAuthorityCsr get-certificate-authority-csr-request))))

