(ns com.amazonaws.services.licensemanager.AWSLicenseManagerClient
  "Client for accessing AWS License Manager. All service calls made using this client are blocking, and will not return
  until the service call completes.

   AWS License Manager

  This is the AWS License Manager API Reference. It provides descriptions, syntax, and usage examples for each
  of the actions and data types for License Manager. The topic for each action shows the Query API request parameters
  and the XML response. You can also view the XML request elements in the WSDL.


  Alternatively, you can use one of the AWS SDKs to access an API that's tailored to the programming language or
  platform that you're using. For more information, see AWS SDKs."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.licensemanager AWSLicenseManagerClient]))

(defn *builder
  "returns: `com.amazonaws.services.licensemanager.AWSLicenseManagerClientBuilder`"
  (^com.amazonaws.services.licensemanager.AWSLicenseManagerClientBuilder []
    (AWSLicenseManagerClient/builder )))

(defn list-tags-for-resource
  "Lists tags attached to a resource.

  request - `com.amazonaws.services.licensemanager.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.licensemanager.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.licensemanager.model.InvalidParameterValueException - One or more parameter values are not valid."
  (^com.amazonaws.services.licensemanager.model.ListTagsForResourceResult [^AWSLicenseManagerClient this ^com.amazonaws.services.licensemanager.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn update-license-specifications-for-resource
  "Adds or removes license configurations for a specified AWS resource. This operation currently supports updating
   the license specifications of AMIs, instances, and hosts. Launch templates and AWS CloudFormation templates are
   not managed from this operation as those resources send the license configurations directly to a resource
   creation operation, such as RunInstances.

  request - `com.amazonaws.services.licensemanager.model.UpdateLicenseSpecificationsForResourceRequest`

  returns: Result of the UpdateLicenseSpecificationsForResource operation returned by the service. - `com.amazonaws.services.licensemanager.model.UpdateLicenseSpecificationsForResourceResult`

  throws: com.amazonaws.services.licensemanager.model.InvalidParameterValueException - One or more parameter values are not valid."
  (^com.amazonaws.services.licensemanager.model.UpdateLicenseSpecificationsForResourceResult [^AWSLicenseManagerClient this ^com.amazonaws.services.licensemanager.model.UpdateLicenseSpecificationsForResourceRequest request]
    (-> this (.updateLicenseSpecificationsForResource request))))

(defn list-usage-for-license-configuration
  "Lists all license usage records for a license configuration, displaying license consumption details by resource
   at a selected point in time. Use this action to audit the current license consumption for any license inventory
   and configuration.

  request - `com.amazonaws.services.licensemanager.model.ListUsageForLicenseConfigurationRequest`

  returns: Result of the ListUsageForLicenseConfiguration operation returned by the service. - `com.amazonaws.services.licensemanager.model.ListUsageForLicenseConfigurationResult`

  throws: com.amazonaws.services.licensemanager.model.InvalidParameterValueException - One or more parameter values are not valid."
  (^com.amazonaws.services.licensemanager.model.ListUsageForLicenseConfigurationResult [^AWSLicenseManagerClient this ^com.amazonaws.services.licensemanager.model.ListUsageForLicenseConfigurationRequest request]
    (-> this (.listUsageForLicenseConfiguration request))))

(defn get-license-configuration
  "Returns a detailed description of a license configuration.

  request - `com.amazonaws.services.licensemanager.model.GetLicenseConfigurationRequest`

  returns: Result of the GetLicenseConfiguration operation returned by the service. - `com.amazonaws.services.licensemanager.model.GetLicenseConfigurationResult`

  throws: com.amazonaws.services.licensemanager.model.InvalidParameterValueException - One or more parameter values are not valid."
  (^com.amazonaws.services.licensemanager.model.GetLicenseConfigurationResult [^AWSLicenseManagerClient this ^com.amazonaws.services.licensemanager.model.GetLicenseConfigurationRequest request]
    (-> this (.getLicenseConfiguration request))))

(defn update-service-settings
  "Updates License Manager service settings.

  request - `com.amazonaws.services.licensemanager.model.UpdateServiceSettingsRequest`

  returns: Result of the UpdateServiceSettings operation returned by the service. - `com.amazonaws.services.licensemanager.model.UpdateServiceSettingsResult`

  throws: com.amazonaws.services.licensemanager.model.InvalidParameterValueException - One or more parameter values are not valid."
  (^com.amazonaws.services.licensemanager.model.UpdateServiceSettingsResult [^AWSLicenseManagerClient this ^com.amazonaws.services.licensemanager.model.UpdateServiceSettingsRequest request]
    (-> this (.updateServiceSettings request))))

(defn untag-resource
  "Remove tags from a resource.

  request - `com.amazonaws.services.licensemanager.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.licensemanager.model.UntagResourceResult`

  throws: com.amazonaws.services.licensemanager.model.InvalidParameterValueException - One or more parameter values are not valid."
  (^com.amazonaws.services.licensemanager.model.UntagResourceResult [^AWSLicenseManagerClient this ^com.amazonaws.services.licensemanager.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn get-service-settings
  "Gets License Manager settings for a region. Exposes the configured S3 bucket, SNS topic, etc., for inspection.

  request - `com.amazonaws.services.licensemanager.model.GetServiceSettingsRequest`

  returns: Result of the GetServiceSettings operation returned by the service. - `com.amazonaws.services.licensemanager.model.GetServiceSettingsResult`

  throws: com.amazonaws.services.licensemanager.model.ServerInternalException - The server experienced an internal error. Try again."
  (^com.amazonaws.services.licensemanager.model.GetServiceSettingsResult [^AWSLicenseManagerClient this ^com.amazonaws.services.licensemanager.model.GetServiceSettingsRequest request]
    (-> this (.getServiceSettings request))))

(defn delete-license-configuration
  "Deletes an existing license configuration. This action fails if the configuration is in use.

  request - `com.amazonaws.services.licensemanager.model.DeleteLicenseConfigurationRequest`

  returns: Result of the DeleteLicenseConfiguration operation returned by the service. - `com.amazonaws.services.licensemanager.model.DeleteLicenseConfigurationResult`

  throws: com.amazonaws.services.licensemanager.model.InvalidParameterValueException - One or more parameter values are not valid."
  (^com.amazonaws.services.licensemanager.model.DeleteLicenseConfigurationResult [^AWSLicenseManagerClient this ^com.amazonaws.services.licensemanager.model.DeleteLicenseConfigurationRequest request]
    (-> this (.deleteLicenseConfiguration request))))

(defn update-license-configuration
  "Modifies the attributes of an existing license configuration object. A license configuration is an abstraction of
   a customer license agreement that can be consumed and enforced by License Manager. Components include
   specifications for the license type (Instances, cores, sockets, VCPUs), tenancy (shared or Dedicated Host), host
   affinity (how long a VM is associated with a host), the number of licenses purchased and used.

  request - `com.amazonaws.services.licensemanager.model.UpdateLicenseConfigurationRequest`

  returns: Result of the UpdateLicenseConfiguration operation returned by the service. - `com.amazonaws.services.licensemanager.model.UpdateLicenseConfigurationResult`

  throws: com.amazonaws.services.licensemanager.model.InvalidParameterValueException - One or more parameter values are not valid."
  (^com.amazonaws.services.licensemanager.model.UpdateLicenseConfigurationResult [^AWSLicenseManagerClient this ^com.amazonaws.services.licensemanager.model.UpdateLicenseConfigurationRequest request]
    (-> this (.updateLicenseConfiguration request))))

(defn list-resource-inventory
  "Returns a detailed list of resources.

  request - `com.amazonaws.services.licensemanager.model.ListResourceInventoryRequest`

  returns: Result of the ListResourceInventory operation returned by the service. - `com.amazonaws.services.licensemanager.model.ListResourceInventoryResult`

  throws: com.amazonaws.services.licensemanager.model.InvalidParameterValueException - One or more parameter values are not valid."
  (^com.amazonaws.services.licensemanager.model.ListResourceInventoryResult [^AWSLicenseManagerClient this ^com.amazonaws.services.licensemanager.model.ListResourceInventoryRequest request]
    (-> this (.listResourceInventory request))))

(defn list-associations-for-license-configuration
  "Lists the resource associations for a license configuration. Resource associations need not consume licenses from
   a license configuration. For example, an AMI or a stopped instance may not consume a license (depending on the
   license rules). Use this operation to find all resources associated with a license configuration.

  request - `com.amazonaws.services.licensemanager.model.ListAssociationsForLicenseConfigurationRequest`

  returns: Result of the ListAssociationsForLicenseConfiguration operation returned by the service. - `com.amazonaws.services.licensemanager.model.ListAssociationsForLicenseConfigurationResult`

  throws: com.amazonaws.services.licensemanager.model.InvalidParameterValueException - One or more parameter values are not valid."
  (^com.amazonaws.services.licensemanager.model.ListAssociationsForLicenseConfigurationResult [^AWSLicenseManagerClient this ^com.amazonaws.services.licensemanager.model.ListAssociationsForLicenseConfigurationRequest request]
    (-> this (.listAssociationsForLicenseConfiguration request))))

(defn create-license-configuration
  "Creates a new license configuration object. A license configuration is an abstraction of a customer license
   agreement that can be consumed and enforced by License Manager. Components include specifications for the license
   type (licensing by instance, socket, CPU, or VCPU), tenancy (shared tenancy, Amazon EC2 Dedicated Instance,
   Amazon EC2 Dedicated Host, or any of these), host affinity (how long a VM must be associated with a host), the
   number of licenses purchased and used.

  request - `com.amazonaws.services.licensemanager.model.CreateLicenseConfigurationRequest`

  returns: Result of the CreateLicenseConfiguration operation returned by the service. - `com.amazonaws.services.licensemanager.model.CreateLicenseConfigurationResult`

  throws: com.amazonaws.services.licensemanager.model.InvalidParameterValueException - One or more parameter values are not valid."
  (^com.amazonaws.services.licensemanager.model.CreateLicenseConfigurationResult [^AWSLicenseManagerClient this ^com.amazonaws.services.licensemanager.model.CreateLicenseConfigurationRequest request]
    (-> this (.createLicenseConfiguration request))))

(defn list-license-specifications-for-resource
  "Returns the license configuration for a resource.

  request - `com.amazonaws.services.licensemanager.model.ListLicenseSpecificationsForResourceRequest`

  returns: Result of the ListLicenseSpecificationsForResource operation returned by the service. - `com.amazonaws.services.licensemanager.model.ListLicenseSpecificationsForResourceResult`

  throws: com.amazonaws.services.licensemanager.model.InvalidParameterValueException - One or more parameter values are not valid."
  (^com.amazonaws.services.licensemanager.model.ListLicenseSpecificationsForResourceResult [^AWSLicenseManagerClient this ^com.amazonaws.services.licensemanager.model.ListLicenseSpecificationsForResourceRequest request]
    (-> this (.listLicenseSpecificationsForResource request))))

(defn list-license-configurations
  "Lists license configuration objects for an account, each containing the name, description, license type, and
   other license terms modeled from a license agreement.

  request - `com.amazonaws.services.licensemanager.model.ListLicenseConfigurationsRequest`

  returns: Result of the ListLicenseConfigurations operation returned by the service. - `com.amazonaws.services.licensemanager.model.ListLicenseConfigurationsResult`

  throws: com.amazonaws.services.licensemanager.model.InvalidParameterValueException - One or more parameter values are not valid."
  (^com.amazonaws.services.licensemanager.model.ListLicenseConfigurationsResult [^AWSLicenseManagerClient this ^com.amazonaws.services.licensemanager.model.ListLicenseConfigurationsRequest request]
    (-> this (.listLicenseConfigurations request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSLicenseManagerClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn tag-resource
  "Attach one of more tags to any resource.

  request - `com.amazonaws.services.licensemanager.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.licensemanager.model.TagResourceResult`

  throws: com.amazonaws.services.licensemanager.model.InvalidParameterValueException - One or more parameter values are not valid."
  (^com.amazonaws.services.licensemanager.model.TagResourceResult [^AWSLicenseManagerClient this ^com.amazonaws.services.licensemanager.model.TagResourceRequest request]
    (-> this (.tagResource request))))

