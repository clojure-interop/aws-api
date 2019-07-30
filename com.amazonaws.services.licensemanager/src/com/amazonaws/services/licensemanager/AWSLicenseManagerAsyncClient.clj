(ns com.amazonaws.services.licensemanager.AWSLicenseManagerAsyncClient
  "Client for accessing AWS License Manager asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

   AWS License Manager

  This is the AWS License Manager API Reference. It provides descriptions, syntax, and usage examples for each
  of the actions and data types for License Manager. The topic for each action shows the Query API request parameters
  and the XML response. You can also view the XML request elements in the WSDL.


  Alternatively, you can use one of the AWS SDKs to access an API that's tailored to the programming language or
  platform that you're using. For more information, see AWS SDKs."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.licensemanager AWSLicenseManagerAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.licensemanager.AWSLicenseManagerAsyncClientBuilder`"
  (^com.amazonaws.services.licensemanager.AWSLicenseManagerAsyncClientBuilder []
    (AWSLicenseManagerAsyncClient/asyncBuilder )))

(defn untag-resource-async
  "Description copied from interface: AWSLicenseManagerAsync

  request - `com.amazonaws.services.licensemanager.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSLicenseManagerAsyncClient this ^com.amazonaws.services.licensemanager.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLicenseManagerAsyncClient this ^com.amazonaws.services.licensemanager.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn update-license-configuration-async
  "Description copied from interface: AWSLicenseManagerAsync

  request - `com.amazonaws.services.licensemanager.model.UpdateLicenseConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateLicenseConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.UpdateLicenseConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSLicenseManagerAsyncClient this ^com.amazonaws.services.licensemanager.model.UpdateLicenseConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateLicenseConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLicenseManagerAsyncClient this ^com.amazonaws.services.licensemanager.model.UpdateLicenseConfigurationRequest request]
    (-> this (.updateLicenseConfigurationAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSLicenseManagerAsyncClient this]
    (-> this (.getExecutorService))))

(defn list-license-configurations-async
  "Description copied from interface: AWSLicenseManagerAsync

  request - `com.amazonaws.services.licensemanager.model.ListLicenseConfigurationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListLicenseConfigurations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.ListLicenseConfigurationsResult>`"
  (^java.util.concurrent.Future [^AWSLicenseManagerAsyncClient this ^com.amazonaws.services.licensemanager.model.ListLicenseConfigurationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listLicenseConfigurationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLicenseManagerAsyncClient this ^com.amazonaws.services.licensemanager.model.ListLicenseConfigurationsRequest request]
    (-> this (.listLicenseConfigurationsAsync request))))

(defn list-associations-for-license-configuration-async
  "Description copied from interface: AWSLicenseManagerAsync

  request - `com.amazonaws.services.licensemanager.model.ListAssociationsForLicenseConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAssociationsForLicenseConfiguration operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.ListAssociationsForLicenseConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSLicenseManagerAsyncClient this ^com.amazonaws.services.licensemanager.model.ListAssociationsForLicenseConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAssociationsForLicenseConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLicenseManagerAsyncClient this ^com.amazonaws.services.licensemanager.model.ListAssociationsForLicenseConfigurationRequest request]
    (-> this (.listAssociationsForLicenseConfigurationAsync request))))

(defn delete-license-configuration-async
  "Description copied from interface: AWSLicenseManagerAsync

  request - `com.amazonaws.services.licensemanager.model.DeleteLicenseConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLicenseConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.DeleteLicenseConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSLicenseManagerAsyncClient this ^com.amazonaws.services.licensemanager.model.DeleteLicenseConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLicenseConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLicenseManagerAsyncClient this ^com.amazonaws.services.licensemanager.model.DeleteLicenseConfigurationRequest request]
    (-> this (.deleteLicenseConfigurationAsync request))))

(defn list-resource-inventory-async
  "Description copied from interface: AWSLicenseManagerAsync

  request - `com.amazonaws.services.licensemanager.model.ListResourceInventoryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListResourceInventory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.ListResourceInventoryResult>`"
  (^java.util.concurrent.Future [^AWSLicenseManagerAsyncClient this ^com.amazonaws.services.licensemanager.model.ListResourceInventoryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listResourceInventoryAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLicenseManagerAsyncClient this ^com.amazonaws.services.licensemanager.model.ListResourceInventoryRequest request]
    (-> this (.listResourceInventoryAsync request))))

