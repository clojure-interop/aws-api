(ns com.amazonaws.services.iotanalytics.AWSIoTAnalyticsAsyncClient
  "Client for accessing AWS IoT Analytics asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.


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
  (:import [com.amazonaws.services.iotanalytics AWSIoTAnalyticsAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.iotanalytics.AWSIoTAnalyticsAsyncClientBuilder`"
  (^com.amazonaws.services.iotanalytics.AWSIoTAnalyticsAsyncClientBuilder []
    (AWSIoTAnalyticsAsyncClient/asyncBuilder )))

(defn untag-resource-async
  "Description copied from interface: AWSIoTAnalyticsAsync

  request - `com.amazonaws.services.iotanalytics.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn delete-dataset-async
  "Description copied from interface: AWSIoTAnalyticsAsync

  request - `com.amazonaws.services.iotanalytics.model.DeleteDatasetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDataset operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.DeleteDatasetResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.DeleteDatasetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDatasetAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.DeleteDatasetRequest request]
    (-> this (.deleteDatasetAsync request))))

(defn sample-channel-data-async
  "Description copied from interface: AWSIoTAnalyticsAsync

  request - `com.amazonaws.services.iotanalytics.model.SampleChannelDataRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SampleChannelData operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.SampleChannelDataResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.SampleChannelDataRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sampleChannelDataAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.SampleChannelDataRequest request]
    (-> this (.sampleChannelDataAsync request))))

(defn list-dataset-contents-async
  "Description copied from interface: AWSIoTAnalyticsAsync

  request - `com.amazonaws.services.iotanalytics.model.ListDatasetContentsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDatasetContents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.ListDatasetContentsResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.ListDatasetContentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDatasetContentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.ListDatasetContentsRequest request]
    (-> this (.listDatasetContentsAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSIoTAnalyticsAsyncClient this]
    (-> this (.getExecutorService))))

(defn delete-datastore-async
  "Description copied from interface: AWSIoTAnalyticsAsync

  request - `com.amazonaws.services.iotanalytics.model.DeleteDatastoreRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDatastore operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.DeleteDatastoreResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.DeleteDatastoreRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDatastoreAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.DeleteDatastoreRequest request]
    (-> this (.deleteDatastoreAsync request))))

(defn update-pipeline-async
  "Description copied from interface: AWSIoTAnalyticsAsync

  request - `com.amazonaws.services.iotanalytics.model.UpdatePipelineRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdatePipeline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.UpdatePipelineResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.UpdatePipelineRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updatePipelineAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.UpdatePipelineRequest request]
    (-> this (.updatePipelineAsync request))))

(defn update-dataset-async
  "Description copied from interface: AWSIoTAnalyticsAsync

  request - `com.amazonaws.services.iotanalytics.model.UpdateDatasetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDataset operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.UpdateDatasetResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.UpdateDatasetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDatasetAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.UpdateDatasetRequest request]
    (-> this (.updateDatasetAsync request))))

(defn list-datasets-async
  "Description copied from interface: AWSIoTAnalyticsAsync

  request - `com.amazonaws.services.iotanalytics.model.ListDatasetsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDatasets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.ListDatasetsResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.ListDatasetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDatasetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.ListDatasetsRequest request]
    (-> this (.listDatasetsAsync request))))

(defn list-datastores-async
  "Description copied from interface: AWSIoTAnalyticsAsync

  request - `com.amazonaws.services.iotanalytics.model.ListDatastoresRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDatastores operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.ListDatastoresResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.ListDatastoresRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDatastoresAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.ListDatastoresRequest request]
    (-> this (.listDatastoresAsync request))))

(defn update-datastore-async
  "Description copied from interface: AWSIoTAnalyticsAsync

  request - `com.amazonaws.services.iotanalytics.model.UpdateDatastoreRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDatastore operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.UpdateDatastoreResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.UpdateDatastoreRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDatastoreAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.UpdateDatastoreRequest request]
    (-> this (.updateDatastoreAsync request))))

(defn get-dataset-content-async
  "Description copied from interface: AWSIoTAnalyticsAsync

  request - `com.amazonaws.services.iotanalytics.model.GetDatasetContentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDatasetContent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.GetDatasetContentResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.GetDatasetContentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDatasetContentAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.GetDatasetContentRequest request]
    (-> this (.getDatasetContentAsync request))))

