(ns com.amazonaws.services.iotanalytics.AWSIoTAnalyticsClient
  "Client for accessing AWS IoT Analytics. All service calls made using this client are blocking, and will not return
  until the service call completes.


  AWS IoT Analytics allows you to collect large amounts of device data, process messages, and store them. You can then
  query the data and run sophisticated analytics on it. AWS IoT Analytics enables advanced data exploration through
  integration with Jupyter Notebooks and data visualization through integration with Amazon QuickSight.


  Traditional analytics and business intelligence tools are designed to process structured data. IoT data often comes
  from devices that record noisy processes (such as temperature, motion, or sound). As a result the data from these
  devices can have significant gaps, corrupted messages, and false readings that must be cleaned up before analysis can
  occur. Also, IoT data is often only meaningful in the context of other data from external sources.


  AWS IoT Analytics automates the steps required to analyze data from IoT devices. AWS IoT Analytics filters,
  transforms, and enriches IoT data before storing it in a time-series data store for analysis. You can set up the
  service to collect only the data you need from your devices, apply mathematical transforms to process the data, and
  enrich the data with device-specific metadata such as device type and location before storing it. Then, you can
  analyze your data by running queries using the built-in SQL query engine, or perform more complex analytics and
  machine learning inference. AWS IoT Analytics includes pre-built models for common IoT use cases so you can answer
  questions like which devices are about to fail or which customers are at risk of abandoning their wearable devices."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.iotanalytics AWSIoTAnalyticsClient]))

(defn *builder
  "returns: `com.amazonaws.services.iotanalytics.AWSIoTAnalyticsClientBuilder`"
  (^com.amazonaws.services.iotanalytics.AWSIoTAnalyticsClientBuilder []
    (AWSIoTAnalyticsClient/builder )))

(defn update-dataset
  "Updates the settings of a data set.

  request - `com.amazonaws.services.iotanalytics.model.UpdateDatasetRequest`

  returns: Result of the UpdateDataset operation returned by the service. - `com.amazonaws.services.iotanalytics.model.UpdateDatasetResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.UpdateDatasetResult [^AWSIoTAnalyticsClient this ^com.amazonaws.services.iotanalytics.model.UpdateDatasetRequest request]
    (-> this (.updateDataset request))))

(defn list-tags-for-resource
  "Lists the tags (metadata) which you have assigned to the resource.

  request - `com.amazonaws.services.iotanalytics.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.iotanalytics.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.ListTagsForResourceResult [^AWSIoTAnalyticsClient this ^com.amazonaws.services.iotanalytics.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn list-datastores
  "Retrieves a list of data stores.

  request - `com.amazonaws.services.iotanalytics.model.ListDatastoresRequest`

  returns: Result of the ListDatastores operation returned by the service. - `com.amazonaws.services.iotanalytics.model.ListDatastoresResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.ListDatastoresResult [^AWSIoTAnalyticsClient this ^com.amazonaws.services.iotanalytics.model.ListDatastoresRequest request]
    (-> this (.listDatastores request))))

(defn get-dataset-content
  "Retrieves the contents of a data set as pre-signed URIs.

  request - `com.amazonaws.services.iotanalytics.model.GetDatasetContentRequest`

  returns: Result of the GetDatasetContent operation returned by the service. - `com.amazonaws.services.iotanalytics.model.GetDatasetContentResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.GetDatasetContentResult [^AWSIoTAnalyticsClient this ^com.amazonaws.services.iotanalytics.model.GetDatasetContentRequest request]
    (-> this (.getDatasetContent request))))

(defn update-pipeline
  "Updates the settings of a pipeline. You must specify both a channel and a datastore
   activity and, optionally, as many as 23 additional activities in the pipelineActivities array.

  request - `com.amazonaws.services.iotanalytics.model.UpdatePipelineRequest`

  returns: Result of the UpdatePipeline operation returned by the service. - `com.amazonaws.services.iotanalytics.model.UpdatePipelineResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.UpdatePipelineResult [^AWSIoTAnalyticsClient this ^com.amazonaws.services.iotanalytics.model.UpdatePipelineRequest request]
    (-> this (.updatePipeline request))))

(defn describe-pipeline
  "Retrieves information about a pipeline.

  request - `com.amazonaws.services.iotanalytics.model.DescribePipelineRequest`

  returns: Result of the DescribePipeline operation returned by the service. - `com.amazonaws.services.iotanalytics.model.DescribePipelineResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.DescribePipelineResult [^AWSIoTAnalyticsClient this ^com.amazonaws.services.iotanalytics.model.DescribePipelineRequest request]
    (-> this (.describePipeline request))))

