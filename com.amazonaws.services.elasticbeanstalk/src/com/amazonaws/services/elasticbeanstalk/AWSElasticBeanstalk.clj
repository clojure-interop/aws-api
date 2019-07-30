(ns com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk
  "Interface for accessing Elastic Beanstalk.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSElasticBeanstalk instead.


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
  (:import [com.amazonaws.services.elasticbeanstalk AWSElasticBeanstalk]))

(defn describe-environment-resources
  "Returns AWS resources for this environment.

  describe-environment-resources-request - Request to describe the resources in an environment. - `com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentResourcesRequest`

  returns: Result of the DescribeEnvironmentResources operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentResourcesResult`

  throws: com.amazonaws.services.elasticbeanstalk.model.InsufficientPrivilegesException - The specified account does not have sufficient privileges for one or more AWS services."
  (^com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentResourcesResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentResourcesRequest describe-environment-resources-request]
    (-> this (.describeEnvironmentResources describe-environment-resources-request))))

(defn create-storage-location
  "Creates a bucket in Amazon S3 to store application versions, logs, and other files used by Elastic Beanstalk
   environments. The Elastic Beanstalk console and EB CLI call this API the first time you create an environment in
   a region. If the storage location already exists, CreateStorageLocation still returns the bucket
   name but does not create a new bucket.

  create-storage-location-request - `com.amazonaws.services.elasticbeanstalk.model.CreateStorageLocationRequest`

  returns: Result of the CreateStorageLocation operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.CreateStorageLocationResult`

  throws: com.amazonaws.services.elasticbeanstalk.model.TooManyBucketsException - The specified account has reached its limit of Amazon S3 buckets."
  (^com.amazonaws.services.elasticbeanstalk.model.CreateStorageLocationResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.CreateStorageLocationRequest create-storage-location-request]
    (-> this (.createStorageLocation create-storage-location-request)))
  (^com.amazonaws.services.elasticbeanstalk.model.CreateStorageLocationResult [^AWSElasticBeanstalk this]
    (-> this (.createStorageLocation))))

(defn list-tags-for-resource
  "Returns the tags applied to an AWS Elastic Beanstalk resource. The response contains a list of tag key-value
   pairs.


   Currently, Elastic Beanstalk only supports tagging of Elastic Beanstalk environments. For details about
   environment tagging, see Tagging Resources in
   Your Elastic Beanstalk Environment.

  list-tags-for-resource-request - `com.amazonaws.services.elasticbeanstalk.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.elasticbeanstalk.model.InsufficientPrivilegesException - The specified account does not have sufficient privileges for one or more AWS services."
  (^com.amazonaws.services.elasticbeanstalk.model.ListTagsForResourceResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn describe-environment-managed-actions
  "Lists an environment's upcoming and in-progress managed actions.

  describe-environment-managed-actions-request - Request to list an environment's upcoming and in-progress managed actions. - `com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionsRequest`

  returns: Result of the DescribeEnvironmentManagedActions operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionsResult`

  throws: com.amazonaws.services.elasticbeanstalk.model.ElasticBeanstalkServiceException - A generic service exception has occurred."
  (^com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionsResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionsRequest describe-environment-managed-actions-request]
    (-> this (.describeEnvironmentManagedActions describe-environment-managed-actions-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AWSElasticBeanstalk this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn describe-configuration-options
  "Describes the configuration options that are used in a particular configuration template or environment, or that
   a specified solution stack defines. The description includes the values the options, their default values, and an
   indication of the required action on a running environment if an option value is changed.

  describe-configuration-options-request - Result message containing a list of application version descriptions. - `com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationOptionsRequest`

  returns: Result of the DescribeConfigurationOptions operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationOptionsResult`

  throws: com.amazonaws.services.elasticbeanstalk.model.TooManyBucketsException - The specified account has reached its limit of Amazon S3 buckets."
  (^com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationOptionsResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationOptionsRequest describe-configuration-options-request]
    (-> this (.describeConfigurationOptions describe-configuration-options-request))))

(defn create-configuration-template
  "Creates a configuration template. Templates are associated with a specific application and are used to deploy
   different versions of the application with the same configuration settings.


   Templates aren't associated with any environment. The EnvironmentName response element is always
   null.


   Related Topics




   DescribeConfigurationOptions




   DescribeConfigurationSettings




   ListAvailableSolutionStacks

  create-configuration-template-request - Request to create a configuration template. - `com.amazonaws.services.elasticbeanstalk.model.CreateConfigurationTemplateRequest`

  returns: Result of the CreateConfigurationTemplate operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.CreateConfigurationTemplateResult`

  throws: com.amazonaws.services.elasticbeanstalk.model.InsufficientPrivilegesException - The specified account does not have sufficient privileges for one or more AWS services."
  (^com.amazonaws.services.elasticbeanstalk.model.CreateConfigurationTemplateResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.CreateConfigurationTemplateRequest create-configuration-template-request]
    (-> this (.createConfigurationTemplate create-configuration-template-request))))

(defn retrieve-environment-info
  "Retrieves the compiled information from a RequestEnvironmentInfo request.


   Related Topics




   RequestEnvironmentInfo

  retrieve-environment-info-request - Request to download logs retrieved with RequestEnvironmentInfo. - `com.amazonaws.services.elasticbeanstalk.model.RetrieveEnvironmentInfoRequest`

  returns: Result of the RetrieveEnvironmentInfo operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.RetrieveEnvironmentInfoResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.RetrieveEnvironmentInfoResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.RetrieveEnvironmentInfoRequest retrieve-environment-info-request]
    (-> this (.retrieveEnvironmentInfo retrieve-environment-info-request))))

