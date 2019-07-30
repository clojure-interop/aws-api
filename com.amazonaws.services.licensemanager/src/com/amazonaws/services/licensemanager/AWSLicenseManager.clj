(ns com.amazonaws.services.licensemanager.AWSLicenseManager
  "Interface for accessing AWS License Manager.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSLicenseManager instead.


   AWS License Manager

  This is the AWS License Manager API Reference. It provides descriptions, syntax, and usage examples for each
  of the actions and data types for License Manager. The topic for each action shows the Query API request parameters
  and the XML response. You can also view the XML request elements in the WSDL.


  Alternatively, you can use one of the AWS SDKs to access an API that's tailored to the programming language or
  platform that you're using. For more information, see AWS SDKs."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.licensemanager AWSLicenseManager]))

(defn list-tags-for-resource
  "Lists tags attached to a resource.

  list-tags-for-resource-request - `com.amazonaws.services.licensemanager.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.licensemanager.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.licensemanager.model.InvalidParameterValueException - One or more parameter values are not valid."
  (^com.amazonaws.services.licensemanager.model.ListTagsForResourceResult [^AWSLicenseManager this ^com.amazonaws.services.licensemanager.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn update-license-specifications-for-resource
  "Adds or removes license configurations for a specified AWS resource. This operation currently supports updating
   the license specifications of AMIs, instances, and hosts. Launch templates and AWS CloudFormation templates are
   not managed from this operation as those resources send the license configurations directly to a resource
   creation operation, such as RunInstances.

  update-license-specifications-for-resource-request - `com.amazonaws.services.licensemanager.model.UpdateLicenseSpecificationsForResourceRequest`

  returns: Result of the UpdateLicenseSpecificationsForResource operation returned by the service. - `com.amazonaws.services.licensemanager.model.UpdateLicenseSpecificationsForResourceResult`

  throws: com.amazonaws.services.licensemanager.model.InvalidParameterValueException - One or more parameter values are not valid."
  (^com.amazonaws.services.licensemanager.model.UpdateLicenseSpecificationsForResourceResult [^AWSLicenseManager this ^com.amazonaws.services.licensemanager.model.UpdateLicenseSpecificationsForResourceRequest update-license-specifications-for-resource-request]
    (-> this (.updateLicenseSpecificationsForResource update-license-specifications-for-resource-request))))

(defn list-usage-for-license-configuration
  "Lists all license usage records for a license configuration, displaying license consumption details by resource
   at a selected point in time. Use this action to audit the current license consumption for any license inventory
   and configuration.

  list-usage-for-license-configuration-request - `com.amazonaws.services.licensemanager.model.ListUsageForLicenseConfigurationRequest`

  returns: Result of the ListUsageForLicenseConfiguration operation returned by the service. - `com.amazonaws.services.licensemanager.model.ListUsageForLicenseConfigurationResult`

  throws: com.amazonaws.services.licensemanager.model.InvalidParameterValueException - One or more parameter values are not valid."
  (^com.amazonaws.services.licensemanager.model.ListUsageForLicenseConfigurationResult [^AWSLicenseManager this ^com.amazonaws.services.licensemanager.model.ListUsageForLicenseConfigurationRequest list-usage-for-license-configuration-request]
    (-> this (.listUsageForLicenseConfiguration list-usage-for-license-configuration-request))))

(defn get-license-configuration
  "Returns a detailed description of a license configuration.

  get-license-configuration-request - `com.amazonaws.services.licensemanager.model.GetLicenseConfigurationRequest`

  returns: Result of the GetLicenseConfiguration operation returned by the service. - `com.amazonaws.services.licensemanager.model.GetLicenseConfigurationResult`

  throws: com.amazonaws.services.licensemanager.model.InvalidParameterValueException - One or more parameter values are not valid."
  (^com.amazonaws.services.licensemanager.model.GetLicenseConfigurationResult [^AWSLicenseManager this ^com.amazonaws.services.licensemanager.model.GetLicenseConfigurationRequest get-license-configuration-request]
    (-> this (.getLicenseConfiguration get-license-configuration-request))))

(defn update-service-settings
  "Updates License Manager service settings.

  update-service-settings-request - `com.amazonaws.services.licensemanager.model.UpdateServiceSettingsRequest`

  returns: Result of the UpdateServiceSettings operation returned by the service. - `com.amazonaws.services.licensemanager.model.UpdateServiceSettingsResult`

  throws: com.amazonaws.services.licensemanager.model.InvalidParameterValueException - One or more parameter values are not valid."
  (^com.amazonaws.services.licensemanager.model.UpdateServiceSettingsResult [^AWSLicenseManager this ^com.amazonaws.services.licensemanager.model.UpdateServiceSettingsRequest update-service-settings-request]
    (-> this (.updateServiceSettings update-service-settings-request))))

(defn untag-resource
  "Remove tags from a resource.

  untag-resource-request - `com.amazonaws.services.licensemanager.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.licensemanager.model.UntagResourceResult`

  throws: com.amazonaws.services.licensemanager.model.InvalidParameterValueException - One or more parameter values are not valid."
  (^com.amazonaws.services.licensemanager.model.UntagResourceResult [^AWSLicenseManager this ^com.amazonaws.services.licensemanager.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSLicenseManager this]
    (-> this (.shutdown))))

(defn get-service-settings
  "Gets License Manager settings for a region. Exposes the configured S3 bucket, SNS topic, etc., for inspection.

  get-service-settings-request - `com.amazonaws.services.licensemanager.model.GetServiceSettingsRequest`

  returns: Result of the GetServiceSettings operation returned by the service. - `com.amazonaws.services.licensemanager.model.GetServiceSettingsResult`

  throws: com.amazonaws.services.licensemanager.model.ServerInternalException - The server experienced an internal error. Try again."
  (^com.amazonaws.services.licensemanager.model.GetServiceSettingsResult [^AWSLicenseManager this ^com.amazonaws.services.licensemanager.model.GetServiceSettingsRequest get-service-settings-request]
    (-> this (.getServiceSettings get-service-settings-request))))

(defn delete-license-configuration
  "Deletes an existing license configuration. This action fails if the configuration is in use.

  delete-license-configuration-request - `com.amazonaws.services.licensemanager.model.DeleteLicenseConfigurationRequest`

  returns: Result of the DeleteLicenseConfiguration operation returned by the service. - `com.amazonaws.services.licensemanager.model.DeleteLicenseConfigurationResult`

  throws: com.amazonaws.services.licensemanager.model.InvalidParameterValueException - One or more parameter values are not valid."
  (^com.amazonaws.services.licensemanager.model.DeleteLicenseConfigurationResult [^AWSLicenseManager this ^com.amazonaws.services.licensemanager.model.DeleteLicenseConfigurationRequest delete-license-configuration-request]
    (-> this (.deleteLicenseConfiguration delete-license-configuration-request))))

(defn update-license-configuration
  "Modifies the attributes of an existing license configuration object. A license configuration is an abstraction of
   a customer license agreement that can be consumed and enforced by License Manager. Components include
   specifications for the license type (Instances, cores, sockets, VCPUs), tenancy (shared or Dedicated Host), host
   affinity (how long a VM is associated with a host), the number of licenses purchased and used.

  update-license-configuration-request - `com.amazonaws.services.licensemanager.model.UpdateLicenseConfigurationRequest`

  returns: Result of the UpdateLicenseConfiguration operation returned by the service. - `com.amazonaws.services.licensemanager.model.UpdateLicenseConfigurationResult`

  throws: com.amazonaws.services.licensemanager.model.InvalidParameterValueException - One or more parameter values are not valid."
  (^com.amazonaws.services.licensemanager.model.UpdateLicenseConfigurationResult [^AWSLicenseManager this ^com.amazonaws.services.licensemanager.model.UpdateLicenseConfigurationRequest update-license-configuration-request]
    (-> this (.updateLicenseConfiguration update-license-configuration-request))))

(defn list-resource-inventory
  "Returns a detailed list of resources.

  list-resource-inventory-request - `com.amazonaws.services.licensemanager.model.ListResourceInventoryRequest`

  returns: Result of the ListResourceInventory operation returned by the service. - `com.amazonaws.services.licensemanager.model.ListResourceInventoryResult`

  throws: com.amazonaws.services.licensemanager.model.InvalidParameterValueException - One or more parameter values are not valid."
  (^com.amazonaws.services.licensemanager.model.ListResourceInventoryResult [^AWSLicenseManager this ^com.amazonaws.services.licensemanager.model.ListResourceInventoryRequest list-resource-inventory-request]
    (-> this (.listResourceInventory list-resource-inventory-request))))

(defn list-associations-for-license-configuration
  "Lists the resource associations for a license configuration. Resource associations need not consume licenses from
   a license configuration. For example, an AMI or a stopped instance may not consume a license (depending on the
   license rules). Use this operation to find all resources associated with a license configuration.

  list-associations-for-license-configuration-request - `com.amazonaws.services.licensemanager.model.ListAssociationsForLicenseConfigurationRequest`

  returns: Result of the ListAssociationsForLicenseConfiguration operation returned by the service. - `com.amazonaws.services.licensemanager.model.ListAssociationsForLicenseConfigurationResult`

  throws: com.amazonaws.services.licensemanager.model.InvalidParameterValueException - One or more parameter values are not valid."
  (^com.amazonaws.services.licensemanager.model.ListAssociationsForLicenseConfigurationResult [^AWSLicenseManager this ^com.amazonaws.services.licensemanager.model.ListAssociationsForLicenseConfigurationRequest list-associations-for-license-configuration-request]
    (-> this (.listAssociationsForLicenseConfiguration list-associations-for-license-configuration-request))))

(defn create-license-configuration
  "Creates a new license configuration object. A license configuration is an abstraction of a customer license
   agreement that can be consumed and enforced by License Manager. Components include specifications for the license
   type (licensing by instance, socket, CPU, or VCPU), tenancy (shared tenancy, Amazon EC2 Dedicated Instance,
   Amazon EC2 Dedicated Host, or any of these), host affinity (how long a VM must be associated with a host), the
   number of licenses purchased and used.

  create-license-configuration-request - `com.amazonaws.services.licensemanager.model.CreateLicenseConfigurationRequest`

  returns: Result of the CreateLicenseConfiguration operation returned by the service. - `com.amazonaws.services.licensemanager.model.CreateLicenseConfigurationResult`

  throws: com.amazonaws.services.licensemanager.model.InvalidParameterValueException - One or more parameter values are not valid."
  (^com.amazonaws.services.licensemanager.model.CreateLicenseConfigurationResult [^AWSLicenseManager this ^com.amazonaws.services.licensemanager.model.CreateLicenseConfigurationRequest create-license-configuration-request]
    (-> this (.createLicenseConfiguration create-license-configuration-request))))

(defn list-license-specifications-for-resource
  "Returns the license configuration for a resource.

  list-license-specifications-for-resource-request - `com.amazonaws.services.licensemanager.model.ListLicenseSpecificationsForResourceRequest`

  returns: Result of the ListLicenseSpecificationsForResource operation returned by the service. - `com.amazonaws.services.licensemanager.model.ListLicenseSpecificationsForResourceResult`

  throws: com.amazonaws.services.licensemanager.model.InvalidParameterValueException - One or more parameter values are not valid."
  (^com.amazonaws.services.licensemanager.model.ListLicenseSpecificationsForResourceResult [^AWSLicenseManager this ^com.amazonaws.services.licensemanager.model.ListLicenseSpecificationsForResourceRequest list-license-specifications-for-resource-request]
    (-> this (.listLicenseSpecificationsForResource list-license-specifications-for-resource-request))))

(defn list-license-configurations
  "Lists license configuration objects for an account, each containing the name, description, license type, and
   other license terms modeled from a license agreement.

  list-license-configurations-request - `com.amazonaws.services.licensemanager.model.ListLicenseConfigurationsRequest`

  returns: Result of the ListLicenseConfigurations operation returned by the service. - `com.amazonaws.services.licensemanager.model.ListLicenseConfigurationsResult`

  throws: com.amazonaws.services.licensemanager.model.InvalidParameterValueException - One or more parameter values are not valid."
  (^com.amazonaws.services.licensemanager.model.ListLicenseConfigurationsResult [^AWSLicenseManager this ^com.amazonaws.services.licensemanager.model.ListLicenseConfigurationsRequest list-license-configurations-request]
    (-> this (.listLicenseConfigurations list-license-configurations-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSLicenseManager this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn tag-resource
  "Attach one of more tags to any resource.

  tag-resource-request - `com.amazonaws.services.licensemanager.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.licensemanager.model.TagResourceResult`

  throws: com.amazonaws.services.licensemanager.model.InvalidParameterValueException - One or more parameter values are not valid."
  (^com.amazonaws.services.licensemanager.model.TagResourceResult [^AWSLicenseManager this ^com.amazonaws.services.licensemanager.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