(defn create-license-configuration-async
  "Description copied from interface: AWSLicenseManagerAsync

  request - `com.amazonaws.services.licensemanager.model.CreateLicenseConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLicenseConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.CreateLicenseConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSLicenseManagerAsyncClient this ^com.amazonaws.services.licensemanager.model.CreateLicenseConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLicenseConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLicenseManagerAsyncClient this ^com.amazonaws.services.licensemanager.model.CreateLicenseConfigurationRequest request]
    (-> this (.createLicenseConfigurationAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSLicenseManagerAsyncClient this]
    (-> this (.shutdown))))

(defn list-usage-for-license-configuration-async
  "Description copied from interface: AWSLicenseManagerAsync

  request - `com.amazonaws.services.licensemanager.model.ListUsageForLicenseConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUsageForLicenseConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.ListUsageForLicenseConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSLicenseManagerAsyncClient this ^com.amazonaws.services.licensemanager.model.ListUsageForLicenseConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUsageForLicenseConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLicenseManagerAsyncClient this ^com.amazonaws.services.licensemanager.model.ListUsageForLicenseConfigurationRequest request]
    (-> this (.listUsageForLicenseConfigurationAsync request))))

(defn update-license-specifications-for-resource-async
  "Description copied from interface: AWSLicenseManagerAsync

  request - `com.amazonaws.services.licensemanager.model.UpdateLicenseSpecificationsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateLicenseSpecificationsForResource operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.UpdateLicenseSpecificationsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSLicenseManagerAsyncClient this ^com.amazonaws.services.licensemanager.model.UpdateLicenseSpecificationsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateLicenseSpecificationsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLicenseManagerAsyncClient this ^com.amazonaws.services.licensemanager.model.UpdateLicenseSpecificationsForResourceRequest request]
    (-> this (.updateLicenseSpecificationsForResourceAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AWSLicenseManagerAsync

  request - `com.amazonaws.services.licensemanager.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSLicenseManagerAsyncClient this ^com.amazonaws.services.licensemanager.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLicenseManagerAsyncClient this ^com.amazonaws.services.licensemanager.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn get-license-configuration-async
  "Description copied from interface: AWSLicenseManagerAsync

  request - `com.amazonaws.services.licensemanager.model.GetLicenseConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLicenseConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.GetLicenseConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSLicenseManagerAsyncClient this ^com.amazonaws.services.licensemanager.model.GetLicenseConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLicenseConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLicenseManagerAsyncClient this ^com.amazonaws.services.licensemanager.model.GetLicenseConfigurationRequest request]
    (-> this (.getLicenseConfigurationAsync request))))

(defn update-service-settings-async
  "Description copied from interface: AWSLicenseManagerAsync

  request - `com.amazonaws.services.licensemanager.model.UpdateServiceSettingsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateServiceSettings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.UpdateServiceSettingsResult>`"
  (^java.util.concurrent.Future [^AWSLicenseManagerAsyncClient this ^com.amazonaws.services.licensemanager.model.UpdateServiceSettingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateServiceSettingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLicenseManagerAsyncClient this ^com.amazonaws.services.licensemanager.model.UpdateServiceSettingsRequest request]
    (-> this (.updateServiceSettingsAsync request))))

(defn list-license-specifications-for-resource-async
  "Description copied from interface: AWSLicenseManagerAsync

  request - `com.amazonaws.services.licensemanager.model.ListLicenseSpecificationsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListLicenseSpecificationsForResource operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.ListLicenseSpecificationsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSLicenseManagerAsyncClient this ^com.amazonaws.services.licensemanager.model.ListLicenseSpecificationsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listLicenseSpecificationsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLicenseManagerAsyncClient this ^com.amazonaws.services.licensemanager.model.ListLicenseSpecificationsForResourceRequest request]
    (-> this (.listLicenseSpecificationsForResourceAsync request))))

(defn get-service-settings-async
  "Description copied from interface: AWSLicenseManagerAsync

  request - `com.amazonaws.services.licensemanager.model.GetServiceSettingsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetServiceSettings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.GetServiceSettingsResult>`"
  (^java.util.concurrent.Future [^AWSLicenseManagerAsyncClient this ^com.amazonaws.services.licensemanager.model.GetServiceSettingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getServiceSettingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLicenseManagerAsyncClient this ^com.amazonaws.services.licensemanager.model.GetServiceSettingsRequest request]
    (-> this (.getServiceSettingsAsync request))))

(defn tag-resource-async
  "Description copied from interface: AWSLicenseManagerAsync

  request - `com.amazonaws.services.licensemanager.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSLicenseManagerAsyncClient this ^com.amazonaws.services.licensemanager.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLicenseManagerAsyncClient this ^com.amazonaws.services.licensemanager.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

