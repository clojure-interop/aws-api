(ns com.amazonaws.services.iotanalytics.AWSIoTAnalytics
  "Interface for accessing AWS IoT Analytics.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSIoTAnalytics instead.



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
  (:import [com.amazonaws.services.iotanalytics AWSIoTAnalytics]))

(defn update-dataset
  "Updates the settings of a data set.

  update-dataset-request - `com.amazonaws.services.iotanalytics.model.UpdateDatasetRequest`

  returns: Result of the UpdateDataset operation returned by the service. - `com.amazonaws.services.iotanalytics.model.UpdateDatasetResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.UpdateDatasetResult [^AWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.UpdateDatasetRequest update-dataset-request]
    (-> this (.updateDataset update-dataset-request))))

(defn list-tags-for-resource
  "Lists the tags (metadata) which you have assigned to the resource.

  list-tags-for-resource-request - `com.amazonaws.services.iotanalytics.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.iotanalytics.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.ListTagsForResourceResult [^AWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn list-datastores
  "Retrieves a list of data stores.

  list-datastores-request - `com.amazonaws.services.iotanalytics.model.ListDatastoresRequest`

  returns: Result of the ListDatastores operation returned by the service. - `com.amazonaws.services.iotanalytics.model.ListDatastoresResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.ListDatastoresResult [^AWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.ListDatastoresRequest list-datastores-request]
    (-> this (.listDatastores list-datastores-request))))

(defn get-dataset-content
  "Retrieves the contents of a data set as pre-signed URIs.

  get-dataset-content-request - `com.amazonaws.services.iotanalytics.model.GetDatasetContentRequest`

  returns: Result of the GetDatasetContent operation returned by the service. - `com.amazonaws.services.iotanalytics.model.GetDatasetContentResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.GetDatasetContentResult [^AWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.GetDatasetContentRequest get-dataset-content-request]
    (-> this (.getDatasetContent get-dataset-content-request))))

(defn update-pipeline
  "Updates the settings of a pipeline. You must specify both a channel and a datastore
   activity and, optionally, as many as 23 additional activities in the pipelineActivities array.

  update-pipeline-request - `com.amazonaws.services.iotanalytics.model.UpdatePipelineRequest`

  returns: Result of the UpdatePipeline operation returned by the service. - `com.amazonaws.services.iotanalytics.model.UpdatePipelineResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.UpdatePipelineResult [^AWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.UpdatePipelineRequest update-pipeline-request]
    (-> this (.updatePipeline update-pipeline-request))))

(defn describe-pipeline
  "Retrieves information about a pipeline.

  describe-pipeline-request - `com.amazonaws.services.iotanalytics.model.DescribePipelineRequest`

  returns: Result of the DescribePipeline operation returned by the service. - `com.amazonaws.services.iotanalytics.model.DescribePipelineResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.DescribePipelineResult [^AWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.DescribePipelineRequest describe-pipeline-request]
    (-> this (.describePipeline describe-pipeline-request))))

(defn create-datastore
  "Creates a data store, which is a repository for messages.

  create-datastore-request - `com.amazonaws.services.iotanalytics.model.CreateDatastoreRequest`

  returns: Result of the CreateDatastore operation returned by the service. - `com.amazonaws.services.iotanalytics.model.CreateDatastoreResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.CreateDatastoreResult [^AWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.CreateDatastoreRequest create-datastore-request]
    (-> this (.createDatastore create-datastore-request))))

(defn create-dataset
  "Creates a data set. A data set stores data retrieved from a data store by applying a \"queryAction\" (a SQL query)
   or a \"containerAction\" (executing a containerized application). This operation creates the skeleton of a data
   set. The data set can be populated manually by calling \"CreateDatasetContent\" or automatically according to a
   \"trigger\" you specify.

  create-dataset-request - `com.amazonaws.services.iotanalytics.model.CreateDatasetRequest`

  returns: Result of the CreateDataset operation returned by the service. - `com.amazonaws.services.iotanalytics.model.CreateDatasetResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.CreateDatasetResult [^AWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.CreateDatasetRequest create-dataset-request]
    (-> this (.createDataset create-dataset-request))))

