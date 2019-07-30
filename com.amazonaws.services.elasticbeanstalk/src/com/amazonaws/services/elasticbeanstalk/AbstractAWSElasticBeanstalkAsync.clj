(ns com.amazonaws.services.elasticbeanstalk.AbstractAWSElasticBeanstalkAsync
  "Abstract implementation of AWSElasticBeanstalkAsync. Convenient method forms pass through to the
  corresponding overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.elasticbeanstalk AbstractAWSElasticBeanstalkAsync]))

(defn check-dns-availability-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - Results message indicating whether a CNAME is available. - `com.amazonaws.services.elasticbeanstalk.model.CheckDNSAvailabilityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CheckDNSAvailability operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.CheckDNSAvailabilityResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.CheckDNSAvailabilityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.checkDNSAvailabilityAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.CheckDNSAvailabilityRequest request]
    (-> this (.checkDNSAvailabilityAsync request))))

(defn describe-environment-resources-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - Request to describe the resources in an environment. - `com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentResourcesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEnvironmentResources operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentResourcesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentResourcesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEnvironmentResourcesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentResourcesRequest request]
    (-> this (.describeEnvironmentResourcesAsync request))))

(defn delete-platform-version-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - `com.amazonaws.services.elasticbeanstalk.model.DeletePlatformVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePlatformVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.DeletePlatformVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DeletePlatformVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePlatformVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DeletePlatformVersionRequest request]
    (-> this (.deletePlatformVersionAsync request))))

(defn describe-environment-managed-action-history-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - Request to list completed and failed managed actions. - `com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionHistoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEnvironmentManagedActionHistory operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionHistoryResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionHistoryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEnvironmentManagedActionHistoryAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionHistoryRequest request]
    (-> this (.describeEnvironmentManagedActionHistoryAsync request))))

(defn update-environment-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - Request to update an environment. - `com.amazonaws.services.elasticbeanstalk.model.UpdateEnvironmentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateEnvironment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.UpdateEnvironmentResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.UpdateEnvironmentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateEnvironmentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.UpdateEnvironmentRequest request]
    (-> this (.updateEnvironmentAsync request))))

(defn create-configuration-template-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - Request to create a configuration template. - `com.amazonaws.services.elasticbeanstalk.model.CreateConfigurationTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateConfigurationTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.CreateConfigurationTemplateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.CreateConfigurationTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createConfigurationTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.CreateConfigurationTemplateRequest request]
    (-> this (.createConfigurationTemplateAsync request))))

(defn update-application-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - Request to update an application. - `com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationRequest request]
    (-> this (.updateApplicationAsync request))))

(defn rebuild-environment-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - `com.amazonaws.services.elasticbeanstalk.model.RebuildEnvironmentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RebuildEnvironment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.RebuildEnvironmentResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.RebuildEnvironmentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rebuildEnvironmentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.RebuildEnvironmentRequest request]
    (-> this (.rebuildEnvironmentAsync request))))

(defn describe-environment-managed-actions-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - Request to list an environment's upcoming and in-progress managed actions. - `com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEnvironmentManagedActions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEnvironmentManagedActionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionsRequest request]
    (-> this (.describeEnvironmentManagedActionsAsync request))))

(defn create-environment-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - `com.amazonaws.services.elasticbeanstalk.model.CreateEnvironmentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateEnvironment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.CreateEnvironmentResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.CreateEnvironmentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createEnvironmentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.CreateEnvironmentRequest request]
    (-> this (.createEnvironmentAsync request))))

(defn terminate-environment-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - Request to terminate an environment. - `com.amazonaws.services.elasticbeanstalk.model.TerminateEnvironmentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TerminateEnvironment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.TerminateEnvironmentResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.TerminateEnvironmentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.terminateEnvironmentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.TerminateEnvironmentRequest request]
    (-> this (.terminateEnvironmentAsync request))))

(defn abort-environment-update-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - `com.amazonaws.services.elasticbeanstalk.model.AbortEnvironmentUpdateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AbortEnvironmentUpdate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.AbortEnvironmentUpdateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.AbortEnvironmentUpdateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.abortEnvironmentUpdateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.AbortEnvironmentUpdateRequest request]
    (-> this (.abortEnvironmentUpdateAsync request)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this]
    (-> this (.abortEnvironmentUpdateAsync))))

(defn create-application-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - Request to create an application. - `com.amazonaws.services.elasticbeanstalk.model.CreateApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.CreateApplicationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.CreateApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.CreateApplicationRequest request]
    (-> this (.createApplicationAsync request))))