(defn request-environment-info
  "Initiates a request to compile the specified type of information of the deployed environment.


   Setting the InfoType to tail compiles the last lines from the application server log
   files of every Amazon EC2 instance in your environment.


   Setting the InfoType to bundle compresses the application server log files for every
   Amazon EC2 instance into a .zip file. Legacy and .NET containers do not support bundle logs.


   Use RetrieveEnvironmentInfo to obtain the set of logs.


   Related Topics




   RetrieveEnvironmentInfo

  request-environment-info-request - Request to retrieve logs from an environment and store them in your Elastic Beanstalk storage bucket. - `com.amazonaws.services.elasticbeanstalk.model.RequestEnvironmentInfoRequest`

  returns: Result of the RequestEnvironmentInfo operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.RequestEnvironmentInfoResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.RequestEnvironmentInfoResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.RequestEnvironmentInfoRequest request-environment-info-request]
    (-> this (.requestEnvironmentInfo request-environment-info-request))))

(defn update-tags-for-resource
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

  returns: Result of the UpdateTagsForResource operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.UpdateTagsForResourceResult`

  throws: com.amazonaws.services.elasticbeanstalk.model.InsufficientPrivilegesException - The specified account does not have sufficient privileges for one or more AWS services."
  (^com.amazonaws.services.elasticbeanstalk.model.UpdateTagsForResourceResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.UpdateTagsForResourceRequest update-tags-for-resource-request]
    (-> this (.updateTagsForResource update-tags-for-resource-request))))

(defn apply-environment-managed-action
  "Applies a scheduled managed action immediately. A managed action can be applied only if its status is
   Scheduled. Get the status and action ID of a managed action with
   DescribeEnvironmentManagedActions.

  apply-environment-managed-action-request - Request to execute a scheduled managed action immediately. - `com.amazonaws.services.elasticbeanstalk.model.ApplyEnvironmentManagedActionRequest`

  returns: Result of the ApplyEnvironmentManagedAction operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.ApplyEnvironmentManagedActionResult`

  throws: com.amazonaws.services.elasticbeanstalk.model.ElasticBeanstalkServiceException - A generic service exception has occurred."
  (^com.amazonaws.services.elasticbeanstalk.model.ApplyEnvironmentManagedActionResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.ApplyEnvironmentManagedActionRequest apply-environment-managed-action-request]
    (-> this (.applyEnvironmentManagedAction apply-environment-managed-action-request))))

