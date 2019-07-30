(ns com.amazonaws.services.machinelearning.AmazonMachineLearning
  "Interface for accessing Amazon Machine Learning.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonMachineLearning instead.


  Definition of the public APIs exposed by Amazon Machine Learning"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.machinelearning AmazonMachineLearning]))

(defn delete-tags
  "Deletes the specified tags associated with an ML object. After this operation is complete, you can't recover
   deleted tags.


   If you specify a tag that doesn't exist, Amazon ML ignores it.

  delete-tags-request - `com.amazonaws.services.machinelearning.model.DeleteTagsRequest`

  returns: Result of the DeleteTags operation returned by the service. - `com.amazonaws.services.machinelearning.model.DeleteTagsResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.DeleteTagsResult [^AmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.DeleteTagsRequest delete-tags-request]
    (-> this (.deleteTags delete-tags-request))))

(defn add-tags
  "Adds one or more tags to an object, up to a limit of 10. Each tag consists of a key and an optional value. If you
   add a tag using a key that is already associated with the ML object, AddTags updates the tag's
   value.

  add-tags-request - `com.amazonaws.services.machinelearning.model.AddTagsRequest`

  returns: Result of the AddTags operation returned by the service. - `com.amazonaws.services.machinelearning.model.AddTagsResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.AddTagsResult [^AmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.AddTagsRequest add-tags-request]
    (-> this (.addTags add-tags-request))))

(defn update-ml-model
  "Updates the MLModelName and the ScoreThreshold of an MLModel.


   You can use the GetMLModel operation to view the contents of the updated data element.

  update-ml-model-request - `com.amazonaws.services.machinelearning.model.UpdateMLModelRequest`

  returns: Result of the UpdateMLModel operation returned by the service. - `com.amazonaws.services.machinelearning.model.UpdateMLModelResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.UpdateMLModelResult [^AmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.UpdateMLModelRequest update-ml-model-request]
    (-> this (.updateMLModel update-ml-model-request))))

(defn describe-data-sources
  "Returns a list of DataSource that match the search criteria in the request.

  describe-data-sources-request - `com.amazonaws.services.machinelearning.model.DescribeDataSourcesRequest`

  returns: Result of the DescribeDataSources operation returned by the service. - `com.amazonaws.services.machinelearning.model.DescribeDataSourcesResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.DescribeDataSourcesResult [^AmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.DescribeDataSourcesRequest describe-data-sources-request]
    (-> this (.describeDataSources describe-data-sources-request)))
  (^com.amazonaws.services.machinelearning.model.DescribeDataSourcesResult [^AmazonMachineLearning this]
    (-> this (.describeDataSources))))

(defn describe-evaluations
  "Returns a list of DescribeEvaluations that match the search criteria in the request.

  describe-evaluations-request - `com.amazonaws.services.machinelearning.model.DescribeEvaluationsRequest`

  returns: Result of the DescribeEvaluations operation returned by the service. - `com.amazonaws.services.machinelearning.model.DescribeEvaluationsResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.DescribeEvaluationsResult [^AmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.DescribeEvaluationsRequest describe-evaluations-request]
    (-> this (.describeEvaluations describe-evaluations-request)))
  (^com.amazonaws.services.machinelearning.model.DescribeEvaluationsResult [^AmazonMachineLearning this]
    (-> this (.describeEvaluations))))

(defn describe-tags
  "Describes one or more of the tags for your Amazon ML object.

  describe-tags-request - `com.amazonaws.services.machinelearning.model.DescribeTagsRequest`

  returns: Result of the DescribeTags operation returned by the service. - `com.amazonaws.services.machinelearning.model.DescribeTagsResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.DescribeTagsResult [^AmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.DescribeTagsRequest describe-tags-request]
    (-> this (.describeTags describe-tags-request))))

