(ns com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalkAsync
  "Interface for accessing Elastic Beanstalk asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSElasticBeanstalkAsync instead.


  AWS Elastic Beanstalk

  AWS Elastic Beanstalk makes it easy for you to create, deploy, and manage scalable, fault-tolerant applications
  running on the Amazon Web Services cloud.


  For more information about this product, go to the AWS Elastic
  Beanstalk details page. The location of the latest AWS Elastic Beanstalk WSDL is http://elasticbeanstalk.s3.amazonaws.com/doc/2010-12-01/AWSElasticBeanstalk.wsdl. To install the Software
  Development Kits (SDKs), Integrated Development Environment (IDE) Toolkits, and command line tools that enable you to
  access the API, go to Tools for Amazon Web Services.


  Endpoints


  For a list of region-specific endpoints that AWS Elastic Beanstalk supports, go to Regions and Endpoints in
  the Amazon Web Services Glossary."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.elasticbeanstalk AWSElasticBeanstalkAsync]))

(defn check-dns-availability-async
  "Checks if the specified CNAME is available.

  check-dns-availability-request - Results message indicating whether a CNAME is available. - `com.amazonaws.services.elasticbeanstalk.model.CheckDNSAvailabilityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CheckDNSAvailability operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.CheckDNSAvailabilityResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.CheckDNSAvailabilityRequest check-dns-availability-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.checkDNSAvailabilityAsync check-dns-availability-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.CheckDNSAvailabilityRequest check-dns-availability-request]
    (-> this (.checkDNSAvailabilityAsync check-dns-availability-request))))

(defn describe-environment-resources-async
  "Returns AWS resources for this environment.

  describe-environment-resources-request - Request to describe the resources in an environment. - `com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentResourcesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEnvironmentResources operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentResourcesResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentResourcesRequest describe-environment-resources-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEnvironmentResourcesAsync describe-environment-resources-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentResourcesRequest describe-environment-resources-request]
    (-> this (.describeEnvironmentResourcesAsync describe-environment-resources-request))))

(defn delete-platform-version-async
  "Deletes the specified version of a custom platform.

  delete-platform-version-request - `com.amazonaws.services.elasticbeanstalk.model.DeletePlatformVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePlatformVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.DeletePlatformVersionResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DeletePlatformVersionRequest delete-platform-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePlatformVersionAsync delete-platform-version-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DeletePlatformVersionRequest delete-platform-version-request]
    (-> this (.deletePlatformVersionAsync delete-platform-version-request))))

(defn describe-environment-managed-action-history-async
  "Lists an environment's completed and failed managed actions.

  describe-environment-managed-action-history-request - Request to list completed and failed managed actions. - `com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionHistoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEnvironmentManagedActionHistory operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionHistoryResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionHistoryRequest describe-environment-managed-action-history-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEnvironmentManagedActionHistoryAsync describe-environment-managed-action-history-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionHistoryRequest describe-environment-managed-action-history-request]
    (-> this (.describeEnvironmentManagedActionHistoryAsync describe-environment-managed-action-history-request))))

(defn update-environment-async
  "Updates the environment description, deploys a new application version, updates the configuration settings to an
   entirely new configuration template, or updates select configuration option values in the running environment.


   Attempting to update both the release and configuration is not allowed and AWS Elastic Beanstalk returns an
   InvalidParameterCombination error.


   When updating the configuration settings to a new template or individual settings, a draft configuration is
   created and DescribeConfigurationSettings for this environment returns two setting descriptions with
   different DeploymentStatus values.

  update-environment-request - Request to update an environment. - `com.amazonaws.services.elasticbeanstalk.model.UpdateEnvironmentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateEnvironment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.UpdateEnvironmentResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.UpdateEnvironmentRequest update-environment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateEnvironmentAsync update-environment-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.UpdateEnvironmentRequest update-environment-request]
    (-> this (.updateEnvironmentAsync update-environment-request))))

(defn create-configuration-template-async
  "Creates a configuration template. Templates are associated with a specific application and are used to deploy
   different versions of the application with the same configuration settings.


   Templates aren't associated with any environment. The EnvironmentName response element is always
   null.


   Related Topics




   DescribeConfigurationOptions




   DescribeConfigurationSettings




   ListAvailableSolutionStacks

  create-configuration-template-request - Request to create a configuration template. - `com.amazonaws.services.elasticbeanstalk.model.CreateConfigurationTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateConfigurationTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.CreateConfigurationTemplateResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.CreateConfigurationTemplateRequest create-configuration-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createConfigurationTemplateAsync create-configuration-template-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.CreateConfigurationTemplateRequest create-configuration-template-request]
    (-> this (.createConfigurationTemplateAsync create-configuration-template-request))))