(defn swap-environment-cnam-es
  "Swaps the CNAMEs of two environments.

  swap-environment-cnam-es-request - Swaps the CNAMEs of two environments. - `com.amazonaws.services.elasticbeanstalk.model.SwapEnvironmentCNAMEsRequest`

  returns: Result of the SwapEnvironmentCNAMEs operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.SwapEnvironmentCNAMEsResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.SwapEnvironmentCNAMEsResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.SwapEnvironmentCNAMEsRequest swap-environment-cnam-es-request]
    (-> this (.swapEnvironmentCNAMEs swap-environment-cnam-es-request)))
  (^com.amazonaws.services.elasticbeanstalk.model.SwapEnvironmentCNAMEsResult [^AWSElasticBeanstalk this]
    (-> this (.swapEnvironmentCNAMEs))))

(defn restart-app-server
  "Causes the environment to restart the application container server running on each Amazon EC2 instance.

  restart-app-server-request - `com.amazonaws.services.elasticbeanstalk.model.RestartAppServerRequest`

  returns: Result of the RestartAppServer operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.RestartAppServerResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.RestartAppServerResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.RestartAppServerRequest restart-app-server-request]
    (-> this (.restartAppServer restart-app-server-request))))

(defn rebuild-environment
  "Deletes and recreates all of the AWS resources (for example: the Auto Scaling group, load balancer, etc.) for a
   specified environment and forces a restart.

  rebuild-environment-request - `com.amazonaws.services.elasticbeanstalk.model.RebuildEnvironmentRequest`

  returns: Result of the RebuildEnvironment operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.RebuildEnvironmentResult`

  throws: com.amazonaws.services.elasticbeanstalk.model.InsufficientPrivilegesException - The specified account does not have sufficient privileges for one or more AWS services."
  (^com.amazonaws.services.elasticbeanstalk.model.RebuildEnvironmentResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.RebuildEnvironmentRequest rebuild-environment-request]
    (-> this (.rebuildEnvironment rebuild-environment-request))))

(defn delete-application
  "Deletes the specified application along with all associated versions and configurations. The application versions
   will not be deleted from your Amazon S3 bucket.



   You cannot delete an application that has a running environment.

  delete-application-request - Request to delete an application. - `com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationRequest`

  returns: Result of the DeleteApplication operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationResult`

  throws: com.amazonaws.services.elasticbeanstalk.model.OperationInProgressException - Unable to perform the specified operation because another operation that effects an element in this activity is already in progress."
  (^com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationRequest delete-application-request]
    (-> this (.deleteApplication delete-application-request))))

(defn create-application-version
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

  returns: Result of the CreateApplicationVersion operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.CreateApplicationVersionResult`

  throws: com.amazonaws.services.elasticbeanstalk.model.TooManyApplicationsException - The specified account has reached its limit of applications."
  (^com.amazonaws.services.elasticbeanstalk.model.CreateApplicationVersionResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.CreateApplicationVersionRequest create-application-version-request]
    (-> this (.createApplicationVersion create-application-version-request))))

(defn delete-platform-version
  "Deletes the specified version of a custom platform.

  delete-platform-version-request - `com.amazonaws.services.elasticbeanstalk.model.DeletePlatformVersionRequest`

  returns: Result of the DeletePlatformVersion operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.DeletePlatformVersionResult`

  throws: com.amazonaws.services.elasticbeanstalk.model.OperationInProgressException - Unable to perform the specified operation because another operation that effects an element in this activity is already in progress."
  (^com.amazonaws.services.elasticbeanstalk.model.DeletePlatformVersionResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.DeletePlatformVersionRequest delete-platform-version-request]
    (-> this (.deletePlatformVersion delete-platform-version-request))))