(defn create-datastore
  "Creates a data store, which is a repository for messages.

  request - `com.amazonaws.services.iotanalytics.model.CreateDatastoreRequest`

  returns: Result of the CreateDatastore operation returned by the service. - `com.amazonaws.services.iotanalytics.model.CreateDatastoreResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.CreateDatastoreResult [^AWSIoTAnalyticsClient this ^com.amazonaws.services.iotanalytics.model.CreateDatastoreRequest request]
    (-> this (.createDatastore request))))

(defn create-dataset
  "Creates a data set. A data set stores data retrieved from a data store by applying a \"queryAction\" (a SQL query)
   or a \"containerAction\" (executing a containerized application). This operation creates the skeleton of a data
   set. The data set can be populated manually by calling \"CreateDatasetContent\" or automatically according to a
   \"trigger\" you specify.

  request - `com.amazonaws.services.iotanalytics.model.CreateDatasetRequest`

  returns: Result of the CreateDataset operation returned by the service. - `com.amazonaws.services.iotanalytics.model.CreateDatasetResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.CreateDatasetResult [^AWSIoTAnalyticsClient this ^com.amazonaws.services.iotanalytics.model.CreateDatasetRequest request]
    (-> this (.createDataset request))))

(defn list-channels
  "Retrieves a list of channels.

  request - `com.amazonaws.services.iotanalytics.model.ListChannelsRequest`

  returns: Result of the ListChannels operation returned by the service. - `com.amazonaws.services.iotanalytics.model.ListChannelsResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.ListChannelsResult [^AWSIoTAnalyticsClient this ^com.amazonaws.services.iotanalytics.model.ListChannelsRequest request]
    (-> this (.listChannels request))))

(defn list-pipelines
  "Retrieves a list of pipelines.

  request - `com.amazonaws.services.iotanalytics.model.ListPipelinesRequest`

  returns: Result of the ListPipelines operation returned by the service. - `com.amazonaws.services.iotanalytics.model.ListPipelinesResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.ListPipelinesResult [^AWSIoTAnalyticsClient this ^com.amazonaws.services.iotanalytics.model.ListPipelinesRequest request]
    (-> this (.listPipelines request))))

(defn untag-resource
  "Removes the given tags (metadata) from the resource.

  request - `com.amazonaws.services.iotanalytics.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.iotanalytics.model.UntagResourceResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.UntagResourceResult [^AWSIoTAnalyticsClient this ^com.amazonaws.services.iotanalytics.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn create-dataset-content
  "Creates the content of a data set by applying a \"queryAction\" (a SQL query) or a \"containerAction\" (executing a
   containerized application).

  request - `com.amazonaws.services.iotanalytics.model.CreateDatasetContentRequest`

  returns: Result of the CreateDatasetContent operation returned by the service. - `com.amazonaws.services.iotanalytics.model.CreateDatasetContentResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.CreateDatasetContentResult [^AWSIoTAnalyticsClient this ^com.amazonaws.services.iotanalytics.model.CreateDatasetContentRequest request]
    (-> this (.createDatasetContent request))))

