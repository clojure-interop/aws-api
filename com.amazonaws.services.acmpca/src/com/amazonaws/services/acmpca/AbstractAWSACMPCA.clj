(ns com.amazonaws.services.acmpca.AbstractAWSACMPCA
  "Abstract implementation of AWSACMPCA. Convenient method forms pass through to the corresponding overload that
  takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.acmpca AbstractAWSACMPCA]))

(defn restore-certificate-authority
  "Description copied from interface: AWSACMPCA

  request - `com.amazonaws.services.acmpca.model.RestoreCertificateAuthorityRequest`

  returns: Result of the RestoreCertificateAuthority operation returned by the service. - `com.amazonaws.services.acmpca.model.RestoreCertificateAuthorityResult`"
  (^com.amazonaws.services.acmpca.model.RestoreCertificateAuthorityResult [^AbstractAWSACMPCA this ^com.amazonaws.services.acmpca.model.RestoreCertificateAuthorityRequest request]
    (-> this (.restoreCertificateAuthority request))))

(defn waiters
  "returns: `com.amazonaws.services.acmpca.waiters.AWSACMPCAWaiters`"
  (^com.amazonaws.services.acmpca.waiters.AWSACMPCAWaiters [^AbstractAWSACMPCA this]
    (-> this (.waiters))))

(defn untag-certificate-authority
  "Description copied from interface: AWSACMPCA

  request - `com.amazonaws.services.acmpca.model.UntagCertificateAuthorityRequest`

  returns: Result of the UntagCertificateAuthority operation returned by the service. - `com.amazonaws.services.acmpca.model.UntagCertificateAuthorityResult`"
  (^com.amazonaws.services.acmpca.model.UntagCertificateAuthorityResult [^AbstractAWSACMPCA this ^com.amazonaws.services.acmpca.model.UntagCertificateAuthorityRequest request]
    (-> this (.untagCertificateAuthority request))))

(defn create-certificate-authority-audit-report
  "Description copied from interface: AWSACMPCA

  request - `com.amazonaws.services.acmpca.model.CreateCertificateAuthorityAuditReportRequest`

  returns: Result of the CreateCertificateAuthorityAuditReport operation returned by the service. - `com.amazonaws.services.acmpca.model.CreateCertificateAuthorityAuditReportResult`"
  (^com.amazonaws.services.acmpca.model.CreateCertificateAuthorityAuditReportResult [^AbstractAWSACMPCA this ^com.amazonaws.services.acmpca.model.CreateCertificateAuthorityAuditReportRequest request]
    (-> this (.createCertificateAuthorityAuditReport request))))

(defn list-tags
  "Description copied from interface: AWSACMPCA

  request - `com.amazonaws.services.acmpca.model.ListTagsRequest`

  returns: Result of the ListTags operation returned by the service. - `com.amazonaws.services.acmpca.model.ListTagsResult`"
  (^com.amazonaws.services.acmpca.model.ListTagsResult [^AbstractAWSACMPCA this ^com.amazonaws.services.acmpca.model.ListTagsRequest request]
    (-> this (.listTags request))))

(defn import-certificate-authority-certificate
  "Description copied from interface: AWSACMPCA

  request - `com.amazonaws.services.acmpca.model.ImportCertificateAuthorityCertificateRequest`

  returns: Result of the ImportCertificateAuthorityCertificate operation returned by the service. - `com.amazonaws.services.acmpca.model.ImportCertificateAuthorityCertificateResult`"
  (^com.amazonaws.services.acmpca.model.ImportCertificateAuthorityCertificateResult [^AbstractAWSACMPCA this ^com.amazonaws.services.acmpca.model.ImportCertificateAuthorityCertificateRequest request]
    (-> this (.importCertificateAuthorityCertificate request))))

(defn describe-certificate-authority
  "Description copied from interface: AWSACMPCA

  request - `com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityRequest`

  returns: Result of the DescribeCertificateAuthority operation returned by the service. - `com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityResult`"
  (^com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityResult [^AbstractAWSACMPCA this ^com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityRequest request]
    (-> this (.describeCertificateAuthority request))))

