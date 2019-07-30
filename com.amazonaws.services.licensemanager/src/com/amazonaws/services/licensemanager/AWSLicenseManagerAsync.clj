(ns com.amazonaws.services.licensemanager.AWSLicenseManagerAsync
  "Interface for accessing AWS License Manager asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSLicenseManagerAsync instead.


   AWS License Manager

  This is the AWS License Manager API Reference. It provides descriptions, syntax, and usage examples for each
  of the actions and data types for License Manager. The topic for each action shows the Query API request parameters
  and the XML response. You can also view the XML request elements in the WSDL.


  Alternatively, you can use one of the AWS SDKs to access an API that's tailored to the programming language or
  platform that you're using. For more information, see AWS SDKs."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.licensemanager AWSLicenseManagerAsync]))

(defn untag-resource-async
  "Remove tags from a resource.

  untag-resource-request - `com.amazonaws.services.licensemanager.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn update-license-configuration-async
  "Modifies the attributes of an existing license configuration object. A license configuration is an abstraction of
   a customer license agreement that can be consumed and enforced by License Manager. Components include
   specifications for the license type (Instances, cores, sockets, VCPUs), tenancy (shared or Dedicated Host), host
   affinity (how long a VM is associated with a host), the number of licenses purchased and used.

  update-license-configuration-request - `com.amazonaws.services.licensemanager.model.UpdateLicenseConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateLicenseConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.UpdateLicenseConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.UpdateLicenseConfigurationRequest update-license-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateLicenseConfigurationAsync update-license-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.UpdateLicenseConfigurationRequest update-license-configuration-request]
    (-> this (.updateLicenseConfigurationAsync update-license-configuration-request))))

(defn list-license-configurations-async
  "Lists license configuration objects for an account, each containing the name, description, license type, and
   other license terms modeled from a license agreement.

  list-license-configurations-request - `com.amazonaws.services.licensemanager.model.ListLicenseConfigurationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListLicenseConfigurations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.ListLicenseConfigurationsResult>`"
  (^java.util.concurrent.Future [^AWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.ListLicenseConfigurationsRequest list-license-configurations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listLicenseConfigurationsAsync list-license-configurations-request async-handler)))
  (^java.util.concurrent.Future [^AWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.ListLicenseConfigurationsRequest list-license-configurations-request]
    (-> this (.listLicenseConfigurationsAsync list-license-configurations-request))))

(defn list-associations-for-license-configuration-async
  "Lists the resource associations for a license configuration. Resource associations need not consume licenses from
   a license configuration. For example, an AMI or a stopped instance may not consume a license (depending on the
   license rules). Use this operation to find all resources associated with a license configuration.

  list-associations-for-license-configuration-request - `com.amazonaws.services.licensemanager.model.ListAssociationsForLicenseConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAssociationsForLicenseConfiguration operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.ListAssociationsForLicenseConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.ListAssociationsForLicenseConfigurationRequest list-associations-for-license-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAssociationsForLicenseConfigurationAsync list-associations-for-license-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.ListAssociationsForLicenseConfigurationRequest list-associations-for-license-configuration-request]
    (-> this (.listAssociationsForLicenseConfigurationAsync list-associations-for-license-configuration-request))))

(defn delete-license-configuration-async
  "Deletes an existing license configuration. This action fails if the configuration is in use.

  delete-license-configuration-request - `com.amazonaws.services.licensemanager.model.DeleteLicenseConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLicenseConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.DeleteLicenseConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.DeleteLicenseConfigurationRequest delete-license-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLicenseConfigurationAsync delete-license-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.DeleteLicenseConfigurationRequest delete-license-configuration-request]
    (-> this (.deleteLicenseConfigurationAsync delete-license-configuration-request))))

(defn list-resource-inventory-async
  "Returns a detailed list of resources.

  list-resource-inventory-request - `com.amazonaws.services.licensemanager.model.ListResourceInventoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListResourceInventory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.ListResourceInventoryResult>`"
  (^java.util.concurrent.Future [^AWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.ListResourceInventoryRequest list-resource-inventory-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listResourceInventoryAsync list-resource-inventory-request async-handler)))
  (^java.util.concurrent.Future [^AWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.ListResourceInventoryRequest list-resource-inventory-request]
    (-> this (.listResourceInventoryAsync list-resource-inventory-request))))