(defn create-data-source-from-rds
  "Creates a DataSource object from an  Amazon Relational Database
   Service (Amazon RDS). A DataSource references data that can be used to perform
   CreateMLModel, CreateEvaluation, or CreateBatchPrediction operations.


   CreateDataSourceFromRDS is an asynchronous operation. In response to
   CreateDataSourceFromRDS, Amazon Machine Learning (Amazon ML) immediately returns and sets the
   DataSource status to PENDING. After the DataSource is created and ready
   for use, Amazon ML sets the Status parameter to COMPLETED. DataSource in
   the COMPLETED or PENDING state can be used only to perform
   >CreateMLModel>, CreateEvaluation, or CreateBatchPrediction
   operations.


   If Amazon ML cannot accept the input source, it sets the Status parameter to FAILED and
   includes an error message in the Message attribute of the GetDataSource operation
   response.

  create-data-source-from-rds-request - `com.amazonaws.services.machinelearning.model.CreateDataSourceFromRDSRequest`

  returns: Result of the CreateDataSourceFromRDS operation returned by the service. - `com.amazonaws.services.machinelearning.model.CreateDataSourceFromRDSResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.CreateDataSourceFromRDSResult [^AmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.CreateDataSourceFromRDSRequest create-data-source-from-rds-request]
    (-> this (.createDataSourceFromRDS create-data-source-from-rds-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AmazonMachineLearning this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn delete-realtime-endpoint
  "Deletes a real time endpoint of an MLModel.

  delete-realtime-endpoint-request - `com.amazonaws.services.machinelearning.model.DeleteRealtimeEndpointRequest`

  returns: Result of the DeleteRealtimeEndpoint operation returned by the service. - `com.amazonaws.services.machinelearning.model.DeleteRealtimeEndpointResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.DeleteRealtimeEndpointResult [^AmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.DeleteRealtimeEndpointRequest delete-realtime-endpoint-request]
    (-> this (.deleteRealtimeEndpoint delete-realtime-endpoint-request))))

(defn predict
  "Generates a prediction for the observation using the specified ML Model.

   Note

   Not all response parameters will be populated. Whether a response parameter is populated depends on the type of
   model requested.

  predict-request - `com.amazonaws.services.machinelearning.model.PredictRequest`

  returns: Result of the Predict operation returned by the service. - `com.amazonaws.services.machinelearning.model.PredictResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.PredictResult [^AmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.PredictRequest predict-request]
    (-> this (.predict predict-request))))

(defn waiters
  "returns: `com.amazonaws.services.machinelearning.waiters.AmazonMachineLearningWaiters`"
  (^com.amazonaws.services.machinelearning.waiters.AmazonMachineLearningWaiters [^AmazonMachineLearning this]
    (-> this (.waiters))))

(defn create-ml-model
  "Creates a new MLModel using the DataSource and the recipe as information sources.


   An MLModel is nearly immutable. Users can update only the MLModelName and the
   ScoreThreshold in an MLModel without creating a new MLModel.


   CreateMLModel is an asynchronous operation. In response to CreateMLModel, Amazon
   Machine Learning (Amazon ML) immediately returns and sets the MLModel status to PENDING
   . After the MLModel has been created and ready is for use, Amazon ML sets the status to
   COMPLETED.


   You can use the GetMLModel operation to check the progress of the MLModel during the
   creation operation.


   CreateMLModel requires a DataSource with computed statistics, which can be created by
   setting ComputeStatistics to true in CreateDataSourceFromRDS,
   CreateDataSourceFromS3, or CreateDataSourceFromRedshift operations.

  create-ml-model-request - `com.amazonaws.services.machinelearning.model.CreateMLModelRequest`

  returns: Result of the CreateMLModel operation returned by the service. - `com.amazonaws.services.machinelearning.model.CreateMLModelResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.CreateMLModelResult [^AmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.CreateMLModelRequest create-ml-model-request]
    (-> this (.createMLModel create-ml-model-request))))

