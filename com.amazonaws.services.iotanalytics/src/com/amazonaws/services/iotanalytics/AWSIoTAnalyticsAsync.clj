(ns com.amazonaws.services.iotanalytics.AWSIoTAnalyticsAsync
  "Interface for accessing AWS IoT Analytics asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSIoTAnalyticsAsync instead.



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
  (:import [com.amazonaws.services.iotanalytics AWSIoTAnalyticsAsync]))

(defn untag-resource-async
  "Removes the given tags (metadata) from the resource.

  untag-resource-request - `com.amazonaws.services.iotanalytics.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn delete-dataset-async
  "Deletes the specified data set.


   You do not have to delete the content of the data set before you perform this operation.

  delete-dataset-request - `com.amazonaws.services.iotanalytics.model.DeleteDatasetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDataset operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.DeleteDatasetResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.DeleteDatasetRequest delete-dataset-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDatasetAsync delete-dataset-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.DeleteDatasetRequest delete-dataset-request]
    (-> this (.deleteDatasetAsync delete-dataset-request))))

(defn sample-channel-data-async
  "Retrieves a sample of messages from the specified channel ingested during the specified timeframe. Up to 10
   messages can be retrieved.

  sample-channel-data-request - `com.amazonaws.services.iotanalytics.model.SampleChannelDataRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SampleChannelData operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.SampleChannelDataResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.SampleChannelDataRequest sample-channel-data-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sampleChannelDataAsync sample-channel-data-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.SampleChannelDataRequest sample-channel-data-request]
    (-> this (.sampleChannelDataAsync sample-channel-data-request))))

(defn list-dataset-contents-async
  "Lists information about data set contents that have been created.

  list-dataset-contents-request - `com.amazonaws.services.iotanalytics.model.ListDatasetContentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDatasetContents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.ListDatasetContentsResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.ListDatasetContentsRequest list-dataset-contents-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDatasetContentsAsync list-dataset-contents-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.ListDatasetContentsRequest list-dataset-contents-request]
    (-> this (.listDatasetContentsAsync list-dataset-contents-request))))

(defn delete-datastore-async
  "Deletes the specified data store.

  delete-datastore-request - `com.amazonaws.services.iotanalytics.model.DeleteDatastoreRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDatastore operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.DeleteDatastoreResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.DeleteDatastoreRequest delete-datastore-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDatastoreAsync delete-datastore-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.DeleteDatastoreRequest delete-datastore-request]
    (-> this (.deleteDatastoreAsync delete-datastore-request))))

(defn update-pipeline-async
  "Updates the settings of a pipeline. You must specify both a channel and a datastore
   activity and, optionally, as many as 23 additional activities in the pipelineActivities array.

  update-pipeline-request - `com.amazonaws.services.iotanalytics.model.UpdatePipelineRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdatePipeline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.UpdatePipelineResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.UpdatePipelineRequest update-pipeline-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updatePipelineAsync update-pipeline-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.UpdatePipelineRequest update-pipeline-request]
    (-> this (.updatePipelineAsync update-pipeline-request))))

(defn update-dataset-async
  "Updates the settings of a data set.

  update-dataset-request - `com.amazonaws.services.iotanalytics.model.UpdateDatasetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDataset operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.UpdateDatasetResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.UpdateDatasetRequest update-dataset-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDatasetAsync update-dataset-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.UpdateDatasetRequest update-dataset-request]
    (-> this (.updateDatasetAsync update-dataset-request))))

(defn list-datasets-async
  "Retrieves information about data sets.

  list-datasets-request - `com.amazonaws.services.iotanalytics.model.ListDatasetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDatasets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.ListDatasetsResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.ListDatasetsRequest list-datasets-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDatasetsAsync list-datasets-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.ListDatasetsRequest list-datasets-request]
    (-> this (.listDatasetsAsync list-datasets-request))))