(defn update-channel
  "Updates the settings of a channel.

  request - `com.amazonaws.services.iotanalytics.model.UpdateChannelRequest`

  returns: Result of the UpdateChannel operation returned by the service. - `com.amazonaws.services.iotanalytics.model.UpdateChannelResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.UpdateChannelResult [^AWSIoTAnalyticsClient this ^com.amazonaws.services.iotanalytics.model.UpdateChannelRequest request]
    (-> this (.updateChannel request))))

(defn cancel-pipeline-reprocessing
  "Cancels the reprocessing of data through the pipeline.

  request - `com.amazonaws.services.iotanalytics.model.CancelPipelineReprocessingRequest`

  returns: Result of the CancelPipelineReprocessing operation returned by the service. - `com.amazonaws.services.iotanalytics.model.CancelPipelineReprocessingResult`

  throws: com.amazonaws.services.iotanalytics.model.ResourceNotFoundException - A resource with the specified name could not be found."
  (^com.amazonaws.services.iotanalytics.model.CancelPipelineReprocessingResult [^AWSIoTAnalyticsClient this ^com.amazonaws.services.iotanalytics.model.CancelPipelineReprocessingRequest request]
    (-> this (.cancelPipelineReprocessing request))))

(defn describe-logging-options
  "Retrieves the current settings of the AWS IoT Analytics logging options.

  request - `com.amazonaws.services.iotanalytics.model.DescribeLoggingOptionsRequest`

  returns: Result of the DescribeLoggingOptions operation returned by the service. - `com.amazonaws.services.iotanalytics.model.DescribeLoggingOptionsResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.DescribeLoggingOptionsResult [^AWSIoTAnalyticsClient this ^com.amazonaws.services.iotanalytics.model.DescribeLoggingOptionsRequest request]
    (-> this (.describeLoggingOptions request))))

(defn describe-dataset
  "Retrieves information about a data set.

  request - `com.amazonaws.services.iotanalytics.model.DescribeDatasetRequest`

  returns: Result of the DescribeDataset operation returned by the service. - `com.amazonaws.services.iotanalytics.model.DescribeDatasetResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.DescribeDatasetResult [^AWSIoTAnalyticsClient this ^com.amazonaws.services.iotanalytics.model.DescribeDatasetRequest request]
    (-> this (.describeDataset request))))

(defn delete-dataset-content
  "Deletes the content of the specified data set.

  request - `com.amazonaws.services.iotanalytics.model.DeleteDatasetContentRequest`

  returns: Result of the DeleteDatasetContent operation returned by the service. - `com.amazonaws.services.iotanalytics.model.DeleteDatasetContentResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.DeleteDatasetContentResult [^AWSIoTAnalyticsClient this ^com.amazonaws.services.iotanalytics.model.DeleteDatasetContentRequest request]
    (-> this (.deleteDatasetContent request))))

(defn delete-datastore
  "Deletes the specified data store.

  request - `com.amazonaws.services.iotanalytics.model.DeleteDatastoreRequest`

  returns: Result of the DeleteDatastore operation returned by the service. - `com.amazonaws.services.iotanalytics.model.DeleteDatastoreResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.DeleteDatastoreResult [^AWSIoTAnalyticsClient this ^com.amazonaws.services.iotanalytics.model.DeleteDatastoreRequest request]
    (-> this (.deleteDatastore request))))

(defn list-datasets
  "Retrieves information about data sets.

  request - `com.amazonaws.services.iotanalytics.model.ListDatasetsRequest`

  returns: Result of the ListDatasets operation returned by the service. - `com.amazonaws.services.iotanalytics.model.ListDatasetsResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.ListDatasetsResult [^AWSIoTAnalyticsClient this ^com.amazonaws.services.iotanalytics.model.ListDatasetsRequest request]
    (-> this (.listDatasets request))))

(defn batch-put-message
  "Sends messages to a channel.

  request - `com.amazonaws.services.iotanalytics.model.BatchPutMessageRequest`

  returns: Result of the BatchPutMessage operation returned by the service. - `com.amazonaws.services.iotanalytics.model.BatchPutMessageResult`

  throws: com.amazonaws.services.iotanalytics.model.ResourceNotFoundException - A resource with the specified name could not be found."
  (^com.amazonaws.services.iotanalytics.model.BatchPutMessageResult [^AWSIoTAnalyticsClient this ^com.amazonaws.services.iotanalytics.model.BatchPutMessageRequest request]
    (-> this (.batchPutMessage request))))