(defn list-permissions
  "Description copied from interface: AWSACMPCA

  request - `com.amazonaws.services.acmpca.model.ListPermissionsRequest`

  returns: Result of the ListPermissions operation returned by the service. - `com.amazonaws.services.acmpca.model.ListPermissionsResult`"
  (^com.amazonaws.services.acmpca.model.ListPermissionsResult [^AbstractAWSACMPCA this ^com.amazonaws.services.acmpca.model.ListPermissionsRequest request]
    (-> this (.listPermissions request))))

(defn delete-permission
  "Description copied from interface: AWSACMPCA

  request - `com.amazonaws.services.acmpca.model.DeletePermissionRequest`

  returns: Result of the DeletePermission operation returned by the service. - `com.amazonaws.services.acmpca.model.DeletePermissionResult`"
  (^com.amazonaws.services.acmpca.model.DeletePermissionResult [^AbstractAWSACMPCA this ^com.amazonaws.services.acmpca.model.DeletePermissionRequest request]
    (-> this (.deletePermission request))))

(defn shutdown
  "Description copied from interface: AWSACMPCA"
  ([^AbstractAWSACMPCA this]
    (-> this (.shutdown))))

(defn describe-certificate-authority-audit-report
  "Description copied from interface: AWSACMPCA

  request - `com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityAuditReportRequest`

  returns: Result of the DescribeCertificateAuthorityAuditReport operation returned by the service. - `com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityAuditReportResult`"
  (^com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityAuditReportResult [^AbstractAWSACMPCA this ^com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityAuditReportRequest request]
    (-> this (.describeCertificateAuthorityAuditReport request))))

(defn list-certificate-authorities
  "Description copied from interface: AWSACMPCA

  request - `com.amazonaws.services.acmpca.model.ListCertificateAuthoritiesRequest`

  returns: Result of the ListCertificateAuthorities operation returned by the service. - `com.amazonaws.services.acmpca.model.ListCertificateAuthoritiesResult`"
  (^com.amazonaws.services.acmpca.model.ListCertificateAuthoritiesResult [^AbstractAWSACMPCA this ^com.amazonaws.services.acmpca.model.ListCertificateAuthoritiesRequest request]
    (-> this (.listCertificateAuthorities request))))

(defn tag-certificate-authority
  "Description copied from interface: AWSACMPCA

  request - `com.amazonaws.services.acmpca.model.TagCertificateAuthorityRequest`

  returns: Result of the TagCertificateAuthority operation returned by the service. - `com.amazonaws.services.acmpca.model.TagCertificateAuthorityResult`"
  (^com.amazonaws.services.acmpca.model.TagCertificateAuthorityResult [^AbstractAWSACMPCA this ^com.amazonaws.services.acmpca.model.TagCertificateAuthorityRequest request]
    (-> this (.tagCertificateAuthority request))))