(defn delete-evaluation
  "Assigns the DELETED status to an Evaluation, rendering it unusable.


   After invoking the DeleteEvaluation operation, you can use the GetEvaluation operation
   to verify that the status of the Evaluation changed to DELETED.

   Caution

   The results of the DeleteEvaluation operation are irreversible.

  delete-evaluation-request - `com.amazonaws.services.machinelearning.model.DeleteEvaluationRequest`

  returns: Result of the DeleteEvaluation operation returned by the service. - `com.amazonaws.services.machinelearning.model.DeleteEvaluationResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.DeleteEvaluationResult [^AmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.DeleteEvaluationRequest delete-evaluation-request]
    (-> this (.deleteEvaluation delete-evaluation-request))))

(defn delete-batch-prediction
  "Assigns the DELETED status to a BatchPrediction, rendering it unusable.


   After using the DeleteBatchPrediction operation, you can use the GetBatchPrediction operation
   to verify that the status of the BatchPrediction changed to DELETED.


   Caution: The result of the DeleteBatchPrediction operation is irreversible.

  delete-batch-prediction-request - `com.amazonaws.services.machinelearning.model.DeleteBatchPredictionRequest`

  returns: Result of the DeleteBatchPrediction operation returned by the service. - `com.amazonaws.services.machinelearning.model.DeleteBatchPredictionResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.DeleteBatchPredictionResult [^AmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.DeleteBatchPredictionRequest delete-batch-prediction-request]
    (-> this (.deleteBatchPrediction delete-batch-prediction-request))))

(defn update-batch-prediction
  "Updates the BatchPredictionName of a BatchPrediction.


   You can use the GetBatchPrediction operation to view the contents of the updated data element.

  update-batch-prediction-request - `com.amazonaws.services.machinelearning.model.UpdateBatchPredictionRequest`

  returns: Result of the UpdateBatchPrediction operation returned by the service. - `com.amazonaws.services.machinelearning.model.UpdateBatchPredictionResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.UpdateBatchPredictionResult [^AmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.UpdateBatchPredictionRequest update-batch-prediction-request]
    (-> this (.updateBatchPrediction update-batch-prediction-request))))

(defn create-data-source-from-redshift
  "Creates a DataSource from a database hosted on an Amazon Redshift cluster. A DataSource
   references data that can be used to perform either CreateMLModel, CreateEvaluation, or
   CreateBatchPrediction operations.


   CreateDataSourceFromRedshift is an asynchronous operation. In response to
   CreateDataSourceFromRedshift, Amazon Machine Learning (Amazon ML) immediately returns and sets the
   DataSource status to PENDING. After the DataSource is created and ready
   for use, Amazon ML sets the Status parameter to COMPLETED. DataSource in
   COMPLETED or PENDING states can be used to perform only CreateMLModel,
   CreateEvaluation, or CreateBatchPrediction operations.


   If Amazon ML can't accept the input source, it sets the Status parameter to FAILED and
   includes an error message in the Message attribute of the GetDataSource operation
   response.


   The observations should be contained in the database hosted on an Amazon Redshift cluster and should be specified
   by a SelectSqlQuery query. Amazon ML executes an Unload command in Amazon Redshift to
   transfer the result set of the SelectSqlQuery query to S3StagingLocation.


   After the DataSource has been created, it's ready for use in evaluations and batch predictions. If
   you plan to use the DataSource to train an MLModel, the DataSource also
   requires a recipe. A recipe describes how each input variable will be used in training an MLModel.
   Will the variable be included or excluded from training? Will the variable be manipulated; for example, will it
   be combined with another variable or will it be split apart into word combinations? The recipe provides answers
   to these questions.

   ?oxy_insert_start author=\"laurama\" timestamp=\"20160406T153842-0700\"

   You can't change an existing datasource, but you can copy and modify the settings from an existing Amazon
   Redshift datasource to create a new datasource. To do so, call GetDataSource for an existing
   datasource and copy the values to a CreateDataSource call. Change the settings that you want to
   change and make sure that all required fields have the appropriate values.

   ?oxy_insert_end

  create-data-source-from-redshift-request - `com.amazonaws.services.machinelearning.model.CreateDataSourceFromRedshiftRequest`

  returns: Result of the CreateDataSourceFromRedshift operation returned by the service. - `com.amazonaws.services.machinelearning.model.CreateDataSourceFromRedshiftResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.CreateDataSourceFromRedshiftResult [^AmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.CreateDataSourceFromRedshiftRequest create-data-source-from-redshift-request]
    (-> this (.createDataSourceFromRedshift create-data-source-from-redshift-request))))

