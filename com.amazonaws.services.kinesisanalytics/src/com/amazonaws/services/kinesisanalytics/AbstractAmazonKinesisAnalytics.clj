(ns com.amazonaws.services.kinesisanalytics.AbstractAmazonKinesisAnalytics
  "Abstract implementation of AmazonKinesisAnalytics. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kinesisanalytics AbstractAmazonKinesisAnalytics]))

(defn stop-application
  "Description copied from interface: AmazonKinesisAnalytics

  request - `com.amazonaws.services.kinesisanalytics.model.StopApplicationRequest`

  returns: Result of the StopApplication operation returned by the service. - `com.amazonaws.services.kinesisanalytics.model.StopApplicationResult`"
  (^com.amazonaws.services.kinesisanalytics.model.StopApplicationResult [^AbstractAmazonKinesisAnalytics this ^com.amazonaws.services.kinesisanalytics.model.StopApplicationRequest request]
    (-> this (.stopApplication request))))

(defn list-tags-for-resource
  "Description copied from interface: AmazonKinesisAnalytics

  request - `com.amazonaws.services.kinesisanalytics.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.kinesisanalytics.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.kinesisanalytics.model.ListTagsForResourceResult [^AbstractAmazonKinesisAnalytics this ^com.amazonaws.services.kinesisanalytics.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn describe-application
  "Description copied from interface: AmazonKinesisAnalytics

  request - `com.amazonaws.services.kinesisanalytics.model.DescribeApplicationRequest`

  returns: Result of the DescribeApplication operation returned by the service. - `com.amazonaws.services.kinesisanalytics.model.DescribeApplicationResult`"
  (^com.amazonaws.services.kinesisanalytics.model.DescribeApplicationResult [^AbstractAmazonKinesisAnalytics this ^com.amazonaws.services.kinesisanalytics.model.DescribeApplicationRequest request]
    (-> this (.describeApplication request))))

(defn set-region
  "Description copied from interface: AmazonKinesisAnalytics

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonKinesisAnalytics this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn untag-resource
  "Description copied from interface: AmazonKinesisAnalytics

  request - `com.amazonaws.services.kinesisanalytics.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.kinesisanalytics.model.UntagResourceResult`"
  (^com.amazonaws.services.kinesisanalytics.model.UntagResourceResult [^AbstractAmazonKinesisAnalytics this ^com.amazonaws.services.kinesisanalytics.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn delete-application-output
  "Description copied from interface: AmazonKinesisAnalytics

  request - `com.amazonaws.services.kinesisanalytics.model.DeleteApplicationOutputRequest`

  returns: Result of the DeleteApplicationOutput operation returned by the service. - `com.amazonaws.services.kinesisanalytics.model.DeleteApplicationOutputResult`"
  (^com.amazonaws.services.kinesisanalytics.model.DeleteApplicationOutputResult [^AbstractAmazonKinesisAnalytics this ^com.amazonaws.services.kinesisanalytics.model.DeleteApplicationOutputRequest request]
    (-> this (.deleteApplicationOutput request))))

(defn add-application-input
  "Description copied from interface: AmazonKinesisAnalytics

  request - `com.amazonaws.services.kinesisanalytics.model.AddApplicationInputRequest`

  returns: Result of the AddApplicationInput operation returned by the service. - `com.amazonaws.services.kinesisanalytics.model.AddApplicationInputResult`"
  (^com.amazonaws.services.kinesisanalytics.model.AddApplicationInputResult [^AbstractAmazonKinesisAnalytics this ^com.amazonaws.services.kinesisanalytics.model.AddApplicationInputRequest request]
    (-> this (.addApplicationInput request))))

(defn delete-application
  "Description copied from interface: AmazonKinesisAnalytics

  request - `com.amazonaws.services.kinesisanalytics.model.DeleteApplicationRequest`

  returns: Result of the DeleteApplication operation returned by the service. - `com.amazonaws.services.kinesisanalytics.model.DeleteApplicationResult`"
  (^com.amazonaws.services.kinesisanalytics.model.DeleteApplicationResult [^AbstractAmazonKinesisAnalytics this ^com.amazonaws.services.kinesisanalytics.model.DeleteApplicationRequest request]
    (-> this (.deleteApplication request))))

(defn list-applications
  "Description copied from interface: AmazonKinesisAnalytics

  request - `com.amazonaws.services.kinesisanalytics.model.ListApplicationsRequest`

  returns: Result of the ListApplications operation returned by the service. - `com.amazonaws.services.kinesisanalytics.model.ListApplicationsResult`"
  (^com.amazonaws.services.kinesisanalytics.model.ListApplicationsResult [^AbstractAmazonKinesisAnalytics this ^com.amazonaws.services.kinesisanalytics.model.ListApplicationsRequest request]
    (-> this (.listApplications request))))

(defn shutdown
  "Description copied from interface: AmazonKinesisAnalytics"
  ([^AbstractAmazonKinesisAnalytics this]
    (-> this (.shutdown))))

(defn discover-input-schema
  "Description copied from interface: AmazonKinesisAnalytics

  request - `com.amazonaws.services.kinesisanalytics.model.DiscoverInputSchemaRequest`

  returns: Result of the DiscoverInputSchema operation returned by the service. - `com.amazonaws.services.kinesisanalytics.model.DiscoverInputSchemaResult`"
  (^com.amazonaws.services.kinesisanalytics.model.DiscoverInputSchemaResult [^AbstractAmazonKinesisAnalytics this ^com.amazonaws.services.kinesisanalytics.model.DiscoverInputSchemaRequest request]
    (-> this (.discoverInputSchema request))))

(defn delete-application-reference-data-source
  "Description copied from interface: AmazonKinesisAnalytics

  request - `com.amazonaws.services.kinesisanalytics.model.DeleteApplicationReferenceDataSourceRequest`

  returns: Result of the DeleteApplicationReferenceDataSource operation returned by the service. - `com.amazonaws.services.kinesisanalytics.model.DeleteApplicationReferenceDataSourceResult`"
  (^com.amazonaws.services.kinesisanalytics.model.DeleteApplicationReferenceDataSourceResult [^AbstractAmazonKinesisAnalytics this ^com.amazonaws.services.kinesisanalytics.model.DeleteApplicationReferenceDataSourceRequest request]
    (-> this (.deleteApplicationReferenceDataSource request))))

(defn update-application
  "Description copied from interface: AmazonKinesisAnalytics

  request - `com.amazonaws.services.kinesisanalytics.model.UpdateApplicationRequest`

  returns: Result of the UpdateApplication operation returned by the service. - `com.amazonaws.services.kinesisanalytics.model.UpdateApplicationResult`"
  (^com.amazonaws.services.kinesisanalytics.model.UpdateApplicationResult [^AbstractAmazonKinesisAnalytics this ^com.amazonaws.services.kinesisanalytics.model.UpdateApplicationRequest request]
    (-> this (.updateApplication request))))

(defn add-application-output
  "Description copied from interface: AmazonKinesisAnalytics

  request - `com.amazonaws.services.kinesisanalytics.model.AddApplicationOutputRequest`

  returns: Result of the AddApplicationOutput operation returned by the service. - `com.amazonaws.services.kinesisanalytics.model.AddApplicationOutputResult`"
  (^com.amazonaws.services.kinesisanalytics.model.AddApplicationOutputResult [^AbstractAmazonKinesisAnalytics this ^com.amazonaws.services.kinesisanalytics.model.AddApplicationOutputRequest request]
    (-> this (.addApplicationOutput request))))

(defn add-application-input-processing-configuration
  "Description copied from interface: AmazonKinesisAnalytics

  request - `com.amazonaws.services.kinesisanalytics.model.AddApplicationInputProcessingConfigurationRequest`

  returns: Result of the AddApplicationInputProcessingConfiguration operation returned by the service. - `com.amazonaws.services.kinesisanalytics.model.AddApplicationInputProcessingConfigurationResult`"
  (^com.amazonaws.services.kinesisanalytics.model.AddApplicationInputProcessingConfigurationResult [^AbstractAmazonKinesisAnalytics this ^com.amazonaws.services.kinesisanalytics.model.AddApplicationInputProcessingConfigurationRequest request]
    (-> this (.addApplicationInputProcessingConfiguration request))))

(defn start-application
  "Description copied from interface: AmazonKinesisAnalytics

  request - `com.amazonaws.services.kinesisanalytics.model.StartApplicationRequest`

  returns: Result of the StartApplication operation returned by the service. - `com.amazonaws.services.kinesisanalytics.model.StartApplicationResult`"
  (^com.amazonaws.services.kinesisanalytics.model.StartApplicationResult [^AbstractAmazonKinesisAnalytics this ^com.amazonaws.services.kinesisanalytics.model.StartApplicationRequest request]
    (-> this (.startApplication request))))

(defn set-endpoint
  "Description copied from interface: AmazonKinesisAnalytics

  endpoint - The endpoint (ex: \"kinesisanalytics.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://kinesisanalytics.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonKinesisAnalytics this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn create-application
  "Description copied from interface: AmazonKinesisAnalytics

  request - TBD - `com.amazonaws.services.kinesisanalytics.model.CreateApplicationRequest`

  returns: Result of the CreateApplication operation returned by the service. - `com.amazonaws.services.kinesisanalytics.model.CreateApplicationResult`"
  (^com.amazonaws.services.kinesisanalytics.model.CreateApplicationResult [^AbstractAmazonKinesisAnalytics this ^com.amazonaws.services.kinesisanalytics.model.CreateApplicationRequest request]
    (-> this (.createApplication request))))

(defn delete-application-cloud-watch-logging-option
  "Description copied from interface: AmazonKinesisAnalytics

  request - `com.amazonaws.services.kinesisanalytics.model.DeleteApplicationCloudWatchLoggingOptionRequest`

  returns: Result of the DeleteApplicationCloudWatchLoggingOption operation returned by the service. - `com.amazonaws.services.kinesisanalytics.model.DeleteApplicationCloudWatchLoggingOptionResult`"
  (^com.amazonaws.services.kinesisanalytics.model.DeleteApplicationCloudWatchLoggingOptionResult [^AbstractAmazonKinesisAnalytics this ^com.amazonaws.services.kinesisanalytics.model.DeleteApplicationCloudWatchLoggingOptionRequest request]
    (-> this (.deleteApplicationCloudWatchLoggingOption request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonKinesisAnalytics

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonKinesisAnalytics this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn add-application-reference-data-source
  "Description copied from interface: AmazonKinesisAnalytics

  request - `com.amazonaws.services.kinesisanalytics.model.AddApplicationReferenceDataSourceRequest`

  returns: Result of the AddApplicationReferenceDataSource operation returned by the service. - `com.amazonaws.services.kinesisanalytics.model.AddApplicationReferenceDataSourceResult`"
  (^com.amazonaws.services.kinesisanalytics.model.AddApplicationReferenceDataSourceResult [^AbstractAmazonKinesisAnalytics this ^com.amazonaws.services.kinesisanalytics.model.AddApplicationReferenceDataSourceRequest request]
    (-> this (.addApplicationReferenceDataSource request))))

(defn add-application-cloud-watch-logging-option
  "Description copied from interface: AmazonKinesisAnalytics

  request - `com.amazonaws.services.kinesisanalytics.model.AddApplicationCloudWatchLoggingOptionRequest`

  returns: Result of the AddApplicationCloudWatchLoggingOption operation returned by the service. - `com.amazonaws.services.kinesisanalytics.model.AddApplicationCloudWatchLoggingOptionResult`"
  (^com.amazonaws.services.kinesisanalytics.model.AddApplicationCloudWatchLoggingOptionResult [^AbstractAmazonKinesisAnalytics this ^com.amazonaws.services.kinesisanalytics.model.AddApplicationCloudWatchLoggingOptionRequest request]
    (-> this (.addApplicationCloudWatchLoggingOption request))))

(defn tag-resource
  "Description copied from interface: AmazonKinesisAnalytics

  request - `com.amazonaws.services.kinesisanalytics.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.kinesisanalytics.model.TagResourceResult`"
  (^com.amazonaws.services.kinesisanalytics.model.TagResourceResult [^AbstractAmazonKinesisAnalytics this ^com.amazonaws.services.kinesisanalytics.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn delete-application-input-processing-configuration
  "Description copied from interface: AmazonKinesisAnalytics

  request - `com.amazonaws.services.kinesisanalytics.model.DeleteApplicationInputProcessingConfigurationRequest`

  returns: Result of the DeleteApplicationInputProcessingConfiguration operation returned by the service. - `com.amazonaws.services.kinesisanalytics.model.DeleteApplicationInputProcessingConfigurationResult`"
  (^com.amazonaws.services.kinesisanalytics.model.DeleteApplicationInputProcessingConfigurationResult [^AbstractAmazonKinesisAnalytics this ^com.amazonaws.services.kinesisanalytics.model.DeleteApplicationInputProcessingConfigurationRequest request]
    (-> this (.deleteApplicationInputProcessingConfiguration request))))