(defn update-application-async
  "Updates the specified application to have the specified properties.



   If a property (for example, description) is not provided, the value remains unchanged. To clear
   these properties, specify an empty string.

  update-application-request - Request to update an application. - `com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationRequest update-application-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateApplicationAsync update-application-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationRequest update-application-request]
    (-> this (.updateApplicationAsync update-application-request))))

(defn rebuild-environment-async
  "Deletes and recreates all of the AWS resources (for example: the Auto Scaling group, load balancer, etc.) for a
   specified environment and forces a restart.

  rebuild-environment-request - `com.amazonaws.services.elasticbeanstalk.model.RebuildEnvironmentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RebuildEnvironment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.RebuildEnvironmentResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.RebuildEnvironmentRequest rebuild-environment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rebuildEnvironmentAsync rebuild-environment-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.RebuildEnvironmentRequest rebuild-environment-request]
    (-> this (.rebuildEnvironmentAsync rebuild-environment-request))))

(defn describe-environment-managed-actions-async
  "Lists an environment's upcoming and in-progress managed actions.

  describe-environment-managed-actions-request - Request to list an environment's upcoming and in-progress managed actions. - `com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEnvironmentManagedActions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionsResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionsRequest describe-environment-managed-actions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEnvironmentManagedActionsAsync describe-environment-managed-actions-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionsRequest describe-environment-managed-actions-request]
    (-> this (.describeEnvironmentManagedActionsAsync describe-environment-managed-actions-request))))

(defn create-environment-async
  "Launches an environment for the specified application using the specified configuration.

  create-environment-request - `com.amazonaws.services.elasticbeanstalk.model.CreateEnvironmentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateEnvironment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.CreateEnvironmentResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.CreateEnvironmentRequest create-environment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createEnvironmentAsync create-environment-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.CreateEnvironmentRequest create-environment-request]
    (-> this (.createEnvironmentAsync create-environment-request))))

(defn terminate-environment-async
  "Terminates the specified environment.

  terminate-environment-request - Request to terminate an environment. - `com.amazonaws.services.elasticbeanstalk.model.TerminateEnvironmentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TerminateEnvironment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.TerminateEnvironmentResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.TerminateEnvironmentRequest terminate-environment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.terminateEnvironmentAsync terminate-environment-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.TerminateEnvironmentRequest terminate-environment-request]
    (-> this (.terminateEnvironmentAsync terminate-environment-request))))

(defn abort-environment-update-async
  "Cancels in-progress environment configuration update or application version deployment.

  abort-environment-update-request - `com.amazonaws.services.elasticbeanstalk.model.AbortEnvironmentUpdateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AbortEnvironmentUpdate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.AbortEnvironmentUpdateResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.AbortEnvironmentUpdateRequest abort-environment-update-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.abortEnvironmentUpdateAsync abort-environment-update-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.AbortEnvironmentUpdateRequest abort-environment-update-request]
    (-> this (.abortEnvironmentUpdateAsync abort-environment-update-request)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this]
    (-> this (.abortEnvironmentUpdateAsync))))

(defn create-application-async
  "Creates an application that has one configuration template named default and no application
   versions.

  create-application-request - Request to create an application. - `com.amazonaws.services.elasticbeanstalk.model.CreateApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.CreateApplicationResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.CreateApplicationRequest create-application-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createApplicationAsync create-application-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.CreateApplicationRequest create-application-request]
    (-> this (.createApplicationAsync create-application-request))))