(defn get-ml-model
  "Returns an MLModel that includes detailed metadata, data source information, and the current status
   of the MLModel.


   GetMLModel provides results in normal or verbose format.

  get-ml-model-request - `com.amazonaws.services.machinelearning.model.GetMLModelRequest`

  returns: Result of the GetMLModel operation returned by the service. - `com.amazonaws.services.machinelearning.model.GetMLModelResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.GetMLModelResult [^AmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.GetMLModelRequest get-ml-model-request]
    (-> this (.getMLModel get-ml-model-request))))

(defn create-realtime-endpoint
  "Creates a real-time endpoint for the MLModel. The endpoint contains the URI of the
   MLModel; that is, the location to send real-time prediction requests for the specified
   MLModel.

  create-realtime-endpoint-request - `com.amazonaws.services.machinelearning.model.CreateRealtimeEndpointRequest`

  returns: Result of the CreateRealtimeEndpoint operation returned by the service. - `com.amazonaws.services.machinelearning.model.CreateRealtimeEndpointResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.CreateRealtimeEndpointResult [^AmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.CreateRealtimeEndpointRequest create-realtime-endpoint-request]
    (-> this (.createRealtimeEndpoint create-realtime-endpoint-request))))

(defn get-evaluation
  "Returns an Evaluation that includes metadata as well as the current status of the
   Evaluation.

  get-evaluation-request - `com.amazonaws.services.machinelearning.model.GetEvaluationRequest`

  returns: Result of the GetEvaluation operation returned by the service. - `com.amazonaws.services.machinelearning.model.GetEvaluationResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.GetEvaluationResult [^AmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.GetEvaluationRequest get-evaluation-request]
    (-> this (.getEvaluation get-evaluation-request))))

(defn describe-ml-models
  "Returns a list of MLModel that match the search criteria in the request.

  describe-ml-models-request - `com.amazonaws.services.machinelearning.model.DescribeMLModelsRequest`

  returns: Result of the DescribeMLModels operation returned by the service. - `com.amazonaws.services.machinelearning.model.DescribeMLModelsResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.DescribeMLModelsResult [^AmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.DescribeMLModelsRequest describe-ml-models-request]
    (-> this (.describeMLModels describe-ml-models-request)))
  (^com.amazonaws.services.machinelearning.model.DescribeMLModelsResult [^AmazonMachineLearning this]
    (-> this (.describeMLModels))))

(defn update-evaluation
  "Updates the EvaluationName of an Evaluation.


   You can use the GetEvaluation operation to view the contents of the updated data element.

  update-evaluation-request - `com.amazonaws.services.machinelearning.model.UpdateEvaluationRequest`

  returns: Result of the UpdateEvaluation operation returned by the service. - `com.amazonaws.services.machinelearning.model.UpdateEvaluationResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.UpdateEvaluationResult [^AmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.UpdateEvaluationRequest update-evaluation-request]
    (-> this (.updateEvaluation update-evaluation-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonMachineLearning this]
    (-> this (.shutdown))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"machinelearning.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://machinelearning.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AmazonMachineLearning this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn delete-ml-model
  "Assigns the DELETED status to an MLModel, rendering it unusable.


   After using the DeleteMLModel operation, you can use the GetMLModel operation to verify
   that the status of the MLModel changed to DELETED.


   Caution: The result of the DeleteMLModel operation is irreversible.

  delete-ml-model-request - `com.amazonaws.services.machinelearning.model.DeleteMLModelRequest`

  returns: Result of the DeleteMLModel operation returned by the service. - `com.amazonaws.services.machinelearning.model.DeleteMLModelResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.DeleteMLModelResult [^AmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.DeleteMLModelRequest delete-ml-model-request]
    (-> this (.deleteMLModel delete-ml-model-request))))