(defn retrieve-environment-info-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - Request to download logs retrieved with RequestEnvironmentInfo. - `com.amazonaws.services.elasticbeanstalk.model.RetrieveEnvironmentInfoRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RetrieveEnvironmentInfo operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.RetrieveEnvironmentInfoResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.RetrieveEnvironmentInfoRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.retrieveEnvironmentInfoAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.RetrieveEnvironmentInfoRequest request]
    (-> this (.retrieveEnvironmentInfoAsync request))))

(defn create-platform-version-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - Request to create a new platform version. - `com.amazonaws.services.elasticbeanstalk.model.CreatePlatformVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePlatformVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.CreatePlatformVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.CreatePlatformVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPlatformVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.CreatePlatformVersionRequest request]
    (-> this (.createPlatformVersionAsync request))))

(defn delete-application-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - Request to delete an application. - `com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationRequest request]
    (-> this (.deleteApplicationAsync request))))

(defn describe-platform-version-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - `com.amazonaws.services.elasticbeanstalk.model.DescribePlatformVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePlatformVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.DescribePlatformVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribePlatformVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePlatformVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribePlatformVersionRequest request]
    (-> this (.describePlatformVersionAsync request))))

(defn validate-configuration-settings-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - A list of validation messages for a specified configuration template. - `com.amazonaws.services.elasticbeanstalk.model.ValidateConfigurationSettingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ValidateConfigurationSettings operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.ValidateConfigurationSettingsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.ValidateConfigurationSettingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.validateConfigurationSettingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.ValidateConfigurationSettingsRequest request]
    (-> this (.validateConfigurationSettingsAsync request))))

(defn describe-instances-health-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - Parameters for a call to DescribeInstancesHealth. - `com.amazonaws.services.elasticbeanstalk.model.DescribeInstancesHealthRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeInstancesHealth operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.DescribeInstancesHealthResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeInstancesHealthRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeInstancesHealthAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeInstancesHealthRequest request]
    (-> this (.describeInstancesHealthAsync request))))

(defn list-platform-versions-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - `com.amazonaws.services.elasticbeanstalk.model.ListPlatformVersionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPlatformVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.ListPlatformVersionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.ListPlatformVersionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPlatformVersionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.ListPlatformVersionsRequest request]
    (-> this (.listPlatformVersionsAsync request))))

(defn restart-app-server-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - `com.amazonaws.services.elasticbeanstalk.model.RestartAppServerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestartAppServer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.RestartAppServerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.RestartAppServerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restartAppServerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.RestartAppServerRequest request]
    (-> this (.restartAppServerAsync request))))

(defn describe-configuration-settings-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - Result message containing all of the configuration settings for a specified solution stack or configuration template. - `com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationSettingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeConfigurationSettings operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationSettingsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationSettingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeConfigurationSettingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationSettingsRequest request]
    (-> this (.describeConfigurationSettingsAsync request))))

(defn swap-environment-cnam-es-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - Swaps the CNAMEs of two environments. - `com.amazonaws.services.elasticbeanstalk.model.SwapEnvironmentCNAMEsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SwapEnvironmentCNAMEs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.SwapEnvironmentCNAMEsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.SwapEnvironmentCNAMEsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.swapEnvironmentCNAMEsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.SwapEnvironmentCNAMEsRequest request]
    (-> this (.swapEnvironmentCNAMEsAsync request)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this]
    (-> this (.swapEnvironmentCNAMEsAsync))))

(defn describe-environments-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - Request to describe one or more environments. - `com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEnvironments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEnvironmentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentsRequest request]
    (-> this (.describeEnvironmentsAsync request)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this]
    (-> this (.describeEnvironmentsAsync))))

(defn delete-application-version-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - Request to delete an application version. - `com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApplicationVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApplicationVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationVersionRequest request]
    (-> this (.deleteApplicationVersionAsync request))))

(defn update-application-version-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - `com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateApplicationVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateApplicationVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationVersionRequest request]
    (-> this (.updateApplicationVersionAsync request))))

(defn apply-environment-managed-action-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - Request to execute a scheduled managed action immediately. - `com.amazonaws.services.elasticbeanstalk.model.ApplyEnvironmentManagedActionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ApplyEnvironmentManagedAction operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.ApplyEnvironmentManagedActionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.ApplyEnvironmentManagedActionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.applyEnvironmentManagedActionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.ApplyEnvironmentManagedActionRequest request]
    (-> this (.applyEnvironmentManagedActionAsync request))))

(defn describe-application-versions-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - Request to describe application versions. - `com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeApplicationVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationVersionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationVersionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeApplicationVersionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationVersionsRequest request]
    (-> this (.describeApplicationVersionsAsync request)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this]
    (-> this (.describeApplicationVersionsAsync))))

(defn list-tags-for-resource-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - `com.amazonaws.services.elasticbeanstalk.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn describe-environment-health-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - See the example below to learn how to create a request body. - `com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentHealthRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEnvironmentHealth operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentHealthResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentHealthRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEnvironmentHealthAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentHealthRequest request]
    (-> this (.describeEnvironmentHealthAsync request))))

(defn create-application-version-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - `com.amazonaws.services.elasticbeanstalk.model.CreateApplicationVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateApplicationVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.CreateApplicationVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.CreateApplicationVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createApplicationVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.CreateApplicationVersionRequest request]
    (-> this (.createApplicationVersionAsync request))))

