(ns com.amazonaws.services.licensemanager.AbstractAWSLicenseManagerAsync
  "Abstract implementation of AWSLicenseManagerAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.licensemanager AbstractAWSLicenseManagerAsync]))

(defn untag-resource-async
  "Description copied from interface: AWSLicenseManagerAsync

  request - `com.amazonaws.services.licensemanager.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn update-license-configuration-async
  "Description copied from interface: AWSLicenseManagerAsync

  request - `com.amazonaws.services.licensemanager.model.UpdateLicenseConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateLicenseConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.UpdateLicenseConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.UpdateLicenseConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateLicenseConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.UpdateLicenseConfigurationRequest request]
    (-> this (.updateLicenseConfigurationAsync request))))

(defn list-license-configurations-async
  "Description copied from interface: AWSLicenseManagerAsync

  request - `com.amazonaws.services.licensemanager.model.ListLicenseConfigurationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListLicenseConfigurations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.ListLicenseConfigurationsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.ListLicenseConfigurationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listLicenseConfigurationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.ListLicenseConfigurationsRequest request]
    (-> this (.listLicenseConfigurationsAsync request))))

(defn list-associations-for-license-configuration-async
  "Description copied from interface: AWSLicenseManagerAsync

  request - `com.amazonaws.services.licensemanager.model.ListAssociationsForLicenseConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAssociationsForLicenseConfiguration operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.ListAssociationsForLicenseConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.ListAssociationsForLicenseConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAssociationsForLicenseConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.ListAssociationsForLicenseConfigurationRequest request]
    (-> this (.listAssociationsForLicenseConfigurationAsync request))))

(defn delete-license-configuration-async
  "Description copied from interface: AWSLicenseManagerAsync

  request - `com.amazonaws.services.licensemanager.model.DeleteLicenseConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLicenseConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.DeleteLicenseConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.DeleteLicenseConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLicenseConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.DeleteLicenseConfigurationRequest request]
    (-> this (.deleteLicenseConfigurationAsync request))))

(defn list-resource-inventory-async
  "Description copied from interface: AWSLicenseManagerAsync

  request - `com.amazonaws.services.licensemanager.model.ListResourceInventoryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListResourceInventory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.ListResourceInventoryResult>`"
  (^java.util.concurrent.Future [^AbstractAWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.ListResourceInventoryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listResourceInventoryAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.ListResourceInventoryRequest request]
    (-> this (.listResourceInventoryAsync request))))

(defn create-license-configuration-async
  "Description copied from interface: AWSLicenseManagerAsync

  request - `com.amazonaws.services.licensemanager.model.CreateLicenseConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLicenseConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.CreateLicenseConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.CreateLicenseConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLicenseConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.CreateLicenseConfigurationRequest request]
    (-> this (.createLicenseConfigurationAsync request))))

(defn list-usage-for-license-configuration-async
  "Description copied from interface: AWSLicenseManagerAsync

  request - `com.amazonaws.services.licensemanager.model.ListUsageForLicenseConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUsageForLicenseConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.ListUsageForLicenseConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.ListUsageForLicenseConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUsageForLicenseConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.ListUsageForLicenseConfigurationRequest request]
    (-> this (.listUsageForLicenseConfigurationAsync request))))

(defn update-license-specifications-for-resource-async
  "Description copied from interface: AWSLicenseManagerAsync

  request - `com.amazonaws.services.licensemanager.model.UpdateLicenseSpecificationsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateLicenseSpecificationsForResource operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.UpdateLicenseSpecificationsForResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.UpdateLicenseSpecificationsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateLicenseSpecificationsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.UpdateLicenseSpecificationsForResourceRequest request]
    (-> this (.updateLicenseSpecificationsForResourceAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AWSLicenseManagerAsync

  request - `com.amazonaws.services.licensemanager.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn get-license-configuration-async
  "Description copied from interface: AWSLicenseManagerAsync

  request - `com.amazonaws.services.licensemanager.model.GetLicenseConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLicenseConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.GetLicenseConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.GetLicenseConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLicenseConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.GetLicenseConfigurationRequest request]
    (-> this (.getLicenseConfigurationAsync request))))

(defn update-service-settings-async
  "Description copied from interface: AWSLicenseManagerAsync

  request - `com.amazonaws.services.licensemanager.model.UpdateServiceSettingsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateServiceSettings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.UpdateServiceSettingsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.UpdateServiceSettingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateServiceSettingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.UpdateServiceSettingsRequest request]
    (-> this (.updateServiceSettingsAsync request))))

(defn list-license-specifications-for-resource-async
  "Description copied from interface: AWSLicenseManagerAsync

  request - `com.amazonaws.services.licensemanager.model.ListLicenseSpecificationsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListLicenseSpecificationsForResource operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.ListLicenseSpecificationsForResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.ListLicenseSpecificationsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listLicenseSpecificationsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.ListLicenseSpecificationsForResourceRequest request]
    (-> this (.listLicenseSpecificationsForResourceAsync request))))

(defn get-service-settings-async
  "Description copied from interface: AWSLicenseManagerAsync

  request - `com.amazonaws.services.licensemanager.model.GetServiceSettingsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetServiceSettings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.GetServiceSettingsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.GetServiceSettingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getServiceSettingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.GetServiceSettingsRequest request]
    (-> this (.getServiceSettingsAsync request))))

(defn tag-resource-async
  "Description copied from interface: AWSLicenseManagerAsync

  request - `com.amazonaws.services.licensemanager.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