(defn issue-certificate
  "Description copied from interface: AWSACMPCA

  request - `com.amazonaws.services.acmpca.model.IssueCertificateRequest`

  returns: Result of the IssueCertificate operation returned by the service. - `com.amazonaws.services.acmpca.model.IssueCertificateResult`"
  (^com.amazonaws.services.acmpca.model.IssueCertificateResult [^AbstractAWSACMPCA this ^com.amazonaws.services.acmpca.model.IssueCertificateRequest request]
    (-> this (.issueCertificate request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSACMPCA

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSACMPCA this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-certificate
  "Description copied from interface: AWSACMPCA

  request - `com.amazonaws.services.acmpca.model.GetCertificateRequest`

  returns: Result of the GetCertificate operation returned by the service. - `com.amazonaws.services.acmpca.model.GetCertificateResult`"
  (^com.amazonaws.services.acmpca.model.GetCertificateResult [^AbstractAWSACMPCA this ^com.amazonaws.services.acmpca.model.GetCertificateRequest request]
    (-> this (.getCertificate request))))

(defn revoke-certificate
  "Description copied from interface: AWSACMPCA

  request - `com.amazonaws.services.acmpca.model.RevokeCertificateRequest`

  returns: Result of the RevokeCertificate operation returned by the service. - `com.amazonaws.services.acmpca.model.RevokeCertificateResult`"
  (^com.amazonaws.services.acmpca.model.RevokeCertificateResult [^AbstractAWSACMPCA this ^com.amazonaws.services.acmpca.model.RevokeCertificateRequest request]
    (-> this (.revokeCertificate request))))

(defn create-certificate-authority
  "Description copied from interface: AWSACMPCA

  request - `com.amazonaws.services.acmpca.model.CreateCertificateAuthorityRequest`

  returns: Result of the CreateCertificateAuthority operation returned by the service. - `com.amazonaws.services.acmpca.model.CreateCertificateAuthorityResult`"
  (^com.amazonaws.services.acmpca.model.CreateCertificateAuthorityResult [^AbstractAWSACMPCA this ^com.amazonaws.services.acmpca.model.CreateCertificateAuthorityRequest request]
    (-> this (.createCertificateAuthority request))))

(defn delete-certificate-authority
  "Description copied from interface: AWSACMPCA

  request - `com.amazonaws.services.acmpca.model.DeleteCertificateAuthorityRequest`

  returns: Result of the DeleteCertificateAuthority operation returned by the service. - `com.amazonaws.services.acmpca.model.DeleteCertificateAuthorityResult`"
  (^com.amazonaws.services.acmpca.model.DeleteCertificateAuthorityResult [^AbstractAWSACMPCA this ^com.amazonaws.services.acmpca.model.DeleteCertificateAuthorityRequest request]
    (-> this (.deleteCertificateAuthority request))))

(defn create-permission
  "Description copied from interface: AWSACMPCA

  request - `com.amazonaws.services.acmpca.model.CreatePermissionRequest`

  returns: Result of the CreatePermission operation returned by the service. - `com.amazonaws.services.acmpca.model.CreatePermissionResult`"
  (^com.amazonaws.services.acmpca.model.CreatePermissionResult [^AbstractAWSACMPCA this ^com.amazonaws.services.acmpca.model.CreatePermissionRequest request]
    (-> this (.createPermission request))))

(defn update-certificate-authority
  "Description copied from interface: AWSACMPCA

  request - `com.amazonaws.services.acmpca.model.UpdateCertificateAuthorityRequest`

  returns: Result of the UpdateCertificateAuthority operation returned by the service. - `com.amazonaws.services.acmpca.model.UpdateCertificateAuthorityResult`"
  (^com.amazonaws.services.acmpca.model.UpdateCertificateAuthorityResult [^AbstractAWSACMPCA this ^com.amazonaws.services.acmpca.model.UpdateCertificateAuthorityRequest request]
    (-> this (.updateCertificateAuthority request))))

(defn get-certificate-authority-certificate
  "Description copied from interface: AWSACMPCA

  request - `com.amazonaws.services.acmpca.model.GetCertificateAuthorityCertificateRequest`

  returns: Result of the GetCertificateAuthorityCertificate operation returned by the service. - `com.amazonaws.services.acmpca.model.GetCertificateAuthorityCertificateResult`"
  (^com.amazonaws.services.acmpca.model.GetCertificateAuthorityCertificateResult [^AbstractAWSACMPCA this ^com.amazonaws.services.acmpca.model.GetCertificateAuthorityCertificateRequest request]
    (-> this (.getCertificateAuthorityCertificate request))))

(defn get-certificate-authority-csr
  "Description copied from interface: AWSACMPCA

  request - `com.amazonaws.services.acmpca.model.GetCertificateAuthorityCsrRequest`

  returns: Result of the GetCertificateAuthorityCsr operation returned by the service. - `com.amazonaws.services.acmpca.model.GetCertificateAuthorityCsrResult`"
  (^com.amazonaws.services.acmpca.model.GetCertificateAuthorityCsrResult [^AbstractAWSACMPCA this ^com.amazonaws.services.acmpca.model.GetCertificateAuthorityCsrRequest request]
    (-> this (.getCertificateAuthorityCsr request))))

