(ns com.amazonaws.services.certificatemanager.AbstractAWSCertificateManagerAsync
  "Abstract implementation of AWSCertificateManagerAsync. Convenient method forms pass through to the
  corresponding overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.certificatemanager AbstractAWSCertificateManagerAsync]))

(defn export-certificate-async
  "Description copied from interface: AWSCertificateManagerAsync

  request - `com.amazonaws.services.certificatemanager.model.ExportCertificateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ExportCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.certificatemanager.model.ExportCertificateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCertificateManagerAsync this ^com.amazonaws.services.certificatemanager.model.ExportCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.exportCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCertificateManagerAsync this ^com.amazonaws.services.certificatemanager.model.ExportCertificateRequest request]
    (-> this (.exportCertificateAsync request))))

(defn resend-validation-email-async
  "Description copied from interface: AWSCertificateManagerAsync

  request - `com.amazonaws.services.certificatemanager.model.ResendValidationEmailRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResendValidationEmail operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.certificatemanager.model.ResendValidationEmailResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCertificateManagerAsync this ^com.amazonaws.services.certificatemanager.model.ResendValidationEmailRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resendValidationEmailAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCertificateManagerAsync this ^com.amazonaws.services.certificatemanager.model.ResendValidationEmailRequest request]
    (-> this (.resendValidationEmailAsync request))))

(defn remove-tags-from-certificate-async
  "Description copied from interface: AWSCertificateManagerAsync

  request - `com.amazonaws.services.certificatemanager.model.RemoveTagsFromCertificateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveTagsFromCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.certificatemanager.model.RemoveTagsFromCertificateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCertificateManagerAsync this ^com.amazonaws.services.certificatemanager.model.RemoveTagsFromCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeTagsFromCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCertificateManagerAsync this ^com.amazonaws.services.certificatemanager.model.RemoveTagsFromCertificateRequest request]
    (-> this (.removeTagsFromCertificateAsync request))))

(defn import-certificate-async
  "Description copied from interface: AWSCertificateManagerAsync

  request - `com.amazonaws.services.certificatemanager.model.ImportCertificateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ImportCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.certificatemanager.model.ImportCertificateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCertificateManagerAsync this ^com.amazonaws.services.certificatemanager.model.ImportCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.importCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCertificateManagerAsync this ^com.amazonaws.services.certificatemanager.model.ImportCertificateRequest request]
    (-> this (.importCertificateAsync request))))

(defn request-certificate-async
  "Description copied from interface: AWSCertificateManagerAsync

  request - `com.amazonaws.services.certificatemanager.model.RequestCertificateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RequestCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.certificatemanager.model.RequestCertificateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCertificateManagerAsync this ^com.amazonaws.services.certificatemanager.model.RequestCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.requestCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCertificateManagerAsync this ^com.amazonaws.services.certificatemanager.model.RequestCertificateRequest request]
    (-> this (.requestCertificateAsync request))))

(defn describe-certificate-async
  "Description copied from interface: AWSCertificateManagerAsync

  request - `com.amazonaws.services.certificatemanager.model.DescribeCertificateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.certificatemanager.model.DescribeCertificateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCertificateManagerAsync this ^com.amazonaws.services.certificatemanager.model.DescribeCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCertificateManagerAsync this ^com.amazonaws.services.certificatemanager.model.DescribeCertificateRequest request]
    (-> this (.describeCertificateAsync request))))

(defn update-certificate-options-async
  "Description copied from interface: AWSCertificateManagerAsync

  request - `com.amazonaws.services.certificatemanager.model.UpdateCertificateOptionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateCertificateOptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.certificatemanager.model.UpdateCertificateOptionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCertificateManagerAsync this ^com.amazonaws.services.certificatemanager.model.UpdateCertificateOptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateCertificateOptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCertificateManagerAsync this ^com.amazonaws.services.certificatemanager.model.UpdateCertificateOptionsRequest request]
    (-> this (.updateCertificateOptionsAsync request))))

(defn list-certificates-async
  "Description copied from interface: AWSCertificateManagerAsync

  request - `com.amazonaws.services.certificatemanager.model.ListCertificatesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListCertificates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.certificatemanager.model.ListCertificatesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCertificateManagerAsync this ^com.amazonaws.services.certificatemanager.model.ListCertificatesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listCertificatesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCertificateManagerAsync this ^com.amazonaws.services.certificatemanager.model.ListCertificatesRequest request]
    (-> this (.listCertificatesAsync request))))

(defn delete-certificate-async
  "Description copied from interface: AWSCertificateManagerAsync

  request - `com.amazonaws.services.certificatemanager.model.DeleteCertificateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.certificatemanager.model.DeleteCertificateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCertificateManagerAsync this ^com.amazonaws.services.certificatemanager.model.DeleteCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCertificateManagerAsync this ^com.amazonaws.services.certificatemanager.model.DeleteCertificateRequest request]
    (-> this (.deleteCertificateAsync request))))

(defn renew-certificate-async
  "Description copied from interface: AWSCertificateManagerAsync

  request - `com.amazonaws.services.certificatemanager.model.RenewCertificateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RenewCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.certificatemanager.model.RenewCertificateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCertificateManagerAsync this ^com.amazonaws.services.certificatemanager.model.RenewCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.renewCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCertificateManagerAsync this ^com.amazonaws.services.certificatemanager.model.RenewCertificateRequest request]
    (-> this (.renewCertificateAsync request))))

(defn get-certificate-async
  "Description copied from interface: AWSCertificateManagerAsync

  request - `com.amazonaws.services.certificatemanager.model.GetCertificateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.certificatemanager.model.GetCertificateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCertificateManagerAsync this ^com.amazonaws.services.certificatemanager.model.GetCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCertificateManagerAsync this ^com.amazonaws.services.certificatemanager.model.GetCertificateRequest request]
    (-> this (.getCertificateAsync request))))

(defn add-tags-to-certificate-async
  "Description copied from interface: AWSCertificateManagerAsync

  request - `com.amazonaws.services.certificatemanager.model.AddTagsToCertificateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddTagsToCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.certificatemanager.model.AddTagsToCertificateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCertificateManagerAsync this ^com.amazonaws.services.certificatemanager.model.AddTagsToCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addTagsToCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCertificateManagerAsync this ^com.amazonaws.services.certificatemanager.model.AddTagsToCertificateRequest request]
    (-> this (.addTagsToCertificateAsync request))))

(defn list-tags-for-certificate-async
  "Description copied from interface: AWSCertificateManagerAsync

  request - `com.amazonaws.services.certificatemanager.model.ListTagsForCertificateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.certificatemanager.model.ListTagsForCertificateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCertificateManagerAsync this ^com.amazonaws.services.certificatemanager.model.ListTagsForCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCertificateManagerAsync this ^com.amazonaws.services.certificatemanager.model.ListTagsForCertificateRequest request]
    (-> this (.listTagsForCertificateAsync request))))