(defn list-pipelines-async
  "Description copied from interface: AWSIoTAnalyticsAsync

  request - `com.amazonaws.services.iotanalytics.model.ListPipelinesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPipelines operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.ListPipelinesResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.ListPipelinesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPipelinesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.ListPipelinesRequest request]
    (-> this (.listPipelinesAsync request))))

(defn delete-pipeline-async
  "Description copied from interface: AWSIoTAnalyticsAsync

  request - `com.amazonaws.services.iotanalytics.model.DeletePipelineRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePipeline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.DeletePipelineResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.DeletePipelineRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePipelineAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.DeletePipelineRequest request]
    (-> this (.deletePipelineAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSIoTAnalyticsAsyncClient this]
    (-> this (.shutdown))))

(defn describe-channel-async
  "Description copied from interface: AWSIoTAnalyticsAsync

  request - `com.amazonaws.services.iotanalytics.model.DescribeChannelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.DescribeChannelResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.DescribeChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.DescribeChannelRequest request]
    (-> this (.describeChannelAsync request))))

(defn describe-dataset-async
  "Description copied from interface: AWSIoTAnalyticsAsync

  request - `com.amazonaws.services.iotanalytics.model.DescribeDatasetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDataset operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.DescribeDatasetResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.DescribeDatasetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDatasetAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.DescribeDatasetRequest request]
    (-> this (.describeDatasetAsync request))))

(defn delete-dataset-content-async
  "Description copied from interface: AWSIoTAnalyticsAsync

  request - `com.amazonaws.services.iotanalytics.model.DeleteDatasetContentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDatasetContent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.DeleteDatasetContentResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.DeleteDatasetContentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDatasetContentAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.DeleteDatasetContentRequest request]
    (-> this (.deleteDatasetContentAsync request))))

(defn start-pipeline-reprocessing-async
  "Description copied from interface: AWSIoTAnalyticsAsync

  request - `com.amazonaws.services.iotanalytics.model.StartPipelineReprocessingRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartPipelineReprocessing operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.StartPipelineReprocessingResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.StartPipelineReprocessingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startPipelineReprocessingAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.StartPipelineReprocessingRequest request]
    (-> this (.startPipelineReprocessingAsync request))))

(defn describe-logging-options-async
  "Description copied from interface: AWSIoTAnalyticsAsync

  request - `com.amazonaws.services.iotanalytics.model.DescribeLoggingOptionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLoggingOptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.DescribeLoggingOptionsResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.DescribeLoggingOptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLoggingOptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.DescribeLoggingOptionsRequest request]
    (-> this (.describeLoggingOptionsAsync request))))

(defn create-datastore-async
  "Description copied from interface: AWSIoTAnalyticsAsync

  request - `com.amazonaws.services.iotanalytics.model.CreateDatastoreRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDatastore operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.CreateDatastoreResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.CreateDatastoreRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDatastoreAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.CreateDatastoreRequest request]
    (-> this (.createDatastoreAsync request))))

(defn create-dataset-async
  "Description copied from interface: AWSIoTAnalyticsAsync

  request - `com.amazonaws.services.iotanalytics.model.CreateDatasetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDataset operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.CreateDatasetResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.CreateDatasetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDatasetAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.CreateDatasetRequest request]
    (-> this (.createDatasetAsync request))))

(defn update-channel-async
  "Description copied from interface: AWSIoTAnalyticsAsync

  request - `com.amazonaws.services.iotanalytics.model.UpdateChannelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.UpdateChannelResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.UpdateChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.UpdateChannelRequest request]
    (-> this (.updateChannelAsync request))))