(defn create-license-configuration-async
  "Creates a new license configuration object. A license configuration is an abstraction of a customer license
   agreement that can be consumed and enforced by License Manager. Components include specifications for the license
   type (licensing by instance, socket, CPU, or VCPU), tenancy (shared tenancy, Amazon EC2 Dedicated Instance,
   Amazon EC2 Dedicated Host, or any of these), host affinity (how long a VM must be associated with a host), the
   number of licenses purchased and used.

  create-license-configuration-request - `com.amazonaws.services.licensemanager.model.CreateLicenseConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLicenseConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.CreateLicenseConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.CreateLicenseConfigurationRequest create-license-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLicenseConfigurationAsync create-license-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.CreateLicenseConfigurationRequest create-license-configuration-request]
    (-> this (.createLicenseConfigurationAsync create-license-configuration-request))))

(defn list-usage-for-license-configuration-async
  "Lists all license usage records for a license configuration, displaying license consumption details by resource
   at a selected point in time. Use this action to audit the current license consumption for any license inventory
   and configuration.

  list-usage-for-license-configuration-request - `com.amazonaws.services.licensemanager.model.ListUsageForLicenseConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUsageForLicenseConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.ListUsageForLicenseConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.ListUsageForLicenseConfigurationRequest list-usage-for-license-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUsageForLicenseConfigurationAsync list-usage-for-license-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.ListUsageForLicenseConfigurationRequest list-usage-for-license-configuration-request]
    (-> this (.listUsageForLicenseConfigurationAsync list-usage-for-license-configuration-request))))

(defn update-license-specifications-for-resource-async
  "Adds or removes license configurations for a specified AWS resource. This operation currently supports updating
   the license specifications of AMIs, instances, and hosts. Launch templates and AWS CloudFormation templates are
   not managed from this operation as those resources send the license configurations directly to a resource
   creation operation, such as RunInstances.

  update-license-specifications-for-resource-request - `com.amazonaws.services.licensemanager.model.UpdateLicenseSpecificationsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateLicenseSpecificationsForResource operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.UpdateLicenseSpecificationsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.UpdateLicenseSpecificationsForResourceRequest update-license-specifications-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateLicenseSpecificationsForResourceAsync update-license-specifications-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.UpdateLicenseSpecificationsForResourceRequest update-license-specifications-for-resource-request]
    (-> this (.updateLicenseSpecificationsForResourceAsync update-license-specifications-for-resource-request))))

(defn list-tags-for-resource-async
  "Lists tags attached to a resource.

  list-tags-for-resource-request - `com.amazonaws.services.licensemanager.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn get-license-configuration-async
  "Returns a detailed description of a license configuration.

  get-license-configuration-request - `com.amazonaws.services.licensemanager.model.GetLicenseConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLicenseConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.GetLicenseConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.GetLicenseConfigurationRequest get-license-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLicenseConfigurationAsync get-license-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.GetLicenseConfigurationRequest get-license-configuration-request]
    (-> this (.getLicenseConfigurationAsync get-license-configuration-request))))

(defn update-service-settings-async
  "Updates License Manager service settings.

  update-service-settings-request - `com.amazonaws.services.licensemanager.model.UpdateServiceSettingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateServiceSettings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.UpdateServiceSettingsResult>`"
  (^java.util.concurrent.Future [^AWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.UpdateServiceSettingsRequest update-service-settings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateServiceSettingsAsync update-service-settings-request async-handler)))
  (^java.util.concurrent.Future [^AWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.UpdateServiceSettingsRequest update-service-settings-request]
    (-> this (.updateServiceSettingsAsync update-service-settings-request))))

(defn list-license-specifications-for-resource-async
  "Returns the license configuration for a resource.

  list-license-specifications-for-resource-request - `com.amazonaws.services.licensemanager.model.ListLicenseSpecificationsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListLicenseSpecificationsForResource operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.ListLicenseSpecificationsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.ListLicenseSpecificationsForResourceRequest list-license-specifications-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listLicenseSpecificationsForResourceAsync list-license-specifications-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.ListLicenseSpecificationsForResourceRequest list-license-specifications-for-resource-request]
    (-> this (.listLicenseSpecificationsForResourceAsync list-license-specifications-for-resource-request))))

(defn get-service-settings-async
  "Gets License Manager settings for a region. Exposes the configured S3 bucket, SNS topic, etc., for inspection.

  get-service-settings-request - `com.amazonaws.services.licensemanager.model.GetServiceSettingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetServiceSettings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.GetServiceSettingsResult>`"
  (^java.util.concurrent.Future [^AWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.GetServiceSettingsRequest get-service-settings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getServiceSettingsAsync get-service-settings-request async-handler)))
  (^java.util.concurrent.Future [^AWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.GetServiceSettingsRequest get-service-settings-request]
    (-> this (.getServiceSettingsAsync get-service-settings-request))))

(defn tag-resource-async
  "Attach one of more tags to any resource.

  tag-resource-request - `com.amazonaws.services.licensemanager.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.licensemanager.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSLicenseManagerAsync this ^com.amazonaws.services.licensemanager.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

