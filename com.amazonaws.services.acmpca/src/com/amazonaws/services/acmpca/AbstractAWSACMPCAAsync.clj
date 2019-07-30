(ns com.amazonaws.services.acmpca.AbstractAWSACMPCAAsync
  "Abstract implementation of AWSACMPCAAsync. Convenient method forms pass through to the corresponding overload
  that takes a request object and an AsyncHandler, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.acmpca AbstractAWSACMPCAAsync]))

(defn issue-certificate-async
  "Description copied from interface: AWSACMPCAAsync

  request - `com.amazonaws.services.acmpca.model.IssueCertificateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the IssueCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.acmpca.model.IssueCertificateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSACMPCAAsync this ^com.amazonaws.services.acmpca.model.IssueCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.issueCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSACMPCAAsync this ^com.amazonaws.services.acmpca.model.IssueCertificateRequest request]
    (-> this (.issueCertificateAsync request))))

(defn update-certificate-authority-async
  "Description copied from interface: AWSACMPCAAsync

  request - `com.amazonaws.services.acmpca.model.UpdateCertificateAuthorityRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateCertificateAuthority operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.acmpca.model.UpdateCertificateAuthorityResult>`"
  (^java.util.concurrent.Future [^AbstractAWSACMPCAAsync this ^com.amazonaws.services.acmpca.model.UpdateCertificateAuthorityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateCertificateAuthorityAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSACMPCAAsync this ^com.amazonaws.services.acmpca.model.UpdateCertificateAuthorityRequest request]
    (-> this (.updateCertificateAuthorityAsync request))))

(defn list-tags-async
  "Description copied from interface: AWSACMPCAAsync

  request - `com.amazonaws.services.acmpca.model.ListTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.acmpca.model.ListTagsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSACMPCAAsync this ^com.amazonaws.services.acmpca.model.ListTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSACMPCAAsync this ^com.amazonaws.services.acmpca.model.ListTagsRequest request]
    (-> this (.listTagsAsync request))))

(defn describe-certificate-authority-async
  "Description copied from interface: AWSACMPCAAsync

  request - `com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCertificateAuthority operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityResult>`"
  (^java.util.concurrent.Future [^AbstractAWSACMPCAAsync this ^com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCertificateAuthorityAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSACMPCAAsync this ^com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityRequest request]
    (-> this (.describeCertificateAuthorityAsync request))))

(defn delete-permission-async
  "Description copied from interface: AWSACMPCAAsync

  request - `com.amazonaws.services.acmpca.model.DeletePermissionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePermission operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.acmpca.model.DeletePermissionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSACMPCAAsync this ^com.amazonaws.services.acmpca.model.DeletePermissionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePermissionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSACMPCAAsync this ^com.amazonaws.services.acmpca.model.DeletePermissionRequest request]
    (-> this (.deletePermissionAsync request))))

(defn untag-certificate-authority-async
  "Description copied from interface: AWSACMPCAAsync

  request - `com.amazonaws.services.acmpca.model.UntagCertificateAuthorityRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagCertificateAuthority operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.acmpca.model.UntagCertificateAuthorityResult>`"
  (^java.util.concurrent.Future [^AbstractAWSACMPCAAsync this ^com.amazonaws.services.acmpca.model.UntagCertificateAuthorityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagCertificateAuthorityAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSACMPCAAsync this ^com.amazonaws.services.acmpca.model.UntagCertificateAuthorityRequest request]
    (-> this (.untagCertificateAuthorityAsync request))))

(defn get-certificate-authority-certificate-async
  "Description copied from interface: AWSACMPCAAsync

  request - `com.amazonaws.services.acmpca.model.GetCertificateAuthorityCertificateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCertificateAuthorityCertificate operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.acmpca.model.GetCertificateAuthorityCertificateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSACMPCAAsync this ^com.amazonaws.services.acmpca.model.GetCertificateAuthorityCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCertificateAuthorityCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSACMPCAAsync this ^com.amazonaws.services.acmpca.model.GetCertificateAuthorityCertificateRequest request]
    (-> this (.getCertificateAuthorityCertificateAsync request))))