(defn update-application-version
  "Updates the specified application version to have the specified properties.



   If a property (for example, description) is not provided, the value remains unchanged. To clear
   properties, specify an empty string.

  update-application-version-request - `com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationVersionRequest`

  returns: Result of the UpdateApplicationVersion operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationVersionResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationVersionResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationVersionRequest update-application-version-request]
    (-> this (.updateApplicationVersion update-application-version-request))))

(defn describe-environment-managed-action-history
  "Lists an environment's completed and failed managed actions.

  describe-environment-managed-action-history-request - Request to list completed and failed managed actions. - `com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionHistoryRequest`

  returns: Result of the DescribeEnvironmentManagedActionHistory operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionHistoryResult`

  throws: com.amazonaws.services.elasticbeanstalk.model.ElasticBeanstalkServiceException - A generic service exception has occurred."
  (^com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionHistoryResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentManagedActionHistoryRequest describe-environment-managed-action-history-request]
    (-> this (.describeEnvironmentManagedActionHistory describe-environment-managed-action-history-request))))

(defn describe-account-attributes
  "Returns attributes related to AWS Elastic Beanstalk that are associated with the calling AWS account.


   The result currently has one set of attributes—resource quotas.

  describe-account-attributes-request - `com.amazonaws.services.elasticbeanstalk.model.DescribeAccountAttributesRequest`

  returns: Result of the DescribeAccountAttributes operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.DescribeAccountAttributesResult`

  throws: com.amazonaws.services.elasticbeanstalk.model.InsufficientPrivilegesException - The specified account does not have sufficient privileges for one or more AWS services."
  (^com.amazonaws.services.elasticbeanstalk.model.DescribeAccountAttributesResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.DescribeAccountAttributesRequest describe-account-attributes-request]
    (-> this (.describeAccountAttributes describe-account-attributes-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSElasticBeanstalk this]
    (-> this (.shutdown))))

(defn describe-events
  "Returns list of event descriptions matching criteria up to the last 6 weeks.



   This action returns the most recent 1,000 events from the specified NextToken.

  describe-events-request - Request to retrieve a list of events for an environment. - `com.amazonaws.services.elasticbeanstalk.model.DescribeEventsRequest`

  returns: Result of the DescribeEvents operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.DescribeEventsResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.DescribeEventsResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.DescribeEventsRequest describe-events-request]
    (-> this (.describeEvents describe-events-request)))
  (^com.amazonaws.services.elasticbeanstalk.model.DescribeEventsResult [^AWSElasticBeanstalk this]
    (-> this (.describeEvents))))

(defn update-application
  "Updates the specified application to have the specified properties.



   If a property (for example, description) is not provided, the value remains unchanged. To clear
   these properties, specify an empty string.

  update-application-request - Request to update an application. - `com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationRequest`

  returns: Result of the UpdateApplication operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationRequest update-application-request]
    (-> this (.updateApplication update-application-request))))

(defn compose-environments
  "Create or update a group of environments that each run a separate component of a single application. Takes a list
   of version labels that specify application source bundles for each of the environments to create or update. The
   name of each environment and other required information must be included in the source bundles in an environment
   manifest named env.yaml. See Compose
   Environments for details.

  compose-environments-request - Request to create or update a group of environments. - `com.amazonaws.services.elasticbeanstalk.model.ComposeEnvironmentsRequest`

  returns: Result of the ComposeEnvironments operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.ComposeEnvironmentsResult`

  throws: com.amazonaws.services.elasticbeanstalk.model.TooManyEnvironmentsException - The specified account has reached its limit of environments."
  (^com.amazonaws.services.elasticbeanstalk.model.ComposeEnvironmentsResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.ComposeEnvironmentsRequest compose-environments-request]
    (-> this (.composeEnvironments compose-environments-request))))

(defn validate-configuration-settings
  "Takes a set of configuration settings and either a configuration template or environment, and determines whether
   those values are valid.


   This action returns a list of messages indicating any errors or warnings associated with the selection of option
   values.

  validate-configuration-settings-request - A list of validation messages for a specified configuration template. - `com.amazonaws.services.elasticbeanstalk.model.ValidateConfigurationSettingsRequest`

  returns: Result of the ValidateConfigurationSettings operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.ValidateConfigurationSettingsResult`

  throws: com.amazonaws.services.elasticbeanstalk.model.InsufficientPrivilegesException - The specified account does not have sufficient privileges for one or more AWS services."
  (^com.amazonaws.services.elasticbeanstalk.model.ValidateConfigurationSettingsResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.ValidateConfigurationSettingsRequest validate-configuration-settings-request]
    (-> this (.validateConfigurationSettings validate-configuration-settings-request))))

