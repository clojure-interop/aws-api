(ns com.amazonaws.services.certificatemanager.AWSCertificateManagerAsyncClient
  "Client for accessing ACM asynchronously. Each asynchronous method will return a Java Future object representing the
  asynchronous operation; overloads which accept an AsyncHandler can be used to receive notification when an
  asynchronous operation completes.

  AWS Certificate Manager

  Welcome to the AWS Certificate Manager (ACM) API documentation.


  You can use ACM to manage SSL/TLS certificates for your AWS-based websites and applications. For general information
  about using ACM, see the  AWS Certificate Manager User
  Guide ."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.certificatemanager AWSCertificateManagerAsyncClient]))

(defn ->aws-certificate-manager-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AWSCertificateManagerAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AWSCertificateManagerAsyncClient aws-credentials client-configuration executor-service))
  (^AWSCertificateManagerAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AWSCertificateManagerAsyncClient aws-credentials executor-service))
  (^AWSCertificateManagerAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSCertificateManagerAsyncClient client-configuration))
  (^AWSCertificateManagerAsyncClient []
    (new AWSCertificateManagerAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.certificatemanager.AWSCertificateManagerAsyncClientBuilder`"
  (^com.amazonaws.services.certificatemanager.AWSCertificateManagerAsyncClientBuilder []
    (AWSCertificateManagerAsyncClient/asyncBuilder )))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSCertificateManagerAsyncClient this]
    (-> this (.getExecutorService))))

(defn export-certificate-async
  "Description copied from interface: AWSCertificateManagerAsync

  request - `com.amazonaws.services.certificatemanager.model.ExportCertificateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ExportCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.certificatemanager.model.ExportCertificateResult>`"
  (^java.util.concurrent.Future [^AWSCertificateManagerAsyncClient this ^com.amazonaws.services.certificatemanager.model.ExportCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.exportCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCertificateManagerAsyncClient this ^com.amazonaws.services.certificatemanager.model.ExportCertificateRequest request]
    (-> this (.exportCertificateAsync request))))

(defn resend-validation-email-async
  "Description copied from interface: AWSCertificateManagerAsync

  request - `com.amazonaws.services.certificatemanager.model.ResendValidationEmailRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResendValidationEmail operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.certificatemanager.model.ResendValidationEmailResult>`"
  (^java.util.concurrent.Future [^AWSCertificateManagerAsyncClient this ^com.amazonaws.services.certificatemanager.model.ResendValidationEmailRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resendValidationEmailAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCertificateManagerAsyncClient this ^com.amazonaws.services.certificatemanager.model.ResendValidationEmailRequest request]
    (-> this (.resendValidationEmailAsync request))))

(defn remove-tags-from-certificate-async
  "Description copied from interface: AWSCertificateManagerAsync

  request - `com.amazonaws.services.certificatemanager.model.RemoveTagsFromCertificateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveTagsFromCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.certificatemanager.model.RemoveTagsFromCertificateResult>`"
  (^java.util.concurrent.Future [^AWSCertificateManagerAsyncClient this ^com.amazonaws.services.certificatemanager.model.RemoveTagsFromCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeTagsFromCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCertificateManagerAsyncClient this ^com.amazonaws.services.certificatemanager.model.RemoveTagsFromCertificateRequest request]
    (-> this (.removeTagsFromCertificateAsync request))))

(defn import-certificate-async
  "Description copied from interface: AWSCertificateManagerAsync

  request - `com.amazonaws.services.certificatemanager.model.ImportCertificateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ImportCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.certificatemanager.model.ImportCertificateResult>`"
  (^java.util.concurrent.Future [^AWSCertificateManagerAsyncClient this ^com.amazonaws.services.certificatemanager.model.ImportCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.importCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCertificateManagerAsyncClient this ^com.amazonaws.services.certificatemanager.model.ImportCertificateRequest request]
    (-> this (.importCertificateAsync request))))

(defn request-certificate-async
  "Description copied from interface: AWSCertificateManagerAsync

  request - `com.amazonaws.services.certificatemanager.model.RequestCertificateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RequestCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.certificatemanager.model.RequestCertificateResult>`"
  (^java.util.concurrent.Future [^AWSCertificateManagerAsyncClient this ^com.amazonaws.services.certificatemanager.model.RequestCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.requestCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCertificateManagerAsyncClient this ^com.amazonaws.services.certificatemanager.model.RequestCertificateRequest request]
    (-> this (.requestCertificateAsync request))))

(defn describe-certificate-async
  "Description copied from interface: AWSCertificateManagerAsync

  request - `com.amazonaws.services.certificatemanager.model.DescribeCertificateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.certificatemanager.model.DescribeCertificateResult>`"
  (^java.util.concurrent.Future [^AWSCertificateManagerAsyncClient this ^com.amazonaws.services.certificatemanager.model.DescribeCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCertificateManagerAsyncClient this ^com.amazonaws.services.certificatemanager.model.DescribeCertificateRequest request]
    (-> this (.describeCertificateAsync request))))

(defn update-certificate-options-async
  "Description copied from interface: AWSCertificateManagerAsync

  request - `com.amazonaws.services.certificatemanager.model.UpdateCertificateOptionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateCertificateOptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.certificatemanager.model.UpdateCertificateOptionsResult>`"
  (^java.util.concurrent.Future [^AWSCertificateManagerAsyncClient this ^com.amazonaws.services.certificatemanager.model.UpdateCertificateOptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateCertificateOptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCertificateManagerAsyncClient this ^com.amazonaws.services.certificatemanager.model.UpdateCertificateOptionsRequest request]
    (-> this (.updateCertificateOptionsAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSCertificateManagerAsyncClient this]
    (-> this (.shutdown))))

(defn list-certificates-async
  "Description copied from interface: AWSCertificateManagerAsync

  request - `com.amazonaws.services.certificatemanager.model.ListCertificatesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListCertificates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.certificatemanager.model.ListCertificatesResult>`"
  (^java.util.concurrent.Future [^AWSCertificateManagerAsyncClient this ^com.amazonaws.services.certificatemanager.model.ListCertificatesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listCertificatesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCertificateManagerAsyncClient this ^com.amazonaws.services.certificatemanager.model.ListCertificatesRequest request]
    (-> this (.listCertificatesAsync request))))

(defn delete-certificate-async
  "Description copied from interface: AWSCertificateManagerAsync

  request - `com.amazonaws.services.certificatemanager.model.DeleteCertificateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.certificatemanager.model.DeleteCertificateResult>`"
  (^java.util.concurrent.Future [^AWSCertificateManagerAsyncClient this ^com.amazonaws.services.certificatemanager.model.DeleteCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCertificateManagerAsyncClient this ^com.amazonaws.services.certificatemanager.model.DeleteCertificateRequest request]
    (-> this (.deleteCertificateAsync request))))

(defn renew-certificate-async
  "Description copied from interface: AWSCertificateManagerAsync

  request - `com.amazonaws.services.certificatemanager.model.RenewCertificateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RenewCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.certificatemanager.model.RenewCertificateResult>`"
  (^java.util.concurrent.Future [^AWSCertificateManagerAsyncClient this ^com.amazonaws.services.certificatemanager.model.RenewCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.renewCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCertificateManagerAsyncClient this ^com.amazonaws.services.certificatemanager.model.RenewCertificateRequest request]
    (-> this (.renewCertificateAsync request))))

(defn get-certificate-async
  "Description copied from interface: AWSCertificateManagerAsync

  request - `com.amazonaws.services.certificatemanager.model.GetCertificateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.certificatemanager.model.GetCertificateResult>`"
  (^java.util.concurrent.Future [^AWSCertificateManagerAsyncClient this ^com.amazonaws.services.certificatemanager.model.GetCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCertificateManagerAsyncClient this ^com.amazonaws.services.certificatemanager.model.GetCertificateRequest request]
    (-> this (.getCertificateAsync request))))

(defn add-tags-to-certificate-async
  "Description copied from interface: AWSCertificateManagerAsync

  request - `com.amazonaws.services.certificatemanager.model.AddTagsToCertificateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddTagsToCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.certificatemanager.model.AddTagsToCertificateResult>`"
  (^java.util.concurrent.Future [^AWSCertificateManagerAsyncClient this ^com.amazonaws.services.certificatemanager.model.AddTagsToCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addTagsToCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCertificateManagerAsyncClient this ^com.amazonaws.services.certificatemanager.model.AddTagsToCertificateRequest request]
    (-> this (.addTagsToCertificateAsync request))))

(defn list-tags-for-certificate-async
  "Description copied from interface: AWSCertificateManagerAsync

  request - `com.amazonaws.services.certificatemanager.model.ListTagsForCertificateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.certificatemanager.model.ListTagsForCertificateResult>`"
  (^java.util.concurrent.Future [^AWSCertificateManagerAsyncClient this ^com.amazonaws.services.certificatemanager.model.ListTagsForCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCertificateManagerAsyncClient this ^com.amazonaws.services.certificatemanager.model.ListTagsForCertificateRequest request]
    (-> this (.listTagsForCertificateAsync request))))