(defn list-channels
  "Retrieves a list of channels.

  list-channels-request - `com.amazonaws.services.iotanalytics.model.ListChannelsRequest`

  returns: Result of the ListChannels operation returned by the service. - `com.amazonaws.services.iotanalytics.model.ListChannelsResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.ListChannelsResult [^AWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.ListChannelsRequest list-channels-request]
    (-> this (.listChannels list-channels-request))))

(defn list-pipelines
  "Retrieves a list of pipelines.

  list-pipelines-request - `com.amazonaws.services.iotanalytics.model.ListPipelinesRequest`

  returns: Result of the ListPipelines operation returned by the service. - `com.amazonaws.services.iotanalytics.model.ListPipelinesResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.ListPipelinesResult [^AWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.ListPipelinesRequest list-pipelines-request]
    (-> this (.listPipelines list-pipelines-request))))

(defn untag-resource
  "Removes the given tags (metadata) from the resource.

  untag-resource-request - `com.amazonaws.services.iotanalytics.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.iotanalytics.model.UntagResourceResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.UntagResourceResult [^AWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn create-dataset-content
  "Creates the content of a data set by applying a \"queryAction\" (a SQL query) or a \"containerAction\" (executing a
   containerized application).

  create-dataset-content-request - `com.amazonaws.services.iotanalytics.model.CreateDatasetContentRequest`

  returns: Result of the CreateDatasetContent operation returned by the service. - `com.amazonaws.services.iotanalytics.model.CreateDatasetContentResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.CreateDatasetContentResult [^AWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.CreateDatasetContentRequest create-dataset-content-request]
    (-> this (.createDatasetContent create-dataset-content-request))))

(defn update-channel
  "Updates the settings of a channel.

  update-channel-request - `com.amazonaws.services.iotanalytics.model.UpdateChannelRequest`

  returns: Result of the UpdateChannel operation returned by the service. - `com.amazonaws.services.iotanalytics.model.UpdateChannelResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.UpdateChannelResult [^AWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.UpdateChannelRequest update-channel-request]
    (-> this (.updateChannel update-channel-request))))

(defn cancel-pipeline-reprocessing
  "Cancels the reprocessing of data through the pipeline.

  cancel-pipeline-reprocessing-request - `com.amazonaws.services.iotanalytics.model.CancelPipelineReprocessingRequest`

  returns: Result of the CancelPipelineReprocessing operation returned by the service. - `com.amazonaws.services.iotanalytics.model.CancelPipelineReprocessingResult`

  throws: com.amazonaws.services.iotanalytics.model.ResourceNotFoundException - A resource with the specified name could not be found."
  (^com.amazonaws.services.iotanalytics.model.CancelPipelineReprocessingResult [^AWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.CancelPipelineReprocessingRequest cancel-pipeline-reprocessing-request]
    (-> this (.cancelPipelineReprocessing cancel-pipeline-reprocessing-request))))

(defn describe-logging-options
  "Retrieves the current settings of the AWS IoT Analytics logging options.

  describe-logging-options-request - `com.amazonaws.services.iotanalytics.model.DescribeLoggingOptionsRequest`

  returns: Result of the DescribeLoggingOptions operation returned by the service. - `com.amazonaws.services.iotanalytics.model.DescribeLoggingOptionsResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.DescribeLoggingOptionsResult [^AWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.DescribeLoggingOptionsRequest describe-logging-options-request]
    (-> this (.describeLoggingOptions describe-logging-options-request))))

(defn describe-dataset
  "Retrieves information about a data set.

  describe-dataset-request - `com.amazonaws.services.iotanalytics.model.DescribeDatasetRequest`

  returns: Result of the DescribeDataset operation returned by the service. - `com.amazonaws.services.iotanalytics.model.DescribeDatasetResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.DescribeDatasetResult [^AWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.DescribeDatasetRequest describe-dataset-request]
    (-> this (.describeDataset describe-dataset-request))))

(defn delete-dataset-content
  "Deletes the content of the specified data set.

  delete-dataset-content-request - `com.amazonaws.services.iotanalytics.model.DeleteDatasetContentRequest`

  returns: Result of the DeleteDatasetContent operation returned by the service. - `com.amazonaws.services.iotanalytics.model.DeleteDatasetContentResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.DeleteDatasetContentResult [^AWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.DeleteDatasetContentRequest delete-dataset-content-request]
    (-> this (.deleteDatasetContent delete-dataset-content-request))))