(defn create-environment
  "Launches an environment for the specified application using the specified configuration.

  create-environment-request - `com.amazonaws.services.elasticbeanstalk.model.CreateEnvironmentRequest`

  returns: Result of the CreateEnvironment operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.CreateEnvironmentResult`

  throws: com.amazonaws.services.elasticbeanstalk.model.TooManyEnvironmentsException - The specified account has reached its limit of environments."
  (^com.amazonaws.services.elasticbeanstalk.model.CreateEnvironmentResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.CreateEnvironmentRequest create-environment-request]
    (-> this (.createEnvironment create-environment-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"elasticbeanstalk.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://elasticbeanstalk.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AWSElasticBeanstalk this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn abort-environment-update
  "Cancels in-progress environment configuration update or application version deployment.

  abort-environment-update-request - `com.amazonaws.services.elasticbeanstalk.model.AbortEnvironmentUpdateRequest`

  returns: Result of the AbortEnvironmentUpdate operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.AbortEnvironmentUpdateResult`

  throws: com.amazonaws.services.elasticbeanstalk.model.InsufficientPrivilegesException - The specified account does not have sufficient privileges for one or more AWS services."
  (^com.amazonaws.services.elasticbeanstalk.model.AbortEnvironmentUpdateResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.AbortEnvironmentUpdateRequest abort-environment-update-request]
    (-> this (.abortEnvironmentUpdate abort-environment-update-request)))
  (^com.amazonaws.services.elasticbeanstalk.model.AbortEnvironmentUpdateResult [^AWSElasticBeanstalk this]
    (-> this (.abortEnvironmentUpdate))))

(defn create-application
  "Creates an application that has one configuration template named default and no application
   versions.

  create-application-request - Request to create an application. - `com.amazonaws.services.elasticbeanstalk.model.CreateApplicationRequest`

  returns: Result of the CreateApplication operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.CreateApplicationResult`

  throws: com.amazonaws.services.elasticbeanstalk.model.TooManyApplicationsException - The specified account has reached its limit of applications."
  (^com.amazonaws.services.elasticbeanstalk.model.CreateApplicationResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.CreateApplicationRequest create-application-request]
    (-> this (.createApplication create-application-request))))

(defn update-application-resource-lifecycle
  "Modifies lifecycle settings for an application.

  update-application-resource-lifecycle-request - `com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationResourceLifecycleRequest`

  returns: Result of the UpdateApplicationResourceLifecycle operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationResourceLifecycleResult`

  throws: com.amazonaws.services.elasticbeanstalk.model.InsufficientPrivilegesException - The specified account does not have sufficient privileges for one or more AWS services."
  (^com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationResourceLifecycleResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.UpdateApplicationResourceLifecycleRequest update-application-resource-lifecycle-request]
    (-> this (.updateApplicationResourceLifecycle update-application-resource-lifecycle-request))))

(defn describe-environments
  "Returns descriptions for existing environments.

  describe-environments-request - Request to describe one or more environments. - `com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentsRequest`

  returns: Result of the DescribeEnvironments operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentsResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentsResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentsRequest describe-environments-request]
    (-> this (.describeEnvironments describe-environments-request)))
  (^com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentsResult [^AWSElasticBeanstalk this]
    (-> this (.describeEnvironments))))