(defn delete-data-source
  "Assigns the DELETED status to a DataSource, rendering it unusable.


   After using the DeleteDataSource operation, you can use the GetDataSource operation to verify
   that the status of the DataSource changed to DELETED.


   Caution: The results of the DeleteDataSource operation are irreversible.

  delete-data-source-request - `com.amazonaws.services.machinelearning.model.DeleteDataSourceRequest`

  returns: Result of the DeleteDataSource operation returned by the service. - `com.amazonaws.services.machinelearning.model.DeleteDataSourceResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.DeleteDataSourceResult [^AmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.DeleteDataSourceRequest delete-data-source-request]
    (-> this (.deleteDataSource delete-data-source-request))))

(defn create-batch-prediction
  "Generates predictions for a group of observations. The observations to process exist in one or more data files
   referenced by a DataSource. This operation creates a new BatchPrediction, and uses an
   MLModel and the data files referenced by the DataSource as information sources.


   CreateBatchPrediction is an asynchronous operation. In response to
   CreateBatchPrediction, Amazon Machine Learning (Amazon ML) immediately returns and sets the
   BatchPrediction status to PENDING. After the BatchPrediction completes,
   Amazon ML sets the status to COMPLETED.


   You can poll for status updates by using the GetBatchPrediction operation and checking the
   Status parameter of the result. After the COMPLETED status appears, the results are
   available in the location specified by the OutputUri parameter.

  create-batch-prediction-request - `com.amazonaws.services.machinelearning.model.CreateBatchPredictionRequest`

  returns: Result of the CreateBatchPrediction operation returned by the service. - `com.amazonaws.services.machinelearning.model.CreateBatchPredictionResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.CreateBatchPredictionResult [^AmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.CreateBatchPredictionRequest create-batch-prediction-request]
    (-> this (.createBatchPrediction create-batch-prediction-request))))

(defn update-data-source
  "Updates the DataSourceName of a DataSource.


   You can use the GetDataSource operation to view the contents of the updated data element.

  update-data-source-request - `com.amazonaws.services.machinelearning.model.UpdateDataSourceRequest`

  returns: Result of the UpdateDataSource operation returned by the service. - `com.amazonaws.services.machinelearning.model.UpdateDataSourceResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.UpdateDataSourceResult [^AmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.UpdateDataSourceRequest update-data-source-request]
    (-> this (.updateDataSource update-data-source-request))))

(defn describe-batch-predictions
  "Returns a list of BatchPrediction operations that match the search criteria in the request.

  describe-batch-predictions-request - `com.amazonaws.services.machinelearning.model.DescribeBatchPredictionsRequest`

  returns: Result of the DescribeBatchPredictions operation returned by the service. - `com.amazonaws.services.machinelearning.model.DescribeBatchPredictionsResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.DescribeBatchPredictionsResult [^AmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.DescribeBatchPredictionsRequest describe-batch-predictions-request]
    (-> this (.describeBatchPredictions describe-batch-predictions-request)))
  (^com.amazonaws.services.machinelearning.model.DescribeBatchPredictionsResult [^AmazonMachineLearning this]
    (-> this (.describeBatchPredictions))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonMachineLearning this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn create-evaluation
  "Creates a new Evaluation of an MLModel. An MLModel is evaluated on a set
   of observations associated to a DataSource. Like a DataSource for an
   MLModel, the DataSource for an Evaluation contains values for the
   Target Variable. The Evaluation compares the predicted result for each observation to
   the actual outcome and provides a summary so that you know how effective the MLModel functions on
   the test data. Evaluation generates a relevant performance metric, such as BinaryAUC, RegressionRMSE or
   MulticlassAvgFScore based on the corresponding MLModelType: BINARY,
   REGRESSION or MULTICLASS.


   CreateEvaluation is an asynchronous operation. In response to CreateEvaluation, Amazon
   Machine Learning (Amazon ML) immediately returns and sets the evaluation status to PENDING. After
   the Evaluation is created and ready for use, Amazon ML sets the status to COMPLETED.


   You can use the GetEvaluation operation to check progress of the evaluation during the creation
   operation.

  create-evaluation-request - `com.amazonaws.services.machinelearning.model.CreateEvaluationRequest`

  returns: Result of the CreateEvaluation operation returned by the service. - `com.amazonaws.services.machinelearning.model.CreateEvaluationResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.CreateEvaluationResult [^AmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.CreateEvaluationRequest create-evaluation-request]
    (-> this (.createEvaluation create-evaluation-request))))

(defn get-data-source
  "Returns a DataSource that includes metadata and data file information, as well as the current status
   of the DataSource.


   GetDataSource provides results in normal or verbose format. The verbose format adds the schema
   description and the list of files pointed to by the DataSource to the normal format.

  get-data-source-request - `com.amazonaws.services.machinelearning.model.GetDataSourceRequest`

  returns: Result of the GetDataSource operation returned by the service. - `com.amazonaws.services.machinelearning.model.GetDataSourceResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.GetDataSourceResult [^AmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.GetDataSourceRequest get-data-source-request]
    (-> this (.getDataSource get-data-source-request))))