(defn revoke-certificate-async
  "Description copied from interface: AWSACMPCAAsync

  request - `com.amazonaws.services.acmpca.model.RevokeCertificateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RevokeCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.acmpca.model.RevokeCertificateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSACMPCAAsync this ^com.amazonaws.services.acmpca.model.RevokeCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.revokeCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSACMPCAAsync this ^com.amazonaws.services.acmpca.model.RevokeCertificateRequest request]
    (-> this (.revokeCertificateAsync request))))

(defn create-certificate-authority-audit-report-async
  "Description copied from interface: AWSACMPCAAsync

  request - `com.amazonaws.services.acmpca.model.CreateCertificateAuthorityAuditReportRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCertificateAuthorityAuditReport operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.acmpca.model.CreateCertificateAuthorityAuditReportResult>`"
  (^java.util.concurrent.Future [^AbstractAWSACMPCAAsync this ^com.amazonaws.services.acmpca.model.CreateCertificateAuthorityAuditReportRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCertificateAuthorityAuditReportAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSACMPCAAsync this ^com.amazonaws.services.acmpca.model.CreateCertificateAuthorityAuditReportRequest request]
    (-> this (.createCertificateAuthorityAuditReportAsync request))))

(defn get-certificate-async
  "Description copied from interface: AWSACMPCAAsync

  request - `com.amazonaws.services.acmpca.model.GetCertificateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.acmpca.model.GetCertificateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSACMPCAAsync this ^com.amazonaws.services.acmpca.model.GetCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSACMPCAAsync this ^com.amazonaws.services.acmpca.model.GetCertificateRequest request]
    (-> this (.getCertificateAsync request))))

(defn restore-certificate-authority-async
  "Description copied from interface: AWSACMPCAAsync

  request - `com.amazonaws.services.acmpca.model.RestoreCertificateAuthorityRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestoreCertificateAuthority operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.acmpca.model.RestoreCertificateAuthorityResult>`"
  (^java.util.concurrent.Future [^AbstractAWSACMPCAAsync this ^com.amazonaws.services.acmpca.model.RestoreCertificateAuthorityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restoreCertificateAuthorityAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSACMPCAAsync this ^com.amazonaws.services.acmpca.model.RestoreCertificateAuthorityRequest request]
    (-> this (.restoreCertificateAuthorityAsync request))))

(defn describe-certificate-authority-audit-report-async
  "Description copied from interface: AWSACMPCAAsync

  request - `com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityAuditReportRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCertificateAuthorityAuditReport operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityAuditReportResult>`"
  (^java.util.concurrent.Future [^AbstractAWSACMPCAAsync this ^com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityAuditReportRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCertificateAuthorityAuditReportAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSACMPCAAsync this ^com.amazonaws.services.acmpca.model.DescribeCertificateAuthorityAuditReportRequest request]
    (-> this (.describeCertificateAuthorityAuditReportAsync request))))

(defn delete-certificate-authority-async
  "Description copied from interface: AWSACMPCAAsync

  request - `com.amazonaws.services.acmpca.model.DeleteCertificateAuthorityRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCertificateAuthority operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.acmpca.model.DeleteCertificateAuthorityResult>`"
  (^java.util.concurrent.Future [^AbstractAWSACMPCAAsync this ^com.amazonaws.services.acmpca.model.DeleteCertificateAuthorityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCertificateAuthorityAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSACMPCAAsync this ^com.amazonaws.services.acmpca.model.DeleteCertificateAuthorityRequest request]
    (-> this (.deleteCertificateAuthorityAsync request))))