(defn list-available-solution-stacks
  "Returns a list of the available solution stack names, with the public version first and then in reverse
   chronological order.

  list-available-solution-stacks-request - `com.amazonaws.services.elasticbeanstalk.model.ListAvailableSolutionStacksRequest`

  returns: Result of the ListAvailableSolutionStacks operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.ListAvailableSolutionStacksResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.ListAvailableSolutionStacksResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.ListAvailableSolutionStacksRequest list-available-solution-stacks-request]
    (-> this (.listAvailableSolutionStacks list-available-solution-stacks-request)))
  (^com.amazonaws.services.elasticbeanstalk.model.ListAvailableSolutionStacksResult [^AWSElasticBeanstalk this]
    (-> this (.listAvailableSolutionStacks))))

(defn describe-platform-version
  "Describes the version of the platform.

  describe-platform-version-request - `com.amazonaws.services.elasticbeanstalk.model.DescribePlatformVersionRequest`

  returns: Result of the DescribePlatformVersion operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.DescribePlatformVersionResult`

  throws: com.amazonaws.services.elasticbeanstalk.model.InsufficientPrivilegesException - The specified account does not have sufficient privileges for one or more AWS services."
  (^com.amazonaws.services.elasticbeanstalk.model.DescribePlatformVersionResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.DescribePlatformVersionRequest describe-platform-version-request]
    (-> this (.describePlatformVersion describe-platform-version-request))))

(defn terminate-environment
  "Terminates the specified environment.

  terminate-environment-request - Request to terminate an environment. - `com.amazonaws.services.elasticbeanstalk.model.TerminateEnvironmentRequest`

  returns: Result of the TerminateEnvironment operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.TerminateEnvironmentResult`

  throws: com.amazonaws.services.elasticbeanstalk.model.InsufficientPrivilegesException - The specified account does not have sufficient privileges for one or more AWS services."
  (^com.amazonaws.services.elasticbeanstalk.model.TerminateEnvironmentResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.TerminateEnvironmentRequest terminate-environment-request]
    (-> this (.terminateEnvironment terminate-environment-request))))

(defn describe-configuration-settings
  "Returns a description of the settings for the specified configuration set, that is, either a configuration
   template or the configuration set associated with a running environment.


   When describing the settings for the configuration set associated with a running environment, it is possible to
   receive two sets of setting descriptions. One is the deployed configuration set, and the other is a draft
   configuration of an environment that is either in the process of deployment or that failed to deploy.


   Related Topics




   DeleteEnvironmentConfiguration

  describe-configuration-settings-request - Result message containing all of the configuration settings for a specified solution stack or configuration template. - `com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationSettingsRequest`

  returns: Result of the DescribeConfigurationSettings operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationSettingsResult`

  throws: com.amazonaws.services.elasticbeanstalk.model.TooManyBucketsException - The specified account has reached its limit of Amazon S3 buckets."
  (^com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationSettingsResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.DescribeConfigurationSettingsRequest describe-configuration-settings-request]
    (-> this (.describeConfigurationSettings describe-configuration-settings-request))))

(defn delete-configuration-template
  "Deletes the specified configuration template.



   When you launch an environment using a configuration template, the environment gets a copy of the template. You
   can delete or modify the environment's copy of the template without affecting the running environment.

  delete-configuration-template-request - Request to delete a configuration template. - `com.amazonaws.services.elasticbeanstalk.model.DeleteConfigurationTemplateRequest`

  returns: Result of the DeleteConfigurationTemplate operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.DeleteConfigurationTemplateResult`

  throws: com.amazonaws.services.elasticbeanstalk.model.OperationInProgressException - Unable to perform the specified operation because another operation that effects an element in this activity is already in progress."
  (^com.amazonaws.services.elasticbeanstalk.model.DeleteConfigurationTemplateResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.DeleteConfigurationTemplateRequest delete-configuration-template-request]
    (-> this (.deleteConfigurationTemplate delete-configuration-template-request))))