(defn create-storage-location-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - `com.amazonaws.services.elasticbeanstalk.model.CreateStorageLocationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateStorageLocation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.CreateStorageLocationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.CreateStorageLocationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createStorageLocationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.CreateStorageLocationRequest request]
    (-> this (.createStorageLocationAsync request)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this]
    (-> this (.createStorageLocationAsync))))

(defn delete-environment-configuration-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - Request to delete a draft environment configuration. - `com.amazonaws.services.elasticbeanstalk.model.DeleteEnvironmentConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEnvironmentConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.DeleteEnvironmentConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DeleteEnvironmentConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEnvironmentConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DeleteEnvironmentConfigurationRequest request]
    (-> this (.deleteEnvironmentConfigurationAsync request))))

(defn describe-events-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - Request to retrieve a list of events for an environment. - `com.amazonaws.services.elasticbeanstalk.model.DescribeEventsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.DescribeEventsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeEventsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeEventsRequest request]
    (-> this (.describeEventsAsync request)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this]
    (-> this (.describeEventsAsync))))

(defn list-available-solution-stacks-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - `com.amazonaws.services.elasticbeanstalk.model.ListAvailableSolutionStacksRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAvailableSolutionStacks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.ListAvailableSolutionStacksResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.ListAvailableSolutionStacksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAvailableSolutionStacksAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.ListAvailableSolutionStacksRequest request]
    (-> this (.listAvailableSolutionStacksAsync request)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this]
    (-> this (.listAvailableSolutionStacksAsync))))

(defn delete-configuration-template-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - Request to delete a configuration template. - `com.amazonaws.services.elasticbeanstalk.model.DeleteConfigurationTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteConfigurationTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.DeleteConfigurationTemplateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DeleteConfigurationTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteConfigurationTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DeleteConfigurationTemplateRequest request]
    (-> this (.deleteConfigurationTemplateAsync request))))

(defn describe-configuration-options-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - Result message containing a list of application version descriptions. - `com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeConfigurationOptions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationOptionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationOptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeConfigurationOptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationOptionsRequest request]
    (-> this (.describeConfigurationOptionsAsync request))))

(defn compose-environments-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - Request to create or update a group of environments. - `com.amazonaws.services.elasticbeanstalk.model.ComposeEnvironmentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ComposeEnvironments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.ComposeEnvironmentsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.ComposeEnvironmentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.composeEnvironmentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.ComposeEnvironmentsRequest request]
    (-> this (.composeEnvironmentsAsync request))))

(defn update-tags-for-resource-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - `com.amazonaws.services.elasticbeanstalk.model.UpdateTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.UpdateTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.UpdateTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.UpdateTagsForResourceRequest request]
    (-> this (.updateTagsForResourceAsync request))))

(defn update-application-resource-lifecycle-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - `com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationResourceLifecycleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateApplicationResourceLifecycle operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationResourceLifecycleResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationResourceLifecycleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateApplicationResourceLifecycleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationResourceLifecycleRequest request]
    (-> this (.updateApplicationResourceLifecycleAsync request))))

(defn describe-account-attributes-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - `com.amazonaws.services.elasticbeanstalk.model.DescribeAccountAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAccountAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.DescribeAccountAttributesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeAccountAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAccountAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeAccountAttributesRequest request]
    (-> this (.describeAccountAttributesAsync request))))

(defn update-configuration-template-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - The result message containing the options for the specified solution stack. - `com.amazonaws.services.elasticbeanstalk.model.UpdateConfigurationTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateConfigurationTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.UpdateConfigurationTemplateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.UpdateConfigurationTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateConfigurationTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.UpdateConfigurationTemplateRequest request]
    (-> this (.updateConfigurationTemplateAsync request))))

(defn request-environment-info-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - Request to retrieve logs from an environment and store them in your Elastic Beanstalk storage bucket. - `com.amazonaws.services.elasticbeanstalk.model.RequestEnvironmentInfoRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RequestEnvironmentInfo operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.RequestEnvironmentInfoResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.RequestEnvironmentInfoRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.requestEnvironmentInfoAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.RequestEnvironmentInfoRequest request]
    (-> this (.requestEnvironmentInfoAsync request))))

(defn describe-applications-async
  "Description copied from interface: AWSElasticBeanstalkAsync

  request - Request to describe one or more applications. - `com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeApplications operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeApplicationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationsRequest request]
    (-> this (.describeApplicationsAsync request)))
  (^java.util.concurrent.Future [^AbstractAWSElasticBeanstalkAsync this]
    (-> this (.describeApplicationsAsync))))