(defn create-data-source-from-s-3
  "Creates a DataSource object. A DataSource references data that can be used to perform
   CreateMLModel, CreateEvaluation, or CreateBatchPrediction operations.


   CreateDataSourceFromS3 is an asynchronous operation. In response to
   CreateDataSourceFromS3, Amazon Machine Learning (Amazon ML) immediately returns and sets the
   DataSource status to PENDING. After the DataSource has been created and is
   ready for use, Amazon ML sets the Status parameter to COMPLETED.
   DataSource in the COMPLETED or PENDING state can be used to perform only
   CreateMLModel, CreateEvaluation or CreateBatchPrediction operations.


   If Amazon ML can't accept the input source, it sets the Status parameter to FAILED and
   includes an error message in the Message attribute of the GetDataSource operation
   response.


   The observation data used in a DataSource should be ready to use; that is, it should have a
   consistent structure, and missing data values should be kept to a minimum. The observation data must reside in
   one or more .csv files in an Amazon Simple Storage Service (Amazon S3) location, along with a schema that
   describes the data items by name and type. The same schema must be used for all of the data files referenced by
   the DataSource.


   After the DataSource has been created, it's ready to use in evaluations and batch predictions. If
   you plan to use the DataSource to train an MLModel, the DataSource also
   needs a recipe. A recipe describes how each input variable will be used in training an MLModel. Will
   the variable be included or excluded from training? Will the variable be manipulated; for example, will it be
   combined with another variable or will it be split apart into word combinations? The recipe provides answers to
   these questions.

  create-data-source-from-s-3-request - `com.amazonaws.services.machinelearning.model.CreateDataSourceFromS3Request`

  returns: Result of the CreateDataSourceFromS3 operation returned by the service. - `com.amazonaws.services.machinelearning.model.CreateDataSourceFromS3Result`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.CreateDataSourceFromS3Result [^AmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.CreateDataSourceFromS3Request create-data-source-from-s-3-request]
    (-> this (.createDataSourceFromS3 create-data-source-from-s-3-request))))

(defn get-batch-prediction
  "Returns a BatchPrediction that includes detailed metadata, status, and data file information for a
   Batch Prediction request.

  get-batch-prediction-request - `com.amazonaws.services.machinelearning.model.GetBatchPredictionRequest`

  returns: Result of the GetBatchPrediction operation returned by the service. - `com.amazonaws.services.machinelearning.model.GetBatchPredictionResult`

  throws: com.amazonaws.services.machinelearning.model.InvalidInputException - An error on the client occurred. Typically, the cause is an invalid input value."
  (^com.amazonaws.services.machinelearning.model.GetBatchPredictionResult [^AmazonMachineLearning this ^com.amazonaws.services.machinelearning.model.GetBatchPredictionRequest get-batch-prediction-request]
    (-> this (.getBatchPrediction get-batch-prediction-request))))