(defn retrieve-environment-info-async
  "Retrieves the compiled information from a RequestEnvironmentInfo request.


   Related Topics




   RequestEnvironmentInfo

  retrieve-environment-info-request - Request to download logs retrieved with RequestEnvironmentInfo. - `com.amazonaws.services.elasticbeanstalk.model.RetrieveEnvironmentInfoRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RetrieveEnvironmentInfo operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.RetrieveEnvironmentInfoResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.RetrieveEnvironmentInfoRequest retrieve-environment-info-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.retrieveEnvironmentInfoAsync retrieve-environment-info-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.RetrieveEnvironmentInfoRequest retrieve-environment-info-request]
    (-> this (.retrieveEnvironmentInfoAsync retrieve-environment-info-request))))

(defn create-platform-version-async
  "Create a new version of your custom platform.

  create-platform-version-request - Request to create a new platform version. - `com.amazonaws.services.elasticbeanstalk.model.CreatePlatformVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePlatformVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.CreatePlatformVersionResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.CreatePlatformVersionRequest create-platform-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPlatformVersionAsync create-platform-version-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.CreatePlatformVersionRequest create-platform-version-request]
    (-> this (.createPlatformVersionAsync create-platform-version-request))))

(defn delete-application-async
  "Deletes the specified application along with all associated versions and configurations. The application versions
   will not be deleted from your Amazon S3 bucket.



   You cannot delete an application that has a running environment.

  delete-application-request - Request to delete an application. - `com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationRequest delete-application-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApplicationAsync delete-application-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationRequest delete-application-request]
    (-> this (.deleteApplicationAsync delete-application-request))))

(defn describe-platform-version-async
  "Describes the version of the platform.

  describe-platform-version-request - `com.amazonaws.services.elasticbeanstalk.model.DescribePlatformVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePlatformVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.DescribePlatformVersionResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribePlatformVersionRequest describe-platform-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePlatformVersionAsync describe-platform-version-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribePlatformVersionRequest describe-platform-version-request]
    (-> this (.describePlatformVersionAsync describe-platform-version-request))))

(defn validate-configuration-settings-async
  "Takes a set of configuration settings and either a configuration template or environment, and determines whether
   those values are valid.


   This action returns a list of messages indicating any errors or warnings associated with the selection of option
   values.

  validate-configuration-settings-request - A list of validation messages for a specified configuration template. - `com.amazonaws.services.elasticbeanstalk.model.ValidateConfigurationSettingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ValidateConfigurationSettings operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.ValidateConfigurationSettingsResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.ValidateConfigurationSettingsRequest validate-configuration-settings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.validateConfigurationSettingsAsync validate-configuration-settings-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.ValidateConfigurationSettingsRequest validate-configuration-settings-request]
    (-> this (.validateConfigurationSettingsAsync validate-configuration-settings-request))))

(defn describe-instances-health-async
  "Retrieves detailed information about the health of instances in your AWS Elastic Beanstalk. This operation
   requires enhanced health
   reporting.

  describe-instances-health-request - Parameters for a call to DescribeInstancesHealth. - `com.amazonaws.services.elasticbeanstalk.model.DescribeInstancesHealthRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeInstancesHealth operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.DescribeInstancesHealthResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeInstancesHealthRequest describe-instances-health-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeInstancesHealthAsync describe-instances-health-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeInstancesHealthRequest describe-instances-health-request]
    (-> this (.describeInstancesHealthAsync describe-instances-health-request))))

(defn list-platform-versions-async
  "Lists the available platforms.

  list-platform-versions-request - `com.amazonaws.services.elasticbeanstalk.model.ListPlatformVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPlatformVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.ListPlatformVersionsResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.ListPlatformVersionsRequest list-platform-versions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPlatformVersionsAsync list-platform-versions-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.ListPlatformVersionsRequest list-platform-versions-request]
    (-> this (.listPlatformVersionsAsync list-platform-versions-request))))

(defn restart-app-server-async
  "Causes the environment to restart the application container server running on each Amazon EC2 instance.

  restart-app-server-request - `com.amazonaws.services.elasticbeanstalk.model.RestartAppServerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestartAppServer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.RestartAppServerResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.RestartAppServerRequest restart-app-server-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restartAppServerAsync restart-app-server-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.RestartAppServerRequest restart-app-server-request]
    (-> this (.restartAppServerAsync restart-app-server-request))))

