(ns com.amazonaws.services.licensemanager.AbstractAWSLicenseManager
  "Abstract implementation of AWSLicenseManager. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.licensemanager AbstractAWSLicenseManager]))

(defn list-tags-for-resource
  "Description copied from interface: AWSLicenseManager

  request - `com.amazonaws.services.licensemanager.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.licensemanager.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.licensemanager.model.ListTagsForResourceResult [^AbstractAWSLicenseManager this ^com.amazonaws.services.licensemanager.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn update-license-specifications-for-resource
  "Description copied from interface: AWSLicenseManager

  request - `com.amazonaws.services.licensemanager.model.UpdateLicenseSpecificationsForResourceRequest`

  returns: Result of the UpdateLicenseSpecificationsForResource operation returned by the service. - `com.amazonaws.services.licensemanager.model.UpdateLicenseSpecificationsForResourceResult`"
  (^com.amazonaws.services.licensemanager.model.UpdateLicenseSpecificationsForResourceResult [^AbstractAWSLicenseManager this ^com.amazonaws.services.licensemanager.model.UpdateLicenseSpecificationsForResourceRequest request]
    (-> this (.updateLicenseSpecificationsForResource request))))

(defn list-usage-for-license-configuration
  "Description copied from interface: AWSLicenseManager

  request - `com.amazonaws.services.licensemanager.model.ListUsageForLicenseConfigurationRequest`

  returns: Result of the ListUsageForLicenseConfiguration operation returned by the service. - `com.amazonaws.services.licensemanager.model.ListUsageForLicenseConfigurationResult`"
  (^com.amazonaws.services.licensemanager.model.ListUsageForLicenseConfigurationResult [^AbstractAWSLicenseManager this ^com.amazonaws.services.licensemanager.model.ListUsageForLicenseConfigurationRequest request]
    (-> this (.listUsageForLicenseConfiguration request))))

(defn get-license-configuration
  "Description copied from interface: AWSLicenseManager

  request - `com.amazonaws.services.licensemanager.model.GetLicenseConfigurationRequest`

  returns: Result of the GetLicenseConfiguration operation returned by the service. - `com.amazonaws.services.licensemanager.model.GetLicenseConfigurationResult`"
  (^com.amazonaws.services.licensemanager.model.GetLicenseConfigurationResult [^AbstractAWSLicenseManager this ^com.amazonaws.services.licensemanager.model.GetLicenseConfigurationRequest request]
    (-> this (.getLicenseConfiguration request))))

(defn update-service-settings
  "Description copied from interface: AWSLicenseManager

  request - `com.amazonaws.services.licensemanager.model.UpdateServiceSettingsRequest`

  returns: Result of the UpdateServiceSettings operation returned by the service. - `com.amazonaws.services.licensemanager.model.UpdateServiceSettingsResult`"
  (^com.amazonaws.services.licensemanager.model.UpdateServiceSettingsResult [^AbstractAWSLicenseManager this ^com.amazonaws.services.licensemanager.model.UpdateServiceSettingsRequest request]
    (-> this (.updateServiceSettings request))))

(defn untag-resource
  "Description copied from interface: AWSLicenseManager

  request - `com.amazonaws.services.licensemanager.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.licensemanager.model.UntagResourceResult`"
  (^com.amazonaws.services.licensemanager.model.UntagResourceResult [^AbstractAWSLicenseManager this ^com.amazonaws.services.licensemanager.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn shutdown
  "Description copied from interface: AWSLicenseManager"
  ([^AbstractAWSLicenseManager this]
    (-> this (.shutdown))))

(defn get-service-settings
  "Description copied from interface: AWSLicenseManager

  request - `com.amazonaws.services.licensemanager.model.GetServiceSettingsRequest`

  returns: Result of the GetServiceSettings operation returned by the service. - `com.amazonaws.services.licensemanager.model.GetServiceSettingsResult`"
  (^com.amazonaws.services.licensemanager.model.GetServiceSettingsResult [^AbstractAWSLicenseManager this ^com.amazonaws.services.licensemanager.model.GetServiceSettingsRequest request]
    (-> this (.getServiceSettings request))))

(defn delete-license-configuration
  "Description copied from interface: AWSLicenseManager

  request - `com.amazonaws.services.licensemanager.model.DeleteLicenseConfigurationRequest`

  returns: Result of the DeleteLicenseConfiguration operation returned by the service. - `com.amazonaws.services.licensemanager.model.DeleteLicenseConfigurationResult`"
  (^com.amazonaws.services.licensemanager.model.DeleteLicenseConfigurationResult [^AbstractAWSLicenseManager this ^com.amazonaws.services.licensemanager.model.DeleteLicenseConfigurationRequest request]
    (-> this (.deleteLicenseConfiguration request))))

(defn update-license-configuration
  "Description copied from interface: AWSLicenseManager

  request - `com.amazonaws.services.licensemanager.model.UpdateLicenseConfigurationRequest`

  returns: Result of the UpdateLicenseConfiguration operation returned by the service. - `com.amazonaws.services.licensemanager.model.UpdateLicenseConfigurationResult`"
  (^com.amazonaws.services.licensemanager.model.UpdateLicenseConfigurationResult [^AbstractAWSLicenseManager this ^com.amazonaws.services.licensemanager.model.UpdateLicenseConfigurationRequest request]
    (-> this (.updateLicenseConfiguration request))))

(defn list-resource-inventory
  "Description copied from interface: AWSLicenseManager

  request - `com.amazonaws.services.licensemanager.model.ListResourceInventoryRequest`

  returns: Result of the ListResourceInventory operation returned by the service. - `com.amazonaws.services.licensemanager.model.ListResourceInventoryResult`"
  (^com.amazonaws.services.licensemanager.model.ListResourceInventoryResult [^AbstractAWSLicenseManager this ^com.amazonaws.services.licensemanager.model.ListResourceInventoryRequest request]
    (-> this (.listResourceInventory request))))

(defn list-associations-for-license-configuration
  "Description copied from interface: AWSLicenseManager

  request - `com.amazonaws.services.licensemanager.model.ListAssociationsForLicenseConfigurationRequest`

  returns: Result of the ListAssociationsForLicenseConfiguration operation returned by the service. - `com.amazonaws.services.licensemanager.model.ListAssociationsForLicenseConfigurationResult`"
  (^com.amazonaws.services.licensemanager.model.ListAssociationsForLicenseConfigurationResult [^AbstractAWSLicenseManager this ^com.amazonaws.services.licensemanager.model.ListAssociationsForLicenseConfigurationRequest request]
    (-> this (.listAssociationsForLicenseConfiguration request))))

(defn create-license-configuration
  "Description copied from interface: AWSLicenseManager

  request - `com.amazonaws.services.licensemanager.model.CreateLicenseConfigurationRequest`

  returns: Result of the CreateLicenseConfiguration operation returned by the service. - `com.amazonaws.services.licensemanager.model.CreateLicenseConfigurationResult`"
  (^com.amazonaws.services.licensemanager.model.CreateLicenseConfigurationResult [^AbstractAWSLicenseManager this ^com.amazonaws.services.licensemanager.model.CreateLicenseConfigurationRequest request]
    (-> this (.createLicenseConfiguration request))))

(defn list-license-specifications-for-resource
  "Description copied from interface: AWSLicenseManager

  request - `com.amazonaws.services.licensemanager.model.ListLicenseSpecificationsForResourceRequest`

  returns: Result of the ListLicenseSpecificationsForResource operation returned by the service. - `com.amazonaws.services.licensemanager.model.ListLicenseSpecificationsForResourceResult`"
  (^com.amazonaws.services.licensemanager.model.ListLicenseSpecificationsForResourceResult [^AbstractAWSLicenseManager this ^com.amazonaws.services.licensemanager.model.ListLicenseSpecificationsForResourceRequest request]
    (-> this (.listLicenseSpecificationsForResource request))))

(defn list-license-configurations
  "Description copied from interface: AWSLicenseManager

  request - `com.amazonaws.services.licensemanager.model.ListLicenseConfigurationsRequest`

  returns: Result of the ListLicenseConfigurations operation returned by the service. - `com.amazonaws.services.licensemanager.model.ListLicenseConfigurationsResult`"
  (^com.amazonaws.services.licensemanager.model.ListLicenseConfigurationsResult [^AbstractAWSLicenseManager this ^com.amazonaws.services.licensemanager.model.ListLicenseConfigurationsRequest request]
    (-> this (.listLicenseConfigurations request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSLicenseManager

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSLicenseManager this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn tag-resource
  "Description copied from interface: AWSLicenseManager

  request - `com.amazonaws.services.licensemanager.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.licensemanager.model.TagResourceResult`"
  (^com.amazonaws.services.licensemanager.model.TagResourceResult [^AbstractAWSLicenseManager this ^com.amazonaws.services.licensemanager.model.TagResourceRequest request]
    (-> this (.tagResource request))))