(defn list-datastores-async
  "Retrieves a list of data stores.

  list-datastores-request - `com.amazonaws.services.iotanalytics.model.ListDatastoresRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDatastores operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.ListDatastoresResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.ListDatastoresRequest list-datastores-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDatastoresAsync list-datastores-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.ListDatastoresRequest list-datastores-request]
    (-> this (.listDatastoresAsync list-datastores-request))))

(defn update-datastore-async
  "Updates the settings of a data store.

  update-datastore-request - `com.amazonaws.services.iotanalytics.model.UpdateDatastoreRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDatastore operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.UpdateDatastoreResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.UpdateDatastoreRequest update-datastore-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDatastoreAsync update-datastore-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.UpdateDatastoreRequest update-datastore-request]
    (-> this (.updateDatastoreAsync update-datastore-request))))

(defn get-dataset-content-async
  "Retrieves the contents of a data set as pre-signed URIs.

  get-dataset-content-request - `com.amazonaws.services.iotanalytics.model.GetDatasetContentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDatasetContent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.GetDatasetContentResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.GetDatasetContentRequest get-dataset-content-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDatasetContentAsync get-dataset-content-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.GetDatasetContentRequest get-dataset-content-request]
    (-> this (.getDatasetContentAsync get-dataset-content-request))))

(defn list-pipelines-async
  "Retrieves a list of pipelines.

  list-pipelines-request - `com.amazonaws.services.iotanalytics.model.ListPipelinesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPipelines operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.ListPipelinesResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.ListPipelinesRequest list-pipelines-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPipelinesAsync list-pipelines-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.ListPipelinesRequest list-pipelines-request]
    (-> this (.listPipelinesAsync list-pipelines-request))))

(defn delete-pipeline-async
  "Deletes the specified pipeline.

  delete-pipeline-request - `com.amazonaws.services.iotanalytics.model.DeletePipelineRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePipeline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.DeletePipelineResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.DeletePipelineRequest delete-pipeline-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePipelineAsync delete-pipeline-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.DeletePipelineRequest delete-pipeline-request]
    (-> this (.deletePipelineAsync delete-pipeline-request))))

(defn describe-channel-async
  "Retrieves information about a channel.

  describe-channel-request - `com.amazonaws.services.iotanalytics.model.DescribeChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.DescribeChannelResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.DescribeChannelRequest describe-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeChannelAsync describe-channel-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.DescribeChannelRequest describe-channel-request]
    (-> this (.describeChannelAsync describe-channel-request))))

(defn describe-dataset-async
  "Retrieves information about a data set.

  describe-dataset-request - `com.amazonaws.services.iotanalytics.model.DescribeDatasetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDataset operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.DescribeDatasetResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.DescribeDatasetRequest describe-dataset-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDatasetAsync describe-dataset-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.DescribeDatasetRequest describe-dataset-request]
    (-> this (.describeDatasetAsync describe-dataset-request))))

(defn delete-dataset-content-async
  "Deletes the content of the specified data set.

  delete-dataset-content-request - `com.amazonaws.services.iotanalytics.model.DeleteDatasetContentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDatasetContent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.DeleteDatasetContentResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.DeleteDatasetContentRequest delete-dataset-content-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDatasetContentAsync delete-dataset-content-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.DeleteDatasetContentRequest delete-dataset-content-request]
    (-> this (.deleteDatasetContentAsync delete-dataset-content-request))))

(defn start-pipeline-reprocessing-async
  "Starts the reprocessing of raw message data through the pipeline.

  start-pipeline-reprocessing-request - `com.amazonaws.services.iotanalytics.model.StartPipelineReprocessingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartPipelineReprocessing operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.StartPipelineReprocessingResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.StartPipelineReprocessingRequest start-pipeline-reprocessing-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startPipelineReprocessingAsync start-pipeline-reprocessing-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.StartPipelineReprocessingRequest start-pipeline-reprocessing-request]
    (-> this (.startPipelineReprocessingAsync start-pipeline-reprocessing-request))))

(defn describe-logging-options-async
  "Retrieves the current settings of the AWS IoT Analytics logging options.

  describe-logging-options-request - `com.amazonaws.services.iotanalytics.model.DescribeLoggingOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLoggingOptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.DescribeLoggingOptionsResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.DescribeLoggingOptionsRequest describe-logging-options-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLoggingOptionsAsync describe-logging-options-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.DescribeLoggingOptionsRequest describe-logging-options-request]
    (-> this (.describeLoggingOptionsAsync describe-logging-options-request))))