(defn describe-configuration-settings-async
  "Returns a description of the settings for the specified configuration set, that is, either a configuration
   template or the configuration set associated with a running environment.


   When describing the settings for the configuration set associated with a running environment, it is possible to
   receive two sets of setting descriptions. One is the deployed configuration set, and the other is a draft
   configuration of an environment that is either in the process of deployment or that failed to deploy.


   Related Topics




   DeleteEnvironmentConfiguration

  describe-configuration-settings-request - Result message containing all of the configuration settings for a specified solution stack or configuration template. - `com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationSettingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeConfigurationSettings operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationSettingsResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationSettingsRequest describe-configuration-settings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeConfigurationSettingsAsync describe-configuration-settings-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationSettingsRequest describe-configuration-settings-request]
    (-> this (.describeConfigurationSettingsAsync describe-configuration-settings-request))))

(defn swap-environment-cnam-es-async
  "Swaps the CNAMEs of two environments.

  swap-environment-cnam-es-request - Swaps the CNAMEs of two environments. - `com.amazonaws.services.elasticbeanstalk.model.SwapEnvironmentCNAMEsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SwapEnvironmentCNAMEs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.SwapEnvironmentCNAMEsResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.SwapEnvironmentCNAMEsRequest swap-environment-cnam-es-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.swapEnvironmentCNAMEsAsync swap-environment-cnam-es-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.SwapEnvironmentCNAMEsRequest swap-environment-cnam-es-request]
    (-> this (.swapEnvironmentCNAMEsAsync swap-environment-cnam-es-request)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this]
    (-> this (.swapEnvironmentCNAMEsAsync))))

(defn describe-environments-async
  "Returns descriptions for existing environments.

  describe-environments-request - Request to describe one or more environments. - `com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEnvironments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentsResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentsRequest describe-environments-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEnvironmentsAsync describe-environments-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentsRequest describe-environments-request]
    (-> this (.describeEnvironmentsAsync describe-environments-request)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this]
    (-> this (.describeEnvironmentsAsync))))

(defn delete-application-version-async
  "Deletes the specified version from the specified application.



   You cannot delete an application version that is associated with a running environment.

  delete-application-version-request - Request to delete an application version. - `com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApplicationVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationVersionResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationVersionRequest delete-application-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApplicationVersionAsync delete-application-version-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationVersionRequest delete-application-version-request]
    (-> this (.deleteApplicationVersionAsync delete-application-version-request))))

(defn update-application-version-async
  "Updates the specified application version to have the specified properties.



   If a property (for example, description) is not provided, the value remains unchanged. To clear
   properties, specify an empty string.

  update-application-version-request - `com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateApplicationVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationVersionResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationVersionRequest update-application-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateApplicationVersionAsync update-application-version-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationVersionRequest update-application-version-request]
    (-> this (.updateApplicationVersionAsync update-application-version-request))))

(defn apply-environment-managed-action-async
  "Applies a scheduled managed action immediately. A managed action can be applied only if its status is
   Scheduled. Get the status and action ID of a managed action with
   DescribeEnvironmentManagedActions.

  apply-environment-managed-action-request - Request to execute a scheduled managed action immediately. - `com.amazonaws.services.elasticbeanstalk.model.ApplyEnvironmentManagedActionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ApplyEnvironmentManagedAction operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.ApplyEnvironmentManagedActionResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.ApplyEnvironmentManagedActionRequest apply-environment-managed-action-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.applyEnvironmentManagedActionAsync apply-environment-managed-action-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.ApplyEnvironmentManagedActionRequest apply-environment-managed-action-request]
    (-> this (.applyEnvironmentManagedActionAsync apply-environment-managed-action-request))))