(defn delete-datastore
  "Deletes the specified data store.

  delete-datastore-request - `com.amazonaws.services.iotanalytics.model.DeleteDatastoreRequest`

  returns: Result of the DeleteDatastore operation returned by the service. - `com.amazonaws.services.iotanalytics.model.DeleteDatastoreResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.DeleteDatastoreResult [^AWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.DeleteDatastoreRequest delete-datastore-request]
    (-> this (.deleteDatastore delete-datastore-request))))

(defn list-datasets
  "Retrieves information about data sets.

  list-datasets-request - `com.amazonaws.services.iotanalytics.model.ListDatasetsRequest`

  returns: Result of the ListDatasets operation returned by the service. - `com.amazonaws.services.iotanalytics.model.ListDatasetsResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.ListDatasetsResult [^AWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.ListDatasetsRequest list-datasets-request]
    (-> this (.listDatasets list-datasets-request))))

(defn batch-put-message
  "Sends messages to a channel.

  batch-put-message-request - `com.amazonaws.services.iotanalytics.model.BatchPutMessageRequest`

  returns: Result of the BatchPutMessage operation returned by the service. - `com.amazonaws.services.iotanalytics.model.BatchPutMessageResult`

  throws: com.amazonaws.services.iotanalytics.model.ResourceNotFoundException - A resource with the specified name could not be found."
  (^com.amazonaws.services.iotanalytics.model.BatchPutMessageResult [^AWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.BatchPutMessageRequest batch-put-message-request]
    (-> this (.batchPutMessage batch-put-message-request))))

(defn create-pipeline
  "Creates a pipeline. A pipeline consumes messages from one or more channels and allows you to process the messages
   before storing them in a data store. You must specify both a channel and a datastore
   activity and, optionally, as many as 23 additional activities in the pipelineActivities array.

  create-pipeline-request - `com.amazonaws.services.iotanalytics.model.CreatePipelineRequest`

  returns: Result of the CreatePipeline operation returned by the service. - `com.amazonaws.services.iotanalytics.model.CreatePipelineResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.CreatePipelineResult [^AWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.CreatePipelineRequest create-pipeline-request]
    (-> this (.createPipeline create-pipeline-request))))

(defn create-channel
  "Creates a channel. A channel collects data from an MQTT topic and archives the raw, unprocessed messages before
   publishing the data to a pipeline.

  create-channel-request - `com.amazonaws.services.iotanalytics.model.CreateChannelRequest`

  returns: Result of the CreateChannel operation returned by the service. - `com.amazonaws.services.iotanalytics.model.CreateChannelResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.CreateChannelResult [^AWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.CreateChannelRequest create-channel-request]
    (-> this (.createChannel create-channel-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSIoTAnalytics this]
    (-> this (.shutdown))))

(defn sample-channel-data
  "Retrieves a sample of messages from the specified channel ingested during the specified timeframe. Up to 10
   messages can be retrieved.

  sample-channel-data-request - `com.amazonaws.services.iotanalytics.model.SampleChannelDataRequest`

  returns: Result of the SampleChannelData operation returned by the service. - `com.amazonaws.services.iotanalytics.model.SampleChannelDataResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.SampleChannelDataResult [^AWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.SampleChannelDataRequest sample-channel-data-request]
    (-> this (.sampleChannelData sample-channel-data-request))))

(defn list-dataset-contents
  "Lists information about data set contents that have been created.

  list-dataset-contents-request - `com.amazonaws.services.iotanalytics.model.ListDatasetContentsRequest`

  returns: Result of the ListDatasetContents operation returned by the service. - `com.amazonaws.services.iotanalytics.model.ListDatasetContentsResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.ListDatasetContentsResult [^AWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.ListDatasetContentsRequest list-dataset-contents-request]
    (-> this (.listDatasetContents list-dataset-contents-request))))

(defn put-logging-options
  "Sets or updates the AWS IoT Analytics logging options.


   Note that if you update the value of any loggingOptions field, it takes up to one minute for the
   change to take effect. Also, if you change the policy attached to the role you specified in the roleArn field
   (for example, to correct an invalid policy) it takes up to 5 minutes for that change to take effect.

  put-logging-options-request - `com.amazonaws.services.iotanalytics.model.PutLoggingOptionsRequest`

  returns: Result of the PutLoggingOptions operation returned by the service. - `com.amazonaws.services.iotanalytics.model.PutLoggingOptionsResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.PutLoggingOptionsResult [^AWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.PutLoggingOptionsRequest put-logging-options-request]
    (-> this (.putLoggingOptions put-logging-options-request))))

(defn describe-datastore
  "Retrieves information about a data store.

  describe-datastore-request - `com.amazonaws.services.iotanalytics.model.DescribeDatastoreRequest`

  returns: Result of the DescribeDatastore operation returned by the service. - `com.amazonaws.services.iotanalytics.model.DescribeDatastoreResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.DescribeDatastoreResult [^AWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.DescribeDatastoreRequest describe-datastore-request]
    (-> this (.describeDatastore describe-datastore-request))))