(defn create-datastore-async
  "Creates a data store, which is a repository for messages.

  create-datastore-request - `com.amazonaws.services.iotanalytics.model.CreateDatastoreRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDatastore operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.CreateDatastoreResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.CreateDatastoreRequest create-datastore-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDatastoreAsync create-datastore-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.CreateDatastoreRequest create-datastore-request]
    (-> this (.createDatastoreAsync create-datastore-request))))

(defn create-dataset-async
  "Creates a data set. A data set stores data retrieved from a data store by applying a \"queryAction\" (a SQL query)
   or a \"containerAction\" (executing a containerized application). This operation creates the skeleton of a data
   set. The data set can be populated manually by calling \"CreateDatasetContent\" or automatically according to a
   \"trigger\" you specify.

  create-dataset-request - `com.amazonaws.services.iotanalytics.model.CreateDatasetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDataset operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.CreateDatasetResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.CreateDatasetRequest create-dataset-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDatasetAsync create-dataset-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.CreateDatasetRequest create-dataset-request]
    (-> this (.createDatasetAsync create-dataset-request))))

(defn update-channel-async
  "Updates the settings of a channel.

  update-channel-request - `com.amazonaws.services.iotanalytics.model.UpdateChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.UpdateChannelResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.UpdateChannelRequest update-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateChannelAsync update-channel-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.UpdateChannelRequest update-channel-request]
    (-> this (.updateChannelAsync update-channel-request))))

(defn describe-datastore-async
  "Retrieves information about a data store.

  describe-datastore-request - `com.amazonaws.services.iotanalytics.model.DescribeDatastoreRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDatastore operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.DescribeDatastoreResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.DescribeDatastoreRequest describe-datastore-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDatastoreAsync describe-datastore-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.DescribeDatastoreRequest describe-datastore-request]
    (-> this (.describeDatastoreAsync describe-datastore-request))))

(defn describe-pipeline-async
  "Retrieves information about a pipeline.

  describe-pipeline-request - `com.amazonaws.services.iotanalytics.model.DescribePipelineRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePipeline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.DescribePipelineResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.DescribePipelineRequest describe-pipeline-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePipelineAsync describe-pipeline-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.DescribePipelineRequest describe-pipeline-request]
    (-> this (.describePipelineAsync describe-pipeline-request))))

(defn create-pipeline-async
  "Creates a pipeline. A pipeline consumes messages from one or more channels and allows you to process the messages
   before storing them in a data store. You must specify both a channel and a datastore
   activity and, optionally, as many as 23 additional activities in the pipelineActivities array.

  create-pipeline-request - `com.amazonaws.services.iotanalytics.model.CreatePipelineRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePipeline operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.CreatePipelineResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.CreatePipelineRequest create-pipeline-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPipelineAsync create-pipeline-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.CreatePipelineRequest create-pipeline-request]
    (-> this (.createPipelineAsync create-pipeline-request))))

(defn batch-put-message-async
  "Sends messages to a channel.

  batch-put-message-request - `com.amazonaws.services.iotanalytics.model.BatchPutMessageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchPutMessage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.BatchPutMessageResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.BatchPutMessageRequest batch-put-message-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchPutMessageAsync batch-put-message-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.BatchPutMessageRequest batch-put-message-request]
    (-> this (.batchPutMessageAsync batch-put-message-request))))

(defn list-channels-async
  "Retrieves a list of channels.

  list-channels-request - `com.amazonaws.services.iotanalytics.model.ListChannelsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListChannels operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.ListChannelsResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.ListChannelsRequest list-channels-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listChannelsAsync list-channels-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.ListChannelsRequest list-channels-request]
    (-> this (.listChannelsAsync list-channels-request))))

