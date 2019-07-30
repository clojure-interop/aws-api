(ns com.amazonaws.services.elasticbeanstalk.AbstractAWSElasticBeanstalk
  "Abstract implementation of AWSElasticBeanstalk. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.elasticbeanstalk AbstractAWSElasticBeanstalk]))

(defn describe-environment-resources
  "Description copied from interface: AWSElasticBeanstalk

  request - Request to describe the resources in an environment. - `com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentResourcesRequest`

  returns: Result of the DescribeEnvironmentResources operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentResourcesResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentResourcesResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentResourcesRequest request]
    (-> this (.describeEnvironmentResources request))))

(defn create-storage-location
  "Description copied from interface: AWSElasticBeanstalk

  request - `com.amazonaws.services.elasticbeanstalk.model.CreateStorageLocationRequest`

  returns: Result of the CreateStorageLocation operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.CreateStorageLocationResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.CreateStorageLocationResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.CreateStorageLocationRequest request]
    (-> this (.createStorageLocation request)))
  (^com.amazonaws.services.elasticbeanstalk.model.CreateStorageLocationResult [^AbstractAWSElasticBeanstalk this]
    (-> this (.createStorageLocation))))

(defn list-tags-for-resource
  "Description copied from interface: AWSElasticBeanstalk

  request - `com.amazonaws.services.elasticbeanstalk.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.ListTagsForResourceResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn describe-environment-managed-actions
  "Description copied from interface: AWSElasticBeanstalk

  request - Request to list an environment's upcoming and in-progress managed actions. - `com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionsRequest`

  returns: Result of the DescribeEnvironmentManagedActions operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionsResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionsResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionsRequest request]
    (-> this (.describeEnvironmentManagedActions request))))

(defn set-region
  "Description copied from interface: AWSElasticBeanstalk

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAWSElasticBeanstalk this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn describe-configuration-options
  "Description copied from interface: AWSElasticBeanstalk

  request - Result message containing a list of application version descriptions. - `com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationOptionsRequest`

  returns: Result of the DescribeConfigurationOptions operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationOptionsResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationOptionsResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationOptionsRequest request]
    (-> this (.describeConfigurationOptions request))))

(defn create-configuration-template
  "Description copied from interface: AWSElasticBeanstalk

  request - Request to create a configuration template. - `com.amazonaws.services.elasticbeanstalk.model.CreateConfigurationTemplateRequest`

  returns: Result of the CreateConfigurationTemplate operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.CreateConfigurationTemplateResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.CreateConfigurationTemplateResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.CreateConfigurationTemplateRequest request]
    (-> this (.createConfigurationTemplate request))))

(defn retrieve-environment-info
  "Description copied from interface: AWSElasticBeanstalk

  request - Request to download logs retrieved with RequestEnvironmentInfo. - `com.amazonaws.services.elasticbeanstalk.model.RetrieveEnvironmentInfoRequest`

  returns: Result of the RetrieveEnvironmentInfo operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.RetrieveEnvironmentInfoResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.RetrieveEnvironmentInfoResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.RetrieveEnvironmentInfoRequest request]
    (-> this (.retrieveEnvironmentInfo request))))

(defn request-environment-info
  "Description copied from interface: AWSElasticBeanstalk

  request - Request to retrieve logs from an environment and store them in your Elastic Beanstalk storage bucket. - `com.amazonaws.services.elasticbeanstalk.model.RequestEnvironmentInfoRequest`

  returns: Result of the RequestEnvironmentInfo operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.RequestEnvironmentInfoResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.RequestEnvironmentInfoResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.RequestEnvironmentInfoRequest request]
    (-> this (.requestEnvironmentInfo request))))

(defn update-tags-for-resource
  "Description copied from interface: AWSElasticBeanstalk

  request - `com.amazonaws.services.elasticbeanstalk.model.UpdateTagsForResourceRequest`

  returns: Result of the UpdateTagsForResource operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.UpdateTagsForResourceResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.UpdateTagsForResourceResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.UpdateTagsForResourceRequest request]
    (-> this (.updateTagsForResource request))))

(defn apply-environment-managed-action
  "Description copied from interface: AWSElasticBeanstalk

  request - Request to execute a scheduled managed action immediately. - `com.amazonaws.services.elasticbeanstalk.model.ApplyEnvironmentManagedActionRequest`

  returns: Result of the ApplyEnvironmentManagedAction operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.ApplyEnvironmentManagedActionResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.ApplyEnvironmentManagedActionResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.ApplyEnvironmentManagedActionRequest request]
    (-> this (.applyEnvironmentManagedAction request))))

(defn swap-environment-cnam-es
  "Description copied from interface: AWSElasticBeanstalk

  request - Swaps the CNAMEs of two environments. - `com.amazonaws.services.elasticbeanstalk.model.SwapEnvironmentCNAMEsRequest`

  returns: Result of the SwapEnvironmentCNAMEs operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.SwapEnvironmentCNAMEsResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.SwapEnvironmentCNAMEsResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.SwapEnvironmentCNAMEsRequest request]
    (-> this (.swapEnvironmentCNAMEs request)))
  (^com.amazonaws.services.elasticbeanstalk.model.SwapEnvironmentCNAMEsResult [^AbstractAWSElasticBeanstalk this]
    (-> this (.swapEnvironmentCNAMEs))))

(defn restart-app-server
  "Description copied from interface: AWSElasticBeanstalk

  request - `com.amazonaws.services.elasticbeanstalk.model.RestartAppServerRequest`

  returns: Result of the RestartAppServer operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.RestartAppServerResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.RestartAppServerResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.RestartAppServerRequest request]
    (-> this (.restartAppServer request))))

(defn rebuild-environment
  "Description copied from interface: AWSElasticBeanstalk

  request - `com.amazonaws.services.elasticbeanstalk.model.RebuildEnvironmentRequest`

  returns: Result of the RebuildEnvironment operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.RebuildEnvironmentResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.RebuildEnvironmentResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.RebuildEnvironmentRequest request]
    (-> this (.rebuildEnvironment request))))

(defn delete-application
  "Description copied from interface: AWSElasticBeanstalk

  request - Request to delete an application. - `com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationRequest`

  returns: Result of the DeleteApplication operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationRequest request]
    (-> this (.deleteApplication request))))

(defn create-application-version
  "Description copied from interface: AWSElasticBeanstalk

  request - `com.amazonaws.services.elasticbeanstalk.model.CreateApplicationVersionRequest`

  returns: Result of the CreateApplicationVersion operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.CreateApplicationVersionResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.CreateApplicationVersionResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.CreateApplicationVersionRequest request]
    (-> this (.createApplicationVersion request))))

(defn delete-platform-version
  "Description copied from interface: AWSElasticBeanstalk

  request - `com.amazonaws.services.elasticbeanstalk.model.DeletePlatformVersionRequest`

  returns: Result of the DeletePlatformVersion operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.DeletePlatformVersionResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.DeletePlatformVersionResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.DeletePlatformVersionRequest request]
    (-> this (.deletePlatformVersion request))))

(defn update-application-version
  "Description copied from interface: AWSElasticBeanstalk

  request - `com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationVersionRequest`

  returns: Result of the UpdateApplicationVersion operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationVersionResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationVersionResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationVersionRequest request]
    (-> this (.updateApplicationVersion request))))

(defn describe-environment-managed-action-history
  "Description copied from interface: AWSElasticBeanstalk

  request - Request to list completed and failed managed actions. - `com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionHistoryRequest`

  returns: Result of the DescribeEnvironmentManagedActionHistory operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionHistoryResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionHistoryResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionHistoryRequest request]
    (-> this (.describeEnvironmentManagedActionHistory request))))

(defn describe-account-attributes
  "Description copied from interface: AWSElasticBeanstalk

  request - `com.amazonaws.services.elasticbeanstalk.model.DescribeAccountAttributesRequest`

  returns: Result of the DescribeAccountAttributes operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.DescribeAccountAttributesResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.DescribeAccountAttributesResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.DescribeAccountAttributesRequest request]
    (-> this (.describeAccountAttributes request))))

(defn shutdown
  "Description copied from interface: AWSElasticBeanstalk"
  ([^AbstractAWSElasticBeanstalk this]
    (-> this (.shutdown))))

(defn describe-events
  "Description copied from interface: AWSElasticBeanstalk

  request - Request to retrieve a list of events for an environment. - `com.amazonaws.services.elasticbeanstalk.model.DescribeEventsRequest`

  returns: Result of the DescribeEvents operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.DescribeEventsResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.DescribeEventsResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.DescribeEventsRequest request]
    (-> this (.describeEvents request)))
  (^com.amazonaws.services.elasticbeanstalk.model.DescribeEventsResult [^AbstractAWSElasticBeanstalk this]
    (-> this (.describeEvents))))

(defn update-application
  "Description copied from interface: AWSElasticBeanstalk

  request - Request to update an application. - `com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationRequest`

  returns: Result of the UpdateApplication operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationRequest request]
    (-> this (.updateApplication request))))

(defn compose-environments
  "Description copied from interface: AWSElasticBeanstalk

  request - Request to create or update a group of environments. - `com.amazonaws.services.elasticbeanstalk.model.ComposeEnvironmentsRequest`

  returns: Result of the ComposeEnvironments operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.ComposeEnvironmentsResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.ComposeEnvironmentsResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.ComposeEnvironmentsRequest request]
    (-> this (.composeEnvironments request))))

(defn validate-configuration-settings
  "Description copied from interface: AWSElasticBeanstalk

  request - A list of validation messages for a specified configuration template. - `com.amazonaws.services.elasticbeanstalk.model.ValidateConfigurationSettingsRequest`

  returns: Result of the ValidateConfigurationSettings operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.ValidateConfigurationSettingsResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.ValidateConfigurationSettingsResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.ValidateConfigurationSettingsRequest request]
    (-> this (.validateConfigurationSettings request))))

(defn create-environment
  "Description copied from interface: AWSElasticBeanstalk

  request - `com.amazonaws.services.elasticbeanstalk.model.CreateEnvironmentRequest`

  returns: Result of the CreateEnvironment operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.CreateEnvironmentResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.CreateEnvironmentResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.CreateEnvironmentRequest request]
    (-> this (.createEnvironment request))))

(defn set-endpoint
  "Description copied from interface: AWSElasticBeanstalk

  endpoint - The endpoint (ex: \"elasticbeanstalk.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://elasticbeanstalk.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAWSElasticBeanstalk this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn abort-environment-update
  "Description copied from interface: AWSElasticBeanstalk

  request - `com.amazonaws.services.elasticbeanstalk.model.AbortEnvironmentUpdateRequest`

  returns: Result of the AbortEnvironmentUpdate operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.AbortEnvironmentUpdateResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.AbortEnvironmentUpdateResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.AbortEnvironmentUpdateRequest request]
    (-> this (.abortEnvironmentUpdate request)))
  (^com.amazonaws.services.elasticbeanstalk.model.AbortEnvironmentUpdateResult [^AbstractAWSElasticBeanstalk this]
    (-> this (.abortEnvironmentUpdate))))

(defn create-application
  "Description copied from interface: AWSElasticBeanstalk

  request - Request to create an application. - `com.amazonaws.services.elasticbeanstalk.model.CreateApplicationRequest`

  returns: Result of the CreateApplication operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.CreateApplicationResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.CreateApplicationResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.CreateApplicationRequest request]
    (-> this (.createApplication request))))

(defn update-application-resource-lifecycle
  "Description copied from interface: AWSElasticBeanstalk

  request - `com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationResourceLifecycleRequest`

  returns: Result of the UpdateApplicationResourceLifecycle operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationResourceLifecycleResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationResourceLifecycleResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationResourceLifecycleRequest request]
    (-> this (.updateApplicationResourceLifecycle request))))

(defn describe-environments
  "Description copied from interface: AWSElasticBeanstalk

  request - Request to describe one or more environments. - `com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentsRequest`

  returns: Result of the DescribeEnvironments operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentsResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentsResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentsRequest request]
    (-> this (.describeEnvironments request)))
  (^com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentsResult [^AbstractAWSElasticBeanstalk this]
    (-> this (.describeEnvironments))))

(defn list-available-solution-stacks
  "Description copied from interface: AWSElasticBeanstalk

  request - `com.amazonaws.services.elasticbeanstalk.model.ListAvailableSolutionStacksRequest`

  returns: Result of the ListAvailableSolutionStacks operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.ListAvailableSolutionStacksResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.ListAvailableSolutionStacksResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.ListAvailableSolutionStacksRequest request]
    (-> this (.listAvailableSolutionStacks request)))
  (^com.amazonaws.services.elasticbeanstalk.model.ListAvailableSolutionStacksResult [^AbstractAWSElasticBeanstalk this]
    (-> this (.listAvailableSolutionStacks))))

(defn describe-platform-version
  "Description copied from interface: AWSElasticBeanstalk

  request - `com.amazonaws.services.elasticbeanstalk.model.DescribePlatformVersionRequest`

  returns: Result of the DescribePlatformVersion operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.DescribePlatformVersionResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.DescribePlatformVersionResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.DescribePlatformVersionRequest request]
    (-> this (.describePlatformVersion request))))

(defn terminate-environment
  "Description copied from interface: AWSElasticBeanstalk

  request - Request to terminate an environment. - `com.amazonaws.services.elasticbeanstalk.model.TerminateEnvironmentRequest`

  returns: Result of the TerminateEnvironment operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.TerminateEnvironmentResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.TerminateEnvironmentResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.TerminateEnvironmentRequest request]
    (-> this (.terminateEnvironment request))))

(defn describe-configuration-settings
  "Description copied from interface: AWSElasticBeanstalk

  request - Result message containing all of the configuration settings for a specified solution stack or configuration template. - `com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationSettingsRequest`

  returns: Result of the DescribeConfigurationSettings operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationSettingsResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationSettingsResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationSettingsRequest request]
    (-> this (.describeConfigurationSettings request))))

(defn delete-configuration-template
  "Description copied from interface: AWSElasticBeanstalk

  request - Request to delete a configuration template. - `com.amazonaws.services.elasticbeanstalk.model.DeleteConfigurationTemplateRequest`

  returns: Result of the DeleteConfigurationTemplate operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.DeleteConfigurationTemplateResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.DeleteConfigurationTemplateResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.DeleteConfigurationTemplateRequest request]
    (-> this (.deleteConfigurationTemplate request))))

(defn describe-application-versions
  "Description copied from interface: AWSElasticBeanstalk

  request - Request to describe application versions. - `com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationVersionsRequest`

  returns: Result of the DescribeApplicationVersions operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationVersionsResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationVersionsResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationVersionsRequest request]
    (-> this (.describeApplicationVersions request)))
  (^com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationVersionsResult [^AbstractAWSElasticBeanstalk this]
    (-> this (.describeApplicationVersions))))

(defn list-platform-versions
  "Description copied from interface: AWSElasticBeanstalk

  request - `com.amazonaws.services.elasticbeanstalk.model.ListPlatformVersionsRequest`

  returns: Result of the ListPlatformVersions operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.ListPlatformVersionsResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.ListPlatformVersionsResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.ListPlatformVersionsRequest request]
    (-> this (.listPlatformVersions request))))

(defn delete-environment-configuration
  "Description copied from interface: AWSElasticBeanstalk

  request - Request to delete a draft environment configuration. - `com.amazonaws.services.elasticbeanstalk.model.DeleteEnvironmentConfigurationRequest`

  returns: Result of the DeleteEnvironmentConfiguration operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.DeleteEnvironmentConfigurationResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.DeleteEnvironmentConfigurationResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.DeleteEnvironmentConfigurationRequest request]
    (-> this (.deleteEnvironmentConfiguration request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSElasticBeanstalk

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSElasticBeanstalk this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn create-platform-version
  "Description copied from interface: AWSElasticBeanstalk

  request - Request to create a new platform version. - `com.amazonaws.services.elasticbeanstalk.model.CreatePlatformVersionRequest`

  returns: Result of the CreatePlatformVersion operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.CreatePlatformVersionResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.CreatePlatformVersionResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.CreatePlatformVersionRequest request]
    (-> this (.createPlatformVersion request))))

(defn describe-environment-health
  "Description copied from interface: AWSElasticBeanstalk

  request - See the example below to learn how to create a request body. - `com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentHealthRequest`

  returns: Result of the DescribeEnvironmentHealth operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentHealthResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentHealthResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentHealthRequest request]
    (-> this (.describeEnvironmentHealth request))))

(defn update-environment
  "Description copied from interface: AWSElasticBeanstalk

  request - Request to update an environment. - `com.amazonaws.services.elasticbeanstalk.model.UpdateEnvironmentRequest`

  returns: Result of the UpdateEnvironment operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.UpdateEnvironmentResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.UpdateEnvironmentResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.UpdateEnvironmentRequest request]
    (-> this (.updateEnvironment request))))

(defn describe-instances-health
  "Description copied from interface: AWSElasticBeanstalk

  request - Parameters for a call to DescribeInstancesHealth. - `com.amazonaws.services.elasticbeanstalk.model.DescribeInstancesHealthRequest`

  returns: Result of the DescribeInstancesHealth operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.DescribeInstancesHealthResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.DescribeInstancesHealthResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.DescribeInstancesHealthRequest request]
    (-> this (.describeInstancesHealth request))))

(defn update-configuration-template
  "Description copied from interface: AWSElasticBeanstalk

  request - The result message containing the options for the specified solution stack. - `com.amazonaws.services.elasticbeanstalk.model.UpdateConfigurationTemplateRequest`

  returns: Result of the UpdateConfigurationTemplate operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.UpdateConfigurationTemplateResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.UpdateConfigurationTemplateResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.UpdateConfigurationTemplateRequest request]
    (-> this (.updateConfigurationTemplate request))))

(defn check-dns-availability
  "Description copied from interface: AWSElasticBeanstalk

  request - Results message indicating whether a CNAME is available. - `com.amazonaws.services.elasticbeanstalk.model.CheckDNSAvailabilityRequest`

  returns: Result of the CheckDNSAvailability operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.CheckDNSAvailabilityResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.CheckDNSAvailabilityResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.CheckDNSAvailabilityRequest request]
    (-> this (.checkDNSAvailability request))))

(defn describe-applications
  "Description copied from interface: AWSElasticBeanstalk

  request - Request to describe one or more applications. - `com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationsRequest`

  returns: Result of the DescribeApplications operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationsResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationsResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationsRequest request]
    (-> this (.describeApplications request)))
  (^com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationsResult [^AbstractAWSElasticBeanstalk this]
    (-> this (.describeApplications))))

(defn delete-application-version
  "Description copied from interface: AWSElasticBeanstalk

  request - Request to delete an application version. - `com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationVersionRequest`

  returns: Result of the DeleteApplicationVersion operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationVersionResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationVersionResult [^AbstractAWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationVersionRequest request]
    (-> this (.deleteApplicationVersion request))))