(defn describe-application-versions
  "Retrieve a list of application versions.

  describe-application-versions-request - Request to describe application versions. - `com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationVersionsRequest`

  returns: Result of the DescribeApplicationVersions operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationVersionsResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationVersionsResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationVersionsRequest describe-application-versions-request]
    (-> this (.describeApplicationVersions describe-application-versions-request)))
  (^com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationVersionsResult [^AWSElasticBeanstalk this]
    (-> this (.describeApplicationVersions))))

(defn list-platform-versions
  "Lists the available platforms.

  list-platform-versions-request - `com.amazonaws.services.elasticbeanstalk.model.ListPlatformVersionsRequest`

  returns: Result of the ListPlatformVersions operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.ListPlatformVersionsResult`

  throws: com.amazonaws.services.elasticbeanstalk.model.InsufficientPrivilegesException - The specified account does not have sufficient privileges for one or more AWS services."
  (^com.amazonaws.services.elasticbeanstalk.model.ListPlatformVersionsResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.ListPlatformVersionsRequest list-platform-versions-request]
    (-> this (.listPlatformVersions list-platform-versions-request))))

(defn delete-environment-configuration
  "Deletes the draft configuration associated with the running environment.


   Updating a running environment with any configuration changes creates a draft configuration set. You can get the
   draft configuration using DescribeConfigurationSettings while the update is in progress or if the update
   fails. The DeploymentStatus for the draft configuration indicates whether the deployment is in
   process or has failed. The draft configuration remains in existence until it is deleted with this action.

  delete-environment-configuration-request - Request to delete a draft environment configuration. - `com.amazonaws.services.elasticbeanstalk.model.DeleteEnvironmentConfigurationRequest`

  returns: Result of the DeleteEnvironmentConfiguration operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.DeleteEnvironmentConfigurationResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.DeleteEnvironmentConfigurationResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.DeleteEnvironmentConfigurationRequest delete-environment-configuration-request]
    (-> this (.deleteEnvironmentConfiguration delete-environment-configuration-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSElasticBeanstalk this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn create-platform-version
  "Create a new version of your custom platform.

  create-platform-version-request - Request to create a new platform version. - `com.amazonaws.services.elasticbeanstalk.model.CreatePlatformVersionRequest`

  returns: Result of the CreatePlatformVersion operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.CreatePlatformVersionResult`

  throws: com.amazonaws.services.elasticbeanstalk.model.InsufficientPrivilegesException - The specified account does not have sufficient privileges for one or more AWS services."
  (^com.amazonaws.services.elasticbeanstalk.model.CreatePlatformVersionResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.CreatePlatformVersionRequest create-platform-version-request]
    (-> this (.createPlatformVersion create-platform-version-request))))

(defn describe-environment-health
  "Returns information about the overall health of the specified environment. The DescribeEnvironmentHealth
   operation is only available with AWS Elastic Beanstalk Enhanced Health.

  describe-environment-health-request - See the example below to learn how to create a request body. - `com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentHealthRequest`

  returns: Result of the DescribeEnvironmentHealth operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentHealthResult`

  throws: com.amazonaws.services.elasticbeanstalk.model.InvalidRequestException - One or more input parameters is not valid. Please correct the input parameters and try the operation again."
  (^com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentHealthResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentHealthRequest describe-environment-health-request]
    (-> this (.describeEnvironmentHealth describe-environment-health-request))))

(defn update-environment
  "Updates the environment description, deploys a new application version, updates the configuration settings to an
   entirely new configuration template, or updates select configuration option values in the running environment.


   Attempting to update both the release and configuration is not allowed and AWS Elastic Beanstalk returns an
   InvalidParameterCombination error.


   When updating the configuration settings to a new template or individual settings, a draft configuration is
   created and DescribeConfigurationSettings for this environment returns two setting descriptions with
   different DeploymentStatus values.

  update-environment-request - Request to update an environment. - `com.amazonaws.services.elasticbeanstalk.model.UpdateEnvironmentRequest`

  returns: Result of the UpdateEnvironment operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.UpdateEnvironmentResult`

  throws: com.amazonaws.services.elasticbeanstalk.model.InsufficientPrivilegesException - The specified account does not have sufficient privileges for one or more AWS services."
  (^com.amazonaws.services.elasticbeanstalk.model.UpdateEnvironmentResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.UpdateEnvironmentRequest update-environment-request]
    (-> this (.updateEnvironment update-environment-request))))