(defn list-tags-for-resource-async
  "Lists the tags (metadata) which you have assigned to the resource.

  list-tags-for-resource-request - `com.amazonaws.services.iotanalytics.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn delete-channel-async
  "Deletes the specified channel.

  delete-channel-request - `com.amazonaws.services.iotanalytics.model.DeleteChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.DeleteChannelResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.DeleteChannelRequest delete-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteChannelAsync delete-channel-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.DeleteChannelRequest delete-channel-request]
    (-> this (.deleteChannelAsync delete-channel-request))))

(defn create-channel-async
  "Creates a channel. A channel collects data from an MQTT topic and archives the raw, unprocessed messages before
   publishing the data to a pipeline.

  create-channel-request - `com.amazonaws.services.iotanalytics.model.CreateChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.CreateChannelResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.CreateChannelRequest create-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createChannelAsync create-channel-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.CreateChannelRequest create-channel-request]
    (-> this (.createChannelAsync create-channel-request))))

(defn cancel-pipeline-reprocessing-async
  "Cancels the reprocessing of data through the pipeline.

  cancel-pipeline-reprocessing-request - `com.amazonaws.services.iotanalytics.model.CancelPipelineReprocessingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelPipelineReprocessing operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.CancelPipelineReprocessingResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.CancelPipelineReprocessingRequest cancel-pipeline-reprocessing-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelPipelineReprocessingAsync cancel-pipeline-reprocessing-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.CancelPipelineReprocessingRequest cancel-pipeline-reprocessing-request]
    (-> this (.cancelPipelineReprocessingAsync cancel-pipeline-reprocessing-request))))

(defn put-logging-options-async
  "Sets or updates the AWS IoT Analytics logging options.


   Note that if you update the value of any loggingOptions field, it takes up to one minute for the
   change to take effect. Also, if you change the policy attached to the role you specified in the roleArn field
   (for example, to correct an invalid policy) it takes up to 5 minutes for that change to take effect.

  put-logging-options-request - `com.amazonaws.services.iotanalytics.model.PutLoggingOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutLoggingOptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.PutLoggingOptionsResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.PutLoggingOptionsRequest put-logging-options-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putLoggingOptionsAsync put-logging-options-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.PutLoggingOptionsRequest put-logging-options-request]
    (-> this (.putLoggingOptionsAsync put-logging-options-request))))

(defn tag-resource-async
  "Adds to or modifies the tags of the given resource. Tags are metadata which can be used to manage a resource.

  tag-resource-request - `com.amazonaws.services.iotanalytics.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn run-pipeline-activity-async
  "Simulates the results of running a pipeline activity on a message payload.

  run-pipeline-activity-request - `com.amazonaws.services.iotanalytics.model.RunPipelineActivityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RunPipelineActivity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.RunPipelineActivityResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.RunPipelineActivityRequest run-pipeline-activity-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.runPipelineActivityAsync run-pipeline-activity-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.RunPipelineActivityRequest run-pipeline-activity-request]
    (-> this (.runPipelineActivityAsync run-pipeline-activity-request))))

(defn create-dataset-content-async
  "Creates the content of a data set by applying a \"queryAction\" (a SQL query) or a \"containerAction\" (executing a
   containerized application).

  create-dataset-content-request - `com.amazonaws.services.iotanalytics.model.CreateDatasetContentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDatasetContent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iotanalytics.model.CreateDatasetContentResult>`"
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.CreateDatasetContentRequest create-dataset-content-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDatasetContentAsync create-dataset-content-request async-handler)))
  (^java.util.concurrent.Future [^AWSIoTAnalyticsAsync this ^com.amazonaws.services.iotanalytics.model.CreateDatasetContentRequest create-dataset-content-request]
    (-> this (.createDatasetContentAsync create-dataset-content-request))))

