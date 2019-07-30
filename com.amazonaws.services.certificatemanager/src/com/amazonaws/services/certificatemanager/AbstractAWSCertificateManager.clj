(ns com.amazonaws.services.certificatemanager.AbstractAWSCertificateManager
  "Abstract implementation of AWSCertificateManager. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.certificatemanager AbstractAWSCertificateManager]))

(defn set-region
  "Description copied from interface: AWSCertificateManager

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAWSCertificateManager this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn waiters
  "returns: `com.amazonaws.services.certificatemanager.waiters.AWSCertificateManagerWaiters`"
  (^com.amazonaws.services.certificatemanager.waiters.AWSCertificateManagerWaiters [^AbstractAWSCertificateManager this]
    (-> this (.waiters))))

(defn list-certificates
  "Description copied from interface: AWSCertificateManager

  request - `com.amazonaws.services.certificatemanager.model.ListCertificatesRequest`

  returns: Result of the ListCertificates operation returned by the service. - `com.amazonaws.services.certificatemanager.model.ListCertificatesResult`"
  (^com.amazonaws.services.certificatemanager.model.ListCertificatesResult [^AbstractAWSCertificateManager this ^com.amazonaws.services.certificatemanager.model.ListCertificatesRequest request]
    (-> this (.listCertificates request))))

(defn renew-certificate
  "Description copied from interface: AWSCertificateManager

  request - `com.amazonaws.services.certificatemanager.model.RenewCertificateRequest`

  returns: Result of the RenewCertificate operation returned by the service. - `com.amazonaws.services.certificatemanager.model.RenewCertificateResult`"
  (^com.amazonaws.services.certificatemanager.model.RenewCertificateResult [^AbstractAWSCertificateManager this ^com.amazonaws.services.certificatemanager.model.RenewCertificateRequest request]
    (-> this (.renewCertificate request))))

(defn import-certificate
  "Description copied from interface: AWSCertificateManager

  request - `com.amazonaws.services.certificatemanager.model.ImportCertificateRequest`

  returns: Result of the ImportCertificate operation returned by the service. - `com.amazonaws.services.certificatemanager.model.ImportCertificateResult`"
  (^com.amazonaws.services.certificatemanager.model.ImportCertificateResult [^AbstractAWSCertificateManager this ^com.amazonaws.services.certificatemanager.model.ImportCertificateRequest request]
    (-> this (.importCertificate request))))

(defn request-certificate
  "Description copied from interface: AWSCertificateManager

  request - `com.amazonaws.services.certificatemanager.model.RequestCertificateRequest`

  returns: Result of the RequestCertificate operation returned by the service. - `com.amazonaws.services.certificatemanager.model.RequestCertificateResult`"
  (^com.amazonaws.services.certificatemanager.model.RequestCertificateResult [^AbstractAWSCertificateManager this ^com.amazonaws.services.certificatemanager.model.RequestCertificateRequest request]
    (-> this (.requestCertificate request))))

(defn export-certificate
  "Description copied from interface: AWSCertificateManager

  request - `com.amazonaws.services.certificatemanager.model.ExportCertificateRequest`

  returns: Result of the ExportCertificate operation returned by the service. - `com.amazonaws.services.certificatemanager.model.ExportCertificateResult`"
  (^com.amazonaws.services.certificatemanager.model.ExportCertificateResult [^AbstractAWSCertificateManager this ^com.amazonaws.services.certificatemanager.model.ExportCertificateRequest request]
    (-> this (.exportCertificate request))))

(defn shutdown
  "Description copied from interface: AWSCertificateManager"
  ([^AbstractAWSCertificateManager this]
    (-> this (.shutdown))))

(defn describe-certificate
  "Description copied from interface: AWSCertificateManager

  request - `com.amazonaws.services.certificatemanager.model.DescribeCertificateRequest`

  returns: Result of the DescribeCertificate operation returned by the service. - `com.amazonaws.services.certificatemanager.model.DescribeCertificateResult`"
  (^com.amazonaws.services.certificatemanager.model.DescribeCertificateResult [^AbstractAWSCertificateManager this ^com.amazonaws.services.certificatemanager.model.DescribeCertificateRequest request]
    (-> this (.describeCertificate request))))

(defn set-endpoint
  "Description copied from interface: AWSCertificateManager

  endpoint - The endpoint (ex: \"acm.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://acm.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAWSCertificateManager this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn delete-certificate
  "Description copied from interface: AWSCertificateManager

  request - `com.amazonaws.services.certificatemanager.model.DeleteCertificateRequest`

  returns: Result of the DeleteCertificate operation returned by the service. - `com.amazonaws.services.certificatemanager.model.DeleteCertificateResult`"
  (^com.amazonaws.services.certificatemanager.model.DeleteCertificateResult [^AbstractAWSCertificateManager this ^com.amazonaws.services.certificatemanager.model.DeleteCertificateRequest request]
    (-> this (.deleteCertificate request))))

(defn remove-tags-from-certificate
  "Description copied from interface: AWSCertificateManager

  request - `com.amazonaws.services.certificatemanager.model.RemoveTagsFromCertificateRequest`

  returns: Result of the RemoveTagsFromCertificate operation returned by the service. - `com.amazonaws.services.certificatemanager.model.RemoveTagsFromCertificateResult`"
  (^com.amazonaws.services.certificatemanager.model.RemoveTagsFromCertificateResult [^AbstractAWSCertificateManager this ^com.amazonaws.services.certificatemanager.model.RemoveTagsFromCertificateRequest request]
    (-> this (.removeTagsFromCertificate request))))

(defn list-tags-for-certificate
  "Description copied from interface: AWSCertificateManager

  request - `com.amazonaws.services.certificatemanager.model.ListTagsForCertificateRequest`

  returns: Result of the ListTagsForCertificate operation returned by the service. - `com.amazonaws.services.certificatemanager.model.ListTagsForCertificateResult`"
  (^com.amazonaws.services.certificatemanager.model.ListTagsForCertificateResult [^AbstractAWSCertificateManager this ^com.amazonaws.services.certificatemanager.model.ListTagsForCertificateRequest request]
    (-> this (.listTagsForCertificate request))))

(defn resend-validation-email
  "Description copied from interface: AWSCertificateManager

  request - `com.amazonaws.services.certificatemanager.model.ResendValidationEmailRequest`

  returns: Result of the ResendValidationEmail operation returned by the service. - `com.amazonaws.services.certificatemanager.model.ResendValidationEmailResult`"
  (^com.amazonaws.services.certificatemanager.model.ResendValidationEmailResult [^AbstractAWSCertificateManager this ^com.amazonaws.services.certificatemanager.model.ResendValidationEmailRequest request]
    (-> this (.resendValidationEmail request))))

(defn update-certificate-options
  "Description copied from interface: AWSCertificateManager

  request - `com.amazonaws.services.certificatemanager.model.UpdateCertificateOptionsRequest`

  returns: Result of the UpdateCertificateOptions operation returned by the service. - `com.amazonaws.services.certificatemanager.model.UpdateCertificateOptionsResult`"
  (^com.amazonaws.services.certificatemanager.model.UpdateCertificateOptionsResult [^AbstractAWSCertificateManager this ^com.amazonaws.services.certificatemanager.model.UpdateCertificateOptionsRequest request]
    (-> this (.updateCertificateOptions request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSCertificateManager

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSCertificateManager this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-certificate
  "Description copied from interface: AWSCertificateManager

  request - `com.amazonaws.services.certificatemanager.model.GetCertificateRequest`

  returns: Result of the GetCertificate operation returned by the service. - `com.amazonaws.services.certificatemanager.model.GetCertificateResult`"
  (^com.amazonaws.services.certificatemanager.model.GetCertificateResult [^AbstractAWSCertificateManager this ^com.amazonaws.services.certificatemanager.model.GetCertificateRequest request]
    (-> this (.getCertificate request))))

(defn add-tags-to-certificate
  "Description copied from interface: AWSCertificateManager

  request - `com.amazonaws.services.certificatemanager.model.AddTagsToCertificateRequest`

  returns: Result of the AddTagsToCertificate operation returned by the service. - `com.amazonaws.services.certificatemanager.model.AddTagsToCertificateResult`"
  (^com.amazonaws.services.certificatemanager.model.AddTagsToCertificateResult [^AbstractAWSCertificateManager this ^com.amazonaws.services.certificatemanager.model.AddTagsToCertificateRequest request]
    (-> this (.addTagsToCertificate request))))