(defn describe-instances-health
  "Retrieves detailed information about the health of instances in your AWS Elastic Beanstalk. This operation
   requires enhanced health
   reporting.

  describe-instances-health-request - Parameters for a call to DescribeInstancesHealth. - `com.amazonaws.services.elasticbeanstalk.model.DescribeInstancesHealthRequest`

  returns: Result of the DescribeInstancesHealth operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.DescribeInstancesHealthResult`

  throws: com.amazonaws.services.elasticbeanstalk.model.InvalidRequestException - One or more input parameters is not valid. Please correct the input parameters and try the operation again."
  (^com.amazonaws.services.elasticbeanstalk.model.DescribeInstancesHealthResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.DescribeInstancesHealthRequest describe-instances-health-request]
    (-> this (.describeInstancesHealth describe-instances-health-request))))

(defn update-configuration-template
  "Updates the specified configuration template to have the specified properties or configuration option values.



   If a property (for example, ApplicationName) is not provided, its value remains unchanged. To clear
   such properties, specify an empty string.



   Related Topics




   DescribeConfigurationOptions

  update-configuration-template-request - The result message containing the options for the specified solution stack. - `com.amazonaws.services.elasticbeanstalk.model.UpdateConfigurationTemplateRequest`

  returns: Result of the UpdateConfigurationTemplate operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.UpdateConfigurationTemplateResult`

  throws: com.amazonaws.services.elasticbeanstalk.model.InsufficientPrivilegesException - The specified account does not have sufficient privileges for one or more AWS services."
  (^com.amazonaws.services.elasticbeanstalk.model.UpdateConfigurationTemplateResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.UpdateConfigurationTemplateRequest update-configuration-template-request]
    (-> this (.updateConfigurationTemplate update-configuration-template-request))))

(defn check-dns-availability
  "Checks if the specified CNAME is available.

  check-dns-availability-request - Results message indicating whether a CNAME is available. - `com.amazonaws.services.elasticbeanstalk.model.CheckDNSAvailabilityRequest`

  returns: Result of the CheckDNSAvailability operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.CheckDNSAvailabilityResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.CheckDNSAvailabilityResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.CheckDNSAvailabilityRequest check-dns-availability-request]
    (-> this (.checkDNSAvailability check-dns-availability-request))))

(defn describe-applications
  "Returns the descriptions of existing applications.

  describe-applications-request - Request to describe one or more applications. - `com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationsRequest`

  returns: Result of the DescribeApplications operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationsResult`"
  (^com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationsResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationsRequest describe-applications-request]
    (-> this (.describeApplications describe-applications-request)))
  (^com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationsResult [^AWSElasticBeanstalk this]
    (-> this (.describeApplications))))

(defn delete-application-version
  "Deletes the specified version from the specified application.



   You cannot delete an application version that is associated with a running environment.

  delete-application-version-request - Request to delete an application version. - `com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationVersionRequest`

  returns: Result of the DeleteApplicationVersion operation returned by the service. - `com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationVersionResult`

  throws: com.amazonaws.services.elasticbeanstalk.model.SourceBundleDeletionException - Unable to delete the Amazon S3 source bundle associated with the application version. The application version was deleted successfully."
  (^com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationVersionResult [^AWSElasticBeanstalk this ^com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationVersionRequest delete-application-version-request]
    (-> this (.deleteApplicationVersion delete-application-version-request))))