(defn describe-application-versions-async
  "Retrieve a list of application versions.

  describe-application-versions-request - Request to describe application versions. - `com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeApplicationVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationVersionsResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationVersionsRequest describe-application-versions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeApplicationVersionsAsync describe-application-versions-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationVersionsRequest describe-application-versions-request]
    (-> this (.describeApplicationVersionsAsync describe-application-versions-request)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this]
    (-> this (.describeApplicationVersionsAsync))))

(defn list-tags-for-resource-async
  "Returns the tags applied to an AWS Elastic Beanstalk resource. The response contains a list of tag key-value
   pairs.


   Currently, Elastic Beanstalk only supports tagging of Elastic Beanstalk environments. For details about
   environment tagging, see Tagging Resources in
   Your Elastic Beanstalk Environment.

  list-tags-for-resource-request - `com.amazonaws.services.elasticbeanstalk.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn describe-environment-health-async
  "Returns information about the overall health of the specified environment. The DescribeEnvironmentHealth
   operation is only available with AWS Elastic Beanstalk Enhanced Health.

  describe-environment-health-request - See the example below to learn how to create a request body. - `com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentHealthRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEnvironmentHealth operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentHealthResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentHealthRequest describe-environment-health-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEnvironmentHealthAsync describe-environment-health-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentHealthRequest describe-environment-health-request]
    (-> this (.describeEnvironmentHealthAsync describe-environment-health-request))))

(defn create-application-version-async
  "Creates an application version for the specified application. You can create an application version from a source
   bundle in Amazon S3, a commit in AWS CodeCommit, or the output of an AWS CodeBuild build as follows:


   Specify a commit in an AWS CodeCommit repository with SourceBuildInformation.


   Specify a build in an AWS CodeBuild with SourceBuildInformation and BuildConfiguration.


   Specify a source bundle in S3 with SourceBundle


   Omit both SourceBuildInformation and SourceBundle to use the default sample
   application.



   Once you create an application version with a specified Amazon S3 bucket and key location, you cannot change that
   Amazon S3 location. If you change the Amazon S3 location, you receive an exception when you attempt to launch an
   environment from the application version.

  create-application-version-request - `com.amazonaws.services.elasticbeanstalk.model.CreateApplicationVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateApplicationVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.CreateApplicationVersionResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.CreateApplicationVersionRequest create-application-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createApplicationVersionAsync create-application-version-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.CreateApplicationVersionRequest create-application-version-request]
    (-> this (.createApplicationVersionAsync create-application-version-request))))

(defn create-storage-location-async
  "Creates a bucket in Amazon S3 to store application versions, logs, and other files used by Elastic Beanstalk
   environments. The Elastic Beanstalk console and EB CLI call this API the first time you create an environment in
   a region. If the storage location already exists, CreateStorageLocation still returns the bucket
   name but does not create a new bucket.

  create-storage-location-request - `com.amazonaws.services.elasticbeanstalk.model.CreateStorageLocationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateStorageLocation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.CreateStorageLocationResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.CreateStorageLocationRequest create-storage-location-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createStorageLocationAsync create-storage-location-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.CreateStorageLocationRequest create-storage-location-request]
    (-> this (.createStorageLocationAsync create-storage-location-request)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this]
    (-> this (.createStorageLocationAsync))))

(defn delete-environment-configuration-async
  "Deletes the draft configuration associated with the running environment.


   Updating a running environment with any configuration changes creates a draft configuration set. You can get the
   draft configuration using DescribeConfigurationSettings while the update is in progress or if the update
   fails. The DeploymentStatus for the draft configuration indicates whether the deployment is in
   process or has failed. The draft configuration remains in existence until it is deleted with this action.

  delete-environment-configuration-request - Request to delete a draft environment configuration. - `com.amazonaws.services.elasticbeanstalk.model.DeleteEnvironmentConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEnvironmentConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.DeleteEnvironmentConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DeleteEnvironmentConfigurationRequest delete-environment-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEnvironmentConfigurationAsync delete-environment-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DeleteEnvironmentConfigurationRequest delete-environment-configuration-request]
    (-> this (.deleteEnvironmentConfigurationAsync delete-environment-configuration-request))))