(defn create-pipeline
  "Creates a pipeline. A pipeline consumes messages from one or more channels and allows you to process the messages
   before storing them in a data store. You must specify both a channel and a datastore
   activity and, optionally, as many as 23 additional activities in the pipelineActivities array.

  request - `com.amazonaws.services.iotanalytics.model.CreatePipelineRequest`

  returns: Result of the CreatePipeline operation returned by the service. - `com.amazonaws.services.iotanalytics.model.CreatePipelineResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.CreatePipelineResult [^AWSIoTAnalyticsClient this ^com.amazonaws.services.iotanalytics.model.CreatePipelineRequest request]
    (-> this (.createPipeline request))))

(defn create-channel
  "Creates a channel. A channel collects data from an MQTT topic and archives the raw, unprocessed messages before
   publishing the data to a pipeline.

  request - `com.amazonaws.services.iotanalytics.model.CreateChannelRequest`

  returns: Result of the CreateChannel operation returned by the service. - `com.amazonaws.services.iotanalytics.model.CreateChannelResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.CreateChannelResult [^AWSIoTAnalyticsClient this ^com.amazonaws.services.iotanalytics.model.CreateChannelRequest request]
    (-> this (.createChannel request))))

(defn sample-channel-data
  "Retrieves a sample of messages from the specified channel ingested during the specified timeframe. Up to 10
   messages can be retrieved.

  request - `com.amazonaws.services.iotanalytics.model.SampleChannelDataRequest`

  returns: Result of the SampleChannelData operation returned by the service. - `com.amazonaws.services.iotanalytics.model.SampleChannelDataResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.SampleChannelDataResult [^AWSIoTAnalyticsClient this ^com.amazonaws.services.iotanalytics.model.SampleChannelDataRequest request]
    (-> this (.sampleChannelData request))))

(defn list-dataset-contents
  "Lists information about data set contents that have been created.

  request - `com.amazonaws.services.iotanalytics.model.ListDatasetContentsRequest`

  returns: Result of the ListDatasetContents operation returned by the service. - `com.amazonaws.services.iotanalytics.model.ListDatasetContentsResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.ListDatasetContentsResult [^AWSIoTAnalyticsClient this ^com.amazonaws.services.iotanalytics.model.ListDatasetContentsRequest request]
    (-> this (.listDatasetContents request))))

(defn put-logging-options
  "Sets or updates the AWS IoT Analytics logging options.


   Note that if you update the value of any loggingOptions field, it takes up to one minute for the
   change to take effect. Also, if you change the policy attached to the role you specified in the roleArn field
   (for example, to correct an invalid policy) it takes up to 5 minutes for that change to take effect.

  request - `com.amazonaws.services.iotanalytics.model.PutLoggingOptionsRequest`

  returns: Result of the PutLoggingOptions operation returned by the service. - `com.amazonaws.services.iotanalytics.model.PutLoggingOptionsResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.PutLoggingOptionsResult [^AWSIoTAnalyticsClient this ^com.amazonaws.services.iotanalytics.model.PutLoggingOptionsRequest request]
    (-> this (.putLoggingOptions request))))

(defn describe-datastore
  "Retrieves information about a data store.

  request - `com.amazonaws.services.iotanalytics.model.DescribeDatastoreRequest`

  returns: Result of the DescribeDatastore operation returned by the service. - `com.amazonaws.services.iotanalytics.model.DescribeDatastoreResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.DescribeDatastoreResult [^AWSIoTAnalyticsClient this ^com.amazonaws.services.iotanalytics.model.DescribeDatastoreRequest request]
    (-> this (.describeDatastore request))))