(defn get-certificate-authority-csr-async
  "Description copied from interface: AWSACMPCAAsync

  request - `com.amazonaws.services.acmpca.model.GetCertificateAuthorityCsrRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCertificateAuthorityCsr operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.acmpca.model.GetCertificateAuthorityCsrResult>`"
  (^java.util.concurrent.Future [^AbstractAWSACMPCAAsync this ^com.amazonaws.services.acmpca.model.GetCertificateAuthorityCsrRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCertificateAuthorityCsrAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSACMPCAAsync this ^com.amazonaws.services.acmpca.model.GetCertificateAuthorityCsrRequest request]
    (-> this (.getCertificateAuthorityCsrAsync request))))

(defn list-certificate-authorities-async
  "Description copied from interface: AWSACMPCAAsync

  request - `com.amazonaws.services.acmpca.model.ListCertificateAuthoritiesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListCertificateAuthorities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.acmpca.model.ListCertificateAuthoritiesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSACMPCAAsync this ^com.amazonaws.services.acmpca.model.ListCertificateAuthoritiesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listCertificateAuthoritiesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSACMPCAAsync this ^com.amazonaws.services.acmpca.model.ListCertificateAuthoritiesRequest request]
    (-> this (.listCertificateAuthoritiesAsync request))))

(defn create-permission-async
  "Description copied from interface: AWSACMPCAAsync

  request - `com.amazonaws.services.acmpca.model.CreatePermissionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePermission operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.acmpca.model.CreatePermissionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSACMPCAAsync this ^com.amazonaws.services.acmpca.model.CreatePermissionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPermissionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSACMPCAAsync this ^com.amazonaws.services.acmpca.model.CreatePermissionRequest request]
    (-> this (.createPermissionAsync request))))

(defn list-permissions-async
  "Description copied from interface: AWSACMPCAAsync

  request - `com.amazonaws.services.acmpca.model.ListPermissionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPermissions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.acmpca.model.ListPermissionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSACMPCAAsync this ^com.amazonaws.services.acmpca.model.ListPermissionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPermissionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSACMPCAAsync this ^com.amazonaws.services.acmpca.model.ListPermissionsRequest request]
    (-> this (.listPermissionsAsync request))))

(defn tag-certificate-authority-async
  "Description copied from interface: AWSACMPCAAsync

  request - `com.amazonaws.services.acmpca.model.TagCertificateAuthorityRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagCertificateAuthority operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.acmpca.model.TagCertificateAuthorityResult>`"
  (^java.util.concurrent.Future [^AbstractAWSACMPCAAsync this ^com.amazonaws.services.acmpca.model.TagCertificateAuthorityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagCertificateAuthorityAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSACMPCAAsync this ^com.amazonaws.services.acmpca.model.TagCertificateAuthorityRequest request]
    (-> this (.tagCertificateAuthorityAsync request))))

(defn import-certificate-authority-certificate-async
  "Description copied from interface: AWSACMPCAAsync

  request - `com.amazonaws.services.acmpca.model.ImportCertificateAuthorityCertificateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ImportCertificateAuthorityCertificate operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.acmpca.model.ImportCertificateAuthorityCertificateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSACMPCAAsync this ^com.amazonaws.services.acmpca.model.ImportCertificateAuthorityCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.importCertificateAuthorityCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSACMPCAAsync this ^com.amazonaws.services.acmpca.model.ImportCertificateAuthorityCertificateRequest request]
    (-> this (.importCertificateAuthorityCertificateAsync request))))

(defn create-certificate-authority-async
  "Description copied from interface: AWSACMPCAAsync

  request - `com.amazonaws.services.acmpca.model.CreateCertificateAuthorityRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCertificateAuthority operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.acmpca.model.CreateCertificateAuthorityResult>`"
  (^java.util.concurrent.Future [^AbstractAWSACMPCAAsync this ^com.amazonaws.services.acmpca.model.CreateCertificateAuthorityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCertificateAuthorityAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSACMPCAAsync this ^com.amazonaws.services.acmpca.model.CreateCertificateAuthorityRequest request]
    (-> this (.createCertificateAuthorityAsync request))))