(defn describe-events-async
  "Returns list of event descriptions matching criteria up to the last 6 weeks.



   This action returns the most recent 1,000 events from the specified NextToken.

  describe-events-request - Request to retrieve a list of events for an environment. - `com.amazonaws.services.elasticbeanstalk.model.DescribeEventsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.DescribeEventsResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeEventsRequest describe-events-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventsAsync describe-events-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeEventsRequest describe-events-request]
    (-> this (.describeEventsAsync describe-events-request)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this]
    (-> this (.describeEventsAsync))))

(defn list-available-solution-stacks-async
  "Returns a list of the available solution stack names, with the public version first and then in reverse
   chronological order.

  list-available-solution-stacks-request - `com.amazonaws.services.elasticbeanstalk.model.ListAvailableSolutionStacksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAvailableSolutionStacks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.ListAvailableSolutionStacksResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.ListAvailableSolutionStacksRequest list-available-solution-stacks-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAvailableSolutionStacksAsync list-available-solution-stacks-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.ListAvailableSolutionStacksRequest list-available-solution-stacks-request]
    (-> this (.listAvailableSolutionStacksAsync list-available-solution-stacks-request)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this]
    (-> this (.listAvailableSolutionStacksAsync))))

(defn delete-configuration-template-async
  "Deletes the specified configuration template.



   When you launch an environment using a configuration template, the environment gets a copy of the template. You
   can delete or modify the environment's copy of the template without affecting the running environment.

  delete-configuration-template-request - Request to delete a configuration template. - `com.amazonaws.services.elasticbeanstalk.model.DeleteConfigurationTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteConfigurationTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.DeleteConfigurationTemplateResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DeleteConfigurationTemplateRequest delete-configuration-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteConfigurationTemplateAsync delete-configuration-template-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DeleteConfigurationTemplateRequest delete-configuration-template-request]
    (-> this (.deleteConfigurationTemplateAsync delete-configuration-template-request))))

(defn describe-configuration-options-async
  "Describes the configuration options that are used in a particular configuration template or environment, or that
   a specified solution stack defines. The description includes the values the options, their default values, and an
   indication of the required action on a running environment if an option value is changed.

  describe-configuration-options-request - Result message containing a list of application version descriptions. - `com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeConfigurationOptions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationOptionsResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationOptionsRequest describe-configuration-options-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeConfigurationOptionsAsync describe-configuration-options-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationOptionsRequest describe-configuration-options-request]
    (-> this (.describeConfigurationOptionsAsync describe-configuration-options-request))))

(defn compose-environments-async
  "Create or update a group of environments that each run a separate component of a single application. Takes a list
   of version labels that specify application source bundles for each of the environments to create or update. The
   name of each environment and other required information must be included in the source bundles in an environment
   manifest named env.yaml. See Compose
   Environments for details.

  compose-environments-request - Request to create or update a group of environments. - `com.amazonaws.services.elasticbeanstalk.model.ComposeEnvironmentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ComposeEnvironments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.ComposeEnvironmentsResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.ComposeEnvironmentsRequest compose-environments-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.composeEnvironmentsAsync compose-environments-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.ComposeEnvironmentsRequest compose-environments-request]
    (-> this (.composeEnvironmentsAsync compose-environments-request))))

(defn update-tags-for-resource-async
  "Update the list of tags applied to an AWS Elastic Beanstalk resource. Two lists can be passed:
   TagsToAdd for tags to add or update, and TagsToRemove.


   Currently, Elastic Beanstalk only supports tagging of Elastic Beanstalk environments. For details about
   environment tagging, see Tagging Resources in
   Your Elastic Beanstalk Environment.


   If you create a custom IAM user policy to control permission to this operation, specify one of the following two
   virtual actions (or both) instead of the API operation name:


   elasticbeanstalk:AddTags


   Controls permission to call UpdateTagsForResource and pass a list of tags to add in the
   TagsToAdd parameter.


   elasticbeanstalk:RemoveTags


   Controls permission to call UpdateTagsForResource and pass a list of tag keys to remove in the
   TagsToRemove parameter.




   For details about creating a custom user policy, see Creating a Custom User Policy.

  update-tags-for-resource-request - `com.amazonaws.services.elasticbeanstalk.model.UpdateTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.UpdateTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.UpdateTagsForResourceRequest update-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateTagsForResourceAsync update-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.UpdateTagsForResourceRequest update-tags-for-resource-request]
    (-> this (.updateTagsForResourceAsync update-tags-for-resource-request))))