(defn update-datastore
  "Updates the settings of a data store.

  request - `com.amazonaws.services.iotanalytics.model.UpdateDatastoreRequest`

  returns: Result of the UpdateDatastore operation returned by the service. - `com.amazonaws.services.iotanalytics.model.UpdateDatastoreResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.UpdateDatastoreResult [^AWSIoTAnalyticsClient this ^com.amazonaws.services.iotanalytics.model.UpdateDatastoreRequest request]
    (-> this (.updateDatastore request))))

(defn delete-pipeline
  "Deletes the specified pipeline.

  request - `com.amazonaws.services.iotanalytics.model.DeletePipelineRequest`

  returns: Result of the DeletePipeline operation returned by the service. - `com.amazonaws.services.iotanalytics.model.DeletePipelineResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.DeletePipelineResult [^AWSIoTAnalyticsClient this ^com.amazonaws.services.iotanalytics.model.DeletePipelineRequest request]
    (-> this (.deletePipeline request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSIoTAnalyticsClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn start-pipeline-reprocessing
  "Starts the reprocessing of raw message data through the pipeline.

  request - `com.amazonaws.services.iotanalytics.model.StartPipelineReprocessingRequest`

  returns: Result of the StartPipelineReprocessing operation returned by the service. - `com.amazonaws.services.iotanalytics.model.StartPipelineReprocessingResult`

  throws: com.amazonaws.services.iotanalytics.model.ResourceNotFoundException - A resource with the specified name could not be found."
  (^com.amazonaws.services.iotanalytics.model.StartPipelineReprocessingResult [^AWSIoTAnalyticsClient this ^com.amazonaws.services.iotanalytics.model.StartPipelineReprocessingRequest request]
    (-> this (.startPipelineReprocessing request))))

(defn delete-dataset
  "Deletes the specified data set.


   You do not have to delete the content of the data set before you perform this operation.

  request - `com.amazonaws.services.iotanalytics.model.DeleteDatasetRequest`

  returns: Result of the DeleteDataset operation returned by the service. - `com.amazonaws.services.iotanalytics.model.DeleteDatasetResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.DeleteDatasetResult [^AWSIoTAnalyticsClient this ^com.amazonaws.services.iotanalytics.model.DeleteDatasetRequest request]
    (-> this (.deleteDataset request))))

(defn tag-resource
  "Adds to or modifies the tags of the given resource. Tags are metadata which can be used to manage a resource.

  request - `com.amazonaws.services.iotanalytics.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.iotanalytics.model.TagResourceResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.TagResourceResult [^AWSIoTAnalyticsClient this ^com.amazonaws.services.iotanalytics.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn delete-channel
  "Deletes the specified channel.

  request - `com.amazonaws.services.iotanalytics.model.DeleteChannelRequest`

  returns: Result of the DeleteChannel operation returned by the service. - `com.amazonaws.services.iotanalytics.model.DeleteChannelResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.DeleteChannelResult [^AWSIoTAnalyticsClient this ^com.amazonaws.services.iotanalytics.model.DeleteChannelRequest request]
    (-> this (.deleteChannel request))))

(defn run-pipeline-activity
  "Simulates the results of running a pipeline activity on a message payload.

  request - `com.amazonaws.services.iotanalytics.model.RunPipelineActivityRequest`

  returns: Result of the RunPipelineActivity operation returned by the service. - `com.amazonaws.services.iotanalytics.model.RunPipelineActivityResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.RunPipelineActivityResult [^AWSIoTAnalyticsClient this ^com.amazonaws.services.iotanalytics.model.RunPipelineActivityRequest request]
    (-> this (.runPipelineActivity request))))

(defn describe-channel
  "Retrieves information about a channel.

  request - `com.amazonaws.services.iotanalytics.model.DescribeChannelRequest`

  returns: Result of the DescribeChannel operation returned by the service. - `com.amazonaws.services.iotanalytics.model.DescribeChannelResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.DescribeChannelResult [^AWSIoTAnalyticsClient this ^com.amazonaws.services.iotanalytics.model.DescribeChannelRequest request]
    (-> this (.describeChannel request))))