(defn update-datastore
  "Updates the settings of a data store.

  update-datastore-request - `com.amazonaws.services.iotanalytics.model.UpdateDatastoreRequest`

  returns: Result of the UpdateDatastore operation returned by the service. - `com.amazonaws.services.iotanalytics.model.UpdateDatastoreResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.UpdateDatastoreResult [^AWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.UpdateDatastoreRequest update-datastore-request]
    (-> this (.updateDatastore update-datastore-request))))

(defn delete-pipeline
  "Deletes the specified pipeline.

  delete-pipeline-request - `com.amazonaws.services.iotanalytics.model.DeletePipelineRequest`

  returns: Result of the DeletePipeline operation returned by the service. - `com.amazonaws.services.iotanalytics.model.DeletePipelineResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.DeletePipelineResult [^AWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.DeletePipelineRequest delete-pipeline-request]
    (-> this (.deletePipeline delete-pipeline-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSIoTAnalytics this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn start-pipeline-reprocessing
  "Starts the reprocessing of raw message data through the pipeline.

  start-pipeline-reprocessing-request - `com.amazonaws.services.iotanalytics.model.StartPipelineReprocessingRequest`

  returns: Result of the StartPipelineReprocessing operation returned by the service. - `com.amazonaws.services.iotanalytics.model.StartPipelineReprocessingResult`

  throws: com.amazonaws.services.iotanalytics.model.ResourceNotFoundException - A resource with the specified name could not be found."
  (^com.amazonaws.services.iotanalytics.model.StartPipelineReprocessingResult [^AWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.StartPipelineReprocessingRequest start-pipeline-reprocessing-request]
    (-> this (.startPipelineReprocessing start-pipeline-reprocessing-request))))

(defn delete-dataset
  "Deletes the specified data set.


   You do not have to delete the content of the data set before you perform this operation.

  delete-dataset-request - `com.amazonaws.services.iotanalytics.model.DeleteDatasetRequest`

  returns: Result of the DeleteDataset operation returned by the service. - `com.amazonaws.services.iotanalytics.model.DeleteDatasetResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.DeleteDatasetResult [^AWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.DeleteDatasetRequest delete-dataset-request]
    (-> this (.deleteDataset delete-dataset-request))))

(defn tag-resource
  "Adds to or modifies the tags of the given resource. Tags are metadata which can be used to manage a resource.

  tag-resource-request - `com.amazonaws.services.iotanalytics.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.iotanalytics.model.TagResourceResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.TagResourceResult [^AWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

(defn delete-channel
  "Deletes the specified channel.

  delete-channel-request - `com.amazonaws.services.iotanalytics.model.DeleteChannelRequest`

  returns: Result of the DeleteChannel operation returned by the service. - `com.amazonaws.services.iotanalytics.model.DeleteChannelResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.DeleteChannelResult [^AWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.DeleteChannelRequest delete-channel-request]
    (-> this (.deleteChannel delete-channel-request))))

(defn run-pipeline-activity
  "Simulates the results of running a pipeline activity on a message payload.

  run-pipeline-activity-request - `com.amazonaws.services.iotanalytics.model.RunPipelineActivityRequest`

  returns: Result of the RunPipelineActivity operation returned by the service. - `com.amazonaws.services.iotanalytics.model.RunPipelineActivityResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.RunPipelineActivityResult [^AWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.RunPipelineActivityRequest run-pipeline-activity-request]
    (-> this (.runPipelineActivity run-pipeline-activity-request))))

(defn describe-channel
  "Retrieves information about a channel.

  describe-channel-request - `com.amazonaws.services.iotanalytics.model.DescribeChannelRequest`

  returns: Result of the DescribeChannel operation returned by the service. - `com.amazonaws.services.iotanalytics.model.DescribeChannelResult`

  throws: com.amazonaws.services.iotanalytics.model.InvalidRequestException - The request was not valid."
  (^com.amazonaws.services.iotanalytics.model.DescribeChannelResult [^AWSIoTAnalytics this ^com.amazonaws.services.iotanalytics.model.DescribeChannelRequest describe-channel-request]
    (-> this (.describeChannel describe-channel-request))))