(defn describe-datastore-async
  "Description copied from interface: AWSIoTAnalyticsAsync

  request - `com.amazonaws.services.iotanalytics.model.DescribeDatastoreRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDatastore operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.DescribeDatastoreResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.DescribeDatastoreRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDatastoreAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.DescribeDatastoreRequest request]
    (-> this (.describeDatastoreAsync request))))

(defn describe-pipeline-async
  "Description copied from interface: AWSIoTAnalyticsAsync

  request - `com.amazonaws.services.iotanalytics.model.DescribePipelineRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePipeline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.DescribePipelineResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.DescribePipelineRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePipelineAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.DescribePipelineRequest request]
    (-> this (.describePipelineAsync request))))

(defn create-pipeline-async
  "Description copied from interface: AWSIoTAnalyticsAsync

  request - `com.amazonaws.services.iotanalytics.model.CreatePipelineRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePipeline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.CreatePipelineResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.CreatePipelineRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPipelineAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.CreatePipelineRequest request]
    (-> this (.createPipelineAsync request))))

(defn batch-put-message-async
  "Description copied from interface: AWSIoTAnalyticsAsync

  request - `com.amazonaws.services.iotanalytics.model.BatchPutMessageRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchPutMessage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.BatchPutMessageResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.BatchPutMessageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchPutMessageAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.BatchPutMessageRequest request]
    (-> this (.batchPutMessageAsync request))))

(defn list-channels-async
  "Description copied from interface: AWSIoTAnalyticsAsync

  request - `com.amazonaws.services.iotanalytics.model.ListChannelsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListChannels operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.ListChannelsResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.ListChannelsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listChannelsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.ListChannelsRequest request]
    (-> this (.listChannelsAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AWSIoTAnalyticsAsync

  request - `com.amazonaws.services.iotanalytics.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn delete-channel-async
  "Description copied from interface: AWSIoTAnalyticsAsync

  request - `com.amazonaws.services.iotanalytics.model.DeleteChannelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.DeleteChannelResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.DeleteChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.DeleteChannelRequest request]
    (-> this (.deleteChannelAsync request))))

(defn create-channel-async
  "Description copied from interface: AWSIoTAnalyticsAsync

  request - `com.amazonaws.services.iotanalytics.model.CreateChannelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.CreateChannelResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.CreateChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.CreateChannelRequest request]
    (-> this (.createChannelAsync request))))

(defn cancel-pipeline-reprocessing-async
  "Description copied from interface: AWSIoTAnalyticsAsync

  request - `com.amazonaws.services.iotanalytics.model.CancelPipelineReprocessingRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelPipelineReprocessing operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.CancelPipelineReprocessingResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.CancelPipelineReprocessingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelPipelineReprocessingAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.CancelPipelineReprocessingRequest request]
    (-> this (.cancelPipelineReprocessingAsync request))))

(defn put-logging-options-async
  "Description copied from interface: AWSIoTAnalyticsAsync

  request - `com.amazonaws.services.iotanalytics.model.PutLoggingOptionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutLoggingOptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.PutLoggingOptionsResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.PutLoggingOptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putLoggingOptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.PutLoggingOptionsRequest request]
    (-> this (.putLoggingOptionsAsync request))))

(defn tag-resource-async
  "Description copied from interface: AWSIoTAnalyticsAsync

  request - `com.amazonaws.services.iotanalytics.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn run-pipeline-activity-async
  "Description copied from interface: AWSIoTAnalyticsAsync

  request - `com.amazonaws.services.iotanalytics.model.RunPipelineActivityRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RunPipelineActivity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.RunPipelineActivityResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.RunPipelineActivityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.runPipelineActivityAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.RunPipelineActivityRequest request]
    (-> this (.runPipelineActivityAsync request))))

(defn create-dataset-content-async
  "Description copied from interface: AWSIoTAnalyticsAsync

  request - `com.amazonaws.services.iotanalytics.model.CreateDatasetContentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDatasetContent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.CreateDatasetContentResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.CreateDatasetContentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDatasetContentAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsyncClient this ^com.amazonaws.services.iotanalytics.model.CreateDatasetContentRequest request]
    (-> this (.createDatasetContentAsync request))))