(defn update-application-resource-lifecycle-async
  "Modifies lifecycle settings for an application.

  update-application-resource-lifecycle-request - `com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationResourceLifecycleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateApplicationResourceLifecycle operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationResourceLifecycleResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationResourceLifecycleRequest update-application-resource-lifecycle-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateApplicationResourceLifecycleAsync update-application-resource-lifecycle-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationResourceLifecycleRequest update-application-resource-lifecycle-request]
    (-> this (.updateApplicationResourceLifecycleAsync update-application-resource-lifecycle-request))))

(defn describe-account-attributes-async
  "Returns attributes related to AWS Elastic Beanstalk that are associated with the calling AWS account.


   The result currently has one set of attributes—resource quotas.

  describe-account-attributes-request - `com.amazonaws.services.elasticbeanstalk.model.DescribeAccountAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAccountAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.DescribeAccountAttributesResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeAccountAttributesRequest describe-account-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAccountAttributesAsync describe-account-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeAccountAttributesRequest describe-account-attributes-request]
    (-> this (.describeAccountAttributesAsync describe-account-attributes-request))))

(defn update-configuration-template-async
  "Updates the specified configuration template to have the specified properties or configuration option values.



   If a property (for example, ApplicationName) is not provided, its value remains unchanged. To clear
   such properties, specify an empty string.



   Related Topics




   DescribeConfigurationOptions

  update-configuration-template-request - The result message containing the options for the specified solution stack. - `com.amazonaws.services.elasticbeanstalk.model.UpdateConfigurationTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateConfigurationTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.UpdateConfigurationTemplateResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.UpdateConfigurationTemplateRequest update-configuration-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateConfigurationTemplateAsync update-configuration-template-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.UpdateConfigurationTemplateRequest update-configuration-template-request]
    (-> this (.updateConfigurationTemplateAsync update-configuration-template-request))))

(defn request-environment-info-async
  "Initiates a request to compile the specified type of information of the deployed environment.


   Setting the InfoType to tail compiles the last lines from the application server log
   files of every Amazon EC2 instance in your environment.


   Setting the InfoType to bundle compresses the application server log files for every
   Amazon EC2 instance into a .zip file. Legacy and .NET containers do not support bundle logs.


   Use RetrieveEnvironmentInfo to obtain the set of logs.


   Related Topics




   RetrieveEnvironmentInfo

  request-environment-info-request - Request to retrieve logs from an environment and store them in your Elastic Beanstalk storage bucket. - `com.amazonaws.services.elasticbeanstalk.model.RequestEnvironmentInfoRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RequestEnvironmentInfo operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.RequestEnvironmentInfoResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.RequestEnvironmentInfoRequest request-environment-info-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.requestEnvironmentInfoAsync request-environment-info-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.RequestEnvironmentInfoRequest request-environment-info-request]
    (-> this (.requestEnvironmentInfoAsync request-environment-info-request))))

(defn describe-applications-async
  "Returns the descriptions of existing applications.

  describe-applications-request - Request to describe one or more applications. - `com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeApplications operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationsResult>`"
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationsRequest describe-applications-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeApplicationsAsync describe-applications-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this ^com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationsRequest describe-applications-request]
    (-> this (.describeApplicationsAsync describe-applications-request)))
  (^java.util.concurrent.Future [^AWSElasticBeanstalkAsync this]
    (-> this (.describeApplicationsAsync))))

